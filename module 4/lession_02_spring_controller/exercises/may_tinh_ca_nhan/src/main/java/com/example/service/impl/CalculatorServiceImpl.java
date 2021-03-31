package com.example.service.impl;

import com.example.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public long calculator(long num1, long num2, String calc) {
        long result = 0;
        switch (calc) {
            case "addition(+)":
                result = num1 + num2;
                break;
            case "subtraction(-)":
                result = num1 - num2;
                break;
            case "multiplication(x)":
                result = num1 * num2;
                break;
            case "division(/)":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
