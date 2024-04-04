package com.exercises.RequestResponse.controller;

import com.exercises.RequestResponse.Dish;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController // never forget this annotation, otherwise spring boot don't know how is the controller!!
public class Controller_Restaurant {
    //first endpoint
    @GetMapping("/dish/{id}") // Request
    @ResponseBody        // Response
    public Dish getFirstDish(@PathVariable int id) {
        // creating new dish objects
        ArrayList<Dish> arrayList = new ArrayList<Dish>();
        Dish firstDish = new Dish(1, "Mashed potato", 45.99, "Mashed potato with meat");
        Dish secondDish = new Dish(2, "Chicken soup", 25.99, "Mashed potato with meat");
        Dish thirdDish = new Dish(3, "Greek salad", 40.99, "Mashed potato with meat");
        Dish fourthDish = new Dish(4, "Roasted potato", 34.99, "Mashed potato with meat");
        Dish fifthDish = new Dish(5, "Roasted potato", 34.99, "Mashed potato with meat");
        arrayList.add(firstDish);
        arrayList.add(secondDish);
        arrayList.add(thirdDish);
        arrayList.add(fourthDish);
        arrayList.add(fifthDish);

        // depend on the id parameter that the client give us, we are going to return only one dish
        for (Dish currentDish : arrayList) {
            if (currentDish.getNumber() == id) {
                return currentDish;
            }
        }
        // if doesn't found the id, it will return null
        return null;
    }
}



/* another option

        Dish response;
        if (id == 1) {
            response = firstDish;
        } else if (id == 2) {
            response = secondDish;
        } else if (id == 3) {
            response = thirdDish;
        } else if (id == 4) {
            response = fourthDish;
        } else {  //If the id doesn't match any of id values, I must return something anyway. That's why the else always returns the same dish
            response = fifthDish;
        }
        return response;*/