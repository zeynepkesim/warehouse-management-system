package com.example.warehousemanagementsystem.dao;

import com.example.warehousemanagementsystem.model.depot.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDao extends JpaRepository<Location, Integer> {

}