package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class Main2 {
    void method() {
        //outer try-catch block
    	try {
    		try {
    			int[] arr = {1,2,3,4};
    			System.out.println(arr[0]);
    			System.out.println(arr[5]);
    			
    		}catch(ArithmeticException e) {
    			System.out.println("ArithmeticException occurred");
    		}
    	}
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
    	}
    }

  // main() method to run the program
    public static void main(String args[]) {
        Main2 nestedTryBlockSolutionObject = new Main2();
        nestedTryBlockSolutionObject.method();
    }
}
