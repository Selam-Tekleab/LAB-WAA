package com.example.lab1.Controller;

import com.example.lab1.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping ("/AllBooks")
    public String getAllBooks(){
return new Test().getBooks().toString();
    }
}

