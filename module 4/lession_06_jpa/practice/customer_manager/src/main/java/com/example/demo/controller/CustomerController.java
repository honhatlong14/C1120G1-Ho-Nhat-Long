package com.example.demo.controller;

import com.example.demo.bean.model.Customer;
import com.example.demo.bean.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping()
    public ModelAndView getHome() {
        return new ModelAndView("list", "customers", customerService.findAll());
    }

    @GetMapping("/customer/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/customer/save")
    public String save(Customer customer){
        customer.setId(customer.getId());
        customerService.save(customer);
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/edit")
    public ModelAndView edit(@PathVariable int id){
        Customer customer = customerService.findById(id);
        if (customer !=null){
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;
        }else {
            ModelAndView modelAndView =new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/customer/edit")
    public String update(Customer customer){
        customerService.save(customer);
        return "redirect:/";
    }
    @GetMapping("/customer/delete")
    public String delete(@RequestParam int id){
        customerService.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/view";
    }
}
