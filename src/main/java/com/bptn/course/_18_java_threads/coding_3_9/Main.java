package com.bptn.course._18_java_threads.coding_3_9;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {


    public static void main(String[] args) throws InterruptedException {
    	
    	//CopyOnWriteArrayList is a thread safe variance to ArrayList
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,1,4,3,6,2));

        // Create a t1 and t2 of MyThread class here.
        MyThread t1 = new MyThread("T1", list);
        MyThread t2 = new MyThread("T2", list);
        // Start t1 and t2 threads here
        t1.start();
        t2.start();
        // Run the join() method from t1 and t2 threads here
        t1.join();
        t2.join();
        // Print out the list variable here.
        System.out.println(list);
    }
}

//1st scenario
//5,1,4,3,6,2,7
//5,1,4,3,6,2,7,8

//2nd scenario
//5,1,4,3,6,2,7
//5,1,4,3,6,2,7,7
