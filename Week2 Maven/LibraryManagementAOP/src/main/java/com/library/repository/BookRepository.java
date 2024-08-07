package com.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<String> books;

    public BookRepository() {
        books = new ArrayList<>();
        books.add("The Catcher in the Rye");
        books.add("To Kill a Mockingbird");
        books.add("1984");
    }

    public List<String> getAllBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }
}
