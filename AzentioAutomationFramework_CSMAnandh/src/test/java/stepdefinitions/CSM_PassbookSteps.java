package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import pageobjects.csm.CSM_PassBookObj;
import resources.BaseClass;

public class CSM_PassbookSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	CSM_PassBookObj passbookObj = new CSM_PassBookObj(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForChargeWaiverExecution = new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	ExcelData excelDataForChargeWaiverPassbookTestData = new ExcelData(path, "CSM_ChargeWaiverTestData", "DataSet ID");
	Map<String, String> testDataForChargeWaiver = new HashMap<>();
	Map<String, String> chargeWaiverExecutionTracker = new HashMap<>();
	Robot robot;

	@And("^click on passbook feature$")
	public void click_on_passbook_feature() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(passbookObj.csmPassBookFeature());
				clicksAndActionHelper.moveToElement(passbookObj.csmPassBookFeature());
				clicksAndActionHelper.clickOnElement(passbookObj.csmPassBookFeature());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on mainteance under passbook feature$")
	public void click_on_mainteance_under_passbook_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passBookMaintenanceFeature());
		clicksAndActionHelper.moveToElement(passbookObj.passBookMaintenanceFeature());
		clicksAndActionHelper.clickOnElement(passbookObj.passBookMaintenanceFeature());
	}

	@And("^get the test data for test case CW_040$")
	public void get_the_test_data_for_test_case_cw040() throws Throwable {
		chargeWaiverExecutionTracker = excelDataForChargeWaiverExecution.getTestdata("CW_040");
		testDataForChargeWaiver = excelDataForChargeWaiverPassbookTestData
				.getTestdata(chargeWaiverExecutionTracker.get("Data Set ID"));
	}

	@And("^enter the passbook code$")
	public void enter_the_passbook_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenancePassBookCode());
		clicksAndActionHelper.moveToElement(passbookObj.passbookMaintenancePassBookCode());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookMaintenancePassBookCode());
		passbookObj.passbookMaintenancePassBookCode().sendKeys(testDataForChargeWaiver.get("Passbook Code"));
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceLabel());
		passbookObj.passbookMaintenanceLabel().click();
	}

	@And("^enter the passbook type$")
	public void enter_the_passbook_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenancePassbookType());
		clicksAndActionHelper.moveToElement(passbookObj.passbookMaintenancePassbookType());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookMaintenancePassbookType());
		passbookObj.passbookMaintenancePassbookType().sendKeys(testDataForChargeWaiver.get("Passbook Type"));
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceLabel());
		passbookObj.passbookMaintenanceLabel().click();
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenancePassbookTypeDescription());
		for (int i = 0; i <= 500; i++) {
			try {
				if ((passbookObj.passbookMaintenancePassbookTypeDescription().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}

		}

	}

	@And("^enter the currency code in passbook$")
	public void enter_the_currency_code_in_passbook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceCurrencyCode());
		passbookObj.passbookMaintenanceCurrencyCode().click();
		passbookObj.passbookMaintenanceCurrencyCode().sendKeys(testDataForChargeWaiver.get("Credit Currency Code"));
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceLabel());
		passbookObj.passbookMaintenanceLabel().click();
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceCurrencCodeDescription());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(passbookObj.passbookMaintenanceCurrencCodeDescription().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}

		}

	}

	@And("^enter the gl code in passbook$")
	public void enter_the_gl_code_in_passbook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceGLCode());
		clicksAndActionHelper.moveToElement(passbookObj.passbookMaintenanceGLCode());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookMaintenanceGLCode());
		passbookObj.passbookMaintenanceGLCode().sendKeys(testDataForChargeWaiver.get("Credit Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceGLCodeDescription());
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceLabel());
		passbookObj.passbookMaintenanceLabel().click();
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(passbookObj.passbookMaintenanceGLCodeDescription().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("^enter the cif number in passbook$")
	public void enter_the_cif_number_in_passbook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceCIFNumber());
		clicksAndActionHelper.moveToElement(passbookObj.passbookMaintenanceCIFNumber());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookMaintenanceCIFNumber());
		passbookObj.passbookMaintenanceCIFNumber().sendKeys(testDataForChargeWaiver.get("Credit CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceLabel());
		passbookObj.passbookMaintenanceLabel().click();

	}

	@And("^click on close in memo screen$")
	public void click_on_close_in_memo_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.memoAlertCloseButton());
		clicksAndActionHelper.moveToElement(csmCommonWebElements.memoAlertCloseButton());
		clicksAndActionHelper.clickOnElement(csmCommonWebElements.memoAlertCloseButton());
	}

	@And("^click on ok button in dormant$")
	public void click_on_ok_button_in_dormant() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmOkButton());
	}

	@And("^click on ok button in signature$")
	public void click_on_ok_button_in_signature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmOkButton());
	}

	@And("^enter the serial number in passbook$")
	public void enter_the_serial_number_in_passbook() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMainenanceSerialNumber());
		clicksAndActionHelper.moveToElement(passbookObj.passbookMainenanceSerialNumber());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookMainenanceSerialNumber());
		passbookObj.passbookMainenanceSerialNumber().sendKeys(testDataForChargeWaiver.get("Credit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceLabel());
		passbookObj.passbookMaintenanceLabel().click();
	}

	@And("^click on save button in passbook feature$")
	public void click_on_save_button_in_passbook_feature() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmSaveBtn());
				clicksAndActionHelper.moveToElement(csmCommonWebElements.csmSaveBtn());
				clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmSaveBtn());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify system should deduct the charges by clicking waive charges button$")
	public void verify_system_should_deduct_the_charges_by_clicking_waive_charges_button() throws Throwable {
		Assert.fail("Need to complete the steps for charges");
	}

	@And("^close the passbooks screen$")
	public void close_the_passbooks_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookMaintenanceLabelClose());
		clicksAndActionHelper.moveToElement(passbookObj.passbookMaintenanceLabelClose());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookMaintenanceLabelClose());
	}

	@And("^click on pass book issue feature$")
	public void click_on_pass_book_issue_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookIssuePassbook());
		clicksAndActionHelper.moveToElement(passbookObj.passbookIssuePassbook());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookIssuePassbook());
	}

	@And("^search for passbook code in passbook issue feature$")
	public void search_for_passbook_code_in_passbook_issue_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookSearchPassbookCode());
		clicksAndActionHelper.moveToElement(passbookObj.passbookSearchPassbookCode());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookSearchPassbookCode());
		passbookObj.passbookSearchPassbookCode().sendKeys(testDataForChargeWaiver.get("Passbook Code"));
		robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the record from passbook issue suggestion$")
	public void select_the_record_from_passbook_issue_suggestion() throws Throwable {
		String xpath = "//td[contains(text(),'" + testDataForChargeWaiver.get("Passbook Code") + "')]";
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {

				}
			}
		}
	}

	@And("^click on issue button under passbook issue feature$")
	public void click_on_issue_button_under_passbook_issue_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(passbookObj.passbookIssueButtton());
				clicksAndActionHelper.moveToElement(passbookObj.passbookIssueButtton());
				clicksAndActionHelper.clickOnElement(passbookObj.passbookIssueButtton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^close the passbook issue feature$")
	public void close_the_passbook_issue_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, passbookObj.passbookIssuePassbookLabelClose());
		clicksAndActionHelper.moveToElement(passbookObj.passbookIssuePassbookLabelClose());
		clicksAndActionHelper.clickOnElement(passbookObj.passbookIssuePassbookLabelClose());
	}
}
