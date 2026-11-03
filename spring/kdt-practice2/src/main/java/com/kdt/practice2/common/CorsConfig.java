package com.kdt.practice2.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// ─────────────────────────────────────────────────────────────
// 왜 이 파일이 필요한가?
//
// 브라우저는 "화면을 연 주소"와 "요청 보낼 주소"의 출처가 다르면
// 응답을 JavaScript가 읽지 못하게 막아요. (출처 = http + 주소 + 포트)
//
//   화면: http://127.0.0.1:8000   ← web 폴더 (명세 기준)
//   API : http://127.0.0.1:8080   ← 우리 Spring 앱
//         → 포트가 달라서 "다른 출처"
//
// 그래서 API 서버(우리 앱) 쪽에서
// "8000에서 온 요청은 읽어도 돼요"라고 허락해 줘야 해요. 그게 CORS 설정이에요.
// ─────────────────────────────────────────────────────────────

// @Configuration: "이 클래스는 스프링 설정이에요"
//   → 이게 빠지면 스프링이 이 클래스를 무시해서 CORS가 아예 안 켜져요
//     (@RestController, @RestControllerAdvice 빠졌을 때랑 같은 문제)
@Configuration
// WebMvcConfigurer: 스프링이 정해 둔 "웹 설정용 인터페이스"
//   → 여기 있는 메서드 중 필요한 것만 골라서 채우면, 스프링이 앱 시작할 때 읽어 감
//   → @Bean으로 객체를 만들어 넘기는 대신, 이 인터페이스를 구현하는 방식
public class CorsConfig implements WebMvcConfigurer {

    // addCorsMappings: WebMvcConfigurer의 메서드 중 "CORS 규칙 적기" 담당
    // @Override: 인터페이스에 원래 있는 메서드를 내가 채운다는 표시
    @Override
    public void addCorsMappings(CorsRegistry registry) {   // registry = 규칙을 적어 넣는 장부

        // 어느 주소에 이 규칙을 적용할지
        //   "/api/**" = /api/로 시작하는 모든 주소 (**는 "그 아래 전부")
        //   → /api/v1/statistics/orders, /api/v1/delivery-batches 등 전부 해당
        registry.addMapping("/api/**")

                // 어느 출처에서 온 요청을 허락할지
                //   → 명세에 적힌 web 화면 주소 하나만 허락
                //   → localhost:8000은 글자가 달라서 "다른 출처" → 403 거절
                //   → 경로(/index.html 등)는 붙이지 않아요. 출처는 http+주소+포트까지만
                .allowedOrigins("http://127.0.0.1:8000")

                // 어떤 HTTP 메서드를 허락할지
                //   → 우리 팀 API에서 쓰는 GET·POST·PUT·DELETE
                //   → OPTIONS는 브라우저가 진짜 요청 전에 "보내도 돼요?" 물어볼 때 쓰는 것
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")

                // 어떤 요청 헤더를 허락할지
                //   → POST·PUT으로 JSON 보낼 때 붙는 "Content-Type: application/json"
                .allowedHeaders("Content-Type");
    }
}