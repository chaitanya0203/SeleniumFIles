package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resorces/feature/testcase.feature",

tags = { "@TC_10" }, 
glue = { "Steps" }, 
monochrome = true)
public class Logout_runner {

}
