package com.bookstore.bookstoreapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstoreapi.entity.Customer;
import com.bookstore.bookstoreapi.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    //CREATE OPERATION
    @PostMapping("/save")
    public void save(@RequestBody Customer customer){
        customerService.save(customer);
        System.out.println("saved into the DB");
    }
    //READ OPERATIONS
    @GetMapping("/find/{id}")
    public Object getCustomer(@PathVariable Long id){
        return customerService.findById(id);
    }

    @GetMapping("")
    public List<Customer> getAllCustomers(){
        return  customerService.getAllCustomers();
    }

    //UPDATE OPERATION
    @PutMapping("")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    //DELETE OPERATION
    @DeleteMapping("/{id}")
    public Object deleteCustomer(@PathVariable Long id){
        return customerService.delete(id);
    } 
}
