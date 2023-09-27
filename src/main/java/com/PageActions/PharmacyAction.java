package com.PageActions;

import org.apache.http.util.Asserts;
import org.openqa.selenium.support.PageFactory;

import com.PageLocators.PharmacyLocator;
import com.aventstack.extentreports.util.Assert;
import com.utilies.HelperClass;



public class PharmacyAction {

	PharmacyLocator phlocator = new PharmacyLocator();
	
	public PharmacyAction() {
		this.phlocator=new PharmacyLocator();
		PageFactory.initElements(HelperClass.getDriver(), phlocator);
	}
	
		public void clickPharmacy() {
			phlocator.pharmacymenu.click();
		}
		
		public void search() {
			phlocator.billsearch.sendKeys("PHARMAB71");
		}
		
		public void clickPay() {
			phlocator.paybtm.click();
		}
		
		public void clickAdd() {
			phlocator.addbtn.click();
		}
		
		public void assettext() {
//			String asserttitle=phlocator.title.getText();
//			String expectedtitle="Payment Details";
//			
			boolean bool=phlocator.title.isDisplayed();
			
			if(bool) {
				System.out.println("Assertion Completed ,and user in on payment page ");
				
			}
			else {
				System.out.println("Assertion Failed ");
			}
			
//			// Assert.assertTrue(asserttitle.contains(expectedtitle), "Text 'Payment Details' is not found.");
//			 String actualText = "Payment Details";
//		        String expectedText = "Payment Details";
//
//		        // Perform the assertion
//		        if (actualText.equals(expectedText)) {
//		            System.out.println("Text assertion passed. Actual text matches expected text.");
//		        } else {
//		            System.err.println("Text assertion failed. Actual text does not match expected text.");
//		        }
			
		

		}
}
