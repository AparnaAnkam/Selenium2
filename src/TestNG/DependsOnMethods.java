package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = "tc3")
	public void tc1() {
		System.out.println("Hello...1");
	}
	
	@Test(dependsOnMethods = "tc1")
	public void tc2() {
		System.out.println("Hello...2");
	}
	
	@Test()
	public void tc3() {
		System.out.println("Hello...3");
	}
}
