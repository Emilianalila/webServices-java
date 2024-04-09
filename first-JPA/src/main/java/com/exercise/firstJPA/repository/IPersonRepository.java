package com.exercise.firstJPA.repository;
import com.exercise.firstJPA.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository// if we use jpa we have to mark this interface as the @repository
public interface IPersonRepository extends JpaRepository<Person, Long> {// extends from a special "Jpa class" (parameters: the class that we want to map or transform to a table:Person, id "type" of the class that we are mapping: Long)

}
