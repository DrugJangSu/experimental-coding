package com.kdt.practice2.statistics;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

// ─────────────────────────────────────────────────────────────
// A17을 "Java for문으로 세기" 방식으로 만든 컨트롤러
// 기존 StatisticsController(DB에서 세기)와 결과를 비교하려고 주소를 따로 둠
//   기존: /api/v1/statistics/orders
//   이번: /api/v1/statistics-loop/orders
// ─────────────────────────────────────────────────────────────

// @RestController: "이 클래스는 요청을 받는 창구예요" → 스프링이 등록
//   → 빠지면 아래 @GetMapping이 무시돼서 404
@RestController
// @RequestMapping: 이 클래스 안 모든 주소의 공통 앞부분
//   → 주소는 / 로 칸을 나눔 (점 . 아님)
@RequestMapping("/api/v1/statistics-loop")
public class StatisticsLoopController {

    // 실제로 세는 일은 Service가 함. Controller는 받고 넘기고 돌려주기만
    private final StatisticsLoopService statisticsLoopService;

    // 생성자 주입: 스프링이 StatisticsLoopService 빈을 찾아서 넣어 줌 (4장 02)
    public StatisticsLoopController(StatisticsLoopService statisticsLoopService) {
        this.statisticsLoopService = statisticsLoopService;
    }

    // GET /api/v1/statistics-loop/orders?date=2026-11-04
    //   클래스의 "/api/v1/statistics-loop" + 메서드의 "/orders" = 최종 주소
    @GetMapping("/orders")
    public OrderStatistics orders(
            // @RequestParam("date"): 주소의 ?date=... 값을 받음
            // @DateTimeFormat(ISO.DATE): "2026-11-04" 글자를 LocalDate로 바꿔 줌
            //   → date가 없으면 MissingServletRequestParameterException → 400
            //   → date=abc면 MethodArgumentTypeMismatchException → 400
            //   (둘 다 ApiExceptionAdvice가 팀 형식으로 바꿔 줌)
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {

        // 받은 날짜를 Service에 넘기고, 돌려받은 OrderStatistics를 그대로 반환
        //   → 스프링이 이 record를 JSON으로 바꿔서 응답 (4장 08)
        return statisticsLoopService.orderStatistics(date);
    }
}