package com.example.bean.repository;

import com.example.bean.model.Product;

import java.util.List;

public interface ProductRepository {

        List<Product> findAll();

        Product findById(int id);

        void save(Product product);

        void update(Product product);

        void remove(int id);
}