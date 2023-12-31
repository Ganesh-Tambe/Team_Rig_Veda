package com.PageActions;

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
		// Now get all the TR elements from the table

		List<WebElement> allRows = rlocator.table.findElements(By.tagName("tr"));
//		int i=0;
//		for (WebElement row : allRows) {
//
//			List<WebElement> cells = row.findElements(By.tagName("td"));
//
//			//h.put(i++,cells);
//			for (WebElement cell : cells) {
//
//				System.out.println("content >>   " + cell.getText());
//
//			}
//
//			System.out.println("\n");
//		}	

		for (int i = 0; i < allRows.size(); i++) {
		    WebElement row = allRows.get(i);
		    List<WebElement> cells = row.findElements(By.tagName("td"));

		    for (int j = 0; j < cells.size(); j++) {
		        WebElement cell = cells.get(j);
		        System.out.println("Row " + i + ", Column " + j + " content >>   " + cell.getText());
		    }

		    System.out.println("\n");
		}

	}
	
	
	public void searchbill(String name) {
		// TODO Auto-generated method stub
		rlocator.search.sendKeys(name);
	}
	
	
	
	
	////////////////////////////////////
	public void clickview() {
		rlocator.view.click();
		
	}
	
	public String getBillno() {
		
		String name =rlocator.billnotxt.getText();
		return name;
	}
	
	public void  closetab() {
		rlocator.closetab.click();
	}
	
	
//--------------------------   methods for third scenario   ------------------------
	
	public void searchCaseid(String caseid) {
		rlocator.searchbillno.sendKeys(caseid);
	}
	
	public void click_on_view() {
		String burl =HelperClass.getDriver().getCurrentUrl();
		rlocator.view_details_click.click();
		
	}
	
	public String  assertText() {
//		String parentWindowHandle = HelperClass.getDriver().getWindowHandle();
//		for (String windowHandle : HelperClass.getDriver().getWindowHandles()) {
//		    if (!windowHandle.equals(parentWindowHandle)) {
//		        HelperClass.getDriver().switchTo().window(windowHandle);
//		        break;
//		    }
//		}
//
//		// Now you are in the new window, and you can interact with its elements
//
//		// To switch back to the parent window, you can use:
//		HelperClass.getDriver().switchTo().window(parentWindowHandle);
//		return rlocator.assert_PayTxt.getText();
//	}
		String currurl=HelperClass.getDriver().getCurrentUrl();
		
		return currurl;
}
}


