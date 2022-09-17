package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\91739\\eclipse-workspace\\bdd_kyro_ass\\src\\test\\resources\\Features\\CreateTask_Kyro.feature",
		glue="stepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml",
				"html:target/cucumberreport/report.html"
				}	
		
		)



public class TestRunner7 {

}
