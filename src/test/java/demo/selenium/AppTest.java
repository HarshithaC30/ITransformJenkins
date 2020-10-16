package demo.selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Demo.selenium.App;

public class AppTest {
	static App calculator;
	@BeforeClass
	public static void setupBeforeClass(){
		calculator = new App();
	}
	
	@Before
	public void setup(){
		calculator.memoryClear();
	}

	@Test
	public void testAdd() { 
		int a = 1234;
		int b = 5678;
		
		int expected = 6912;
		int actual = calculator.add(a, b);
		System.out.println("testAdd");
		assertEquals(expected, actual);
 	}
	
	@Test
	public void testSubtract(){
		int a = 500;
		int b = 300;
		int actual = calculator.subtract(a, b);
		System.out.println("testSubtract");
		assertTrue(actual == 200);
	}
	
	@After
	public void tearDown(){
		calculator.reset();
	}
	
	@AfterClass
	public static void tearDownClass(){
		calculator = null;
	}
}
