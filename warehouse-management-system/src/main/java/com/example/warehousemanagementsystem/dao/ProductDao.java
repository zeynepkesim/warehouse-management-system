package com.example.warehousemanagementsystem.dao;

import com.example.warehousemanagementsystem.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}