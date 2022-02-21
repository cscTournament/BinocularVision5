package com.gourianova.binocularvision.service;


import com.gourianova.binocularvision.exception.AppNotFoundException;
import com.gourianova.binocularvision.model.App;
import com.gourianova.binocularvision.repo.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    private final AppRepo appRepo;

    @Autowired
    public AppService(AppRepo appRepo) {
        this.appRepo = appRepo;
    }

    public App addApp(App app) {
        return appRepo.save(app);
    }

    public List<App> findAllApps() {
        return appRepo.findAll();
    }

    public App updateApp(App app) {
        return appRepo.save(app);
    }

    public App findAppById(Integer id) {
        return appRepo.findAppById(id).
                orElseThrow(() -> new AppNotFoundException("App by id" + id + "not found"));

    }

    public void deleteApp(Integer id) {
        appRepo.deleteAppById(id);
    }
}
