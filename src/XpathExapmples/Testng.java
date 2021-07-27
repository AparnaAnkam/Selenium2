package XpathExapmples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testng {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		search.sendKeys("TestNG",Keys.ENTER);
		

	}

}
