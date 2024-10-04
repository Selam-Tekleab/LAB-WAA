package com.example.lab3.Model.Bi_ManyToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;

    @ManyToMany
    private ArrayList<Course> courses=new ArrayList<>();
}
