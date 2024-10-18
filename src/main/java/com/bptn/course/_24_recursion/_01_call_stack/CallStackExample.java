package com.bptn.course._24_recursion._01_call_stack;

public class CallStackExample {

	static void test1() {
		System.out.println("In test 1");
		test2();
	}

	static void test2() {
		System.out.println("In test 2");
		test3();
	}

	static void test3() {
		System.out.println("In test 3");
		test4();
	}

	static void test4() {
		System.out.println("In test 4");
		test5();
		throw new RuntimeException("End of calls");
	}

	static void test5() {
		System.out.println("In test 5");
	}

	public static void main(String[] args) {
		System.out.println("In main");
		test1();
	}

}
