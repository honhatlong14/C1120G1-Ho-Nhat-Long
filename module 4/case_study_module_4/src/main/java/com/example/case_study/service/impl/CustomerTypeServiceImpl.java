package com.example.case_study.service.impl;

import com.example.case_study.model.customer.CustomerType;
import com.example.case_study.repository.CustomerTypeRepository;
import com.example.case_study.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class CustomerTypeServiceImpl implements CustomerTypeService {
     CustomerTypeRepository customerTypeRepository;

    @Autowired
    public CustomerTypeServiceImpl(CustomerTypeRepository customerTypeRepository) {
        this.customerTypeRepository = customerTypeRepository;
    }

    @Override
    public Iterable<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);
    }

}
