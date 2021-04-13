package com.example.phone.service.impl;

import com.example.phone.entity.SmartPhone;
import com.example.phone.repository.SmartPhoneRepository;
import com.example.phone.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartPhoneServiceImpl implements SmartPhoneService {
    @Autowired
    private SmartPhoneRepository smartphoneRepository;

    @Override
    public Iterable<SmartPhone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public SmartPhone findById(Integer id) {
        SmartPhone smartphone = smartphoneRepository.findById(id).orElse(null);
        if(smartphone == null){
            return null;
        }
        return smartphone;
    }

    @Override
    public SmartPhone save(SmartPhone phone) {
        return smartphoneRepository.save(phone);
    }

    @Override
    public SmartPhone remove(Integer id) {
        SmartPhone smartphone = findById(id);
        smartphoneRepository.deleteById(id);
        return smartphone;
    }
}
