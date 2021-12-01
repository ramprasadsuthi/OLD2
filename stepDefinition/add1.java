package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class add1 {
	
	@Given("user enter a and b")
	public void user_enter_a_and_b() {
	    
		System.out.println("Enter a: ");
		System.out.println("Enter b: ");
	}
	@When("calculates addition of two numbers")
	public void calculates_addition_of_two_numbers() {
		
		System.out.println("add a+b: ");
	}
	
	@Then("display the result")
	public void display_the_result() {
		
		System.out.println("Sum of a+b is : ");
	}


}
