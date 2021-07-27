package Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStone {

	@FindBy(xpath="//input[@name='search_query']")
	private WebElement search;
	@FindBy(xpath="//img[@alt='The Felicita Top Open Ring']")
	private WebElement rings;
	@FindBy(id="buy-now")
	private WebElement buy;
	@FindBy(xpath="//div[@class='formErrorContent']")
	private WebElement error;
	
	public BlueStone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendText(String text) {
		search.sendKeys(text,Keys.ENTER);
	}
	public void clickOnRings() {
		rings.click();
	}
	public void clickOnBuyNow() {
		buy.click();
	}
	public String getErrorMsg() {
		return error.getText();
	}
	
	
}
