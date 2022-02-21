package com.gourianova.binocularvision.repo;


import com.gourianova.binocularvision.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role,Integer> {

    void deleteRoleById(Integer id);

   Optional<Role> findRoleById(Integer id);
}

