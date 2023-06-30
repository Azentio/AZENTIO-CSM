package stepdefinitions;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_TransactionOBJ;
import pageobjects.csmParam.CSMSADS_TransactiononstaffaccObj;
import pageobjects.csmParam.CSMcore_TransactionObj;
import resources.BaseClass;
import stepdefinitions.CSMLogin;

public class Transaction_steps_614 {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	// CSM_Transaction_Object CSMTransactionObject = new
	// CSM_Transaction_Object(driver);
	CSMcore_TransactionObj CSMcoreTransactionObj = new CSMcore_TransactionObj(driver);
	CSMParam_TransactionOBJ CSMParamTransactionOBJ = new CSMParam_TransactionOBJ(driver);
	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData testexecution = new ExcelData(path, "TestExecution", "TestCaseID");
	ExcelData excelDataForTransactionfeature = new ExcelData(path, "CSM_Transactions_TestData", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	UserUtility_614 userUtility = new UserUtility_614(driver);

	Map<String, String> testData;
	Map<String, String> executionTestData;

//		---------------------------------------------------------       TRS_188  ------------------------------------------------------------------------------//

	@Given("^user_614 Navigate to CSM Params application and login with valid credentials$")
	public void UserNavigateToCsmParamsApplicationAndLoginWithValidCredentials() throws IOException {
		driver.get(ConfigFileReaderobj.getCSMparamsUrl());
		login.loginIntoCSMParamApplication("CSMParamUser1");
	}

	@And("^user_614 click on the parameters menu under the menu options in the CSM params application$")
	public void UserClickOnTheParametersMenuUnderTheMenuOptionsInTheCsmParamsApplication() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmParametersMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(CSMParamTransactionOBJ.csmParametersMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(CSMParamTransactionOBJ.csmParametersMenu());
	}

	@And("^user_614 get the data from the excel sheet for the test case id TRS_188$")
	public void UserGetTheDataFromTheExcelSheetForTheTestcaseIdTRS_188() {
		executionTestData = testexecution.getTestdata("TRS_188");
		testData = excelDataForTransactionfeature.getTestdata(executionTestData.get("DataSet ID"));

	}

	@And("^user_614 click on Date to Change the Current Date in the CSM core application$")
	public void UserClickOnDateToChangeTheCurrentDateInTheCsmcoreApplication() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CSMcoreTransactionObj.CSMDateToChangeTheCurrentDate());
		seleniumActions.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.CSMDateToChangeTheCurrentDate());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CSMcoreTransactionObj.CSMDateToChangeTheCurrentDate());
	}

	@And("^user_614 Enters the Date in user_614 Running Date in the CSM core application$")
	public void UserEntersTheDateInUserRunningDateInTheCsmcoreApplication() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CSMcoreTransactionObj.CSMDateInUserRunningDate());
		seleniumActions.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.CSMDateInUserRunningDate());
		seleniumActions.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.CSMDateInUserRunningDate());
		CSMcoreTransactionObj.CSMDateInUserRunningDate().clear();
		// CSMTransactionObject.CSMDateInUserRunningDate().sendKeys(testData.get("Dates"));
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		CSMcoreTransactionObj.CSMDateInUserRunningDate().sendKeys(format);
	}

	@And("^user_614 click on Use Button in Change Running Date Popup in the CSM core application$")
	public void UserClickOnUseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CSMcoreTransactionObj.CSMUseButtonInChangeRunningDate());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CSMcoreTransactionObj.CSMUseButtonInChangeRunningDate());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CSMcoreTransactionObj.CSMUseButtonInChangeRunningDate());
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
		}

		catch (Exception e) {
		}
	}

	@And("^user_614 click Ok Button in Information PopUp menu in the CSM core application$")
	public void UserClickOkButtonInInformationPopupMenuInTheCsmcoreApplication() {
		userUtility.clickOnElement(seleniumActions, driver, CSMcoreTransactionObj.CSMOkButtonInAccessDeniedPopUpMenu());
	}

	@And("^user_614 click on Close Button in Change Running Date Popup in the CSM core application$")
	public void UserClickOnCloseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CSMcoreTransactionObj.CSMCloseButtonInChangeRunningDate());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CSMcoreTransactionObj.CSMCloseButtonInChangeRunningDate());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CSMcoreTransactionObj.CSMCloseButtonInChangeRunningDate());
	}

	@And("^user_614 click on Technical Details Icon in the CSM core application$")
	public void UserClickOnTechnicalDetailsIconInTheCsmcoreApplication() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CSMcoreTransactionObj.CSMTechnicalDetailsIcon());
		seleniumActions.getClickAndActionsHelper().moveToElement(CSMcoreTransactionObj.CSMTechnicalDetailsIcon());
		seleniumActions.getClickAndActionsHelper().clickOnElement(CSMcoreTransactionObj.CSMTechnicalDetailsIcon());
	}

	@And("^user_614 click Clear Cache in Technical Details Icon in the CSM core application$")
	public void UserClickClearCacheInTechnicalDetailsIconInTheCsmcoreApplication() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CSMcoreTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CSMcoreTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CSMcoreTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon());
	}

	@And("^user_614 click Ok Button Under Information PopUp Menu in the CSM core application$")
	public void UserClickOkButtonUnderInformationPopupMenuInTheCsmcoreApplication() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CSMcoreTransactionObj.CSMOkButtonUnderInformationPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CSMcoreTransactionObj.CSMOkButtonUnderInformationPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CSMcoreTransactionObj.CSMOkButtonUnderInformationPopUp());
	}

	@And("^user_614 click on the parameters menu under the menu options in the CSM core application$")
	public void UserClickOnTheParametersMenuUnderTheMenuOptionsInTheCsmcoreApplication() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmParametersMenu());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmParametersMenu());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmParametersMenu());
	}

	@And("^user_614 click on the system paramters under the parameters menu$")
	public void UserClickOnTheSystemParamtersUnderTheParametersMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmParametersSystemParameters());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmParametersSystemParameters());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmParametersSystemParameters());
	}

	@And("^user_614 click on the transaction type under the system parameters$")
	public void UserClickOnTheTransactionTypeUnderTheSystemParameters() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionType());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionType());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionType());
	}

	@And("^user_614 click on the update after approve field under the transaction type$")
	public void UserClickOnTheUpdateAfterApproveFieldUnderTheTransactionType() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUA());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUA());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUA());
	}

	@And("^user_614 enters the transaction type code in the code column under the update after approve$")
	public void UserEntersTheTransactionTypeCodeInTheCodeColumnUnderTheUpdateAfterApprove() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput().sendKeys(testData.get("TRXType_D1"));
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeInput().sendKeys(Keys.ENTER);
	}

	@And("^user_614 double clicks on the entered transaction type code from the list to view the transaction type details$")
	public void UserDoubleClicksOnTheEnteredTransactionTypeCodeFromTheListToViewTheTransactionTypeDetails() {
		for (int i = 0; i < 50; i++) {
			try {

				userUtility.doubleClickOnElement(seleniumActions, driver,
						CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACodeDoubleClick());
				break;

			} catch (Exception e) {
				if (i == 49) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_614 click on the GL charges button$")
	public void UserClickOnTheGlChargesButton() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCharges());
	}

	@And("^user_614 click on the any existing added data in the GL charges and click on the delete button to delete it$")
	public void UserClickOnTheAnyExistingAddedDataInTheGlChargesAndClickOnTheDeleteButtonToDeleteIt() {
		userUtility.checkAndDeleteRecord(seleniumActions, driver, 2,
				CSMParamTransactionOBJ.csmTransactionType_GLChargesSelectrows,
				CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_GlCharges_DeleteButton(),
				CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());

//			try {
//				for (int i = 2; i < userUtility.getNumberOfElements(seleniumActions, driver, CSMParamTransactionOBJ.csmTransactionType_GLChargesSelectrows)+1; i++) {
//					driver.findElement(By.xpath(CSMParamTransactionOBJ.csmTransactionType_GLChargesSelectrows + "[2]")).click();
//					CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_GlCharges_DeleteButton().click();
//					userUtility.clickOnElement(seleniumActions, driver, CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}

	}

	@And("^user_614 click on the plus button to add the GL code under the GL charges$")
	public void UserClickOnThePlusButtonToAddTheGlCodeUnderTheGlCharges() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesAddButton());
		clicksAndActionsHelper
				.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesAddButton());
		clicksAndActionsHelper
				.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesAddButton());
	}

	@And("^user_614 enters the GL code under the GL code column$")
	public void UserEntersTheGlCodeUnderTheGlCodeColumn() {
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
//			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
//			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
//			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
//			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput().sendKeys(testData.get("GLCode_Debit"));
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
//			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
//			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput(), testData.get("GL_CODE"));
	}

	@And("^user_614 enters the charge scheme code under the Charge Schema Details column$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumn() {
//			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
//			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
//			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
//			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput().sendKeys(testData.get("ChargeSchema-1"));
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
//			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
//			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput(),
				testData.get("ChargeSchema-1"));
	}

	@And("^user_614 selects all from the dropdown list before the cash account column$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumn() {
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput());					
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput());
		clicksAndActionsHelper
				.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput());
		clicksAndActionsHelper
				.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput());

		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlChargesSelectInput(), "ALL");// testData.get("AccessAll"));
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());

	}

	@And("^user_614 selects account option from the cash account column$")
	public void UserSelectsAccountOptionFromTheCashAccountColumn() {
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
		clicksAndActionsHelper
				.moveToElement(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
		clicksAndActionsHelper
				.clickOnElement(CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input());
		CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input()
				.sendKeys(testData.get("Cash/Acc"));
		CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_Account_Input().sendKeys(Keys.TAB);
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
//			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
//			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
	}

	@And("^user_614 selects the Authorize from the action column$")
	public void UserSelectsTheAuthorizeFromTheActionColumn() {
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput().sendKeys(testData.get("Action"));
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAActionInput().sendKeys(Keys.TAB);
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
//			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());
//			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeGlChargesRandomClick());

	}

	@And("^user_614 click on the OK button to close the GL charges popup menu$")
	public void UserClickOnTheOkButtonToCloseTheGlChargesPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
	}

	@And("^user_614 click or check the Transfer Type is Intra Bank$")
	public void UserClickOrCheckTheTransferTypeIsIntraBank() {

		try {
			CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_IntraBankLabel();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@And("^user_614 click or check the radio button is Main Acc is Debit$")
	public void UserClickOrCheckTheRadioButtonIsMainAccIsDebit() {
		try {
			CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_MainDebtLabel();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@And("^user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu$")
	public void UserClickOrCheckTheRadioButtonDeductFromDebtorAccountUnderAvailableOptionsForDeductIMenu() {
		try {
			CSMParamTransactionOBJ.csm_SystemParameters_TransactionTypeUA_DebtFromDebitorRadioButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("^user_614 click on the dummy check both to save the changes$")
	public void UserClickOnTheDummyCheckBothToSaveTheChanges() {
		try {
			userUtility.clickOnElement(seleniumActions, driver,
					CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_DummyCheck());
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("^user_614 click on the update after approve button to save the changes$")
	public void UserClickOnTheUpdateAfterApproveButtonToSaveTheChanges() {

		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeUpdateAfterApproveButton());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
	}

	@And("^user_614 click on the approve field under the transaction type menu$")
	public void UserClickOnTheApproveFieldUnderTheTransactionTypeMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeApproveScreen());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreen());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreen());
	}

	@And("^user_614 enters the transaction type code in the code column under the approve menu$")
	public void UserEntersTheTransactionTypeCodeInTheCodeColumnUnderTheApproveMenu() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput());
		CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput().sendKeys(testData.get("TRXType_D1"));
		CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInput().sendKeys(Keys.ENTER);
	}

	@And("^user_614 click on the approve button to approve the changes$")
	public void UserClickOnTheApproveButtonToApproveTheChanges() {
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
		userUtility.scrollDownTillEnd(driver);
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
		waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmTransactionTypeSuccessOkButton());
	}

	@And("^user_614 click on Log Out icon to log out from the CSM Params application$")
	public void UserClickOnLogOutIconToLogOutFromTheCsmParamsApplication() {
		userUtility.clickOnElement(seleniumActions, driver, CSMParamTransactionOBJ.csmLogoutUnderCSMParams());

	}

	@And("^user_614 click on Transactions under CSM application in the CSM core application$")
	public void UserClickOnTransactionsUnderCsmApplicationInTheCsmCoreApplication() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactions());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactions());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTransactions());
	}

	@And("^user_614 click on Maintenance under Transactions in the CSM core application$")
	public void UserClickOnMaintenanceUnderTransactionsInTheCsmCoreApplication() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaintenanceScreen());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintenanceScreen());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintenanceScreen());
	}

	@And("^user_614 enters the transaction type$")
	public void UserEntersTheTransactionType() {
		
		for (int i = 0; i < 50; i++) {
			try {
				
				waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTrxTypeInput());
				clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTrxTypeInput());
				clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTrxTypeInput());
				CSMcoreTransactionObj.transactionsTrxTypeInput().sendKeys(testData.get("TRXType_D1"));
				CSMcoreTransactionObj.transactionsTrxTypeInput().sendKeys(Keys.TAB);
				
				break;

			} catch (Exception e) {
				if (i == 49) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("^user_614 Enter the Branch Code for AC1 in Maintenance Screen$")
	public void UserEnterTheBranchCodeForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput());
		CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(testData.get("BranchCode_Debit"));
		CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 Enter Currency Code for AC1 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		CSMcoreTransactionObj.transactionsDebitAccCurrencyInput().sendKeys(testData.get("CurrencyCode_Debit"));
		CSMcoreTransactionObj.transactionsDebitAccCurrencyInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 Enter GL Code for AC1 in Maintenance Screen$")
	public void UserEnterGlCodeForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccGlcodeInput());
		CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(testData.get("GLCode_Debit"));
		CSMcoreTransactionObj.transactionsDebitAccGlcodeInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 Enter CIF Code for AC1 in Maintenance Screen$")
	public void UserEnterCifCodeForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCifcodeInput());
		CSMcoreTransactionObj.transactionsDebitAccCifcodeInput().sendKeys(testData.get("CIFCode_Debit"));
		CSMcoreTransactionObj.transactionsDebitAccCifcodeInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 Enter Serial for AC1 in Maintenance Screen$")
	public void UserEnterSerialForAc1InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput());
		CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput().sendKeys(testData.get("SerialNo_Debit"));
		CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 click Ok Button in Warning PopUp Menu$")
	public void UserClickOkButtonInWarningPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsWarningOkbtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsWarningOkbtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsWarningOkbtn());
	}

	@And("^user_614 Enter the Currency in Maintenance Screen$")
	public void UserEnterTheCurrencyInMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaincCurrencyInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaincCurrencyInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaincCurrencyInput());
		CSMcoreTransactionObj.transactionsMaincCurrencyInput().sendKeys(testData.get("CurrencyCode_Debit"));
		CSMcoreTransactionObj.transactionsMaincCurrencyInput().sendKeys(Keys.TAB);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("^user_614 Enter the Amount in Maintenance Screen$")
	public void UserEnterTheAmountInMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsEnterAmountInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsEnterAmountInput());
		CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(testData.get("Amount"));
		CSMcoreTransactionObj.transactionsEnterAmountInput().sendKeys(Keys.TAB);
		clicksAndActionsHelper.rightClick(CSMcoreTransactionObj.transactionsEnterAmountInput());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//		@And("^user_614 Enter the Branch Code for AC2 in Maintenance Screen$")
