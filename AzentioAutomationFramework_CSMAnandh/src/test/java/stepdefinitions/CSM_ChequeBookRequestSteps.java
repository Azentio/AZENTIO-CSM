package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
	Map<String, String> chequeBookExecutionData = new HashMap<>();
	Map<String, String> chargeWaiverExecutionData = new HashMap<>();
	ExcelData excelDataForChargeWaiverExecution = new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	ExcelData excelDataForCheuqeBookRequestExecution = new ExcelData(path, "CheuqeBookRequestExecutionTrack",
			"TestCaseID");
	String rquestNumber = "";
	Robot robot;

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

	@And("^get the test data for test case ID CHB_123_124_Prereq$")
	public void get_the_test_data_for_test_case_id_chb123124prereq() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_123_124_Prereq");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_112_113_Prereq_01$")
	public void get_the_test_data_for_test_case_id_chb112113prereq01() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_112_113_Prereq_01");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_112_01$")
	public void get_the_test_data_for_test_case_id_chb11201() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_112_01");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}
	@And("^get the test data for test case ID CHB_113_01$")
    public void get_the_test_data_for_test_case_id_chb11301() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_113_01");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
    }

	@And("^get the test data for test case ID CHB_112_02$")
	public void get_the_test_data_for_test_case_id_chb11202() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_112_02");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}
	@And("^get the test data for test case ID CHB_113_02$")
    public void get_the_test_data_for_test_case_id_chb11302() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_113_02");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
    }
	@And("^get the test data for test case ID CHB_123_124_Prereq_02$")
	public void get_the_test_data_for_test_case_id_chb123124prereq02() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_123_124_Prereq_02");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_119_120_121_Prereq_03$")
	public void get_the_test_data_for_test_case_id_chb119120121prereq03() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_123_124_Prereq_02");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_123_124_Prereq_01$")
	public void get_the_test_data_for_test_case_id_chb123124prereq01() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_119_120_Prereq_01");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_119_120_121_Prereq_01$")
	public void get_the_test_data_for_test_case_id_chb119120prereq01() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_119_120_121_Prereq_01");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_119_120_121_Prereq_02$")
	public void get_the_test_data_for_test_case_id_chb119120121prereq02() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_119_120_121_Prereq_02");
		chequeBookRequestTestData = excelDataForCheuqeBookRequestExecution
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_119_120_Prereq_02$")
	public void get_the_test_data_for_test_case_id_chb119120prereq02() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_123_124_Prereq_02");
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
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(chequeBookRequestObj.chequeBookRequestAccountBranchName().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
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
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(chequeBookRequestObj.chequeBookRequestAccountCurrencyCode().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
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
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(chequeBookRequestObj.chequeBookRequestAccountGlCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
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
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(chequeBookRequestObj.chequeBookRequestAccountCIFCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
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
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(chequeBookRequestObj.chequeBookRequestAccountSerialNumber().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^close the dormant acount pop up$")
	public void close_the_dormant_acount_pop_up() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.dormantAccountPopupOkButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.dormantAccountPopupOkButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^close the memo alertpop up$")
	public void close_the_memo_alertpop_up() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.memoAlertCloseButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.memoAlertCloseButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

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
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmSaveBtn());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveBtn());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveBtn());
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
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

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

	@And("^get the test data for test case id CHB_121_1$")
	public void get_the_test_data_for_test_case_id_CHB_121_1() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_121_1");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id CHB_120_1$")
	public void get_the_test_data_for_test_case_id_chb1201() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_120_1");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_120_2$")
	public void get_the_test_data_for_test_case_id_chb1202() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_120_2");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id CHB_119_1$")
	public void get_the_test_data_for_test_case_id_chb1191() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_119_1");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id CHB_119_2$")
	public void get_the_test_data_for_test_case_id_chb1192() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_119_2");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_121_2$")
	public void get_the_test_data_for_test_case_id_chb1212() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_121_1");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^click on to cancel feature under cheque book request$")
	public void click_on_to_cancel_feature_under_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestToCancelFeatrue());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestToCancelFeatrue());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestToCancelFeatrue());

	}

	@And("^search the submitted record under to cancel screen$")
	public void search_the_submitted_record_under_to_cancel_screen() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		chequeBookRequestObj.chequebookRequestSearchRequetCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequebookRequestSearchRequetCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^verify alert will open for the BM user to sent approval$")
	public void verify_alert_will_open_for_the_bm_user_to_sent_approval() throws Throwable {
		Assert.fail("Step need to write");
	}

	@Then("^verify reason remark field should not show$")
	public void verify_reason_remark_field_should_not_show() throws Throwable {
		Assert.fail("Step need to write");
	}

	@Then("^verify system should sent the alert to BM user for chequebook to cancel approval$")
	public void verify_system_should_sent_the_alert_to_bm_user_for_chequebook_to_cancel_approval() throws Throwable {
		Assert.fail("Step need to write");
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

	@And("^click on approve feature uder cheque book request$")
	public void click_on_approve_feature_uder_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookApproveFeature());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookApproveFeature());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookApproveFeature());

	}

	@And("^get the test data for test case ID CHB_123$")
	public void get_the_test_data_for_test_case_id_chb123() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_123");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_124$")
	public void get_the_test_data_for_test_case_id_chb124() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_124");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^select one active record from the list in approve screen$")
	public void select_one_active_record_from_the_list_in_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestFirstRecord());
		rquestNumber = chequeBookRequestObj.chequeBookRequestFirstRecord().getText();
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestFirstRecord());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestFirstRecord());
		clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBookRequestFirstRecord());
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				rquestNumber);
	}

	@Then("^verify system should show the validation for reject reason$")
	public void verify_system_should_show_the_validation_for_reject_reason() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestMissingReasonCode());

		Assert.assertTrue(chequeBookRequestObj.chequeBookRequestMissingReasonCode().isDisplayed());
		waitHelper.waitForElementwithFluentwait(driver,
				chequeBookRequestObj.chequeBookRequestMissingReasonCodeOkButton());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestMissingReasonCodeOkButton());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestMissingReasonCodeOkButton());
	}

	@Then("^verify system should not show the reason remark field$")
	public void verify_system_should_not_show_the_reason_remark_field() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 100; i++) {
			try {
				status = chequeBookRequestObj.chequeBookRequestRejectReasonremark().isDisplayed();

				break;
			} catch (Exception e) {
				if (status == true) {
					Assert.fail("System throughs the validation");
				}
			}
		}
		Assert.assertFalse(status);

	}

	@Then("^verify system should not show the validation to user for fill the reason$")
	public void verify_system_should_not_show_the_validation_to_user_for_fill_the_reason() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 100; i++) {
			try {
				status = chequeBookRequestObj.chequeBookRequestMissingReasonCode().isDisplayed();

				break;
			} catch (Exception e) {
				if (status == true) {
					Assert.fail("System throughs the validation");
				}
			}
		}
		Assert.assertFalse(status);
	}

	@And("^enter the reject reason in approve screen$")
	public void enter_the_reject_reason_in_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestRejectReasonremark());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestRejectReasonremark());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestRejectReasonremark());
		chequeBookRequestObj.chequeBookRequestRejectReasonremark().getAttribute("maxlength").equalsIgnoreCase("250");
		chequeBookRequestObj.chequeBookRequestRejectReasonremark().sendKeys("Ok");
	}

	@And("^close the memo Alert in cheque book approval screen$")
	public void close_the_memo_Alert_in_cheque_book_approval_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.memoAlertCloseButton());
				clicksAndActionsHelper.doubleClick(csmCommonWebElements.memoAlertCloseButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("^click on reject button in cheque book approve screen$")
	public void click_on_reject_button_in_cheque_book_approve_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmRejectButton());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmRejectButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmRejectButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^verify server got loaded in approve screen$")
	public void verify_server_got_loaded_in_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestNumberOfChequeBooks());

		for (int i = 0; i <= 300; i++) {
			try {
				if (chequeBookRequestObj.chequeBookRequestNumberOfChequeBooks().getAttribute("prevvalue").isBlank()) {
					break;
				}
			}

			catch (Exception e) {

			}
		}

	}

	@And("^close the approve screen in cheque book request$")
	public void close_the_approve_screen_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestApproveScreenClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestApproveScreenClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestApproveScreenClose());

	}

	@And("^click on search button in chequebook request maintenence$")
	public void click_on_search_button_in_chequebook_request_maintenence() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSearchButton());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSearchButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSearchButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^search the request number in cheque book maintenance search$")
	public void search_the_request_number_in_cheque_book_maintenance_search() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		chequeBookRequestObj.chequebookRequestSearchRequetCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequebookRequestSearchRequetCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^verify system is showing the right status of the cheque book$")
	public void verify_system_is_showing_the_right_status_of_the_cheque_book() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				chequeBookRequestObj.chequeBookRequestMaintenanceRecordStatus());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestMaintenanceRecordStatus());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestMaintenanceRecordStatus());
		String status = chequeBookRequestObj.chequeBookRequestMaintenanceRecordStatus().getText();
		Assert.assertEquals(status, "Deleted");
		System.out.println("Status " + chequeBookRequestObj.chequeBookRequestMaintenanceRecordStatus().getText());

	}

	@And("^close the chequebook request label$")
	public void close_the_chequebook_request_label() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestMaintenanceTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestMaintenanceTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestMaintenanceTabClose());

	}

	@And("^click on approve feature under chequebook request$")
	public void click_on_approve_feature_under_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookApproveFeature());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookApproveFeature());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookApproveFeature());
	}

	@And("^select the record under approval feature$")
	public void select_the_record_under_approval_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestFirstRecord());
		String requestNumber = chequeBookRequestObj.chequeBookRequestFirstRecord().getText();
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				requestNumber);
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestFirstRecord());
		clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBookRequestFirstRecord());

	}

	@And("^click on approve button in cheque book request approval$")
	public void click_on_approve_button_in_cheque_book_request_approval() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmApproveBtnWithLabel());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveBtnWithLabel());
				clicksAndActionsHelper.doubleClick(csmCommonWebElements.csmApproveBtnWithLabel());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^close the approve screen of chequebook request$")
	public void close_the_approve_screen_of_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestApproveScreenClose());
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestApproveScreenClose());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestApproveScreenClose());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("^click on apply to submit screen under chequebook request screen$")
	public void click_on_apply_to_submit_screen_under_chequebook_request_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestApplyToSubmitFeature());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestApplyToSubmitFeature());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestApplyToSubmitFeature());
	}

	@And("^search for request number under apply to submit screen$")
	public void search_for_request_number_under_apply_to_submit_screen() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		chequeBookRequestObj.chequebookRequestSearchRequetCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequebookRequestSearchRequetCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the record under apply to submit screen$")
	public void select_the_record_under_apply_to_submit_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestFirstRecord());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestFirstRecord());
		clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBookRequestFirstRecord());

	}

	@And("^click on apply to submit button under apply to submit screen$")
	public void click_on_apply_to_submit_button_under_apply_to_submit_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.applyToSubmitApplyToSubmitButton());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.applyToSubmitApplyToSubmitButton());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.applyToSubmitApplyToSubmitButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestApplyToSubmitFeature());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestApplyToSubmitFeature());
	}

	@And("^close the apply to submit label$")
	public void close_the_apply_to_submit_label() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestApplyToSubmitClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestApplyToSubmitClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestApplyToSubmitClose());
	}

	@And("^click on submit feature under chequebook request$")
	public void click_on_submit_feature_under_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestSubmitFeature());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestSubmitFeature());
		clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBookRequestSubmitFeature());
	}

	@And("^search the request number under submit screen$")
	public void search_the_request_number_under_submit_screen() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		chequeBookRequestObj.chequebookRequestSearchRequetCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequebookRequestSearchRequetCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the record in submit screen of chequebook request$")
	public void select_the_record_in_submit_screen_of_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestFirstRecord());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestFirstRecord());
		clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBookRequestFirstRecord());
	}

	@And("^click on submit button in submit screen$")
	public void click_on_submit_button_in_submit_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.applyToSubmitApplyToSubmitButton());
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^close the submit screen in chequebook request$")
	public void close_the_submit_screen_in_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestSubmitClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestSubmitClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestSubmitClose());
	}

	@Then("^verify BM user can able to get Alert for chequebook to cancel record$")
	public void verify_bm_user_can_able_to_get_alert_for_chequebook_to_cancel_record() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@Then("^verify teller user record should available in BM user$")
	public void verify_teller_user_record_should_available_in_bm_user() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@And("^check reject reason field should not be visible in BM user alert$")
	public void check_reject_reason_field_should_not_be_visible_in_bm_user_alert() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@And("^BM user can able to reject the record without entering reject reason$")
	public void bm_user_can_able_to_reject_the_record_without_entering_reject_reason() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@Then("^verify reject reason field should be editable under BM user$")
	public void verify_reject_reason_field_should_be_editable_under_bm_user() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@Then("^verify system should show the validation for reject reason mandatoryy in BM user$")
	public void verify_system_should_show_the_validation_for_reject_reason_mandatoryy_in_bm_user() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@Then("^verify record got rejected in BM user$")
	public void verify_record_got_rejected_in_bm_user() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@And("^enter reject button without entering the reject reason in BM user$")
	public void enter_reject_button_without_entering_the_reject_reason_in_bm_user() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@And("^enter the rejecct reason in BM user alert$")
	public void enter_the_rejecct_reason_in_bm_user_alert() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@And("^click in reject button in BM user alert$")
	public void click_in_reject_button_in_bm_user_alert() throws Throwable {
		Assert.fail("Steps need to enter");
	}

	@And("^click on to be destroyed screen under chequebook request$")
	public void click_on_to_be_destroyed_screen_under_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeDestroyMainModule());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeDestroyMainModule());
		clicksAndActionsHelper.clickUsingActionClass(chequeBookRequestObj.toBeDestroyMainModule(),
				chequeBookRequestObj.toBeDestroyMainModule());
	}

	@And("^search the cheque code in to be destroyed screen$")
	public void search_the_cheque_code_in_to_be_destroyed_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.clickUsingActionClass(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode(),
				chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
	}

	@And("^select the record from to be destroyed suggestion$")
	public void select_the_record_from_to_be_destroyed_suggestion() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSearchRequetCode());
		chequeBookRequestObj.chequebookRequestSearchRequetCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequebookRequestSearchRequetCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^click on to be destroy button$")
	public void click_on_to_be_destroy_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.toBeDestroyToDestroyButton());
				clicksAndActionsHelper.clickUsingActionClass(chequeBookRequestObj.toBeDestroyToDestroyButton(),
						chequeBookRequestObj.toBeDestroyToDestroyButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify alert will open for teller account for to be destroy$")
	public void verify_alert_will_open_for_teller_account_for_to_be_destroy() throws Throwable {
		Assert.fail("Steps need to write");
	}

	@Then("^verify reject reason remark field should not show for under to be destroy screen under teller account$")
	public void verify_reject_reason_remark_field_should_not_show_for_under_to_be_destroy_screen_under_teller_account()
			throws Throwable {
		Assert.fail("Steps need to write");
	}

	@And("^sent the to be destroy alert to user branch manager$")
	public void sent_the_to_be_destroy_alert_to_user_branch_manager() throws Throwable {
		Assert.fail("Steps need to write");
	}
}
