package com.bptn.course.hello;

//FREEZE CODE BEGIN
class ReverseNumber {
 public static void main(String[] args) {

     int inputNumber = 1234, reversedValue = 0;
//FREEZE CODE END

     inputNumber = 1234; // something else to test, remove later
     
     // Add your code here

     // initialize a divisor variable to be 10 so that I can get 
     //the last next Digit which will be brought to the front
     int divisor = 10;
     
     // create a while loop which will terminate when I am done
     // iterating through the digits of inputNumber and it's value 
     // is 0
     while(inputNumber > 0){

       // get the remainder of inputNumber by dividing by 10
       // this will give the last digit
       int nextDigit = inputNumber % divisor;

       //take out the last digit by storing the result of dividing
       // by 10 inside inputNumber.
       inputNumber = inputNumber / divisor;

       // store the value of nextDigit at the end of reversedValue
       // multipying by 10 will create space to add the next digit
       reversedValue = reversedValue * 10 + nextDigit;

     }
//FREEZE CODE BEGIN
     System.out.println(reversedValue);
 }
}
//FREEZE CODE END

/* Summary
* It took me a while to figure out how to get the last digit of the inputNumber
* and it was harder to figure out how to reduce inputNumber so that
* i can get the next digit at the next iteration.
*/