package com.kdt.catalog.product;

import org.springframework.data.jpa.repository.JpaRepository;

// DB 접근 담당. JpaRepository<Product, Long> = "Product 표를 다루고, 기본키(id)의 타입은 Long"
// 구현 코드를 안 써도 findAll(), findById(), count(), save(), delete() 등이 자동으로 생긴다
public interface ProductRepository extends JpaRepository<Product, Long> {
}
