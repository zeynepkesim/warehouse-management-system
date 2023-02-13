package com.example.warehousemanagementsystem.dto;

import com.example.warehousemanagementsystem.model.product.ProductType;
import com.example.warehousemanagementsystem.model.product.UnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private int productId;
    private String productName;
    private String productSku;
    private String productBarcode;
    private ProductType productType;
    private boolean isFrozen;
    private Double productPrice;
    private UnitType unitType;
    private int productStock;

}