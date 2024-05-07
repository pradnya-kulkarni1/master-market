package com.mastersmarket.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastersmarket.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