//		public void UserEnterTheBranchCodeForAc2InMaintenanceScreen() {
//
//		}
	@And("^user_614 Enter Currency Code for AC2 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc2InMaintenanceScreen() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsDebitAccCurrencyInput());
		CSMcoreTransactionObj.transactionsDebitAccCurrencyInput().sendKeys(testData.get("CurrencyCode_Credit"));
		CSMcoreTransactionObj.transactionsDebitAccCurrencyInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 Enter GL Code for AC2 in Maintenance Screen$")
	public void UserEnterGlCodeForAc2InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsCreditAccGlcodeInput());
		CSMcoreTransactionObj.transactionsCreditAccGlcodeInput().sendKeys(testData.get("GLCode_Credit"));
		CSMcoreTransactionObj.transactionsCreditAccGlcodeInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 Enter CIF Code for AC2 in Maintenance Screen$")
	public void UserEnterCifCodeForAc2InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsCreditAccCifcodeInput());
		CSMcoreTransactionObj.transactionsCreditAccCifcodeInput().sendKeys(testData.get("CIFCode_Credit"));
		CSMcoreTransactionObj.transactionsCreditAccCifcodeInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 Enter Serial for AC2 in Maintenance Screen$")
	public void UserEnterSerialForAc2InMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput());
		CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(testData.get("SerialNo_Credit"));
		CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput().sendKeys(Keys.TAB);
	}

	@And("^user_614 click Save Button in Maintenance Screen$")
	public void UserClickSaveButtonInMaintenanceScreen() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaintanceSavebtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintanceSavebtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintanceSavebtn());
	}

	@And("^user_614 Get the Transaction No in Success PopUo Menu$")
	public void UserGetTheTransactionNoInSuccessPopuoMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.getTransactionNumber());
		String transactionNo = CSMcoreTransactionObj.getTransactionNumber().getText().substring(15, 19);
		System.out.println(transactionNo);
		excelDataForTransactionfeature.updateTestData("TRS_188_D1", "TRXNo", transactionNo);
		testData = excelDataForTransactionfeature.getTestdata("TRS_188_D1");
	}

	@And("^user_614 click Ok Button in Success PopUp Menu$")
	public void UserClickOkButtonInSuccessPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionTrxsuccesspopupOkbtn());
	}

	@And("^user_614 click on Approve Screen under Transactions menu$")
	public void UserClickOnApproveScreenUnderTransactionsMenu() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsApproveScreen());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsApproveScreen());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsApproveScreen());
	}

	@And("^user_614 Enter the Transaction No in Approve Screens$")
	public void UserEnterTheTransactionNoInApproveScreens() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsTransactionNoInputValue());
		CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(testData.get("TRXNo"));
		CSMcoreTransactionObj.transactionsTransactionNoInputValue().sendKeys(Keys.ENTER);
	}

	@And("^user_614 Double click on the Transaction No$")
	public void UserDoubleClickOnTheTransactionNo() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
		clicksAndActionsHelper.doubleClick(CSMcoreTransactionObj.transactionsTransactionNoDoubleclk());
	}

	@And("^user_614 click on Approve Button for approve the Transaction$")
	public void UserClickOnApproveButtonForApproveTheTransaction() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsApprovescreenAppbtn());
		javascriptHelper.scrollIntoView(CSMcoreTransactionObj.transactionsApprovescreenAppbtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsApprovescreenAppbtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsApprovescreenAppbtn());
	}

	@And("^user_614 click on Ok Button in Success PopUp Menu for Approve Transcation$")
	public void UserClickOnOkButtonInSuccessPopupMenuForApproveTranscation() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.ConfirmOk());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.ConfirmOk());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.ConfirmOk());
	}

	@And("^user_614 click on Maintenance under Transactions$")
	public void UserClickOnMaintenanceUnderTransactions() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaintenanceScreen());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintenanceScreen());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintenanceScreen());
	}

	@And("^user_614 click Ok Button in Warning PopUp to go back to Maintenance$")
	public void UserClickOkButtonInWarningPopupToGoBackToMaintenance() {
		userUtility.clickOnElement(seleniumActions, driver,
				CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
	}

	@And("^user_614 click on Search Button in Maintenance Screen$")
	public void UserClickOnSearchButtonInMaintenanceScreen() {

		for (int i = 0; i < 200; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						CSMcoreTransactionObj.transactionsMaintanceSearchIcon());
				clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintanceSearchIcon());
				clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintanceSearchIcon());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_614 Enter the Transaction No in Search Boxs$")
	public void UserEnterTheTransactionNoInSearchBoxs() {
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.CSMenterTransactionNoUnderMaintenance());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.CSMenterTransactionNoUnderMaintenance());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.CSMenterTransactionNoUnderMaintenance());
		CSMcoreTransactionObj.CSMenterTransactionNoUnderMaintenance().sendKeys(testData.get("TRXNo"));
		CSMcoreTransactionObj.CSMenterTransactionNoUnderMaintenance().sendKeys(Keys.ENTER);
	}

	@And("^user_614 Double click on the Searched Transaction No in Search Box$")
	public void UserDoubleClickOnTheSearchedTransactionNoInSearchBox() {
		userUtility.doubleClickOnElement(seleniumActions, driver,
				CSMcoreTransactionObj.CSMclickOnEnteredTransactionNoUnderMaintenance());
	}

	@And("^user_614 click on Booked Entries in Maintenance Screen$")
	public void UserClickOnBookedEntriesInMaintenanceScreen() {
		userUtility.scrollDownTillEnd(driver);
		waitHelper.waitForElementwithFluentwait(driver, CSMcoreTransactionObj.transactionsMaintanceBookedEntriesBtn());
		clicksAndActionsHelper.moveToElement(CSMcoreTransactionObj.transactionsMaintanceBookedEntriesBtn());
		clicksAndActionsHelper.clickOnElement(CSMcoreTransactionObj.transactionsMaintanceBookedEntriesBtn());
	}

