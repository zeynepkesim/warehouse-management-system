package com.example.warehousemanagementsystem.service;

import com.example.warehousemanagementsystem.dao.ProductDao;
import com.example.warehousemanagementsystem.dto.ProductDto;
import com.example.warehousemanagementsystem.model.product.Product;
import com.example.warehousemanagementsystem.utilities.constants.Messages;
import com.example.warehousemanagementsystem.utilities.results.Result;
import com.example.warehousemanagementsystem.utilities.results.SuccessResult;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    private ModelMapper modelMapper;

    @Autowired
    public ProductServiceImpl(ProductDao productDao, ModelMapper modelMapper) {
        this.productDao = productDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Result addProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        productDao.save(product);

        return new SuccessResult(Messages.PRODUCT_ADDED);
    }

    @Override
    public Product getById(int productId) {
        return productDao.getById(productId);
    }

}