package action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;
import pageobject.HomePage;
import webDriver.Driver;

public class HomePageAction extends Driver{
	
	static WebDriverWait wait = new WebDriverWait(driver,20);
	
	//Create a constructor to instantiate driver from Driver
	public HomePageAction() {
		PageFactory.initElements(driver, this);
	}
	
	public static void navigate(WebDriver driver) {
		String url = prop.getProperty("url");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(url);
	}
		
	public static void enterSearchItem() {
		String searchtext = prop.getProperty("searchtext");
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.searchField()));
		HomePage.searchField().clear();
		HomePage.searchField().sendKeys(searchtext);		
	}	
	
	public static void selectFromAutoSelect() {
		String selectItem = prop.getProperty("autoselect");
		List<WebElement> optionsToSelect = HomePage.autoSelectItem();
		for (WebElement option : optionsToSelect) {
			if (option.getText().equalsIgnoreCase(selectItem)) {
				option.click();
				break;
			}
		}
	}
	public static void validateTitle() {
		String expectedResultTile = prop.getProperty("expectedResultTitle");
		String actualResultTiltle = driver.getTitle();
		Assert.assertEquals(expectedResultTile, actualResultTiltle);
	}
}
