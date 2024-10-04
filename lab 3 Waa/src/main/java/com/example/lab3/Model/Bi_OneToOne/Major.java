package com.example.lab3.Model.Bi_OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Major {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToOne
    private Students students;
}
