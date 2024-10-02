package com.example.lab1.Controller;

import com.example.lab1.Service.BookService;
import com.example.lab1.Model.Book;
//import com.example.lab1.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // 1. GET /books - return a List of books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    // 2. GET /books/{id} - return a single book by Id
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return bookService.getBookById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // 3. POST /books - add a new book
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    // 4. PUT /books/{id} - update a book by id
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        bookService.updateBook(id, updatedBook);
        return ResponseEntity.ok(updatedBook);
    }

    // 5. DELETE /books/{id} - delete a book by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        if (bookService.deleteBook(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}