package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_ChequesObj;
import resources.BaseClass;

public class CSMParam_ChequebookSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	CSMParam_ChequesObj chequesObj = new CSMParam_ChequesObj(driver);
	CSMCommonWebElements commonWebElements = new CSMCommonWebElements(driver);
	String csmParampath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataChargeTestData = new ExcelData(csmParampath, "Cheques_ChequeBookTestData", "DataSet ID");
	ExcelData excelDataForCheuqeBookRequestExecution = new ExcelData(path, "CheuqeBookRequestExecutionTrack",
			"TestCaseID");
	ExcelData excelDataForChequeBookRequest = new ExcelData(path, "CSM_ChequeBookrequest", "DataSet ID");
	Map<String, String> chequebookExecutionData = new HashMap<>();
	Map<String, String> chequebookTestData = new HashMap<>();
	Robot robot;

	@And("get the test data for test case ID CHB_055_01")
	public void get_the_test_data_for_test_case_id_CHB_055_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_055_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_057_01")
	public void get_the_test_data_for_test_case_id_CHB_057_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_057_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_058_01")
	public void get_the_test_data_for_test_case_id_CHB_058_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_058_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_059_01")
	public void get_the_test_data_for_test_case_id_CHB_059_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_059_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_060_01")
	public void get_the_test_data_for_test_case_id_CHB_060_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_060_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_062_01")
	public void get_the_test_data_for_test_case_id_CHB_062_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_062_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_063_01")
	public void get_the_test_data_for_test_case_id_CHB_063_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_063_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_064_01")
	public void get_the_test_data_for_test_case_id_CHB_064_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_064_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_067_01")
	public void get_the_test_data_for_test_case_id_CHB_067_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_067_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}
	

	@And("get the test data for test case ID CHB_065_01")
	public void get_the_test_data_for_test_case_id_CHB_065_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_065_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}
	@And("get the test data for test case ID CHB_066_01")
	public void get_the_test_data_for_test_case_id_CHB_066_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_066_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}
	@And("get the test data for test case ID CHB_081_01")
	public void get_the_test_data_for_test_case_id_CHB_081_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_081_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}
	@And("get the test data for test case ID CHB_074_01")
	public void get_the_test_data_for_test_case_id_CHB_074_01() {
		chequebookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_074_01");
		chequebookTestData = excelDataChargeTestData.getTestdata(chequebookExecutionData.get("Data Set ID"));
	}

	@And("click on cheques feature in CSM Param")
	public void click_on_cheques_feature_in_csm_param() throws Throwable {
		for (int i = 0; i <= 400; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(chequesObj.systemParameterChequesFeature());
				break;
			} catch (Exception e) {
				if (i == 400) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on chequebook feature in cheques feature")
	public void click_on_chequebook_feature_in_cheques_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequesChequebookFeature());
		clicksAndActionsHelper.clickOnElement(chequesObj.chequesChequebookFeature());

	}

	@And("click on update after approve under chequebook")
	public void click_on_update_after_approve_under_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookUpdateAfterApproveFeature());
		clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookUpdateAfterApproveFeature());
	}

	@And("search for the chequebook code in cheque update after approve")
	public void search_for_the_chequebook_code_in_cheque_update_after_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookSearchChequeCode());
		clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookSearchChequeCode());
		chequesObj.chequeBookSearchChequeCode().sendKeys(chequebookTestData.get("Chequebook code"));
		chequesObj.chequeBookSearchChequeCode().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("select the chequebook record in cheque update after approve")
	public void select_the_chequebook_record_in_cheque_update_after_approve() throws Throwable {
		String xpath = "//td[text()='" + chequebookTestData.get("Chequebook code") + "']";
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("check the allow auto approve flag in chequebook")
	public void check_the_allow_auto_approve_flag_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAllowAutoApproveFlag());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequesObj.chequeBookAllowAutoApproveFlag().getAttribute("initialvalue").equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoApproveFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoApproveFlag());
					break;
				} else {

					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoApproveFlag());
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("uncheck the allow auto approve flag in chequebook")
	public void uncheck_the_allow_auto_approve_flag_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAllowAutoApproveFlag());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequesObj.chequeBookAllowAutoApproveFlag().getAttribute("initialvalue").equals("checked")) {

					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoApproveFlag());
					break;
				} else {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoApproveFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoApproveFlag());
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("uncheck the allow auto submit flag in chequebook")
	public void uncheck_the_allow_auto_submit_flag_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAllowAutoSubmitFlag());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequesObj.chequeBookAllowAutoSubmitFlag().getAttribute("initialvalue").equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoSubmitFlag());

					break;
				} else {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoSubmitFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoSubmitFlag());
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("check the allow auto submit flag in chequebook")
	public void check_the_allow_auto_submit_flag_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAllowAutoSubmitFlag());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequesObj.chequeBookAllowAutoSubmitFlag().getAttribute("initialvalue").equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoSubmitFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoSubmitFlag());
					break;
				} else {

					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAutoSubmitFlag());
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("uncheck the allow auto submit upon aproval in chequebook")
	public void uncheck_the_allow_auto_submit_upon_aproval_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAutoSubmitUponApproveFlag());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequesObj.chequeBookAutoSubmitUponApproveFlag().getAttribute("initialvalue").equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAutoSubmitUponApproveFlag());

					break;
				} else {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAutoSubmitUponApproveFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAutoSubmitUponApproveFlag());
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("check the allow auto submit upon aproval in chequebook")
	public void check_the_allow_auto_submit_upon_aproval_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAutoSubmitUponApproveFlag());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequesObj.chequeBookAutoSubmitUponApproveFlag().getAttribute("initialvalue").equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAutoSubmitUponApproveFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAutoSubmitUponApproveFlag());
					break;
				} else {

					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAutoSubmitUponApproveFlag());
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("uncheck the allow to amend from number flag in chequebook")
	public void uncheck_the_allow_to_amend_from_number_flag_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAllowAmendFromNumberFlag());
		for (int i = 0; i <= 100; i++) {
			try {
				if (chequesObj.chequeBookAllowAmendFromNumberFlag().getAttribute("initialvalue").equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAmendFromNumberFlag());
					break;

				} else {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAmendFromNumberFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAmendFromNumberFlag());
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@And("check the allow to amend from number flag in chequebook")
	public void check_the_allow_to_amend_from_number_flag_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAllowAmendFromNumberFlag());
		for (int i = 0; i <= 100; i++) {
			try {
				if (chequesObj.chequeBookAllowAmendFromNumberFlag().getAttribute("initialvalue").equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAmendFromNumberFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAmendFromNumberFlag());
					break;

				} else {

					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAllowAmendFromNumberFlag());
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@And("uncheck the diable cheque number generation flag")
	public void uncheck_the_diable_cheque_number_generation_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookDisableGenerateFromNumberFlag());
		for (int i = 0; i <= 100; i++) {
			try {
				if (chequesObj.chequeBookDisableGenerateFromNumberFlag().getAttribute("initialvalue")
						.equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookDisableGenerateFromNumberFlag());
					break;

				} else {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookDisableGenerateFromNumberFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookDisableGenerateFromNumberFlag());
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@And("check the diable cheque number generation flag")
	public void check_the_diable_cheque_number_generation_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookDisableGenerateFromNumberFlag());
		for (int i = 0; i <= 100; i++) {
			try {
				if (chequesObj.chequeBookDisableGenerateFromNumberFlag().getAttribute("initialvalue")
						.equals("checked")) {
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookDisableGenerateFromNumberFlag());
					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookDisableGenerateFromNumberFlag());
					break;

				} else {

					clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookDisableGenerateFromNumberFlag());
					break;
				}

			} catch (Exception e) {

			}
		}
	}
	@And("uncheck the Reuse Cancelled Reversed Deleted Chq Nbr flag in chequebook screen")
	public void uncheck_the_reuse_cancelled_reversed_deleted_chq_nbr_flag_in_chequebook_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag());
		for (int i = 0; i <= 100; i++) {
			try {
				if (chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag().getAttribute("initialvalue")
						.equals("checked")) {
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag());
					break;

				} else {
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag());
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag());
					break;
				}

			} catch (Exception e) {

			}
		}
	}
	@And("check the Reuse Cancelled Reversed Deleted Chq Nbr flag in chequebook screen")
	public void check_the_reuse_cancelled_reversed_deleted_chq_nbr_flag_in_chequebook_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag());
		for (int i = 0; i <= 100; i++) {
			try {
				if (chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag().getAttribute("initialvalue")
						.equals("checked")) {
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag());
					clicksAndActionsHelper
					.clickOnElement(chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag());
					break;

				} else {
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookReuseCancelledReversedDeletedChqNbrFlag());
					
					break;
				}

			} catch (Exception e) {

			}
		}
	}
	

	@And("uncheck the Cheque paper number amendable on request flag")
	public void uncheck_the_cheque_paper_number_amendable_on_request_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag());
		for (int i = 0; i <= 100; i++) {
			try {
				if (chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag().getAttribute("initialvalue")
						.equals("checked")) {
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag());
					break;

				} else {
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag());
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag());
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@And("click on account type currency access button")
	public void click_on_account_type_currency_access_button() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAccountTypeCurrencyKeyButton());
		clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAccountTypeCurrencyKeyButton());

	}

	@And("check the cheque paper number amendable on request flag in chequebook")
	public void check_the_cheque_paper_number_amendable_on_request_flag_in_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag());
		for (int i = 0; i <= 100; i++) {
			try {
				if (chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag().getAttribute("initialvalue")
						.equals("checked")) {
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag());
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag());
					break;

				} else {
					clicksAndActionsHelper
							.clickOnElement(chequesObj.chequeBookChequePaperNumberAmendableOnRequestFlag());
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@And("search for the record which is already there else update the account type and currency code")
	public void search_for_the_record_which_is_already_there_else_update_the_account_type_and_currency_code()
			throws Throwable {
		// Gl Code
		String xpath = "//td[text()='" + chequebookTestData.get("Gl Code") + "']";
		System.out.println("Xpah --> " + xpath);
		boolean status = false;
		for (int i = 0; i < 100; i++) {
			try {
				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					status = true;

				} else {
					status = false;

				}
			} catch (Exception e) {

			}
		}
		System.out.println("Gl Code status " + status);
		if (status == false) {
			waitHelper.waitForElementwithFluentwait(driver, commonWebElements.csmCommonGridAddButton());
			clicksAndActionsHelper.clickOnElement(commonWebElements.csmCommonGridAddButton());
			waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAccountTypeAccessGlcodeInput());
			clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAccountTypeAccessGlcodeInput());
			chequesObj.chequeBookAccountTypeAccessGlcodeInput().sendKeys(chequebookTestData.get("Gl Code"));
			chequesObj.chequeBookAccountTypeAccessGlcodeInput().sendKeys(Keys.TAB);
			for (int i = 0; i < 300; i++) {
				try {
					if (!(chequesObj.chequeBookAccountTypeAccessGlcodeInput().getAttribute("prevvalue").isBlank())) {
						break;
					}
				} catch (Exception e) {

				}
			}
			waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAccountTypeAccessCurrencyCodeInput());
			clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAccountTypeAccessCurrencyCodeInput());
			// Currency Code
			chequesObj.chequeBookAccountTypeAccessCurrencyCodeInput().sendKeys(chequebookTestData.get("Currency Code"));
			chequesObj.chequeBookAccountTypeAccessCurrencyCodeInput().sendKeys(Keys.TAB);
			for (int i = 0; i < 300; i++) {
				try {
					if (!(chequesObj.chequeBookAccountTypeAccessCurrencyCodeInput().getAttribute("prevvalue")
							.isBlank())) {
						break;
					}

				} catch (Exception e) {

				}
			}
			waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAccountTypeAccessOkButton());
			clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAccountTypeAccessOkButton());

		} else if (status == true) {
			waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAccountTypeAccessOkButton());
			clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookAccountTypeAccessOkButton());
		}
	}

	@And("click on update after approve in chequebook feature")
	public void click_on_update_after_approve_in_chequebook_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, commonWebElements.csmParamUpdateAfterApproveBtn());
		clicksAndActionsHelper.clickUsingActionClass(commonWebElements.csmParamUpdateAfterApproveBtn(),
				commonWebElements.csmParamUpdateAfterApproveBtn());

	}

	@And("click on ok button in save confirmation popup")
	public void click_on_ok_button_in_save_confirmation_popup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, commonWebElements.csmSaveConfirmOkButton());
		clicksAndActionsHelper.clickUsingActionClass(commonWebElements.csmSaveConfirmOkButton(),
				commonWebElements.csmSaveConfirmOkButton());
	}

	@And("click on ok button in update success popup")
	public void click_on_ok_button_in_update_success_popup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, commonWebElements.updateOkButton());
		clicksAndActionsHelper.clickUsingActionClass(commonWebElements.updateOkButton(),
				commonWebElements.updateOkButton());
	}

	@And("close the chequebook update after approve screen")
	public void close_the_chequebook_update_after_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookUpdateAfterApproveTabClose());
		clicksAndActionsHelper.moveToElement(chequesObj.chequeBookUpdateAfterApproveTabClose());
		clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookUpdateAfterApproveTabClose());
		waitHelper.waitForElementwithFluentwait(driver, commonWebElements.csmQuitOkButton());
		clicksAndActionsHelper.clickUsingActionClass(commonWebElements.csmQuitOkButton(),
				commonWebElements.csmQuitOkButton());

	}

	@And("click on approve in chequebook feature")
	public void click_on_approve_in_chequebook_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookApproveFeature());
		clicksAndActionsHelper.moveToElement(chequesObj.chequeBookApproveFeature());
		clicksAndActionsHelper.clickOnElement(chequesObj.chequeBookApproveFeature());
	}

	@And("search the chequecode in approve screen of chequebook")
	public void search_the_chequecode_in_approve_screen_of_chequebook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookSearchChequeCode());
		chequesObj.chequeBookSearchChequeCode().sendKeys(chequebookTestData.get("Chequebook code"));
		chequesObj.chequeBookSearchChequeCode().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("select the record in apporve of chequebook feature")
	public void select_the_record_in_apporve_of_chequebook_feature() throws Throwable {
		String xpath = "//td[text()='" + chequebookTestData.get("Chequebook code") + "']";
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("verify allow auto approve flag should checked")
	public void verify_allow_auto_approve_flag_should_checked() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAllowAutoApproveFlag());

		Assert.assertTrue(chequesObj.chequeBookAllowAutoApproveFlag().getAttribute("initialvalue").equals("checked"));

	}

	@Then("verify allow auto submit and allow auto submit upon approval flag")
	public void verify_allow_auto_submit_and_allow_auto_submit_upon_approval_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequesObj.chequeBookAllowAutoApproveFlag());

		Assert.assertFalse(chequesObj.chequeBookAllowAutoSubmitFlag().getAttribute("initialvalue").equals("checked"));
		Assert.assertFalse(
				chequesObj.chequeBookAutoSubmitUponApproveFlag().getAttribute("initialvalue").equals("checked"));
	}

	@And("click on approve button in chequebook feature of cheque")
	public void click_on_approve_button_in_chequebook_feature_of_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, commonWebElements.csmApproveBtnWithLabel());
		clicksAndActionsHelper.moveToElement(commonWebElements.csmApproveBtnWithLabel());
		clicksAndActionsHelper.clickOnElement(commonWebElements.csmApproveBtnWithLabel());
	}

	@And("update the test data for the test case ID CHB_055")
	public void update_the_test_data_for_the_test_case_id_CHB_055() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

	@And("update the test data for the test case ID CHB_057")
	public void update_the_test_data_for_the_test_case_id_CHB_057() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

	@And("update the test data for the test case ID CHB_058")
	public void update_the_test_data_for_the_test_case_id_CHB_058() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

	@And("update the test data for the test case ID CHB_059")
	public void update_the_test_data_for_the_test_case_id_CHB_059() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

	@And("update the test data for the test case ID CHB_060")
	public void update_the_test_data_for_the_test_case_id_CHB_060() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

	@And("update the test data for the test case ID CHB_062")
	public void update_the_test_data_for_the_test_case_id_CHB_062() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

	@And("update the test data for the test case ID CHB_063")
	public void update_the_test_data_for_the_test_case_id_CHB_063() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

	@And("update the test data for the test case ID CHB_064")
	public void update_the_test_data_for_the_test_case_id_CHB_064() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}
	@And("update the test data for the test case ID CHB_065")
	public void update_the_test_data_for_the_test_case_id_CHB_065() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}
	@And("update the test data for the test case ID CHB_066")
	public void update_the_test_data_for_the_test_case_id_CHB_066() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

	@And("update the test data for the test case ID CHB_067")
	public void update_the_test_data_for_the_test_case_id_CHB_067() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}
	@And("update the test data for the test case ID CHB_074")
	public void update_the_test_data_for_the_test_case_id_CHB_074() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}
	@And("update the test data for the test case ID CHB_081 and CHB_082")
	public void update_the_test_data_for_the_test_case_id_CHB_081_and_CHB_082() {
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 1"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));
		excelDataForChequeBookRequest.updateTestData(chequebookTestData.get("Update dataset ID 2"), "Cheque Code",
				chequebookTestData.get("Chequebook code"));

	}

}
