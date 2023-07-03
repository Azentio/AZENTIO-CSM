package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.csm.CSMSADS_TransactiononstaffaccObj;
import pageobjects.csmParamAndCore.CSM_Transaction_Object_614;
import resources.BaseClass;

public class CSM_TransactionIntra_614 extends BaseClass {

	WebDriver driver = BaseClass.driver;
	CSMSADS_TransactiononstaffaccObj transactiononstaffaccObj = new CSMSADS_TransactiononstaffaccObj(driver);
	CSM_Transaction_Object_614 CsmTransactionObject = new CSM_Transaction_Object_614(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSMLogin_614 login = new CSMLogin_614(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(path, "CSMTransactionStaffAcc", "Data Set ID");
	ExcelData testExecution = new ExcelData(path, "TestExecution", "TestCase ID");
//	Map<String, String> testData = new HashMap<>();								
//	Map<String, String> loginTestData = new HashMap<>();								
	Map<String, String> testData;
	ConfigFileReader configFileReader = new ConfigFileReader();
	UserUtility_614 userUtility = new UserUtility_614(driver);

	// ********************************************************** @TRS_0012
	// ***********************************************

	String refid = null;

	@And("^User_614 enters the transaction type$")
	public void User_614EntersTheTransactionType() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
		transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(userUtility.getExcelData("TRS_012", "TrxType"), Keys.TAB);
	}

	@And("^User_614 enters the Main credit transaction type$")
	public void User_614EntersTheMainCreditTransactionType() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
		transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("213", Keys.TAB);
	}

	@And("^User_614 enters the GL code for debit account$")
	public void User_614EntersTheGLCodeForDebitAccount() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);									
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction().sendKeys("312", Keys.TAB);

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());

	}

	@And("^User_614 enters the GL code for credit account$")
	public void User_614EntersTheGLCodeForCreditAccount() throws Throwable {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmSecondAccountCheckUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmSecondAccountCheckUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmSecondAccountCheckUnderTheTransaction());
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);									

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmSecondAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmSecondAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmSecondAccountCheckGLCodeUnderTheTransaction());
		CsmTransactionObject.csmSecondAccountCheckGLCodeUnderTheTransaction().sendKeys("313", Keys.TAB);

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmSecondAccountCheckGLCodeSelectUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmSecondAccountCheckGLCodeSelectUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(CsmTransactionObject.csmSecondAccountCheckGLCodeSelectUnderTheTransaction());

	}

	@And("^User_614 Enter the GL Code in Account under By Trade Date Screens$")
	public void User_614_enter_the_gl_code_in_account_under_by_trade_date_screens() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
//transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("GL Code"),Keys.TAB);									

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());

		CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries().sendKeys("312", Keys.TAB);
		Thread.sleep(15000);
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(CsmTransactionObject.csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries());

	}

	@And("^User_614 enters the GL code for the second account$")
	public void User_614EntersTheGLCodeForTheSecondAccount() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());

		for (int i = 0; i < 50; i++) {
			try {
				if (CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries().isEnabled()) {
					seleniumActions.getClickAndActionsHelper().clickOnElement(
							CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
					break;
				}

			} catch (Exception e) {

			}
		}

//transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("GL Code"),Keys.TAB);									

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());

		CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries().sendKeys("313", Keys.TAB);
		Thread.sleep(15000);
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(CsmTransactionObject.csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries());
	}

	@And("^User_614 Get the Transaction No in Success PopUo Menus$")
	public void User_614_get_the_transaction_no_in_success_popuo_menu() throws Throwable {
		String text = "";
		for (int i = 0; i < 200; i++) {
			try {
				text = transactiononstaffaccObj.CSMGetTheTransactionNo().getText();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		refid = text.substring(15, 19);
		System.out.println(refid);
	}

	@And("^User_614 Enter the Transaction No in Approve Screen$")
	public void User_614_enter_the_transaction_no_in_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
		transactiononstaffaccObj.CSMTransactionNoInApproveScreen().sendKeys(refid, Keys.ENTER);
	}

	@And("^User_614 Enter the Transaction No in Search Boxs$")
	public void User_614_enter_the_transaction_no_in_search_box() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());
		transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox().sendKeys(refid, Keys.ENTER);
	}

