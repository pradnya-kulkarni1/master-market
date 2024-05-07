package com.mastersmarket.model;

import jakarta.persistence.*;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	
	public Customer() {
		super();
	}


	public Customer(int id, String username, String password, String firstname, String lastname, String phone,
			String email, String address, String city, String state, String zip) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}


	
	
	
}

/*
 * CREATE TABLE Customer (
	Id int PRIMARY KEY AUTO_INCREMENT,
	Username varchar(20) NOT NULL UNIQUE,
	Password varchar(10) NOT NULL,
	Firstname varchar(20) NOT NULL,
	Lastname varchar(20) NOT NULL,
	Phone varchar(12),
	Email varchar(75),
    address varchar(20),
    city varchar(20),
    state varchar(20),
    zip varchar(10)
 */
