package com.statravel.stepDefinitions;

import com.statravel.base.BaseUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestStepDefinitions extends BaseUtil{


	    @Given("^User launches facebook facebook application$")
	    public void user_launches_facebook_facebook_application() throws Throwable {
	        driver.navigate().to("https://www.facebook.com");
	    }

	    @Then("^Click on Login$")
	    public void click_on_login() throws Throwable {
	        
	    }

	    @And("^Enters username and password$")
	    public void enters_username_and_password() throws Throwable {
	        
	    }

	
	
}
