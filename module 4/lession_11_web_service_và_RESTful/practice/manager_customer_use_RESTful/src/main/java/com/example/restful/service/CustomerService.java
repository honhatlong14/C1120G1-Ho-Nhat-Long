package com.example.restful.service;

import com.example.restful.entity.Customer;


import java.util.List;


public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}