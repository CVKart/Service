package com.cvkart.service.service;

import com.cvkart.service.entity.Product;
import com.cvkart.service.entity.Warehouse;

import java.util.List;

public interface WarehouseService {


    public List<Warehouse> getAllWareHouses();

    public Warehouse getWareHouse(Integer id);

    public void addWarehouse(Warehouse warehouse);
}
