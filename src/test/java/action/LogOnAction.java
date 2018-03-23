package action;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.HomePage;
import pageobject.LogOnPage;
import webDriver.Driver;

public class LogOnAction extends Driver {

	static WebDriverWait wait = new WebDriverWait(driver,20);
	//HomePage homePage = new HomePage();
	
	public LogOnAction() {
		PageFactory.initElements(driver, this);
	}
	public static void clickSignInButton() {
		HomePage.signInButton().click();
	}
	
	public static void verifyEnterUserNamePage() {
		Assert.assertEquals(true, LogOnPage.signInLable().isDisplayed());
		Assert.assertEquals(true, LogOnPage.userNameTxb().isDisplayed());
	}
	
	public static void enterUserName(String username) {
		LogOnPage.userNameTxb().sendKeys(username);		
	}
}
	

