package com.StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.PageActions.LoginPageActions;
import com.utilies.ExcelReader;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	LoginPageActions objLoginAction=new LoginPageActions();
	Logger log;
	
	@Given("USer Should be on {string}")
	public void u_ser_should_be_on(String url) {
	    // Write code here that turns the phrase above into concrete actions
		log =LogManager.getLogger(LoginPageActions.class);
	  HelperClass.openPage(url);
	}

//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_pat1_and_user(String username,String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		 objLoginAction.setuserName(username);
//	     objLoginAction.setpassword(password);
//	}
	@When("user enters {string} and {int}")
	public void user_enters_pat1_and(String username,Integer rownumber) throws InvalidFormatException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		
		ExcelReader excelReader = new ExcelReader();

		List<Map<String,String>> LoginData= excelReader.getData("src/main/java/com/testdata/loginCredentials.xls", username);
        String username1= LoginData.get(rownumber).get("UserName");
	    String password= LoginData.get(rownumber).get("Password");
		
     objLoginAction.setuserName(username1);
      objLoginAction.setpassword(password);
      log.info("This is an informational message");
	   
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
	
	@When("user clicks on profile")
	public void user_clicks_on_profile() {
	    // Write code here that turns the phrase above into concrete actions
	    objLoginAction.clickProfile();
	}

	@When("user clicks on logout")
	public void user_clicks_on_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    objLoginAction.clickLogout();
	}
	
	@Then("User should be logged out successfully")
	public void user_should_be_logged_out_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demo.smart-hospital.in/site/userlogin");
	}



}
