package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution
@CucumberOptions(
	plugin = {"pretty", 
				"html:Reports/HTML-reports/Team2_SeleniumHackathon_Apr2024.html", 
				"junit:Reports/Cucumber-reports/Cucumber.xml", 
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	monochrome=false,  //console output color
	tags = "", //tags from feature file	
	publish = true,
    features = 
//{"src/test/resources/features"},
{"src/test/resources/features/01login.feature",
 //   		"src/test/resources/features/02dashboard.feature",    		
//    		"src/test/resources/features/04programAdd.feature",
//			"src/test/resources/features/05programEdit.feature",
//			"src/test/resources/features/06programDelete.feature",
//			"src/test/resources/features/07programMultipleDelete.feature",
			"src/test/resources/features/08batchValidation.feature",
			"src/test/resources/features/09batchAdd.feature",
			"src/test/resources/features/10batchEdit.feature",
			"src/test/resources/features/11batchDelete.feature"
//			"src/test/resources/features/12userValidation.feature",
//			"src/test/resources/features/13userAdd.feature",			
//			"src/test/resources/features/14userEdit.feature",
//			"src/test/resources/features/15userSort.feature",
//			"src/test/resources/features/16userDelete.feature",
//			"src/test/resources/features/17userMultipleDelete.feature"
			},



    		//"src/test/resources/features/09UserValidation.feature"},
	glue= {"stepDefinitions", "hooks"}) //location of step definition files

public class TestRun extends AbstractTestNGCucumberTests{
	@DataProvider(parallel=false)
	public Object[][]scenario() {
		return super.scenarios();
	}
}