//		---------------------------------------------------------       TRS_189  ------------------------------------------------------------------------------//

	@And("^user_614 get the data from the excel sheet for the test case id TRS_189$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_189() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_189_D1");
	}

	@And("^user_614 enters the GL code under the GL code column to link charge code 2$")
	public void UserEntersTheGlCodeUnderTheGlCodeColumnToLinkChargeCode2() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput().sendKeys(testData.get("All_Gl"));
		javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAGlCodeInput());
	}

	@And("^user_614 enters the charge scheme code under the Charge Schema Details column to link charge code 2$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnToLinkChargeCode2() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		clicksAndActionsHelper
				.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		clicksAndActionsHelper
				.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput()
				.sendKeys(testData.get("ChargeSchema-2"));
		javascriptHelper
				.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
		clicksAndActionsHelper
				.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput());
	}
//		@And("^user_614 selects all from the dropdown list before the cash account column to link charge code 2$")
//		public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnToLinkChargeCode2() {
//
//		}
//		@And("^user_614 selects account option from the cash account column to link charge code 2$")
//		public void UserSelectsAccountOptionFromTheCashAccountColumnToLinkChargeCode2() {
//
//		}
//		@And("^user_614 selects the Authorize from the action column to link charge code 2$")
//		public void UserSelectsTheAuthorizeFromTheActionColumnToLinkChargeCode2() {
//
//		}

