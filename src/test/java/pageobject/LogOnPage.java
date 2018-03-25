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
	
	public static WebElement continueButton() {
		return driver.findElement(By.id("continue"));
	}
	
	public static WebElement usernameDisplay() {
		return driver.findElement(By.cssSelector("div.a-row:nth-child(2) > span:nth-child(1)"));
	}
	
	public static WebElement passwordTxb() {
		return driver.findElement(By.id("ap_password"));
	}
	
	public static WebElement signInButton() {
		return driver.findElement(By.id("signInSubmit"));
	}
	
	public static WebElement invalidUserDisplay() {
		return driver.findElement(By.id("auth-error-message-box"));
	}
}
