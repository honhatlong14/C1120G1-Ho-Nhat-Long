package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String show(Model model){
        model.addAttribute("user", new User());
        return "index";
    }
    @PostMapping("/")
    public String result(@Valid @ModelAttribute("user")User user, BindingResult bindingResult,Model model){
        if (bindingResult.hasFieldErrors()){
            return "index";
        }else {
            userService.save(user);
            model.addAttribute("user",user);
            return "result";
        }
    }

}
