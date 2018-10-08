package com.qa.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cqPlus.pages.HomePageSignin;
import cqPlus.pages.LoginPageSign;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cpPlus.util.SignBaseUd ;


@SuppressWarnings("unused")
public class SignHomePageStep extends SignBaseUd {
	SignBaseUd base = new SignBaseUd();
	public String url;
	
	
	
	// Opens the Browser and intailse driver
	@Given("^User Opens the new Browser$")
	public void User_Opens_the_Browser() throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
		driver = base.intializeDriver();
	}

	// Login Page Opens
	@Then("^User moves on login page$")
	public void User_is_on_login_page() throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();

		url = geturl("url");
		driver.get(url);
		driver.manage().window().maximize();
		Actions selectpract =new Actions(driver);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ext-comp-1050_header-title-textEl']")));
		selectpract.moveToElement(driver.findElement(By.xpath("//*[@id='ext-comp-1050_header-title-textEl']"))).build().perform();
	}

	// Browser is closed

	@Then("^Close the Signapp Browser$")
	public void Close_Browser() throws Throwable {
	
	// Express the Regexp above with the code you wish you had
		// throw new PendingException();
//	driver.manage().timeouts().implicitlyWait(BaseUd.wait, TimeUnit.SECONDS);
		driver.close();
		// driver=null;
	}

}
