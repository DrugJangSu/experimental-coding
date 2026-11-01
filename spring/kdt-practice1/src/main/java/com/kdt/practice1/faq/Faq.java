package com.kdt.practice1.faq;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "practice_faq")
@Getter
@NoArgsConstructor
public class Faq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;
    private String answer;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Faq(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
