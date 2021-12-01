package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import baseMethods.BaseClass;

public class Login1 {
	
	String username, password;
	BaseClass base;
	
	@Given("user gets {string} and {string}")
	public void user_gets_and(String uname, String pwd) {
		
		username = uname;
		password = pwd;
		base = new BaseClass();
		base.openBrowser();
		base.launchERP();
		base.loginERP1(username, password);
		    
	}
	
	@Then("display the username and password")
	public void display_the_username_and_password() {
	    
		System.out.println("Username is : " + username);
		System.out.println("Password is : " + password);
	}


}
