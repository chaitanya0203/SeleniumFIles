package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Main_java.Videoplay;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Videoplay_step {
	WebDriver driver;
	Videoplay vp=new Videoplay(driver);
	
	@Given("^the url is opened in the browser$")
	public void the_url_is_opened_in_the_browser() {
		vp.url();
		vp.loginpage();
	}

	@When("^the url is launched click on demosite$")
	public void the_url_is_launched_click_on_demosite() throws InterruptedException {
		vp.vplay();
	}

	@When("^mouseover to the video and click on vimeo$")
	public void mouseover_to_the_video_and_click_on_vimeo() throws IOException {
		vp.screenshot("Screenshots//play.png");
	}

	@When("^play the video$")
	public void play_the_video() {
		
	}

	@Then("^tap on escape key and quit$")
	public void tap_on_escape_key_and_quit() {
		vp.quit();
	}
}
