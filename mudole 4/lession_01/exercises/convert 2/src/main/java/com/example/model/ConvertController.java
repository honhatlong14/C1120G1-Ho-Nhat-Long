package com.example.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {

    @GetMapping({"/convert"})
    public String convert(@RequestParam String number, Model model){
        Float result = convert(Float.parseFloat(number));
        model.addAttribute("result", result);
        model.addAttribute("number", number);

        return "result";
    }
    public float convert(float num){
        return num* 23000;
    }
}
