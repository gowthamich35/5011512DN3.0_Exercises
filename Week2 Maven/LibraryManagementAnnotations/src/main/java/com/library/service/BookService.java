package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    // Constructor-based dependency injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<String> listBooks() {
        return bookRepository.getAllBooks();
    }

    public void addBook(String book) {
        bookRepository.addBook(book);
    }

    public void removeBook(String book) {
        bookRepository.removeBook(book);
    }
}
