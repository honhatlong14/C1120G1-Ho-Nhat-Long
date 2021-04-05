package com.example.controller;

import com.example.bean.model.Product;
import com.example.bean.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index(Model model){
        List<Product>productList = productService.findAll();
        model.addAttribute("products",productList);
        return"/home";
    }
    @GetMapping("/product/add")
    public String add(Model model){
        model.addAttribute("product", new Product());
        return "/add";
    }
    @PostMapping("/product/save")
    public String save(Product product){
        product.setId((int)(Math.random()*10000));
        productService.save(product);
        return "redirect:/";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "/edit";
    }
    @PostMapping("/product/update")
    public String update(Product product,RedirectAttributes redirectAttributes){
        productService.update(product.getId(),product);
        redirectAttributes.addFlashAttribute("success","Updated Product successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        productService.delete(productService.findById(id).getId());
        redirect.addFlashAttribute("message", "Removed product successfully!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/view")
    public String view(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "/view";
    }

}
