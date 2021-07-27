package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
	
	@Test(groups = "smoke",dependsOnMethods = "tc4")
	public void login() {
		System.out.println("Hello...1");
		Assert.fail();
	}
	
	@Test(groups = "inte",dependsOnGroups = "fun")
	public void chat() {
		System.out.println("Hello...2");
	}

	@Test(groups = "fun",dependsOnGroups = "smoke")
	public void tc3() {
		System.out.println("Hello...3");
	}
	
	@Test(groups ="smoke")
	public void tc4() {
		System.out.println("Hello...4");
	}
	
	@Test(groups = "inte",dependsOnGroups = {"fun","smoke"})
	public void tc5() {
		System.out.println("Hello...5");
	}
	
	@Test(groups = "fun",dependsOnGroups = "smoke")
	public void tc6() {
		System.out.println("Hello...6");
	}
}
