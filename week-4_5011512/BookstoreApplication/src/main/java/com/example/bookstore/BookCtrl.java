package com.example.bookstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.mapper.EntityMapper;

@RestController
@RequestMapping("/books")
public class BookCtrl {
	 private final EntityMapper entityMapper;

	    // Inject EntityMapper via constructor
	    public BookCtrl(EntityMapper entityMapper) {
	        this.entityMapper = entityMapper;
	    }
    private List<Book> bookList = new ArrayList<>();

    // GET method to retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookList;
    }

    // POST method to add a new book
    @PostMapping("/dto")
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO addBookWithDTO(@RequestBody BookDTO bookDTO) {
        Book book = entityMapper.DTO2book(bookDTO);
        bookList.add(book);
        return entityMapper.book2DTO(book);
    }

    // POST method to add a new book using entity
    @PostMapping("/entity")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBookWithEntity(@RequestBody Book book) {
        bookList.add(book);
        return book;
    }

    // GET method to filter books by title and author using query parameters
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String author) {
        return bookList.stream()
                       .filter(book -> (title == null || book.getTitle().equalsIgnoreCase(title)) &&
                                       (author == null || book.getAuthor().equalsIgnoreCase(author)))
                       .toList();
    }

    // GET method to retrieve a book by its ID with custom headers
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return bookList.stream()
                       .filter(book -> book.getId().equals(id))
                       .findFirst()
                       .map(book -> {
                           // Create custom headers
                           HttpHeaders headers = new HttpHeaders();
                           headers.add("X-Bookstore-API-Version", "1.0");
                           return new ResponseEntity<>(book, headers, HttpStatus.OK);
                       })
                       .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND)); // Return 404 Not Found if book is not found
    }

    // PUT method to update an existing book
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setPrice(updatedBook.getPrice());
                book.setIsbn(updatedBook.getIsbn());
                
                // Return updated book with custom headers
                HttpHeaders headers = new HttpHeaders();
                headers.add("X-Bookstore-API-Version", "1.0");
                return new ResponseEntity<>(book, headers, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 Not Found if book is not found
    }

    // DELETE method to remove a book
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Return 204 No Content on successful deletion
    public void deleteBook(@PathVariable Long id) {
        bookList.removeIf(book -> book.getId().equals(id));
    }
}
