package com.gourianova.binocularvision.controller;


import com.gourianova.binocularvision.model.AppType;
import com.gourianova.binocularvision.service.AppTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appType")
public class AppTypeResource {
    private final AppTypeService appTypeService;


    public AppTypeResource(AppTypeService appTypeService) {
        this.appTypeService = appTypeService;
    }
@GetMapping("all")
    public ResponseEntity<List<AppType>>getAllAppTypes(){
        List<AppType> appTypes=appTypeService.findAllAppTypes();
        return new ResponseEntity<>(appTypes, HttpStatus.OK);
}

    @GetMapping("/find/{id}")
    public ResponseEntity<AppType>getAppTypeById(@PathVariable("id")Integer id){
        AppType appType=appTypeService.findAppTypeById(id);
        return new ResponseEntity<>(appType, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<AppType> addAppType(@RequestBody AppType appType){
        AppType newAppType=appTypeService.addAppType(appType);
        return new ResponseEntity<>(newAppType, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<AppType> updateAppType(@RequestBody AppType appType){
        AppType updateAppType=appTypeService.updateAppType(appType);
        return new ResponseEntity<>(updateAppType, HttpStatus.OK);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> deleteAppType(@PathVariable("id")Integer id){
        appTypeService.deleteAppType(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
