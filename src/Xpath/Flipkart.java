package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Actions a=new Actions(driver);
		List<WebElement> menues = driver.findElements(By.xpath("//div[@class='xtXmba']"));
		
		for(WebElement menuname:menues)
		{
			String name=menuname.getText();
			System.err.println(name);
			Thread.sleep(1000);
			a.moveToElement(menuname).perform();//calling non static method
			Thread.sleep(1000);
			
			
		}
		Thread.sleep(3000);
		driver.close();

	}

}
