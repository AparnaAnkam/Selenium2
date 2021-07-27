package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 
		 //loading webpage 2nd way
		 // driver.navigate().to("https://www.facebook.com/");
		 
		 //loading webpage
		 driver.get("https://www.google.com/");
		 
		 //maximize the webpage
		 driver.manage().window().maximize();
		 
		 //get title of the webpage
		 String title=driver.getTitle();
		 System.out.println(title);//printing title on console
		 Thread.sleep(3000);
		 
		 //navigate to backword and foreword and refresh
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 
		 //get current url
		 //String url=driver.getCurrentUrl();
		 System.out.println(driver.getCurrentUrl());
		 
		 //String pagesource=driver.getPageSource();
		 //System.out.println(pagesource);
		 //driver.close();
		 Thread.sleep(2000);
		 driver.quit();

	}

}
