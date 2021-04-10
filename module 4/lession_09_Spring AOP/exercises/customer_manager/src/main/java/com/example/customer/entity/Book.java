package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book {
    public static final Integer amountBooing = new Book().getAmount();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer id;
    private String name;
    private Integer amount;

    public static Integer getAmountBooing() {
        return amountBooing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
