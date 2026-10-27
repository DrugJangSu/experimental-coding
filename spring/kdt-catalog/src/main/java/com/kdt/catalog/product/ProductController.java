package com.kdt.catalog.product;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/v1/products")
    public List<Product> list() {
        return productService.findAll();
    }

    @GetMapping("/api/v1/products/count")
    public long count() {
        return productService.count();
    }

    @GetMapping("/api/v1/products/{id}")
    public Product one(@PathVariable("id") Long id) {
        return productService.findById(id);
    }
}
