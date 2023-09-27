package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppointmentLocator {

	//navigate to web page and click on Appointment
		@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/patient/dashboard/appointment']")
			public WebElement clickAppointment;
		
		@FindBy(xpath="//a[@class='btn btn-primary btn-sm']")
		public WebElement clickAddAppointment;
		
		@FindBy(id="dates")
		public WebElement clickOnDate;
		
		@FindBy(xpath="/html/body/div[5]/div[1]/table/tbody/tr[5]/td[6]")
		public WebElement selectDate;
		
		@FindBy(xpath="//select[@id='specialist']")
		public WebElement clickSpecialist;

		
		@FindBy(xpath="//select[@id='doctor']")
		public WebElement clickDoctor;
		
//		@FindBy(xpath="//li[@id='select2-doctor-result-0irl-11']")
//			public WebElement clickAmitSingh;
//		
		@FindBy(xpath="//select[@id='global_shift']")
			public WebElement clickShift;
		
//		@FindBy(xpath="//li[@id='select2-global_shift-result-stvj-1']")
//			public WebElement clickMorning;
//		
//		@FindBy(xpath="//div[@class='col-sm-6']")
//			public WebElement clickLiveConsultaion;
//		
//		@FindBy(xpath="//input[@type='text']")
//			public WebElement clickDate;
		
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
		
//		@FindBy(xpath="//textarea[@id='custom_fields[appointment][4]']")
//			public WebElement clickAlternateMessage;
//		//
		@FindBy(xpath="//span[@id='slot_2']")
			public WebElement clickAvailableSlot;
//		
//		@FindBy(xpath="//span[@id='slot_7']")
//			public WebElement clickTime;
//		
//		@FindBy(xpath="//button[@id='submitbtn']")
//			public WebElement clickSubmit;

		@FindBy(xpath="//input[@aria-controls='DataTables_Table_0']")
		public WebElement Search;
		
		@FindBy(xpath="//a[@data-record-id=\"1616\"]")
		public WebElement clickshow;
		
		
		@FindBy(xpath="//button[@class='c01123 c01154']")
		public WebElement clickCancel;
		
		
}
