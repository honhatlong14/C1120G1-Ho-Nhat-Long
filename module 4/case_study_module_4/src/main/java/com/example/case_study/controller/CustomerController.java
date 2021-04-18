package com.example.case_study.controller;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.model.customer.CustomerType;
import com.example.case_study.service.CustomerService;
import com.example.case_study.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    CustomerTypeService customerTypeService;

    @GetMapping()
    public String getIndex(Model model, @RequestParam(name = "page",required = false,defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page,5);
        model.addAttribute("customer",new Customer());
        model.addAttribute("customerList",customerService.findAll(pageable));
        return "customer/list";
    }
//    @GetMapping("/create")
//    public String createCustomer(Model model){
//        model.addAttribute("customer",new Customer());
//        return "/customer/create";
//    }


    @ModelAttribute("customerTypes")
    public Iterable<CustomerType> getCustomerType(){
        return customerTypeService.findAll();
    }

}
