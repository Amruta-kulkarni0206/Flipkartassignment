package flipcarttests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import flipcartpages.openflipkart;
import resources.base;



public class openflipcarttest extends base {
	
	flipcartpages.openflipkart flipkart;

	// public WebDriver driver;
	@BeforeTest
	public void googlepage() throws IOException {
		driver = google();

		flipkart = new flipcartpages.openflipkart(driver);
	}

	@Test
	public void googlesearch() throws InterruptedException {

		flipkart.search().sendKeys("Flipkart");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}
	
	@Test
	public void googlesearchfound() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(flipkart.searchfound()));
		
    for( WebElement product :flipkart.searchfound){
			
			System.out.println(product.getText());
			
			System.out.println("List of search found");
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@Test(priority=1)
	public void onflipkartsite()
	{
		flipkart.search().sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		flipkart.onflipkartsite().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
	}
	@Test(priority=2)
	public void closeloginwindow()
	{
		if(flipkart.loginpopup().isDisplayed())
		{
			flipkart.closeloginpopup().click();
		}
	}
	
	@Test(priority=3)
	public void gotoAppliances()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(flipkart.Appliances()));
       
		Actions actions = new Actions(driver);
        
        actions.moveToElement(flipkart.Appliances).perform();
        
		wait.until(ExpectedConditions.visibilityOf(flipkart.AirConditioners()));

        actions.moveToElement(flipkart.AirConditioners).perform();
        
        wait.until(ExpectedConditions.elementToBeClickable(flipkart.WindowACs())).click();

        Compareproducttest order=new Compareproducttest();

	}
	
	
}
