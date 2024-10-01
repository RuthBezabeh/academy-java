package com.bptn.course._07_oop;

public class Phone {

	//declare instance variables - properties/attributes
	//weight, height, width, color
	private int weight;
	private int height;
	private int width;
	private String color;
	
	//Constructor
	//same name as the classname
	//does not have a return type
	//default constructor = does not have any parameters passed
	public Phone() {
		weight = 150;
		height = 140;
		width = 70;
		color = "Black";
	}
	
	//first parameterized constructor - which has parameters passed 
	public Phone(int w, int h, int wi, String c) {
		weight = w;
		height = h;
		width = wi;
		color = c;
	}
	
	//second parameterized constructor - which has 3 parameters passed 
		public Phone(int w, int h, int wi) {
			weight = w;
			height = h;
			width = wi;
		}
		
		// this method overrides the toString method inherited from the Object class
		public String toString() {
			return "Weight: " + weight+ " Height: " + height +" Width: " + width;
		}
		
		//main method is the entry point of the code, 
		// can be put any where with in th class
		public static void main(String[] args) {
			
			//create an object of the phone class using default constructor
			Phone myObj1 = new Phone();
			System.out.println("Default Phone: "+" Weight: "+myObj1.weight +" Height: "+myObj1.height+" Width: "+myObj1.width+" Color: "+myObj1.color);
			
			Phone myObj2 = new Phone(100, 50, 10, "pink");
			System.out.println("Custome Phone: "+" Weight: "+myObj2.weight +" Height: "+myObj2.height+" Width: "+myObj2.width+" Color: "+myObj2.color);
			
			Phone myObj3 = new Phone(100, 50, 60); // color is not initialized so will be null
			System.out.println("Custome Phone with out color: "+" Weight: "+myObj3.weight +" Height: "+myObj3.height+" Width: "+myObj3.width+" Color: "+myObj3.color);
			
			myObj1.makePhoneCall();
			myObj1.sendTextMessage();
			
			//this will print the reference of the object because it invokes the 
			//toString method from the Object class. 
			//it will print whatever we want if we override the two string method 
			//and reimplement it
			System.out.print(myObj1);
		}
	
	//declare instance methods = behaviour/functionality
	public void makePhoneCall() {
		System.out.println("Make a phone call");
	}
	
	public void sendTextMessage() {
		System.out.println("Send a text message");
	}
	
	

}
