package com.exercise.firstJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pet {// with this class I want ton generate a relation between a Person and Pet, so one person can have only but only one pet and I have to generate the relation in the class Person, Because who is interested in knowing, which one, is your pet?
    //JPA annotations: Entity, Id, GenerateValue
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPet;
    private String name;
    private String specie;
    private String raza;
    private String color;

    public Pet() {
    }

    public Pet(Long idPet, String name, String specie, String raza, String color) {
        this.idPet = idPet;
        this.name = name;
        this.specie = specie;
        this.raza = raza;
        this.color = color;
    }
}
