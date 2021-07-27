package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement mailid = driver.findElement(By.xpath("//input[@name='email']"));
		//mailid.sendKeys("gaddamappu96@gmail.com");
		//WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		//password.sendKeys("sadhsadfsjdfjsafd");
		//WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		//login.click();
		
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aparna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ankam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567892");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1214534492");
		
		
		Thread.sleep(2000);
		driver.close(); 

	}

}
