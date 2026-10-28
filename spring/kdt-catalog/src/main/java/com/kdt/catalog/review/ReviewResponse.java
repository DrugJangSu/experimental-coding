package com.kdt.catalog.review;

import java.time.LocalDateTime;

public record ReviewResponse(
    Long id,
    Long productId,
    String productName,
    String author,
    String content,
    int rating,
    LocalDateTime createdAt,
    LocalDateTime updatedAt) {

    public static ReviewResponse from (Review review) {
        return new ReviewResponse(
                review.getId(),
                review.getProduct().getId(),
                review.getProduct().getName(),
                review.getAuthor(),
                review.getContent(),
                review.getRating(),
                review.getCreatedAt(),
                review.getUpdatedAt());
    }
}

