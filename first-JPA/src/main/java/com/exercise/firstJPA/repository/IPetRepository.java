package com.exercise.firstJPA.repository;

import com.exercise.firstJPA.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository extends JpaRepository<Pet,Long> {
}
