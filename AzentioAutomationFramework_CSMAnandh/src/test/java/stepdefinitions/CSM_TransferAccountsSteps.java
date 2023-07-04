package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csm.CSM_TransferAccountsObj;
import resources.BaseClass;

public class CSM_TransferAccountsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	DropDownHelper dropdownHelper = new DropDownHelper(driver);
	CSM_TransferAccountsObj transferAccountsObj = new CSM_TransferAccountsObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForTransferAccountExecution = new ExcelData(path, "TransferAccount_Execution", "TestCaseID");
	ExcelData excelTestDataForTransferAccount = new ExcelData(path, "CSM_TransferAccountTestData", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	Map<String, String> transferAccountTestData = new HashMap<>();
	Map<String, String> transferAccountExecutionData = new HashMap<>();

	@And("get the test data for test case ID TA_011")
	public void get_the_test_data_for_test_case_id_ta_011() throws Throwable {
		transferAccountExecutionData = excelDataForTransferAccountExecution.getTestdata("TA_011");
		transferAccountTestData = excelTestDataForTransferAccount
				.getTestdata(transferAccountExecutionData.get("DataSet ID"));
	}

	@And("get the test data for test case ID TA_012")
	public void get_the_test_data_for_test_case_id_ta_012() throws Throwable {
		transferAccountExecutionData = excelDataForTransferAccountExecution.getTestdata("TA_012");
		transferAccountTestData = excelTestDataForTransferAccount
				.getTestdata(transferAccountExecutionData.get("DataSet ID"));
	}

	@And("get the test data for test case ID TA_013")
	public void get_the_test_data_for_test_case_id_ta_013() throws Throwable {
		transferAccountExecutionData = excelDataForTransferAccountExecution.getTestdata("TA_013");
		transferAccountTestData = excelTestDataForTransferAccount
				.getTestdata(transferAccountExecutionData.get("DataSet ID"));
	}

	@And("get the test data for test case ID TA_014")
	public void get_the_test_data_for_test_case_id_ta_014() throws Throwable {
		transferAccountExecutionData = excelDataForTransferAccountExecution.getTestdata("TA_014");
		transferAccountTestData = excelTestDataForTransferAccount
				.getTestdata(transferAccountExecutionData.get("DataSet ID"));
	}

	@And("get the test data for test case ID TA_015")
	public void get_the_test_data_for_test_case_id_ta_015() throws Throwable {
		transferAccountExecutionData = excelDataForTransferAccountExecution.getTestdata("TA_015");
		transferAccountTestData = excelTestDataForTransferAccount
				.getTestdata(transferAccountExecutionData.get("DataSet ID"));
	}

	@And("click on transfer accounts feature")
	public void click_on_transfer_accounts_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.csmTransferAccountsMainFeature());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.csmTransferAccountsMainFeature());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.csmTransferAccountsMainFeature());
	}

	@And("click on maintenance screen under transfer accounts feature")
	public void click_on_maintenance_screen_under_transfer_accounts_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsMaintenanceFeature());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsMaintenanceFeature());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsMaintenanceFeature());
	}

	@And("select the transfer type as from branch to branch option")
	public void select_the_transfer_type_as_from_branch_to_branch_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsTranferAccountsDropdown());
		dropdownHelper.SelectUsingVisibleText(transferAccountsObj.transferAccountsTranferAccountsDropdown(),
				transferAccountTestData.get("transfer_type"));

	}

	@And("enter the branch code in from account of transfer account")
	public void enter_the_branch_code_in_from_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsFromAccountBranchCode());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsFromAccountBranchCode());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsFromAccountBranchCode());
		transferAccountsObj.transferAccountsFromAccountBranchCode()
				.sendKeys(transferAccountTestData.get("from_account_branch_code"));
		transferAccountsObj.transferAccountsFromAccountBranchCode().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsFromAccountBranchCode().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the currency code in from account of transfer account")
	public void enter_the_currency_code_in_from_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsFromAccountCurrencyCode());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsFromAccountCurrencyCode());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsFromAccountCurrencyCode());
		transferAccountsObj.transferAccountsFromAccountCurrencyCode()
				.sendKeys(transferAccountTestData.get("from_account_currency_code"));
		transferAccountsObj.transferAccountsFromAccountCurrencyCode().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsFromAccountCurrencyCode().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the gl code in from account of transfer account")
	public void enter_the_gl_code_in_from_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsFromAccountGlCode());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsFromAccountGlCode());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsFromAccountGlCode());
		transferAccountsObj.transferAccountsFromAccountGlCode()
				.sendKeys(transferAccountTestData.get("from_account_gl_code"));
		transferAccountsObj.transferAccountsFromAccountGlCode().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsFromAccountGlCode().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the CIF number in from account of transfer account")
	public void enter_the_cif_number_in_from_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsFromAccountCIFCode());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsFromAccountCIFCode());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsFromAccountCIFCode());
		transferAccountsObj.transferAccountsFromAccountCIFCode()
				.sendKeys(transferAccountTestData.get("from_account_cif_code"));
		transferAccountsObj.transferAccountsFromAccountCIFCode().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsFromAccountCIFCode().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the serial number in from account of transfer account")
	public void enter_the_serial_number_in_from_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsFromAccountSerialNumber());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsFromAccountSerialNumber());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsFromAccountSerialNumber());
		transferAccountsObj.transferAccountsFromAccountSerialNumber()
				.sendKeys(transferAccountTestData.get("from_account_serial_number"));
		transferAccountsObj.transferAccountsFromAccountSerialNumber().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsFromAccountSerialNumber().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the branch code in to account of transfer account")
	public void enter_the_branch_code_in_to_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsToAccountBranchCode());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsToAccountBranchCode());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsToAccountBranchCode());
		transferAccountsObj.transferAccountsToAccountBranchCode()
				.sendKeys(transferAccountTestData.get("to_account_branch_code"));

		transferAccountsObj.transferAccountsToAccountBranchCode().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsToAccountBranchCode().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the currency code in to account of transfer account")
	public void enter_the_currency_code_in_to_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsToAccountCurrencyCode());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsToAccountCurrencyCode());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsToAccountCurrencyCode());
		transferAccountsObj.transferAccountsToAccountCurrencyCode()
				.sendKeys(transferAccountTestData.get("to_account_currency_code"));
		transferAccountsObj.transferAccountsToAccountCurrencyCode().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsToAccountCurrencyCode().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the gl code in to account of transfer account")
	public void enter_the_gl_code_in_to_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsToAccountGlCode());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsToAccountGlCode());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsToAccountGlCode());
		transferAccountsObj.transferAccountsToAccountGlCode()
				.sendKeys(transferAccountTestData.get("to_account_gl_code"));
		transferAccountsObj.transferAccountsToAccountGlCode().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsToAccountGlCode().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the CIF number in to account of transfer account")
	public void enter_the_cif_number_in_to_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsToAccountCIFCode());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsToAccountCIFCode());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsToAccountCIFCode());
		transferAccountsObj.transferAccountsToAccountCIFCode()
				.sendKeys(transferAccountTestData.get("to_account_cif_code"));
		transferAccountsObj.transferAccountsToAccountCIFCode().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsToAccountCIFCode().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the serial number in to account of transfer account")
	public void enter_the_serial_number_in_to_account_of_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsToAccountSerialNumber());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsToAccountSerialNumber());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsToAccountSerialNumber());
		transferAccountsObj.transferAccountsToAccountSerialNumber()
				.sendKeys(transferAccountTestData.get("to_account_serial_number"));
		transferAccountsObj.transferAccountsToAccountSerialNumber().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsToAccountSerialNumber().getAttribute("prevvalue")
						.isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the reason for transfering record")
	public void enter_the_reason_for_transfering_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsReasonCodeInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsReasonCodeInput());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsReasonCodeInput());
		transferAccountsObj.transferAccountsReasonCodeInput().sendKeys(transferAccountTestData.get("reason"));
		transferAccountsObj.transferAccountsReasonCodeInput().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsReasonCodeInput().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("enter the destination branch in transfer account")
	public void enter_the_destination_branch_in_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsDestinationInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsDestinationInput());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsDestinationInput());
		transferAccountsObj.transferAccountsDestinationInput()
				.sendKeys(transferAccountTestData.get("destination_branch"));
		transferAccountsObj.transferAccountsDestinationInput().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsDestinationInput().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("click on set exception in transfer account")
	public void click_on_set_exception_in_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsSetExceptionButton());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsSetExceptionButton());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsSetExceptionButton());

	}

	@And("click on add button in set exception pop up")
	public void click_on_add_button_in_set_exception_pop_up() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCommonGridAddButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmCommonGridAddButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmCommonGridAddButton());
	}

	@And("select the exception type as cif type")
	public void select_the_exception_type_as_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		dropdownHelper.SelectUsingVisibleText(transferAccountsObj.transferAccountsExceptionFactorDropdown(),
				transferAccountTestData.get("exception_type"));
	}

	@And("enter the cif type in set exception input")
	public void enter_the_cif_type_in_set_exception_input() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsCriteriaValueInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsCriteriaValueInput());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsCriteriaValueInput());
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(transferAccountTestData.get("cif_type_one"));
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsCriteriaValueInput().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("select the exception type as cif type in second grid")
	public void select_the_exception_type_as_cif_type_in_second_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		clicksAndActionsHelper
				.clickOnElement(transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		dropdownHelper.SelectUsingVisibleText(transferAccountsObj.transferAccountsExceptionFactorDropdown(),
				transferAccountTestData.get("exception_type"));
	}

	@And("enter the cif type in set exception input in second grid")
	public void enter_the_cif_type_in_set_exception_input_in_second_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsCriteriaValueInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsCriteriaValueInput());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsCriteriaValueInput());
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(transferAccountTestData.get("cif_type_two"));
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsCriteriaValueInput().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("select the exception type as legal status")
	public void select_the_exception_type_as_legal_status() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		dropdownHelper.SelectUsingVisibleText(transferAccountsObj.transferAccountsExceptionFactorDropdown(),
				transferAccountTestData.get("exception_type"));
	}

	@And("enter the legal status in set exception input")
	public void enter_the_legal_status_in_set_exception_input() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsCriteriaValueInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsCriteriaValueInput());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsCriteriaValueInput());
		transferAccountsObj.transferAccountsCriteriaValueInput()
				.sendKeys(transferAccountTestData.get("legal_status_one"));
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsCriteriaValueInput().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("select the exception type as legal status in second grid")
	public void select_the_exception_type_as_legal_status_in_second_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		clicksAndActionsHelper
				.clickOnElement(transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		dropdownHelper.SelectUsingVisibleText(transferAccountsObj.transferAccountsExceptionFactorDropdown(),
				transferAccountTestData.get("exception_type"));
	}

	@And("enter the legal status in set exception input in second grid")
	public void enter_the_legal_status_in_set_exception_input_in_second_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsCriteriaValueInput());
		transferAccountsObj.transferAccountsCriteriaValueInput()
				.sendKeys(transferAccountTestData.get("legal_status_two"));
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsCriteriaValueInput().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("select the exception type as ranking in first grid")
	public void select_the_exception_type_as_ranking_in_first_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsBlankExceptionfactorFirstGridInput());
		dropdownHelper.SelectUsingVisibleText(transferAccountsObj.transferAccountsExceptionFactorDropdown(),
				transferAccountTestData.get("exception_type"));
	}

	@And("enter the exception value in first grid")
	public void enter_the_exception_value_in_first_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsCriteriaValueInput());
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(transferAccountTestData.get("ranking_one"));
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsCriteriaValueInput().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("select the exception type as ranking in second grid")
	public void select_the_exception_type_as_ranking_in_second_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		clicksAndActionsHelper
				.clickOnElement(transferAccountsObj.transferAccountsBlankExceptionfactorSecondGridInput());
		dropdownHelper.SelectUsingVisibleText(transferAccountsObj.transferAccountsExceptionFactorDropdown(),
				transferAccountTestData.get("exception_type"));
	}

	@And("enter the exception value in second grid")
	public void enter_the_exception_value_in_second_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsCriteriaValueInput());
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(transferAccountTestData.get("ranking_two"));
		transferAccountsObj.transferAccountsCriteriaValueInput().sendKeys(Keys.TAB);
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transferAccountsObj.transferAccountsCriteriaValueInput().getAttribute("prevvalue").isBlank())) {
					break;
				}

				else if (i == 300) {
					Assert.fail("Data not yet populated");
				}
			} catch (Exception e) {

			}
		}
	}

	@And("click on ok button in set exception pop up")
	public void click_on_ok_button_in_set_exception_pop_up() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsExceptionOkButton());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsExceptionOkButton());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsExceptionOkButton());
	}

	@And("click on retrive buttton")
	public void click_on_retrive_buttton() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transferAccountsObj.transferAccountsRetriveButton());
		clicksAndActionsHelper.moveToElement(transferAccountsObj.transferAccountsRetriveButton());
		clicksAndActionsHelper.clickOnElement(transferAccountsObj.transferAccountsRetriveButton());
	}

	@Then("verify system should not show the cif related account which we done the exception")
	public void verify_system_should_not_show_the_cif_related_account_which_we_done_the_exception() throws Throwable {
		String validationXpathOne = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_one")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_one") + "')])[1]";
		String validationXpathTwo = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_two")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_two") + "')])[1]";
		String validationXpathThree = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_three")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_three") + "')])[1]";
		String validationXpathFour = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_four")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_four") + "')])[1]";

		boolean status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathOne)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathFour)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status, "Account is not visible");
		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathTwo)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status, "Account is visible");
		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathThree)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					status = true;
				}
			}
			Assert.assertTrue(status, "Account is visible");
		}

	}

	@Then("verify system should not show the legal status related account which we done the exception other accounts should display")
	public void verify_system_should_not_show_the_legal_status_related_account_which_we_done_the_exception_other_accounts_should_display()
			throws Throwable {
		String validationXpathOne = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_one")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_one") + "')])[1]";
		String validationXpathTwo = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_two")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_two") + "')])[1]";
		String validationXpathThree = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_three")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_three") + "')])[1]";
