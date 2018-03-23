package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "./src/test/resources/featureFiles" },
		//glue = { "webDriver", "stepDefinition", "testRunner" },
		glue = {"stepDefinition"},
		plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"},
		dryRun=false)
public class TestRunner {
	
	public static Scenario scenario;
	
}
