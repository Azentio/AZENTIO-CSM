package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_LostAndFoundManagementObj;
import resources.BaseClass;

public class CSM_LostAndFoundManagementSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	CSM_LostAndFoundManagementObj lostAndFoundManagementObj = new CSM_LostAndFoundManagementObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	String excelPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForLostAndFoundManagement = new ExcelData(excelPath, "CSM_LostAndFoundManagement", "DataSet ID");
	Map<String, String> lostAndFoundManagementTestData = new HashMap<>();

	@And("^click on lost and found management module$")
	public void click_on_lost_and_found_management_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, lostAndFoundManagementObj.csmLostAndFoundManagementModule());
		clicksAndActionsHelper.moveToElement(lostAndFoundManagementObj.csmLostAndFoundManagementModule());
		clicksAndActionsHelper.clickOnElement(lostAndFoundManagementObj.csmLostAndFoundManagementModule());
	}

	@And("^click on maintenance button under lost and found managemennt module$")
	public void click_on_maintenance_button_under_lost_and_found_managemennt_module() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(lostAndFoundManagementObj.lostAndFoundManagementMaintenance());
				clicksAndActionsHelper.moveToElement(lostAndFoundManagementObj.lostAndFoundManagementMaintenance());
				clicksAndActionsHelper.clickOnElement(lostAndFoundManagementObj.lostAndFoundManagementMaintenance());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify lost and found manageent screen got opened$")
	public void verify_lost_and_found_manageent_screen_got_opened() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				lostAndFoundManagementObj.lostAndFoundManagementScreenOpeningValidation());
		Assert.assertTrue(lostAndFoundManagementObj.lostAndFoundManagementScreenOpeningValidation().isDisplayed());
	}

	@And("^get the test data for or restriction of CIF type X and Gl Z in lost and found management screen$")
	public void get_the_test_data_for_or_restriction_of_cif_type_x_and_gl_z_in_lost_and_found_management_screen()
			throws Throwable {
		lostAndFoundManagementTestData = excelDataForLostAndFoundManagement.getTestdata("DS1_SADS_AT_060");
	}

	@And("^get the test data for or restriction of CIF type A and Gl Y in lost and found management screen$")
	public void get_the_test_data_for_or_restriction_of_cif_type_a_and_gl_y_in_lost_and_found_management_screen()
			throws Throwable {
		lostAndFoundManagementTestData = excelDataForLostAndFoundManagement.getTestdata("DS1_SADS_AT_061");
	}
	@And("^get the test data for or restriction of CIF type X and Gl Y in lost and found management screen$")
    public void get_the_test_data_for_or_restriction_of_cif_type_x_and_gl_y_in_lost_and_found_management_screen() throws Throwable {
		lostAndFoundManagementTestData = excelDataForLostAndFoundManagement.getTestdata("DS1_SADS_AT_062");
    }

	@And("^get the test data for and restriction of CIF type X and Gl z in lost and found management screen$")
	public void get_the_test_data_for_and_restriction_of_cif_type_x_and_gl_z_in_lost_and_found_management_screen()
			throws Throwable {
		lostAndFoundManagementTestData = excelDataForLostAndFoundManagement.getTestdata("DS1_SADS_AT_063");
	}
	@And("^get the test data for and restriction of CIF type A and Gl Y in lost and found management screen$")
    public void get_the_test_data_for_and_restriction_of_cif_type_a_and_gl_y_in_lost_and_found_management_screen() throws Throwable {
		lostAndFoundManagementTestData = excelDataForLostAndFoundManagement.getTestdata("DS1_SADS_AT_064");
    }
	@And("^get the test data for and restriction of CIF type X and Gl Y in lost and found management screen$")
    public void get_the_test_data_for_and_restriction_of_cif_type_x_and_gl_y_in_lost_and_found_management_screen() throws Throwable {
		lostAndFoundManagementTestData = excelDataForLostAndFoundManagement.getTestdata("DS1_SADS_AT_065");
    }
	@And("^enter the branch code in lost and found management screen$")
	public void enter_the_branch_code_in_lost_and_found_management_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, lostAndFoundManagementObj.lostAndFoundManagementBranchCode());
		clicksAndActionsHelper.moveToElement(lostAndFoundManagementObj.lostAndFoundManagementBranchCode());
		clicksAndActionsHelper.clickOnElement(lostAndFoundManagementObj.lostAndFoundManagementBranchCode());
		lostAndFoundManagementObj.lostAndFoundManagementBranchCode()
				.sendKeys(lostAndFoundManagementTestData.get("BranchCode"));
	}

	@And("^enter the currency code in lost and found management screen$")
	public void enter_the_currency_code_in_lost_and_found_management_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, lostAndFoundManagementObj.lostAndFoundManagementCurrencyCode());
		clicksAndActionsHelper.moveToElement(lostAndFoundManagementObj.lostAndFoundManagementCurrencyCode());
		clicksAndActionsHelper.clickOnElement(lostAndFoundManagementObj.lostAndFoundManagementCurrencyCode());
		lostAndFoundManagementObj.lostAndFoundManagementCurrencyCode()
				.sendKeys(lostAndFoundManagementTestData.get("CurrencyCode"));
	}

	@And("^enter the gl code in lost and found management screen$")
	public void enter_the_gl_code_in_lost_and_found_management_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, lostAndFoundManagementObj.lostAndFoundManagementGlCode());
		clicksAndActionsHelper.moveToElement(lostAndFoundManagementObj.lostAndFoundManagementGlCode());
		clicksAndActionsHelper.clickOnElement(lostAndFoundManagementObj.lostAndFoundManagementGlCode());
		lostAndFoundManagementObj.lostAndFoundManagementGlCode().sendKeys("569742");
	}

	@And("^enter the CIF number in lost and found management screen$")
	public void enter_the_cif_number_in_lost_and_found_management_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, lostAndFoundManagementObj.lostAndFoundManagementCIFNumber());
		clicksAndActionsHelper.moveToElement(lostAndFoundManagementObj.lostAndFoundManagementCIFNumber());
		clicksAndActionsHelper.clickOnElement(lostAndFoundManagementObj.lostAndFoundManagementCIFNumber());
		lostAndFoundManagementObj.lostAndFoundManagementCIFNumber()
				.sendKeys(lostAndFoundManagementTestData.get("CIFCode"));
	}

	@And("^enter the serial number in lost and found management screen$")
	public void enter_the_serial_number_in_lost_and_found_management_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, lostAndFoundManagementObj.lostAndFoundManagementSerialNumber());
		clicksAndActionsHelper.moveToElement(lostAndFoundManagementObj.lostAndFoundManagementSerialNumber());
		clicksAndActionsHelper.clickOnElement(lostAndFoundManagementObj.lostAndFoundManagementSerialNumber());
		lostAndFoundManagementObj.lostAndFoundManagementSerialNumber()
				.sendKeys(lostAndFoundManagementTestData.get("SerialNumber"));
	}

	@Then("^validate system should not restrict the account in lost and found managemeent screen$")
	public void validate_system_should_not_restrict_the_account_in_lost_and_found_managemeent_screen()
			throws Throwable {

	}

	@Then("^validate system should restrict the account in lost and found managemeent screen$")
	public void validate_system_should_restrict_the_account_in_lost_and_found_managemeent_screen() throws Throwable {

	}
}
