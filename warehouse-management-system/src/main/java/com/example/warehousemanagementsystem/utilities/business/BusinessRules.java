package com.example.warehousemanagementsystem.utilities.business;

import com.example.warehousemanagementsystem.utilities.results.Result;
import lombok.var;

public class BusinessRules {

    public static Result run(Result... logics) {
        for (var logic : logics) {
            if (!logic.isSuccess()) {
                return logic;
            }
        }
        return null;
    }

}