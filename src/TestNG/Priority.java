package TestNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 3)
	public void tc1() {
		System.out.println("Hello...1");
	}
	
	@Test(priority = 1)
	public void tc2() {
		System.out.println("Hello...2");
	}
	
	@Test(priority = -2)
	public void tc3() {
		System.out.println("Hello...3");
	}

}
