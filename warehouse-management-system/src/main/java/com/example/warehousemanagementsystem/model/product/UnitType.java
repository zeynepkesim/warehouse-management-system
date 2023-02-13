package com.example.warehousemanagementsystem.model.product;

import lombok.Getter;

@Getter
public enum UnitType {

    BOX("BOX"),
    PIECE("PIECE");

    private final String value;

    UnitType(String value) {
        this.value = value;
    }

}