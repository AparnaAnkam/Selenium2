package ActionsCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightNDoubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		//a.contextClick(ele).perform();
		WebElement dEle = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		a.doubleClick(dEle).perform();

	}

}
