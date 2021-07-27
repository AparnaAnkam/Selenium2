package ActionsCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		Actions a=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//div/p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.xpath("//div/p[text()='Drop here']"));
		a.dragAndDrop(drag, drop).perform();
		System.out.println(drop.getText());
		//System.out.println(drop.getCssValue("background-color"));
		//System.out.println(drop.getCssValue("font-size"));
		Thread.sleep(2000);
		System.out.println(drag.getAttribute("class"));
		Thread.sleep(2000);
		//driver.close();

	}

}
