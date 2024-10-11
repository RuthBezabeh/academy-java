package com.bptn.course._18_java_threads._coding_3_10;

public class Main {
	   public static void main(String[] args) {
	        
	        SynchronizedPrinter printer = new SynchronizedPrinter();

	        // use same printer object in both threads
	        MyThread t1 = new MyThread(printer);
	        MyThread t2 = new MyThread(printer);

	        //start the threads t1 and t2
	        System.out.println("Start thread1");
	        t1.start();
	        System.out.println("Start thread2");
	        t2.start();
	        
	    }   
}
