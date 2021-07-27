package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ub1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		
		WebElement stores = driver.findElement(By.xpath("// a[contains(.,'Stores ')]"));
		stores.click();
		
		WebElement hp = driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]"));
		System.out.println(hp.getText());
		hp.click();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
