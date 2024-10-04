package com.bptn.course._12_wrapper_classes;

public class Main {

	public static void main(String[] args) {
		//Autoboxing - converting a primitive type into a wrapper class
		Integer intObject = Integer.valueOf(100);
		
		//Alternatively, we can also convert primitive type to wrapper class using the following
		Integer intObject1 = 20;
		
		//unboxing - converting a wrapper class into a primitive type
		int inPrimitive = intObject;
		
		//Alternamively we can convert a  wrapper class back to primitive type
		int intPrimitive1 = intObject1.intValue();
		
	}

}

//Autoboxing - converting a primitive type into a wrapper class
//unboxing - converting a wrapper class into a primitive type

