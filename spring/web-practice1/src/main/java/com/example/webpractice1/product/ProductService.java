package com.example.webpractice1.product;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository =productRepository;
    }

    public Optional<Product> findProduct(Integer productId) {
        return productRepository.findById(productId);
    }
}
