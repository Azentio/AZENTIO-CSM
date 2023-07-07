package Runner;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExtentManager;
import utilities.ExtentTestManager;

public class MultipleTagsRun {
	
	

	public void excelTestArea(List<String> listOfTags)
	{
		List<String[]> listOfArguments = new ArrayList<>();
		for (String tags : listOfTags) {
			String[] parameter = {

					"src/test/java/features/CSMSADS_Transactiononstaff.feature",
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
		
	 testCaseTagsfromExcel1.add("TSA_150");	
  //testCaseTagsfromExcel1.add("TSA_150_1");
    //testCaseTagsfromExcel1.add("TSA_150_2");
     
    // testCaseTagsfromExcel1.add("TSA_149");
   //testCaseTagsfromExcel1.add("TSA_149_1");
   
	//testCaseTagsfromExcel1.add("TSA_150");
	//testCaseTagsfromExcel1.add("TSA_150_1");
	//testCaseTagsfromExcel1.add("TSA_150_2");
//    testCaseTagsfromExcel1.add("");
//	 
//		  testCaseTagsfromExcel1.add("TRS_117_01");
//		testCaseTagsfromExcel1.add("TRS_117");
//		testCaseTagsfromExcel1.add("TRS_117_02");
	
	//testCaseTagsfromExcel1.add("TRS_118_01");
		//testCaseTagsfromExcel1.add("TRS_118");
	//testCaseTagsfromExcel1.add("TRS_118_02");
//   
//				testCaseTagsfromExcel1.add("TRS_116_01");
//				testCaseTagsfromExcel1.add("TRS_116");
// 	testCaseTagsfromExcel1.add("TRS_116_02");
 	
 	

		MultipleTagsRun newExcelTestRunner= new MultipleTagsRun();
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
