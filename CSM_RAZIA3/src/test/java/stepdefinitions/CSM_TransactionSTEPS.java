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
	
	@And("^user click on the CIF Priority charges button$")
	public void UserClickOnTheCifPriorityChargesButton() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
    	

	}
	@And("^user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it$")
	public void UserClickOnTheAnyExistingAddedDataInTheCifPriorityChargesAndClickOnTheDeleteButtonToDeleteIt()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMParamTransactionOBJ.csmTransactionTypeCifTypePriorityChargesSelectRowDelete());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMParamTransactionOBJ.csmTransactionTypeCifTypePriorityChargesSelectRowDelete());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeCifTypePriorityChargesSelectRowDelete());
        

	}
	@And("^user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1$")
	public void UserClickOnThePlusButtonToAddTheCifPriorityChargesUnderTheCifPriorityChargesToLinkTheChargeCodeForAc1() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesAddButton());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesAddButton());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesAddButton());

	}
	@And("^user enters the CIF Priority Charges under the CIF Priority Charges column$")
	public void UserEntersTheCifPriorityChargesUnderTheCifPriorityChargesColumn() throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesSelectInput());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesSelectInput());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesSelectInput());
        CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesSelectInput().sendKeys(testData.get(""));
        CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesSelectInput().sendKeys(Keys.TAB);
        

	}
	
	@And("^user click on the OK button to close the CIF Priority Charges popup menu$")
	public void UserClickOnTheOkButtonToCloseTheCifPriorityChargesPopupMenu() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());

	}
	
	@And("^user enters the transaction type for test case id TRS_190$")
	public void UserEntersTheTransactionTypeForTestCaseIdTrs_190()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsTransactionNoInputValue());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
        CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(testData.get(""));
        CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(Keys.TAB);
      

	}
	@And("^user Enter the Branch Code for AC1 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterTheBranchCodeForAc1InMaintenanceScreenForTestCaseIdTrs_190() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
        CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(testData.get(""));
        CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(Keys.TAB);
      

	}
	@And("^user Enter Currency Code for AC1 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterCurrencyCodeForAc1InMaintenanceScreenForTestCaseIdTrs_190()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput());
        CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput().sendKeys(testData.get(""));
        CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput().sendKeys(Keys.TAB);
      		
	}
	@And("^user Enter GL Code for AC1 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterGlCodeForAc1InMaintenanceScreenForTestCaseIdTrs_190() throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
        CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(testData.get(""));
        CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(Keys.TAB);
		
	}
	@And("^user Enter CIF Code for AC1 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterCifCodeForAc1InMaintenanceScreenForTestCaseIdTrs_190() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
        CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(testData.get(""));
        CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(Keys.TAB);
			}
	@And("^user Enter Serial for AC1 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterSerialForAc1InMaintenanceScreenForTestCaseIdTrs_190() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
        CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput().sendKeys(testData.get(""));
        CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput().sendKeys(Keys.TAB);
	}
	
	@And("^user Enter the Currency in Maintenance Screen for test case id TRS_190$")
	public void UserEnterTheCurrencyInMaintenanceScreenForTestCaseIdTrs_190() throws Throwable{
	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccCurrencyInput());
    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccCurrencyInput());
    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccCurrencyInput());
    CSMcoreTransactionObj.transactionsCreditAccCurrencyInput().sendKeys(testData.get(""));
    CSMcoreTransactionObj.transactionsCreditAccCurrencyInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter the Amount in Maintenance Screen for test case id TRS_190$")
	public void UserEnterTheAmountInMaintenanceScreenForTestCaseIdTrs_190() throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsEnterAmountInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
	    CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter the Branch Code for AC2 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterTheBranchCodeForAc2InMaintenanceScreenForTestCaseIdTrs_190()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter Currency Code for AC2 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterCurrencyCodeForAc2InMaintenanceScreenForTestCaseIdTrs_190() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput().sendKeys(Keys.TAB);


	}
	@And("^user Enter GL Code for AC2 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterGlCodeForAc2InMaintenanceScreenForTestCaseIdTrs_190()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccGlcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccGlcodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter CIF Code for AC2 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterCifCodeForAc2InMaintenanceScreenForTestCaseIdTrs_190() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccCifcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccCifcodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter Serial for AC2 in Maintenance Screen for test case id TRS_190$")
	public void UserEnterSerialForAc2InMaintenanceScreenForTestCaseIdTrs_190()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(Keys.TAB);

	}
	//192
	@And("^user get the data from the excel sheet for the test case id TRS_191$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_191() {
		testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_191_D1");

	}
	
	@And("^user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC2$")
	public void UserClickOnThePlusButtonToAddTheCifPriorityChargesUnderTheCifPriorityChargesToLinkTheChargeCodeForAc2()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesSelectInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(Keys.TAB);

	}
	
	@And("^user enters the transaction type for test case id TRS_191$")
	public void UserEntersTheTransactionTypeForTestCaseIdTrs_191() throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsTransactionNoInputValue());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
	    CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(Keys.TAB);
		}
	@And("^user Enter the Branch Code for AC1 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterTheBranchCodeForAc1InMaintenanceScreenForTestCaseIdTrs_191() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
	    CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(Keys.TAB);
	

	}
	@And("^user Enter Currency Code for AC1 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterCurrencyCodeForAc1InMaintenanceScreenForTestCaseIdTrs_191() throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput());
	    CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsDebitAccCurrencycodeInput().sendKeys(Keys.TAB);
		}
	@And("^user Enter GL Code for AC1 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterGlCodeForAc1InMaintenanceScreenForTestCaseIdTrs_191() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
	    CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter CIF Code for AC1 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterCifCodeForAc1InMaintenanceScreenForTestCaseIdTrs_191() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
    CSMcoreTransactionObj.transactionsDebitAccCifcodeInput().sendKeys(testData.get(""));
    CSMcoreTransactionObj.transactionsDebitAccCifcodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter Serial for AC1 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterSerialForAc1InMaintenanceScreenForTestCaseIdTrs_191() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
	    CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput().sendKeys(Keys.TAB);
	}
	
	@And("^user Enter the Currency in Maintenance Screen for test case id TRS_191$")
	public void UserEnterTheCurrencyInMaintenanceScreenForTestCaseIdTrs_191()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccCurrencyInput());
    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccCurrencyInput());
    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccCurrencyInput());
    CSMcoreTransactionObj.transactionsCreditAccCurrencyInput().sendKeys(testData.get(""));
    CSMcoreTransactionObj.transactionsCreditAccCurrencyInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter the Amount in Maintenance Screen for test case id TRS_191$")
	public void UserEnterTheAmountInMaintenanceScreenForTestCaseIdTrs_191() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsEnterAmountInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
	    CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter the Branch Code for AC2 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterTheBranchCodeForAc2InMaintenanceScreenForTestCaseIdTrs_191()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccBranchcodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter Currency Code for AC2 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterCurrencyCodeForAc2InMaintenanceScreenForTestCaseIdTrs_191() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccCurrencyCodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter GL Code for AC2 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterGlCodeForAc2InMaintenanceScreenForTestCaseIdTrs_191() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccGlcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccGlcodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter CIF Code for AC2 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterCifCodeForAc2InMaintenanceScreenForTestCaseIdTrs_191()throws Throwable {
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccCifcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccCifcodeInput().sendKeys(Keys.TAB);

	}
	@And("^user Enter Serial for AC2 in Maintenance Screen for test case id TRS_191$")
	public void UserEnterSerialForAc2InMaintenanceScreenForTestCaseIdTrs_191() throws Throwable{
		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
	    CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(testData.get(""));
	    CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(Keys.TAB);

	}
	
	
	
}
