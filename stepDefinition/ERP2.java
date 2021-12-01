package stepDefinition;

import baseMethods.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ERP2 {
	
	BaseClass base;
	
	@Given("Open Browser")
	public void open_browser() {
	   
		System.out.println("This is for to write open Browser code..");
		base = new BaseClass();
		base.openBrowser();
		
	}
	
	@Given("Launch ERP Application")
	public void launch_erp_application() {
		
		System.out.println("This is for to write Launch ERP Application code..");
		base.launchERP();
	   
	}
	@When("Login user login with valid user credentials")
	public void login_user() {
		
		System.out.println("This is for to write Login ERP Application code..");
		base.loginERP();
	  
	}
	@Then("Login should be successful")
	public void verify_login() {
		
		System.out.println("This is for to write validate the login details..");
	   
	}
	@Then("User Clicks on Logout link")
	public void logout_link() {
	    base.logout();
	}

}
