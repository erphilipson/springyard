package com.example.customer.repository;

import com.example.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ethan on 8/3/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
