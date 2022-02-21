package com.gourianova.binocularvision.repo;


import com.gourianova.binocularvision.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeveloperRepo  extends JpaRepository<Developer,Integer> {

    void deleteDeveloperById(Integer id);

   Optional<Developer> findDeveloperById(Integer id);
}

