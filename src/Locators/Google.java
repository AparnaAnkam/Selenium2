package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		System.out.println("is Displayed: "+search.isDisplayed());
		System.out.println("is Enabled: "+search.isEnabled());
		System.out.println(search.getTagName());
		Point loc = search.getLocation();
		System.out.println(loc);
		search.sendKeys("Java");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(2000);
		//driver.close(); 
	}

}
