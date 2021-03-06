package com.itlize.marketBackend.service;

import java.util.List;
import java.util.Map;

import com.itlize.marketBackend.domain.Manufacturer;
import com.itlize.marketBackend.domain.Product;
import com.itlize.marketBackend.domain.Sales;

public interface ProductService {

	List<Product> getAllSubCateProducts(int subCategoryID);

	Product getProduct(int ProductID);

	List<Product> filter(Map<String, Object> filterParams, int subCategotyId);

	List<Product> compare(List<Product> productIds); // Fronted creates Map

	Product createProduct(Product product);
	
	Manufacturer getManufacturer(int id);
	
	Sales getSale(int id);

}
