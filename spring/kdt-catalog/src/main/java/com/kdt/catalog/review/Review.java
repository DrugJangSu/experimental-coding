package com.kdt.catalog.review;   // 이 파일이 들어 있는 폴더 위치

import com.kdt.catalog.product.Product;   // 상품 클래스를 가져다 씀 (연결하려고)
import jakarta.persistence.*;             // @Entity, @Id 같은 JPA 표시들
import lombok.Getter;                     // getter 자동 생성 도구
import lombok.NoArgsConstructor;          // 빈 생성자 자동 생성 도구

import java.time.LocalDateTime;           // 날짜+시각 타입

@Entity                                   // "이 클래스는 DB 표와 연결된다" (없으면 JPA가 이 클래스를 무시)
@Table(name = "catalog_review")           // "연결할 표 이름은 catalog_review" (SQL에서 CREATE TABLE 한 그 이름)
@Getter                                   // getId(), getAuthor() 같은 getter를 자동으로 만들어 줌
@NoArgsConstructor                        // 빈 생성자 Review()를 자동으로 만들어 줌 (JPA가 DB에서 꺼낼 때 이걸로 객체를 만듦)
public class Review {                     // 이 객체 하나 = 리뷰 표의 한 줄

    @Id                                                    // "이 필드가 줄 번호" (SQL의 PRIMARY KEY (id))
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // "번호는 DB가 매긴다" (SQL의 AUTO_INCREMENT)
    private Long id;                                       // 표의 id 칸 (BIGINT → Long)

    @ManyToOne(fetch = FetchType.LAZY)    // "리뷰 여러 개가 상품 하나에 달린다" + 상품은 필요할 때만 꺼냄
    @JoinColumn(name = "product_id")      // "연결에 쓰는 칸은 표의 product_id"
    private Product product;              // 표에는 상품 '번호'만 있지만, Java에서는 상품 '객체'를 통째로 들고 있음

    private String author;                // 표의 author 칸 (VARCHAR(20) → String)
    private String content;               // 표의 content 칸 (VARCHAR(200) → String)
    private int rating;                   // 표의 rating 칸 (TINYINT → int)
    private LocalDateTime createdAt;      // 표의 created_at 칸 (DATETIME(6) → LocalDateTime). 이름은 Spring이 created_at ↔ createdAt 자동 연결
    private LocalDateTime updatedAt;      // 표의 updated_at 칸
}