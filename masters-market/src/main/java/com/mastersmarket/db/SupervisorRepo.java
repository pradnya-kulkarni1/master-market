package com.mastersmarket.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastersmarket.model.Supervisor;

public interface SupervisorRepo extends JpaRepository<Supervisor, Integer> {

}
