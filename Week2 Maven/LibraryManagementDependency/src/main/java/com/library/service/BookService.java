package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
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
