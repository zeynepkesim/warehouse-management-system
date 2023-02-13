package com.example.warehousemanagementsystem.service;

import com.example.warehousemanagementsystem.dao.LocationDao;
import com.example.warehousemanagementsystem.dto.LocationDto;
import com.example.warehousemanagementsystem.model.depot.Location;
import com.example.warehousemanagementsystem.utilities.constants.Messages;
import com.example.warehousemanagementsystem.utilities.results.Result;
import com.example.warehousemanagementsystem.utilities.results.SuccessResult;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationDao locationDao;

    private ModelMapper modelMapper;

    @Autowired
    public LocationServiceImpl(LocationDao locationDao, ModelMapper modelMapper) {
        this.locationDao = locationDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Result addLocation(LocationDto locationDto) {
        Location location = modelMapper.map(locationDto, Location.class);
        locationDao.save(location);

        return new SuccessResult(Messages.LOCATION_ADDED);
    }

}