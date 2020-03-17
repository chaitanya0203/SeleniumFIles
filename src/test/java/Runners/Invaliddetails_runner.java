package Runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\feature\\testcase.feature",

tags = { "@TC_01" }, 
glue = { "Stepdefinition" }, 
monochrome = true)
public class Invaliddetails_runner {

}
