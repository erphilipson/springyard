package com.example.customer.service;

import com.example.customer.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ethan on 8/3/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    public void testAddGet() {
        Customer customer1 = createTestCustomer();
        Customer customer2 = createTestCustomer();
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        customerService.add(customers);
        customers = customerService.get();
        assertTrue(customers.get(0).getEmail().equals("email@email.com"));

    }

    public static Customer createTestCustomer() {
        String firstName = Long.toString(System.currentTimeMillis());
        String lastName = Long.toString(System.currentTimeMillis());

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setPhone("555-555-5555");
        customer.setEmail("email@email.com");
        return customer;

    }

}