package com.bptn.course._13_builtin_exceptions._01_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		try {
			readFile("result.txt");
		}
		catch(FileNotFoundException e){
			System.out.println("An error occured: " + e.getMessage());
		}
	}
	
	//create a method which reads a file
	public static void readFile(String fileName) throws FileNotFoundException{
		//create an object pf FileReader
		FileReader fileReader = new FileReader(fileName);
	}
}

//FileNotFoundException is a checked exception where java compiler wants you to deal with it

//when we call a method which has a checked exception in the method signature
//java compiler gives you two options
//1. surround it with atry-catch block
//2. add throws in the method signature - if you choose this you will eventually have to use a try catch block somewhere else

// whenever calling a method with a throws checked exception, java will require you to deal with it