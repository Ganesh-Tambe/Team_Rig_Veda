package com.PageActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.util.Asserts;
import org.openqa.selenium.support.PageFactory;

import com.PageLocators.PharmacyLocator;
import com.aventstack.extentreports.util.Assert;
import com.utilies.HelperClass;



public class PharmacyAction {
	
	String bill_number;

	PharmacyLocator phlocator = new PharmacyLocator();
	
	public PharmacyAction() {
		this.phlocator=new PharmacyLocator();
		PageFactory.initElements(HelperClass.getDriver(), phlocator);
	}
	
		public void clickPharmacy() {
			phlocator.pharmacymenu.click();
		}
		
		public void search(String str) {
			phlocator.billsearch.sendKeys(str);
		}
		
		public void clickPay() {
			phlocator.paybtm.click();
		}
		
		public void clickAdd() {
			phlocator.addbtn.click();
		}
		
		public String  asserttext() {
			return phlocator.paydetails.getText();
		}

		///-------------------------///
		///----properties file -----///
		
		public void register() {
			
			File file = new File("C:\\Users\\kshirsat\\eclipse-workspace\\piletProject\\Team_Rig_Veda\\src\\test\\resources\\PharmacyData.properties");
			
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			// properties object for accessing the propertie file elements
			Properties prop = new Properties();
			// for loading properties file

			try {

				prop.load(fileInput);

			} catch (IOException e) {

				e.printStackTrace();

			}
			
			bill_number=prop.getProperty("bill_no");
			System.out.println("this is billno "+bill_number);
			
			this.search(bill_number);

		}

}
