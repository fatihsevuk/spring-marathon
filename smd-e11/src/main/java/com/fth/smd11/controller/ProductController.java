package com.fth.smd11.controller;

import com.fth.smd11.entity.Product;
import com.fth.smd11.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public Iterable<Product> getAllProduct() {
        return productService.getAllProduct();
    }


    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @GetMapping("/product/{name}")
    public ResponseEntity<Product> getProductByName(@PathVariable String name) {
        var p = productService.getProductByName(name);
        return p.map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());
    }
}
