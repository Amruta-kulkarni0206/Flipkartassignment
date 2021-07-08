package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver driver;

	public void initialiseDriver() throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"/home/me/new neon workspace/flipcart/src/main/java/resources/data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/me/selenium/chromedriver");
			driver = new ChromeDriver();

		}
		
		  // If the browser is Firefox
		else if(browserName.equals("Firefox"))
         {
                       // Set the path for geckodriver.exe
                      System.setProperty("webdriver.firefox.marionette","/home/me/selenium/geckodriver.exe ");
                                                   driver = new FirefoxDriver();
         }
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// return driver;
	}
	
	
	public WebDriver google() throws IOException {
		if (driver == null) {
			initialiseDriver();
			driver.get("https://www.google.com/");

		}
		return driver;
	}
}
