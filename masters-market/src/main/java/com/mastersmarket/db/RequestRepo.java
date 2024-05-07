package com.mastersmarket.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastersmarket.model.Request;

public interface RequestRepo extends JpaRepository<Request, Integer>{

}
