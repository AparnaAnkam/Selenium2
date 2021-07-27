package Basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
	    System.out.println("Hello   "+parent);
	    System.out.println();
	    
		//close multiple windows(child windows)
		Set<String> wins=driver.getWindowHandles();
		wins.remove(parent);    //Here we are closing only child windows by removing parent window
		driver.quit();
		/*for (String win : wins) {
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
			Thread.sleep(1000);
		}
		//driver.close();*/

	}

}
