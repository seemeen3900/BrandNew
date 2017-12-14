package com.stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registrationPage {
	
	private WebDriver driver;
	@Given("^user  visit newtours homepage$")
	public void user_visit_newtours_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webDrivers\\chromedriver.exe");//invoking browser
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

	 }

	@When("^user click on register link$")
	public void user_click_on_register_link() throws Throwable {
	   
		newToursHomePage nthp = new newToursHomePage(driver);
		nthp.registerlink().click();


	}

	@When("^user enter userName, password, confirm password, and click submit$")
	public void user_enter_userName_password_confirm_password_and_click_submit() throws Throwable {
	 
	}

	@Then("^user recieves a confirmation$")
	public void user_recieves_a_confirmation() throws Throwable {
	  
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	   
	}
	
	

}
