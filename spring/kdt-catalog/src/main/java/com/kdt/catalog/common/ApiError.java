package com.kdt.catalog.common;

// record: 데이터만 담는 간단한 클래스 (생성자, getter, toString 등이 자동 생성됨)
// 에러가 나면 {"code": "...", "message": "..."} 형태의 JSON으로 응답된다
public record ApiError(String code, String message) {
}