//		-------------------------------------------------- TRS_191 --------------------------------------------------------------

	@And("^user_614 click on the CIF Priority charges button$")
	public void UserClickOnTheCifPriorityChargesButton() {

		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
		clicksAndActionsHelper
				.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
		clicksAndActionsHelper
				.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
	}

	@And("^user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it$")
	public void UserClickOnTheAnyExistingAddedDataInTheCifPriorityChargesAndClickOnTheDeleteButtonToDeleteIt() {

		userUtility.checkAndDeleteRecord(seleniumActions, driver, 2,
				CSMParamTransactionOBJ.csmTransactionType_CIFPriorityChargesSelectrows,
				CSMParamTransactionOBJ.csmTransactionTypeCifPriorityChargesDeleteButton(),
				CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
	}

	@And("^user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1$")
	public void UserClickOnThePlusButtonToAddTheCifPriorityChargesUnderTheCifPriorityChargesToLinkTheChargeCodeForAc1() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
		clicksAndActionsHelper.moveToElement(
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
		clicksAndActionsHelper.clickOnElement(
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
	}

	@And("^user_614 enters the CIF number under the CIF Priority Charges column$")
	public void UserEntersTheCifnumberUnderTheCifPriorityChargesColumn() {
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
//			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
//			clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
//			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
//			CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges().sendKeys(testData.get("CIFCode_Debit"));
//			javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
//			waitHelper.waitForElementwithFluentwait(driver, CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
//			clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityCharges());
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges(),
				testData.get("CIFCode_Debit"));

	}

	@And("^user_614 click on the OK button to close the CIF Priority Charges popup menu$")
	public void UserClickOnTheOkButtonToCloseTheCifPriorityChargesPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
	}

	@And("^user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC2$")
	public void UserClickOnThePlusButtonToAddTheCifPriorityChargesUnderTheCifPriorityChargesToLinkTheChargeCodeForAc2() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
		clicksAndActionsHelper.moveToElement(
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
		clicksAndActionsHelper.clickOnElement(
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());

	}

//		---------------------------------------------------------------- TRS_192-------------------------------------------------------------------------------------

	@And("^user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account$")
	public void UserClickOnThePlusButtonToAddTheCifPriorityChargesUnderTheCifPriorityChargesToLinkTheChargeCodeForAllAccount() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
		clicksAndActionsHelper.moveToElement(
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
		clicksAndActionsHelper.clickOnElement(
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifPriorityChargesAddButton());
	}

	// ------------------------------------------------------ TRS_193
	// ----------------------------------------------

