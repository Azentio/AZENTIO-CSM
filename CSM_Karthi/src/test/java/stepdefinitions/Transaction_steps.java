package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_TransactionOBJ;
import pageobjects.csmParam.CSMcore_TransactionObj;
import resources.BaseClass;

public class Transaction_steps {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	//CSM_Transaction_Object CSMTransactionObject = new CSM_Transaction_Object(driver);
	CSMcore_TransactionObj CSMcoreTransactionObj = new CSMcore_TransactionObj(driver);
	CSMParam_TransactionOBJ CSMParamTransactionOBJ = new CSMParam_TransactionOBJ(driver);
	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData excelDataForTransactionfeature = new ExcelData(path, "CSM_Transactions_TestData", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	Map<String, String> testData;

	//TRS_188
	
	@And("^user get the data from the excel sheet for the test case id TRS_188$")
	public void UserGetTheDataFromTheExcelSheetForTheTestcaseIdTRS_188() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_188_D1");

	}
	
	@And("^user click on the parameters menu under the menu options in the CSM params application$")
	public void UserClickOnTheParametersMenuUnderTheMenuOptionsInTheCsmParamsApplication() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmParametersMenu());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmParametersMenu());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmParametersMenu());
	}
	@And("^user click on the system paramters under the parameters menu$")
	public void UserClickOnTheSystemParamtersUnderTheParametersMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmParametersSystemParameters());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmParametersSystemParameters());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmParametersSystemParameters());
	}
	@And("^user click on the transaction type under the system parameters$")
	public void UserClickOnTheTransactionTypeUnderTheSystemParameters() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionType());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionType());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionType());
	}
	@And("^user click on the update after approve field under the transaction type$")
	public void UserClickOnTheUpdateAfterApproveFieldUnderTheTransactionType() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUA());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUA());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUA());
	}
	@And("^user enters the transaction type code in the code column under the update after approve$")
	public void UserEntersTheTransactionTypeCodeInTheCodeColumnUnderTheUpdateAfterApprove() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput().sendKeys(testData.get("TRXType_D1"));
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput().sendKeys(Keys.TAB);
	}
	@And("^user double clicks on the entered transaction type code from the list to view the transaction type details$")
	public void UserDoubleClicksOnTheEnteredTransactionTypeCodeFromTheListToViewTheTransactionTypeDetails() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeDoubleClick());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeDoubleClick());
		clicksAndActionsHelper.doubleClick(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeDoubleClick());
	}
	@And("^user click on the GL charges button$")
	public void UserClickOnTheGlChargesButton() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
	}
	@And("^user click on the any existing added data in the GL charges and click on the delete button to delete it$")
	public void UserClickOnTheAnyExistingAddedDataInTheGlChargesAndClickOnTheDeleteButtonToDeleteIt() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.);
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.);
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.);
	}
	@And("^user click on the plus button to add the GL code under the GL charges$")
	public void UserClickOnThePlusButtonToAddTheGlCodeUnderTheGlCharges() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesAddButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesAddButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesAddButton());
	}
	@And("^user enters the GL code under the GL code column$")
	public void UserEntersTheGlCodeUnderTheGlCodeColumn() {
		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput().sendKeys(testData.get("GLCode_Debit"));
		
	}
	@And("^user enters the charge scheme code under the Charge Schema Details column$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumn() {
		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput().sendKeys(testData.get("ChargeSchema-1"));
		
	}
	
	@And("^user selects all from the dropdown list before the cash account column$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumn() {
		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesSelectInput());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesSelectInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesSelectInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesSelectInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesSelectInput().sendKeys(testData.get("AccessAll"));
	}
	
	@And("^user selects account option from the cash account column$")
	public void UserSelectsAccountOptionFromTheCashAccountColumn() {
		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
		CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input().sendKeys(testData.get("Cash/Acc"));
	}
	@And("^user selects the Authorize from the action column$")
	public void UserSelectsTheAuthorizeFromTheActionColumn() {
		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput().sendKeys(testData.get("Action"));
	}
	@And("^user click on the OK button to close the GL charges popup menu$")
	public void UserClickOnTheOkButtonToCloseTheGlChargesPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
	}
	@And("^user click on the update after approve button to save the changes$")
	public void UserClickOnTheUpdateAfterApproveButtonToSaveTheChanges() {
		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
	}
	@And("^user click on the approve field under the transaction type menu$")
	public void UserClickOnTheApproveFieldUnderTheTransactionTypeMenu() {
		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeApproveScreen());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeApproveScreen());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreen());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreen());
	}
	@And("^user enters the transaction type code in the code column under the approve menu$")
	public void UserEntersTheTransactionTypeCodeInTheCodeColumnUnderTheApproveMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput());
		CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput().sendKeys(testData.get("TRXType_D1"));
		CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput().sendKeys(Keys.ENTER);
	}
	@And("^user click on the approve button to approve the changes$")
	public void UserClickOnTheApproveButtonToApproveTheChanges() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput());
	}
	
	
	
	@And("^user click on Transactions under CSM application in the CSM core application$")
	public void UserClickOnTransactionsUnderCsmApplicationInTheCsmCoreApplication() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactions());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactions());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTransactions());
	}
	@And("^user click on Maintenance under Transactions in the CSM core application$")
	public void UserClickOnMaintenanceUnderTransactionsInTheCsmCoreApplication() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaintenanceScreen());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintenanceScreen());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintenanceScreen());
	}
	@And("^user enters the transaction type$")
	public void UserEntersTheTransactionType() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTrxTypeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTrxTypeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTrxTypeInput());
		CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(testData.get("TRXType_D1"));
		CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter the Branch Code for AC1 in Maintenance Screen$")
	public void UserEnterTheBranchCodeForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(testData.get("BranchCode_Debit"));
		CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter Currency Code for AC1 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(testData.get("CurrencyCode_Debit"));
		CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter GL Code for AC1 in Maintenance Screen$")
	public void UserEnterGlCodeForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
		CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(testData.get("GLCode_Debit"));
		CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter CIF Code for AC1 in Maintenance Screen$")
	public void UserEnterCifCodeForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
		CSMcoreTransactionObj.transactionsDebitAccCifcodeInput().sendKeys(testData.get("CIFCode_Debit"));
		CSMcoreTransactionObj.transactionsDebitAccCifcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter Serial for AC1 in Maintenance Screen$")
	public void UserEnterSerialForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
		CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput().sendKeys(testData.get("SerialNo_Debit"));
		CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user click Ok Button in Warning PopUp Menu$")
	public void UserClickOkButtonInWarningPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsWarningOkbtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsWarningOkbtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsWarningOkbtn());
	}
	@And("^user Enter the Currency in Maintenance Screen$")
	public void UserEnterTheCurrencyInMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		CSMcoreTransactionObj.transactionsDebitAccCurrencyInput().sendKeys(testData.get("CurrencyCode_Debit"));
		CSMcoreTransactionObj.transactionsDebitAccCurrencyInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter the Amount in Maintenance Screen$")
	public void UserEnterTheAmountInMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsEnterAmountInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
		CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(testData.get("Amount"));
		CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(Keys.TAB);
	}
