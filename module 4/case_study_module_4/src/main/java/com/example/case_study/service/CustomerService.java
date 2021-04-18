package com.example.case_study.service;

import com.example.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(String customerId);
    void save(Customer customer);
    void delete(String customerId);
    Iterable<Customer> findAll();
}
