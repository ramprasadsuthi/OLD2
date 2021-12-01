package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calc {
	
	int sum, a, b;
	
	@Given("user gets {int} and {int}")
	public void user_gets_and(int int1, int int2) {
		
		a = int1;
		b = int2;
	    
	}
	@When("user adds a and b")
	public void user_adds_a_and_b() {
		
		sum = a+b;
		System.out.println("Sum of a+b is : " + sum);

	}
	@Then("validate the result {int}")
	public void validate_the_result(int expResult) {
		Assert.assertEquals(sum, expResult);
	}

}
