package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///F:/multi.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
		Select s=new Select(ele);
		if(s.isMultiple())
		{
			s.selectByIndex(0);//select the option
			Thread.sleep(1000);
			s.selectByValue("323");
			Thread.sleep(1000);
			s.selectByVisibleText("324");
			Thread.sleep(1000);
		}
		List<WebElement> opts = s.getOptions();
		for (WebElement values : opts) {
			System.out.println(values.getText());
		}
		System.out.println("1st : "+s.getFirstSelectedOption().getText());
		s.deselectAll();
		/*Thread.sleep(2000);
		s.deselectByIndex(0);//de selecting the option
		Thread.sleep(1000);
		s.deselectByValue("323");
		Thread.sleep(1000);
		s.deselectByVisibleText("324");
		Thread.sleep(1000);*/
	
	}

}
