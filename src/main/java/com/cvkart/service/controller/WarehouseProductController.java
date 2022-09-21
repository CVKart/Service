package com.cvkart.service.controller;


import com.cvkart.service.entity.WarehouseProduct;
import com.cvkart.service.service.WarehouseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/warehouseProduct")
public class WarehouseProductController {

    @Autowired
    private WarehouseProductService service;

    @GetMapping()
    public List<WarehouseProduct> getAllWarehouseProducts(){
        return service.getAllWarehouseProducts();

    }


    @PostMapping
    public void addWarehouseProduct(@RequestBody WarehouseProduct warehouseProduct){
        service.addWareHouseProduct(warehouseProduct);

    }

}
