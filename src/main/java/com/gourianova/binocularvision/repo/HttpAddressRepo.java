package com.gourianova.binocularvision.repo;


import com.gourianova.binocularvision.model.HttpAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HttpAddressRepo extends JpaRepository<HttpAddress,Integer> {

    void deleteHttpAddressById(Integer id);

    Optional<HttpAddress> findHttpAddressById(Integer id);
}

