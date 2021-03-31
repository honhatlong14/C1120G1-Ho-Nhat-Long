package com.example.controller;

import com.example.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;
    @GetMapping({"/calculator"})
    public String getCalculator(@RequestParam(value = "num1") long num1,@RequestParam(value = "num2") long num2,
                                @RequestParam(value = "calc") String calc, Model model){
        long result = calculatorService.calculator(num1,num2,calc);
        model.addAttribute("result",result);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("calc",calc);
        return "result";
    }
}
