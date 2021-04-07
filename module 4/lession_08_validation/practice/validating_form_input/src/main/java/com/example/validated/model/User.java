package com.example.validated.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty
    @Size(min = 2, max = 30)
    private String name;
    @Min(18)
    private String age;

    public User() {
    }

    public User(int id, @NotEmpty @Size(min = 2, max = 30) String name, @Min(18) String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