//		String validationXpathFour = "(//td[contains(text(),'"
//				+ transferAccountTestData.get("validation_account_gl_code_four")
//				+ "')]//following-sibling::td[contains(text(),'"
//				+ transferAccountTestData.get("validation_account_cif_code_four") + "')])[1]";

		boolean status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathOne)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status, "Account is not visible");
//		for (int i = 0; i <= 200; i++) {
//			try {
//				status = driver.findElement(By.xpath(validationXpathFour)).isDisplayed();
//				break;
//			} catch (Exception e) {
//				if (i == 200) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}

		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathThree)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status, "Account is not visible");
		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathTwo)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					status = true;
				}
			}
			Assert.assertTrue(status, "Account is visible");
		}

	}

	@Then("verify system should not show the legal status related account which we done the exception other accounts should display for multiple legal status")
	public void verify_system_should_not_show_the_legal_status_related_account_which_we_done_the_exception_other_accounts_should_display_for_multiple_legal_status()
			throws Throwable {
		String validationXpathOne = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_one")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_one") + "')])[1]";
		String validationXpathTwo = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_two")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_two") + "')])[1]";
		String validationXpathThree = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_three")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_three") + "')])[1]";

		boolean status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathOne)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status, "Account is not visible");
		status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath(validationXpathThree)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status, "Account is visible");
		status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				System.out.println("Xpath " + validationXpathTwo);
				status = driver.findElement(By.xpath(validationXpathTwo)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status, "Account is visible");
	}

	@Then("verify should not show the accounts for the multiple ranking exception account and should show the account which is not included in the exception")
	public void verify_should_not_show_the_accounts_for_the_multiple_ranking_exception_account_and_should_show_the_account_which_is_not_included_in_the_exception()
			throws Throwable {
		String validationXpathOne = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_one")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_one") + "')])[1]";
		String validationXpathTwo = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_two")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_two") + "')])[1]";
		String validationXpathThree = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_three")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_three") + "')])[1]";

		boolean status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathOne)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status, "Account is not visible");
		status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath(validationXpathThree)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status, "Account is visible");
		status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				System.out.println("Xpath " + validationXpathTwo);
				status = driver.findElement(By.xpath(validationXpathTwo)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status, "Account is visible");
	}

	@Then("verify should not show the accounts for the single ranking exception account and should show the account which is not included in the exception")
	public void verify_should_not_show_the_accounts_for_the_single_ranking_exception_account_and_should_show_the_account_which_is_not_included_in_the_exception()
			throws Throwable {
		String validationXpathOne = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_one")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_one") + "')])[1]";
		String validationXpathTwo = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_two")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_two") + "')])[1]";
		String validationXpathThree = "(//td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_gl_code_three")
				+ "')]//following-sibling::td[contains(text(),'"
				+ transferAccountTestData.get("validation_account_cif_code_three") + "')])[1]";

		boolean status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				status = driver.findElement(By.xpath(validationXpathOne)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status, "Account is not visible");
		status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				status=driver.findElement(By.xpath(validationXpathThree)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status, "Account not is visible");
		status = false;
		for (int i = 0; i <= 200; i++) {
			try {
				System.out.println("Xpath " + validationXpathTwo);
				status = driver.findElement(By.xpath(validationXpathTwo)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 200) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status, "Account is visible");
	}
}
