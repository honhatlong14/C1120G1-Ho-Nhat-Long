package com.example.casr_study.repository;


import com.example.casr_study.model.service.Service;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ResortServiceRepository extends PagingAndSortingRepository<Service,String> {
}
