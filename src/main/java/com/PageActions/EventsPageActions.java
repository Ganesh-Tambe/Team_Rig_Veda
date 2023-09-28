package com.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.PageLocators.EventsPageLocators;
import com.utilies.HelperClass;
public class EventsPageActions {
	EventsPageLocators objlocator=null;
	
	public EventsPageActions(){
		this.objlocator=new EventsPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objlocator);
		
	}
	
	public void clickEvents() {
		objlocator.clickEvents.click();
		
	}
	
	public void clickViewDetails() {
		objlocator.clickViewDetails.click();
	}
	
	public void Validate() {
		objlocator.Validate.click();
	}

}
