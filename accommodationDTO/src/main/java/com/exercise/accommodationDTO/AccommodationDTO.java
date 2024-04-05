package com.exercise.accommodationDTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter @Getter
public class AccommodationDTO implements Serializable {
    //accommodation
    private int id_house;
    private String houseType;
    private String address;
    private double rentPrice;
    //tenant
    private String name;
    private String lastName;

    public AccommodationDTO() {
    }

    public AccommodationDTO(int id_house, String houseType, String address, double rentPrice, String name, String lastName) {
        this.id_house = id_house;
        this.houseType = houseType;
        this.address = address;
        this.rentPrice = rentPrice;
        this.name = name;
        this.lastName = lastName;
    }
}
