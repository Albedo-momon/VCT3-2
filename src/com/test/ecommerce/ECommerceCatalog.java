package com.test.ecommerce;

public class ECommerceCatalog {
	ProductCatalog catalog = new ProductCatalog();

	public static void main(String[] args) {
		ECommerceCatalog ecomCatalog = new ECommerceCatalog();
		ecomCatalog.addProductToCatalog();

	}

	public void addProductToCatalog() {
		boolean check = false;
		catalog.addProduct(new Product("P101", "Laptop", 20000.00));
		catalog.addProduct(new Product("P102", "Smartphone", 20000.00));
		catalog.addProduct(new Product("P103", "Tablet", 20000.00));
		catalog.addProduct(new Product("P104", "HeadPhone", 20000.00));
		ECommerceCatalog ecomCatalog = new ECommerceCatalog();
		ecomCatalog.addToShoppingCart(catalog);
		if (check) {
			String productId = "P104";
			try {

				if (catalog.contains(productId)) {
					Product product = catalog.getProduct(productId);
					System.out.println("Products Found : ");
					System.out.println(" Product Id: " + product.getProductId());
					System.out.println(" Product Name: " + product.getProductName());
					System.out.println(" Price: Rs " + product.getPrice());

				} else {
					throw new ProductNotFoundException("Product not found in the catalog");
				}
			} catch (ProductNotFoundException e) {
				System.err.println("Product Not Found Exception: " + e.getMessage());
			}
		}

	}

	public void addToShoppingCart(ProductCatalog catalog) {

		ShoppingCart cart = new ShoppingCart(catalog);
		try {
			cart.addProductToCart("P101");
			cart.addProductToCart("P104");
			cart.addProductToCart("P103");

		} catch (ProductNotFoundException e) {
			System.err.println("Product Not Found Exception: " + e.getMessage());
		}

		cart.displayCart();
	}

}
