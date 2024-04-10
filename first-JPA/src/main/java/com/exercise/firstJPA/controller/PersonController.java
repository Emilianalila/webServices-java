package com.exercise.firstJPA.controller;

import com.exercise.firstJPA.model.Person;
import com.exercise.firstJPA.repository.IPersonRepository;
import com.exercise.firstJPA.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    //dependency injection from service
     @Autowired
    private IPersonService interPerson;

     //endpoints for CRUD operations
     @GetMapping("/listPeople")
     public List<Person> getAllPersons(){
         return interPerson.getPeople();
     }
     //post is always void
     @PostMapping("/createPerson")
    public String createPerson(@RequestBody Person person){
          interPerson.savePerson(person);
          return "The person was create successfully!";
     }
     //delete
    @DeleteMapping ("/deletePerson")
    public String deletePerson(@RequestParam Long id){
         interPerson.deletePerson(id);
        return "The person was delete!";
    }
    //update
    @PutMapping("/updatePerson/{id}")
    public Person updatePerson(@PathVariable Long id,
                               @RequestParam(required = false, name="id") Long newId,// we use RequestParam for codify the information
                               @RequestParam(required = false, name="name") String newName,
                               @RequestParam(required = false, name="lastName")String newLastName,
                               @RequestParam(required = false, name="age") Integer newAge){
         //send the original id (for find)
        //send new data for modification to the service, particularly a PersonService (editPerson)
         interPerson.editPerson(id,newId,newName, newLastName, newAge);
         // find the person updated and show it on the response
         Person perso = interPerson.findPerson(id);
         return perso;
    }
    @PutMapping("/edit") //c)
    public Person updatePerson(@RequestBody Person per){// when I send the info in JSON the id it has to be one that have already in our database
        interPerson.editPer(per);
        return interPerson.findPerson(per.getId());
    }
}

// when I use Postman I need to put age always, otherwise it will be null and can't update