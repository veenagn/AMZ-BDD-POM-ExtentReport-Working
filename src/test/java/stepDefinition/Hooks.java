//package stepDefinition;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//
//import webDriver.Driver;
//
//public class Hooks extends Driver {
//
//	
//	@After()
//	public void tearDown(Scenario scenario) {
//	    if (scenario.isFailed()) {
//	            final byte[] screenshot = ((TakesScreenshot) driver)
//	                        .getScreenshotAs(OutputType.BYTES);
//	            scenario.embed(screenshot, "image/png"); //stick it in the report
//	    }
//	    driver.close();
//	}
//}
