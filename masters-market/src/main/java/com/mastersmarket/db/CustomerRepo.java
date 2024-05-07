package com.mastersmarket.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastersmarket.model.Customer;

public interface CustomerRepo  extends JpaRepository<Customer, Integer>{

}
