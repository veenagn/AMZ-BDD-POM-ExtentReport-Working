package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
//import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import webDriver.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./src/test/resources/featureFiles" },
		// glue = { "webDriver", "stepDefinition", "testRunner" },
		glue = { "stepDefinition" }, 
		plugin = { "pretty", "html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
		dryRun = false)
public class TestRunner extends Driver {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(prop.getProperty("reportConfigPath")));
	}

}
