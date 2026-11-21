package com.example.webpractice1.product;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="product")
public class Product {
    @Id
    private Integer id;

    private String name;

    private Integer price;

    @Column(name = "category_id")
    private Integer categoryId;

    protected Product() {
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getPrice() {
        return price;
    }

    public Integer getCategoryId() {
        return categoryId;
    }


}
