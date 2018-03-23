package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webDriver.Driver;

public class LogOnPage extends Driver {
	
	public static WebElement signInLable() {
		return driver.findElement(By.xpath("//h1[contains(text(),'Sign in')]"));
	}
	public static WebElement userNameTxb() {
		return driver.findElement(By.id("ap_email"));		
	}
	

}
