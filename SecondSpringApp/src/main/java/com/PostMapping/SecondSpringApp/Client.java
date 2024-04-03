package com.PostMapping.SecondSpringApp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {//now I have a client class, so I can create molds of clients
    private long id;
    private String name;
    private String lastName;

    //constructor
    public Client(long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
}
