package com.cvkart.service.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class WarehouseProductId implements Serializable {

    Integer warehouseId;
    Integer productId;
}
