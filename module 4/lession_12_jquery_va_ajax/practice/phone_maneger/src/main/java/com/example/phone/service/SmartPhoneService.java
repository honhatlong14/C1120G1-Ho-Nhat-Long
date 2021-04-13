package com.example.phone.service;


import com.example.phone.entity.SmartPhone;

public interface SmartPhoneService {
    Iterable<SmartPhone> findAll();
    SmartPhone findById(Integer id);
    SmartPhone save(SmartPhone phone);
    SmartPhone remove(Integer id);
}
