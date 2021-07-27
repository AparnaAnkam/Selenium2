package XpathExapmples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		Thread.sleep(2000);
		
		
		
		List<WebElement> suggs = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		/*for(WebElement sugg : suggs) {
			System.out.println(sugg.getText());
		}*/
		suggs.get(0).click();
		WebElement jj = driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"));
		Actions a=new Actions(driver);
		a.doubleClick(jj).perform();;
		Thread.sleep(2000);
		//driver.close();
	}

}
