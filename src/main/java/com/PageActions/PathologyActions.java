package com.PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageLocators.PathologyLocators;
import com.utilies.HelperClass;

public class PathologyActions {
	PathologyLocators objlocator=null;
	
	public PathologyActions() {
		this.objlocator=new PathologyLocators();
		PageFactory.initElements(HelperClass.getDriver(), objlocator);
		
	}
	
	public void Clickpathology() {
		objlocator.clickPathology.click();
	}
	public void Clicksearch(String Value) {
		objlocator.clickSearch.sendKeys(Value);
	}
	public void  ClickcaseId() {
		objlocator.clickCaseId.click();
	}
	
	public void getAllData()
	{
	   // Now get all the TR elements from the table
	   List<WebElement> allRows = objlocator.table.findElements(By.tagName("tr"));
	   
	// And iterate over them, getting the cells
	for (WebElement row : allRows)
	  {
	    List<WebElement> cells = row.findElements(By.tagName("td"));
	    for (WebElement cell : cells) 
	    {
	        System.out.println("content >>   " + cell.getText());
	    }
	  }
	}
	
	public void ClickViewPayments() {
		objlocator.clickOnViewPayments.click();
	}
	public String ValidateText() {
		
			return objlocator.Validate.getText();
			}

}
