package com.gourianova.binocularvision.controller;


import com.gourianova.binocularvision.model.App;
import com.gourianova.binocularvision.service.AppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AppResource {
    private final AppService appService;


    public AppResource(AppService appService) {
        this.appService = appService;
    }
@GetMapping("all")
    public ResponseEntity<List<App>>getAllApps(){
        List<App> apps=appService.findAllApps();
        return new ResponseEntity<>(apps, HttpStatus.OK);
}

    @GetMapping("/find/{id}")
    public ResponseEntity<App>getAppById(@PathVariable("id")Integer id){
        App app=appService.findAppById(id);
        return new ResponseEntity<>(app, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<App> addApp(@RequestBody App app){
        App newApp=appService.addApp(app);
        return new ResponseEntity<>(newApp, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<App> updateApp(@RequestBody App app){
        App updateApp=appService.updateApp(app);
        return new ResponseEntity<>(updateApp, HttpStatus.OK);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> deleteApp(@PathVariable("id")Integer id){
        appService.deleteApp(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
