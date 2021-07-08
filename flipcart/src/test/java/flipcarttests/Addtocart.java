package flipcarttests;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class Addtocart extends base{
	
	flipcartpages.Addtocart flipkart;

	// public WebDriver driver;
	@BeforeTest
	public void googlepage() throws IOException {
		driver = google();

		flipkart = new flipcartpages.Addtocart(driver);
	}

	@Test(priority=1)
	public void addToCart() throws InterruptedException {

		//driver.get("https://www.flipkart.com/air_conditioner_new/compare?ids=ACNGYGZHJANEJWNZ,ACNF2425FJSWJVE6,ACNGYH3EWWKSZ74V&otracker=compare_product_3");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(flipkart.addtocart()));
		
		
		Iterator<WebElement> iter = flipkart.addtocart().iterator();
		
		System.out.println("iter"+iter.toString());
		
		
		int i=0;
		
		while(iter.hasNext()) {
			WebDriverWait wait9 = new WebDriverWait(driver, 30);
			wait9.until(ExpectedConditions.visibilityOfAllElements(flipkart.addtocart()));
			i++;
			WebElement we = iter.next();

		    System.out.println(" Product Display Elements size " + flipkart.addtocart.size());
		    System.out.println("i"+i);
		    System.out.println("webelement"+we);
		    if(we.isDisplayed()){
				if(i>3){
					break;
				}
				else {
					
					  try{

						  we.click();

					  } catch(StaleElementReferenceException e){

			 
						  we.isDisplayed();
						  we.click();

					}
				//	we.click();
					WebDriverWait wait1 = new WebDriverWait(driver, 30);
					wait1.until(ExpectedConditions.visibilityOf(flipkart.Enterpincode()));
					
					flipkart.Enterpincode().sendKeys("411041");
					
					WebDriverWait wait2 = new WebDriverWait(driver, 30);
					wait2.until(ExpectedConditions.visibilityOf(flipkart.checkavailablity()));
				
					
					flipkart.checkavailablity().click();

					System.out.println("The product available on given pincode-"+flipkart.checkavailablitymassege().getText());
				
					boolean staleElement = true; 

					while(staleElement){

					  try{
//						WebDriverWait wait4 = new WebDriverWait(driver, 30);
//						wait4.until(ExpectedConditions.visibilityOf(flipkart.Gotocart()));
						  Thread.sleep(3000);
						  flipkart.Gotocart().click();

					     staleElement = false;


					  } catch(StaleElementReferenceException e){

					    staleElement = true;

					  }

					}
					
					flipkart.delivertootherpin().click();
				
					WebDriverWait wait5 = new WebDriverWait(driver, 30);
					wait5.until(ExpectedConditions.visibilityOf(flipkart.Enterotherpin()));
				
					flipkart.Enterotherpin().sendKeys("411051");
					
//					WebDriverWait wait8 =new WebDriverWait(driver, 30);
//					wait8.until(ExpectedConditions.elementToBeClickable(flipkart.checkonnewpin()));
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

					flipkart.checkonnewpin().click();
					
					WebDriverWait wait6 = new WebDriverWait(driver, 30);
					wait6.until(ExpectedConditions.visibilityOf(flipkart.checkonnewpinmassege()));
					
					System.out.println("Check delivary on new pin code massege-"+flipkart.checkonnewpinmassege().getText());
				
					driver.navigate().back();
					
					driver.navigate().back();
					
				}
				
			}
			
		}
}
}
