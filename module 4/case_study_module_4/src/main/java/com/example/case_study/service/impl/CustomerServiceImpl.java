package com.example.case_study.service.impl;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.repository.CustomerRepository;
import com.example.case_study.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(String customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(String customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }
}