//	@And("^user Enter the Branch Code for AC2 in Maintenance Screen$")
//	public void UserEnterTheBranchCodeForAc2InMaintenanceScreen() {
//		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsEnterAmountInput());
//		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
//		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
//		CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(testData.get("Amount"));
//		CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(Keys.TAB);
//	}
	@And("^user Enter Currency Code for AC2 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc2InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		CSMcoreTransactionObj.transactionsDebitAccCurrencyInput().sendKeys(testData.get("CurrencyCode_Credit"));
		CSMcoreTransactionObj.transactionsDebitAccCurrencyInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter GL Code for AC2 in Maintenance Screen$")
	public void UserEnterGlCodeForAc2InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
		CSMcoreTransactionObj.transactionsCreditAccGlcodeInput().sendKeys(testData.get("GLCode_Credit"));
		CSMcoreTransactionObj.transactionsCreditAccGlcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter CIF Code for AC2 in Maintenance Screen$")
	public void UserEnterCifCodeForAc2InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
		CSMcoreTransactionObj.transactionsCreditAccCifcodeInput().sendKeys(testData.get("CIFCode_Credit"));
		CSMcoreTransactionObj.transactionsCreditAccCifcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user Enter Serial for AC2 in Maintenance Screen$")
	public void UserEnterSerialForAc2InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
		CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(testData.get("SerialNo_Credit"));
		CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(Keys.TAB);
	}
	@And("^user click Save Button in Maintenance Screen$")
	public void UserClickSaveButtonInMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaintanceSavebtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintanceSavebtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintanceSavebtn());
	}
	@And("^user Get the Transaction No in Success PopUo Menu$")
	public void UserGetTheTransactionNoInSuccessPopuoMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.getTransactionNumber());
		String transactionNo = CSMcoreTransactionObj.getTransactionNumber().getText().substring(15, 19);
		System.out.println(transactionNo);
		excelDataForTransactionfeature.updateTestData("TRS_111_D1", "TRXNo", transactionNo);
		testData = excelDataForTransactionfeature.getTestdata("TRS_111_D1");
	}
	@And("^user click Ok Button in Success PopUp Menu$")
	public void UserClickOkButtonInSuccessPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
	}
	@And("^user click on Approve Screen under Transactions menu$")
	public void UserClickOnApproveScreenUnderTransactionsMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsApproveScreen());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsApproveScreen());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsApproveScreen());
	}
	@And("^user Enter the Transaction No in Approve Screens$")
	public void UserEnterTheTransactionNoInApproveScreens() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(testData.get("TRXNo"));
		CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(Keys.ENTER);
	}
	@And("^user Double click on the Transaction No$")
	public void UserDoubleClickOnTheTransactionNo() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
		clicksAndActionsHelper.doubleClick(CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
	}
	@And("^user click on Approve Button for approve the Transaction$")
	public void UserClickOnApproveButtonForApproveTheTransaction() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsApprovescreenAppbtn());
		javascriptHelper.scrollIntoView(CSMcoreTransactionObj.transactionsApprovescreenAppbtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsApprovescreenAppbtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsApprovescreenAppbtn());
	}
	@And("^user click on Ok Button in Success PopUp Menu for Approve Transcation$")
	public void UserClickOnOkButtonInSuccessPopupMenuForApproveTranscation() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.ConfirmOk());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.ConfirmOk());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.ConfirmOk());
	}
	@And("^user click on Maintenance under Transactions$")
	public void UserClickOnMaintenanceUnderTransactions() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
	}
	@And("^user click Ok Button in Warning PopUp to go back to Maintenance$")
	public void UserClickOkButtonInWarningPopupToGoBackToMaintenance() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
	}
	@And("^user click on Search Button in Maintenance Screen$")
	public void UserClickOnSearchButtonInMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaintanceSearchIcon());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintanceSearchIcon());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintanceSearchIcon());
	}
	@And("^user Enter the Transaction No in Search Boxs$")
	public void UserEnterTheTransactionNoInSearchBoxs() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(testData.get("TRXNo"));
		CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(Keys.ENTER);
	}
	@And("^user Double click on the Searched Transaction No in Search Box$")
	public void UserDoubleClickOnTheSearchedTransactionNoInSearchBox() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
	}
	@And("^user click on Booked Entries in Maintenance Screen$")
	public void UserClickOnBookedEntriesInMaintenanceScreen() {
		javascriptHelper.scrollIntoView(CSMcoreTransactionObj.transactionsMaintanceBookedEntriesBtn());
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaintanceBookedEntriesBtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintanceBookedEntriesBtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintanceBookedEntriesBtn());
	}
	
	
	//TRS_189
	@And("^user get the data from the excel sheet for the test case id TRS_189$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_189() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_189_D1");
	}
	
	@And("^user enters the GL code under the GL code column to link charge code 2$")
	public void UserEntersTheGlCodeUnderTheGlCodeColumnToLinkChargeCode2() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
	}
	@And("^user enters the charge scheme code under the Charge Schema Details column to link charge code 2$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnToLinkChargeCode2() {

	}
	@And("^user selects all from the dropdown list before the cash account column to link charge code 2$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnToLinkChargeCode2() {

	}
	@And("^user selects account option from the cash account column to link charge code 2$")
	public void UserSelectsAccountOptionFromTheCashAccountColumnToLinkChargeCode2() {

	}
	@And("^user selects the Authorize from the action column to link charge code 2$")
	public void UserSelectsTheAuthorizeFromTheActionColumnToLinkChargeCode2() {

	}
	@And("^user click or check the Transfer Type is Intra Bank$")
	public void UserClickOrCheckTheTransferTypeIsIntraBank() {

	}
	@And("^user click or check the radio button is Main Acc is Debit$")
	public void UserClickOrCheckTheRadioButtonIsMainAccIsDebit() {

	}
	@And("^user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu$")
	public void UserClickOrCheckTheRadioButtonDeductFromDebtorAccountUnderAvailableOptionsForDeductIMenu() {

	}
	
	@And("^user enters the transaction type $")
	public void UserEntersTheTransactionTypeForTestCaseIdTrs_189() {

	}
	@And("^user Enter the Branch Code for AC1 in Maintenance Screen$")
	public void UserEnterTheBranchCodeForAc1InMaintenanceScreen() {

	}
	@And("^user Enter Currency Code for AC1 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc1InMaintenanceScreen() {

	}
	@And("^user Enter GL Code for AC1 in Maintenance Screen$")
	public void UserEnterGlCodeForAc1InMaintenanceScreen() {

	}
	@And("^user Enter CIF Code for AC1 in Maintenance Screen$")
	public void UserEnterCifCodeForAc1InMaintenanceScreen() {

	}
	@And("^user Enter Serial for AC1 in Maintenance Screen$")
	public void UserEnterSerialForAc1InMaintenanceScreen() {

	}
	@And("^user Enter the Currency in Maintenance Screen$")
	public void UserEnterTheCurrencyInMaintenanceScreen() {

	}
	@And("^user Enter the Amount in Maintenance Screen$")
	public void UserEnterTheAmountInMaintenanceScreen() {

	}
	@And("^user Enter the Branch Code for AC2 in Maintenance Screen$")
	public void UserEnterTheBranchCodeForAc2InMaintenanceScreen() {

	}
	@And("^user Enter Currency Code for AC2 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc2InMaintenanceScreen() {

	}
	@And("^user Enter GL Code for AC2 in Maintenance Screen$")
	public void UserEnterGlCodeForAc2InMaintenanceScreen() {

	}
	@And("^user Enter CIF Code for AC2 in Maintenance Screen$")
	public void UserEnterCifCodeForAc2InMaintenanceScreen() {

	}
	@And("^user Enter Serial for AC2 in Maintenance Screen$")
	public void UserEnterSerialForAc2InMaintenanceScreen() {

	}
	
	@And("^user Enter the Branch Code for AC1 in Maintenance Screen$")
	public void UserEnterTheBranchCodeForAc1InMaintenanceScreen() {

	}
	@And("^user Enter Currency Code for AC1 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc1InMaintenanceScreen() {

	}
	@And("^user Enter GL Code for AC1 in Maintenance Screen$")
	public void UserEnterGlCodeForAc1InMaintenanceScreen() {

	}
	@And("^user Enter CIF Code for AC1 in Maintenance Screen$")
	public void UserEnterCifCodeForAc1InMaintenanceScreen() {

	}
	@And("^user Enter Serial for AC1 in Maintenance Screen$")
	public void UserEnterSerialForAc1InMaintenanceScreen() {

	}
	@And("^user Enter the Currency in Maintenance Screen$")
	public void UserEnterTheCurrencyInMaintenanceScreen() {

	}
	@And("^user Enter the Amount in Maintenance Screen$")
	public void UserEnterTheAmountInMaintenanceScreen() {

	}
	@And("^user Enter the Branch Code for AC2 in Maintenance Screen$")
	public void UserEnterTheBranchCodeForAc2InMaintenanceScreen() {

	}
	@And("^user Enter Currency Code for AC2 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc2InMaintenanceScreen() {

	}
	@And("^user Enter GL Code for AC2 in Maintenance Screen$")
	public void UserEnterGlCodeForAc2InMaintenanceScreen() {

	}
	@And("^user Enter CIF Code for AC2 in Maintenance Screen$")
	public void UserEnterCifCodeForAc2InMaintenanceScreen() {

	}
	@And("^user Enter Serial for AC2 in Maintenance Screen$")
	public void UserEnterSerialForAc2InMaintenanceScreen() {

	}

	
	
	
}

	
	
	



