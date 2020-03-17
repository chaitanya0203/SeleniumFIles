package Stepdefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import Main_java.SwitchTo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SwitchTo_step {
	WebDriver driver;
	SwitchTo st= new SwitchTo(driver);
	
	@Given("^Opens url in the browser$")
	public void opens_url_in_the_browser() {
		st.url();
	}

	@When("^automation site is opens$")
	public void automation_site_is_opens() {
		st.loginpage();
	}

	@Then("^Click on SwitchTo and alerts$")
	public void click_on_SwitchTo_and_alerts() {
		st.alertoperation();
	}

	@Then("^get the alert text$")
	public void get_the_alert_text() throws IOException, InterruptedException {
		st.gettext();
		//st.screenshot("Screenshots//alert.png");
		//st.quit();
	}

}
