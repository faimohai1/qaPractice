package ngPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgTemplate {

	@BeforeTest   //annotation from testng library
	
	public void testStart() {
		//prerequirements go into this
		
	}
	
	@BeforeMethod //this annotation executes the method in it before each and every test annotation
	public void beforeMethod() {
		System.out.println("this the beforemethod function");
	}
	@AfterMethod //this annotation executes the method in it after each and every test annotation
	public void afterMethod() {
		System.out.println("this the afer method function");
	}
	
	
	@Test(priority=2)   
	
	public void testMain() {
		System.out.println("test1");
		
	}
	// there can be multiple test annotation in a script. in
	// test annotations can be prioritize using priority value
	//a script may hold multiple test cases
	//a test scenario may generate multiple test cases
	
	@Test(priority=0)
	public void testMainTwo() {
		System.out.println("test2");
	}
	
	@Test

	public void loginValidation() {
		System.out.println("login");
		
		
		//validation of the test if it passed or failed
		//Assert is used to compare expected and actual value and determine if the test is passed or not
		String actual = "abc";
		String expected = "bc";
		
		Reporter.log("Test Report Title goes in here");
		org.testng.Assert.assertEquals(actual, expected);

	}

	
	@AfterTest
	public void testEnd() {
		//post-requirements go into this
		
	}
	
}
