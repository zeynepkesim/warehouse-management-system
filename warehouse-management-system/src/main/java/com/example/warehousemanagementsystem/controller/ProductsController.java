package com.example.warehousemanagementsystem.controller;

import com.example.warehousemanagementsystem.dto.ProductDto;
import com.example.warehousemanagementsystem.service.ProductService;
import com.example.warehousemanagementsystem.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/addproduct")
    public Result addProduct(@Valid ProductDto productDto) {
        return productService.addProduct(productDto);
    }

}