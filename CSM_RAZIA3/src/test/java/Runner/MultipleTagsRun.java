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

					"src/test/java/features/CSM_transactions.feature",
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
		//testCaseTagsfromExcel1.add("TRS_121_01");
		//testCaseTagsfromExcel1.add("TRS_121");
     //testCaseTagsfromExcel1.add("TRS_121_02");
		//testCaseTagsfromExcel1.add("TRS_116_01");
		//testCaseTagsfromExcel1.add("TRS_116");
		//testCaseTagsfromExcel1.add("TRS_116_02");
//	  testCaseTagsfromExcel1.add("TRS_117_01");
//		testCaseTagsfromExcel1.add("TRS_117");
//		testCaseTagsfromExcel1.add("TRS_117_02");
//		testCaseTagsfromExcel1.add("TRS_118_01");
//		testCaseTagsfromExcel1.add("TRS_118");
//		testCaseTagsfromExcel1.add("TRS_118_02");
		testCaseTagsfromExcel1.add("TRS_119_01");
		testCaseTagsfromExcel1.add("TRS_119");
		testCaseTagsfromExcel1.add("TRS_119_02");
		//testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_001_02_PRQ2");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_001_03_PRQ2");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_001_04_PRQ2");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_001_05_PRQ2");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_001_06_PRQ2");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_001_004_01");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_001_004_02");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_001_004_03");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_001_004_04");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_006_01");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_006_02");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_006_03");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_006_04");
//		testCaseTagsfromExcel1.add("KUBS_BP_UAT_005_007");
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
