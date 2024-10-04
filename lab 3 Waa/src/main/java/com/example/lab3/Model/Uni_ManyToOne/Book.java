package com.example.lab3.Model.Uni_ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private  int id;
    private String title;
    private double price;
    @ManyToOne
    private Publisher publisher;


}

