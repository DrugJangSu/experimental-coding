package com.kdt.practice2.statistics;

import com.kdt.practice2.common.ApiExceptionAdvice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;

// static import: 클래스 이름 없이 메서드만 바로 쓰려고 가져오는 것
// 예) BDDMockito.given(...) 대신 given(...)으로 짧게 씀
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @WebMvcTest: 스프링 전체가 아니라 "웹 요청 처리 부분 + 이 컨트롤러 하나"만 켬
//   → DB, Repository, 진짜 서비스는 안 켜짐. 그래서 MySQL이 꺼져 있어도 돌아감
@WebMvcTest(StatisticsController.class)
// @Import: 400을 팀 형식 JSON으로 바꿔 주는 Advice도 같이 켜 달라는 뜻
//   → 이게 없으면 400 테스트에서 우리 형식(code, fieldErrors)이 안 나옴
@Import(ApiExceptionAdvice.class)
class StatisticsControllerTest {   // JUnit 5는 public 없어도 실행됨

    // MockMvc: 서버(8080)를 진짜로 켜지 않고 "요청을 보낸 척" 해 주는 도구
    // @Autowired: 스프링이 알아서 만들어서 넣어 줌
    @Autowired
    MockMvc mockMvc;

    // @MockitoBean: 진짜 StatisticsService 대신 "가짜 서비스"를 넣음
    //   → 가짜는 아무 일도 안 하다가, 아래 given(...)으로 정해 둔 값만 돌려줌
    //   → 컨트롤러는 생성자로 서비스를 받아야 하니까, 이 가짜가 그 자리에 들어감
    @MockitoBean
    StatisticsService statisticsService;

    // ───────────────────────────────────────────
    // 1. 주문 통계 정상 요청 → 200
    // ───────────────────────────────────────────
    @Test   // 이 메서드는 테스트예요. JUnit이 찾아서 실행함
    void 주문통계_정상이면_200() throws Exception {   // perform()이 예외를 던질 수 있어서 throws

        // [준비] 가짜 서비스에게 미리 정해 두기
        //   "orderStatistics(2026-11-04)로 부르면 → 이 값을 돌려줘"
        //   DB를 안 쓰니까, 어제 SQL로 맞춘 정답 숫자를 그대로 넣음
        given(statisticsService.orderStatistics(LocalDate.of(2026, 11, 4)))
                .willReturn(new OrderStatistics(4, 3, 1, 7, 45000));

        // [실행] GET /api/v1/statistics/orders?date=2026-11-04 요청을 보낸 척
        mockMvc.perform(get("/api/v1/statistics/orders").param("date", "2026-11-04"))
                // [검사] 상태가 200인지
                .andExpect(status().isOk())
                // [검사] 응답 JSON의 orderCount가 4인지  ($는 JSON 맨 바깥)
                .andExpect(jsonPath("$.orderCount").value(4))
                // [검사] totalAmount가 45000인지
                .andExpect(jsonPath("$.totalAmount").value(45000));
    }

    // ───────────────────────────────────────────
    // 2. 메뉴 통계 정상 요청 → 200 (응답이 배열)
    // ───────────────────────────────────────────
    @Test
    void 메뉴통계_정상이면_200() throws Exception {

        // [준비] 메뉴 통계는 목록이라 List로 돌려주게 정해 둠
        //   1L, 3L처럼 L을 붙인 건 MenuStatistics 칸이 Long이라서
        given(statisticsService.menuStatistics(LocalDate.of(2026, 11, 4)))
                .willReturn(List.of(new MenuStatistics(1L, "Columbia Nariñó", 3L, 15000L)));

        // [실행]
        mockMvc.perform(get("/api/v1/statistics/menus").param("date", "2026-11-04"))
                .andExpect(status().isOk())
                // $[0]: 배열의 첫 번째 칸. 그 안의 menuName 확인
                .andExpect(jsonPath("$[0].menuName").value("Columbia Nariñó"))
                .andExpect(jsonPath("$[0].totalQuantity").value(3));
    }

    // ───────────────────────────────────────────
    // 3. date를 안 보냄 → 400
    // ───────────────────────────────────────────
    @Test
    void date가_없으면_400() throws Exception {

        // [준비] 없음. 어차피 서비스까지 안 가야 정상이니까 given도 안 씀

        // [실행] ?date= 없이 요청
        mockMvc.perform(get("/api/v1/statistics/orders"))
                // [검사] 400인지
                .andExpect(status().isBadRequest())
                // [검사] 팀 형식으로 나왔는지 (ApiExceptionAdvice가 만들어 준 것)
                .andExpect(jsonPath("$.code").value("VALIDATION_ERROR"))
                // fieldErrors 배열 첫 칸의 field가 "date"인지
                .andExpect(jsonPath("$.fieldErrors[0].field").value("date"));

        // [검사] 가짜 서비스가 한 번도 안 불렸는지
        //   → 컨트롤러 메서드에 들어가기 "전에" 막혔다는 증거
        verifyNoInteractions(statisticsService);
    }

    // ───────────────────────────────────────────
    // 4. date=abc (날짜 아님) → 400
    // ───────────────────────────────────────────
    @Test
    void date_형식이_틀리면_400() throws Exception {

        // [실행] 날짜로 못 바꾸는 값을 보냄
        mockMvc.perform(get("/api/v1/statistics/orders").param("date", "abc"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.code").value("VALIDATION_ERROR"))
                // 이번엔 메시지가 "형식이 올바르지 않습니다."인지 확인
                .andExpect(jsonPath("$.fieldErrors[0].message").value("형식이 올바르지 않습니다."));

        // [검사] 여기서도 서비스는 안 불렸어야 함
        verifyNoInteractions(statisticsService);
    }
}