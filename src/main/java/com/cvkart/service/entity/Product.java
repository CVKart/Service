package com.cvkart.service.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {

    @Id
    private Integer productId;
    private String productName;
    private String productBrand;
    private Float productPrice;
    private Integer productQuantity;
    private String productCategory;
}
