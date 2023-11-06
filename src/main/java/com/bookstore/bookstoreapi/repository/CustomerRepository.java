package com.bookstore.bookstoreapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstoreapi.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
