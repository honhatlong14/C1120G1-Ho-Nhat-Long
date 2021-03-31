package com.example.controller;

import com.example.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    DictionaryService dictionaryService;

    @GetMapping({"","/dictionary"})
    public String SearchDictionary(@RequestParam String word, Model model){
        String result = dictionaryService.searchDictionary(word);
        model.addAttribute("result", result);
        model.addAttribute("word",word);

        return "/result";
    }
}
