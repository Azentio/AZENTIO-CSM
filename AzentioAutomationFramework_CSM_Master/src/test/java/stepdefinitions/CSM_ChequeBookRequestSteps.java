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
	@And("change the system date within excemption date in chequebook request")
	public void change_the_system_date_within_excemption_date_in_chequebook_request() throws Throwable{
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

		csmCommonWebElements.csmInputSystemDate().sendKeys(chequeBookRequestTestData.get("ExcemptionDate"));
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

	@And("^get the test data for test case ID CHB_081$")
	public void get_the_test_data_for_test_case_id_chb081() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_081");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_075$")
	public void get_the_test_data_for_test_case_id_chb075() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_075");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_074$")
	public void get_the_test_data_for_test_case_id_chb074() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_074");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_082$")
	public void get_the_test_data_for_test_case_id_chb082() throws Throwable {
		chargeWaiverExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_082");
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

	@And("^get the test data for test case ID CHB_003$")
	public void get_the_test_data_for_test_case_id_CHB_003() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_003");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case ID CHB_001$")
	public void get_the_test_data_for_test_case_id_CHB_001() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_001");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_055")
	public void get_the_test_data_for_test_case_id_CHB_055() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_055");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_057")
	public void get_the_test_data_for_test_case_id_CHB_057() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_057");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_058")
	public void get_the_test_data_for_test_case_id_CHB_058() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_058");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_059")
	public void get_the_test_data_for_test_case_id_CHB_059() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_059");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_060")
	public void get_the_test_data_for_test_case_id_CHB_060() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_060");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_062")
	public void get_the_test_data_for_test_case_id_CHB_062() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_062");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_063")
	public void get_the_test_data_for_test_case_id_CHB_063() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_063");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_064")
	public void get_the_test_data_for_test_case_id_CHB_064() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_064");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_067")
	public void get_the_test_data_for_test_case_id_CHB_067() {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_067");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_065")
	public void get_the_test_data_for_test_case_id_CHB_065() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_065");
		chequeBookRequestTestData = excelDataForChequeBookRequest
				.getTestdata(chequeBookExecutionData.get("Data Set ID"));
	}

	@And("get the test data for test case ID CHB_066")
	public void get_the_test_data_for_test_case_id_CHB_066() throws Throwable {
		chequeBookExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_065");
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

	@And("^enter the cheque code in cheque book request$")
	public void enter_the_cheque_code_in_cheque_book_request() throws Throwable {
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
		} // ChequeFrom Number
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "ChequeFrom Number",
				fromNumber);
		System.out.println("From Number " + fromNumber);
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
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Cheque To Number",
				toNumber);
		System.out.println("To Number " + toNumber);
	}

	@Then("verify cehquebook from number field should be non editabe and read only mode")
	public void verify_cehquebook_from_number_field_should_be_non_editabe_and_read_only_mode() throws IOException {
		boolean status = false;
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestFromNumberInputBox());
		for (int i = 0; i <= 500; i++) {

			System.out.println("Flag status "
					+ chequeBookRequestObj.chequebookRequestFromNumberInputBox().getAttribute("readonly"));
			try {
				if (chequeBookRequestObj.chequebookRequestFromNumberInputBox().getAttribute("readonly")
						.equals("true")) {
					System.out.println("Flag status "
							+ chequeBookRequestObj.chequebookRequestFromNumberInputBox().getAttribute("readonly"));
					status = true;
					break;

				} else {
					System.out.println("Flag status "
							+ chequeBookRequestObj.chequebookRequestFromNumberInputBox().getAttribute("readonly"));
					status = false;

				}
			} catch (Exception e) {
				if (i == 500) {
					break;
				}
			}
		}
		Assert.assertTrue(status, " Amend From Number field should be diabled but here it is enabled hence failed");

	}

	@Then("verify number of paper input box should be not editable and read only")
	public void verify_number_of_paper_input_box_should_be_not_editable_and_read_only() throws IOException {
		boolean status = false;
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox());
		for (int i = 0; i <= 500; i++) {

			System.out.println("Flag status "
					+ chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().getAttribute("readonly"));
			try {
				if (chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().getAttribute("readonly")
						.equals("true")) {
					System.out.println("Flag status "
							+ chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().getAttribute("readonly"));
					status = true;
					break;

				} else {
					System.out.println("Flag status "
							+ chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().getAttribute("readonly"));
					status = false;

				}
			} catch (Exception e) {
				if (i == 500) {
					break;
				}
			}
		}
		Assert.assertTrue(status, " Number of paper field should be diabled but here it is enabled hence failed");
	}

	@Then("verify cehquebook from number field should be editable")
	public void verify_cehquebook_from_number_field_should_be_editable() throws IOException {

		boolean status = false;
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestFromNumberInputBox());
		int integerFromNumber = chequeBookRequestObj.chequebookRequestFromNumberInputBox().getAttribute("maxvalue")
				.length();
		for (int i = 0; i <= integerFromNumber; i++) {
			try {
				chequeBookRequestObj.chequebookRequestFromNumberInputBox().sendKeys(Keys.BACK_SPACE);
			} catch (Exception e) {
				if (i == integerFromNumber) {
					Assert.fail("From Number field may be non editable due to that test failed");
				}
			}
		}
		chequeBookRequestObj.chequebookRequestFromNumberInputBox().sendKeys(Keys.TAB);
	}

	@Then("enter the from number in cheque from number")
	public void enter_the_from_number_in_cheque_from_number() {
		String inputFromNumber = "";
		for (int i = 0; i <= 100; i++) {
			try {
				inputFromNumber = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.NUMBER_TO')[0].value")
						.toString();
				System.out.println("From Input Number " + inputFromNumber);
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}

		}
		chequeBookRequestObj.chequebookRequestFromNumberInputBox().sendKeys(inputFromNumber);
		chequeBookRequestObj.chequebookRequestFromNumberInputBox().sendKeys(Keys.TAB);

	}

	@Then("verify cheuqe from number and to number field should be diabled and empty field")
	public void verify_cheuqe_from_number_and_to_number_field_should_be_diabled_and_empty_field() throws Throwable {
		boolean fromNumberFieldStatus = false;
		boolean toNumberFieldStatus = false;
		String fromNumberFieldValue = "";
		String toNumberFieldValue = "";
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestFromNumberInputBox());
		System.out.println("From Number flag status "
				+ chequeBookRequestObj.chequebookRequestFromNumberInputBox().getAttribute("readonly"));
		fromNumberFieldStatus = chequeBookRequestObj.chequebookRequestFromNumberInputBox().getAttribute("readonly")
				.equals("readonly");
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestToNumberInputBox());
		System.out.println("To Number flag status "
				+ chequeBookRequestObj.chequebookRequestToNumberInputBox().getAttribute("readonly"));
		toNumberFieldStatus = chequeBookRequestObj.chequebookRequestToNumberInputBox().getAttribute("readonly")
				.equals("readonly");
		Assert.assertTrue(fromNumberFieldStatus, "From Number field is enabled hence failed");
		Assert.assertTrue(toNumberFieldStatus, "To Number field is enabled hence failed");

		for (int i = 0; i <= 200; i++) {
			try {
				fromNumberFieldValue = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.FROM_NUMBER')[0].value")
						.toString();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				toNumberFieldValue = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.NUMBER_TO')[0].value")
						.toString();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(fromNumberFieldStatus, "");
		Assert.assertEquals(toNumberFieldStatus, "");

	}

	@Then("verify number of papers field should be editable and amendable in chequebook request")
	public void verify_number_of_papers_field_should_beeditable_and_amendable_in_chequebook_request() throws Throwable {
		String numberOfPaper = "";
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox());
		numberOfPaper = chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().getAttribute("prevvalue");
		System.out.println("Number of Papers Prev Value " + numberOfPaper);
		System.out.println("Number of Papers Length " + numberOfPaper.length());
		for (int i = 0; i <= numberOfPaper.length(); i++) {
			try {
				System.out.println("Index " + i);
				chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().click();
				chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().sendKeys(Keys.BACK_SPACE);
			} catch (Exception e) {
				if (i >= numberOfPaper.length()) {
					Assert.fail("Field is not editable hence test failed");
				}
			}
		}
		chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().sendKeys(Keys.TAB);
		chequeBookRequestObj.chequebookRequestNumberOfPaperInputBox().sendKeys(numberOfPaper);
	}

	@Then("verify cheque from number and to number field should be automaticaled field by the system")
	public void verify_cheque_from_number_and_to_number_field_should_be_automaticaled_field_by_the_system()
			throws Throwable {
		String fromNumberFieldValue = "";
		String toNumberFieldValue = "";
		for (int i = 0; i <= 200; i++) {
			try {
				fromNumberFieldValue = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.FROM_NUMBER')[0].value")
						.toString();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				toNumberFieldValue = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.NUMBER_TO')[0].value")
						.toString();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(fromNumberFieldValue.length() != 0);
		Assert.assertTrue(toNumberFieldValue.length() != 0);
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

	@And("^click on charges in cheque book request$")
	public void click_on_charges_in_cheque_book_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestChargesSection());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestChargesSection());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestChargesSection());
		Thread.sleep(2000);
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
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.commonChargewaiverValidationOkButton());
		Assert.assertTrue(csmCommonWebElements.commonChargewaiverValidationOkButton().isDisplayed());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.commonChargewaiverValidationOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.commonChargewaiverValidationOkButton());
	}

	@And("^click on ok button in signature warning pop up$")
	public void click_on_ok_button_in_signature_warning_pop_up() throws Throwable {

		for (int i = 0; i <= 200; i++) {
			try {

				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 600; i++) {
			try {
				if (chequeBookRequestObj.chequeBookRequestChequeCodeDescription().getAttribute("prevvalue").isBlank()) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("click on ok button in suspense account waring pop up")
	public void click_on_ok_button_in_suspense_account_waring_pop_up() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSuspenseOkButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSuspenseOkButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					System.out.println("==> Loop ended");
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

	@And("click onn search button in cheque book request maintenance")
	public void click_onn_search_button_in_cheque_book_request_maintenance() throws Throwable {
		for (int i = 0; i < 300; i++) {
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

	@And("search the cheque code in cheque maintenance search grid")
	public void search_the_cheque_code_in_cheque_maintenance_search_grid() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				chequeBookRequestObj.chequeBookMaintenanceSearchChequeBookType());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeBookType());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeBookType());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeBookType()
				.sendKeys(chequeBookRequestTestData.get("Cheque Code"));
	}

	@And("search the chequebook request number in mcehquebook request maintenance screeen")
	public void search_the_chequebook_request_number_in_mcehquebook_request_maintenance_screeen() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		robot = new Robot();
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("select the record in cheuqebook maintenance screen")
	public void select_the_record_in_cheuqebook_maintenance_screen() throws Throwable {
		String xpath = "(//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')])[1]";
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

	@And("click on delete button in chequebook maintenance screen")
	public void click_on_delete_button_in_chequebook_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				chequeBookRequestObj.chequebookRequestMaintenanceDeleteButton());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestMaintenanceDeleteButton());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestMaintenanceDeleteButton());

	}

	@And("click on ok button in delete confirmationn button")
	public void click_on_ok_button_in_delete_confirmationn_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				chequeBookRequestObj.chequebookRequestMaintenanceDeleteConfirmationOkButton());
		clicksAndActionsHelper
				.moveToElement(chequeBookRequestObj.chequebookRequestMaintenanceDeleteConfirmationOkButton());
		clicksAndActionsHelper
				.clickOnElement(chequeBookRequestObj.chequebookRequestMaintenanceDeleteConfirmationOkButton());
		for (int i = 0; i <= 600; i++) {
			try {

				if (chequeBookRequestObj.chequeBookRequestChequeCodeDescription().getAttribute("prevvalue").isBlank()) {
					break;
				} else if (i == 600) {
					Assert.fail("Data not geting populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("search the branch code in cheque maintenance search grid")
	public void search_the_branch_code_in_cheque_maintenance_search_grid() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookrequestSearchAccountBranch());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookrequestSearchAccountBranch());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookrequestSearchAccountBranch());
		chequeBookRequestObj.chequeBookrequestSearchAccountBranch()
				.sendKeys(chequeBookRequestTestData.get("account Branch Code"));
	}

	@And("search the currency code in cheque maintenance search grid")
	public void search_the_currency_code_in_cheque_maintenance_search_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookrequestSearchAccountCurrency());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookrequestSearchAccountCurrency());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookrequestSearchAccountCurrency());
		chequeBookRequestObj.chequeBookrequestSearchAccountCurrency()
				.sendKeys(chequeBookRequestTestData.get("Account Currency Code"));
	}

	@And("search the gl code in cheque maintenance search grid")
	public void search_the_gl_code_in_cheque_maintenance_search_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequesstSearchGLCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequesstSearchGLCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequesstSearchGLCode());
		chequeBookRequestObj.chequeBookRequesstSearchGLCode()
				.sendKeys(chequeBookRequestTestData.get("Account Gl code"));
	}

	@And("search the CIF Number in cheque maintenance search grid")
	public void search_the_cif_number_in_cheque_maintenance_search_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchCIFNumber());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSearchCIFNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSearchCIFNumber());
		chequeBookRequestObj.chequebookRequestSearchCIFNumber()
				.sendKeys(chequeBookRequestTestData.get("Account CIF Code"));
	}

	@And("search the serial number in cheque maintenace search grid")
	public void search_the_serial_number_in_cheque_maintenace_search_grid() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSearchSerialNumber());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSearchSerialNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSearchSerialNumber());
		chequeBookRequestObj.chequebookRequestSearchSerialNumber()
				.sendKeys(chequeBookRequestTestData.get("Account Serial Number"));
		chequeBookRequestObj.chequebookRequestSearchSerialNumber().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("verify record got saved in chequebook maintenance search grid")
	public void verify_record_got_saved_in_chequebook_maintenance_search_grid() throws IOException {
		String status = "";
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus());
		for (int i = 0; i <= 200; i++) {
			if (chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText().equals("Active")) {
				status = chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText();
				break;
			}
		}
		Assert.assertEquals(status, "Active");

	}

	@And("store the cheque book reference number in excel data base for test case ID CHB_003")
	public void store_the_cheque_book_reference_number_in_excel_data_base_for_test_case_id_chb003() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("Update dataset ID"),
				"Request Number", chequeCode);
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

	@And("search the chequebook request number in to cancel screen")
	public void search_the_chequebook_request_number_in_to_cancel_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		robot = new Robot();
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("select the chequebook record in to cancel record")
	public void select_the_chequebook_record_in_to_cancel_record() throws Throwable {
		String xpath = "//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')]";
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

	@And("close the to cancel screen in chequebook request")
	public void close_the_to_cancel_screen_in_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestToCancelTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestToCancelTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestToCancelTabClose());
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
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequebookRequestSearchRequetCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the record in approve cancel feature$")
	public void select_the_record_in_approve_cancel_feature() throws Throwable {
		String xpath = "(//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')])[1]";
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

		System.out.println("From Number " + fromNumber);
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

		System.out.println("To Number " + toNumber);
		Assert.assertNotEquals(chequeBookRequestTestData.get("ChequeFrom Number"), fromNumber);
		Assert.assertNotEquals(chequeBookRequestTestData.get("Chequebook To Number"), toNumber);
	}

	@Then("^verify system should generate same sequence in from number and to number$")
	public void verify_system_should_generate_same_sequence_in_from_number_and_to_number() throws Throwable {
		String fromNumber = "";
		for (int i = 0; i <= 500; i++) {
			try {
				fromNumber = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.FROM_NUMBER')[0].value")
						.toString();
				if (!(fromNumber.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}

			}
		}

		System.out.println("From Number " + fromNumber);
		String toNumber = "";
		for (int i = 0; i <= 500; i++) {
			try {
				toNumber = javascriptHelper
						.executeScript(
								"return document.getElementsByName('chequeBookCO.ctschqbookVO.NUMBER_TO')[0].value")
						.toString();
				if (!(toNumber.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}

			}
		}

		System.out.println("To Number " + toNumber);
		System.out.println("From Number from Map " + chequeBookRequestTestData.get("ChequeFrom Number"));
		Assert.assertEquals(chequeBookRequestTestData.get("ChequeFrom Number"), fromNumber);
		System.out.println("From Number from Map " + chequeBookRequestTestData.get("Cheque To Number")); // Chequebook
																											// To Number
		Assert.assertEquals(chequeBookRequestTestData.get("Cheque To Number"), toNumber);
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

	@And("click on approve feature in chequebook feature")
	public void click_on_approve_feature_in_chequebook_feature() throws IOException {

		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookApproveFeature());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookApproveFeature());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookApproveFeature());
	}

	@And("search the cheque request number in approval screen")
	public void search_the_cheque_request_number_in_approval_screen() throws IOException, AWTException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		robot = new Robot();
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("verify cheque record status should be active in approval screen")
	public void verify_cheque_record_status_should_be_active_in_approval_screen() throws IOException {
		String status = "";
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText().equals("Active")) {
					status = chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText();
					System.out.println("Loop got breaked");
					break;
				}
			} catch (Exception e) {

			}

		}
		Assert.assertEquals(status, "Active");
	}

	@And("select record in cheque approval screen")
	public void select_record_in_cheque_approval_screen() {
		String xpath = "//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')]";
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

	@And("click on approve button in chequebook feature")
	public void click_on_approve_button_in_chequebook_feature() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmApproveBtnWithLabel());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveBtnWithLabel());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveBtnWithLabel());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 600; i++) {
			try {
				if (chequeBookRequestObj.chequeBookRequestChequeCodeDescription().getAttribute("prevvalue").isBlank()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("close the cheque book approval screen")
	public void close_the_cheque_book_approval_screen() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestApproveTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestApproveTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestApproveTabClose());

	}

	@And("click on apply to submit feature in chequebook feature")
	public void click_on_apply_to_submit_feature_in_chequebook_feature() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestApplyToSubmitFeature());
		chequeBookRequestObj.chequeBookRequestApplyToSubmitFeature().click();
	}

	@And("search the chequebook request number")
	public void search_the_chequebook_request_number() throws IOException, AWTException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().click();
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("verify chequebook record status should be approved")
	public void verify_chequebook_record_status_should_be_approved() throws IOException {
		String status = "";
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText()
						.equalsIgnoreCase("Approved")) {
					status = chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText();
					break;
				}
			} catch (Exception e) {

			}

		}
		Assert.assertEquals(status, "Approved");
	}

	@And("select the cheque book record in apply to submit feature")
	public void select_the_cheque_book_record_in_apply_to_submit_feature() {
		String xpath = "//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')]";
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

	@And("click on apply to submit button")
	public void click_on_apply_to_submit_button() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.applyToSubmitApplyToSubmitButton());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.applyToSubmitApplyToSubmitButton());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.applyToSubmitApplyToSubmitButton());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 600; i++) {
			try {
				if (chequeBookRequestObj.chequeBookRequestChequeCodeDescription().getAttribute("prevvalue").isBlank()) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("close the apply to submit seature")
	public void close_the_apply_to_submit_seature() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestApplyToSubmitTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestApplyToSubmitTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestApplyToSubmitTabClose());

	}

	@And("click on submit feature in chequebook feature")
	public void click_on_submit_feature_in_chequebook_feature() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestSubmitFeature());
		chequeBookRequestObj.chequeBookRequestSubmitFeature().click();
	}

	@And("search the cehquebook request reference number in submit feature")
	public void search_the_cehquebook_request_reference_number_in_submit_feature() throws IOException, AWTException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().click();
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));

		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@And("select the cheque book record in feature")
	public void select_the_cheque_book_record_in_feature() {
		String xpath = "//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')]";
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

	@Then("verify record status should be applly to submit")
	public void verify_record_status_should_be_applly_to_submit() throws IOException {
		String status = "";
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus());
		for (int i = 0; i < 100; i++) {
			try {
				if (chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText().equals("Apply To Submit")) {
					status = chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText();
					break;
				}
			} catch (Exception e) {

			}

		}
		Assert.assertEquals(status, "Apply To Submit");
	}

	@And("select the record in submit feature")
	public void select_the_record_in_submit_feature() {
		String xpath = "//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')]";
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

	@And("click on submit button in submit feature")
	public void click_on_submit_button_in_submit_feature() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.SubmitFeatureSubmitButton());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.SubmitFeatureSubmitButton());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.SubmitFeatureSubmitButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("close the submit feature in chequebook")
	public void close_the_submit_feature_in_chequebook() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestSubmitTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestSubmitTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestSubmitTabClose());

	}

	@And("search the cheque book request number in maintenance screen")
	public void search_the_cheque_book_request_number_in_maintenance_screen() throws AWTException, Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().click();
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("verify chequebook record status should be n submitted status")
	public void verify_chequebook_record_status_should_be_n_submitted_status() throws Throwable {
		String status = "";
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus());
		for (int i = 0; i < 100; i++) {
			if (chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText().equals("Submitted")) {
				status = chequeBookRequestObj.chequebookMaintenanceFirstRecordStatus().getText();
				break;
			}

		}
		Assert.assertEquals(status, "Submitted");
	}

	@And("close the chequebook request maintenance screen")
	public void close_the_chequebook_request_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookRequestMaintenanceTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequebookRequestMaintenanceTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequebookRequestMaintenanceTabClose());

	}

	@And("update the test data for test case ID CHB_055")
	public void update_the_test_data_for_test_case_id_CHB_055() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("update the test data for test case ID CHB_057")
	public void update_the_test_data_for_test_case_id_CHB_057() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		System.out.println("data Set ID " + chequeBookRequestTestData.get("DataSet ID"));
		System.out.println("Cheque Request reference number " + chequeCode);
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("update the test data for test case ID CHB_081")
	public void update_the_test_data_for_test_case_id_CHB_081() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		System.out.println("data Set ID " + chequeBookRequestTestData.get("DataSet ID"));
		System.out.println("Cheque Request reference number " + chequeCode);
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("update the test data for test case ID CHB_075")
	public void update_the_test_data_for_test_case_id_CHB_075() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		System.out.println("data Set ID " + chequeBookRequestTestData.get("DataSet ID"));
		System.out.println("Cheque Request reference number " + chequeCode);
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("update the test data for test case ID CHB_074")
	public void update_the_test_data_for_test_case_id_CHB_074() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		System.out.println("data Set ID " + chequeBookRequestTestData.get("DataSet ID"));
		System.out.println("Cheque Request reference number " + chequeCode);
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("update the test data for test case ID CHB_082")
	public void update_the_test_data_for_test_case_id_CHB_082() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		System.out.println("data Set ID " + chequeBookRequestTestData.get("DataSet ID"));
		System.out.println("Cheque Request reference number " + chequeCode);
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("update the test data for test case ID CHB_058")
	public void update_the_test_data_for_test_case_id_CHB_058() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		System.out.println("data Set ID " + chequeBookRequestTestData.get("DataSet ID"));
		System.out.println("Cheque Request reference number " + chequeCode);
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("update the test data for test case ID CHB_059")
	public void update_the_test_data_for_test_case_id_CHB_059() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		System.out.println("data Set ID " + chequeBookRequestTestData.get("DataSet ID"));
		System.out.println("Cheque Request reference number " + chequeCode);
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("update the test data for test case ID CHB_060")
	public void update_the_test_data_for_test_case_id_CHB_060() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequebookMaintenanceFirstChequeCode());
		String chequeCode = chequeBookRequestObj.chequebookMaintenanceFirstChequeCode().getText();
		System.out.println("data Set ID " + chequeBookRequestTestData.get("DataSet ID"));
		System.out.println("Cheque Request reference number " + chequeCode);
		excelDataForChequeBookRequest.updateTestData(chequeBookRequestTestData.get("DataSet ID"), "Request Number",
				chequeCode);
	}

	@And("click on to reverse chequebook feature")
	public void click_on_to_reverse_chequebook_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestToBeReverseFeature());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestToBeReverseFeature());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestToBeReverseFeature());

	}

	@And("search for the chequebook request number in request number in to be reverse screen")
	public void search_for_the_chequebook_request_number_in_request_number_in_to_be_reverse_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().click();
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	@And("select the record in to be reverse screen")
	public void select_the_record_in_to_be_reverse_screen() throws Throwable {

		String xpath = "//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')]";
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

	@And("click on to be reverse button in to be reverse screen")
	public void click_on_to_be_reverse_button_in_to_be_reverse_screen() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toRereversedtoBeReverseButton());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toRereversedtoBeReverseButton());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toRereversedtoBeReverseButton());
	}

	@And("click on ok button in to be reverse confirmation")
	public void click_on_ok_button_in_to_be_reverse_confirmation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeReversedConfirmationOkButton());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeReversedConfirmationOkButton());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeReversedConfirmationOkButton());
		for (int i = 0; i <= 600; i++) {
			try {
				if (chequeBookRequestObj.chequeBookRequestChequeCodeDescription().getAttribute("prevvalue").isBlank()) {
					break;
				} else if (i == 600) {
					Assert.fail("Data not geting populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("close the to be reverse chequebook screen")
	public void close_the_to_be_reverse_chequebook_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestToBeReversedTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestToBeReversedTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestToBeReversedTabClose());

	}

	@And("close the reverse chequebook feature screen")
	public void close_the_reverse_chequebook_feature_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				chequeBookRequestObj.chequeBookRequestReverseChequebookTabClose());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestReverseChequebookTabClose());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestReverseChequebookTabClose());
	}

	@And("click on reverse chequebook screen")
	public void click_on_reverse_chequebook_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequestApproveReverseFeature());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookRequestApproveReverseFeature());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookRequestApproveReverseFeature());

	}

	@And("search for the request nbumber of chequebook in reverse chequebook screen")
	public void search_for_the_request_nbumber_of_chequebook_in_reverse_chequebook_screen() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().click();
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(chequeBookRequestTestData.get("Request Number"));
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@And("select the record in reverse cheque book record")
	public void select_the_record_in_reverse_cheque_book_record() throws Throwable {

		String xpath = "//td[contains(text(),'" + chequeBookRequestTestData.get("Request Number") + "')]";
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

	@And("click on reverse button in reverse cehquebook feature")
	public void click_on_reverse_button_in_reverse_cehquebook_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.reverseReverseButton());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.reverseReverseButton());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.reverseReverseButton());

	}

	@And("click on ok button in reverse confirmation pop up")
	public void click_on_ok_button_in_reverse_confirmation_pop_up() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeReversedConfirmationOkButton());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeReversedConfirmationOkButton());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeReversedConfirmationOkButton());
		for (int i = 0; i <= 600; i++) {
			try {

				if (chequeBookRequestObj.chequeBookRequestChequeCodeDescription().getAttribute("prevvalue").isBlank()) {
					break;
				} else if (i == 600) {
					Assert.fail("Data not geting populated");
				}
			} catch (Exception e) {

			}
		}
	}
}
