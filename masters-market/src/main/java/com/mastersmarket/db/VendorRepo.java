package com.mastersmarket.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastersmarket.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer>{

}
