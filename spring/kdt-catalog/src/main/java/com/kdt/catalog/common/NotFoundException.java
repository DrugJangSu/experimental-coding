package com.kdt.catalog.common;

// 직접 만든 예외: "찾는 데이터가 없다"는 뜻. RuntimeException을 상속하면 try-catch를 강제하지 않는다
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message); // 에러 메시지를 부모(RuntimeException)에 전달한다
    }
}
