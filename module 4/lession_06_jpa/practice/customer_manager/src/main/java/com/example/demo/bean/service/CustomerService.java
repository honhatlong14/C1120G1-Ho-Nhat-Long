package com.example.demo.bean.service;

import com.example.demo.bean.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    void deleteById(int id);
}
