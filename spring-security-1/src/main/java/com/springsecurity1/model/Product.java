package com.springsecurity1.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    int productId;
    String name;
    int qty;
    int price;
}
