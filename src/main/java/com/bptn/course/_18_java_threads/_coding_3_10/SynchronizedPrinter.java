package com.bptn.course._18_java_threads._coding_3_10;

public class SynchronizedPrinter {
    
    void printNumbers() {
        
          // Lock the object
        
            System.out.println("Inside of the synchronized block.");
            
            synchronized(this) {
	            for( int i=0 ; i<5 ; i++ ) {
	                System.out.println(i+1);
	                try {
	                    Thread.sleep(500);
	                } catch(Exception ex) {
	                    System.out.println(ex.getMessage());
	                }
	            }
            }
        
    }
}
