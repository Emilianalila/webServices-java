package com.exercise.accommodationDTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Tenant {
    private int id_Tenant;
    private int personalNumber;
    private String name;
    private String lastName;
    private String profession;

    public Tenant() {
    }

    public Tenant(int id_Tenant, int personalNumber, String name, String lastName, String profession) {
        this.id_Tenant = id_Tenant;
        this.personalNumber = personalNumber;
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
    }
}
