package com.bptn.course._24_recursion._03_factorial;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial Recursive of 5: " + factorial(5));

		System.out.println("Factorial iterative of 5: " + factorialIterative(5));

	}

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	static int factorialIterative(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
