package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\abhishek.goyal2\\workspace\\SiginPOCCucumberPOM\\src\\main\\java\\sign\\qa\\features\\SignIn.feature"
		,glue={"com\\qa\\stepDefinitions"},
		format= {"pretty","html:test-output","json:test-output/cucumber.json","junit:junitxml/cucumber.xml"},
		monochrome=true,
		dryRun=false,
		strict=true
		
//				tags = {"@End2End,@RegressionTest,@Smoke" }	
		)
public class TestRunnerSign {

	
}
