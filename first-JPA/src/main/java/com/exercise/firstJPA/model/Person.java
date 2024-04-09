package com.exercise.firstJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity// with this annotation we are saying that this class is going to be or transform to a table in my database
public class Person {
    //fields
    @Id//primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE)// generate a sequence number automatic
    private Long id;
    private String name;
    private String lastName;
    private Integer age;

    // constructors
    public Person() {
    }
    public Person(Long id, String name, String lastName, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
