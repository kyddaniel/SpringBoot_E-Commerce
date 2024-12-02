package com.kyddaniel.SpringEcommerce.repo;

import com.kyddaniel.SpringEcommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
