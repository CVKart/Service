package com.cvkart.service.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuppressWarnings("unused")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer warehouseId;
    private String warehouseRegion;
    private String warehouseCity;
    private String warehouseCountry;
    private String warehouseZip;
    private Integer warehouseCapacity;

    @OneToMany(mappedBy = "warehouse")
    private Set<WarehouseProduct> warehouseProduct;


}
