package com.fth.service;


import org.springframework.stereotype.Component;

@Component
public class ProductService {

    private final PurchaseService purchaseService;

    public ProductService(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }
}
