package com.example.warehousemanagementsystem.service;

import com.example.warehousemanagementsystem.dao.DepotDao;
import com.example.warehousemanagementsystem.dto.DepotDto;
import com.example.warehousemanagementsystem.model.depot.Depot;
import com.example.warehousemanagementsystem.model.product.Product;
import com.example.warehousemanagementsystem.utilities.constants.Messages;
import com.example.warehousemanagementsystem.utilities.results.ErrorResult;
import com.example.warehousemanagementsystem.utilities.results.Result;
import com.example.warehousemanagementsystem.utilities.results.SuccessResult;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepotServiceImpl implements DepotService {

    private DepotDao depotDao;

    private ProductService productService;

    private ModelMapper modelMapper;

    @Autowired
    public DepotServiceImpl(DepotDao depotDao, ProductService productService, ModelMapper modelMapper) {
        this.depotDao = depotDao;
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @Override
    public Result addDepot(DepotDto depotDto) {
        Depot depot = modelMapper.map(depotDto, Depot.class);
        depotDao.save(depot);

        return new SuccessResult(Messages.DEPOT_ADDED);
    }

    @Override
    public Result addProductStock(DepotDto depotDto) {
        Depot depot = depotDao.getDepotByProduct_ProductId(depotDto.getProduct().getProductId());
        Product product = productService.getById(depotDto.getProduct().getProductId());

        if (depot.getDepotType() != null && depot.getDepotType().equals("MAIN_DEPOT")) {
            product.setProductStock(depotDto.getProduct().getProductStock());
            depotDao.save(depot);
            return new SuccessResult(Messages.PRODUCT_STOCK_ADDED);
        } else {
            return new ErrorResult(Messages.PRODUCT_STOCK_NOT_ADDED);
        }
    }

}