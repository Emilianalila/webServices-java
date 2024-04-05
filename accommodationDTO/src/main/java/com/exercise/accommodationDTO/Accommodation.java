package com.exercise.accommodationDTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Accommodation {
    private int id_house;
    private String HouseType;
    private String address;
    private double meters;
    private double rentPrice;

    public Accommodation() {
    }

    public Accommodation(int id_house, String houseType, String address, double meters, double rentPrice) {
        this.id_house = id_house;
        HouseType = houseType;
        this.address = address;
        this.meters = meters;
        this.rentPrice = rentPrice;
    }
}
