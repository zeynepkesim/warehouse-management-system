package com.example.warehousemanagementsystem.service;

import com.example.warehousemanagementsystem.dto.LocationDto;
import com.example.warehousemanagementsystem.utilities.results.Result;

public interface LocationService {

    Result addLocation(LocationDto locationDto);

}