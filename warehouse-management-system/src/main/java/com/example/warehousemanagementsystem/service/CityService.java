package com.example.warehousemanagementsystem.service;

import com.example.warehousemanagementsystem.dto.CityDto;
import com.example.warehousemanagementsystem.utilities.results.Result;

public interface CityService {

    Result addCity(CityDto cityDto);

}