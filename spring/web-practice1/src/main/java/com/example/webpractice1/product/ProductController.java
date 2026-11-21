package com.example.webpractice1.product;

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

    @GetMapping("/products")
    public ResponseEntity<Map<String, Object>> getProducts(
            @RequestParam(defaultValue = "id") String sort) {
        if (!sort.equals("id") && !sort.equals("name") && !sort.equals("price")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", "invalid sort"));
        }
        List<Product> products = productService.findProducts(sort);

        List<Map<String, Object>> items = new ArrayList<>();
        for (Product product : products) {
            items.add(Map.of("name", product.getName(), "price", product.getPrice()));
        }
        return ResponseEntity.ok(Map.of("products", items));
    }




}
