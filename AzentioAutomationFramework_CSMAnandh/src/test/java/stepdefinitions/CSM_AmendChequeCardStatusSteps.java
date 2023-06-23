package stepdefinitions;

import java.awt.AWTException;
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
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csm.CSM_AmendChequeStatusObj;
import pageobjects.csm.CSM_TransactionObj;
import pageobjects.csm.ChequeBookRequestObj;
import resources.BaseClass;

public class CSM_AmendChequeCardStatusSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	DropDownHelper dropdownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSM_AmendChequeStatusObj amendChequeStatusObj = new CSM_AmendChequeStatusObj(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	ChequeBookRequestObj chequeBookRequestObj = new ChequeBookRequestObj(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	CSM_TransactionObj transactionObj = new CSM_TransactionObj(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForAmendChequeStatus = new ExcelData(path, "AmendChequeCardStatusTestData", "DataSet ID");
	ExcelData excelDataForAmendChequeExecution = new ExcelData(path, "AmendChequeCard_ExeTrack", "TestCaseID");
	Map<String, String> amendChequeStatusTestData = new HashMap<>();
	Map<String, String> amendChequeStatusExecutionData = new HashMap<>();
	Robot robot;

	@And("^click on amend cheque card status module$")
	public void click_on_amend_cheque_card_status_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.csmAmendChequeCardStatusModule());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.csmAmendChequeCardStatusModule());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.csmAmendChequeCardStatusModule());
	}

	@And("^click on maintenance screen under cheque card status module$")
	public void click_on_maintenance_screen_under_cheque_card_status_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.csmAmendChequeCardStatusMaintenance());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.csmAmendChequeCardStatusMaintenance());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.csmAmendChequeCardStatusMaintenance());
	}

	@And("^get the test data for test case ACSD_002$")
	public void get_the_test_data_for_test_case_acsd002() throws Throwable {
		amendChequeStatusExecutionData = excelDataForAmendChequeExecution.getTestdata("ACSD_002");
		amendChequeStatusTestData = excelDataForAmendChequeStatus
				.getTestdata(amendChequeStatusExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ACSD_003$")
	public void get_the_test_data_for_test_case_acsd003() throws Throwable {
		amendChequeStatusExecutionData = excelDataForAmendChequeExecution.getTestdata("ACSD_003");
		amendChequeStatusTestData = excelDataForAmendChequeStatus
				.getTestdata(amendChequeStatusExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ACSD_003_Prereq$")
	public void get_the_test_data_for_test_case_acsd003prereq() throws Throwable {
		amendChequeStatusExecutionData = excelDataForAmendChequeExecution.getTestdata("ACSD_003_Prereq");
		amendChequeStatusTestData = excelDataForAmendChequeStatus
				.getTestdata(amendChequeStatusExecutionData.get("Data Set ID"));
	}

	@And("^change the product type to cheque book$")
	public void change_the_product_type_to_cheque_book() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardProductTypeDropdown());
		dropdownHelper.SelectUsingVisibleText(amendChequeStatusObj.amendChequeCardProductTypeDropdown(),
				amendChequeStatusTestData.get("Product Type"));
	}

	@And("^enter the branch code in amend cheque$")
	public void enter_the_branch_code_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardBranchCodeInput());
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardBranchCodeInput());
				clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardBranchCodeInput());
				amendChequeStatusObj.amendChequeCardBranchCodeInput()
						.sendKeys(amendChequeStatusTestData.get("Branch Code"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardCurrencyCodeInput());

		amendChequeStatusObj.amendChequeCardCurrencyCodeInput().click();
		for (int i = 0; i <= 500; i++) {
			if (!(amendChequeStatusObj.amendChequeCardBranchCodeInput().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}

	}

	@And("^enter the currency code in amend cheque$")
	public void enter_the_currency_code_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardCurrencyCodeInput());

		amendChequeStatusObj.amendChequeCardCurrencyCodeInput().click();
		amendChequeStatusObj.amendChequeCardCurrencyCodeInput()
				.sendKeys(amendChequeStatusTestData.get("Currency Code"));
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardGLCodeInput());

		for (int i = 0; i <= 500; i++) {
			if (!(amendChequeStatusObj.amendChequeCardCurrencyCodeInput().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}

	}

	@And("^enter the GL code in amend cheque$")
	public void enter_the_gl_code_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardGLCodeInput());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardGLCodeInput());

		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardGLCodeInput());
		amendChequeStatusObj.amendChequeCardGLCodeInput().sendKeys(amendChequeStatusTestData.get("Gl Code"));
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardCIFNoInput());
		for (int i = 0; i <= 500; i++) {
			if (!(amendChequeStatusObj.amendChequeCardGLCodeInput().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}
	}

	@And("^enter the CIF No in amend cheque$")
	public void enter_the_cif_no_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardCIFNoInput());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardCIFNoInput());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardCIFNoInput());
		amendChequeStatusObj.amendChequeCardCIFNoInput().sendKeys(amendChequeStatusTestData.get("CIF No"));
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardSerialNoInput());
		for (int i = 0; i <= 500; i++) {
			if (!(amendChequeStatusObj.amendChequeCardCIFNoInput().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}
	}

	@And("^enter the serial number in amend cheque$")
	public void enter_the_serial_number_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardSerialNoInput());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardSerialNoInput());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardSerialNoInput());
		amendChequeStatusObj.amendChequeCardSerialNoInput().sendKeys(amendChequeStatusTestData.get("Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardRequestNoInput());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardRequestNoInput());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardRequestNoInput());
		for (int i = 0; i <= 500; i++) {
			if (!(amendChequeStatusObj.amendChequeCardSerialNoInput().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}

	}

	@And("^click on ok button in amend cheque screen$")
	public void click_on_ok_button_in_amend_cheque_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
	}

	@And("^close the warningpopupin amend cheque screen$")
	public void close_the_warningpopupin_amend_cheque_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmAlertCloseButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmAlertCloseButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmAlertCloseButton());
	}

	@And("^enter the request no in amend cheque$")
	public void enter_the_request_no_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardRequestNoInput());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardRequestNoInput());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardRequestNoInput());
		amendChequeStatusObj.amendChequeCardRequestNoInput().sendKeys(amendChequeStatusTestData.get("Request No"));
	}

	@And("^give the status in submitted$")
	public void give_the_status_in_submitted() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardStatusDropdown());
		dropdownHelper.SelectUsingVisibleText(amendChequeStatusObj.amendChequeCardStatusDropdown(),
				amendChequeStatusTestData.get("Status"));
	}

	@And("^give the status in destroyed$")
	public void give_the_status_in_destroyed() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardStatusDropdown());
		dropdownHelper.SelectUsingVisibleText(amendChequeStatusObj.amendChequeCardStatusDropdown(),
				amendChequeStatusTestData.get("Status"));
	}

	@And("^click on retrive in amend cheque$")
	public void click_on_retrive_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardRetriveButton());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardRetriveButton());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardRetriveButton());
	}

	@And("^select the retrived record from amend cheque$")
	public void select_the_retrived_record_from_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardChequeBookCheckBox());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardChequeBookCheckBox());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardChequeBookCheckBox());
	}

	@And("^click on update in amend cheque$")
	public void click_on_update_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardUpdateButton());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardUpdateButton());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardUpdateButton());
	}

	@And("^click on ok button in amend cheque update confirmation$")
	public void click_on_ok_button_in_amend_cheque_update_confirmation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveRecordConfirmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveRecordConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveRecordConfirmOkButton());
	}

	@And("^click on ok button after saving the amend cheque status record$")
	public void click_on_ok_button_after_saving_the_amend_cheque_status_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardSaveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardSaveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardSaveSuccessOkButton());
	}

	@Then("^validate system through the validation for the amend cheque record$")
	public void validate_system_through_the_validation_for_the_amend_cheque_record() throws Throwable {

		for (double i = 0; i <= 900000000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						amendChequeStatusObj.amendChequeCardValidationElement());
				String validationMessage = amendChequeStatusObj.amendChequeCardValidationElement().getText();
				System.out.println("Validation Msg " + validationMessage);
				if (validationMessage.contains(
						"Can't proceed, there is cheques status that are different from the chequebook status")) {
					break;
				} else if (i == 900000000) {
					Assert.fail("Validation is not comming " + validationMessage);
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^click on tech option$")
	public void click_on_tech_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmTechDetailsMenu());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmTechDetailsMenu());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmTechDetailsMenu());
	}

	@And("^click on clear cache option$")
	public void click_on_clear_cache_option() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmClearCacheOption());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmClearCacheOption());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify system shows success pop up for clearing the cache$")
	public void verify_system_shows_success_pop_up_for_clearing_the_cache() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.ClearCacheSuccessOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.ClearCacheSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.ClearCacheSuccessOkButton());
	}

	@And("^change the system date in CSM$")
	public void change_the_system_date_in_csm() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSystemDate());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSystemDate());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSystemDate());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmInputSystemDate());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmInputSystemDate());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmInputSystemDate());
		for (int i = 0; i <= 15; i++) {
			csmCommonWebElements.csmInputSystemDate().sendKeys(Keys.BACK_SPACE);
		}
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmInputSystemDate());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmInputSystemDate());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmInputSystemDate());

		csmCommonWebElements.csmInputSystemDate().sendKeys(amendChequeStatusTestData.get("System Date"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmInputSystemDateUseButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmInputSystemDateUseButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmInputSystemDateUseButton());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.closeOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.closeOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.closeOkButton());
		Thread.sleep(1000);
	}

	@And("^click on cheque request module$")
	public void click_on_cheque_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csmChequeBookRequestModule());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csmChequeBookRequestModule());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csmChequeBookRequestModule());
	}

	@And("^click on cheque query module$")
	public void click_on_cheque_query_module() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.csmchequeBooQueryModule());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csmchequeBooQueryModule());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csmchequeBooQueryModule());
				break;
			} catch (Exception e) {
				if (i == 100) {

					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^enter the branch code in chequebook query$")
	public void enter_the_branch_code_in_chequebook_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleBranchCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleBranchCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleBranchCode());
		chequeBookRequestObj.chequeBooQueryModuleBranchCode().sendKeys(amendChequeStatusTestData.get("Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		for (int i = 0; i <= 500; i++) {
			if (!(chequeBookRequestObj.chequeBooQueryModuleBranchCode().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}

	}

	@And("^enter the currency code in chequebook query$")
	public void enter_the_currency_code_in_chequebook_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		chequeBookRequestObj.chequeBooQueryModuleCurrencyCode()
				.sendKeys(amendChequeStatusTestData.get("Currency Code"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		for (int i = 0; i <= 500; i++) {
			if (!(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}
	}

	@And("^enter the GL code in chequebook query$")
	public void enter_the_gl_code_in_chequebook_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		chequeBookRequestObj.chequeBooQueryModuleAccGlCode().sendKeys(amendChequeStatusTestData.get("Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		for (int i = 0; i <= 500; i++) {
			if (!(chequeBookRequestObj.chequeBooQueryModuleAccGlCode().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}
	}

	@And("^enter the CIF code in chequebook query$")
	public void enter_the_cif_code_in_chequebook_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		chequeBookRequestObj.chequeBooQueryModuleCIFNumber().sendKeys(amendChequeStatusTestData.get("CIF No"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		for (int i = 0; i <= 500; i++) {
			if (!(chequeBookRequestObj.chequeBooQueryModuleCIFNumber().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}
	}

	@And("^enter the serial number in chequebook query$")
	public void enter_the_serial_number_in_chequebook_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		chequeBookRequestObj.chequeBooQueryModuleSLNumber().sendKeys(amendChequeStatusTestData.get("Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleChequeCode());
		for (int i = 0; i <= 500; i++) {
			if (!(chequeBookRequestObj.chequeBooQueryModuleSLNumber().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("Data Not populated");
			}
		}
	}

	@And("^click on live search in cheque query$")
	public void click_on_live_search_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleLiveSearch());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearch());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearch());
		clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBooQueryModuleLiveSearch());
	}

	@And("^enter the Gl number in cheque query live search$")
	public void enter_the_gl_number_in_cheque_query_live_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleLiveSearchGlCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearchGlCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearchGlCode());
		chequeBookRequestObj.chequeBooQueryModuleLiveSearchGlCode().sendKeys(amendChequeStatusTestData.get("Gl Code"));
	}

	@And("^enter the CIF number in cheque query live search$")
	public void enter_the_cif_number_in_cheque_query_live_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo());
		chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo().sendKeys(amendChequeStatusTestData.get("CIF No"));
		chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo().sendKeys(Keys.ENTER);

	}

	@And("^select the records from live search$")
	public void select_the_records_from_live_search() throws Throwable {
		String xpath = "(//td[contains(text(),'" + amendChequeStatusTestData.get("Gl Code") + "')])[1]";
		for (int i = 0; i <= 5000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int i = 0; i <= 500; i++) {
			try {
				chequeBookRequestObj.chequeBooQueryModuleLiveSearchTableValidation().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^enter the currency code in cheque query$")
	public void enter_the_currency_code_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		chequeBookRequestObj.chequeBooQueryModuleCurrencyCode()
				.sendKeys(amendChequeStatusTestData.get("Currency Code"));
		Thread.sleep(1000);

	}

	@And("^enter the Gl Code in cheque query$")
	public void enter_the_gl_code_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleAccGlCode());

		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		chequeBookRequestObj.chequeBooQueryModuleAccGlCode().sendKeys(amendChequeStatusTestData.get("Gl Code"));
		Thread.sleep(1000);
	}

	@And("^enter te Cif Number in cheque query$")
	public void enter_te_cif_number_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleCIFNumber());

		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		chequeBookRequestObj.chequeBooQueryModuleCIFNumber().sendKeys(amendChequeStatusTestData.get("CIF No"));

		Thread.sleep(1000);
	}

	@And("^enter the serial number in cheque query$")
	public void enter_the_serial_number_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleSLNumber());

		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		chequeBookRequestObj.chequeBooQueryModuleSLNumber().sendKeys(amendChequeStatusTestData.get("Serial Number"));
		Thread.sleep(1000);

	}

	@And("^enter the cheque request number in search grid$")
	public void enter_the_cheque_request_number_in_search_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleChequeCode());
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleChequeCode());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleChequeCode());
				chequeBookRequestObj.chequeBooQueryModuleChequeCode()
						.sendKeys(amendChequeStatusTestData.get("Request No"));
				chequeBookRequestObj.chequeBooQueryModuleChequeCode().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify status of the cheque should changed destroyed to approved$")
	public void verify_status_of_the_cheque_should_changed_destroyed_to_approved() throws Throwable {
		String xpath = "//td[text()='" + amendChequeStatusTestData.get("Request No")
				+ "']//following-sibling::td[contains(text(),'Approved')]";
		boolean status = false;
		for (int i = 0; i <= 500; i++) {
			try {
				status = driver.findElement(By.xpath(xpath)).isDisplayed();

			} catch (Exception e) {
				if (i > 200 && i < 500) {
					chequeBookRequestObj.chequeBooQueryModuleChequeCode().sendKeys(Keys.ENTER);
				}
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status);
	}

	@Then("^get the transaction number and click on alert ok button$")
	public void get_the_transaction_number_and_click_on_alert_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.destroyTransactionNumber());
		String transactionNum = chequeBookRequestObj.destroyTransactionNumber().getText();
		String finalTransactionNum = transactionNum.substring(42);
		System.out.println(finalTransactionNum);
		excelDataForAmendChequeStatus.updateTestData(amendChequeStatusTestData.get("DataSet ID"), "TransactionNumber",
				finalTransactionNum);
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.destroyDestroyAlertOkButton());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.destroyDestroyAlertOkButton());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("^click on to be destroyed module$")
	public void click_on_to_be_destroyed_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeDestroyMainModule());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeDestroyMainModule());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeDestroyMainModule());
	}

	@And("^get the test data for ACSD_004 test case$")
	public void get_the_test_data_for_acsd004_test_case() throws Throwable {
		amendChequeStatusExecutionData = excelDataForAmendChequeExecution.getTestdata("ACSD_004");
		amendChequeStatusTestData = excelDataForAmendChequeStatus
				.getTestdata(amendChequeStatusExecutionData.get("Data Set ID"));
	}

	@And("^search the cheque code for to be destroyed cheque code$")
	public void search_the_cheque_code_for_to_be_destroyed_cheque_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeDestroySearchChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeDestroySearchChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeDestroySearchChequeCode());
		chequeBookRequestObj.toBeDestroySearchChequeCode().sendKeys(amendChequeStatusTestData.get("Request No"));
		chequeBookRequestObj.toBeDestroySearchChequeCode().sendKeys(Keys.ENTER);
		String xpath = "//td[text()='" + amendChequeStatusTestData.get("Request No") + "']";
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on to destroy button$")
	public void click_on_to_destroy_button() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestRejectReasonremark());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestRejectReasonremark());
				chequeBookRequestObj.chequeBookRequestRejectReasonremark()
						.sendKeys(amendChequeStatusTestData.get("Status"));
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 600; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.toBeDestroyToDestroyButton());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeDestroyToDestroyButton());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeDestroyToDestroyButton());
				break;
			} catch (Exception e) {
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify server got loaded for to be destroyed record$")
	public void verify_server_got_loaded_for_to_be_destroyed_record() throws Throwable {
		String branchCodePrevValue = "";
		for (int i = 0; i <= 1000; i++) {
			try {
				branchCodePrevValue = chequeBookRequestObj.toBeDestroyBranchCodeValidation().getAttribute("prevvalue");
				if (branchCodePrevValue.isBlank()) {
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@And("^click on destroy module$")
	public void click_on_destroy_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.destroyMainModule());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.destroyMainModule());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.destroyMainModule());
	}

	@And("^search for destroy record cheque code$")
	public void search_for_destroy_record_cheque_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.destroyChequeCodeSearch());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.destroyChequeCodeSearch());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.destroyChequeCodeSearch());
		chequeBookRequestObj.destroyChequeCodeSearch().sendKeys(amendChequeStatusTestData.get("Request No"));
		chequeBookRequestObj.destroyChequeCodeSearch().sendKeys(Keys.ENTER);
	}

	@And("^select the destroy record$")
	public void select_the_destroy_record() throws Throwable {
		String xpath = "//td[text()='" + amendChequeStatusTestData.get("Request No") + "']";

		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on destroy button$")
	public void click_on_destroy_button() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.destroyDestroyButon());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.destroyDestroyButon());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.destroyDestroyButon());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify server got loaded while we destroy the cheque in destroy stage$")
	public void verify_server_got_loaded_while_we_destroy_the_cheque_in_destroy_stage() throws Throwable {
		String branchCodePrevValue = "";
		for (int i = 0; i <= 1000; i++) {
			try {
				branchCodePrevValue = chequeBookRequestObj.destroyedBranchCodeValidation().getAttribute("prevvalue");
				if (branchCodePrevValue.isBlank()) {
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("^verify system should show the status to approved for the cheque$")
	public void verify_system_should_show_the_status_to_approved_for_the_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.ChequeBookApprovedStatus());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.ChequeBookApprovedStatus());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.ChequeBookApprovedStatus());
	}
	@And("close the cheuqebook approve cancel screeen in chequebook request")
	public void close_the_cheuqebook_approve_cancel_screeen_in_chequebook_request() throws Throwable{
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestApproveCancelTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestApproveCancelTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestApproveCancelTabClose());
	}

	@And("^click on cheque book request maintenance screen$")
	public void click_on_cheque_book_request_maintenance_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.chequeBookMaintenenaceScreen());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenenaceScreen());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenenaceScreen());
				break;
			}

			catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on search in cheque book request maintenance scren$")
	public void click_on_search_in_cheque_book_request_maintenance_scren() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenaceSearch());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenaceSearch());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenaceSearch());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^search the cheque code in cheque book request maintenance screen$")
	public void search_the_cheque_code_in_cheque_book_request_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(amendChequeStatusTestData.get("Request No").trim());
		for (int i = 0; i <= 10; i++) {
			chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		}

	}

	@And("^click on Transaction module$")
	public void click_on_transaction_module() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.csmTransactionMainModule());
				clicksAndActionsHelper.moveToElement(transactionObj.csmTransactionMainModule());
				clicksAndActionsHelper.clickOnElement(transactionObj.csmTransactionMainModule());
				break;

			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on maintenance scree under transaction module$")
	public void click_on_maintenance_scree_under_transaction_module() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionMaintenance());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenance());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenance());
				break;

			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on search in transaction screen$")
	public void click_on_search_in_transaction_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchIcon());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchIcon());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchIcon());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^search the transaction number in transaction screen$")
	public void search_the_transaction_number_in_transaction_screen() throws Throwable {
		amendChequeStatusTestData = excelDataForAmendChequeStatus.getTestdata("DS01_ACSD_004");
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNumber());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNumber());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNumber());
		transactionObj.transactionSearchTransactionNumber()
				.sendKeys(amendChequeStatusTestData.get("TransactionNumber"));
		transactionObj.transactionSearchTransactionNumber().sendKeys(Keys.ENTER);

	}

	@And("^verify transaction status should be approved$")
	public void verify_transaction_status_should_be_approved() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionStatus());
		Assert.assertTrue(transactionObj.transactionTransactionStatus().isDisplayed());
	}

	@And("^close the tranaction screen$")
	public void close_the_tranaction_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionClosebutton());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionClosebutton());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionClosebutton());
	}

	@Then("^verify system should reverse the transaction of the charged cheque$")
	public void verify_system_should_reverse_the_transaction_of_the_charged_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionReversedStatus());
		Assert.assertTrue(transactionObj.transactionTransactionReversedStatus().isDisplayed());
	}

	



}
