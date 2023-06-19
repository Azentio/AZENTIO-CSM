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
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_ChargeCodeObj;
import resources.BaseClass;

public class CSMPAram_ChargesSteps extends BaseClass {

	WebDriver driver = BaseClass.driver;
	CSMCommonWebElements commonWebElements = new CSMCommonWebElements(driver);
	CSMParam_ChargeCodeObj csmParamChargeCodeObj = new CSMParam_ChargeCodeObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	String csmParampath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	Map<String, String> chargeWaiverExecutionData = new HashMap<>();
	Map<String, String> chargeCodeTestData = new HashMap<>();
	ExcelData excelDataFOrChangeWaiverExecution = new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	ExcelData excelDataChargeTestData = new ExcelData(csmParampath, "ChargeCodeTestData", "DataSet ID");
	Robot robot;

	@And("get the test data for test case ID CW_041_01")
	public void get_the_test_data_for_test_case_id_CW_041_01() {
		// CW_041_01
		chargeWaiverExecutionData = excelDataFOrChangeWaiverExecution.getTestdata("CW_041_01");
		System.out.println("Data Set ID " + chargeWaiverExecutionData.get("Data Set ID"));
		chargeCodeTestData = excelDataChargeTestData.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}
	@And("get the test data for test case ID CW_040_01")
	public void get_the_test_data_for_test_case_id_CW_040_01() {
		// CW_041_01
		chargeWaiverExecutionData = excelDataFOrChangeWaiverExecution.getTestdata("CW_040_01");
		System.out.println("Data Set ID " + chargeWaiverExecutionData.get("Data Set ID"));
		chargeCodeTestData = excelDataChargeTestData.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}
	@And("get the test data for test case ID CW_039_01")
	public void get_the_test_data_for_test_case_id_CW_039_01() {
		// CW_041_01
		chargeWaiverExecutionData = excelDataFOrChangeWaiverExecution.getTestdata("CW_039_01");
		System.out.println("Data Set ID " + chargeWaiverExecutionData.get("Data Set ID"));
		chargeCodeTestData = excelDataChargeTestData.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}
	@And("get the test data for test case ID CW_038_01")
	public void get_the_test_data_for_test_case_id_CW_038_01() {
		// CW_041_01
		chargeWaiverExecutionData = excelDataFOrChangeWaiverExecution.getTestdata("CW_038_01");
		System.out.println("Data Set ID " + chargeWaiverExecutionData.get("Data Set ID"));
		chargeCodeTestData = excelDataChargeTestData.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("user 076 click on charges featre")
	public void user_click_on_charges_featre() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, csmParamChargeCodeObj.csmParamChargesFeature());
		clicksAndActionsHelper.moveToElement(csmParamChargeCodeObj.csmParamChargesFeature());
		clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.csmParamChargesFeature());

	}

	@And("user 076 click on maintenance of charges feature")
	public void user_click_on_maintenance_of_charges_feature() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, csmParamChargeCodeObj.chargesMaintenanceOfChargesFeature());
		clicksAndActionsHelper.moveToElement(csmParamChargeCodeObj.chargesMaintenanceOfChargesFeature());
		clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargesMaintenanceOfChargesFeature());
	}

	@And("user 076 click on update after approve feature in maintenance of charges feature")
	public void user_click_on_update_after_approve_feature_in_maintenance_of_charges_feature() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				csmParamChargeCodeObj.maintenanceOfChargesUpdateAfterApproveScreen());
		clicksAndActionsHelper.moveToElement(csmParamChargeCodeObj.maintenanceOfChargesUpdateAfterApproveScreen());
		clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.maintenanceOfChargesUpdateAfterApproveScreen());
	}

	@And("user 076 search for teh charge code in update after approve screen")
	public void user_search_for_teh_charge_code_in_update_after_approve_screen() throws IOException, AWTException {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver,
				csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch());
		clicksAndActionsHelper.moveToElement(csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch());
		clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch());

		csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch()
				.sendKeys(chargeCodeTestData.get("Charge Code"));
		csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("user 076 uncheck the flag alow user to modify and clear falg under update after approve screen")
	public void user_uncheck_the_flag_alow_user_to_modify_and_clear_falg_under_update_after_approve_screen()
			throws IOException {
		// initialvalue="checked"
		waitHelper.waitForElementwithFluentwait(driver,
				csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag());
		if (csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag().getAttribute("initialvalue")
				.equalsIgnoreCase("checked")) {
			clicksAndActionsHelper
					.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag());
		} else {
			clicksAndActionsHelper
					.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag());
			clicksAndActionsHelper
					.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag());
		}
	}

	@And("user 076 check the flag alow user to modify and clear falg under update after approve screen")
	public void user_check_the_flag_alow_user_to_modify_and_clear_falg_under_update_after_approve_screen()
			throws IOException {
		// initialvalue="checked"
		waitHelper.waitForElementwithFluentwait(driver,
				csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag());
		if (csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag().getAttribute("initialvalue")
				.equalsIgnoreCase("checked")) {
			clicksAndActionsHelper
					.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag());
			clicksAndActionsHelper
			.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag());
		} else {
			
			clicksAndActionsHelper
					.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserToModifyAndClearChargeFlag());
		}
	}

	@And("user 076 uncheck the flag allow user to modify flah user update after approve screen")
	public void user_uncheck_the_flag_allow_user_to_modify_flah_user_update_after_approve_screen() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag());
		if (csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag().getAttribute("initialvalue")
				.equalsIgnoreCase("checked")) {
			clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag());
		} else {
			clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag());
			clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag());
		}
	}
	@And("user 076 check the flag allow user to modify flah user update after approve screen")
	public void user_check_the_flag_allow_user_to_modify_flah_user_update_after_approve_screen() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag());
		if (csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag().getAttribute("initialvalue")
				.equalsIgnoreCase("checked")) {
			clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag());
			clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag());
		} else {
			clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargeCodeAllowUserModifyFlag());
		}
	}

	@And("user 076 close the charges update after approve feature")
	public void user_close_the_charges_update_after_approve_feature() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				csmParamChargeCodeObj.csmParamChargeUpdateAfterApproveMaintenanceLabelClose());
		clicksAndActionsHelper
				.moveToElement(csmParamChargeCodeObj.csmParamChargeUpdateAfterApproveMaintenanceLabelClose());
		clicksAndActionsHelper
				.clickOnElement(csmParamChargeCodeObj.csmParamChargeUpdateAfterApproveMaintenanceLabelClose());
		waitHelper.waitForElementwithFluentwait(driver, commonWebElements.csmCommonUpdateScreenQuitOkButtton());
		clicksAndActionsHelper.moveToElement(commonWebElements.csmCommonUpdateScreenQuitOkButtton());
		clicksAndActionsHelper.clickOnElement(commonWebElements.csmCommonUpdateScreenQuitOkButtton());
	}

	@And("click on appprove feature under charges maintenance feature")
	public void click_on_appprove_feature_under_charges_maintenance_feature() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, csmParamChargeCodeObj.maintenanceOfChargesApproveScreen());
		clicksAndActionsHelper.moveToElement(csmParamChargeCodeObj.maintenanceOfChargesApproveScreen());
		clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.maintenanceOfChargesApproveScreen());
	}

	@And("search for the charge code charge maintenance approval screen")
	public void search_for_the_charge_code_charge_maintenance_approval_screen() throws IOException, AWTException {
		robot = new Robot();
		
		waitHelper.waitForElementwithFluentwait(driver,
				csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch());
		clicksAndActionsHelper.moveToElement(csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch());
		clicksAndActionsHelper.clickOnElement(csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch());

		csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch()
				.sendKeys(chargeCodeTestData.get("Charge Code"));
		csmParamChargeCodeObj.chargeUpdateAfterApprove_ChargeCodeInputSearch().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("click on ok button in approve confirmation")
	public void click_on_ok_button_in_approve_confirmation() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, commonWebElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.moveToElement(commonWebElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.clickOnElement(commonWebElements.csmConfirmApprovOkButton());
	}

	@And("click on ok button in approval success")
	public void click_on_ok_button_in_approval_success() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, commonWebElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(commonWebElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(commonWebElements.csmApproveSuccessOkButton());
	}

	@And("select the charge record in approval screen of charge maintenance")
	public void select_the_charge_record_in_approval_screen_of_charge_maintenance() {
		String xpath = "//tr[2]//td[text()='" + chargeCodeTestData.get("Charge Code") + "']";
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

	@And("user 076 select the charge record in update after approve screen")
	public void user_select_the_charge_record_in_update_after_approve_screen() {
		String xpath = "//tr[2]//td[text()='" + chargeCodeTestData.get("Charge Code") + "']";
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

}
