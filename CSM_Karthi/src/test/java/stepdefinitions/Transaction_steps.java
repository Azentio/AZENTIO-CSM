package stepdefinitions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
import stepdefinitions.CSMLogin;

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

	
	
		
//		---------------------------------------------------------       TRS_188  ------------------------------------------------------------------------------//
		
		
		
		@And("^user get the data from the excel sheet for the test case id TRS_188$")
		public void UserGetTheDataFromTheExcelSheetForTheTestcaseIdTRS_188() {
			testData = excelDataForTransactionfeature.getTestdata("TRS_188_D1");

		}
		@And("^user click on Date to Change the Current Date in the CSM core application$")
		public void UserClickOnDateToChangeTheCurrentDateInTheCsmcoreApplication() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					CSMcoreTransactionObj.CSMDateToChangeTheCurrentDate());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(CSMcoreTransactionObj.CSMDateToChangeTheCurrentDate());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(CSMcoreTransactionObj.CSMDateToChangeTheCurrentDate());
		}
		@And("^user Enter the Date in user Running Date in the CSM core application$")
		public void UserEnterTheDateInUserRunningDateInTheCsmcoreApplication() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					CSMcoreTransactionObj.CSMDateInUserRunningDate());
			seleniumActions.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.CSMDateInUserRunningDate());
			seleniumActions.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.CSMDateInUserRunningDate());
			CSMcoreTransactionObj.CSMDateInUserRunningDate().clear();
			//CSMTransactionObject.CSMDateInUserRunningDate().sendKeys(testData.get("Dates"));
			DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate date =LocalDate.now();
	        String format = date.format(dtFormatter);
	        CSMcoreTransactionObj.CSMDateInUserRunningDate().sendKeys(format);
		}
		@And("^user click on Use Button in Change Running Date Popup in the CSM core application$")
		public void UserClickOnUseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					CSMcoreTransactionObj.CSMUseButtonInChangeRunningDate());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(CSMcoreTransactionObj.CSMUseButtonInChangeRunningDate());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(CSMcoreTransactionObj.CSMUseButtonInChangeRunningDate());
		}
//		@And("^user click Ok Button in Information PopUp menu in the CSM core application$")
//		public void UserClickOkButtonInInformationPopupMenuInTheCsmcoreApplication() {
//			for (int i = 0; i < 2000; i++) {
//				try {
//					if (CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday().isDisplayed()) {
//						seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//								CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
//						seleniumActions.getClickAndActionsHelper()
//								.moveToElement(CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
//						seleniumActions.getClickAndActionsHelper().clickOnElement(
//								CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
//						break;
//					}
//				} catch (Exception e) {
//					if (i == 1999) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
//		}
		@And("^user click on Close Button in Change Running Date Popup in the CSM core application$")
		public void UserClickOnCloseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					CSMcoreTransactionObj.CSMCloseButtonInChangeRunningDate());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(CSMcoreTransactionObj.CSMCloseButtonInChangeRunningDate());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(CSMcoreTransactionObj.CSMCloseButtonInChangeRunningDate());
		}
		@And("^user click on Technical Details Icon in the CSM core application$")
		public void UserClickOnTechnicalDetailsIconInTheCsmcoreApplication() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					CSMcoreTransactionObj.CSMTechnicalDetailsIcon());
			seleniumActions.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.CSMTechnicalDetailsIcon());
			seleniumActions.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.CSMTechnicalDetailsIcon());
		}
		@And("^user click Clear Cache in Technical Details Icon in the CSM core application$")
		public void UserClickClearCacheInTechnicalDetailsIconInTheCsmcoreApplication() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					CSMcoreTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(CSMcoreTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(CSMcoreTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon());
		}
		@And("^user click Ok Button Under Information PopUp Menu in the CSM core application$")
		public void UserClickOkButtonUnderInformationPopupMenuInTheCsmcoreApplication() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					CSMcoreTransactionObj.CSMOkButtonUnderInformationPopUp());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(CSMcoreTransactionObj.CSMOkButtonUnderInformationPopUp());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(CSMcoreTransactionObj.CSMOkButtonUnderInformationPopUp());
		}
		@And("^user click on the parameters menu under the menu options in the CSM core application$")
		public void UserClickOnTheParametersMenuUnderTheMenuOptionsInTheCsmcoreApplication() {
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
			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput().sendKeys(Keys.ENTER);
		}
		@And("^user double clicks on the entered transaction type code from the list to view the transaction type details$")
		public void UserDoubleClicksOnTheEnteredTransactionTypeCodeFromTheListToViewTheTransactionTypeDetails() {
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInputDoubleClick());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInputDoubleClick());
			clicksAndActionsHelper.doubleClick(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInputDoubleClick());
		}
		@And("^user click on the GL charges button$")
		public void UserClickOnTheGlChargesButton() {
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
		}
		@And("^user click on the any existing added data in the GL charges and click on the delete button to delete it$")
		public void UserClickOnTheAnyExistingAddedDataInTheGlChargesAndClickOnTheDeleteButtonToDeleteIt() {

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
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
		}
		@And("^user enters the charge scheme code under the Charge Schema Details column$")
		public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumn() {
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput().sendKeys(testData.get("ChargeSchema-1"));
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
		}
		
		@And("^user selects all from the dropdown list before the cash account column$")
		public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumn() {
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput());					
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput());
			seleniumActions.getDropDownHelper().SelectUsingVisibleText(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput(),"ALL");//testData.get("AccessAll"));
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());

		}
		
		@And("^user selects account option from the cash account column$")
		public void UserSelectsAccountOptionFromTheCashAccountColumn() {
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
			CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input().sendKeys(testData.get("Cash/Acc"));
			CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input().sendKeys(Keys.TAB);
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
		}
		@And("^user selects the Authorize from the action column$")
		public void UserSelectsTheAuthorizeFromTheActionColumn() {
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput().sendKeys(testData.get("Action"));
			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput().sendKeys(Keys.TAB);
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
		
		}
		@And("^user click on the OK button to close the GL charges popup menu$")
		public void UserClickOnTheOkButtonToCloseTheGlChargesPopupMenu() {
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		}
		
