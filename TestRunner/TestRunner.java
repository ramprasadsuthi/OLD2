package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		//features = {"Feature\\erp4.feature", "Feature\\erp5.feature" },
		//features = {"Feature\\test1.feature", "Feature\\test2.feature" },
		features = "Feature\\test1.feature",
		glue={"stepDefinition"},
		publish = true,
		monochrome = true)

public class TestRunner {
	
}
