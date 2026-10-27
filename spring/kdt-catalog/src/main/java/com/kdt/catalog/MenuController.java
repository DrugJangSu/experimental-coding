package com.kdt.catalog;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 난 이게 아직도 뭔지 헷갈려
                // -> "이 클래스는 웹 요청을 받아 글자/JSON으로 바로 응답한다" (@Controller + @ResponseBody)
public class MenuController {

    @GetMapping("/menu") // 원래 이걸 class에다가 붙이고 에러 미친듯이 뜸
                         // -> "GET /menu 요청이 오면 이 메서드를 실행한다" (메서드 위에 붙이는 게 맞음)
    public String lunch() { // 메서드 이름은 Lunch로 하는게... 낫겠지?
        return "lunch";
    }
}
