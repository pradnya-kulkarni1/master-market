package com.mastersmarket.model;

import jakarta.persistence.*;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "VendorId")
	public Vendor vendor;
	private String PartNumber;
	private String name;
	private float price;
	private String unit;
	private String photoPath;
	
	public Product() {
		super();
	}

	public Product(int id, Vendor vendor, String partNumber, String name, float price, String unit, String photoPath) {
		super();
		this.id = id;
		this.vendor = vendor;
		PartNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public String getPartNumber() {
		return PartNumber;
	}

	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", vendor=" + vendor + ", PartNumber=" + PartNumber + ", name=" + name + ", price="
				+ price + ", unit=" + unit + ", photoPath=" + photoPath + "]";
	}
	
	
	
}

/*CREATE TABLE Product (
Id int PRIMARY KEY AUTO_INCREMENT,
VendorId int NOT NULL,
PartNumber varchar(50) NOT NULL,
Name varchar(150) NOT NULL,
Price decimal(10,2) NOT NULL,
Unit varchar(255) NOT NULL,
PhotoPath varchar(255),
CONSTRAINT UQ_Vendor_PartNum UNIQUE (VendorId, PartNumber),
FOREIGN KEY (VendorId) REFERENCES Vendor(Id)
);
*/