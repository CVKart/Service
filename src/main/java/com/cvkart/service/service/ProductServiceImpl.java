package com.cvkart.service.service;

import com.cvkart.service.entity.Product;
import com.cvkart.service.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class ProductServiceImpl implements  ProductService{

    @Autowired
    private ProductRepo repo;
    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public Product getProduct(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public void addProduct(Product product) {
            repo.save(product);
    }
}
