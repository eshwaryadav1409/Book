package com.example.goodreads.service;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.goodreads.repository.BookRepository;
import com.example.goodreads.repository.BookJpaRepository;
import com.example.goodreads.model.Book;
import java.util.*;

@Service
public class BookJpaService implements BookRepository {
    
    @Autowired
    private BookJpaRepository bookJpaRepository;

     @Override
    public ArrayList<Book> getBooks() {
        List<Book> bookList = bookJpaRepository.findAll();
        ArrayList<Book> books = new ArrayList<>(bookList);
        return books;
    }

    @Override
    public Book getBookById(int bookId) {
        return new Book(3, "Sample Book", "sample.jpg");
    }

    @Override
    public Book addBook(Book book) {
        return new Book(3, "Sample Book", "sample.jpg");
    }

    @Override
    public Book updateBook(int bookId, Book book) {
        return new Book(3, "Sample Book", "sample.jpg");
    }

    @Override
    public void deleteBook(int bookId) {
        
    }
}