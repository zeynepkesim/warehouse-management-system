package com.example.warehousemanagementsystem.dto;

import com.example.warehousemanagementsystem.model.depot.City;
import com.example.warehousemanagementsystem.model.depot.DepotType;
import com.example.warehousemanagementsystem.model.depot.Location;
import com.example.warehousemanagementsystem.model.depot.Status;
import com.example.warehousemanagementsystem.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepotDto {

    private int depotId;
    private String depotName;
    private DepotType depotType;
    private City city;
    private Location location;
    private Status status;
    private String costCenter;
    private Product product;

}