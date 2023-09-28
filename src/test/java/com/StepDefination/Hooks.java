package com.StepDefination;



import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilies.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	@Before
	public void before() {
	
		HelperClass.setDriver();;

	}
	
	@After(order = 1)
	public void takeScreenshot(Scenario scenario) throws IOException{
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");

		}else {
			TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");
		}
	}


	@After(order = 0)
	public void after() {
		HelperClass.tearDown();
	}

}
