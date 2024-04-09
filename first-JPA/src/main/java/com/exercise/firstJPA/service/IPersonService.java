package com.exercise.firstJPA.service;

import com.exercise.firstJPA.model.Person;

import java.util.List;

public interface IPersonService {
    //here we create all the operation that we want to offer as a service to the controller layer

    //get method for get all the persons form the dataBase
    public List<Person> getPeople();
    //Post
    public void savePerson(Person person);

    //Delete
    public void deletePerson(Long id);

    //get
    public Person findPerson(Long id);

    //update
    public void editPerson(Long id, Long newId, String newName, String newLastName,
                           Integer newAge);

}
