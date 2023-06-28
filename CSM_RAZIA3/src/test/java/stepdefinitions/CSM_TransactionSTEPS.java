package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;

import pageobjects.csm.CSMcore_TransactionObj;
import pageobjects.csmParam.CSM_Param_Transaction_OBJ;
import resources.BaseClass;


public class CSM_TransactionSTEPS {
	
	
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
		Selenium_Actions seleniumAction = new Selenium_Actions(driver);
    CSMcore_TransactionObj CSMcoreTransactionObj = new CSMcore_TransactionObj(driver);
 CSM_Param_Transaction_OBJ     CSMParamTransactionOBJ= new CSM_Param_Transaction_OBJ(driver);
	CSMLogin login  = new CSMLogin(driver);

	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
    ExcelData CSM_TransactionsStepsExcelData = new ExcelData(path,"\\CSM_TransactionFEATURE","DataSet ID");
    Map<String, String> testData;
	
	@And("^user get the data from the excel sheet for the test case id TRS_190$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_190() {
		testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_190_D1");

	}
	
}