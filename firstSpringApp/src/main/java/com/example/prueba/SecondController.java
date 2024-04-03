package com.example.prueba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    //using @PathVariable
    @GetMapping("/2/{num1}/{num2}")
    public String addTwoNumbers(@PathVariable int num1, @PathVariable int num2){
        return  "The sum is: " + (num1 + num2);
    }
    //using @RequestParam
    @GetMapping("/3")
    public String getStatusWeight(@RequestParam int IMC){
        String statusWeight="";
        if (IMC > 1 & IMC <= 18.5){
            statusWeight = "insufficient weight";
        } else if (IMC > 18.6 & IMC <= 24.9) {
            statusWeight= "normal weight";
        }else{
            statusWeight = "Obesity";
        }
        return "Status Weight: " + statusWeight;
    }
}