//		@And("^user click or check the Transfer Type is Intra Bank$")
//		public void UserClickOrCheckTheTransferTypeIsIntraBank() {
//		
//		}
//		@And("^user click or check the radio button is Main Acc is Debit$")
//		public void UserClickOrCheckTheRadioButtonIsMainAccIsDebit() {
//
//		}
//		@And("^user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu$")
//		public void UserClickOrCheckTheRadioButtonDeductFromDebtorAccountUnderAvailableOptionsForDeductIMenu() {
//
//		}
//		
		@And("^user click on the update after approve button to save the changes$")
		public void UserClickOnTheUpdateAfterApproveButtonToSaveTheChanges() {

			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
	    clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
	    waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
	    clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
	    waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
	    clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
}
		@And("^user click on the approve field under the transaction type menu$")
		public void UserClickOnTheApproveFieldUnderTheTransactionTypeMenu() {
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
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
		}
//		@And("^user click on Log Out icon to log out from the CSM Params application$")
//		public void UserClickOnLogOutIconToLogOutFromTheCsmParamsApplication() {
//
//		}
		
		
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
//		@And("^user Enter the Branch Code for AC2 in Maintenance Screen$")
//		public void UserEnterTheBranchCodeForAc2InMaintenanceScreen() {
//
//		}
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
			excelDataForTransactionfeature.updateTestData("TRS_188_D1", "TRXNo", transactionNo);
			testData = excelDataForTransactionfeature.getTestdata("TRS_188_D1");
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
		
