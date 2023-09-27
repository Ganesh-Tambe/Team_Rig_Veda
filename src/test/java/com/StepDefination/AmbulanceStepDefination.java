package com.StepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.PageActions.AmbulancePageAction;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmbulanceStepDefination {

	AmbulancePageAction objAmbulAction = new AmbulancePageAction();

	@Given("user should be on {string}")
	public void user_should_be_on(String string) {
		// Write code here that turns the phrase above into concrete actions
		HelperClass.openPage(string);
	}

	@When("user click on Ambulance")
	public void user_click_on_ambulance() {
		// Write code here that turns the phrase above into concrete actions
		objAmbulAction.clickAmbulance();
	}

	@When("prints the All Vehicle number")
	public void prints_the_all_vehicle_number() {
		// Write code here that turns the phrase above into concrete actions
		objAmbulAction.getAllData();

	}
	
	@When("search the Bill number")
	public void search_the_bill_number() {
	    // Write code here that turns the phrase above into concrete actions
	    objAmbulAction.searchBill();
	}


	@When("click on Pay")
	public void click_on_pay() {
		// Write code here that turns the phrase above into concrete actions
		JavascriptExecutor jse = (JavascriptExecutor)HelperClass.driver;
		jse.executeScript("window.scrollBy(0,1000)");
		objAmbulAction.clickPay();
	}

	@When("click on add")
	public void click_on_add() {
		// Write code here that turns the phrase above into concrete actions
		objAmbulAction.clickAdd();
	}

	@When("click on Pay Card")
	public void click_on_pay_card() {
		// Write code here that turns the phrase above into concrete actions
		objAmbulAction.clickPayCard();
	}

	@When("Enter the payment Details")
	public void enter_the_payment_details() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		HelperClass.driver.switchTo().frame(0);
		objAmbulAction.FillPayment();

	}

	@When("click on payment")
	public void click_on_payment() {
		// Write code here that turns the phrase above into concrete actions
		objAmbulAction.clickPayment();
		HelperClass.driver.switchTo().defaultContent();
	}

	@Then("Assert The Payment Success Message")
	public void assert_the_payment_success_message() {
		// Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(objAmbulAction.getSText(),"Success");
	}

}
