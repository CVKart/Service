package com.cvkart.service.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class WarehouseProductId implements Serializable {

    @Column(name = "warehouse_id")
    Integer warehouseId;
    @Column(name = "product_id")
    Integer productId;
}
