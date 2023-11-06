package com.bookstore.bookstoreapi.service;

import java.util.List;
import java.util.Optional;

import com.bookstore.bookstoreapi.entity.Customer;

public interface CustomerService {

    Customer save(Customer customer);
    Object delete(Long id);
    Optional<Customer> findById(Long id);
    List<Customer> getAllCustomers();
    
}
