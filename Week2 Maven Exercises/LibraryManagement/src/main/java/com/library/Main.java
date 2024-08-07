package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load Spring context from XML configuration file
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve and use the beans
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println("BookService bean has been initialized: " + bookService);
    }
}
