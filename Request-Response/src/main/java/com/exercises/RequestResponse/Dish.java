package com.exercises.RequestResponse;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Dish {
    private int number;
    private String name;
    private double price;
    private String description;

    public Dish(int number, String name, double price, String description) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.description = description;
    }

  /*  @Override
    public String toString() {
        return "Dish{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }*/
}
