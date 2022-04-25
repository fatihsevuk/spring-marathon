package com.fth.smd11.repository;

import com.fth.smd11.entity.Product;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product,Integer> {

    @Query("SELECT * FROM product WHERE name = :name")
    Optional<Product> getProductByName(String name);
}
