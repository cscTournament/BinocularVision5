package com.gourianova.binocularvision.service;


import com.gourianova.binocularvision.exception.OfferNotFoundException;
import com.gourianova.binocularvision.model.Offer;
import com.gourianova.binocularvision.repo.OfferRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {
    private final OfferRepo offerRepo;

    @Autowired
    public OfferService(OfferRepo offerRepo) {
        this.offerRepo = offerRepo;
    }

    public Offer addOffer(Offer offer) {
        return offerRepo.save(offer);
    }

    public List<Offer> findAllOffers() {
        return offerRepo.findAll();
    }

    public Offer updateOffer(Offer offer) {
        return offerRepo.save(offer);
    }

    public Offer findOfferById(Integer id) {
        return offerRepo.findOfferById(id).
                orElseThrow(() -> new OfferNotFoundException("Offer by id" + id + "not found"));

    }

    public void deleteOffer(Integer id) {
        offerRepo.deleteOfferById(id);
    }
}
