package com.gourianova.binocularvision.repo;


import com.gourianova.binocularvision.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OfferRepo extends JpaRepository<Offer,Integer> {

    void deleteOfferById(Integer id);

    Optional<Offer> findOfferById(Integer id);
}

