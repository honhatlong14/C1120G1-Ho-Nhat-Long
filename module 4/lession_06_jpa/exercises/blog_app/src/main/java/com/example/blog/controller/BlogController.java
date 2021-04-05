package com.example.blog.controller;


import com.example.blog.bean.model.Blog;
import com.example.blog.bean.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public String home(Model model){
        model.addAttribute("blogs", blogService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog){
        blogService.create(blog);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("edit") Blog blog){
        blogService.update(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/delete")
    public String delete(@RequestParam int id){
        blogService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") int id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }
}
