package com.example.warehousemanagementsystem.controller;

import com.example.warehousemanagementsystem.dto.CityDto;
import com.example.warehousemanagementsystem.service.CityService;
import com.example.warehousemanagementsystem.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin
public class CitiesController {

    private CityService cityService;

    @Autowired
    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/addcity")
    public Result addCity(@Valid CityDto cityDto) {
        return cityService.addCity(cityDto);
    }

}