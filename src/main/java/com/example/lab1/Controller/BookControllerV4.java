package com.example.lab1.Controller;


import com.example.lab1.Model.Book;
import com.example.lab1.Service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookControllerV4 {

    private final BookService bookService;

    public BookControllerV4(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/{id}", produces = "application/cs.miu.edu-v2+json")
    public ResponseEntity<Book> getBookByIdV2(@PathVariable int id) {
        return bookService.getBookById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
