package com.cvkart.service.repository;

import com.cvkart.service.entity.WarehouseProduct;
import com.cvkart.service.entity.WarehouseProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseProductRepo extends JpaRepository<WarehouseProduct, WarehouseProductId> {
}
