package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution
@CucumberOptions(
	plugin = {"pretty", 
				"html:Reports/Team2_SeleniumHackathon_Apr2024.html", 
				"junit:target/cucumber-reports/Cucumber.xml", 
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	monochrome=false,  //console output color
	tags = "", //tags from feature file	
	publish = true,
    features = 
//{"src/test/resources/features"},
{"src/test/resources/features/01login.feature",
    		"src/test/resources/features/02dashboard.feature",    		
//    		"src/test/resources/features/03batchValidation.feature",
    		"src/test/resources/features/09UserValidation.feature"},
	glue= {"stepDefinitions", "hooks"}) //location of step definition files

public class TestRun extends AbstractTestNGCucumberTests{
	@DataProvider(parallel=false)
	public Object[][]scenario() {
		return super.scenarios();
	}
}
