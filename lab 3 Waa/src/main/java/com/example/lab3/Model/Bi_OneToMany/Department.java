package com.example.lab3.Model.Bi_OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private int name;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees=new ArrayList<>();
}
