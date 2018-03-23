package stepDefinition;

import action.HomePageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webDriver.Driver;

public class HomePageSteps {
	
	Driver driver = new Driver();
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		HomePageAction.navigate(driver.getCurrentDriver());
	}
	
	@When("^I enter an item in the search text box$")
	public void i_enter_an_item_in_the_search_text_box() throws Throwable {
		HomePageAction.enterSearchItem();
	}

	@When("^I select an item from the auto select list$")
	public void i_select_an_item_from_the_auto_select_list() throws Throwable {
		HomePageAction.selectFromAutoSelect();    
	}

	@Then("^Verify the search items are displayed$")
	public void verify_the_search_items_are_displayed() throws Throwable {
		HomePageAction.validateTitle();
	   
	}

}
