package com.bptn.course._20_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//org.junit.platform.commons.JUnitException: @BeforeAll method 'void com.bptn.course._20_junit.CalculatorTest.initialize()' must be static unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).
@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeAll
	void initialize() {
		/*
		 * Methods with the @BeforeAll annotation will execuet before all of out test methods
		 * useful for opening data base connections, text files etc
		 * */
		calculator = new Calculator();
		
	}
	
	@BeforeEach
	void beforeEachTest() {
			/*
			 * The methods with @BeforeEach are executed one time before each test.
			 */
			System.out.println("@BeforeEach: Executed before each test.");
		
	}
	
	@Test
	void testFindMax() {
		//{1,3,4,2,6,10,48,83}
		
		
		int max = calculator.findMax(new int[] {1,3,4,2,6,10,48,83});
		
		int expected = 83;
		
		Assertions.assertEquals(expected, max, "The output was incorrect.");
		
        max = calculator.findMax(new int[] {1,3,4,2,9});
		
        expected = 9;
		
		Assertions.assertEquals(expected, max, "The output was incorrect.");
	
	}
	

	@Test
	void testFindMaxNegative() {
		//{1,3,4,2,6,10,48,83}
				
		int max = calculator.findMax(new int[] {1,-3, 4,-26,10,-48,-83});
		
		int expected = 10;
		
		Assertions.assertEquals(expected, max, "The output was incorrect.");
		
		max = calculator.findMax(new int[] {-1,-3,-4,-2,-9});
		
        expected = -1;
		
		Assertions.assertEquals(expected, max, "The output was incorrect.");
	
	}
	
}