//********************************************************** @TRS_0054 ***********************************************									

	@And("^User_614 enters the transaction type for deposit account with AC CY and Trx CY must be same$")
	public void User_614EntersTheTransactionTypeForDepositAccountWithACCYAndTrxCYMustBeSame() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
		transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("477", Keys.TAB);
	}

	@And("^User_614 enters the GL code for credit account for deposit account with AC CY and Trx CY must be same$")
	public void User_614EntersTheGLCodeForCreditAccountForDepositAccountWithACCYAndTrxCYMustBeSame() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);									
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction().sendKeys("312", Keys.TAB);

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
	}

	@And("^User_614 validate the currency code for the transaction currency and the account currency$")
	public void User_614ValidateTheCurrencyCodeForTheTransactionCurrencyAndTheAccountCurrency() throws Throwable {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstTransactionCurrencyUnderTheMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstTransactionCurrencyUnderTheMaintenance());

		String firstTrxCurrencyCode = CsmTransactionObject.csmFirstTransactionCurrencyUnderTheMaintenance()
				.getAttribute("prevvalue");

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmCurrencyCodeUnderTheMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmCurrencyCodeUnderTheMaintenance());

		String TrxCurrencyCode = CsmTransactionObject.csmCurrencyCodeUnderTheMaintenance().getAttribute("prevvalue");

		assertEquals(firstTrxCurrencyCode, TrxCurrencyCode);

		if (firstTrxCurrencyCode.equals(TrxCurrencyCode)) {
			System.out.println("Both the transcation codes are matching " + "The values are: " + firstTrxCurrencyCode
					+ ", " + TrxCurrencyCode);
		}

	}

	@And("^User_614 Click Save Button in Maintenance Screens$")
	public void User_614_click_save_button_in_maintenance_screen() throws Throwable {

		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_614 enters the transaction type for main debt account with AC CY and Trx CY must be same$")
	public void User_614EntersTheTransactionTypeForMainDebtAccountWithACCYAndTrxCYMustBeSame() throws Throwable {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
		transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("214", Keys.TAB);

	}

//    @And("^User_614 enters the transaction type for deposit account with AC CY equal to Trx CY$")									
//    public void User_614EntersTheTransactionTypeForDepositAccountWithACCYEqualToTrxCY() throws Throwable {									
//									
//	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());								
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());									
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());									
//        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("215",Keys.TAB);									
//									
//    }									

	@And("^User_614 enters the transaction type for deposit account with AC CY equal to Trx CY$")
	public void User_614EntersTheTransactionTypeForDepositAccountWithACCYEqualToTrxCY() throws Throwable {

		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				"215");

	}

	@And("^User_614 enters the GL code for credit account for deposit account with AC CY equal to Trx CY$")
	public void User_614EntersTheGLCodeForCreditAccountForDepositAccountWithACCYEqualToTrxCY() throws Throwable {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);									
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);									
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
		CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction().sendKeys("312", Keys.TAB);

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());

	}

// ___________________________________________ TRS_0051 _______________________________________________________________________________________________									

	@And("^User_614 Enters the Date in User_614 Running Date$")
	public void User_614_enters_the_date_in_User_614_running_date() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMDateInUserRunningDate());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDateInUserRunningDate());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMDateInUserRunningDate());
		transactiononstaffaccObj.CSMDateInUserRunningDate().clear();
