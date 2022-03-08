package com.gourianova.binocularvision.service;


import com.gourianova.binocularvision.exception.HttpAddressNotFoundException;
import com.gourianova.binocularvision.model.HttpAddress;
import com.gourianova.binocularvision.repo.HttpAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HttpAddressService {
    private final HttpAddressRepo httpAddressRepo;

    @Autowired
    public HttpAddressService(HttpAddressRepo httpAddressRepo) {
        this.httpAddressRepo = httpAddressRepo;
    }

    public HttpAddress addHttpAddress(HttpAddress httpAddress) {
        return httpAddressRepo.save(httpAddress);
    }
//TODO: s->es?
    public List<HttpAddress> findAllHttpAddresses() {
        return httpAddressRepo.findAll();
    }

    public HttpAddress updateOrder(HttpAddress httpAddress) {
        return httpAddressRepo.save(httpAddress);
    }

    public HttpAddress findHttpAddressById(Integer id) {
        return httpAddressRepo.findHttpAddressById(id).
                orElseThrow(() -> new HttpAddressNotFoundException("HttpAddress by id" + id + "not found"));

    }

    public void deleteHttpAddress(Integer id) {
        httpAddressRepo.deleteHttpAddressById(id);
    }
}
