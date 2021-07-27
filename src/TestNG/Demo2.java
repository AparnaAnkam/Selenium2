package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	
	@BeforeMethod
	public void bM() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("BM");
	}
	
	@Test
	public void tc_01() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
		System.out.println("Tc1");
	}
	
	@Test
	public void tc_02() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Testng",Keys.ENTER);
		System.out.println("Tc2");
	}
	
	@AfterMethod
	public void aM() {
		driver.close();
		System.out.println("AM");
	}
}
