package com.example.warehousemanagementsystem.controller;

import com.example.warehousemanagementsystem.dto.DepotDto;
import com.example.warehousemanagementsystem.service.DepotService;
import com.example.warehousemanagementsystem.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/depots")
@CrossOrigin
public class DepotsController {

    private DepotService depotService;

    @Autowired
    public DepotsController(DepotService depotService) {
        this.depotService = depotService;
    }

    @PostMapping("/adddepot")
    public Result addDepot(@Valid DepotDto depotDto) {
        return depotService.addDepot(depotDto);
    }

    @PostMapping("/addproductstock")
    public Result addProductStock(@Valid DepotDto depotDto) {
        return depotService.addProductStock(depotDto);
    }

}