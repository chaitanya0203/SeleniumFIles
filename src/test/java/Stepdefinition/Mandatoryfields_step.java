package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Main_java.Mandatoryfields;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mandatoryfields_step {
	WebDriver driver;
	Mandatoryfields obj=new Mandatoryfields(driver);
	@Given("^open_the_url_in a browser$")
	public void open_the_url_in_a_browser() {
		obj.url();
	}

	@When("^the url is opened click on demosite$")
	public void the_url_is_opened_click_on_demosite() {
		obj.loginpage();
	}

	@Then("^fill only mandatory fields in the register form$")
	public void fill_only_mandatory_fields_in_the_register_form() {
		obj.demo();
		obj.Attributes();
	}
	

	@Then("^click_on submit button$")
	public void click_on_submit_button() throws IOException, InterruptedException{
		obj.Submit();
		obj.screenshot("Screenshots//mandatory.png");
		obj.quit();
	}

}
