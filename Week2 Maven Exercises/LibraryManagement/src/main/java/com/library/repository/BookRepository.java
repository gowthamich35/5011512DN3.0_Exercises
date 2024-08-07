package com.library.repository;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {

    // Simulated data store
    private static final Map<Integer, String> books = new HashMap<>();
    private static int currentId = 1;

    // Method to find a book by its ID
    public String findBookById(int bookId) {
        return books.get(bookId);
    }

    // Method to save a book
    public void saveBook(String bookName) {
        books.put(currentId++, bookName);
    }
}
