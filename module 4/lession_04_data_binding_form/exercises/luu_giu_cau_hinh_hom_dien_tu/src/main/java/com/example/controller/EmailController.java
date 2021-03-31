package com.example.controller;

import com.example.bean.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
    private static List<String> languageList;
    private static List<String> pageSize;

    static {
        languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
        pageSize = new ArrayList<>();
        pageSize.add("5");
        pageSize.add("10");
        pageSize.add("15");
        pageSize.add("25");
        pageSize.add("50");
        pageSize.add("100");
    }

    @GetMapping("/")
    public String showForm(Model model) {

        model.addAttribute("email", new Email());
        model.addAttribute("languageList", languageList);
        model.addAttribute("pageSize", pageSize);
        return "/update";
    }

    @PostMapping("/updateEmail")
    public ModelAndView update(@ModelAttribute("email") Email email) {
        ModelAndView modelAndView = new ModelAndView("index", "email", email);
        modelAndView.addObject("languageList", languageList);
        modelAndView.addObject("pageSize", pageSize);
        return modelAndView;

    }

}
