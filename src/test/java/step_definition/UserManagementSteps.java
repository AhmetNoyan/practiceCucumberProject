package step_definition;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.LogInPage;
import utilities.DataReader;
import utilities.Driver;

public class UserManagementSteps {

	LogInPage loginpage=new LogInPage();
	
	
	@Given("As a user, I am on the login page")
	public void as_a_user_i_am_on_the_login_page() {
	    Driver.getDriver().get(DataReader.getProperty("appUrl"));
	    
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
	   loginpage.emailField.sendKeys(DataReader.getProperty("username"));
	   loginpage.password.sendKeys(DataReader.getProperty("password"));
	}

	@When("I clicked on login button")
	public void i_clicked_on_login_button() {
	   loginpage.button.click();
	}

	@Then("I should be on user profile page")
	public void i_should_be_on_user_profile_page() {
	    Assert.assertTrue(loginpage.header.isDisplayed());
	}
	
	
	@Given("As a user, I am on the login page")
	public void as_a_user_i_am_on_the_login_page1() {
	    Driver.getDriver().get(DataReader.getProperty("appUrl"));
	}

	@When("I enter invalid username and valid password")
	public void i_enter_invalid_username_and_valid_password() {
	    loginpage.emailField.sendKeys(DataReader.getProperty("invalidUserName"));
	    loginpage.password.sendKeys(DataReader.getProperty("password"));
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    loginpage.button.click();
	}

	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should not be logged in")
	public void i_should_not_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
