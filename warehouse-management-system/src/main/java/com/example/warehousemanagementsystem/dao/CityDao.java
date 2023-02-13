package com.example.warehousemanagementsystem.dao;

import com.example.warehousemanagementsystem.model.depot.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends JpaRepository<City, Integer> {

}