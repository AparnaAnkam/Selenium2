package XpathExapmples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneSc10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement frame = driver.findElement(By.xpath("//iframe[@name='chat-widget']"));
			driver.switchTo().frame(frame);
			driver.findElement(By.xpath("//p[text()='CHAT with our experts !']")).click();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aparna",Keys.TAB);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com",Keys.TAB);
			driver.findElement(By.xpath("//form/div[4]/div/input")).sendKeys("7040800782");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Start the chat']")).click();
			driver.findElement(By.xpath("//textarea[@class='lc-jftu2g e1m92qam0']")).sendKeys("Hello",Keys.ENTER);
			WebElement reply = driver.findElement(By.xpath("//div[1]/div/span[@class='Linkify']"));
			System.out.println(reply.getText());

	}

}
