package org.lessons.java.pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		
		float sum = Calculator.add(5,2);
		
		assertEquals(7, sum, "la somma deve essere 7");
	}
	
	@Test
	public void subtractTest() {
		
		float subtract = Calculator.subtract(5,2);
		
		assertEquals(3, subtract, "la sottrazione deve risultare 3");
	}
	
    @Test
    public void divideTest() throws Exception {
    	
    	float divide = Calculator.divide(10,2);
    	
    	assertEquals(5, divide, "La divisione deve risultare 5");
    }
	
	@Test
	public void divideBy0Test() {
		
		assertThrows(Exception.class, () -> Calculator.divide(10, 0), "Deve sollevare l'exception per divisione per zero");
	}
	
	@Test
	public void multplyTest() {
		
		float multiply = Calculator.multiply(5, 2);
		
		assertEquals(10, multiply, "La moltiplicazione deve risultare 10");
	}
}
