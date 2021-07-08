package flipcartpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	public Addtocart(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='col col-3-12 _1Z-FPJ']")
	public List<WebElement> addtocart;
	
	@FindBy(xpath = "//input[@id='pincodeInputId']")
	public WebElement Enterpincode;
	
	@FindBy(css = "div[class='hivXmn FoGye7'] span[class='_2P_LDn']")
	public WebElement checkavailablity;
	
	@FindBy(css = "div[class='_3XINqE']")
	public WebElement checkavailablitymassege;
	
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	public WebElement Gotocart;
	
	@FindBy(xpath = "//div[@class='_12cXX4']")
	public WebElement delivertootherpin;
	
	
	@FindBy(xpath = "//input[@class='cfnctZ']")
	public WebElement Enterotherpin;
	
	
	@FindBy(xpath = "//span[@class='UgLoKg']")
	public WebElement checkonnewpin;
	
	
	@FindBy(xpath = "//div[@class='_2pqhhf']")
	public WebElement checkonnewpinmassege;
	
	
	
	public List<WebElement> addtocart() {
		return addtocart;
	}
	public WebElement Enterpincode() {
		return Enterpincode;
	}
	
	public WebElement checkavailablity() {
		return checkavailablity;
	}
	
	public WebElement checkavailablitymassege() {
		return checkavailablitymassege;
	}
	
	public WebElement Gotocart() {
		return Gotocart;
	}
	
	public WebElement delivertootherpin() {
		return delivertootherpin;
	}
	public WebElement Enterotherpin() {
		return Enterotherpin;
	}
	
	
	public WebElement checkonnewpin() {
		return checkonnewpin;
	}
	public WebElement checkonnewpinmassege() {
		return checkonnewpinmassege;
	}
	
}
