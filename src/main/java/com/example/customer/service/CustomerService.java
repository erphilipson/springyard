package com.example.customer.service;

import com.example.customer.model.Customer;

import java.util.List;

/**
 * Created by Ethan on 8/3/17.
 */
public interface CustomerService {
    void add(Customer customer);
    void add(List<Customer> customers);
    void update(Customer customer);
    Customer getById(int id);
    List<Customer> get();
    void delete(int id);
}
