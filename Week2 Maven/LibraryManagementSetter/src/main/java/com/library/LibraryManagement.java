package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryManagement {

    public static void main(String[] args) {
        // Load Spring context from XML configuration file
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext("com.library");

        // Retrieve the BookService bean
        BookService bookService = context.getBean(BookService.class);

        // Test the BookService methods
        System.out.println("Available books: " + bookService.listBooks());

        // Adding a new book
        bookService.addBook("The Great Gatsby");
        System.out.println("Books after adding 'The Great Gatsby': " + bookService.listBooks());

        // Removing a book
        bookService.removeBook("1984");
        System.out.println("Books after removing '1984': " + bookService.listBooks());
    }
}
