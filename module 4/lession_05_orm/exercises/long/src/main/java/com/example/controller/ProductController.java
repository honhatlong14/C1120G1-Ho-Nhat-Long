package com.example.controller;

import com.example.bean.model.Product;
import com.example.bean.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ModelAndView listProduct(){
        List<Product> products =productService.findAll();
        ModelAndView modelAndView = new ModelAndView("/product/list");
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @GetMapping("/product/create")
    public ModelAndView createProduct(){
        ModelAndView modelAndView= new ModelAndView("/product/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/product/create")
    public ModelAndView saveProduct(@ModelAttribute("product") Product product){
        productService.save(product);

        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message","New Product created successfully");
        return modelAndView;
    }

    @GetMapping("/product/edit/{id}")
    public ModelAndView edit(@PathVariable int id){
        Product product = productService.findById(id);
        if(product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            modelAndView.addObject("product", product);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/product/edit")
    public ModelAndView update(@ModelAttribute("product") Product product) {
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("/product/edit");
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "Product updated successfully");
        return modelAndView;
    }
    @GetMapping("/product/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id){
        Product product = productService.findById(id);
        if(product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/delete");
            modelAndView.addObject("product", product);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/product/delete")
    public String delete(@ModelAttribute("product") Product product){
        productService.remove(product.getId());
        return "redirect:products";
    }
    @GetMapping("/product/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/product/view";
    }
}
