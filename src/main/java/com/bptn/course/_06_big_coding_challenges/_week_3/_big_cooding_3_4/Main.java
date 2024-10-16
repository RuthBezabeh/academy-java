package com.bptn.course._06_big_coding_challenges._week_3._big_cooding_3_4;

public class Main {

	public static void main(String[] args) {

		// Create two SumCalculator threads to calculate the sum of two different ranges
		SumCalculator sumCalculator1 = new SumCalculator(1, 500000000);
		SumCalculator sumCalculator2 = new SumCalculator(500000001, 1000000000);

		// Start both threads
		sumCalculator1.start();
		sumCalculator2.start();

		long start1 = System.nanoTime();
		long start2 = System.currentTimeMillis();

//		int sum = 0;
//		for (int i = 1; i <= 1000000000; i++) {
//			sum += i;
//		}

		try {
			// Wait for both threads to finish using join() method of each thread.
			sumCalculator1.join();
			sumCalculator2.join();
		} catch (InterruptedException e) {
			// Print the stack trace if an interruption occurs
			e.printStackTrace();
		}

		long end1 = System.nanoTime();
		long end2 = System.currentTimeMillis();

		// Calculate the total sum by adding the sum of both ranges
		int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();

		// Print the total sum
		System.out.println("Total sum: " + totalSum);
//		System.out.println("Total sum: " + sum);
		System.out.println("time in nano seconds: " + (end1 - start1));
		System.out.println("time in milli seconds: " + (end2 - start2));
	}
}
