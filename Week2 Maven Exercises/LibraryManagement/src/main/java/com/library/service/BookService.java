package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Constructor injection (recommended)
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to get a book
    public String getBook(int bookId) {
        return bookRepository.findBookById(bookId);
    }

    // Method to add a book
    public void addBook(String bookName) {
        bookRepository.saveBook(bookName);
    }
}
