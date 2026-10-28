package com.kdt.catalog.category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/v1/categories")
    public List<Category> list() {
        return categoryService.findAll();
    }

    @GetMapping("/api/v1/categories/{id}")
    public Category one(@PathVariable("id") Long id) {
        return categoryService.findById(id);
    }
}
