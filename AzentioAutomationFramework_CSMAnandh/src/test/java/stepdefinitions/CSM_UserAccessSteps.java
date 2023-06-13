package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_UserAccessObj;
import resources.BaseClass;

public class CSM_UserAccessSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMCommonWebElements csmCommonElements = new CSMCommonWebElements(driver);
	CSMParam_UserAccessObj userAccessObj = new CSMParam_UserAccessObj(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	String csmTestDataPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData exelDataForUserAccess = new ExcelData(testDataPath, "CSMParam_userAccessTestData", "DataSet ID");
	ExcelData excelDataforCIFType = new ExcelData(testDataPath, "CSMParam_CIFTypeTestData", "DataSet ID");
	ExcelData excelDataForTransactionExecution = new ExcelData(csmTestDataPath, "Transaction_ExecutionTracker",
			"TestCaseID");
	ExcelData excelDataForTransactionData = new ExcelData(csmTestDataPath, "TransactionTestData", "DataSet ID");
	Map<String, String> transactionExecutionData = new HashMap<>();
	Map<String, String> userAccessTestData = new HashMap<>();

	@And("^click on system parameter$")
	public void click_on_system_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.csmParamSystemParameter());
		clicksAndActionsHelper.moveToElement(userAccessObj.csmParamSystemParameter());
		clicksAndActionsHelper.clickOnElement(userAccessObj.csmParamSystemParameter());
	}

	@And("^click on user module under system parameter$")
	public void click_on_user_module_under_system_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.systemParameterUserMainModule());
		clicksAndActionsHelper.moveToElement(userAccessObj.systemParameterUserMainModule());
		clicksAndActionsHelper.clickOnElement(userAccessObj.systemParameterUserMainModule());
	}

	@And("^get the test data for give acess to account type$")
	public void get_the_test_data_for_give_acess_to_account_type() throws Throwable {
		userAccessTestData = exelDataForUserAccess.getTestdata("DS01_ActType_Acces_03");
	}

	@And("^click on update after approve screen under user module$")
	public void click_on_update_after_approve_screen_under_user_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userUpdateAfterApprove());
		clicksAndActionsHelper.moveToElement(userAccessObj.userUpdateAfterApprove());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userUpdateAfterApprove());
	}

	@And("^get the test data for the user access record which is done on account type access$")
	public void get_the_test_data_for_the_user_access_record_which_is_done_on_account_type_access() throws Throwable {
		userAccessTestData = exelDataForUserAccess.getTestdata("DS01_ActType_Acces_04");
	}

	@And("^get the test data for give access to CIF Type$")
	public void get_the_test_data_for_give_access_to_cif_type() throws Throwable {
		userAccessTestData = exelDataForUserAccess.getTestdata("DS01_ActType_Acces_04");
	}

	@And("^close the update after approve screen of user$")
	public void close_the_update_after_approve_screen_of_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userUpdateAfterApproveCloseLabel());
		clicksAndActionsHelper.moveToElement(userAccessObj.userUpdateAfterApproveCloseLabel());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userUpdateAfterApproveCloseLabel());
	}

	@And("^search the user ID in user module$")
	public void search_the_user_id_in_user_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userSearchUserID());
		clicksAndActionsHelper.moveToElement(userAccessObj.userSearchUserID());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userSearchUserID());
		userAccessObj.userSearchUserID().sendKeys(userAccessTestData.get("UserName"));
		userAccessObj.userSearchUserID().sendKeys(Keys.ENTER);
	}

	@And("^select the user from suggestion$")
	public void select_the_user_from_suggestion() throws Throwable {
		String xpath = "//td[text()='" + userAccessTestData.get("UserName") + "']";
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;

			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmQuitOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmQuitOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmQuitOkButton());
	}

	@And("^click on CIf type access option$")
	public void click_on_cif_type_access_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userCIFTypeAccessInputBox());
		clicksAndActionsHelper.moveToElement(userAccessObj.userCIFTypeAccessInputBox());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userCIFTypeAccessInputBox());
	}

	@And("^click on add button in CIF type access page$")
	public void click_on_add_button_in_cif_type_access_page() throws Throwable {

	}

	@And("^enter the CIF type in access screen$")
	public void enter_the_cif_type_in_access_screen() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userCIFTypeAccessInputBox());
		clicksAndActionsHelper.moveToElement(userAccessObj.userCIFTypeAccessInputBox());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userCIFTypeAccessInputBox());
		userAccessObj.userCIFTypeAccessInputBox().sendKeys(userAccessTestData.get("CIFType"));

	}

	@And("^enter the Transaction number in CIF type access screen$")
	public void enter_the_transaction_number_in_cif_type_access_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userCIFTypeTransactionInputBox());
		clicksAndActionsHelper.moveToElement(userAccessObj.userCIFTypeTransactionInputBox());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userCIFTypeTransactionInputBox());
		userAccessObj.userCIFTypeTransactionInputBox().sendKeys(userAccessTestData.get("CIF Transaction No"));
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchWdLimit());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchWdLimit());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchWdLimit());
	}

	@And("^click on ok button in CIF type access screen$")
	public void click_on_ok_button_in_cif_type_access_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userCIFTypeAccessInputBox());
		clicksAndActionsHelper.moveToElement(userAccessObj.userCIFTypeAccessInputBox());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userCIFTypeAccessInputBox());
	}

	@And("^click on account type access option$")
	public void click_on_account_type_access_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccountTypeAccess());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccountTypeAccess());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccountTypeAccess());
	}

	@And("^click on add button in account type access$")
	public void click_on_add_button_in_account_type_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessPlusIcon());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessPlusIcon());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessPlusIcon());
	}

	@And("^click on ok button in limit access$")
	public void click_on_ok_button_in_limit_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.limitButtonOkButton());
		clicksAndActionsHelper.moveToElement(userAccessObj.limitButtonOkButton());
		clicksAndActionsHelper.clickOnElement(userAccessObj.limitButtonOkButton());
	}

	@And("^delete the account type details$")
	public void delete_the_account_type_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmDeleteRowButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmDeleteRowButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmDeleteRowButton());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmDeleteConfirmationOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmDeleteConfirmationOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmDeleteConfirmationOkButton());
	}

	@And("^enter the account type for access$")
	public void enter_the_account_type_for_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchAccountType());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchAccountType());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchAccountType());
		userAccessObj.userAccessSearchAccountType().sendKeys(userAccessTestData.get("AccountType"));
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchTransaction());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchTransaction());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchTransaction());
	}

	@And("^enter the transaction number for access$")
	public void enter_the_transaction_number_for_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchTransaction());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchTransaction());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchTransaction());
		userAccessObj.userAccessSearchTransaction().sendKeys(userAccessTestData.get("AccountType Transaction No"));
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchWdLimit());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchWdLimit());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchWdLimit());

	}

	@And("^check the warn if user limit exceeds in account type$")
	public void check_the_warn_if_user_limit_exceeds_in_account_type() throws Throwable {

		String xpath = "//input[@prevvalue='" + userAccessTestData.get("AccountType")
				+ "']//ancestor::span//parent::td//following-sibling::td//following-sibling::td[@tdlabel='Warn User If Limit Exceed']//input";

		for (int i = 0; i <= 300; i++) {
			try {

				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^check the proceed if limit exceeds in account type$")
	public void check_the_proceed_if_limit_exceeds_in_account_type() throws Throwable {

		String xpath = "//input[@prevvalue='" + userAccessTestData.get("AccountType")
				+ "']//ancestor::span//parent::td//following-sibling::td//following-sibling::td[@tdlabel='Proceed If Limit Exceed']//input";

		for (int i = 0; i <= 300; i++) {
			try {

				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on ok button in access screen$")
	public void click_on_ok_button_in_access_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessOkButton());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessOkButton());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessOkButton());
	}

	@And("^get the test data for test case ID TRS_001_01$")
	public void get_the_test_data_for_test_case_id_trs00101() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_001_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_089_01$")
	public void get_the_test_data_for_test_case_ID_TRS_089_01() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_089_01");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_090_01$")
	public void get_the_test_data_for_test_case_id_trs09001() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_090_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_091_01$")
	public void get_the_test_data_for_test_case_id_trs09101() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_091_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_093_01$")
	public void get_the_test_data_for_test_case_id_trs09301() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_093_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_094_01$")
	public void get_the_test_data_for_test_case_id_trs09401() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_094_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_095_01$")
	public void get_the_test_data_for_test_case_id_trs09501() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_095_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}
	@And("^get the test data for test case ID TRS_095_03$")
    public void get_the_test_data_for_test_case_id_trs09503() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_095_03");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
    }

	@And("^get the test data for test case ID TRS_002_01$")
	public void get_the_test_data_for_test_case_id_trs00201() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_002_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_003_01$")
	public void get_the_test_data_for_test_case_id_trs00301() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_003_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_004_01$")
	public void get_the_test_data_for_test_case_id_trs00401() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_004_01");
		userAccessTestData = exelDataForUserAccess.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^check the show all trx flag in CSM Param$")
	public void check_the_show_all_trx_flag_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessShowAllTrxFlag());
		if (userAccessObj.userAccessShowAllTrxFlag().getAttribute("initialvalue").isBlank()) {
			clicksAndActionsHelper.moveToElement(userAccessObj.userAccessShowAllTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userAccessShowAllTrxFlag(),
					userAccessObj.userAccessShowAllTrxFlag());
		} else {
			clicksAndActionsHelper.moveToElement(userAccessObj.userAccessShowAllTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userAccessShowAllTrxFlag(),
					userAccessObj.userAccessShowAllTrxFlag());
			clicksAndActionsHelper.moveToElement(userAccessObj.userAccessShowAllTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userAccessShowAllTrxFlag(),
					userAccessObj.userAccessShowAllTrxFlag());
		}
	}

	@And("^uncheck the show all trx flag in CSM Param$")
	public void uncheck_the_show_all_trx_flag_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessShowAllTrxFlag());
		if (userAccessObj.userAccessShowAllTrxFlag().getAttribute("initialvalue").isBlank()) {
			clicksAndActionsHelper.moveToElement(userAccessObj.userAccessShowAllTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userAccessShowAllTrxFlag(),
					userAccessObj.userAccessShowAllTrxFlag());
			clicksAndActionsHelper.moveToElement(userAccessObj.userAccessShowAllTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userAccessShowAllTrxFlag(),
					userAccessObj.userAccessShowAllTrxFlag());
		} else {
			clicksAndActionsHelper.moveToElement(userAccessObj.userAccessShowAllTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userAccessShowAllTrxFlag(),
					userAccessObj.userAccessShowAllTrxFlag());
		}
	}

	@And("^check the show today trx flag in CSM Param$")
	public void check_the_show_today_trx_flag_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userShowTodayTrxFlag());
		if (userAccessObj.userShowTodayTrxFlag().getAttribute("initialvalue").isBlank()) {
			clicksAndActionsHelper.moveToElement(userAccessObj.userShowTodayTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userShowTodayTrxFlag(),
					userAccessObj.userShowTodayTrxFlag());

		} else {
			clicksAndActionsHelper.moveToElement(userAccessObj.userShowTodayTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userShowTodayTrxFlag(),
					userAccessObj.userShowTodayTrxFlag());
			clicksAndActionsHelper.moveToElement(userAccessObj.userShowTodayTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userShowTodayTrxFlag(),
					userAccessObj.userShowTodayTrxFlag());
		}
	}

	@And("^uncheck the show today trx flag in CSM Param$")
	public void uncheck_the_show_today_trx_flag_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userShowTodayTrxFlag());
		if (userAccessObj.userShowTodayTrxFlag().getAttribute("initialvalue").isBlank()) {
			clicksAndActionsHelper.moveToElement(userAccessObj.userShowTodayTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userShowTodayTrxFlag(),
					userAccessObj.userShowTodayTrxFlag());
			clicksAndActionsHelper.moveToElement(userAccessObj.userShowTodayTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userShowTodayTrxFlag(),
					userAccessObj.userShowTodayTrxFlag());

		} else {

			clicksAndActionsHelper.moveToElement(userAccessObj.userShowTodayTrxFlag());
			clicksAndActionsHelper.clickUsingActionClass(userAccessObj.userShowTodayTrxFlag(),
					userAccessObj.userShowTodayTrxFlag());
		}
	}

	@And("^click on update after approve button$")
	public void click_on_update_after_approve_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(userAccessObj.userAccessUpdateAfterApproveButton());
				clicksAndActionsHelper.moveToElement(userAccessObj.userAccessUpdateAfterApproveButton());
				clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessUpdateAfterApproveButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on ok button in update confirmation$")
	public void click_on_ok_button_in_update_confirmation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSaveConfirmOkButton());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSaveConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSaveConfirmOkButton());
	}

	@And("^click on ok button in saved successfully in user screen$")
	public void click_on_ok_button_in_saved_successfully_in_user_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSaveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSaveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSaveSuccessOkButton());
	}

	@And("^click on approval module under user module$")
	public void click_on_approval_module_under_user_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessApproveModule());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessApproveModule());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessApproveModule());
	}

	@And("^click on approve button in user module$")
	public void click_on_approve_button_in_user_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmApproveButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmApproveButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmApproveButton());
	}

	@And("^click on approval confirmation ok button under user screen$")
	public void click_on_approval_confirmation_ok_button_under_user_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmConfirmApprovOkButton());
	}

	@And("^click on ok button after approval screen under user screen$")
	public void click_on_ok_button_after_approval_screen_under_user_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmApproveSuccessOkButton());
		excelDataforCIFType.updateTestData("DS_01_CIFType_01", "Allow Gl Code", userAccessTestData.get("AccountType"));
	}

	@And("^store the transaction number and withdraw amount in transaction excel Database$")
	public void store_the_transaction_number_and_withdraw_amount_in_transaction_excel_database() throws Throwable {
		System.out.println("Update DataSet ID" + userAccessTestData.get("Update_DataSet_ID_1"));
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"),
				"Transaction Type code", userAccessTestData.get("Transaction Type"));

		int withdrawLimit = Integer.parseInt(userAccessTestData.get("Withdraw limit"));
		int newWithdrawAmt = withdrawLimit + 10;
		String.valueOf(newWithdrawAmt);
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"), "Withdraw Amount",
				String.valueOf(newWithdrawAmt));
		System.out.println("Withdraw Amount" + String.valueOf(newWithdrawAmt));
		System.out.println("Transaction Number" + userAccessTestData.get("Transaction Type"));

	}

	@And("^store the transaction number and withdraw amount in transaction excel database for limit and overdrawn$")
	public void store_the_transaction_number_and_withdraw_amount_in_transaction_excel_database_for_limit_and_overdrawn()
			throws Throwable {
		int wdLimit = Integer.parseInt(userAccessTestData.get("Withdraw limit"));
		int overdrawnLimit = Integer.parseInt(userAccessTestData.get("Overdrawn Limit"));
		int divOverdrawn = overdrawnLimit / 2;
		int withdrawAmount = wdLimit + divOverdrawn;
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"),
				"Transaction Type code", userAccessTestData.get("Transaction Type"));
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"), "Withdraw Amount",
				String.valueOf(withdrawAmount));

	}

	@And("^store the high deposite amount and transaction type in transaction excel database$")
	public void store_the_high_deposite_amount_and_transaction_type_in_transaction_excel_database() throws Throwable {
		System.out.println("Update DataSet ID" + userAccessTestData.get("Update_DataSet_ID_1"));
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"),
				"Transaction Type code", userAccessTestData.get("Transaction Type"));

		int depositeLimit = Integer.parseInt(userAccessTestData.get("Deposite Limit"));

		int exceedDepositeLimit = depositeLimit + 10;

		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"),
				"Exceed Deposite Amount", String.valueOf(exceedDepositeLimit));

	}

	@And("^store the transaction number and deposite amount in transaction excel Database$")
	public void store_the_transaction_number_and_deposite_amount_in_transaction_excel_database() throws Throwable {
		System.out.println("Update DataSet ID" + userAccessTestData.get("Update_DataSet_ID_1"));
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"),
				"Transaction Type code", userAccessTestData.get("Transaction Type"));

		int depositeLimit = Integer.parseInt(userAccessTestData.get("Deposite Limit"));
		int newLessDepositeLimit = depositeLimit - 10;
		String.valueOf(newLessDepositeLimit);
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"), "Deposite Amount",
				String.valueOf(newLessDepositeLimit));
		System.out.println("Withdraw Amount" + String.valueOf(newLessDepositeLimit));
		System.out.println("Transaction Number" + userAccessTestData.get("Transaction Type"));

	}

	@And("^store the transaction number and deposite amount and exceed amount in transaction excel Database$")
	public void store_the_transaction_number_and_deposite_amount_and_exceed_amount_in_transaction_excel_database()
			throws Throwable {
		System.out.println("Update DataSet ID" + userAccessTestData.get("Update_DataSet_ID_1"));
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"),
				"Transaction Type code", userAccessTestData.get("Transaction Type"));

		int depositeLimit = Integer.parseInt(userAccessTestData.get("Deposite Limit"));
		int newLessDepositeLimit = depositeLimit - 10;
		int exceedDepositeLimit = depositeLimit + 10;
		String.valueOf(newLessDepositeLimit);
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_1"), "Deposite Amount",
				String.valueOf(newLessDepositeLimit));
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_2"),
				"Transaction Type code", userAccessTestData.get("Transaction Type"));
		excelDataForTransactionData.updateTestData(userAccessTestData.get("Update_DataSet_ID_2"),
				"Exceed Deposite Amount", String.valueOf(exceedDepositeLimit));
		System.out.println("Withdraw Amount" + String.valueOf(newLessDepositeLimit));
		System.out.println("Transaction Number" + userAccessTestData.get("Transaction Type"));
	}

	@And("^search for the account type which user created$")
	public void search_for_the_account_type_which_user_created() throws Throwable {
		String xpath = "(//table[@id='tab4_GridTbl_Id_E000MA']//td[text()='" + userAccessTestData.get("AccountType")
				+ "'])[1]";

		for (int i = 0; i <= 7000; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 7000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^enter the transaction type for withdraw in account type access$")
	public void enter_the_transaction_type_for_withdraw_in_account_type_access() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchTransaction());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchTransaction());
		clicksAndActionsHelper.doubleClick(userAccessObj.userAccessSearchTransaction());
		for (int i = 0; i <= 4; i++) {
			try {
				userAccessObj.userAccessSearchTransaction().clear();
			} catch (Exception e) {

			}
		}
		userAccessObj.userAccessSearchTransaction().sendKeys(userAccessTestData.get("Transaction Type"));
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.accountTypeWithdrawLimitInput());
		clicksAndActionsHelper.moveToElement(userAccessObj.accountTypeWithdrawLimitInput());
		clicksAndActionsHelper.clickOnElement(userAccessObj.accountTypeWithdrawLimitInput());

	}

	@And("^enter the limit for withdraw in account type access$")
	public void enter_the_limit_for_withdraw_in_account_type_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.accountTypeWithdrawLimitInput());
		clicksAndActionsHelper.moveToElement(userAccessObj.accountTypeWithdrawLimitInput());
		clicksAndActionsHelper.clickOnElement(userAccessObj.accountTypeWithdrawLimitInput());
		userAccessObj.accountTypeWithdrawLimitInput().sendKeys(userAccessTestData.get("Withdraw limit"));
	}

	@And("^enter the overdrawn for withdraw accout type access$")
	public void enter_the_overdrawn_for_withdraw_accout_type_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.accountTypeOverdrawnLimitInput());
		clicksAndActionsHelper.moveToElement(userAccessObj.accountTypeOverdrawnLimitInput());
		clicksAndActionsHelper.clickOnElement(userAccessObj.accountTypeOverdrawnLimitInput());
		System.out.println("Over drawn limit" + userAccessTestData.get("Overdrawn Limit"));
		userAccessObj.accountTypeOverdrawnLimitInput().sendKeys(userAccessTestData.get("Overdrawn Limit"));
	}

	@And("^enter the limit for deposite in account type access$")
	public void enter_the_limit_for_deposite_in_account_type_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.accountTypeDepositeLimitInput());
		clicksAndActionsHelper.moveToElement(userAccessObj.accountTypeDepositeLimitInput());
		clicksAndActionsHelper.clickOnElement(userAccessObj.accountTypeDepositeLimitInput());
		userAccessObj.accountTypeDepositeLimitInput().sendKeys(userAccessTestData.get("Deposite Limit"));
	}

	@And("^click on limit button under user$")
	public void click_on_limit_button_under_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.accountTypeAccessLimitButton());
		clicksAndActionsHelper.moveToElement(userAccessObj.accountTypeAccessLimitButton());
		clicksAndActionsHelper.clickOnElement(userAccessObj.accountTypeAccessLimitButton());
	}

	@And("^search for the withdraw transaction type$")
	public void search_for_the_withdraw_transaction_type() throws Throwable {
		String xpath = "//td[contains(text(),'" + userAccessTestData.get("Transaction Type") + "')]";

		for (int i = 0; i <= 100; i++) {
			try {

				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(csmCommonElements.csmDeleteRowButton());
					clicksAndActionsHelper.clickOnElement(csmCommonElements.csmDeleteRowButton());
					break;
				}
			} catch (Exception e) {

			}
		}
		
		for (int i = 0; i <= 100; i++) {
			try {

				clicksAndActionsHelper.moveToElement(csmCommonElements.csmDeleteConfirmationOkButton());
				clicksAndActionsHelper.clickOnElement(csmCommonElements.csmDeleteConfirmationOkButton());
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^click on add buttton in limit button$")
	public void click_on_add_buttton_in_limit_button() throws Throwable {
		for (int i = 0; i <= 50; i++) {
			try {
				clicksAndActionsHelper.moveToElement(userAccessObj.limitButtonAddIcon());
				clicksAndActionsHelper.clickOnElement(userAccessObj.limitButtonAddIcon());
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the currency in withdraw limit$")
	public void enter_the_currency_in_withdraw_limit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.limitAccessCurrencyCode());
		clicksAndActionsHelper.moveToElement(userAccessObj.limitAccessCurrencyCode());
		clicksAndActionsHelper.clickOnElement(userAccessObj.limitAccessCurrencyCode());
		userAccessObj.limitAccessCurrencyCode().sendKeys(userAccessTestData.get("Currency Code"));
	}

	@And("^enter the withdraw limit in limit button$")
	public void enter_the_withdraw_limit_in_limit_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.limitAccessWithdrawLimitInput());
		clicksAndActionsHelper.moveToElement(userAccessObj.limitAccessWithdrawLimitInput());
		clicksAndActionsHelper.clickOnElement(userAccessObj.limitAccessWithdrawLimitInput());
		userAccessObj.limitAccessWithdrawLimitInput().sendKeys(userAccessTestData.get("Withdraw limit"));
	}

	@And("^enter the transaction type in limit button$")
	public void enter_the_transaction_type_in_limit_button() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(userAccessObj.limitAccessTransactionType());
				clicksAndActionsHelper.moveToElement(userAccessObj.limitAccessTransactionType());
				clicksAndActionsHelper.clickOnElement(userAccessObj.limitAccessTransactionType());
				userAccessObj.limitAccessTransactionType().sendKeys(userAccessTestData.get("Transaction Type"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^check the flag warn if user limit exceeds under limit$")
	public void check_the_flag_warn_if_user_limit_exceeds_under_limit() throws Throwable {
		String xpath = "//input[@prevvalue='" + userAccessTestData.get("Transaction Type")
				+ "']//ancestor::td[@tdlabel='Transaction']//following-sibling::td[@tdlabel='Warn User If Limit Exceed']//input";
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
}
