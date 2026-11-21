package com.example.webpractice1.category;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
    @Id
    private Integer id;

    private String name;

    protected Category() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
