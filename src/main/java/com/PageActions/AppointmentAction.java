package com.PageActions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.PageLocators.AppointmentLocator;
import com.utilies.HelperClass;

public class AppointmentAction {

	AppointmentLocator appointmentlocator=null;
	//Select DropdwnSortBy = new Select(objLocators.DropdwnSortBy);

	//DropdwnSortBy.selectByIndex(5);
	String str,str1;
	
	public AppointmentAction() {
		this.appointmentlocator=new AppointmentLocator();
		PageFactory.initElements(HelperClass.getDriver(), appointmentlocator);
	}
		
	
		public void clickappointment() throws Exception {
			Thread.sleep(3000);
			appointmentlocator.clickAppointment.click();
			
		}
		
		public void clickaddappointment() throws Exception {
			Thread.sleep(3000);
			appointmentlocator.clickAddAppointment.click();
		}
		
		public void clickOndate() throws Exception {
			Thread.sleep(3000);
			appointmentlocator.clickOnDate.click();
			appointmentlocator.selectDate.click();
			
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
			//dropDown.selectByVisibleText("Amit Singh (9009)");
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
	
				
	
		
		public void  Search(String name1) {
			appointmentlocator.Search.sendKeys("Sansa Gomez",Keys.ENTER);
		}
		public void clickingshow() {
			appointmentlocator.clickshow.click();
		}
		
		public void ValidatingText() {
			return appointmentlocator.ValidateText.getText();
		}return objlocator.Validate.getText();
		
		
		public void Appoint() throws Exception {	
			Properties prop= new Properties();
			str=prop.getProperty("name");
			this.clickMessage(str);
			str1=prop.getProperty("name1");
			this.clickMessage(str1);
	
}
}
