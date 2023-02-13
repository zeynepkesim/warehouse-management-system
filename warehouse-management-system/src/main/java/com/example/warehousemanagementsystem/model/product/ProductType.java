package com.example.warehousemanagementsystem.model.product;

import lombok.Getter;

@Getter
public enum ProductType {

    FOOD("FOOD"),
    CLEANING_SUPPLIES("CLEANING_SUPPLIES"),
    COSMETICS("COSMETICS");

    private final String value;

    ProductType(String value) {
        this.value = value;
    }

}