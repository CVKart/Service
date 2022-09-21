package com.cvkart.service.service;

import com.cvkart.service.entity.Warehouse;
import com.cvkart.service.repository.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class WarehouseServiceImpl implements WarehouseService{

    @Autowired
    private WarehouseRepo repo;

    @Override
    public List<Warehouse> getAllWareHouses() {
        return repo.findAll();
    }

    @Override
    public Warehouse getWareHouse(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public void addWarehouse(Warehouse warehouse) {
        repo.save(warehouse);
    }
}
