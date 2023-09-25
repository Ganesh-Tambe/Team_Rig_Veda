package com.StepDefination;

import org.testng.Assert;

import com.PageActions.LoginPageActions;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	LoginPageActions objLoginAction=new LoginPageActions();
	
	@Given("USer Should be on {string}")
	public void u_ser_should_be_on(String url) {
	    // Write code here that turns the phrase above into concrete actions
	  HelperClass.openPage(url);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_pat1_and_password(String username,String password) {
	    // Write code here that turns the phrase above into concrete actions
	   objLoginAction.setuserName(username);
	   objLoginAction.setpassword(password);
	   
	}

	@When("User clicks the Sign In button")
	public void user_clicks_the_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    objLoginAction.clickLogin();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	  Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demo.smart-hospital.in/patient/dashboard");
	}
	
	@Then("User should Not logged in successfully")
	public void user_should_not_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		  Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demo.smart-hospital.in/site/userlogin");
	}


}
