package Runner;

import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import listeners.JiraListener;
import tests.ExcelTest;
import utilities.ExtentManager;
import utilities.ExtentTestManager;
@Listeners(JiraListener.class)
public class NewExcelTestRunner {
	ConfigFileReader configFileReader= new ConfigFileReader();
	
	String path = System.getProperty("user.dir") + "\\TestData\\DemoTestData.xlsx";
	//ExcelData testExecution = new ExcelData(path, "AssetRevaluation_ExecutionTrack", "Test CaseID");
	Map<String, String> testExecutionData;
	ExcelTest excelTest = new ExcelTest(path, "TestExecution", "Test CaseID");
	List<String> testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
	static String currentExecutionTag;

	public void excelTestArea(String tags, int listSize, int tagIndex) {

		String[] parameter = {
				"sr`c/test/java/features/practiceDemoFEATURE.feature", "--glue", "stepdefinitions",
				"--plugin", "pretty", "--plugin",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "--plugin",
				"rerun:ReRunScenarios/FailedReRun.txt", "--tags", "@" + tags };
		CucumberRunner.run(parameter, listSize, tagIndex);
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Test Execution Started");
	}

	@Test()
	
	public void test() {
		
		String path = System.getProperty("user.dir") + "\\TestData\\DemoTestData.xlsx";
		ExcelTest excelTest = new ExcelTest(path, "TestExecution", "Test CaseID");
		testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
		NewExcelTestRunner newExcelTestRunner = new NewExcelTestRunner();
		for (String string : testCaseTagsFromExcel) {
			System.out.println("Tags "+string);
		}
		System.out.println("Tag size is "+testCaseTagsFromExcel.size());
		for (String string : testCaseTagsFromExcel) {
			ExcelTest excelTest2 = new ExcelTest(path, "TestExecution", "Test CaseID");
			testCaseTagsFromExcel = excelTest2.getTestCaseTagsfromExcel();
			System.out.println(string);
			currentExecutionTag = string;
			ExcelData testExecution = new ExcelData(path, "TestExecution", "Test CaseID");
			testExecutionData = testExecution.getTestdata(string);			
			newExcelTestRunner.excelTestArea(string, testCaseTagsFromExcel.size(),
					testCaseTagsFromExcel.indexOf(string));
			System.out.println(string+ " Got ended");
			
		}

	}

	// get the current execution tag for before and after hooks
	public static String getCurrentExecutionTag() {
		return currentExecutionTag;
	}

	@AfterTest
	public void afterTest() {
		System.out.println("All the Test got endded");
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}
}
