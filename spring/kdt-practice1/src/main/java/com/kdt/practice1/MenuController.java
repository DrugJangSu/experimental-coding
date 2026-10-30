package com.kdt.practice1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
    @GetMapping("/menu")
    public String menu() {
        return "lunch";
    }
}
