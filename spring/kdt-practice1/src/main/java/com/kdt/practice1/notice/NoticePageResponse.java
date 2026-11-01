package com.kdt.practice1.notice;

import java.util.List;

public record NoticePageResponse(
        List<Notice> content,
        int page,
        int size,
        long totalElements
) {
}
