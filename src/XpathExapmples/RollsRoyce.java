package XpathExapmples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RollsRoyce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='rrmc-primary-nav-icon js-rrmc-primary-nav-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='rrmc-scrollhide']/div[2]/button/span[text()='Models']")).click();

	}

}
