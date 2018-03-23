package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class HomePage extends Driver {

	public static WebElement searchField() {
		return driver.findElement(By.id("twotabsearchtextbox"));
	}

	public static List<WebElement> autoSelectItem() {
		return driver.findElements(By.className("s-suggestion"));
	}

	public static WebElement signInButton() {
		return driver.findElement(By.id("nav-signin-tooltip"));
	}

}
