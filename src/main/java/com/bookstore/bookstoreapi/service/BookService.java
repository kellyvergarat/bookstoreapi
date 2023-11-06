package com.bookstore.bookstoreapi.service;

import java.util.List;
import java.util.Optional;

import com.bookstore.bookstoreapi.entity.Book;

public interface BookService {

    Book save(Book book);
    Object delete(Long id);
    Optional<Book> findById(Long id);
    List<Book> getAllBooks();
    
}
