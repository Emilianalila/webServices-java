package com.exercise.firstJPA.service;
import com.exercise.firstJPA.model.Person;
import com.exercise.firstJPA.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
//Since IPersonRepository will be the interface in charge of providing the data from the database,
// we have to "instantiate" an object (repo) which will allow us to use exclusive JPA "methods",
// for example: (.findAll, .deleteById()) brings us all the people from the database and "injects" them into this service class.
@Service
public class PersonService implements IPersonService {
    //dependency injection from repository
    @Autowired
    private IPersonRepository repo;
    /*public PersonService (IPersonRepository repo){ //  dependency injection using a constructor
        this.repo = repo;
    }*/

    @Override
    public List<Person> getPeople() {
        List <Person> listPerson = repo.findAll();
        return listPerson;
    }
    @Override
    public void savePerson(Person person) {
        repo.save(person);  // we create person in IPersonService, when we create the method and passing the parameter Person person
    }

    @Override
    public void deletePerson(Long id) {
     repo.deleteById(id);
    }

    @Override
    public Person findPerson(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void editPerson(Long id, Long newId, String newName, String newLastName, Integer newAge) {
        // find the original object using one of the method that I already have in "this" class,
        Person perso = this.findPerson(id);
        //logic modification, I set the new data to the object that I found.
        perso.setId(newId);// usually this is not the best practice, because the id it has to be the same, always . but here we are practicing just in case the id is entered manually and can have errors
        perso.setName(newName);
        perso.setLastName(newLastName);
        perso.setAge(newAge);
        //save the changes or override the changes in the database.
        this.savePerson(perso);
    }

    @Override
    public void editPer(Person per) {
        this.savePerson(per);//save also modify not only save
    }
}
