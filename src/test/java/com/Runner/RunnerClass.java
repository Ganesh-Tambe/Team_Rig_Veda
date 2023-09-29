package com.Runner;


 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class RunnerClass {
	@CucumberOptions(
			features = { "src\\test\\resources\\Features\\LoginHospital.feature"},
			tags = "@Negative_With_Excel",
			glue = "com.StepDefination",
		    plugin={"usage","junit:target/cucumber.reports/cucumber.xml"})
			//plugin = {"rerun:target/failedtest.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	}

}
 



