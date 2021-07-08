package flipcartpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compareproduct {
	
	public Compareproduct(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='_2iDkf8']")
	public List<WebElement> Selectproduct;
	
	@FindBy(xpath = "//span[contains(text(),'COMPARE')]")
	public WebElement compareproduct;
	
	
	@FindBy(css = "div[class='col-4-5']")
	public WebElement printprice;
	
	
	
	
	
	
	
	
	public List<WebElement> Selectproduct() {
		return Selectproduct;
	}
	
	public WebElement compareproduct() {
		return compareproduct;
	}
	
	public WebElement printprice() {
		return printprice;
	}
	
	
	
	
	
	
}
