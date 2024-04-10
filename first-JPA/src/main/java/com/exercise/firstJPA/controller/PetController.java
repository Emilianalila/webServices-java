package com.exercise.firstJPA.controller;

import com.exercise.firstJPA.model.Person;
import com.exercise.firstJPA.model.Pet;
import com.exercise.firstJPA.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {
     @Autowired
    private IPetService petSer;

     @GetMapping("/petList")
    public List<Pet> getAllPets(){
         return petSer.getPets();
     }
     @PostMapping("/savePet")
    public String createPet(@RequestBody Pet onePet){
         petSer.savePet(onePet);
         return "Create Pet successful!";
     }
     @DeleteMapping("/deletePet")
    public String deletePet(@RequestBody Long id){
         petSer.deletePet(id);
         return "The delete of the pet was successful!";
     }
     @PutMapping("/editPet")
    public Pet editPet(@PathVariable Long id,
                       @RequestParam(required = false, name="id") Long newId,// we use RequestParam for codify or encode the information of the user
                       @RequestParam(required = false, name="name") String newName,
                       @RequestParam(required = false, name="specie")String newSpecie,
                       @RequestParam(required = false, name="raza") String newRaza,
                       @RequestParam(required = false, name = "color")String newColor){
         //send the original id (for find)
         //send new data for modification
         petSer.editPet(id,newId,newName, newSpecie, newRaza, newColor);
         // find the person updated and show it on the response
         return petSer.findPet(id);
     }

}
