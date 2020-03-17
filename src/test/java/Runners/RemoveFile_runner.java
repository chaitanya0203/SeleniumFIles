package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resorces/feature/testcase.feature",

tags = { "@TC_07" }, 
glue = { "Steps" }, 
monochrome = true)
public class RemoveFile_runner {

}
