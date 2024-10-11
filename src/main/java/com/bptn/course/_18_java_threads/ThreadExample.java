package com.bptn.course._18_java_threads;

public class ThreadExample extends Thread{
	
	public ThreadExample(String name) {
		super(name);
	}
	
	public void run() {
		for(int i =0; i<5; i++) {
			System.out.println(i);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		ThreadExample t1 = new ThreadExample("thread_1");
		ThreadExample t2 = new ThreadExample("thread_2");
		
		//start both threads concurrently
		t1.start();
		t2.start();
		
		try {
			System.out.println("State of threads t1 and t2: "+ t1.getState()+ ", "+ t2.getState());
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("State of threads t1 and t2: "+ t1.getState()+ ", "+ t2.getState());
		
		System.out.println("main thread continues");
	}

}
