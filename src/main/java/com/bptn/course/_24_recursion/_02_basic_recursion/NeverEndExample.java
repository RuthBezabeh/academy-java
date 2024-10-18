package com.bptn.course._24_recursion._02_basic_recursion;

/*
 * will get a java.lang.StackOverflowError - not exception
 */
public class NeverEndExample {
	public static void main(String[] args) {

		neverEnd(0);
	}

	static void neverEnd(int num) {
		System.out.println("This method never ends, num = " + num);
		if (num == 600) {
			System.out.println("End the method");
		} else
			neverEnd(num + 1);
	}
}
