package com.example.webpractice1.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Map<String, Object>> getProduct(@PathVariable Integer productId) {
        Optional<Product> found = productService.findProduct(productId);

        if (found.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "product not found"));
        }
        Product product = found.get();
        return ResponseEntity.ok(Map.of(
                "name", product.getName(),
                "price", product.getPrice()
        ));
    }
}
