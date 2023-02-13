package com.example.warehousemanagementsystem.model.depot;

import lombok.Getter;

@Getter
public enum Status {

    OPEN("OPEN"),
    CLOSED("CLOSED");

    private final String value;

    Status(String value) {
        this.value = value;
    }

}