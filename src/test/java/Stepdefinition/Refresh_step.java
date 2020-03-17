package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Main_java.Refresh;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Refresh_step {
	WebDriver driver;
	Refresh ref= new Refresh(driver);
	@Given("^the user has launched the browser$")
	public void the_user_has_launched_the_browser() {
	ref.url();
	}

	@When("^the url is open and click on demosite$")
	public void the_url_is_open_and_click_on_demosite(){
		ref.loginpage();
		ref.MyAccount();
		ref.logindetails();
		ref.login();
		
	}

	@Then("^fill all the details$")
	public void fill_all_the_details() throws InterruptedException {
		ref.demo();
		ref.Attributes();
		
	}

	@Then("^click on refresh$")
	public void click_on_refresh() throws IOException, InterruptedException {
		ref.Refresh1();
		ref.screenshot("Screenshots//refresh.png");
		ref.quit();
	}

}
