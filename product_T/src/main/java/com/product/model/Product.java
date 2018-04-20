package com.product.model;

import java.util.HashMap;
import java.util.Map;

public class Product {

	private long id;
	private String name;
	private String description;
	private String relatedProduct;
	private String image;
	
	
	public Product(long id, String name, String description,
			String relatedProduct, String image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.relatedProduct = relatedProduct;
		this.image = image;
	
	}
static 	Map<String,Product> productMap = new HashMap<String, Product>(){{
	       put("101",new Product(101,"phone","smartphone","Description of smartphor","../../images"));
	       put("102",new Product(102,"refrigertato","smartphone","Description of smartphor","../../images"));
	       put("103",new Product(103,"fan","smartphone","Description of smartphor","../../images"));
	       put("104",new Product(104,"cooler","smartphone","Description of smartphor","../../images"));
	       put("105",new Product(105,"AC","smartphone","Description of smartphor","../../images"));
	       put("106",new Product(106,"tv","smartphone","Description of smartphor","../../images"));
	       put("107",new Product(107,"gas","smartphone","Description of smartphor","../../images"));
	       put("108",new Product(108,"laptop","smartphone","Description of smartphor","../../images"));
	       put("109",new Product(109,"bike","smartphone","Description of smartphor","../../images"));
	       put("110",new Product(110,"wire","smartphone","Description of smartphor","../../images"));
	       
	       
	}};
	       
	/**
 * @return the productMap
 */
public static Map<String, Product> getProductMap() {
	return productMap;
}
/**
 * @param productMap the productMap to set
 */
public static void setProductMap(Map<String, Product> productMap) {
	Product.productMap = productMap;
}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the relatedProduct
	 */
	public String getRelatedProduct() {
		return relatedProduct;
	}
	/**
	 * @param relatedProduct the relatedProduct to set
	 */
	public void setRelatedProduct(String relatedProduct) {
		this.relatedProduct = relatedProduct;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description="
				+ description + ", relatedProduct=" + relatedProduct
				+ ", image=" + image + "]";
	}
	
	
	
	
}
