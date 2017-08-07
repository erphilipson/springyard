package com.example.customer.service;

import com.example.customer.domain.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ethan on 8/3/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    @Override
    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }

    @Transactional
    @Override
    public void add(List<Customer> customers) {
        for (Customer customer : customers) {
            customerRepository.save(customer);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Customer getById(int id) {
        return getCustomer(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Customer> get() {
        return customerRepository.findAll();
    }

    @Transactional
    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Transactional
    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }

    private Customer getCustomer(int id) {
        Customer customer = customerRepository.findOne(id);
        return customer;
    }


}
