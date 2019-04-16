package com.itlize.marketBackend.dao;

import com.itlize.marketBackend.model.Manufacturer;

public interface ManufacturerDAO {
	
	Manufacturer getManufacturer(int id);
	Manufacturer getManufacturer(String department);
//	List<Manufacturer> getAllManufacturers();
//	List<Sales> getSalesOfManufacturer();
//	boolean hasManufacture(String manufactureName);

}
