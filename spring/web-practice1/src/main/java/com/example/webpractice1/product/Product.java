package com.example.webpractice1.product;


import com.example.webpractice1.category.Category;
import jakarta.persistence.*;

@Entity
@Table(name ="product")
public class Product {
    @Id
    private Integer id;

    private String name;

    private Integer price;

    @Column(name = "category_id")
    private Integer categoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "category_id", insertable = false, updatable = false)
    private Category category;

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

    public Category getCategory() {
        return category;
    }
}