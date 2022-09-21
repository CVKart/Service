package com.cvkart.service.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
    private String productName;
    private String productBrand;
    private Float productPrice;
    private Integer productQuantity;
    private String productCategory;
    @OneToMany(mappedBy = "product")
    private Set<WarehouseProduct> warehouseProduct;
}
