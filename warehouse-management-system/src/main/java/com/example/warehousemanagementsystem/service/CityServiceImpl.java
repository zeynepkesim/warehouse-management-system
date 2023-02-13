package com.example.warehousemanagementsystem.service;

import com.example.warehousemanagementsystem.dao.CityDao;
import com.example.warehousemanagementsystem.dto.CityDto;
import com.example.warehousemanagementsystem.model.depot.City;
import com.example.warehousemanagementsystem.utilities.constants.Messages;
import com.example.warehousemanagementsystem.utilities.results.Result;
import com.example.warehousemanagementsystem.utilities.results.SuccessResult;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    private CityDao cityDao;

    private ModelMapper modelMapper;

    @Autowired
    public CityServiceImpl(CityDao cityDao, ModelMapper modelMapper) {
        this.cityDao = cityDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Result addCity(CityDto cityDto) {
        City city = modelMapper.map(cityDto, City.class);
        cityDao.save(city);

        return new SuccessResult(Messages.CITY_ADDED);
    }

}