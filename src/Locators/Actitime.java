package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement mailid = driver.findElement(By.id("username"));
		mailid.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement login = driver.findElement(By.id("loginButtonContainer"));
		System.out.println(login.isDisplayed());
		login.click();
		//System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.close(); 

	}

}
