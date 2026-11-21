package com.example.webpractice1.product;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Product> findProducts(String sort) {
        return productRepository.findAll(Sort.by(sort));
    }


}
