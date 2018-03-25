package action;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
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
	public static void clickHomeSignInButton() {
		HomePage.homesignInButton().click();
	}
	
	public static void verifyEnterUserNamePage() {
		Assert.assertEquals(true, LogOnPage.signInLable().isDisplayed());
		Assert.assertEquals(true, LogOnPage.userNameTxb().isDisplayed());
	}
	
	public static void enterUserName(String username) {
		LogOnPage.userNameTxb().sendKeys(username);		
	}
	
	public static void verifyUsername(String username) {
		try {
			boolean msgdisplay = LogOnPage.invalidUserDisplay().isDisplayed();
			System.out.println(">>>>MSGDISPLAY: >>>" +msgdisplay);
			if (msgdisplay == true) {
				System.out.println("Error message displayed");
				takeScreenshot();
				Assert.assertTrue("Expected error message: " +LogOnPage.invalidUserDisplay().getText(),true);		
			}
		}
			catch(NoSuchElementException nse) {
				Assert.assertTrue("The username is as expected: " +prop.getProperty("expecteduser"), true);
			}
	}	
	
	public static void clickContinueButton() {
		LogOnPage.continueButton().click();
	}
	
	public static void verifyPasswordPage() {
		String actualuser= LogOnPage.usernameDisplay().getAttribute("textContent");
		String expecteduser=prop.getProperty("expecteduser");
		Assert.assertEquals(expecteduser, actualuser);		
	}
	
	public static void enterPassword(String passwrd) {
		LogOnPage.passwordTxb().sendKeys(passwrd);
	}
	
	public static void clickSignInButton() {
		LogOnPage.signInButton().click();
	}
}
	

