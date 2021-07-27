package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethods {
	@BeforeClass
	public void bc() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("before method");
	}
	
	@Test
	public void tc1() {
		System.out.println("Hello...!Tc1");
	}
	
	@Test
	public void tc2() {
		System.out.println("Hello...!Tc2");
	}
	
	@AfterMethod
	public void af() {
		System.out.println("After mothod");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void at() {
		System.out.println("After test");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("After suite");
	}

}
