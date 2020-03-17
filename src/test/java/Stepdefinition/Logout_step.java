package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Main_java.Logout;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logout_step {
	WebDriver driver;
	Logout lg=new Logout(driver);
	@Given("^open the url$")
	public void open_the_url() {
		lg.url();
	}

	@When("^url is launched login to the application$")
	public void url_is_launched_login_to_the_application() {
		
		lg.loginpage();
		lg.MyAccount();
	}

	@When("^enters the email and password and click on login$")
	public void enters_the_email_and_password_and_click_on_login() {
		lg.logindetails();
		lg.login();
	}

	@Then("^click on logout$")
	public void click_on_logout() throws IOException {
		lg.logout();
		lg.screenshot("Screenshots//logout.png");
		lg.quit();
	}

}
