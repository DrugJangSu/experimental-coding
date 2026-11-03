package com.kdt.practice2.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;

@RestControllerAdvice
public class ApiExceptionAdvice {
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ApiError> handleMissing(MissingServletRequestParameterException e) {
        ApiError body = new ApiError("VALIDATION_ERROR", "입력값을 확인해 주세요.",
                List.of(new FieldErrorDetail(e.getParameterName(), "필수 값입니다.")));
        return ResponseEntity.badRequest().body(body);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ApiError> handleTypeMismatch(MethodArgumentTypeMismatchException e) {
        ApiError body = new ApiError("VALIDATION_ERROR", "입력값을 확인해 주세요.",
                List.of(new FieldErrorDetail(e.getName(), "형식이 올바르지 않습니다.")));
        return ResponseEntity.badRequest().body(body);
    }
}
