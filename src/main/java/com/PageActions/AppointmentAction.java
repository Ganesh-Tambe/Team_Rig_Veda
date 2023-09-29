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

	AppointmentLocator appointmentlocator = null;
	String str, str1;

	public AppointmentAction() {
		this.appointmentlocator = new AppointmentLocator();
		PageFactory.initElements(HelperClass.getDriver(), appointmentlocator);
	}

	public void clickappointment() {
		WebElement add=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(appointmentlocator.clickAppointment));
		add.click();
		//appointmentlocator.clickAppointment.click();

	}

	public void clickaddappointment() {
		WebElement addapp=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(appointmentlocator.clickAddAppointment));
				addapp.click();
		//appointmentlocator.clickAddAppointment.click();
	}

	public void clickOndate() {
		WebElement date=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(appointmentlocator.clickOnDate));
		date.click();

		//appointmentlocator.clickOnDate.sendKeys("09/30/2023");

			
			JavascriptExecutor js = (JavascriptExecutor)HelperClass.driver;
						js.executeScript("document.getElementById('dates').removeAttribute('readonly');", appointmentlocator.clickOnDate);
			appointmentlocator.clickOnDate.sendKeys("09/30/2023"); 

	}

	public void clickSpecialist(){
		WebElement clkslt=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(appointmentlocator.clickSpecialist));
		clkslt.click();
		//appointmentlocator.clickSpecialist.click();
		Select dropDown = new Select(appointmentlocator.clickSpecialist);
		dropDown.selectByIndex(1);
		// HelperClass.wait.until(ExpectedConditions.visibilityOfElementLocated(appointmentlocator.clickSpecialist));

	}

	public void clickdoctor(){
		WebElement clkdoc=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(appointmentlocator.clickDoctor));
		clkdoc.click();
	//	appointmentlocator.clickDoctor.click();
		Select dropDown = new Select(appointmentlocator.clickDoctor);
		dropDown.selectByIndex(3);

	}

	public void clickshift(){
		WebElement clkshf=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(appointmentlocator.clickShift));
		clkshf.click();
	//	appointmentlocator.clickShift.click();
		Select dropDown = new Select(appointmentlocator.clickShift);
		dropDown.selectByIndex(2);
	}

	public void clickSlot(){
		WebElement clkslot=HelperClass.wait.until(ExpectedConditions.elementToBeClickable(appointmentlocator.clickOnSlot));
		clkslot.click();
	//	appointmentlocator.clickOnSlot.click();
		Select dropDown = new Select(appointmentlocator.clickOnSlot);
		dropDown.selectByIndex(1);

	}

	public void Appointmentpriority(){
		appointmentlocator.clickOnAppointmentPriority.click();
		Select dropDown = new Select(appointmentlocator.clickOnAppointmentPriority);
		dropDown.selectByIndex(2);
	}

	public void clickMessage(String name){
		appointmentlocator.clickMessage.sendKeys("demo", Keys.ENTER);
	}

	public void clickConsult(){
		appointmentlocator.clickLiveConsult.click();
	}

	public void clickAvailableslot() {
		appointmentlocator.clickAvailableSlot.click();
	}

	public void clickSave() {
		appointmentlocator.clickOnSave.click();

	}

	public void Search() {
		appointmentlocator.Search.sendKeys("Sansa Gomez", Keys.ENTER);

	}

	public void clickingshow() {

		appointmentlocator.clickshow.click();
	}

	public String ValidatingText() {
		WebElement text = HelperClass.wait
				.until(ExpectedConditions.elementToBeClickable(appointmentlocator.ValidateText));
		return text.getText();

	}

	public void Appoint()  {
		Properties prop = new Properties();
		str = prop.getProperty("name");
		this.clickMessage(str);
		str1 = prop.getProperty("name1");
		this.clickMessage(str1);

	}
}
