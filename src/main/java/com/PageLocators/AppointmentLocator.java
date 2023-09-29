package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppointmentLocator {

	
		@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/patient/dashboard/appointment']")
			public WebElement clickAppointment;
	
		@FindBy(xpath="//a[@class='btn btn-primary btn-sm']")
		public WebElement clickAddAppointment;
	
		@FindBy(id="dates")
		public WebElement clickOnDate;
		
		@FindBy(xpath="//select[@id='specialist']")
		public WebElement clickSpecialist;
		
		@FindBy(xpath="//select[@id='doctor']")
		public WebElement clickDoctor;
	
		@FindBy(xpath="//select[@id='global_shift']")
			public WebElement clickShift;
			
		@FindBy(xpath="//select[@id='shift_id']")
		public WebElement clickOnSlot;
	
		@FindBy(xpath="//select[@name='priority']")
		public WebElement clickOnAppointmentPriority;
		
		@FindBy(id="message")
			public WebElement clickMessage;
			
		@FindBy(id="live_consult")
		public WebElement clickLiveConsult;
	
		
		@FindBy(id="formaddbtn")
		public WebElement clickOnSave;
		

		@FindBy(xpath="//span[@id='slot_2']")
			public WebElement clickAvailableSlot;


		@FindBy(xpath="//input[@aria-controls='DataTables_Table_0']")
		public WebElement Search;
		
		@FindBy(xpath="//a[@class=\"btn btn-default btn-xs\"]")
		public WebElement clickshow;
		
		
	//	@FindBy(css=".modal-title:nth-child(3)")
		@FindBy(xpath="//h4[text()='Appointment Details']")
		public WebElement ValidateText;
		
}
