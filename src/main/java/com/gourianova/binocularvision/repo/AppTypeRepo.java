package com.gourianova.binocularvision.repo;


import com.gourianova.binocularvision.model.AppType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppTypeRepo extends JpaRepository<AppType,Integer> {

    void deleteAppTypeById(Integer id);

   Optional<AppType> findAppTypeById(Integer id);
}

