package com.example.prueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GallonsToLiters {

    @GetMapping("/from/{gallons}")
    public String toLiters(@PathVariable int gallons){
        return " Equals to numbers of liters: "+ (gallons * 3.78541);
    }
}
