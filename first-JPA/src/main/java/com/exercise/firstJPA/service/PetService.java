package com.exercise.firstJPA.service;
import com.exercise.firstJPA.model.Pet;
import com.exercise.firstJPA.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PetService implements IPetService{
    //dependency injection from Repository, because there we have all the classes
    @Autowired
    private IPetRepository repoPet;  // allow us to use "special methods" from the class JpaRepository<Pet, Long>, and inject data from the database

    //methods to override or implements
    @Override
    public List<Pet> getPets() {
        List<Pet> allPets = repoPet.findAll();
       return  allPets;
    }

    @Override
    public void savePet(Pet pet) {
        repoPet.save(pet);
    }

    @Override
    public void deletePet(Long idPet) {
        repoPet.deleteById(idPet);
    }

    @Override
    public Pet findPet(Long idPet) {
        return repoPet.findById(idPet).orElse(null);
    }

    @Override
    public void editPet(Long idPet, Long newId, String newName, String newSpecie, String newRaza, String newColor) {
        Pet petFound = this.findPet(idPet);
        petFound.setIdPet(newId);
        petFound.setName(newName);
        petFound.setSpecie(newSpecie);
        petFound.setRaza(newRaza);
        petFound.setColor(newColor);

        repoPet.save(petFound);
    }
}









