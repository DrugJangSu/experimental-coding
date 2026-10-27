package com.kdt.catalog.product;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity                              // "이 클래스는 DB 표와 연결된다"
@Table(name = "catalog_product")     // "연결할 표 이름은 catalog_product"
@Getter                              // Lombok: 모든 필드의 getXxx() 메서드를 자동 생성 (JSON 변환에도 필요)
@NoArgsConstructor                   // Lombok: 파라미터 없는 기본 생성자 자동 생성 (JPA가 요구함)
public class Product {

    @Id                                                 // "id가 각 줄을 구분하는 번호다"
    @GeneratedValue(strategy = GenerationType.IDENTITY) // "번호는 DB가 알아서 매긴다" (AUTO_INCREMENT)
    private Long id;

    private String name;               // 아래 필드들은 각각 표의 컬럼(열)이 된다
    private int price;
    private int stock;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}
