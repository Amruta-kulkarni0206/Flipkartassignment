package flipcarttests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class Compareproducttest extends base {
	
	
	
	flipcartpages.Compareproduct flipkart;

	// public WebDriver driver;
	@BeforeTest
	public void googlepage() throws IOException {
		driver = google();

		flipkart = new flipcartpages.Compareproduct(driver);
	}

	@Test(priority=1)
	public void compareproducts() throws InterruptedException {

		//driver.get("https://www.flipkart.com/air-conditioners/window~type/pr?sid=j9e%2Cabm%2Cc54&otracker[]=nmenu_sub_TVs%20%26%20Appliances_0_Window%20ACs&otracker[]=hp_rich_navigation_5_1.navigationCard.RICH_NAVIGATION_Appliances~Air%2BConditioners~Window%2BACs_CRYRXZFTEPW5&p[]=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&fm=neo%2Fmerchandising&iid=M_47ff0d6f-051f-41b0-ba54-4a9fa9b455ae_1_372UD5BXDFYS_MC.CRYRXZFTEPW5&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L2_view-all&cid=CRYRXZFTEPW5");
		Iterator<WebElement> iter = flipkart.Selectproduct().iterator();

		
		int i=0;
		
		while(iter.hasNext()) {
		    
			i++;
			WebElement we = iter.next();

		    System.out.println(" Product Display Elements size " + flipkart.Selectproduct.size());

		    
		    if (we.isDisplayed()) {
		    	if(i==2 || i==4 || i==6){
					
		    		we.click();
				}  
		    }}}
	
	@Test(priority=2)
	public void compareproduct() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(flipkart.compareproduct));
		
		flipkart.compareproduct().click();
	
	
	}
	
	@Test(priority=3)
	public void Printproductprice() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(flipkart.printprice()));
		
		System.out.println("The Name and price of all three products-"+flipkart.printprice().getText());
	
	
	}

}
