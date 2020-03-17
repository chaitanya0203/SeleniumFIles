package Stepdefinition;

import org.openqa.selenium.WebDriver;

import Main_java.FileDownload;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FileDownload_step {
WebDriver driver;
FileDownload fd=new FileDownload(driver);
	@Given("^Open url in the browser$")
	public void open_url_in_the_browser() {
		fd.url();
	}

	@When("^automation site is opened$")
	public void automation_site_is_opened() {
		fd.loginpage();
	}
	@Then("^Click on more and filedownload$")
	public void click_on_more_and_filedownload() {
		fd.filedn();
	}

	@Then("^download the file$")
	public void download_the_file() {
		fd.quit();
	}


}
