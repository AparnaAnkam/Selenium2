package testPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.SeleniumHome;

public class TestSeleniumHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		SeleniumHome sh=new SeleniumHome(driver);
		sh.sendText("Java");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		sh.sendText("TextNG");

	}

}