//		---------------------------------------------------------       TRS_189  ------------------------------------------------------------------------------//
		
		@And("^user get the data from the excel sheet for the test case id TRS_189$")
		public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_189() {
			testData = excelDataForTransactionfeature.getTestdata("TRS_189_D1");
		}
		
		@And("^user enters the GL code under the GL code column to link charge code 2$")
		public void UserEntersTheGlCodeUnderTheGlCodeColumnToLinkChargeCode2() {
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput().sendKeys(testData.get("All_Gl"));
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		}
		@And("^user enters the charge scheme code under the Charge Schema Details column to link charge code 2$")
		public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnToLinkChargeCode2() {
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput().sendKeys(testData.get("ChargeSchema-2"));
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		}
//		@And("^user selects all from the dropdown list before the cash account column to link charge code 2$")
//		public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnToLinkChargeCode2() {
//
//		}
//		@And("^user selects account option from the cash account column to link charge code 2$")
//		public void UserSelectsAccountOptionFromTheCashAccountColumnToLinkChargeCode2() {
//
//		}
//		@And("^user selects the Authorize from the action column to link charge code 2$")
//		public void UserSelectsTheAuthorizeFromTheActionColumnToLinkChargeCode2() {
//
//		}
		
		

		
//		-------------------------------------------------- TRS_191 --------------------------------------------------------------
		
		
		
		@And("^user click on the CIF Priority charges button$")
		public void UserClickOnTheCifPriorityChargesButton() {
			
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
		}
		@And("^user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it$")
		public void UserClickOnTheAnyExistingAddedDataInTheCifPriorityChargesAndClickOnTheDeleteButtonToDeleteIt() {
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeCifTypeChargesSelectRowDelete());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeCifTypeChargesSelectRowDelete());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeCifTypeChargesSelectRowDelete());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeCifTypeChargesDeleteButton());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeCifTypeChargesDeleteButton());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeCifTypeChargesDeleteButton());
		}
		@And("^user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1$")
		public void UserClickOnThePlusButtonToAddTheCifPriorityChargesUnderTheCifPriorityChargesToLinkTheChargeCodeForAc1() {
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
		}
		@And("^user enters the CIF Priority Charges under the CIF Priority Charges column$")
		public void UserEntersTheCifPriorityChargesUnderTheCifPriorityChargesColumn() {
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges().sendKeys(testData.get("CIFCode_Debit"));
			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
		}
		
		@And("^user click on the OK button to close the CIF Priority Charges popup menu$")
		public void UserClickOnTheOkButtonToCloseTheCifPriorityChargesPopupMenu() {
			
		}
		
		
		@And("^user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC2$")
		public void UserClickOnThePlusButtonToAddTheCifPriorityChargesUnderTheCifPriorityChargesToLinkTheChargeCodeForAc2() {

		}
		
		
//		---------------------------------------------------------------- TRS_192-------------------------------------------------------------------------------------
		
		
		
		@And("^user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account$")
		public void UserClickOnThePlusButtonToAddTheCifPriorityChargesUnderTheCifPriorityChargesToLinkTheChargeCodeForAllAccount() {

		}
		
	
		
	// ------------------------------------------------------ TRS_193 ----------------------------------------------
		
		
		
		
		
//		----------------------------------------------------------- TRS_194 -----------------------------------------------------------------
		
		
		
		@And("^user click on the any existing added data in the CIF Prioritycharges and click on the delete button to delete it$")
		public void UserClickOnTheAnyExistingAddedDataInTheCifPrioritychargesAndClickOnTheDeleteButtonToDeleteIt() {

		}
		@And("^user click on the plus button to add the CIF Priority code under the CIF Priority charges$")
		public void UserClickOnThePlusButtonToAddTheCifPriorityCodeUnderTheCifPriorityCharges() {

		}
		@And("^user enters the CIF Prioritycode under the CIF Priority code column for AC1$")
		public void UserEntersTheCifPrioritycodeUnderTheCifPriorityCodeColumnForAc1() {

		}
		
		@And("^user enters the CIF Priority code under the CIF Priority code column to link charge code 2 for AC2$")
		public void UserEntersTheCifPriorityCodeUnderTheCifPriorityCodeColumnToLinkChargeCode2ForAc2() {

		}

		
		
//		----------------------------------------------------- TRS_195 ----------------------------------------------------------------------
		
		
		
		@And("^user click on the CIF Type charges button$")
		public void UserClickOnTheCifTypeChargesButton() {

		}
		@And("^user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it$")
		public void UserClickOnTheAnyExistingAddedDataInTheCifTypeChargesAndClickOnTheDeleteButtonToDeleteIt() {

		}
		@And("^user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1$")
		public void UserClickOnThePlusButtonToAddTheCifTypeChargesUnderTheCifTypeChargesToLinkTheChargeCodeForAc1() {

		}
		@And("^user enters the CIF Type Charges under the CIF Type Charges column$")
		public void UserEntersTheCifTypeChargesUnderTheCifTypeChargesColumn() {

		}
		
		@And("^user click on the OK button to close the CIF Type Charges popup menu$")
		public void UserClickOnTheOkButtonToCloseTheCifTypeChargesPopupMenu() {

		}
		
		
