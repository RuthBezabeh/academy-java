package com.bptn.course._29_dependency_injection._02_with_di;

interface Document{
	void print();
}

class Invoice implements Document{
	
	@Override
	public void print() {
		System.out.println("Invoice printed");
	}
}

//new item to print 
class Quote implements Document{
	@Override
	public void print() {
		System.out.println("Quote printed");
	}
}

class Order implements Document{
	@Override
	public void print() {
		System.out.println("Order printed");
	}
}

class Printer{
	Document document;
	
	//dependency injected here
	void setDocument(Document document) {
		this.document = document;
	}
	
	void print() {
		document.print();
	}
	
}


public class WithDIExample {
	public static void main(String[] args) {

		Printer printer = new Printer();
		
		Invoice invoice = new Invoice();
		printer.setDocument(invoice);
		printer.print();
		
		Quote quote = new Quote();
		printer.setDocument(quote);
		printer.print();
		
		Order order = new Order();
		printer.setDocument(order);
		printer.print();
	}
}
