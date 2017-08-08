package com.example.customer.controller;

import com.example.customer.domain.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Ethan on 8/8/17.
 */

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    String getCustomers(Model model) {
        List<Customer> customers = customerService.get();
        model.addAttribute("listOfCustomers", customers);
        return "view_customers";
    }

    @GetMapping("/customer")
    String getCustomer(Model model) {
        return "add_customer";
    }

    @PostMapping("/customer")
    String addCustomer(Customer customer, Model model) {
        customerService.add(customer);
        List<Customer> customers = customerService.get();
        model.addAttribute("listOfCustomers", customers);
        return "view_customers";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @GetMapping("/admin")
    String admin() {
        return "super_secret";
    }

}
