package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        // Load Spring context from XML configuration file
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

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
