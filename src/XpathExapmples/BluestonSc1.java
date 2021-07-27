package XpathExapmples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestonSc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement rings = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']"));
		Actions a=new Actions(driver);
		a.moveToElement(rings).perform();
		
		driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']")).click();
		WebElement defprice = driver.findElement(By.xpath("//span[text()='Price']"));
		Thread.sleep(2000);
		a.moveToElement(defprice).perform();
		List<WebElement> dprice = driver.findElements(By.xpath("//form[@id='price']/div[@class='form-items']/div"));
		
		for(WebElement price:dprice) {
			System.out.println(price.getText());
		}
		
		WebElement popular = driver.findElement(By.xpath("//span/span[contains(.,'Popular')]"));
		Thread.sleep(2000);
		a.moveToElement(popular).perform();
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();

		Thread.sleep(2000);
		driver.close();
	}

}
