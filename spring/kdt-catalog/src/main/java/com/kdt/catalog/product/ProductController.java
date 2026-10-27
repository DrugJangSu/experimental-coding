package com.kdt.catalog.product;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController // "웹 요청을 받아 JSON으로 응답하는 클래스" (Product 객체를 JSON으로 자동 변환해줌)
public class ProductController {

    private final ProductService productService; // 실제 일은 Service에게 맡긴다

    // 생성자 주입: 스프링이 ProductService 객체를 알아서 넣어준다
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/v1/products") // GET /api/v1/products -> 상품 전체 목록
    public List<Product> list() {
        return productService.findAll();
    }

    @GetMapping("/api/v1/products/count") // GET /api/v1/products/count -> 상품 개수
    public long count() {
        return productService.count();
    }

    @GetMapping("/api/v1/products/{id}") // {id} 자리에 들어온 값이 변수가 된다 (예: /api/v1/products/3)
    public Product one(@PathVariable("id") Long id) { // @PathVariable: 주소의 {id} 값을 파라미터 id에 넣어준다
        return productService.findById(id);
    }
    @PostMapping("/api/v1/products")
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody ProductCreateRequest request) {
        return productService.create(request);
    }

    @DeleteMapping("/api/v1/products/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        productService.delete(id);
    }

    @PutMapping("/api/v1/products/{id}")
    public Product update(@PathVariable("id") Long id, @RequestBody ProductUpdateRequest request) {
        return productService.update(id, request);
    }

}
