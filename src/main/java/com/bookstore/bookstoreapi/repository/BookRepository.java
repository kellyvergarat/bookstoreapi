package com.bookstore.bookstoreapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstoreapi.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
    
}
