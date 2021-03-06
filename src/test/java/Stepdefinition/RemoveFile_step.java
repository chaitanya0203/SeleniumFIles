package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Main_java.RemoveFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemoveFile_step {
	WebDriver driver;
	RemoveFile rf= new RemoveFile(driver);
	
	@Given("^the url is opened in the website$")
	public void the_url_is_opened_in_the_website() {
	rf.url();
	rf.loginpage();
	}

	@When("^the more is mouse overed and click on the File Upload$")
	public void the_more_is_mouse_overed_and_click_on_the_File_Upload() throws InterruptedException{
		rf.filerem();
	}

	@When("^File is Selected$")
	public void file_is_Selected() throws IOException 
	{
		rf.screenshot("Screenshots//remove.png");
	}

	@Then("^remove the uploaded file$")
	public void remove_the_uploaded_file() {
		rf.quit();
	}

}
