package com.example.lab1.Controller;

import com.example.lab1.Model.Book;
import com.example.lab1.Service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControllerV3 {

    private final BookService bookService;

    public BookControllerV3(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(headers = "X-API-VERSION=2")
    public List<Book> getAllBooksVersion2() {
        return bookService.getBooks();
    }
}
