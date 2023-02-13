package com.example.warehousemanagementsystem.dao;

import com.example.warehousemanagementsystem.model.depot.Depot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepotDao extends JpaRepository<Depot, Integer> {

    Depot getDepotByProduct_ProductId(int productId);

}