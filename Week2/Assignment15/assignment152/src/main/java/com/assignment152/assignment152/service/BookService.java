package com.assignment152.assignment152.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment152.assignment152.entity.Book;
import com.assignment152.assignment152.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookbyBookId(Long id) {
        return bookRepository.findById(id).get();
    }

    // public Book updateAuthorByBookId(Long id, Book book) {
    //     Book b = bookRepository.findById(id).get();
    //     if(b!=null){
    //         b.setAuthor(book.getAuthor());
    //     }
    // }

    // public void deleteBook(Long id) {
    //     bookRepository.deleteById(id);
    // }
}
