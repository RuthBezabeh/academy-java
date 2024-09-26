package com.bptn.course.hello;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        
        //initialize a random generator using the class Random
        Random randomGenerator = new Random();

        //generate a random int value usng nextInt()
        // and store it in an int variable
        int randomNumber = randomGenerator.nextInt();

        //print out the generated random number
        System.out.println("After execution the Random Number is: " + randomNumber);      


    }
}
/* Summary
 * 
 * I learned about a new class that Java offers called Random from
 * the java documentation here 
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html#
 * It will be usefull when i need to generate a random int or double 
 * or float etc. 
 *
 * Looking at the possible solution provided in Codio, I also learned
 * about Math.random() and the Math class. unlike the Random class,
 * Math.random() generates random numbers between 0.0 and 1.0
 * 
 */
