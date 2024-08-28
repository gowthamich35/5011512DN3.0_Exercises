package com.example.bookstore.mapper;

import com.example.bookstore.Book;
import com.example.bookstore.BookDTO;
import com.example.bookstore.CustDTO;
import com.example.bookstore.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-28T20:55:52+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240725-1906, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class EntityMapperImpl implements EntityMapper {

    @Override
    public BookDTO bookToDTO(Book book) {
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
    public Book DTOToBook(BookDTO bookDTO) {
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
    public CustDTO customerToDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustDTO custDTO = new CustDTO();

        custDTO.setEmail( customer.getEmail() );
        custDTO.setId( customer.getId() );
        custDTO.setName( customer.getName() );
        custDTO.setPassword( customer.getPassword() );

        return custDTO;
    }

    @Override
    public Customer DTOToCustomer(CustDTO customerDTO) {
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
