package com.example.lab1.Model;


import lombok.*;

import java.util.ArrayList;

@Data
@Setter@Getter
@AllArgsConstructor
public class Book {

    @Setter@Getter
    private int Id;

    @Setter@Getter
   private String title;

    @Setter@Getter
    private String isbn;

    @Setter@Getter
    private double price;

   // public ArrayList<Book> getBooks(){

 //   }
}
