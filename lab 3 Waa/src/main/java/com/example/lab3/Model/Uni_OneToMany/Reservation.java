package com.example.lab3.Model.Uni_OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue
    private int Id;
    private String DateTime;
    private String details;

}
