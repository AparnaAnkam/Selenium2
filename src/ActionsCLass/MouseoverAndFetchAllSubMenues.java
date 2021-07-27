package ActionsCLass;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import TakeScreenshot.Demo;

public class MouseoverAndFetchAllSubMenues {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(10000);
		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		
		Actions a=new Actions(driver);//object creation
		
		List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));

		for(WebElement menuname:menues)
		{
			String name=menuname.getText();
			System.err.println(name);
			Thread.sleep(1000);
			a.moveToElement(menuname).perform();//calling non static method
			Thread.sleep(2000);
			Demo.TakePic(driver, name);
			List<WebElement> subMenues = driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for(WebElement subMenu:subMenues) {
				System.out.println(subMenu.getText());
			}
			System.out.println("Total submenues is:-"+subMenues.size());
		}
		System.out.println("Total menues is:-"+menues.size());
		
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		driver.close();

}

}
