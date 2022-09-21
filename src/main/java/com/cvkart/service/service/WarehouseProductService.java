package com.cvkart.service.service;

import com.cvkart.service.entity.WarehouseProduct;
import com.cvkart.service.entity.WarehouseProductId;

import java.util.List;

public interface WarehouseProductService {


    public List<WarehouseProduct> getAllWarehouseProducts();
    public WarehouseProduct getWarehouseProduct(WarehouseProductId id);
    public void addWareHouseProduct(WarehouseProduct warehouseProduct);

}
