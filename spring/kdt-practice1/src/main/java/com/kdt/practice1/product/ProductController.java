package com.kdt.practice1.product;                              // 이 파일이 있는 폴더 위치

import org.springframework.web.bind.annotation.GetMapping;      // @GetMapping 이름표를 가져옴
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;  // @RestController 이름표를 가져옴

import java.util.List;                                          // 목록(List) 타입을 가져옴

// ───────── 이 클래스는 무엇인가 ─────────
// 요청 흐름: [Controller] → Service → Repository → DB
// 브라우저(바깥)에서 들어온 요청을 제일 먼저 받는 담당.
// 직접 DB를 만지지 않고, Service에게 일을 시킨 뒤 결과를 돌려줌.

@RestController                                  // "이 클래스는 주소로 요청을 받고, return한 값을 JSON으로 보낸다"
//   → @Controller로 쓰면 return 값을 화면(HTML) 이름으로 착각해서 오류
//   → 아예 없으면 Spring이 이 클래스를 무시해서 주소가 등록 안 됨 (404)
public class ProductController {

    private final ProductService productService; // ① Service를 저장해 둘 칸 (필드)

    public ProductController(ProductService productService) {
        // ② 생성자: "나를 만들려면 ProductService를 넣어 줘"
        //    앱이 켜질 때 Spring이 보관해 둔 ProductService를 넣어 줌
        this.productService = productService;    // ③ 받은 Service를 ① 칸에 저장
    }

    @GetMapping("/api/v1/products")              // "GET 방식으로 /api/v1/products 주소가 오면 아래 메서드를 실행해라"
    //   브라우저 주소 = http://localhost:8080 + 이 괄호 안 주소
    public List<Product> list() {                // 상품 목록을 돌려주는 메서드 (메서드 이름 list는 내가 지은 이름)
        return productService.findAll();         // ①에 저장해 둔 Service에게 "전부 줘"라고 시킴
        //   → 돌아온 List<Product>를 @RestController가 JSON으로 바꿔서 브라우저로 보냄
    }

    @GetMapping("/api/v1/products/{id}")
    public Product one(@PathVariable("id") Long id) {
        return productService.findById(id);
    }
}