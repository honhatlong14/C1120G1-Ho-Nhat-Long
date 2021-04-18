package com.example.case_study.repository;

import com.example.case_study.model.customer.CustomerType;
import org.springframework.data.repository.CrudRepository;

public interface CustomerTypeRepository extends CrudRepository<CustomerType,Integer> {
}
