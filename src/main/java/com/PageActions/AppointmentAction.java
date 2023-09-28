package com.PageActions;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.PageLocators.AppointmentLocator;
import com.utilies.HelperClass;

public class AppointmentAction {

	AppointmentLocator appointmentlocator=null;
	String str,str1;
	
	public AppointmentAction() {
		this.appointmentlocator=new AppointmentLocator();
		PageFactory.initElements(HelperClass.getDriver(), appointmentlocator);
	}
		
	
		public void clickappointment() throws Exception {
			
			appointmentlocator.clickAppointment.click();
			
		}
		
		public void clickaddappointment() throws Exception {
			
			appointmentlocator.clickAddAppointment.click();
		}
		
		public void clickOndate() throws Exception {
			Thread.sleep(3000);
			appointmentlocator.clickOnDate.click();
			
//			//Action action = new Action(HelperClass.driver);
//			appointmentlocator.clickOnDate.sendKeys(Keys.CLEAR);
			appointmentlocator.clickOnDate.sendKeys("09/30/2023");
			
//			
//			JavascriptExecutor js = (JavascriptExecutor)HelperClass.driver;
//			
//			js.executeScript("document.getElementById('dates').removeAttribute('readonly');", appointmentlocator.clickOnDate);
//			appointmentlocator.clickOnDate.sendKeys("09/30/2023"); 
			
		}
		
		
		public void clickSpecialist() throws Exception  {
			Thread.sleep(5000);
			appointmentlocator.clickSpecialist.click();
			Select dropDown =new Select(appointmentlocator.clickSpecialist);
			dropDown.selectByIndex(1);
			//HelperClass.wait.until(ExpectedConditions.visibilityOfElementLocated(appointmentlocator.clickSpecialist));
			
			
		
		}
	
		public void clickdoctor() throws Exception {
			Thread.sleep(5000);
			appointmentlocator.clickDoctor.click();
			Select dropDown =new Select(appointmentlocator.clickDoctor);
			dropDown.selectByIndex(3);
			
		}
		
		public void clickshift() throws Exception {
			Thread.sleep(5000);
			appointmentlocator.clickShift.click();
			Select dropDown =new Select(appointmentlocator.clickShift);
			dropDown.selectByIndex(2);
		}
		public void clickSlot() throws Exception {
			Thread.sleep(5000);
			appointmentlocator.clickOnSlot.click();
			Select dropDown =new Select(appointmentlocator.clickOnSlot);
			dropDown.selectByIndex(1);
		
		}
		
		public void Appointmentpriority() throws Exception {
			Thread.sleep(5000);
			appointmentlocator.clickOnAppointmentPriority.click();
			Select dropDown =new Select(appointmentlocator.clickOnAppointmentPriority);
			dropDown.selectByIndex(2);
		}
		
		public void clickMessage(String name) throws Exception {
			Thread.sleep(5000);
			appointmentlocator.clickMessage.sendKeys("demo", Keys.ENTER);
		}

		
		public void clickConsult() throws Exception {
			Thread.sleep(5000);
			appointmentlocator.clickLiveConsult.click();
		}
		public void clickAvailableslot() {
				appointmentlocator.clickAvailableSlot.click();
			}
		
		public void clickSave() {
			appointmentlocator.clickOnSave.click();

		
		}
	
				
	
		
		public void  Search() throws InterruptedException {
			appointmentlocator.Search.sendKeys("Sansa Gomez",Keys.ENTER);
			Thread.sleep(5000);
		}
		public void clickingshow() throws InterruptedException {
			Thread.sleep(5000);
			appointmentlocator.clickshow.click();
		}
		
		
		public String ValidatingText() {
			WebElement text=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(appointmentlocator.ValidateText));
			 return text.getText();
			 
		}
		
		
		public void Appoint() throws Exception {	
			Properties prop= new Properties();
			str=prop.getProperty("name");
			this.clickMessage(str);
			str1=prop.getProperty("name1");
			this.clickMessage(str1);
	
}
}
