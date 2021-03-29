package com.example.service.impl;

import com.example.service.ConvertService;
import org.springframework.stereotype.Service;

@Service
public class ConvertServiceImpl implements ConvertService {
    @Override
    public Float convert(float num) {
        return num * 23000;
    }
}
