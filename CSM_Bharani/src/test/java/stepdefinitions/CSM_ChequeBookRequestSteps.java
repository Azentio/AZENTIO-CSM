package stepdefinitions;


import java.util.HashMap;
import java.util.Map;

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
	ExcelData excelDataForChargeWaiverExecution= new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	@And("^get the test data for CW_002$")
	public void get_the_test_data_for_cw002() throws Throwable {
		chargeWaiverExecutionData=excelDataForChargeWaiverExecution.getTestdata("CW_002");
		chequeBookRequestTestData = excelDataForChequeBookRequest.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
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

}
