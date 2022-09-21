package com.cvkart.service.service;

import com.cvkart.service.entity.WarehouseProduct;
import com.cvkart.service.entity.WarehouseProductId;
import com.cvkart.service.repository.WarehouseProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class WarehouseProductServiceImpl implements WarehouseProductService{

    @Autowired
    private WarehouseProductRepo repo;

    @Override
    public List<WarehouseProduct> getAllWarehouseProducts() {
        return repo.findAll();
    }

    @Override
    public WarehouseProduct getWarehouseProduct(WarehouseProductId id) {
        return repo.findById(id).get();
    }

    @Override
    public void addWareHouseProduct(WarehouseProduct warehouseProduct) {
            repo.save(warehouseProduct);
    }
}