//transactiononstaffaccObj.CSMDateInUser_614RunningDate().sendKeys(testData.get("Date in URD"));									
		transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(userUtility.currentDate());
	}

	@And("^User_614 enters the Multi Transfer Main Credit Transaction Interbranch transaction type$")
	public void User_614EntersTheMultiTransferMainCreditTransactionInterbranchTransactionType() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_0051", "TrxType"));
	}

	@And("^User_614 Enter the Branch Code in Credit Ac in Maintenance Screen for TRS_0051$")
	public void User_614EnterTheBranchCodeInCreditAcInMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "BranchCode1"));
	}

	@And("^User_614 Enter Currency Code in Credit Ac in Maintenance Screen for TRS_0051$")
	public void User_614EnterCurrencyCodeInCreditAcInMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCurrencyCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "CurrencyCode1"));

	}

	@And("^User_614 Enter GL Code in Credit Ac in Maintenance Screen for TRS_0051$")
	public void User_614EnterGlCodeInCreditAcInMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "GLCode1"));
	}

	@And("^User_614 Enter CIF Code in Credit Ac in Maintenance Screen for TRS_0051$")
	public void User_614EnterCifCodeInCreditAcInMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "CIFNo1"));
	}

	@And("^User_614 Enter Serial in Credit Ac in Maintenance Screen for TRS_0051$")
	public void User_614EnterSerialInCreditAcInMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountSerialNoUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "SLNO1"));
	}

	@And("^User_614 Enter the Currency in Maintenance Screen for TRS_0051$")
	public void User_614EnterTheCurrencyInMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmCurrencyCodeForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "TRXCURCODE"));
	}

	@And("^User_614 Enter the Amount in Maintenance Screen for TRS_0051$")
	public void User_614EnterTheAmountInMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmEnterAmountForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "CreditAmount1"));
	}

	@And("^User_614 click on the account details button$")
	public void User_614ClickOnTheAccountDetailsButton() {
		userUtility.clickOnElement(seleniumActions, driver,
				CsmTransactionObject.csmAccuntDetailsLabelUnderMaintenenanceTRX());
	}

	@And("^User_614 clicks on the plus icon to add the account details$")
	public void User_614ClicksOnThePlusIconToAddTheAccountDetails() {
		userUtility.clickOnElement(seleniumActions, driver,
				CsmTransactionObject.csmAddRowUnderAccuntDetailsLabelUnderMaintenenanceTRX());
	}

	@And("^User_614 Enter the Branch Code in Debit Ac1 in Maintenance Screen for TRS_0051$")
	public void User_614EnterTheBranchCodeInDebitAc1InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "BranchCode2"));
	}

	@And("^User_614 Enter Currency Code in Debit Ac1 in Maintenance Screen for TRS_0051$")
	public void User_614EnterCurrencyCodeInDebitAc1InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "CurrencyCode2"));
	}

	@And("^User_614 Enter GL Code in Debit Ac1 in Maintenance Screen for TRS_0051$")
	public void User_614EnterGlCodeInDebitAc1InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), "312");
	}

	@And("^User_614 Enter CIF Code in Debit Ac1 in Maintenance Screen for TRS_0051$")
	public void User_614EnterCifCodeInDebitAc1InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "CIFNo2"));
	}

	@And("^User_614 Enter Serial in Debit Ac1 in Maintenance Screen for TRS_0051$")
	public void User_614EnterSerialInDebitAc1InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "SLNO2"));
	}

	@And("^User_614 Enter the debit amount for Ac1 for TRS_0051$")
	public void User_614EnterTheDebitAmountForAc1ForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "DebitAmount1"));
	}

	@And("^User_614 Enter the Branch Code in Debit Ac2 in Maintenance Screen for TRS_0051$")
	public void User_614EnterTheBranchCodeInDebitAc2InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "BranchCode3"));
	}

	@And("^User_614 Enter GL Code in Debit Ac2 in Maintenance Screen for TRS_0051$")
	public void User_614EnterGlCodeInDebitAc2InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "GLCode3"));
	}

	@And("^User_614 Enter CIF Code in Debit Ac2 in Maintenance Screen for TRS_0051$")
	public void User_614EnterCifCodeInDebitAc2InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), "00993607");
	}

	@And("^User_614 Enter Serial in Debit Ac2 in Maintenance Screen for TRS_0051$")
	public void User_614EnterSerialInDebitAc2InMaintenanceScreenForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX(), "000");
	}

	@And("^User_614 Enter the debit amount for Ac2 for TRS_0051$")
	public void User_614EnterTheDebitAmountForAc2ForTrs_0051() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_0051", "DebitAmount1"));
	}

	@And("^User_614 clicks on the ok button after adding the debit account details$")
	public void User_614ClicksOnTheOkButtonAfterAddingTheDebitAccountDetails() {
		userUtility.clickOnElement(seleniumActions, driver,
				CsmTransactionObject.csmClickOKUnderAccuntDetailsLabelUnderMaintenenanceTRX());
	}

	@And("^User_614 double clicks on the branch code in Ac1 in add account details$")
	public void User_614DoubleClicksOnTheBranchCodeInAc1InAddAccountDetails() {
		userUtility.doubleClickOnElement(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX());
		;
	}

	@And("^User_614 double clicks on the branch code in Ac2 in add account details$")
	public void User_614DoubleClicksOnTheBranchCodeInAc2InAddAccountDetails() {
		userUtility.doubleClickOnElement(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX());
	}

