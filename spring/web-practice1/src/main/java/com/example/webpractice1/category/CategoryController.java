package com.example.webpractice1.category;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories/{categoryId}")
    public ResponseEntity<Map<String, Object>> getCategory(@PathVariable Integer categoryId) {
        Optional<Category> found = categoryService.findCategory(categoryId);

        if (found.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "category not found"));
        }
        Category category = found.get();
        return ResponseEntity.ok(Map.of("name", category.getName()));
    }

    @GetMapping("/categories")
    public ResponseEntity<Map<String, Object>> getCategories(
            @RequestParam(defaultValue = "id") String sort) {
        if (!sort.equals("id") && !sort.equals("name")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", "invalid sort"));
        }
        List<Category> categories = categoryService.findCategories(sort);

        List<String> names = new ArrayList<>();
        for (Category category : categories) {
            names.add(category.getName());
        }
        return ResponseEntity.ok(Map.of("categories", names));
    }
}
