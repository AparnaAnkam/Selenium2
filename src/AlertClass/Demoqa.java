package AlertClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert a2=driver.switchTo().alert();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		Thread.sleep(2000);
		a2.dismiss();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert a3=driver.switchTo().alert();
		System.out.println(a3.getText());
		a3.sendKeys("Aparna");
		Thread.sleep(2000);
		a3.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		

	}

}
