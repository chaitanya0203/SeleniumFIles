package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Excelutility.Excel_data;
import Main_java.Invaliddetails;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Invaliddetails_step {
	WebDriver driver;
	Invaliddetails log=new Invaliddetails(driver);
	//Excel_data ed=new Excel_data(driver);
	@Given("^the user launch the browser$")
	public void the_user_launch_the_browser() {
		log.url();
	}

	@When("^the user opens the Practice automation website$")
	public void the_user_opens_the_Practice_automation_website() {
		log.loginpage();
		log.MyAccount();
	}

	@Then("^the user enter the email and password$")
	public void the_user_enter_the_email_and_password() throws IOException {
		log.logindetails();
	}

	@Then("^click_the_login_button$")
	public void click_the_login_button() {
		log.login();
	}

	@Then("^click_the Demo site button$")
	public void click_the_Demo_site_button(){
		log.demo();
	}

	@Then("^fill all the invalid details in the register form$")
	public void fill_all_the_invalid_details_in_the_register_form() {
		log.Attributes();
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws IOException {
		log.Submit();
		log.screenshot("Screenshots//invalid.png");
		log.quit();
	}

}
