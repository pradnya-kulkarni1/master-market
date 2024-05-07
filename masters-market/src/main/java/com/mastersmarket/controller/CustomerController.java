package com.mastersmarket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.mastersmarket.db.CustomerRepo;
import com.mastersmarket.model.Customer;

@CrossOrigin
@RestController
@RequestMapping("api/customers")
public class CustomerController {
	
	@Autowired
	
	private CustomerRepo customerRepo;
	
	@GetMapping("/")
	public List<Customer> getAllCustomers()
	{
		return customerRepo.findAll();
	}

	@GetMapping("/{id}")
	public Customer getAllCustomerById(@PathVariable int id) {
		Optional<Customer> c = customerRepo.findById(id);
		
		if(c.isPresent()) {
			return c.get();
		} else {
			System.err.println("Customer ["+id+"] dooes not exist");
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer not found: id["+id+"]");
			
		}
	}
}
