package com.example.bookstore.mapper;

import com.example.bookstore.Book;
import com.example.bookstore.BookDTO;
import com.example.bookstore.Customer;
import com.example.bookstore.CustomerDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-22T11:57:08+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240725-1906, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class EntityMapperImpl implements EntityMapper {

    @Override
    public BookDTO book2DTO(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO bookDTO = new BookDTO();

        bookDTO.setAuthor( book.getAuthor() );
        bookDTO.setId( book.getId() );
        bookDTO.setIsbn( book.getIsbn() );
        bookDTO.setPrice( book.getPrice() );
        bookDTO.setTitle( book.getTitle() );

        return bookDTO;
    }

    @Override
    public Book DTO2book(BookDTO bookDTO) {
        if ( bookDTO == null ) {
            return null;
        }

        Book book = new Book();

        book.setAuthor( bookDTO.getAuthor() );
        book.setId( bookDTO.getId() );
        book.setIsbn( bookDTO.getIsbn() );
        if ( bookDTO.getPrice() != null ) {
            book.setPrice( bookDTO.getPrice() );
        }
        book.setTitle( bookDTO.getTitle() );

        return book;
    }

    @Override
    public CustomerDTO cst2DTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setEmail( customer.getEmail() );
        customerDTO.setId( customer.getId() );
        customerDTO.setName( customer.getName() );
        customerDTO.setPassword( customer.getPassword() );

        return customerDTO;
    }

    @Override
    public Customer DTO2cst(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setEmail( customerDTO.getEmail() );
        customer.setId( customerDTO.getId() );
        customer.setName( customerDTO.getName() );
        customer.setPassword( customerDTO.getPassword() );

        return customer;
    }
}
