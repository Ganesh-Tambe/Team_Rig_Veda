package com.utilies;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HelperClass {
	public static HelperClass objhelper;
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	private static final int TIMEOUT=10;
	
	public HelperClass() {
		// TODO Auto-generated constructor stub
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();	
	}
	
	  public static void openPage(String URL)
	    {
	       driver.get(URL);
	       Actions action = new Actions(driver);
		   action.sendKeys(Keys.ESCAPE).perform();
	    }

		public static WebDriver getDriver() {
			return driver;
		}

		public static void setDriver() {
			if(objhelper==null)
			{
			  objhelper=new HelperClass();
			}
		}
	    
	   public static  void tearDown()
	   {
		   if(driver!=null)
		   {
			//   driver.close();
//			   driver.quit();
		   }
		   
		   objhelper=null;
	   }

}
