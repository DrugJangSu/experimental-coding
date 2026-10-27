package com.kdt.catalog;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // "이 클래스는 웹 요청을 받아 글자/JSON으로 바로 응답한다" (HTML 화면이 아니라 데이터를 돌려줌)
public class HelloController {

    private final HelloService helloService; // 실제 일은 Service에게 맡긴다

    // 생성자 주입: 스프링이 HelloService 객체를 알아서 만들어 넣어준다 (new 안 해도 됨)
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello") // "GET /hello 주소로 요청이 오면 아래 메서드를 실행한다"
    public String hello() {
//        return "kimbap";
//        return "hello world";
        return helloService.message(); // Service가 준 글자를 그대로 응답한다
    }
}
