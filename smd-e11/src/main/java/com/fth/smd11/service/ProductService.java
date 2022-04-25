package com.fth.smd11.service;


import com.fth.smd11.entity.Product;
import com.fth.smd11.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Iterable<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public Optional<Product> getProductByName(String name) {
        return productRepository.getProductByName(name);
    }
}
