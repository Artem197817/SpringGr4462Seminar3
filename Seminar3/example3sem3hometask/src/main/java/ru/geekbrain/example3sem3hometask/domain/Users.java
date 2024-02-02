package ru.geekbrain.example3sem3hometask.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue
    int id;
    private String name;
    private int age;
    private String email;


}

