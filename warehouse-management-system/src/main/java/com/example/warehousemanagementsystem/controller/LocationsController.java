package com.example.warehousemanagementsystem.controller;

import com.example.warehousemanagementsystem.dto.LocationDto;
import com.example.warehousemanagementsystem.service.LocationService;
import com.example.warehousemanagementsystem.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/locations")
@CrossOrigin
public class LocationsController {

    private LocationService locationService;

    @Autowired
    public LocationsController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/addlocation")
    public Result addLocation(@Valid LocationDto locationDto) {
        return locationService.addLocation(locationDto);
    }

}