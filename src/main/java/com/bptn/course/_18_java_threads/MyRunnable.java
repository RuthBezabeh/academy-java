package com.bptn.course._18_java_threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("second thread state: " + Thread.currentThread().getState());

			// add a delay using the static method sleep()
			try {
				Thread.sleep(1000);
				System.out.println("second thread state: " + Thread.currentThread().getState());

			} catch (InterruptedException e) {
				System.out.println("Interrupted exception has occured: " + e.getMessage());// e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		MyRunnable runnableObject = new MyRunnable();

		Thread thread = new Thread(runnableObject);

		System.out.println(thread.getState());

		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main" + i);
			
			// add a delay using the static method sleep()
			try {
				Thread.sleep(800);
				System.out.println("Main thread state: " + thread.getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main thread state: " + Thread.currentThread().getState()); 
			
			if(i== 5) {
				try {
					thread.join(); // wait for the thread "thread" to die/complete execution
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
//steps to create a thread using Runnable interface
//step 1. Created a class that implements Runnable Interface
//step 2. create an object of MyRunnable(class that implements the runnable interface)
//step 3. create an object of the Thread class and pass the runnable object from step 3 as a parameter
//step 4. start the thread using start()