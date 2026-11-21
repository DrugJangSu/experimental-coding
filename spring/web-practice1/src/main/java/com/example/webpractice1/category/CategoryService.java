package com.example.webpractice1.category;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Optional<Category> findCategory(Integer categoryId) {
        return categoryRepository.findById(categoryId);
    }

}
