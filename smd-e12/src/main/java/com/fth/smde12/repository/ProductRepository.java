package com.fth.smde12.repository;

import com.fth.smde12.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("SELECT p FROM Product p WHERE p.name = :name") //JPQL
    Optional<Product> findProductByName(String name);
}
