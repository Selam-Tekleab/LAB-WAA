package com.example.lab1.Service;

import com.example.lab1.Model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public BookService() {
        // Hardcoded Books
        books.add(new Book(1, "Database", "411658", 359));
        books.add(new Book(2, "SoftwareEngineering", "405858", 550));
        books.add(new Book(3, "WebApplication", "460125", 850));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Optional<Book> getBookById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBook(int id, Book newBook) {
        getBookById(id).ifPresent(existingBook -> {
            existingBook.setTitle(newBook.getTitle());
            existingBook.setIsbn(newBook.getIsbn());
            existingBook.setPrice(newBook.getPrice());
        });
    }

    public boolean deleteBook(int id) {
        return books.removeIf(book -> book.getId() == id);
    }
}
