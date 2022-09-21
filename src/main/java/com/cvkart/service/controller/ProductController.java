package com.cvkart.service.controller;

import com.cvkart.service.entity.Product;
import com.cvkart.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
    @GetMapping("/{id}")
    public Product getAllProducts(@PathVariable Integer id){
        return service.getProduct(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

}
