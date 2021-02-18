package com.nc.service;

import com.nc.model.Product;

import java.util.List;

public interface IProductService {
    Product save(Product product);

    List<Product> findAll();
}
