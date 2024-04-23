package com.exercise.firstJPA.model;

import jakarta.persistence.*;
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

    // How is a one-to-one relationship established? by associating an "object" of the class (Pet) I want to associate with"
    @OneToOne
    @JoinColumn(name = "one_pet_id_pet", referencedColumnName = "idPet") //b)
    private Pet onePet; //In this way I am going to add in my database, a new column in the person table, which will represent the FK(foreign key)

    //Now I want to register or create a pet and I want to be able to associate it with a particular person, steps to follow:
     // create a new interface IPetRepository
    //  create a new IPetService
    // create a new class PetService

    public Person() {
    }

    public Person(Long id, String name, String lastName, Integer age, Pet onePet) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.onePet = onePet;  //a) recreate the constructor to visualize the last field that I create onePet
    }
}
