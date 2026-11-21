package com.example.webpractice1.category;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
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

    public List<Category> findCategories(String sort) {
        return categoryRepository.findAll(Sort.by(sort));
    }

}
