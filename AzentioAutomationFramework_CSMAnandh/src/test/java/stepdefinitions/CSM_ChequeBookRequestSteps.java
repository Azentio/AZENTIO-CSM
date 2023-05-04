package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csm.ChequeBookRequestObj;
import resources.BaseClass;

public class CSM_ChequeBookRequestSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ChequeBookRequestObj chequeBookRequestObj = new ChequeBookRequestObj(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForChequeBookRequest = new ExcelData(path, "CSM_ChequeBookrequest", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> chequeBookRequestTestData = new HashMap<>();
	Map<String, String> chargeWaiverExecutionData = new HashMap<>();
	ExcelData excelDataForChargeWaiverExecution = new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	ExcelData excelDataForCheuqeBookRequestExecution = new ExcelData(path, "CheuqeBookRequestExecutionTrack",
			"TestCaseID");

	@And("^get the test data for CW_002$")
	public void get_the_test_data_for_cw002() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_002");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_081$")
	public void get_the_test_data_for_test_case_id_chb081() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_081");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^enter the number of cheque book in cheque book request$")
	public void enter_the_number_of_cheque_book_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestNumberOfChequeBook());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestNumberOfChequeBook());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestNumberOfChequeBook());
		chequeBookRequestObj.chequeBookRequestNumberOfChequeBook()
				.sendKeys(chequeBookRequestTestData.get("Number Of ChequeBook"));
	}

	@And("^enter the chque code in cheque book request$")
	public void enter_the_chque_code_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestChequeCode());
		chequeBookRequestObj.chequeBookRequestChequeCode().sendKeys(chequeBookRequestTestData.get("Cheque Code"));

		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestChequeCodeDescription());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestChequeCodeDescription());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestChequeCodeDescription());
		for (int i = 0; i <= 100; i++) {
			if (!(chequeBookRequestObj.chequeBookRequestChequeCodeDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 100) {
				Assert.fail("Data not geting populated");
			}
		}

	}

	@And("^get the cheque from number and store it in excel data base$")
	public void get_the_cheque_from_number_and_store_it_in_excel_data_base() throws Throwable {
		String fromNumber = "";
		for (int i = 0; i <= 500; i++) {
			try {
				fromNumber = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.FROM_NUMBER')[0].value")
						.toString();
				if (!(fromNumber.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}

			}
		}
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Chequebook Number",
				fromNumber);
	}

	@And("^get the cheque to number and store it in excel data base$")
	public void get_the_cheque_to_number_and_store_it_in_excel_data_base() throws Throwable {
		String toNumber = "";
		for (int i = 0; i <= 500; i++) {
			try {
				toNumber = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.NUMBER_TO')[0].value")
						.toString();
				if (!(toNumber.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}

			}
		}
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"),
				"Chequebook To Number", toNumber);
	}

	@And("^enter the account branch code in cheque book request$")
	public void enter_the_account_branch_code_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestAccountBranchName());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestAccountBranchName());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestAccountBranchName());
		chequeBookRequestObj.chequeBookRequestAccountBranchName()
				.sendKeys(chequeBookRequestTestData.get("account Branch Code"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestLabel());
	}

	@And("^enter the acount currency code in cheque book request$")
	public void enter_the_acount_currency_code_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestAccountCurrencyCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestAccountCurrencyCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestAccountCurrencyCode());
		chequeBookRequestObj.chequeBookRequestAccountCurrencyCode()
				.sendKeys(chequeBookRequestTestData.get("Account Currency Code"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestLabel());
	}

	@And("^enter the gl code in cheque book request$")
	public void enter_the_gl_code_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestAccountGlCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestAccountGlCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestAccountGlCode());
		chequeBookRequestObj.chequeBookRequestAccountGlCode()
				.sendKeys(chequeBookRequestTestData.get("Account Gl code"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestLabel());
	}

	@And("^enter the CIF code in cheque book request$")
	public void enter_the_cif_code_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestAccountCIFCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestAccountCIFCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestAccountCIFCode());
		chequeBookRequestObj.chequeBookRequestAccountCIFCode()
				.sendKeys(chequeBookRequestTestData.get("Account CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestLabel());
	}

	@And("^enter the serial number in cheque book request$")
	public void enter_the_serial_number_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestAccountSerialNumber());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestAccountSerialNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestAccountSerialNumber());
		chequeBookRequestObj.chequeBookRequestAccountSerialNumber()
				.sendKeys(chequeBookRequestTestData.get("Account Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestLabel());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestLabel());
	}

	@And("^click on charges in chque book request$")
	public void click_on_charges_in_chque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestChargesSection());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestChargesSection());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestChargesSection());
	}

	@And("^click on save button in cheque book request$")
	public void click_on_save_button_in_cheque_book_request() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmSaveButton());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveButton());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("^validate system should show the validation for charges have waiveds$")
	public void validate_system_should_show_the_validation_for_charges_have_waiveds() throws Throwable {
		Assert.fail("System not showing the validation due to issue");
	}

	@And("^click on ok button in signature warning pop up$")
	public void click_on_ok_button_in_signature_warning_pop_up() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
	}

	@And("^close the cheuqebook request maintenance screen$")
	public void close_the_cheuqebook_request_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestMaintenanceTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestMaintenanceTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestMaintenanceTabClose());
	}

	@And("^click on to cancel feature under cheuqe book request feture$")
	public void click_on_to_cancel_feature_under_cheuqe_book_request_feture() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestToCancelFeatrue());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestToCancelFeatrue());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestToCancelFeatrue());
	}

	@And("^search for currency code in to cancel feature$")
	public void search_for_currency_code_in_to_cancel_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookrequestSearchAccountCurrency());
		chequeBookRequestObj.chequeBookrequestSearchAccountCurrency().click();
		chequeBookRequestObj.chequeBookrequestSearchAccountCurrency()
				.sendKeys(chequeBookRequestTestData.get("Account Currency Code"));
	}

	@And("^search for gl in to cancel feature$")
	public void search_for_gl_in_to_cancel_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequesstSearchGLCode());
		chequeBookRequestObj.chequeBookRequesstSearchGLCode().click();
		chequeBookRequestObj.chequeBookRequesstSearchGLCode()
				.sendKeys(chequeBookRequestTestData.get("Account Gl code"));
	}

	@And("^search for CIF number in to cancel feature$")
	public void search_for_cif_number_in_to_cancel_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchCIFNumber());
		chequeBookRequestObj.chequebookRequestSearchCIFNumber().click();
		chequeBookRequestObj.chequebookRequestSearchCIFNumber()
				.sendKeys(chequeBookRequestTestData.get("Account CIF Code"));
	}

	@And("^search for serial number in to cancel feature$")
	public void search_for_serial_number_in_to_cancel_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchSerialNumber());
		chequeBookRequestObj.chequebookRequestSearchSerialNumber().click();
		chequeBookRequestObj.chequebookRequestSearchSerialNumber()
				.sendKeys(chequeBookRequestTestData.get("Account Serial Number"));
	}

	@And("^store the request number in excel database$")
	public void store_the_request_number_in_excel_database() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestGridRequestNumber());
		String requestNumber = chequeBookRequestObj.chequebookRequestGridRequestNumber().getText();
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"),
				"ChequeBook Request Number", requestNumber);

	}

	@And("^select the record from suggestion of cheque book to cancel$")
	public void select_the_record_from_suggestion_of_cheque_book_to_cancel() throws Throwable {
		String xpath = "(//td[contains(text(),'" + chequeBookRequestTestData.get("Account Currency Code")
				+ "')]//following-sibling::td[contains(text(),'" + chequeBookRequestTestData.get("Account Gl code")
				+ "')]//following-sibling::td[contains(text(),'" + chequeBookRequestTestData.get("Account CIF Code")
				+ "')]//following-sibling::td[contains(text(),'"
				+ chequeBookRequestTestData.get("Account Serial Number") + "')])[1]";

		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on to cancel button$")
	public void click_on_to_cancel_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(chequeBookRequestObj.chequebookRequestToCancelButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("^click on approve cancel feature$")
	public void click_on_approve_cancel_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestApproveCancelFeature());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestApproveCancelFeature());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestApproveCancelFeature());
	}

	@And("^search for request number under approve cancel feature$")
	public void search_for_request_number_under_approve_cancel_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		chequeBookRequestObj.chequebookRequestSearchRequetCode()
				.sendKeys(chequeBookRequestTestData.get("ChequeBook Request Number"));
	}

	@And("^select the record in approve cancel feature$")
	public void select_the_record_in_approve_cancel_feature() throws Throwable {
		String xpath = "(//td[contains(text(),'" + chequeBookRequestTestData.get("ChequeBook Request Number")
				+ "')])[1]";
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on cancel button under approve cancel$")
	public void click_on_cancel_button_under_approve_cancel() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(chequeBookRequestObj.chequebookRequestCancelButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}
	@Then("^verify system should generate new sequence in from number and to number$")
    public void verify_system_should_generate_new_sequence_in_from_number_and_to_number() throws Throwable {
       Assert.fail("Step need to complete");
    }
}
