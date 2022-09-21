package com.cvkart.service.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class WarehouseProduct {

    @EmbeddedId
    private WarehouseProductId id;
    private Integer warehouseProductQuantity;
    @ManyToOne
    @JoinColumn(referencedColumnName = "warehouseId")
    private Warehouse warehouse;
    @ManyToOne
    @JoinColumn(referencedColumnName = "productId")
    private Product product;
}
