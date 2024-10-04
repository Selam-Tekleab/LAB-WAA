package com.example.lab3.Model.Uni_OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Author {

    @Id
    @GeneratedValue
    private int id;
    private String name;
}
