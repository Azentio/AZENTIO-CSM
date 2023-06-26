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
import pageobjects.csm.CSM_CertificateObj;
import resources.BaseClass;

public class CSM_CertificateSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSM_CertificateObj certificateObj = new CSM_CertificateObj(driver);
	CSMCommonWebElements csCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	Robot robot;
	// ChargeWaiverExecutionTracker
	ExcelData excelDataForChargeWaiverExecutionTracker = new ExcelData(testDataPath, "ChargeWaiverExecutionTracker",
			"TestCaseID");
	ExcelData certificateChargeWaierTestData = new ExcelData(testDataPath, "CSM_ChargeWaiverTestData", "DataSet ID");

	Map<String, String> chargeWaiverExecutionTracker = new HashMap<>();
	Map<String, String> cwCertificateTestData = new HashMap<>();

	@And("^click on certificate feature$")
	public void click_on_certificate_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(certificateObj.csmCertificateFeature());
				clicksAndActionsHelper.moveToElement(certificateObj.csmCertificateFeature());
				clicksAndActionsHelper.clickOnElement(certificateObj.csmCertificateFeature());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on maintenance under certifiate$")
	public void click_on_maintenance_under_certifiate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenance());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenance());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenance());
	}

//	@And("^get the test data for test case CW_038$")
//	public void get_the_test_data_for_test_case_cw038() throws Throwable {
//		chargeWaiverExecutionTracker = excelDataForChargeWaiverExecutionTracker.getTestdata("CW_038");
//		System.out.println("Data Set ID " + chargeWaiverExecutionTracker.get("Data Set ID"));
//		cwCertificateTestData = certificateChargeWaierTestData
//				.getTestdata(chargeWaiverExecutionTracker.get("Data Set ID"));
//	}
	@And("^get the test data for test case CW_039$")
	public void get_the_test_data_for_test_case_cw039() throws Throwable {
		chargeWaiverExecutionTracker = excelDataForChargeWaiverExecutionTracker.getTestdata("CW_039");
		System.out.println("Data Set ID " + chargeWaiverExecutionTracker.get("Data Set ID"));
		cwCertificateTestData = certificateChargeWaierTestData
				.getTestdata(chargeWaiverExecutionTracker.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_038$")
	public void get_the_test_data_for_test_case_cw038() throws Throwable {
		chargeWaiverExecutionTracker = excelDataForChargeWaiverExecutionTracker.getTestdata("CW_038");
		System.out.println("Data Set ID " + chargeWaiverExecutionTracker.get("Data Set ID"));
		cwCertificateTestData = certificateChargeWaierTestData
				.getTestdata(chargeWaiverExecutionTracker.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_039_03$")
	public void get_the_test_data_for_test_case_cw03903() throws Throwable {
		chargeWaiverExecutionTracker = excelDataForChargeWaiverExecutionTracker.getTestdata("CW_039_03");
		System.out.println("Data Set ID " + chargeWaiverExecutionTracker.get("Data Set ID"));
		cwCertificateTestData = certificateChargeWaierTestData
				.getTestdata(chargeWaiverExecutionTracker.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_038_03$")
	public void get_the_test_data_for_test_case_cw03803() throws Throwable {
		chargeWaiverExecutionTracker = excelDataForChargeWaiverExecutionTracker.getTestdata("CW_038_03");
		System.out.println("Data Set ID " + chargeWaiverExecutionTracker.get("Data Set ID"));
		cwCertificateTestData = certificateChargeWaierTestData
				.getTestdata(chargeWaiverExecutionTracker.get("Data Set ID"));
	}

	@And("^enter the certificate type in certificate feature$")
	public void enter_the_certificate_type_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceCertificateTypeInput());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceCertificateTypeInput());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceCertificateTypeInput());
		certificateObj.certificateMaintenanceCertificateTypeInput()
				.sendKeys(cwCertificateTestData.get("Certificate Type"));
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceLabel());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(certificateObj.certificateMaintenanceCertificateTypeDescription().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("^enter the CIF number in certificate feature$")
	public void enter_the_cif_number_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceCIFNumberInput());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceCIFNumberInput());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceCIFNumberInput());
		certificateObj.certificateMaintenanceCIFNumberInput().sendKeys(cwCertificateTestData.get("CIF Number"));
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceLabel());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(certificateObj.certificateMaintenanceCIFNumberDescription().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("^enter the number of bills in certificate feature$")
	public void enter_the_number_of_bills_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceNumberOfBillsInput());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceNumberOfBillsInput());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceNumberOfBillsInput());
		certificateObj.certificateMaintenanceNumberOfBillsInput()
				.sendKeys(cwCertificateTestData.get("Number Of Bills"));
	}

	@And("^enter the total number of bills in certificate feature$")
	public void enter_the_total_number_of_bills_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceTotalAmountOfBillsInput());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceTotalAmountOfBillsInput());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceTotalAmountOfBillsInput());
		certificateObj.certificateMaintenanceTotalAmountOfBillsInput()
				.sendKeys(cwCertificateTestData.get("Total Amount Of Bills"));
	}

	@And("^select the active credit account$")
	public void select_the_active_credit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateCreditAccount());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateCreditAccount());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateCreditAccount());
	}

	@And("^select the active debit account$")
	public void select_the_active_debit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateDeductFromAccount());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateDeductFromAccount());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateDeductFromAccount());
	}

	@And("^click on save button in certificate feature$")
	public void click_on_save_button_in_certificate_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csCommonWebElements.csmSaveBtn());
		clicksAndActionsHelper.moveToElement(csCommonWebElements.csmSaveBtn());
		clicksAndActionsHelper.clickOnElement(csCommonWebElements.csmSaveBtn());
		for (int i = 0; i <= 500; i++) {
			try {
				if (certificateObj.certificateMaintenanceCertificateTypeDescription().getAttribute("prevvalue")
						.isBlank()) {
					break;

				}
			} catch (Exception e) {

			}

		}
	}

	@And("^close the certificate maintenance screen$")
	public void close_the_certificate_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceLabelClose());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceLabelClose());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceLabelClose());
