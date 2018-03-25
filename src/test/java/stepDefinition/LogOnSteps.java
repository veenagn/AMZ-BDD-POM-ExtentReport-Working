package stepDefinition;

import action.LogOnAction;
import cucumber.api.java.en.Then;

public class LogOnSteps {

	@Then("^I click on the sign in button$")
	public void i_click_on_the_sign_in_button() throws Throwable {
		LogOnAction.clickHomeSignInButton();
	}

	@Then("^I am displayed username textbox to enter email address$")
	public void i_am_displayed_username_textbox_to_enter_email_address() throws Throwable {
		LogOnAction.verifyEnterUserNamePage();
	}

	@Then("^I enter the (.*) in the email text box$")
	public void i_enter_the_username_in_the_email_text_box(String usernm) throws Throwable {
		LogOnAction.enterUserName(usernm);
	}

	@Then("^Click continue button$")
	public void click_continue_button() throws Throwable {
		LogOnAction.clickContinueButton();
	}

	@Then("^I am displayed password textbox to enter password$")
	public void i_am_displayed_password_textbox_to_enter_password() throws Throwable {
		LogOnAction.verifyPasswordPage();
	}

	@Then("^I enter the (.*) in the password textbox$")
	public void i_enter_the_password_in_the_password_textbox(String passwrd) throws Throwable {
		LogOnAction.enterPassword(passwrd);
	}

	@Then("^Click on the password signin button$")
	public void click_on_the_password_signin_button() throws Throwable {
		LogOnAction.clickSignInButton();
	}
	
	@Then("^I verify the (.*) username$")
	public void i_verify_the_username_username(String usr) throws Throwable {
		LogOnAction.verifyUsername(usr);
	}

	@Then("^I verify that I have logged in sucessfully$")
	public void i_verify_that_I_have_logged_in_sucessfully() throws Throwable {

	}
}
