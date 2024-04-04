package com.exercises.RequestResponse2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Patient {
    private int id;
    private long personalNumber;
    private String name;
    private String lastName;
    private String BirthDay;

    public Patient(int id, long personalNumber, String name, String lastName, String birthDay) {
        this.id = id;
        this.personalNumber = personalNumber;
        this.name = name;
        this.lastName = lastName;
        BirthDay = birthDay;
    }
}
