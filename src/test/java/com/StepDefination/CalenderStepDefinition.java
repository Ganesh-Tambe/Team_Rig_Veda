package com.StepDefination;

import com.PageActions.CalenderPageAction;
import com.PageActions.LoginPageActions;
import com.PageLocators.CalenderPageLocator;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalenderStepDefinition {
	
	CalenderPageAction objCalenderPageAction = new CalenderPageAction();
	LoginPageActions objlogin =new LoginPageActions();
	
	@Given("Calender User should be on {string}")
	public void ipd_user_should_be_on(String string) {
		HelperClass.openPage(string);
	    
	}

	@When("Calender User click on Sign In")
	public void ipd_user_click_on_sign_in() {
		 objlogin.clickLogin();
	}
	
	
	
	@When("Calender User click on calender")
	public void ipd_user_click_on_calender() {
		objCalenderPageAction.clickCalender();
	    
	}

	@When("Calender User click on TO-Do List add button")
	public void ipd_user_click_on_to_do_list_add_button() {
		objCalenderPageAction.clickTO_DO_List();
		
		
	}

	@When("Calender User enter title veriable")
	public void ipd_user_enter_title_veriable() {
		objCalenderPageAction.clickenterTitle();
		
	}

	@When("Calender User enter date by veriable")
	public void ipd_user_enter_date_by_veriable() {
		objCalenderPageAction.clickenterDate();

	
	}

	@When("Calender User Click on Save button")
	public void ipd_user_click_on_save_button() {
		objCalenderPageAction.clickSave();
		
		
	}
//
//	@Then("Calender User Assert title with Veriable")
//	public void ipd_user_assert_title_with_veriable() {
//
//		
//		
//	}

}
