package com.cvkart.service.controller;

import com.cvkart.service.entity.Product;
import com.cvkart.service.entity.Warehouse;
import com.cvkart.service.service.ProductService;
import com.cvkart.service.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService service;

    @GetMapping
    public List<Warehouse> getAllWareHouses(){
        return service.getAllWareHouses();
    }
    @GetMapping("/{id}")
    public Warehouse getWareHouse(@PathVariable Integer id){
        return service.getWareHouse(id);

    }

    @PostMapping
    public void addWarehouse(@RequestBody Warehouse warehouse){
        service.addWarehouse(warehouse);
    }
}
