package com.example.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.bookstore.Book;
import com.example.bookstore.BookDTO;
import com.example.bookstore.Customer;
import com.example.bookstore.CustomerDTO;

@Mapper(componentModel = "spring")
public interface EntityMapper {
    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    // Book mappings
    BookDTO book2DTO(Book book);
    Book DTO2book(BookDTO bookDTO);

    // Customer mappings
    CustomerDTO cst2DTO(Customer customer);
    Customer DTO2cst(CustomerDTO customerDTO);
}
