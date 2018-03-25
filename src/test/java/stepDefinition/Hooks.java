package stepDefinition;

import java.io.File;
import java.io.IOException;
//import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import webDriver.Driver;

public class Hooks extends Driver {
	
	@Before
	public void beforeScenario(Scenario scenario) {
	    Reporter.assignAuthor("Veena Amazon - Learn Cucumber-Selenium-POM-Reporting");
	    Reporter.setSystemInfo("MacOS", "v0.11");
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			//String screenshotName = UUID.randomUUID().toString();
			try {				
				File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				//destinationPath.mkdirs();
				Files.copy(sourcePath, destinationPath);   
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
				
			} catch (IOException e) {
			} 
		}
	}	
	
	@After(order = 0)
	public void AfterSteps() {
		driver.close();
	}
}
