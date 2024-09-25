package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		// create a string variable
		String s = "Hello World";
		String reverseWord = "";
		
		int stringLength = s.length(); //length is a method here.
		System.out.println("The length of the string is: " + stringLength); // also counts the space in hello world
		
		//substring() method to get a part of the string
		String sub = s.substring(0,7); // the end index is exclusive and will only print upto index 4
		System.out.println("The substring with start index 0 and end index 7: " + sub);
		
		String sub2 = s.substring(3);		
		System.out.println("The substring starting with index 3: " + sub2);
		
		//toLowerCase() = converts the letters of the string to lower case
		String lowerCaseString = s.toLowerCase();
		System.out.println("The lowecase of the string is: " + lowerCaseString);
		
		//toUpperCase() = converts the letters of the string to upper case
		String upperCaseString = s.toUpperCase();
		System.out.println("The uppercase of the string is: " + upperCaseString);
		
		// to find the index of a string or character in the string
		int index = s.indexOf("World"); //returns -1 if it doesn't find the substring
		System.out.println("The index of World is: " + index);
		
		//find the character at the specified index
		char c = s.charAt(0);
		System.out.println("The character at index 0 is: " + c);
		
		char c2 = s.charAt(3);
		System.out.println("The character at index 3 is: " + c2);
		
		//reverse the string, save it as a string and print
		for(int i = s.length()-1; i>=0 ; i--) {
			reverseWord += s.charAt(i);
		}
		
		System.out.println("Reverse word: " + reverseWord);
	}
}
/* string is a class with it's own methods 
 * including some overloaded methods
 * 
 */
