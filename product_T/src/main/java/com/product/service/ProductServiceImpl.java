package com.product.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDAO;
import com.product.model.Product;

@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	private ProductDAO dao;

	@Override
	public void addAllProduct(List<Product> list) {
		dao.addAllProduct(list);	
	}

	@Override
	public void addProduct(Product p) {
		dao.addProduct(p);
		
	}

	@Override
	public Map<String, Product> getAllProduct() {
		return dao.getAllProduct();	
	}

	@Override
	public void getProduct(long id) {
		// TODO Auto-generated method stub
		dao.getProduct(id);
	}

	@Override
	public void removeAllProduct() {
		// TODO Auto-generated method stub
		dao.removeAllProduct();
		
	}

	@Override
	public void removeProduct(long id) {
		// TODO Auto-generated method stub
		dao.removeProduct(id);
	}

	@Override
	public void updateAllProduct(List<Product> list) {
		// TODO Auto-generated method stub
		dao.updateAllProduct(list);
	}

	@Override
	public void updateProduct(long id) {
		// TODO Auto-generated method stub
		dao.updateProduct(id);
	}
}
