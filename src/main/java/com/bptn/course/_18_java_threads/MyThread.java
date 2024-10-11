package com.bptn.course._18_java_threads;

class A extends Thread{
	
	@Override
	public void run() {
		this.print();
	}
	public void print() {
		for(int i = 0; i <=10; i ++) {
			System.out.println("A"+i);
		}
	}
}

class B extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <=10; i ++) {
			System.out.println("B"+i);
		}
	}
}


public class MyThread {

	public static void main(String[] args) {

		A a = new A();
		a.start();//will call the run method
		
		a.print(); // will run within the main thread and not in a separate thread
		
		B b = new B();
		b.start();
	}

}

/*Major Takeaways
 * 
 * 1. class A and B are running with the context of the 
 */