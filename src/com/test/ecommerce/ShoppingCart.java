package com.test.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Product> cartItems = new ArrayList<>();
	
	ProductCatalog productCatalog = new ProductCatalog();
	
	
	public ShoppingCart(ProductCatalog productCatalog) {
		this.productCatalog = productCatalog;
	}

	public void addProductToCart(String productId) throws ProductNotFoundException{
		if(productCatalog.contains(productId)) {
			Product product = productCatalog.getProduct(productId);
			cartItems.add(product);
			System.out.println("Added :"+ product.getProductName());
		}else {
			throw new ProductNotFoundException("Product Not found in the inventory");
		}
	}
	
	public void displayCart() {
		if(cartItems.isEmpty()) {
			System.out.println("The cart is empty");
		}else {
			System.out.println("Items in the carts are:");
			for(Product product : cartItems) {
				System.out.println("Product: " + product.getProductName() +", Price: Rs"+product.getPrice() );
			}
		}
	}
}
