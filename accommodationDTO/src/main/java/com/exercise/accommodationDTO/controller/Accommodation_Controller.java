package com.exercise.accommodationDTO.controller;
import com.exercise.accommodationDTO.models.Accommodation;
import com.exercise.accommodationDTO.dtos.AccommodationDTO;
import com.exercise.accommodationDTO.models.Tenant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Accommodation_Controller {
    @GetMapping("/house/{id}")
    public AccommodationDTO sendAccommodationMix(@PathVariable int id){
        //simulate the data. from the data base
        Accommodation house1 = new Accommodation(100, "house", "Lidnersgatan 3", 45.9, 5000);
        Tenant renter1 = new Tenant(1, 5693, "Emiliana", "Escobar", "Developer");
        // DTO class
        AccommodationDTO mixDto = new AccommodationDTO();
        mixDto.setId_house(house1.getId_house());// setting the values to the first house1 and renter1, this is temporary, otherwise it will point to the data base
        mixDto.setHouseType(house1.getHouseType());
        mixDto.setAddress(house1.getAddress());
        mixDto.setRentPrice(house1.getRentPrice());
        mixDto.setName(renter1.getName());
        mixDto.setLastName(renter1.getLastName());
        return mixDto;
    }
}