//		----------------------------------------------------------- TRS_194 -----------------------------------------------------------------

	@And("^user_614 click on the any existing added data in the CIF Prioritycharges and click on the delete button to delete it$")
	public void UserClickOnTheAnyExistingAddedDataInTheCifPrioritychargesAndClickOnTheDeleteButtonToDeleteIt() {

	}

	@And("^user_614 click on the plus button to add the CIF Priority code under the CIF Priority charges$")
	public void UserClickOnThePlusButtonToAddTheCifPriorityCodeUnderTheCifPriorityCharges() {

	}

	@And("^user_614 enters the CIF Prioritycode under the CIF Priority code column for AC1$")
	public void UserEntersTheCifPrioritycodeUnderTheCifPriorityCodeColumnForAc1() {

	}

	@And("^user_614 enters the CIF Priority code under the CIF Priority code column to link charge code 2 for AC2$")
	public void UserEntersTheCifPriorityCodeUnderTheCifPriorityCodeColumnToLinkChargeCode2ForAc2() {

	}

//		----------------------------------------------------- TRS_195 ----------------------------------------------------------------------

	@And("^user_614 click on the CIF Type charges button$")
	public void UserClickOnTheCifTypeChargesButton() {
		userUtility.clickOnElement(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeCharges());
	}

	@And("^user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it$")
	public void UserClickOnTheAnyExistingAddedDataInTheCifTypeChargesAndClickOnTheDeleteButtonToDeleteIt() {
		userUtility.checkAndDeleteRecord(seleniumActions, driver, 2,
				CSMParamTransactionOBJ.csmTransactionType_CIFTypeChargesSelectrows,
				CSMParamTransactionOBJ.csmTransactionTypeCifTypeChargesDeleteButton(),
				CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());

	}

	@And("^user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1$")
	public void UserClickOnThePlusButtonToAddTheCifTypeChargesUnderTheCifTypeChargesToLinkTheChargeCodeForAc1() {
		userUtility.clickOnElement(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesAddButton());
	}

	@And("^user_614 enters the CIF Type Charges under the CIF Type Charges column$")
	public void UserEntersTheCifTypeChargesUnderTheCifTypeChargesColumn() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges(),
				testData.get("CIF_TYPE_CHARGES"));

	}

	@And("^user_614 click on the OK button to close the CIF Type Charges popup menu$")
	public void UserClickOnTheOkButtonToCloseTheCifTypeChargesPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
	}

//		--------------------------------- TRS_196 to TRS_205 ---------------------------------------------------------

	@And("^user_614 get the data from the excel sheet for the test case id TRS_200$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_200() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_200_D1");
	}

	@And("^user_614 get the data from the excel sheet for the test case id TRS_201$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_201() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_201_D1");
	}

	@And("^user_614 get the data from the excel sheet for the test case id TRS_202$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_202() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_202_D1");
	}

	@And("^user_614 get the data from the excel sheet for the test case id TRS_203$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_203() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_203_D1");
	}

	@And("^user_614 get the data from the excel sheet for the test case id TRS_204$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_204() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_204_D1");
	}

	@And("^user_614 get the data from the excel sheet for the test case id TRS_205$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_205() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_205_D1");
	}

	@And("^user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC2$")
	public void UserClickOnThePlusButtonToAddTheCifTypeChargesUnderTheCifTypeChargesToLinkTheChargeCodeForAc2() {
		userUtility.clickOnElement(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesAddButton());
	}

	@And("^user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account$")
	public void UserClickOnThePlusButtonToAddTheCifTypeChargesUnderTheCifTypeChargesToLinkTheChargeCodeForAllAccount() {
		userUtility.clickOnElement(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUACifTypeChargesAddButton());
	}

	@And("^user_614 click on the Account charges button$")
	public void UserClickOnTheAccountChargesButton() {
		
		for (int i = 0; i < 200; i++) {
			try {
				userUtility.clickOnElement(seleniumActions, driver,
						CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AccountCharges());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_614 click on the any existing added data in the Account charges and click on the delete button to delete it$")
	public void UserClickOnTheAnyExistingAddedDataInTheAccountChargesAndClickOnTheDeleteButtonToDeleteIt() {
		userUtility.checkAndDeleteRecord(seleniumActions, driver, 2,
				CSMParamTransactionOBJ.csmTransactionType_AccountChargesSelectrows,
				CSMParamTransactionOBJ.csmDeleteButtonUnder_AccountCharges(),
				CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
	}

	@And("^user_614 click on the plus button to add the Account code under the Account charges$")
	public void UserClickOnThePlusButtonToAddTheAccountCodeUnderTheAccountCharges() {
		userUtility.clickOnElement(seleniumActions, driver, CSMParamTransactionOBJ.csmAddButtonUnder_AccountCharges());
	}

	@And("^user_614 enters the Account code under the Account code column$")
	public void UserEntersTheAccountCodeUnderTheAccountCodeColumn() throws InterruptedException {
		addAccountDetailsUnderAccountCharges(CSMParamTransactionOBJ.accountAddUnderAccountCharges);
	}

	@And("^user_614 click on the OK button to close the Account charges popup menu$")
	public void UserClickOnTheOkButtonToCloseTheAccountChargesPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
	}

	@And("^user_614 click on the CIF charges button$")
	public void UserClickOnTheCifChargesButton() {
		userUtility.clickOnElement(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_CIFCharges());
	}

	@And("^user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it$")
	public void UserClickOnTheAnyExistingAddedDataInTheCifChargesAndClickOnTheDeleteButtonToDeleteIt() {
		userUtility.checkAndDeleteRecord(seleniumActions, driver, 2,
				CSMParamTransactionOBJ.csmTransactionType_CIFChargesSelectrows,
				CSMParamTransactionOBJ.csmDeleteButtonUnder_CIFCharges(),
				CSMParamTransactionOBJ.csmTransactionTypeConfirmOkButton());
	}

	@And("^user_614 click on the plus button to add the CIF code under the CIF charges$")
	public void UserClickOnThePlusButtonToAddTheCifCodeUnderTheCifCharges() {
		userUtility.clickOnElement(seleniumActions, driver, CSMParamTransactionOBJ.csmAddButtonUnder_CIFCharges());
	}

	@And("^user_614 enters the CIF code under the CIF code column$")
	public void UserEntersTheCifCodeUnderTheCifCodeColumn() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFCharges(),
				testData.get("CIF_CHARGES"));

	}

	@And("^user_614 click on the OK button to close the CIF charges popup menu$")
	public void UserClickOnTheOkButtonToCloseTheCifChargesPopupMenu() {
		waitHelper.waitForElementwithFluentwait(driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.moveToElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
		clicksAndActionsHelper.clickOnElement(CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAOk_Buton());
	}
	
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema2$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchema2() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput2(),
				testData.get("ChargeSchema-2"));
		
	}
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema3$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchema3() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput3(),
				testData.get("ChargeSchema-3"));
	}
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema4$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchema4() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput4(),
				testData.get("ChargeSchema-4"));
	}
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema5$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchema5() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput5(),
				testData.get("ChargeSchema-5"));
	}

	@And("^user_614 click on the plus button to add the GL code under the GL charges for all account$")
	public void UserClickOnThePlusButtonToAddTheGlCodeUnderTheGlChargesForAllAccount() {

	}

	@And("^user_614 enters the GL code under the GL code column for all account$")
	public void UserEntersTheGlCodeUnderTheGlCodeColumnForAllAccount() {

	}

	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for all account$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForAllAccount() {

	}

	@And("^user_614 selects all from the dropdown list before the cash account column for all account$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnForAllAccount() {

	}

	@And("^user_614 selects account option from the cash account column for all account$")
	public void UserSelectsAccountOptionFromTheCashAccountColumnForAllAccount() {

	}

	@And("^user_614 selects the Authorize from the action column for all account$")
	public void UserSelectsTheAuthorizeFromTheActionColumnForAllAccount() {

	}

	// TRS_190
	@And("^user_614 get the data from the excel sheet for the test case id TRS_190$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_190() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_190_D1");
	}

	// TRS_191
	@And("^user_614 get the data from the excel sheet for the test case id TRS_191$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_191() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_191_D1");
	}

	// TRS_192
	@And("^user_614 get the data from the excel sheet for the test case id TRS_192$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_192() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_192_D1");
	}

	// TRS_193
	@And("^user_614 get the data from the excel sheet for the test case id TRS_193$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_193() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_193_D1");
	}

	// TRS_194
	@And("^user_614 get the data from the excel sheet for the test case id TRS_194$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_194() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_194_D1");
	}

	// TRS_195
	@And("^user_614 get the data from the excel sheet for the test case id TRS_195$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_195() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_195_D1");
	}

	// TRS_196
	@And("^user_614 get the data from the excel sheet for the test case id TRS_196$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_196() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_196_D1");
	}

	// TRS_197
	@And("^user_614 get the data from the excel sheet for the test case id TRS_197$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_197() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_197_D1");
	}

	// TRS_198
	@And("^user_614 get the data from the excel sheet for the test case id TRS_198$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_198() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_198_D1");
	}

	// TRS_199
	@And("^user_614 get the data from the excel sheet for the test case id TRS_199$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_199() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_199_D1");
	}

