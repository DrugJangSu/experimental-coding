package com.kdt.practice2.common;

import java.util.List;

public record ApiError(String code, String message, List<FieldErrorDetail> fieldErrors) {
}
