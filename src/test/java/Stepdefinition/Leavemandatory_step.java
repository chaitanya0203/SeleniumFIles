package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Main_java.Leavemandatory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Leavemandatory_step {
	WebDriver driver;
	Leavemandatory lm=new Leavemandatory(driver);
	@Given("^the url is open in the browser$")
	public void the_url_is_open_in_the_browser() {
		lm.url();
		lm.loginpage();
	}

	@When("^the demosite is clicked$")
	public void the_demosite_is_clicked() {
		lm.demo();
		
	}

	@When("^the details are given and leaving the mandatory fields$")
	public void the_details_are_given_and_leaving_the_mandatory_fields() throws InterruptedException{
		lm.Attributes();
		
	}

	@Then("^click on submit and take screenshot$")
	public void click_on_submit_and_take_screenshot() throws InterruptedException, IOException {
		lm.submit();
		lm.screenshot("Screenshots//leavemandatory.png");
		lm.quit();
	}

}
