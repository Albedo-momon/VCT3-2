package com.test.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
	private Map<String, Product> products = new HashMap<>();

	public void addProduct(Product product) {

		products.put(product.getProductId(), product);
	}
	
	public boolean contains(String productId) throws ProductNotFoundException{
		return products.containsKey(productId);
	}
	
	public Product getProduct(String productId) {
		return products.get(productId);
	}

}
