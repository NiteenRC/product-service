package com.nc.controller;

import com.nc.model.Product;
import com.nc.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    private final IProductService iProductService;

    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Product productObj) {
        Product product = iProductService.save(productObj);
        LOG.info("product {}", product);
        return ResponseEntity.ok(product);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Product> products = iProductService.findAll();
        LOG.info("products {}", products);
        return ResponseEntity.ok(products);
    }
}
