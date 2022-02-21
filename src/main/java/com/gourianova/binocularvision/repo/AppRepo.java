package com.gourianova.binocularvision.repo;


import com.gourianova.binocularvision.model.App;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppRepo extends JpaRepository<App,Integer> {

    void deleteAppById(Integer id);

    Optional<App> findAppById(Integer id);
}

