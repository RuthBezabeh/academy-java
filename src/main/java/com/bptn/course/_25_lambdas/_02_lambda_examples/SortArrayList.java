package com.bptn.course._25_lambdas._02_lambda_examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
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

	public int getPrice() {
		return price;
	}

	public String toString() {
		return String.format("Product [id=%s, name=%s, price=%s]", id, name, price);
	}

}

public class SortArrayList {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		products.add(new Product(1, "High rise", 100000000));
		products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

		System.out.println(products);
		// sort by name
		products.sort((a, b) -> a.getName().compareTo(b.getName()));
		System.out.println(products);

		// sort by name then price
		products.sort(Comparator.comparing(Product::getName).thenComparing(Product::getPrice));
		System.out.println(products);
	}

}