// ---------------------------- TRS_098 and TRS_103 -------------------------------------------									

	@Given("^User_614 Navigate to CSM application and login with valid credentialsVimal$")
	public void User_614_navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplicationVimal();
	}

	@And("^User_614 enters the transaction type for TRS_098$")
	public void User_614EntersTheTransactionTypeForTrs_098() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_098", "TrxType"));
	}

	@And("^User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103$")
	public void User_614EnterTheBranchCodeInDebitAcInMaintenanceScreenForTrs_098AndTrs_103() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_098", "BranchCode1"));
	}

	@And("^User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103$")
	public void User_614EnterCurrencyCodeInDebitAcInMaintenanceScreenForTrs_098AndTrs_103() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCurrencyCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_098", "CurrencyCode1"));
	}

	@And("^User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103$")
	public void User_614EnterGlCodeInDebitAcInMaintenanceScreenForTrs_098AndTrs_103() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_098", "GLCode1"));
	}

	@And("^User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103$")
	public void User_614EnterCifCodeInDebitAcInMaintenanceScreenForTrs_098AndTrs_103() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_098", "CIFNo1"));
	}

	@And("^User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_098 and TRS_103$")
	public void User_614EnterSerialInDebitAcInMaintenanceScreenForTrs_098AndTrs_103() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountSerialNoUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_098", "SLNO1"));
	}

	@And("^User_614 Enter the Currency in Maintenance Screen for TRS_098 and TRS_103$")
	public void User_614EnterTheCurrencyInMaintenanceScreenForTrs_098AndTrs_103() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmCurrencyCodeForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_098", "TRXCURCODE"));
	}

	@And("^User_614 Enter the Amount in Maintenance Screen for TRS_098 and TRS_103$")
	public void User_614EnterTheAmountInMaintenanceScreenForTrs_098AndTrs_103() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmEnterAmountForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_098", "CreditAmount1"));
	}

	@And("^User_614 enters the transaction type for TRS_103$")
	public void User_614EntersTheTransactionTypeForTrs_103() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_103", "TrxType"));
	}

	@And("^User_614 enters the transaction type for TRS_099$")
	public void User_614EntersTheTransactionTypeForTrs_099() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_099", "TrxType"));
	}

	@And("^User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_099$")
	public void User_614EnterTheBranchCodeInDebitAcInMaintenanceScreenForTrs_099() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_099", "BranchCode1"));
	}

	@And("^User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_099$")
	public void User_614EnterCurrencyCodeInDebitAcInMaintenanceScreenForTrs_099() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCurrencyCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_099", "CurrencyCode1"));
	}

	@And("^User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_099$")
	public void User_614EnterGlCodeInDebitAcInMaintenanceScreenForTrs_099() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_099", "GLCode1"));
	}

	@And("^User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_099$")
	public void User_614EnterCifCodeInDebitAcInMaintenanceScreenForTrs_099() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_099", "CIFNo1"));
	}

	@And("^User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_099$")
	public void User_614EnterSerialInDebitAcInMaintenanceScreenForTrs_099() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountSerialNoUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_099", "SLNO1"));

	}

	@And("^User_614 Enter the Currency in Maintenance Screen for TRS_099$")
	public void User_614EnterTheCurrencyInMaintenanceScreenForTrs_099() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmCurrencyCodeForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_099", "TRXCURCODE"));
	}

	@And("^User_614 Enter the Amount in Maintenance Screen for TRS_099$")
	public void User_614EnterTheAmountInMaintenanceScreenForTrs_099() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmEnterAmountForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_099", "CreditAmount1"));
	}

	@And("^User_614 enters the transaction type for TRS_100$")
	public void User_614EntersTheTransactionTypeForTrs_100() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_100", "TrxType"));
	}

	@And("^User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_100$")
	public void User_614EnterTheBranchCodeInDebitAcInMaintenanceScreenForTrs_100() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_100", "BranchCode1"));
	}

	@And("^User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_100$")
	public void User_614EnterCurrencyCodeInDebitAcInMaintenanceScreenForTrs_100() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCurrencyCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_100", "CurrencyCode1"));
	}

	@And("^User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_100$")
	public void User_614EnterGlCodeInDebitAcInMaintenanceScreenForTrs_100() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_100", "GLCode1"));
	}

	@And("^User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_100$")
	public void User_614EnterCifCodeInDebitAcInMaintenanceScreenForTrs_100() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_100", "CIFNo1"));
	}

	@And("^User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_100$")
	public void User_614EnterSerialInDebitAcInMaintenanceScreenForTrs_100() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountSerialNoUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_100", "SLNO1"));
	}

	@And("^User_614 Enter the Currency in Maintenance Screen for TRS_100$")
	public void User_614EnterTheCurrencyInMaintenanceScreenForTrs_100() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmCurrencyCodeForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_100", "TRXCURCODE"));
	}

	@And("^User_614 Enter the Amount in Maintenance Screen for TRS_100$")
	public void User_614EnterTheAmountInMaintenanceScreenForTrs_100() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmEnterAmountForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_100", "CreditAmount1"));
	}

	@And("^User_614 enters the transaction type for TRS_101$")
	public void User_614EntersTheTransactionTypeForTrs_101() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_101", "TrxType"));
	}

	@And("^User_614 Enter the Branch Code in Credit Ac in Maintenance Screen for TRS_101$")
	public void User_614EnterTheBranchCodeInCreditAcInMaintenanceScreenForTrs_101() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_101", "BranchCode1"));
	}

	@And("^User_614 Enter Currency Code in Credit Ac in Maintenance Screen for TRS_101$")
	public void User_614EnterCurrencyCodeInCreditAcInMaintenanceScreenForTrs_101() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCurrencyCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_101", "CurrencyCode1"));
	}

	@And("^User_614 Enter GL Code in Credit Ac in Maintenance Screen for TRS_101$")
	public void User_614EnterGlCodeInCreditAcInMaintenanceScreenForTrs_101() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_101", "GLCode1"));
	}

	@And("^User_614 Enter CIF Code in Credit Ac in Maintenance Screen for TRS_101$")
	public void User_614EnterCifCodeInCreditAcInMaintenanceScreenForTrs_101() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_101", "CIFNo1"));
	}

	@And("^User_614 Enter Serial in Credit Ac in Maintenance Screen for TRS_101$")
	public void User_614EnterSerialInCreditAcInMaintenanceScreenForTrs_101() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountSerialNoUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_101", "SLNO1"));
	}

	@And("^User_614 Enter the Currency in Maintenance Screen for TRS_101$")
	public void User_614EnterTheCurrencyInMaintenanceScreenForTrs_101() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmCurrencyCodeForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_101", "TRXCURCODE"));
	}

	@And("^User_614 Enter the Amount in Maintenance Screen for TRS_101$")
	public void User_614EnterTheAmountInMaintenanceScreenForTrs_101() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmEnterAmountForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_101", "CreditAmount1"));
	}

	@And("^User_614 enters the transaction type for TRS_102$")
	public void User_614EntersTheTransactionTypeForTrs_102() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_102", "TrxType"));
	}

	@And("^User_614 Enter the Branch Code in Credit Ac in Maintenance Screen for TRS_102$")
	public void User_614EnterTheBranchCodeInCreditAcInMaintenanceScreenForTrs_102() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_102", "BranchCode1"));
	}

	@And("^User_614 Enter Currency Code in Credit Ac in Maintenance Screen for TRS_102$")
	public void User_614EnterCurrencyCodeInCreditAcInMaintenanceScreenForTrs_102() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCurrencyCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_102", "CurrencyCode1"));
	}

	@And("^User_614 Enter GL Code in Credit Ac in Maintenance Screen for TRS_102$")
	public void User_614EnterGlCodeInCreditAcInMaintenanceScreenForTrs_102() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_102", "GLCode1"));
	}

	@And("^User_614 Enter CIF Code in Credit Ac in Maintenance Screen for TRS_102$")
	public void User_614EnterCifCodeInCreditAcInMaintenanceScreenForTrs_102() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_102", "CIFNo1"));
	}

	@And("^User_614 Enter Serial in Credit Ac in Maintenance Screen for TRS_102$")
	public void User_614EnterSerialInCreditAcInMaintenanceScreenForTrs_102() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountSerialNoUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_102", "SLNO1"));
	}

	@And("^User_614 Enter the Currency in Maintenance Screen for TRS_102$")
	public void User_614EnterTheCurrencyInMaintenanceScreenForTrs_102() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmCurrencyCodeForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_102", "TRXCURCODE"));
	}

	@And("^User_614 Enter the Amount in Maintenance Screen for TRS_102$")
	public void User_614EnterTheAmountInMaintenanceScreenForTrs_102() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmEnterAmountForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_102", "CreditAmount1"));
	}

	@And("^User_614 Click Ok Button in PopUp Menu under maintenance TRX$")
	public void User_614ClickOkButtonInPopupMenuUnderMaintenanceTrx1() {
		userUtility.clickOnElement(seleniumActions, driver, CsmTransactionObject.csmClickOKUnderMaintenanceTRX());
	}

	@And("^User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterCurrencyCodeInDebitAcInMaintenanceScreenForTrs_182AndTrs_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCurrencyCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "CurrencyCode1"));
	}

	@And("^User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterGlCodeInDebitAcInMaintenanceScreenForTrs_182AndTrs_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "GLCode1"));
	}

	@And("^User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterCifCodeInDebitAcInMaintenanceScreenForTrs_182AndTrs_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "CIFNo1"));
	}

	@And("^User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterSerialInDebitAcInMaintenanceScreenForTrs_182AndTrs_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountSerialNoUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "SLNO1"));
	}

	@And("^User_614 Enter the Currency in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterTheCurrencyInMaintenanceScreenForTrs_182AndTrs_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmCurrencyCodeForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "TRXCURCODE"));
	}

	@And("^User_614 Enter the Amount in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterTheAmountInMaintenanceScreenForTrs_182AndTrs_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmEnterAmountForTRXUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "CreditAmount1"));
	}

	@And("^User_614 Enters the Date in User Running Date$")
	public void User_614_enters_the_date_in_user_running_date() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMDateInUserRunningDate());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDateInUserRunningDate());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMDateInUserRunningDate());
		transactiononstaffaccObj.CSMDateInUserRunningDate().clear();
		// transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(testData.get("Date
		// in URD"));
		transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(userUtility.currentDate());
	}

	@And("^User_614 Click Ok Button in Warning PopUp Menus$")
	public void User_614_click_ok_button_in_warning_popup_menus1() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						CsmTransactionObject.csmConcurrentPopUp());
				seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmConcurrentPopUp());
				seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmConcurrentPopUp());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_614 Enter the Transaction No in Approve Screens$")
	public void User_614_enter_the_transaction_no_in_approve_screen1() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
		transactiononstaffaccObj.CSMTransactionNoInApproveScreen().sendKeys(refid, Keys.ENTER);
	}

	@And("^User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterTheBranchCodeInDebitAcInMaintenanceScreenForTrs_182AndTrs_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "BranchCode1"));
	}

	@Given("^User_614 Navigate to CSM params application and login with valid credentialsVimal$")
	public void User_614NavigateToCsmParamsApplicationAndLoginWithValidCredentialsvimal() {
		driver.get(configFileReader.getCSMparamsUrl());
		login.loginIntoCSMParamApplicationVimal();
	}

	@And("^User_614 Enter the Branch Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterTheBranchCodeInDebitAc2InMaintenanceScreenForTRS_182andTRS_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "BranchCode2"));
	}

	@And("^User_614 Enter Currency Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterTheCurrencyCodeInDebitAc2InMaintenanceScreenForTRS_182andTRS_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountBranchCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "CurrencyCode2"));
	}

	@And("^User_614 Enter GL Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterGlCodeInDebitAc2InMaintenanceScreenForTRS_182andTRS_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "GLCode2"));
	}

	@And("^User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterCifCodeInDebitAc2InMaintenanceScreenForTRS_182andTRS_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "CIFNo2"));
	}

	@And("^User_614 Enter Serial in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187$")
	public void User_614EnterSerialInDebitAc2InMaintenanceScreenForTRS_182andTRS_187() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountSINOUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_182", "SLNO2"));
	}

	@And("^User_614 enters the transaction type for TRS_182$")
	public void User_614EntersTheTransactionTypeForTrs_182() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_182", "TrxType"));
	}

	@And("^User_614 enters the transaction type for TRS_183$")
	public void User_614EntersTheTransactionTypeForTrs_183() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_183", "TrxType"));
	}

	@And("^User_614 enters the transaction type for TRS_185$")
	public void User_614EntersTheTransactionTypeForTrs_185() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_185", "TrxType"));
	}

	@And("^User_614 enters the transaction type for TRS_187$")
	public void User_614EntersTheTransactionTypeForTrs_187() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_187", "TrxType"));
	}

	@And("^User_614 enters the transaction type for TRS_184$")
	public void User_614EntersTheTransactionTypeForTrs_184() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_184", "TrxType"));
	}

	@And("^User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_184$")
	public void User_614EnterCifCodeInDebitAcInMaintenanceScreenForTRS_184() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_184", "CIFNo1"));
	}

	@And("^User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_184$")
	public void User_614EnterCifCodeInDebitAc2InMaintenanceScreenForTRS_184() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_184", "CIFNo2"));
	}

	@And("^User_614 enters the transaction type for TRS_186$")
	public void User_614EntersTheTransactionTypeForTrs_186() {
		userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(),
				userUtility.getExcelData("TRS_186", "TrxType"));
	}

	@And("^User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_186$")
	public void User_614EnterCifCodeInDebitAcInMaintenanceScreenForTRS_186() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_186", "CIFNo1"));
	}

	@And("^User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_186$")
	public void User_614EnterCifCodeInDebitAc2InMaintenanceScreenForTRS_186() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmSecondAccountCIFCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_186", "CIFNo2"));
	}

	@And("^User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_186$")
	public void User_614EnterGlCodeInDebitAcInMaintenanceScreenForTRS_186() {
		userUtility.enterDataAndTab(seleniumActions, driver,
				CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(),
				userUtility.getExcelData("TRS_186", "GLCode1"));
	}

}
