package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Main_java.FileUpload;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fileupload_step {
	WebDriver driver;
	FileUpload fu=new FileUpload(driver);
	
	@Given("^Opened url in the browser$")
	public void opened_url_in_the_browser() {
		fu.url();
	}

	@When("^automation site is open$")
	public void automation_site_is_open(){
		fu.loginpage();
	}

	@Then("^Click on more and fileUpload$")
	public void click_on_more_and_fileUpload() throws InterruptedException, IOException{
		fu.fileup();
		fu.screenshot("Screenshots//fileupload.png");
	}

	@Then("^upload the file$")
	public void upload_the_file() {
	fu.quit();
	}

}
