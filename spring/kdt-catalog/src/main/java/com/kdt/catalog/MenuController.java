package com.kdt.catalog;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 난 이게 아직도 뭔지 헷갈려
public class MenuController {

    @GetMapping("/menu") // 원래 이걸 class에다가 붙이고 에러 미친듯이 뜸
    public String lunch() { // 메서드 이름은 Lunch로 하는게... 낫겠지?
        return "lunch";
    }
}
