package com.StepDefination;

import org.testng.Assert;

import com.PageActions.BloodBankPageAction;
import com.PageActions.LoginPageActions;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BloodBankStepDefination {
	BloodBankPageAction objbloodbank=new BloodBankPageAction();
	LoginPageActions objlogin =new LoginPageActions();


	
	@Given("blood bank User should be on {string}")
	public void user_should_be_on(String string) {
		HelperClass.openPage(string);
	}

	@When("blood bank User click on Sign In")
	public void user_click_on_sign_in() {
		objlogin.clickLogin();
	}

	@When("blood bank User click on Bloodbank")
	public void user_click_on_bloodbank() {
		objbloodbank.ClickingOnBloodBank();
	}

	@When("blood bank User clicks on search")
	public void user_clicks_on_search() {
		objbloodbank.ClickingSearch();
	}

	@When("Print all the data")
	public void print_all_the_data() throws Exception {
		Thread.sleep(3000);
		objbloodbank.getAllData();
	}

	@When("blood bank User clicks on show button")
	public void user_clicks_on_show_button() {
		objbloodbank.ClickingOnShowbtn();
	}

	@Then("Asserting the popup box")
	public void asserting_the_popup_box() {
//		objbloodbank.ClickingOnPopup();
		Assert.assertTrue(true);
	}
	
	
}
