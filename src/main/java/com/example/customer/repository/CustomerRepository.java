package com.example.customer.repository;

import com.example.customer.model.Customer;

import java.util.List;

/**
 * Created by Ethan on 8/3/17.
 */
public interface CustomerRepository {
    void add(Customer customer);
    void update(Customer customer);
    Customer getById(int id);
    List<Customer> get();
    void delete(int id);
}
