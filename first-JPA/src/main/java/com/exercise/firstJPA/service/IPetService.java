package com.exercise.firstJPA.service;

import com.exercise.firstJPA.model.Pet;

import java.util.List;

public interface IPetService {
    public List<Pet> getPets();

    public void savePet(Pet pet);

    public void deletePet(Long idPet);

    public Pet findPet(Long idPet);

    public void editPet(Long idPet, Long newId,
                        String newName,
                        String newSpecie,
                        String newRaza,
                        String newColor);
}
