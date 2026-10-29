package com.kdt.practice1.product;              // 이 파일이 있는 폴더 위치

import org.springframework.stereotype.Service;  // @Service 이름표를 가져옴

import java.util.List;                          // 목록(List) 타입을 가져옴

// ───────── 이 클래스는 무엇인가 ─────────
// 요청 흐름: Controller → [Service] → Repository → DB
// Controller에게 일을 받아서, Repository에게 DB 일을 시키는 중간 담당.
// 나중에 "재고가 0이면 거절" 같은 판단(if)이 들어가는 곳도 여기.

@Service                                        // "이 클래스를 빈으로 만들어 보관해라"라고 Spring에게 알림
//   → 없으면 Controller가 Service를 못 받아서
//     "required a bean of type 'ProductService'" 오류로 앱이 안 켜짐
public class ProductService {

    private final ProductRepository productRepository;
    // ① Repository를 저장해 둘 칸 (필드)
    //    final = 한 번 넣으면 바꿀 수 없음

    public ProductService(ProductRepository productRepository) {
        // ② 생성자: "나를 만들려면 ProductRepository를 넣어 줘"
        //    앱이 켜질 때 Spring이 보관해 둔 Repository를 여기에 넣어 줌
        this.productRepository = productRepository;
        // ③ 받은 Repository를 ① 칸에 저장
        //    this.productRepository = 내 필드 / 오른쪽 = 받은 값
    }

    public List<Product> findAll() {            // 상품 목록을 돌려주는 메서드. 돌려주는 타입은 "Product들의 목록"
        return productRepository.findAll();     // ①에 저장해 둔 Repository에게 "전부 꺼내 줘"라고 시킴
        //   → Spring이 SQL을 만들어 보냄: select ... from catalog_product
        //   → 결과를 그대로 돌려줌 (Controller에게)
    }
}