package com.bptn.course._25_lambdas._01_lambda_basics;

// Jave provides some functional interfaces instead of us needing to create one every time.

@FunctionalInterface // optional annotaion that will enforce only one abstract method
interface Sayable {
	/*
	 * SAM interface - Single Abstract Method
	 */
	String say();
}

/*
 * to use the above method say we have to implement the interface
 */
class MyClass implements Sayable {

	@Override
	public String say() {
		return "I love java";
	}

}

@FunctionalInterface // optional annotaion that will enforce only one abstract method
interface Sayable2 {
	/*
	 * SAM interface - Single Abstract Method
	 */
	String say(String str);
}

@FunctionalInterface // optional annotaion that will enforce only one abstract method
interface Addable {
	/*
	 * SAM interface - Single Abstract Method
	 */
	int add(int a, int b);
}

public class LambdaExample {

	public static void main(String[] args) {
		Sayable obj = new MyClass();
		System.out.println(obj.say());

		Sayable obj2 = () -> {
			return "I love Java";
		};

		System.out.println(obj2.say());

		Sayable obj3 = () -> "I love Java";
		System.out.println(obj2.say());

		Sayable2 obj4 = (str) -> "I love Java" + str; // when we have only one parameters the brackets are optional
		System.out.println(obj4.say("BPTN"));

		Addable obj5 = (a, b) -> {
			a = a * 2;
			return a + b;
		};
		System.out.println(obj5.add(3, 4));
	}

}
