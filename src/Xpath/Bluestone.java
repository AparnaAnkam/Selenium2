package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gaddam62aparna@gmail.com");
		driver.findElement(By.xpath("//input[@class='btn btn-new col-xs-3']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		

	}

}
