package com.PageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.PageLocators.CalenderPageLocator;
import com.utilies.HelperClass;

public class CalenderPageAction {
	
	CalenderPageLocator objCalenderLocator;
	
	public CalenderPageAction(){
		this.objCalenderLocator=new CalenderPageLocator();
		PageFactory.initElements(HelperClass.getDriver(), objCalenderLocator);		
	}
	
	public void clickCalender(){
		objCalenderLocator.calender.click();
	}
	
	public void clickTO_DO_List(){
		objCalenderLocator.TO_DO_List.click();
	}
	
	public void clickenterTitle(){
		objCalenderLocator.enterTitle.sendKeys("Come For Regular ChekUp");
	}
	public void clickenterDate(){
		objCalenderLocator.enterDate.click();
		//objCalenderLocator.clickDate.click();
		
		
		JavascriptExecutor js = (JavascriptExecutor)HelperClass.driver;

		

		js.executeScript("document.getElementById('task-date').removeAttribute('readonly'),arguments[0].value = '';", objCalenderLocator.enterDate);

		objCalenderLocator.enterDate.sendKeys("09/30/2023");
	
	}
	
	public void clickSave(){
		objCalenderLocator.clickSave.click();
	}
	
	public void clicSave(){
		objCalenderLocator.clickSave.click();
	}
	

}
