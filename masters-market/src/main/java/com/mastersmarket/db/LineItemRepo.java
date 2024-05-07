package com.mastersmarket.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastersmarket.model.LineItem;

public interface LineItemRepo extends JpaRepository<LineItem, Integer>{

}
