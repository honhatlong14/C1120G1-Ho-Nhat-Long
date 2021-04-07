package com.example.user.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Getter
@Setter
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Size(min = 5, max = 45)
    private String firstName;
    @NotBlank
    @Size(min = 5, max = 45)
    private String LastName;
    @Pattern(regexp = "^0\\d{9}$")
    private String phone;
    @Min(18)
    private int age;
    @Email
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        LastName = lastName;
        this.phone = phone;
        this.email = email;
    }

}
