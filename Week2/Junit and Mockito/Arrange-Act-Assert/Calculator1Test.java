package org.apache.maven.archetypes.settingjunit_tests;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;


public class Calculator1Test {
     private Calculator1 calculator;

	    @Before // Setup - runs before each test
	    public void setUp() {
	        calculator = new Calculator();
	        System.out.println("Setup completed.");
	    }

	    @After // Teardown - runs after each test
	    public void tearDown() {
	        calculator = null;
	        System.out.println("Teardown completed.");
	    }

	    @Test
	    public void testAddition() {
	        // Arrange
	        int a = 5;
	        int b = 3;

	        // Act
	        int result = calculator.add(a, b);

	        // Assert
	        assertEquals(8, result);
	    }

	    @Test
	    public void testSubtraction() {
	        // Arrange
	        int a = 10;
	        int b = 4;

	        // Act
	        int result = calculator.subtract(a, b);

	        // Assert
	        assertEquals(6, result);
	    }
}