//			____ new steps _____________

	@And("^user_614 double clicks on the entered transaction type code from the list to view the transaction type details in approve screen$")
	public void UserDoubleClicksOnTheEnteredTransactionTypeCodeFromTheListToViewTheTransactionTypeDetailsInApproveScreen() {
		userUtility.doubleClickOnElement(seleniumActions, driver,
				CSMParamTransactionOBJ.csmTransactionTypeApproveScreenCodeInputDoubleClick());

	}

	@Given("^user_614 Navigate to CSM core application and login with valid credentials$")
	public void UserNavigateToCsmCoreApplicationAndLoginWithValidCredentials() throws IOException {
		driver.get(ConfigFileReaderobj.getCSMApplicationUrl());
		login.loginIntoCSMApplication("CSMUser1");
	}

	@And("^user_614 enters the CIF priority code under the CIF Priority Charges column$")
	public void UserEntersTheCifPriorityCodeUnderTheCifPriorityChargesColumn() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges(),
				testData.get("CIF_Priority_Code"));
	}

	@And("^user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnUnderTheCifPriorityChargesColumn() {
		selectDropdownUnderTransactionChargeCode(
				CSMParamTransactionOBJ.csmTransactionType_CIFPriorityChargesSelectDropdowns);
	}

	@And("^user_614 selects account option from the cash account column under the CIF Priority Charges column$")
	public void UserSelectsAccountOptionFromTheCashAccountColumnUnderTheCifPriorityChargesColumn() {

	}

	@And("^user_614 selects the Authorize from the action column under the CIF Priority Charges column$")
	public void UserSelectsTheAuthorizeFromTheActionColumnUnderTheCifPriorityChargesColumn() {

	}

	public void selectDropdownUnderTransactionChargeCode(String xpath) {
		List<WebElement> findElements = driver.findElements(By.xpath(xpath));
		String[] arrayString = { "ALL", "Account", "Authorize" };

		for (int i = 1; i < findElements.size() + 1; i++) {
			WebElement findElement = driver.findElement(By.xpath("(" + xpath + ")[" + i + "]"));
			userUtility.selectFromDropdown(seleniumActions, driver, findElement, arrayString[i - 1]);
		}
	}

	@And("^user_614 selects all from the dropdown list before the cash account column for CIF Type charge$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnForCifTypeCharge() {
		selectDropdownUnderTransactionChargeCode(
				CSMParamTransactionOBJ.csmTransactionType_CIFTypeChargesSelectDropdowns);
	}
	
	
	@And("^user_614 selects all from the dropdown list before the cash account column under the GL Charges column$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnUnderTheGlChargesColumn() {
		selectDropdownUnderTransactionChargeCode(CSMParamTransactionOBJ.csmTransactionType_GLChargesSelectDropdowns);
	}

	@And("^user_614 selects account option from the cash account column for CIF Type charge$")
	public void UserSelectsAccountOptionFromTheCashAccountColumnForCifTypeCharge() {

	}

	@And("^user_614 selects the Authorize from the action column for CIF Type charge$")
	public void UserSelectsTheAuthorizeFromTheActionColumnForCifTypeCharge() {

	}

	public void addAccountDetailsUnderAccountCharges(String xpath) throws InterruptedException {

		List<WebElement> findElements = driver.findElements(By.xpath(xpath));
		String[] arrayString = { testData.get("BranchCode_Debit"), testData.get("CurrencyCode_Debit"),
				testData.get("GLCode_Debit"), testData.get("CIFCode_Debit"), testData.get("SerialNo_Debit") };

		for (int i = 1; i < 6; i++) {
			WebElement findElement = driver.findElement(By.xpath("(" + xpath + ")[" + i + "]"));
			userUtility.enterDataAndTab(seleniumActions, driver, findElement, arrayString[i - 1]);

			if (i == 4 || i == 5) {

				for (int i1 = 0; i1 < 200; i1++) {
					try {
						userUtility.clickOnElement(seleniumActions, driver,
								CSMParamTransactionOBJ.csmCloseMemoUnderCharges());
						break;
					} catch (Exception e) {
						if (i1 == 199) {
							Assert.fail(e.getMessage());
						}
					}
				}

			}

		}

	}

	@And("^user_614 selects all from the dropdown list before the cash account column under Account charges$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnUnderAccountCharges() {
		selectDropdownUnderTransactionChargeCode(
				CSMParamTransactionOBJ.csmTransactionType_AccountChargesSelectDropdowns);
	}
	
	@And("^user_614 selects all from the dropdown list before the cash account column for CIF charges$")
	public void UserSelectsAllFromTheDropdownListBeforeTheCashAccountColumnForCifCharges() {
		selectDropdownUnderTransactionChargeCode(
				CSMParamTransactionOBJ.csmTransactionType_CIFChargesSelectDropdowns);
	}
	
	public void CifNoLoopUnderCharges(String Xpath) {
		
		List<WebElement> findElements = driver.findElements(By.xpath(Xpath));
		
		for (int i = 1; i < findElements.size()+1; i++) {
			String newXpath = Xpath+"["+i+"]";
			WebElement element = driver.findElement(By.xpath(newXpath));
			userUtility.enterDataAndTab(seleniumActions, driver, element, testData.get("CIF_Priority_Code"));
		}
	}
	
	public void SchemeCodeLoopUnderCharges(String Xpath, String value) {
		
		List<WebElement> findElements = driver.findElements(By.xpath(Xpath));
		
		for (int i = 1; i < findElements.size()+1; i++) {
			String newXpath = Xpath+"["+i+"]";
			WebElement element = driver.findElement(By.xpath(newXpath));
			userUtility.enterDataAndTab(seleniumActions, driver, element, value);
		}
	}
	
	@And("^user_614 enters the CIF Charge code under the CIF code column1$")
	public void UserEntersTheCifChargeCodeUnderTheCifCodeColumn1() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges1(), testData.get("CIF_CHARGES"));

	}
	
	
	@And("^user_614 enters the CIF priority charge code under the CIF code column2$")
	public void UserEntersTheCifPriorityChargeCodeUnderTheCifCodeColumn2() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges2(), testData.get("CIF_Priority_Code"));
	}
	@And("^user_614 enters the GL code under the CIF code column3$")
	public void UserEntersTheGlCodeUnderTheCifCodeColumn3() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges3(), testData.get("GL_CODE"));
	}
	@And("^user_614 enters the CIF Type code under the CIF code column4$")
	public void UserEntersTheCifTypeCodeUnderTheCifCodeColumn4() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges4(), testData.get("CIF_TYPE_CHARGES"));
	}
	
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema column1$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchemaColumn1() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput(),
				testData.get("ChargeSchema-2"));
		
	}
	
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema column2$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchemaColumn2() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput2(),
				testData.get("ChargeSchema-3"));
	}

	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema column3$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchemaColumn3() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput3(),
				testData.get("ChargeSchema-4"));
	}
	
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema column4$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchemaColumn4() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput4(),
				testData.get("ChargeSchema-5"));
	}
	
	@And("^user_614 enters the CIF priority charge code under the CIF code column1$")
	public void UserEntersTheCifPriorityChargeCodeUnderTheCifCodeColumn1() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges1(), testData.get("CIF_Priority_Code"));

	}
	@And("^user_614 enters the charge scheme code for the Charge Schema Details column1 under CIF priority charge$")
	public void UserEntersTheChargeSchemeCodeForTheChargeSchemaDetailsColumn1UnderCifPriorityCharge() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput(),
				testData.get("ChargeSchema-3"));
	}
	
	@And("^user_614 enters the GL code under the CIF code column2$")
	public void UserEntersTheGlCodeUnderTheCifCodeColumn2() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges2(), testData.get("GL_CODE"));
		
	}
	
	@And("^user_614 enters the GL code under the CIF code column2_1$")
	public void UserEntersTheGlCodeUnderTheCifCodeColumn2_1() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges2(), testData.get("GL_CODE2"));
		
	}
	
	
	@And("^user_614 enters the charge scheme code for the Charge Schema Details column2 under GL charge$")
	public void UserEntersTheChargeSchemeCodeForTheChargeSchemaDetailsColumn2UnderGlCharge() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput2(),
				testData.get("ChargeSchema-4"));
	}
	
	@And("^user_614 enters the CIF Type code under the CIF code column3$")
	public void UserEntersTheCifTypeCodeUnderTheCifCodeColumn3() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges3(), testData.get("CIF_TYPE_CHARGES"));

	}
	@And("^user_614 enters the charge scheme code for the Charge Schema Details column3 under CIF Type charge$")
	public void UserEntersTheChargeSchemeCodeForTheChargeSchemaDetailsColumn3UnderCifTypeCharge() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput3(),
				testData.get("ChargeSchema-5"));
	}
	
	@And("^user_614 enters the GL code under the CIF code column1$")
	public void UserEntersTheGlCodeUnderTheCifCodeColumn1() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges1(), testData.get("GL_CODE"));

	}
	@And("^user_614 enters the charge scheme code for the Charge Schema Details column1 under GL charge$")
	public void UserEntersTheChargeSchemeCodeForTheChargeSchemaDetailsColumn1UnderGlCharge() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput(),
				testData.get("ChargeSchema-4"));
	}
	@And("^user_614 enters the CIF Type code under the CIF code column2$")
	public void UserEntersTheCifTypeCodeUnderTheCifCodeColumn2() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges2(), testData.get("CIF_TYPE_CHARGES"));

	}
	@And("^user_614 enters the charge scheme code for the Charge Schema Details column2 under CIF Type charge$")
	public void UserEntersTheChargeSchemeCodeForTheChargeSchemaDetailsColumn2UnderCifTypeCharge() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput2(),
				testData.get("ChargeSchema-5"));
	}
	
	@And("^user_614 enters the CIF Type code under the CIF code column1$")
	public void UserEntersTheCifTypeCodeUnderTheCifCodeColumn1() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges1(), testData.get("CIF_TYPE_CHARGES"));

	}
	@And("^user_614 enters the charge scheme code for the Charge Schema Details column1 under CIF Type charge$")
	public void UserEntersTheChargeSchemeCodeForTheChargeSchemaDetailsColumn1UnderCifTypeCharge() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput(),
				testData.get("ChargeSchema-5"));
	}
	
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column for schema1$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumnForSchema1() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput(),
				testData.get("ChargeSchema-1"));
	}
	@And("^user_614 enters the charge scheme code2 for the Charge Schema Details column2 under GL charge$")
	public void UserEntersTheChargeSchemeCode2ForTheChargeSchemaDetailsColumn2UnderGlCharge() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput2(),
				testData.get("ChargeSchema-2"));
	}
	@And("^user_614 enters the charge scheme code3 for the Charge Schema Details column2 under GL charge$")
	public void UserEntersTheChargeSchemeCode3ForTheChargeSchemaDetailsColumn2UnderGlCharge() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput2(),
				testData.get("ChargeSchema-3"));
	}
	
	@And("^user_614 enters the GL code under the CIF code column1_1$")
	public void UserEntersTheGlCodeUnderTheCifCodeColumn1_1() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges1(), testData.get("GL_CODE2"));
	}
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column_1$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumn_1() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput(),
				testData.get("ChargeSchema-2"));
	}
	
	@And("^user_614 Enter the Branch Code for AC1_01 in Maintenance Screen$")
	public void UserEnterTheBranchCodeForAc1_01InMaintenanceScreen() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMcoreTransactionObj.transactionsDepositAccBranchcodeInput(), testData.get("BranchCode_Credit"));
	}
	@And("^user_614 Enter Currency Code for AC1_01 in Maintenance Screen$")
	public void UserEnterCurrencyCodeForAc1_01InMaintenanceScreen() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMcoreTransactionObj.transactionsDebitAccCurrencyInput(), testData.get("CurrencyCode_Credit"));
	}
	@And("^user_614 Enter GL Code for AC1_01 in Maintenance Screen$")
	public void UserEnterGlCodeForAc1_01InMaintenanceScreen() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMcoreTransactionObj.transactionsDebitAccGlcodeInput(), testData.get("GLCode_Credit"));
	}
	@And("^user_614 Enter CIF Code for AC1_01 in Maintenance Screen$")
	public void UserEnterCifCodeForAc1_01InMaintenanceScreen() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMcoreTransactionObj.transactionsDebitAccCifcodeInput(), testData.get("CIFCode_Credit"));
	}
	@And("^user_614 Enter Serial for AC1_01 in Maintenance Screen$")
	public void UserEnterSerialForAc1_01InMaintenanceScreen() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMcoreTransactionObj.transactionsDebitAccSerialcodeInput(), testData.get("SerialNo_Credit"));
	}
	@And("^user_614 Enter GL Code for AC2_01 in Maintenance Screen$")
	public void UserEnterGlCodeForAc2_01InMaintenanceScreen() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMcoreTransactionObj.transactionsCreditAccGlcodeInput(), testData.get("GLCode_Debit"));
	}
	@And("^user_614 Enter CIF Code for AC2_01 in Maintenance Screen$")
	public void UserEnterCifCodeForAc2_01InMaintenanceScreen() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMcoreTransactionObj.transactionsCreditAccCifcodeInput(), testData.get("CIFCode_Debit"));
	}
	@And("^user_614 Enter Serial for AC2_01 in Maintenance Screen$")
	public void UserEnterSerialForAc2_01InMaintenanceScreen() {
		userUtility.enterDataAndTab(seleniumActions, driver, CSMcoreTransactionObj.transactionsCreditAccSerialcodeInput(), testData.get("SerialNo_Debit"));
	}
	
	@And("^user_614 enters the CIF priority code under the CIF Priority Charges column1_01$")
	public void UserEntersTheCifPriorityCodeUnderTheCifPriorityChargesColumn1_01() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges(),
				testData.get("CIF_Priority_Code2"));
	}
	
	@And("^user_614 enters the charge scheme code under the Charge Schema Details column1_01$")
	public void UserEntersTheChargeSchemeCodeUnderTheChargeSchemaDetailsColumn1_01() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParametersTransactionTypeUAChargesSchemaInput(),
				testData.get("ChargeSchema-2"));
	}
	
	@And("^user_614 enters the CIF Type Charges under the CIF Type Charges column1_01$")
	public void UserEntersTheCifTypeChargesUnderTheCifTypeChargesColumn1_01() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges(),
				testData.get("CIF_TYPE_CHARGES2"));
	}
	
