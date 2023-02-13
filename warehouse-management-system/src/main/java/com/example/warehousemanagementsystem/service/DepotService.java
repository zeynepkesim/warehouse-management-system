package com.example.warehousemanagementsystem.service;

import com.example.warehousemanagementsystem.dto.DepotDto;
import com.example.warehousemanagementsystem.utilities.results.Result;

public interface DepotService {

    Result addDepot(DepotDto depotDto);

    Result addProductStock(DepotDto depotDto);

}