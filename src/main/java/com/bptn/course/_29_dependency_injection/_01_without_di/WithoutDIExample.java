package com.bptn.course._29_dependency_injection._01_without_di;

class Invoice{
	void print() {
		System.out.println("Invoice printed");
	}
}

//new item to print 
class Quote{
	void print() {
		System.out.println("Quote printed");
	}
}

class Order{
	void print() {
		System.out.println("Order printed");
	}
}

class Printer{
	Invoice invoice = new Invoice();
	Quote quote = new Quote();
	Order order = new Order();
	
	void printInvoice() {
		invoice.print();
	}
	
	void printQuote() {
		quote.print();
	}
	
	void printOrder() {
		order.print();
	}
}

public class WithoutDIExample {

	public static void main(String[] args) {

		Printer printer = new Printer();
		printer.printInvoice();
		printer.printQuote();
		printer.printOrder();

	}

}
