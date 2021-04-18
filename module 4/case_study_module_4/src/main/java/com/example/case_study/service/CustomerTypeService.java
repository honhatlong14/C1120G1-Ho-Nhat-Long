package com.example.case_study.service;

import com.example.case_study.model.customer.CustomerType;

public interface CustomerTypeService {
    Iterable<CustomerType> findAll();

    void save(CustomerType customerType);
}
