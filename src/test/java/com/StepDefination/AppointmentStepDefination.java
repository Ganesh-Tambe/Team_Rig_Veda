package com.StepDefination;

import org.testng.Assert;

import com.PageActions.AppointmentAction;
import com.PageActions.LoginPageActions;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppointmentStepDefination {
	AppointmentAction appointmentaction=new AppointmentAction();
	LoginPageActions objlogin =new LoginPageActions();
	String name1;
	
	@Given("users should be on {string}")
	public void users_should_be_on(String string) {
	    HelperClass.openPage(string);
	}

	@When("users click on Sign In")
	public void users_click_on_sign_in() {
		objlogin.clickLogin();
	}

	@When("Click on myappointments")
	public void click_on_myappointments() throws Exception {
		appointmentaction.clickappointment();
	}

	@When("Click on AddAppointment")
	public void click_on_add_appointment() throws Exception {
		appointmentaction.clickaddappointment();
	}

	@When("click on Date")
	public void click_on_date() throws Exception {
		appointmentaction.clickOndate();
	}


	@When("Click on Specialist")
	public void click_on_specialist() throws Exception {
		appointmentaction.clickSpecialist();
	}

	@When("Click on Doctor")
	public void click_on_doctor() throws Exception {
		appointmentaction.clickdoctor();
	}

	@When("click on Shift")
	public void click_on_shift() throws Exception {
		appointmentaction.clickshift();
	}

	@When("click on Slot")
	public void click_on_slot() throws Exception {
		appointmentaction.clickSlot();
	}

	@When("click on Appointmentpriority")
	public void click_on_appointmentpriority() throws Exception {
		appointmentaction.Appointmentpriority();
	}

	@When("click on Message")
	public void click_on_message() throws Exception {
		appointmentaction.clickMessage("str");
	}
	
	@When("click on Available slot")
	public void click_on_available_slot() {
		appointmentaction.clickAvailableslot();
	}

	@Then("click on Save")
	public void click_on_save() {
		appointmentaction.clickSave();
	}
	
	@When("Click on Search")
	public void click_on_search() throws InterruptedException {
		appointmentaction.Search();
	}

	@When("Click on Show")
	public void click_on_show() throws InterruptedException {
		appointmentaction.clickingshow();
	}
	
	
	@Then("Assert user is on popup box")
	public void assert_user_is_on_popup_box() {
		System.out.println(appointmentaction.ValidatingText());
	   Assert.assertEquals("Appointment Details", appointmentaction.ValidatingText());
	}

}
