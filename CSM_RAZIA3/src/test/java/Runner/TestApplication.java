package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {"src/test/java/features/CSM_Transactions_612.feature"},
                glue = "stepdefinitions",
                //monochrome=false, //to make steps in color
                plugin = { "pretty",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "rerun:ReRunScenarios/FailedReRun.txt"},
             //dryRun = true //to check compilation errors                                      
              tags="@TRS_030"  
              		
              		
)
public class TestApplication extends AbstractTestNGCucumberTests {
	/*
	 * @Override
	 *
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 * 
	 * 
	 * 
	 */
		
	

	
	@Before
	public void beforeExecution() {
		System.out.println("*** Test Execution started ***");

	}
	
	

	@After
	public void afterExecution() {
		System.out.println("*** Test Execution Finished ***");
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

}