package XpathExapmples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		Actions a=new Actions(driver);
		a.doubleClick(search).perform();
		Thread.sleep(1000);
		WebElement fromcity = driver.findElement(By.xpath("//span[@for='fromCity']"));
		fromcity.click();
		
		
		

	}

}
