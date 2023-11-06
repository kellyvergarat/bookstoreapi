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

import com.bookstore.bookstoreapi.entity.Book;
import com.bookstore.bookstoreapi.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    private BookService bookService;

    //CREATE OPERATION
    @PostMapping("/save")
    public void save(@RequestBody Book book){
        bookService.save(book);
        System.out.println("saved into the DB");
    }

    //READ OPERATIONS
    @GetMapping("/find/{id}")
    public Object getBook(@PathVariable Long id){
        return bookService.findById(id);
    }

    @GetMapping("")
    public List<Book> getAllBooks(){
        return  bookService.getAllBooks();
    }

    //UPDATE OPERATION
    @PutMapping("")
    public Book updateBook(@RequestBody Book book){
        return bookService.save(book);
    }

    //DELETE OPERATION
    @DeleteMapping("/{id}")
    public Object deleteBook(@PathVariable Long id){
        return bookService.delete(id);
    }
}
