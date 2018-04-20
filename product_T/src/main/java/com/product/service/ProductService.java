package com.product.service;

import java.util.List;
import java.util.Map;

import com.product.model.Product;


public interface ProductService {

	public void addAllProduct(List<Product> list);
	public void addProduct(Product p);
	
	public Map<String,Product> getAllProduct();
	public void getProduct(long id);
	
	public void removeAllProduct();
	public void removeProduct(long id);
	
	public void updateAllProduct(List<Product> list);
	public void updateProduct(long id);

}
