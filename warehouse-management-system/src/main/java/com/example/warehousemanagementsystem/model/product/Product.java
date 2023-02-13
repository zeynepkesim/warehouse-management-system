package com.example.warehousemanagementsystem.model.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_sku")
    private String productSku;

    @Column(name = "product_barcode")
    private String productBarcode;

    @Column(name = "product_type")
    private ProductType productType;

    @Column(name = "is_frozen", columnDefinition = "boolean default false")
    private boolean isFrozen = false;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "unit_type")
    private UnitType unitType;

    @Column(name = "product_stock")
    private int productStock;

}