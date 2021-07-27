package XpathExapmples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSc3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement allj = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		Actions a =new Actions(driver);
		a.moveToElement(allj).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Kadas']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span/a[@id='pid_8994']")).click();
		Thread.sleep(3000);
	
		Set<String> tabs=driver.getWindowHandles();
		for(String tab:tabs) {
			driver.switchTo().window(tab);
		}
		
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();;
		//a.moveToElement(size).perform();
		Thread.sleep(2000);
	

	}

}