//	TRS_388 -------------------------------------------------------------------------------------------------------------
	
	@And("^user_614 selects the mode of payment as cash for the transaction in maintenance screen$")
	public void UserSelectsTheModeOfPaymentAsCashForTheTransactionInMaintenanceScreen() throws InterruptedException {
		userUtility.selectFromDropdown(seleniumActions, driver, CSMcoreTransactionObj.CSMModeOfPaymentDropdown_TransactionUnderMaintenance(), "Cash");
		
		try {
			userUtility.clickOnElement(seleniumActions, driver, CSMcoreTransactionObj.CSMCloseButtonForCurrencyPopScreen_TransactionUnderMaintenance());
			
		}
		
		catch(Exception e){
			
			try {
				userUtility.moveTheCursortoLocation(600, 500);
				userUtility.clickOnElement(seleniumActions, driver, CSMcoreTransactionObj.CSMCloseButtonForCurrencyPopScreen_TransactionUnderMaintenance());
			} catch (Exception e1) {
				
			}

		}
		
		Thread.sleep(3000);
	}
	
	@And("^user_614 get the data from the excel sheet for the test case id TRS_383$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_383() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_383_D1");
	}
	
	@And("^user_614 get the data from the excel sheet for the test case id TRS_388$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_388() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_388_D1");
	}
	
	@And("^user_614 get the data from the excel sheet for the test case id TRS_395$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_395() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_395_D1");
	}
	
	@And("^user_614 get the data from the excel sheet for the test case id TRS_398$")
	public void UserGetTheDataFromTheExcelSheetForTheTestCaseIdTrs_398() {
		testData = excelDataForTransactionfeature.getTestdata("TRS_398_D1");
	}
	
	@And("^user_614 uncheck the forbid multiple cif in transaction screen if already checked$")
	public void UserUncheckTheForbidMultipleCifInTransactionScreenIfAlreadyChecked() {
		boolean elementIsSelected = userUtility.elementIsSelected(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_ForbidMultipleCIFCheckBox());
		
		if (elementIsSelected) {
			userUtility.clickOnElement(seleniumActions, driver, CSMParamTransactionOBJ.csmSystemParameters_TransactionTypeUA_ForbidMultipleCIFCheckBox());
		}
	}
	@Given("End the Test")
	public void end_the_test() {
	    System.out.println("Test Execution Ended");
	}
	

}