//		--------------------------------- TRS_196 to TRS_205 ---------------------------------------------------------
		
		
		@And("^user get the data from the excel sheet for the test case id TRS_200$")
		public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_200() {

		}
		@And("^user get the data from the excel sheet for the test case id TRS_201$")
		public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_201() {

		}
		@And("^user get the data from the excel sheet for the test case id TRS_202$")
		public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_202() {

		}
		@And("^user get the data from the excel sheet for the test case id TRS_203$")
		public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_203() {

		}
		@And("^user get the data from the excel sheet for the test case id TRS_204$")
		public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_204() {

		}
		@And("^user get the data from the excel sheet for the test case id TRS_205$")
		public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_205() {

		}
		
		@And("^user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC2$")
		public void UserClickOnThePlusButtonToAddTheCifTypeChargesUnderTheCifTypeChargesToLinkTheChargeCodeForAc2() {

		}
		
		@And("^user enters the transaction type for test case$")
		public void UserEntersTheTransactionTypeForTestCase() {

		}
//		@And("^user Enter the Branch Code for AC1 in Maintenance Screen$")
//		public void UserEnterTheBranchCodeForAc1InMaintenanceScreen() {
//
//		}
//		@And("^user Enter Currency Code for AC1 in Maintenance Screen$")
//		public void UserEnterCurrencyCodeForAc1InMaintenanceScreen() {
//
//		}
//		@And("^user Enter GL Code for AC1 in Maintenance Screen$")
//		public void UserEnterGlCodeForAc1InMaintenanceScreen() {
//
//		}
//		@And("^user Enter CIF Code for AC1 in Maintenance Screen$")
//		public void UserEnterCifCodeForAc1InMaintenanceScreen() {
//
//		}
//		@And("^user Enter Serial for AC1 in Maintenance Screen$")
//		public void UserEnterSerialForAc1InMaintenanceScreen() {
//
//		}
//		
//		@And("^user Enter the Currency in Maintenance Screen$")
//		public void UserEnterTheCurrencyInMaintenanceScreen() {
//
//		}
//		@And("^user Enter the Amount in Maintenance Screen$")
//		public void UserEnterTheAmountInMaintenanceScreen() {
//
//		}
//		@And("^user Enter the Branch Code for AC2 in Maintenance Screen$")
//		public void UserEnterTheBranchCodeForAc2InMaintenanceScreen() {
//
//		}
//		@And("^user Enter Currency Code for AC2 in Maintenance Screen$")
//		public void UserEnterCurrencyCodeForAc2InMaintenanceScreen() {
//
//		}
//		@And("^user Enter GL Code for AC2 in Maintenance Screen$")
//		public void UserEnterGlCodeForAc2InMaintenanceScreen() {
//
//		}
//		@And("^user Enter CIF Code for AC2 in Maintenance Screen$")
//		public void UserEnterCifCodeForAc2InMaintenanceScreen() {
//
//		}
//		@And("^user Enter Serial for AC2 in Maintenance Screen$")
//		public void UserEnterSerialForAc2InMaintenanceScreen() {
//
//		}
		
		@And("^user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account$")
		public void UserClickOnThePlusButtonToAddTheCifTypeChargesUnderTheCifTypeChargesToLinkTheChargeCodeForAllAccount() {

		}
		
		@And("^user click on the Account charges button$")
		public void UserClickOnTheAccountChargesButton() {

		}
		@And("^user click on the any existing added data in the Account charges and click on the delete button to delete it$")
		public void UserClickOnTheAnyExistingAddedDataInTheAccountChargesAndClickOnTheDeleteButtonToDeleteIt() {

		}
		@And("^user click on the plus button to add the Account code under the Account charges$")
		public void UserClickOnThePlusButtonToAddTheAccountCodeUnderTheAccountCharges() {

		}
		@And("^user enters the Account code under the Account code column$")
		public void UserEntersTheAccountCodeUnderTheAccountCodeColumn() {

		}
		
		@And("^user click on the OK button to close the Account charges popup menu$")
		public void UserClickOnTheOkButtonToCloseTheAccountChargesPopupMenu() {

		}
		@And("^user click on the CIF charges button$")
		public void UserClickOnTheCifChargesButton() {

		}
		@And("^user click on the any existing added data in the CIF charges and click on the delete button to delete it$")
		public void UserClickOnTheAnyExistingAddedDataInTheCifChargesAndClickOnTheDeleteButtonToDeleteIt() {

		}
		@And("^user click on the plus button to add the CIF code under the CIF charges$")
		public void UserClickOnThePlusButtonToAddTheCifCodeUnderTheCifCharges() {

		}
		@And("^user enters the CIF code under the CIF code column$")
		public void UserEntersTheCifCodeUnderTheCifCodeColumn() {

		}
		
		@And("^user click on the OK button to close the CIF charges popup menu$")
		public void UserClickOnTheOkButtonToCloseTheCifChargesPopupMenu() {

		}
		
		@And("^user click on the plus button to add the GL code under the GL charges for all account$")
		public void UserClickOnThePlusButtonToAddTheGlCodeUnderTheGlChargesForAllAccount() {

		}
		@And("^user enters the GL code under the GL code column for all account$")
		public void UserEntersTheGlCodeUnderTheGlCodeColumnForAllAccount() {

		}
		@And("^user enters the charge scheme code under the Charge Schema Details column for all account$")
		public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForAllAccount() {

		}
		@And("^user selects all from the dropdown list before the cash account column for all account$")
		public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnForAllAccount() {

		}
		@And("^user selects account option from the cash account column for all account$")
		public void UserSelectsAccountOptionFromTheCashAccountColumnForAllAccount() {

		}
		@And("^user selects the Authorize from the action column for all account$")
		public void UserSelectsTheAuthorizeFromTheActionColumnForAllAccount() {

		}
		//TRS_190
				@And("^user get the data from the excel sheet for the test case id TRS_190$")
				public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_190() {
					testData = excelDataForTransactionfeature.getTestdata("TRS_190_D1");
				}
				//TRS_191
						@And("^user get the data from the excel sheet for the test case id TRS_191$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_191() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_191_D1");
						}
						//TRS_192
						@And("^user get the data from the excel sheet for the test case id TRS_192$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_192() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_192_D1");
						}
						//TRS_193
						@And("^user get the data from the excel sheet for the test case id TRS_193$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_193() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_193_D1");
						}
						//TRS_194
						@And("^user get the data from the excel sheet for the test case id TRS_194$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_194() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_194_D1");
						}
						//TRS_195
						@And("^user get the data from the excel sheet for the test case id TRS_195$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_195() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_195_D1");
						}
						//TRS_196
						@And("^user get the data from the excel sheet for the test case id TRS_196$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_196() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_196_D1");
						}
						//TRS_197
						@And("^user get the data from the excel sheet for the test case id TRS_197$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_197() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_197_D1");
						}
						//TRS_198
						@And("^user get the data from the excel sheet for the test case id TRS_198$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_198() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_198_D1");
						}
						//TRS_199
						@And("^user get the data from the excel sheet for the test case id TRS_199$")
						public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_199() {
							testData = excelDataForTransactionfeature.getTestdata("TRS_199_D1");
						}
						//TRS_245
						@And("User click the allow back dated value flag under update after approve")
						public void user_click_the_allow_back_dated_value_flag_under_update_after_approve() {
							if (CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate().getAttribute("initialvalue")
									.isBlank()) {
								clicksAndActionsHelper
										.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate());
								clicksAndActionsHelper.clickUsingActionClass(
										CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate(),
										CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate());

							} else {
								clicksAndActionsHelper
										.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate());
								clicksAndActionsHelper.clickUsingActionClass(
										CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate(),
										CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate());
								clicksAndActionsHelper
										.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate());
								clicksAndActionsHelper.clickUsingActionClass(
										CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate(),
										CSMParamTransactionOBJ.csmTransactionTypeAllowBackdatedValueDate());

							}
						}
						    
						

						@And("User click the allow post dated value flag under update after approve")
						public void user_click_the_allow_post_dated_value_flag_under_update_after_approve() {
							javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate());
							if (CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate().getAttribute("initialvalue")
									.isBlank()) {
								clicksAndActionsHelper
										.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate());
								clicksAndActionsHelper.clickUsingActionClass(
										CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate(),
										CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate());

							} else {
								clicksAndActionsHelper
										.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate());
								clicksAndActionsHelper.clickUsingActionClass(
										CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate(),
										CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate());
								clicksAndActionsHelper
										.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate());
								clicksAndActionsHelper.clickUsingActionClass(
										CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate(),
										CSMParamTransactionOBJ.csmTransactionTypeAllowPostdatedValueDate());

							}
						}
						
						@And("^user update test data set id for TRS_119$")
						public void user_update_test_data_set_id_for_trs119() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_119_D1");
						}
						@And("^user update test data set id for TRS_220$")
						public void user_update_test_data_set_id_for_trs220() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_220_D1");
						}
						@And("^user update test data set id for TRS_221$")
						public void user_update_test_data_set_id_for_trs221() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_221_D1");
						}
						@And("^user update test data set id for TRS_222$")
						public void user_update_test_data_set_id_for_trs222() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_222_D1");
						}
						@And("^user update test data set id for TRS_223$")
						public void user_update_test_data_set_id_for_trs223() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_223_D1");
						}
						@And("^user update test data set id for TRS_224$")
						public void user_update_test_data_set_id_for_trs224() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_224_D1");
						}
						@And("^user update test data set id for TRS_225$")
						public void user_update_test_data_set_id_for_trs225() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_225_D1");
						}
						@And("^user update test data set id for TRS_226$")
						public void user_update_test_data_set_id_for_trs226() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_226_D1");
						}
						@And("^user update test data set id for TRS_227$")
						public void user_update_test_data_set_id_for_trs227() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_227_D1");
						}
						@And("^user update test data set id for TRS_228$")
						public void user_update_test_data_set_id_for_trs228() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_228_D1");
						}
						@And("^user update test data set id for TRS_229$")
						public void user_update_test_data_set_id_for_trs229() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_229_D1");
						}
						
						@And("^user update test data set id for TRS_245$")
						public void user_update_test_data_set_id_for_trs245() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_245_D1");
						}
						@And("^user update test data set id for TRS_246$")
						public void user_update_test_data_set_id_for_trs246() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_246_D1");
						}
						@And("^user update test data set id for TRS_247$")
						public void user_update_test_data_set_id_for_trs247() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_247_D1");
						}
						@And("^user update test data set id for TRS_248$")
						public void user_update_test_data_set_id_for_trs248() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_248_D1");
						}
						@And("^user update test data set id for TRS_249$")
						public void user_update_test_data_set_id_for_trs249() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_249_D1");
						}
						@And("^user update test data set id for TRS_250$")
						public void user_update_test_data_set_id_for_trs250() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_250_D1");
						}
						@And("^user update test data set id for TRS_251$")
						public void user_update_test_data_set_id_for_trs251() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_251_D1");
						}
						@And("^user update test data set id for TRS_252$")
						public void user_update_test_data_set_id_for_trs252() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_252_D1");
						}
						@And("^user update test data set id for TRS_253$")
						public void user_update_test_data_set_id_for_trs253() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_253_D1");
						}
						@And("^user update test data set id for TRS_254$")
						public void user_update_test_data_set_id_for_trs254() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_254_D1");
						}
						@And("^user update test data set id for TRS_255$")
						public void user_update_test_data_set_id_for_trs255() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_255_D1");
						}
						@And("^user update test data set id for TRS_256$")
						public void user_update_test_data_set_id_for_trs256() throws Throwable {
							testData = excelDataForTransactionfeature.getTestdata("TRS_256_D1");
						}
						
						//TRS_245
						@And("^user Enter the code in inputfield on updateafterapprove screen under transactiontype$")
						public void user_enter_the_code_in_inputfield_on_updateafterapprove_screen_under_transactiontype()
								throws Throwable {
					for (int i = 0; i < 200; i++) {
						try {
							waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmParam_Transactiontype_inputfield());
							clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmParam_Transactiontype_inputfield());
							clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmParam_Transactiontype_inputfield());
							CSMParamTransactionOBJ.csmParam_Transactiontype_inputfield().sendKeys(testData.get("TRXType_D1"));
							CSMParamTransactionOBJ.csmParam_Transactiontype_inputfield().sendKeys(Keys.ENTER);
							break;
						} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
						}

					}
							
						}
						  @And("user click random click")
					        public void user_click_random_click() {
					            seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, CSMcoreTransactionObj.csmTransactionsMaintenanceRandomClick());
					            seleniumActions.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.csmTransactionsMaintenanceRandomClick());
					            seleniumActions.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.csmTransactionsMaintenanceRandomClick());
					        }
						
}
			
			
			
			
		

			
			
			




		
	


