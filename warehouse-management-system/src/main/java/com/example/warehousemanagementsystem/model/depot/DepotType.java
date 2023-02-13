package com.example.warehousemanagementsystem.model.depot;

import lombok.Getter;

@Getter
public enum DepotType {

    MAIN_DEPOT("MAIN_DEPOT"),
    DISTRIBUTION_CENTER("DISTRIBUTION_CENTER");

    private final String value;

    DepotType(String value) {
        this.value = value;
    }

}