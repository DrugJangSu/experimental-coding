package com.kdt.practice1.product;   // 이 파일이 있는 폴더 위치 (src/main/java/com/kdt/practice1/product)

import jakarta.persistence.*;        // JPA 이름표들 (@Entity, @Table, @Id, @GeneratedValue 등)을 가져옴
import lombok.Getter;                // getter 자동 생성 도구
import lombok.NoArgsConstructor;     // 빈 생성자 자동 생성 도구

import java.time.LocalDateTime;      // 날짜+시각을 담는 Java 타입

// ───────── 이 클래스는 무엇인가 ─────────
// MySQL에 이미 있는 catalog_product 표와 "연결"하기 위한 설명서.
// 표를 만드는 게 아님. 표는 SQL(CREATE TABLE)로 이미 만들어 둠.
// 이 클래스의 객체 하나 = 표의 한 줄

@Entity                              // JPA에게 "이 클래스는 DB 표의 한 줄을 담는 클래스"라고 알림
//   → 없으면 JPA가 이 클래스를 무시해서 Repository를 못 만들고 앱이 안 켜짐
@Table(name = "catalog_product")     // 연결할 표 이름 (SQL의 CREATE TABLE catalog_product)
//   → 없으면 클래스 이름을 보고 'product' 표를 찾아서 "표 없음" 오류
@Getter                              // getId(), getName() 같은 getter를 자동으로 만들어 줌 (Lombok)
//   → 필드가 private라 밖에서 못 꺼내니까 필요
//   → Spring이 JSON을 만들 때 이 getter로 값을 꺼냄
@NoArgsConstructor                   // 빈 생성자 Product()를 자동으로 만들어 줌 (Lombok)
//   → JPA가 DB에서 줄을 꺼낼 때 빈 객체부터 만들고 칸을 채우기 때문
public class Product {

    @Id                                                  // 이 필드가 줄 번호 (SQL의 PRIMARY KEY (id))
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 번호는 DB가 자동으로 매김 (SQL의 AUTO_INCREMENT)
    private Long id;                                     // 표의 id 칸        (BIGINT → Long)

    private String name;                                 // 표의 name 칸      (VARCHAR(50) → String)
    private int price;                                   // 표의 price 칸     (INT → int)
    private int stock;                                   // 표의 stock 칸     (INT → int)
    private LocalDateTime createdAt;                     // 표의 created_at 칸 (DATETIME(6) → LocalDateTime)
    //   이름은 밑줄 대신 대문자: created_at ↔ createdAt (JPA가 자동으로 짝 맞춤)
    private LocalDateTime updatedAt;                     // 표의 updated_at 칸
}