package com.StepDefination;

import com.PageActions.EventsPageActions;
import com.utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EventStepDefination {
	
	EventsPageActions objaction=new EventsPageActions();
	
	@Given("User should be on the webpage {string}")
	public void user_should_be_on_the_webpage(String string) {
	    HelperClass.openPage(string);
	}

	@When("User clicks on Events")
	public void user_clicks_on_events() {
	 
	    
	}

	@When("user clicks on View Details")
	public void user_clicks_on_view_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user validates")
	public void user_validates() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
