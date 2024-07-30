package com.assignment152.assignment152.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.assignment152.assignment152.entity.Book;
import com.assignment152.assignment152.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        // return bookService.createBook(book);
        // return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @GetMapping("/books/{bookId}")
    public Book getBookByBookId(@PathVariable Long bookId) {
        return bookService.getBookbyBookId(bookId);
    }
    
    // @PutMapping("books/{bookId}")
    // public Book updateAuthorByBookId(@PathVariable Long id, @RequestBody Book book) {
    //     //TODO: process PUT request
        
    //     return 
    // }

    // @DeleteMapping("/books/{bookId}")
    // public void deleteBook(@PathVariable Long bookId) {
    //     return bookService.deleteBook(bookId);
    // }
}
