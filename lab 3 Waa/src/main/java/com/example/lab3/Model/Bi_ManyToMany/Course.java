package com.example.lab3.Model.Bi_ManyToMany;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;

    private String name;
@ManyToMany(mappedBy="courses")
    private ArrayList<Student> students=new ArrayList<>();
}
