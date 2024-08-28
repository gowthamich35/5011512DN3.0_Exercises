package com.example.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.bookstore.Book;
import com.example.bookstore.BookDTO;
import com.example.bookstore.CustDTO;
import com.example.bookstore.Customer;

@Mapper(componentModel = "spring")
public interface EntityMapper {
    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    // Book mappings
    BookDTO bookToDTO(Book book);

    Book DTOToBook(BookDTO bookDTO);

    // Customer mappings
    CustDTO customerToDTO(Customer customer);

    Customer DTOToCustomer(CustDTO customerDTO);
}
