package com.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalenderPageLocator {
	
	@FindBy(xpath= "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[3]/a")
	public WebElement calender;
	
	
	@FindBy(xpath= "//button[@class=\"btn btn-primary btn-sm pull-right\"]")
	public WebElement TO_DO_List;
	
	
	@FindBy(xpath= "//*[@id=\"task-title\"]")
	public WebElement enterTitle;
	
	
	@FindBy(xpath= "//*[@id=\"task-date\"]")//*[@id="task-date"]
	public WebElement enterDate;
	
	@FindBy(xpath= "/html/body/div[4]/div[1]/table/tbody/tr[5]/td[7]")
	public WebElement clickDate;
	
	
	
	@FindBy(xpath= "//*[@id=\"formaddbtn\"]")
	public WebElement clickSave;
	
	
//	@FindBy(xpath= "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[3]/a")
//	public WebElement calender;
	
	
//	@FindBy(xpath= "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[3]/a")
//	public WebElement calender;

}
