package com.example.warehousemanagementsystem.service;

import com.example.warehousemanagementsystem.dto.ProductDto;
import com.example.warehousemanagementsystem.model.product.Product;
import com.example.warehousemanagementsystem.utilities.results.Result;

public interface ProductService {

    Result addProduct(ProductDto productDto);

    Product getById(int productId);

}