package com.kdt.catalog;

import org.springframework.stereotype.Service;

@Service // "이 클래스는 실제 일(비즈니스 로직)을 하는 곳이다" + 스프링이 객체를 만들어 관리한다
public class HelloService {
    public String message() {
        return "kimbap"; // Controller가 가져다 쓸 메시지
    }

}
