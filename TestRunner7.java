package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\91739\\eclipse-workspace\\bdd_kyro_ass\\src\\test\\resources\\Features",
		glue="stepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)



public class TestRunner7 {

}
