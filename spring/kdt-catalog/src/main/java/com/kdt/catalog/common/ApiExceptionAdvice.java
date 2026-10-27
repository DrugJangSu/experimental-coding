package com.kdt.catalog.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // "모든 컨트롤러에서 발생한 예외를 여기서 한꺼번에 처리한다" (예외 전담 창구)
public class ApiExceptionAdvice {

    @ExceptionHandler(NotFoundException.class) // "NotFoundException이 던져지면 이 메서드가 처리한다"
    @ResponseStatus(HttpStatus.NOT_FOUND)      // 응답 상태 코드를 404로 설정한다
    public ApiError handleNotFound(NotFoundException e) {
        return new ApiError("NOT_FOUND", e.getMessage()); // 에러 내용을 JSON으로 응답한다
    }
}
