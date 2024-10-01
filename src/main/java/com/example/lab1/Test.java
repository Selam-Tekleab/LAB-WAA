package com.example.lab1;

import com.example.lab1.Model.Book;

import java.util.ArrayList;

public class Test {
    public ArrayList<Book> getBooks() {

        ArrayList<Book> B = new ArrayList<Book>();
        B.add(new Book(1, "Database", "411658", 359));
        B.add(new Book(2, "SoftwareEngineering", "405858", 550));
        B.add(new Book(3, "WebApplication", "460125", 850));
        B.add(new Book(4, "SoftwareArchitecture", "169853", 746));
        return B;
    }
}