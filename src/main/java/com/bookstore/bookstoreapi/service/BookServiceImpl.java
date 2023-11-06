package com.bookstore.bookstoreapi.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstoreapi.entity.Book;
import com.bookstore.bookstoreapi.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Object delete(Long id) {
       Object bookFound = bookRepository.findById(id);
       bookRepository.deleteById(id);
       return bookFound;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(element->books.add(element));
        return books;    
    }

}