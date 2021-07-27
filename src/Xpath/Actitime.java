package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un.getText());
		Thread.sleep(2000);
		WebElement ps = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(ps.getText(),Keys.ENTER);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//Thread.sleep(2000);

		driver.close();
	}

}
