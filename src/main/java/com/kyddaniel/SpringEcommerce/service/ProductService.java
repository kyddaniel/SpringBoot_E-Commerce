package com.kyddaniel.SpringEcommerce.service;

import com.kyddaniel.SpringEcommerce.model.Product;
import com.kyddaniel.SpringEcommerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
