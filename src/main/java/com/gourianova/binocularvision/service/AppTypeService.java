package com.gourianova.binocularvision.service;


import com.gourianova.binocularvision.exception.AppNotFoundException;
import com.gourianova.binocularvision.model.AppType;
import com.gourianova.binocularvision.repo.AppTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppTypeService {
    private final AppTypeRepo appTypeRepo;

    @Autowired
    public AppTypeService(AppTypeRepo appTypeRepo) {
        this.appTypeRepo = appTypeRepo;
    }

    public AppType addAppType(AppType appType) {
        return appTypeRepo.save(appType);
    }

    public List<AppType> findAllAppTypes() {
        return appTypeRepo.findAll();
    }

    public AppType updateAppType(AppType appType) {
        return appTypeRepo.save(appType);
    }

    public AppType findAppTypeById(Integer id) {
        return appTypeRepo.findAppTypeById(id).
                orElseThrow(() -> new AppNotFoundException("AppType by id" + id + "not found"));

    }

    public void deleteAppType(Integer id) {
        appTypeRepo.deleteAppTypeById(id);
    }
}
