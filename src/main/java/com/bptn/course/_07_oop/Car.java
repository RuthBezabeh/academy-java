package com.bptn.course._07_oop;

public class Car {

	    // Fill in the code for Step 2
	    private String color;
	    private String brand;
	    private int price;

	      public Car(String color, String brand, int price) {
	        // Fill in the code for Step 4
	        this.color = color;
	        this.brand = brand;
	        this.price = price;
	      }


	      void printCarDetails() {
	        //using this keyword to point to the instance method of the class.
	        // print can be called from here because this instance belongs to the same class
	        this.print();
	    }

	    // Fill in the code
	    //private method can be called from with in the class
	     private void print() {
	          System.out.println("Car{" +
	                  "color='" + color + '\'' +
	                  ", brand='" + brand + '\'' +
	                  ", price=" + price +
	                  '}');
	     }
	
	/* Summary
	 * I learned that this keyword can be used to call instance variables and instance 
	 * methods from with in a class. I also learned that i cannot call a static
	 * method using this keyword because there is no instance/object that it can refer to.
	 */
	public static void main(String[] args) {
		Car car1 = new Car("white", "BMW", 70000);
        Car car2 = new Car("Red", "Audi", 80000);
        car1.printCarDetails();
        car2.printCarDetails();
	}

}
