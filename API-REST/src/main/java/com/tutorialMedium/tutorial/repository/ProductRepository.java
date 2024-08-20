package com.tutorialMedium.tutorial.repository;

import com.tutorialMedium.tutorial.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * from product_inventory where product_name = ?1", nativeQuery = true)
    List<Product> getProductsByName(String productName);
}
