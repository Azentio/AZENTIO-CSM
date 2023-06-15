package Runner;






	import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.core.options.CommandlineOptionsParser;
import io.cucumber.core.options.CucumberProperties;
import io.cucumber.core.options.CucumberPropertiesParser;
import io.cucumber.core.options.RuntimeOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

	public class MultipleRunner {

		
		

		public void excelTestArea(List<String> listOfTags)
		{
			List<String[]> listOfArguments = new ArrayList<>();
			for (String tags : listOfTags) {
				String[] parameter = {

						"src/test/java/features/CSM_Transaction.feature",
						"--glue", "stepdefinitions",
						"--plugin", "pretty", 
						"--plugin","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
						"--plugin",
						"rerun:ReRunScenarios/FailedReRun.txt", 
						"--tags", "@" + tags
						};
				listOfArguments.add(parameter);
				
			}
			CucumberRunner.run3(listOfArguments);
			
		}
		
		@BeforeTest
		public void beforeTest() {
			
			System.out.println("Test Execution Started");
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
		}

		@Test()
		public void test() {
			List<String> testCaseTagsfromExcel1 = new LinkedList<String>();
			//testCaseTagsfromExcel1.add("TRS_127_01");
			//testCaseTagsfromExcel1.add("TRS_127");
			//testCaseTagsfromExcel1.add("TRS_128_01");
			//testCaseTagsfromExcel1.add("TRS_128");
			testCaseTagsfromExcel1.add("TRS_111_PreReq");
		testCaseTagsfromExcel1.add("TRS_111");
			testCaseTagsfromExcel1.add("TRS_111_PostReq");
			//testCaseTagsfromExcel1.add("TRS_140");

			MultipleRunner newExcelTestRunner= new MultipleRunner();
			newExcelTestRunner.excelTestArea(testCaseTagsfromExcel1);
		//	newExcelTestRunner.runTestCaseFeatureFileWise(null);
			
		}

		@AfterTest
		public void afterTest() {
			System.out.println("Test Execution Ended");
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
		}
	}
	

	