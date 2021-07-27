package Xpath;

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

		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		WebElement fn = driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
		fn.sendKeys("Aparna");
		//WebElement ln = driver.findElement(By.xpath("//input[@name='lastname']"));
		//ln.sendKeys("Ankam");
		
		
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//driver.close(); 

	}

}
