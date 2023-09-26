package com.StepDefination;

import org.testng.Assert;

import com.PageActions.LoginPageActions;
import com.PageActions.OPDPageAction;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OPDStepDefination {
	
	OPDPageAction objOPDpageAction=new OPDPageAction();
	LoginPageActions objlogin =new LoginPageActions();
	
	@Given("User should be on {string}")
	public void user_should_be_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    HelperClass.openPage(string);
	}
	@When("user click on Sign In")
	public void user_click_on_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	   objlogin.clickLogin();
	}


	@When("user click on OPD")
	public void user_click_on_opd() {
	    // Write code here that turns the phrase above into concrete actions
	    objOPDpageAction.clickOPD();
	}

	@When("user click on Visit")
	public void user_click_on_visit() {
	    // Write code here that turns the phrase above into concrete actions
	    objOPDpageAction.clickVisit();
	}

	@When("user search the caseID;")
	public void user_search_the_case_id() {
	    // Write code here that turns the phrase above into concrete actions
	   objOPDpageAction.searchCaseId();
	}

	@When("Print all the search Results")
	public void print_all_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    objOPDpageAction.getAllData();
	}

	@When("user click on show button")
	public void user_click_on_show_button() {
	    // Write code here that turns the phrase above into concrete actions
	   objOPDpageAction.clickShow();
	}

	@Then("Assert the user is on popup box")
	public void assert_the_user_is_on_popup_box() {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(true);
	}
	
	@Then("close Show PopUp")
	public void close_show_pop_up() {
	    // Write code here that turns the phrase above into concrete actions
	    objOPDpageAction.clickPopUpClose();
	}
	
	
	@When("user click on Lab-Investigation")
	public void user_click_on_lab_investigation() {
	    // Write code here that turns the phrase above into concrete actions
		objOPDpageAction.clickLabInv();
	}

	@When("user search the test_name ;")
	public void user_search_the_test_name() {
	    // Write code here that turns the phrase above into concrete actions
		objOPDpageAction.searchTestName();
	}
	
	@When("user click on lab_show button")
	public void user_click_on_lab_show_button() {
	    // Write code here that turns the phrase above into concrete actions
	    objOPDpageAction.clicklabShow();
	}
	
	



}
