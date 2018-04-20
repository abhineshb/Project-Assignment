package com.product.service;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//import java.util.Map;
import java.util.stream.Collectors;

///import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.product.dao.ProductDAO;
import com.product.model.Product;

@Service
public class ProductServiceImpl  implements ProductService{

	/*@Autowired
	private ProductDAO dao;*/

	@Override
	public List<Product> addAllProduct(List<Product> list) {
		return null;	
	}

	@Override
	public List<Product> addProduct(Product p) {
		
		Product prod = new Product(p.getId(),p.getName(),p.getDescription(),p.getPrice(),p.getQuantity());
		Product.prodList.add(prod);
		List<Product> pp = Product.getProdList();
		//Collections.reverse(pp);
		for(Product pr:pp)
	        System.out.println("list:"+pr+" ");
		return pp;
	}

	@Override
	public List<Product> getAllProduct() {
		System.out.println("list Item Impl");
		List<Product> p = Product.getProdList();
		Collections.reverse(p);
		for(Product pr:p)
	        System.out.println("list:"+pr+" ");
		return p;
	}

	@Override
	public Product getProduct(long id) {
		List<Product> p = Product.getProdList();
		for(Product prod:p)
			if(prod.getId() == id)
				return prod;
		return null;
	}

	@Override
	public List<Product> removeAllProduct() {
		return null;
		
	}

	@Override
	public List<Product> removeProduct(long id) {
		List<Product> p = Product.getProdList();
		Iterator<Product> i = p.iterator();
		while(i.hasNext())
		{
			if(p.contains(id))
				i.remove();
		}
		return p;
	}

	@Override
	public List<Product> updateAllProduct(List<Product> list) {
		return null;
	}

	@Override
	public List<Product> updateProduct(Product prod) {
		//edit logic
		return null;
	}
}
