package com.cvkart.service.service;

import com.cvkart.service.entity.Product;

import java.util.List;

public interface ProductService {


    public List<Product> getAllProducts();

    public Product getProduct(Integer id);

    public void addProduct(Product product);
}
