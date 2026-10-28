package com.kdt.catalog.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/api/v1/products/{productId}/reviews")
    public List<ReviewResponse> list(@PathVariable("productId") Long productId) {
        return reviewService.list(productId);
    }
}
