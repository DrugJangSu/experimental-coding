package com.kdt.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // "스프링 부트 앱의 시작점이다" (설정 + 이 패키지 아래 클래스들을 자동으로 찾아 등록)
public class KdtCatalogApplication {

    public static void main(String[] args) { // 자바 프로그램이 시작되는 곳
        SpringApplication.run(KdtCatalogApplication.class, args); // 스프링 부트 서버를 실행한다
    }

}
