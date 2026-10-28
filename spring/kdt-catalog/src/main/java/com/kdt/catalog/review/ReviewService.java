package com.kdt.catalog.review;

import com.kdt.catalog.common.NotFoundException;
import com.kdt.catalog.product.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final ProductRepository productRepository;

    public ReviewService(ReviewRepository reviewRepository, ProductRepository productRepository) {
        this.reviewRepository = reviewRepository;
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public List<ReviewResponse> list(Long productId) {
        if (!productRepository.existsById(productId)) {
            throw new NotFoundException("product missing");
        }
        List<Review> reviews = reviewRepository.findByProductIdOrderByIdAsc(productId);
        List<ReviewResponse> result = new ArrayList<>();
        for (Review review : reviews) {
            result.add(ReviewResponse.from(review));
        }
        return result;
    }
}
