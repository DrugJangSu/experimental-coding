package com.kdt.catalog.category;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/api/v1/categories")
    @ResponseStatus(HttpStatus.CREATED)
    public Category create(@RequestBody CategoryCreateRequest request) {
        return categoryService.create(request);
    }

    @DeleteMapping("/api/v1/categories/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        categoryService.delete(id);
    }

}
