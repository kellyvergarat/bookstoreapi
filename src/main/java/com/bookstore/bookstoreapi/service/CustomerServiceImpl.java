package com.bookstore.bookstoreapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstoreapi.entity.Customer;
import com.bookstore.bookstoreapi.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);  
    }

    @Override
    public Object delete(Long id) {
        Object customerFound = customerRepository.findById(id);
        customerRepository.deleteById(id);
        return customerFound;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>();  
        customerRepository.findAll().forEach(element -> customers.add(element));  
        return customers;  
    }
    
}
