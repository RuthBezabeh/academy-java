package com.bptn.course._27_streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	Double price;

	public Product(int id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String toString() {
		return String.format("Product [id=%s, name=%s, price=%s]", id, name, price);
	}

}

public class _01_StreamExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		products.add(new Product(1, "High rise", 100000000.0));
		products.add(new Product(2, "Town house", 500000.0));
		products.add(new Product(3, "Single family", 1000000.0));
		products.add(new Product(4, "Conominium", 300000.0));
		products.add(new Product(5, "Mansion", 8000000.0));
		
		List<Double> prices = new ArrayList<>();
		
		for(Product product: products) {
			if(product.getPrice() < 3000000) {
				prices.add(product.getPrice());
			}
		}
		System.out.println("OOP: " + prices);
		
		prices = products.stream()									// creates a stream of products
							.filter(p -> p.getPrice() < 3000000)	// creates a filtered stream of products
							.map(Product::getPrice)				// creates a stream of prices from the filtered products
							.toList();								// converts the stream to list of prices
		System.out.println("FP: " + prices);
		
	}

}
