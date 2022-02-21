package com.gourianova.binocularvision.service;


import com.gourianova.binocularvision.exception.DeveloperNotFoundException;
import com.gourianova.binocularvision.model.Developer;
import com.gourianova.binocularvision.repo.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DeveloperService {
    private final DeveloperRepo developerRepo;
    @Autowired
    public  DeveloperService(DeveloperRepo developerRepo){
        this.developerRepo=developerRepo;
    }
    public Developer addDeveloper(Developer developer){
        developer.setId(UUID.randomUUID().hashCode());
        return developerRepo.save(developer);
    }
    public List<Developer> findAllDevelopers(){
        return developerRepo.findAll();
    }
    public Developer updateDeveloper(Developer developer){
        return developerRepo.save(developer);
    }
    public Developer findDeveloperById(Integer id){
        return developerRepo.findDeveloperById(id).
                orElseThrow(()-> new DeveloperNotFoundException("Developer by id" + id + "not found"));

    }

    public void deleteDeveloper(Integer id){
        developerRepo.deleteDeveloperById(id);
    }
}
