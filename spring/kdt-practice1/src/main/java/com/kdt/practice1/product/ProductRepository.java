package com.kdt.practice1.product;                             // 이 파일이 있는 폴더 위치

import org.springframework.data.jpa.repository.JpaRepository;  // Spring이 만들어 둔 JpaRepository를 가져옴

// ───────── 이 파일은 무엇인가 ─────────
// 요청 흐름: Controller → Service → [Repository] → DB
// DB에 SQL을 보내서 꺼내고 저장하는 담당.
// 메서드 내용은 우리가 안 씀. Spring이 앱을 켤 때 자동으로 채워 줌 (로그의 "Found 1 JPA repository interface")

public interface ProductRepository                             // class가 아니라 interface: 몸통 { }은 Spring이 채우니까
        extends JpaRepository<Product, Long> {                 // JpaRepository를 물려받음 (인터페이스 → 인터페이스라서 extends)
    //   <Product, Long> = <Entity 클래스 이름, 그 Entity의 @Id 타입>
    //   Product → Spring이 Product.java를 읽고 catalog_product 표를 다룸
    //   Long    → findById(Long id)처럼 번호를 Long으로 받음
    //
    // 물려받아서 공짜로 생기는 메서드들:
    //   findAll()      → select ... from catalog_product            (전부)
    //   findById(id)   → select ... from catalog_product where id=? (하나)
    //   save(product)  → insert 또는 update                        (저장)
    //   delete(product)→ delete from catalog_product where id=?    (삭제)
    //   count()        → select count(*) from catalog_product       (개수)
}