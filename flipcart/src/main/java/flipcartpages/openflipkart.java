package flipcartpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class openflipkart {
	
	public openflipkart(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// openflipcart

	@FindBy(xpath = "//*[contains(@title,'Search')]")
	public WebElement search;

	
	@FindBy(css = "ul[role='listbox']")
	public List<WebElement> searchfound;
			
	
	
	@FindBy(css = "div[class='g'] a[href='https://www.flipkart.com/']")
	public WebElement onflipkartsite;
	
	@FindBy(xpath = "//button[contains(text(),'✕')]")
	public WebElement closeloginpopup;
	

	@FindBy(css = "div[class='_2MlkI1']")
	public WebElement loginpopup;
	
	@FindBy(xpath = "//div[@class='_37M3Pb']//child::div[7]")
	public WebElement Appliances;
	
	@FindBy(linkText = "Air Conditioners")
	public WebElement AirConditioners;
	
	@FindBy(linkText = "Window ACs")
	public WebElement WindowACs;
	
	
	
	
	//*[@class='_2iDkf8']
	
	public WebElement search() {
		return search;
	}
	
	public List<WebElement> searchfound() {
		return searchfound;
	}
	public WebElement onflipkartsite() {
		return onflipkartsite;
	}
	public WebElement closeloginpopup() {
		return closeloginpopup;
	}
	
	public WebElement loginpopup() {
		return loginpopup;
	}
	
	
	public WebElement Appliances() {
		return Appliances;
	}
	
	public WebElement AirConditioners() {
		return AirConditioners;
	}
	
	public WebElement WindowACs() {
		return WindowACs;
	}
	
	
}
