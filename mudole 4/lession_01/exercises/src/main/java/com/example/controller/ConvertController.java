package com.example.controller;

import com.example.service.ConvertService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @Autowired
    ConvertService convertService;
    @GetMapping({"","/convert"} )
    public String convertMoney(@RequestParam String number, Model model){
        Double result = convertService.convert(Double.parseDouble(number));
        model.addAttribute("result",result);
        model.addAttribute("number",number);
        return "result";
    }
}

