package com.gourianova.binocularvision.repo;


import com.gourianova.binocularvision.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

    void deleteUserById(Integer id);

   Optional<User> findUserById(Integer id);
    Optional<User> findUserByLogin(String login);
}

