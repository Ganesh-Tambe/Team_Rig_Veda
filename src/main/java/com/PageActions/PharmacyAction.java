package com.PageActions;

import org.openqa.selenium.support.PageFactory;
import com.PageLocators.PharmacyLocator;
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
}
