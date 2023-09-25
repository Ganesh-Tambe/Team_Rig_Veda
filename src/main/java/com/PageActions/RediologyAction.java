package com.PageActions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.PageLocators.RedioLogyLocator;
import com.utilies.HelperClass;

public class RediologyAction {
	RedioLogyLocator rlocator;
	
	public RediologyAction() {
		this.rlocator=new RedioLogyLocator();
		PageFactory.initElements(HelperClass.getDriver(), rlocator);
	}
	
	public void clickRadiology() {
		rlocator.rediotable.click();
	}
	
	public void fetchdata()
	{
//		// Now get all the TR elements from the table

		List<WebElement> allRows = rlocator.table.findElements(By.tagName("tr"));
		HashMap<Integer, List<WebElement>> h = new HashMap<Integer, List<WebElement>>();
// And iterate over them, getting the cells

		int i=0;
		for (WebElement row : allRows) {

			List<WebElement> cells = row.findElements(By.tagName("td"));

			h.put(i++,cells);
			for (WebElement cell : cells) {

				System.out.println("content >>   " + cell.getText());

			}

			System.out.println("\n");

		}

	}
	
	
	public void printdata() {
	  
	}
	
}
