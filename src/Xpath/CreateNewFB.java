package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aparna");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ankam");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8564685556");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("akdhjhduiiufhiqjfe");
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
