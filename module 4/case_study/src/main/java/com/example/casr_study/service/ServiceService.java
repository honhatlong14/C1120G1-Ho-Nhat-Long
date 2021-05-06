package com.example.casr_study.service;


import com.example.casr_study.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ResortServiceService {
    Page<Service> findAll(Pageable pageable);

    void save(Service Service);

    Service findById(String serviceId);

    void delete(String serviceId);

    Iterable<Service> findAll();
}
