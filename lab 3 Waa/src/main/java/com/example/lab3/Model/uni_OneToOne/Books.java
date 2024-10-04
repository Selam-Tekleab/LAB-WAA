package com.example.lab3.Model.uni_OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private double price;

    @OneToOne
    @JoinColumn(name = "author_id")  // Foreign key column in the Book table
    private com.example.lab3.Model.Uni_OneToOne.Author author;
}