//		waitHelper.waitForElementwithFluentwait(driver, csCommonWebElements.csmQuitOkButton());
//		clicksAndActionsHelper.moveToElement(csCommonWebElements.csmQuitOkButton());
//		clicksAndActionsHelper.clickOnElement(csCommonWebElements.csmQuitOkButton());
	}
	@And("^click on approve feature under certificate$")
	public void click_on_approve_feature_under_certificate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateApproveFeature());
		certificateObj.certificateApproveFeature().click();
	}

	@And("^search for CIF number to retrive the certificate record in approve stage$")
	public void search_for_cif_number_to_retrive_the_certificate_record_in_approve_stage() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateApproveCIFNumberInput());
		certificateObj.certificateApproveCIFNumberInput().click();
		certificateObj.certificateApproveCIFNumberInput().sendKeys(cwCertificateTestData.get("CIF Number"));
		certificateObj.certificateApproveCIFNumberInput().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	@And("^select the suggested record from certificate approve screen$")
	public void select_the_suggested_record_from_certificate_approve_screen() throws Throwable {
		String xpath = "(//td[contains(text(),'" + cwCertificateTestData.get("CIF Number") + "')])[1]";

		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on charges section in certificate approve$")
	public void click_on_charges_section_in_certificate_approve() throws Throwable {
	}

	@Then("^verify waive charge button should be disabled status$")
	public void verify_waive_charge_button_should_be_disabled_status() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceWaiveChargesButton());
		String waiveChargesStatus = certificateObj.certificateMaintenanceWaiveChargesButton()
				.getAttribute("aria-disabled");
		Assert.assertEquals(waiveChargesStatus, "True");

	}

	@Then("^verify user can not able to waive the charges for the certificate$")
	public void verify_user_can_not_able_to_waive_the_charges_for_the_certificate() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceWaiveChargesButton());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceWaiveChargesButton());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceWaiveChargesButton());
		waitHelper.waitForElementwithFluentwait(driver,
				certificateObj.certificateMaintenancecanNotClearChargesOkButton());
		Assert.assertTrue(certificateObj.certificateMaintenancecanNotClearChargesOkButton().isDisplayed());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenancecanNotClearChargesOkButton());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenancecanNotClearChargesOkButton());

	}

	@Then("^verify user can able to waive the charges for the certificate$")
	public void verify_user_can_able_to_waive_the_charges_for_the_certificate() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateMaintenanceWaiveChargesButton());
		clicksAndActionsHelper.moveToElement(certificateObj.certificateMaintenanceWaiveChargesButton());
		clicksAndActionsHelper.clickOnElement(certificateObj.certificateMaintenanceWaiveChargesButton());
		waitHelper.waitForElementwithFluentwait(driver, certificateObj.certificateApproveZeroChargeValidation());
		certificateObj.certificateApproveZeroChargeValidation().getText();
		for (int i = 0; i <= 1500; i++) {
			try {
				if (certificateObj.certificateApproveZeroChargeValidation().getText().equals(".00")) {
					status = true;
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		Assert.assertTrue(status);

	}

	@And("^click on approve button in certificate approve stage$")
	public void click_on_approve_button_in_certificate_approve_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csCommonWebElements.csmApproveBtnWithLabel());
		clicksAndActionsHelper.moveToElement(csCommonWebElements.csmApproveBtnWithLabel());
		clicksAndActionsHelper.clickOnElement(csCommonWebElements.csmApproveBtnWithLabel());
	}

}
