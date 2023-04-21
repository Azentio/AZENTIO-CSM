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
import pageobjects.csm.CSM_TransactionObj;
import resources.BaseClass;

public class CSM_TransactionSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	CSM_TransactionObj transactionObj = new CSM_TransactionObj(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForChargeWaiverExecution = new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	ExcelData excelDataForTransWaiver = new ExcelData(path, "CSM_Transaction", "DataSet ID");
	Map<String, String> transactionTestData = new HashMap<>();
	Map<String, String> chargeWaiverExecutionData = new HashMap<>();
	Robot robot;

	@And("^get the test data for test case CW_001$")
	public void get_the_test_data_for_test_case_cw001() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_001");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_003$")
	public void get_the_test_data_for_test_case_cw003() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_003");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_04$")
	public void get_the_test_data_for_test_case_cw04() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_004");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_005$")
	public void get_the_test_data_for_test_case_cw005() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_005");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_006$")
	public void get_the_test_data_for_test_case_cw006() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_006");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));

	}

	@And("^get the test data for test case CW_007$")
	public void get_the_test_data_for_test_case_cw007() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_007");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^change the system date to less waiver date which is configured$")
	public void change_the_system_date_to_less_waiver_date_which_is_configured() throws Throwable {
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
		csmCommonWebElements.csmInputSystemDate().sendKeys(transactionTestData.get("Less Exemption Date"));
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

	@And("^change the system date to high waiver date which is configured$")
	public void change_the_system_date_to_high_waiver_date_which_is_configured() throws Throwable {
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
		csmCommonWebElements.csmInputSystemDate().sendKeys(transactionTestData.get("High Exemption Date"));
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

	@And("^enter the transaction type code in transaction$")
	public void enter_the_transaction_type_code_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionTypeInput());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTransactionTypeInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTransactionTypeInput());
		transactionObj.transactionTransactionTypeInput().sendKeys(transactionTestData.get("Transaction Type code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionTypeInputDescription());
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTransactionTypeInputDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 500) {
				Assert.fail("took more time to populate the date");
			}
		}

	}

	@And("^enter the debit branch code in tranaction$")
	public void enter_the_debit_branch_code_in_tranaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitBranchCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitBranchCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitBranchCode());
		transactionObj.transactionTypeDebitBranchCode().sendKeys(transactionTestData.get("Credit Branch Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the branch code for cash deposite$")
	public void enter_the_branch_code_for_cash_deposite() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitBranchCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitBranchCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitBranchCode());
		transactionObj.transactionTypeDebitBranchCode().sendKeys(transactionTestData.get("Credit Branch Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the currency code for cash deposite$")
	public void enter_the_currency_code_for_cash_deposite() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitCurrencyCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitCurrencyCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitCurrencyCode());
		transactionObj.transactionTypeDebitCurrencyCode().sendKeys(transactionTestData.get("Credit Currency Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the debit currency code in tranaction$")
	public void enter_the_debit_currency_code_in_tranaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitCurrencyCode());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitCurrencyCode());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitCurrencyCode());
				transactionObj.transactionTypeDebitCurrencyCode()
						.sendKeys(transactionTestData.get("Credit Currency Code"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the debit GL code in transaction$")
	public void enter_the_debit_gl_code_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitGlCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitGlCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitGlCode());
		transactionObj.transactionTypeDebitGlCode().sendKeys(transactionTestData.get("Credit Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the gl code for cash deposite$")
	public void enter_the_gl_code_for_cash_deposite() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitGlCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitGlCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitGlCode());
		transactionObj.transactionTypeDebitGlCode().sendKeys(transactionTestData.get("Credit Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the debit CIF code in transaction$")
	public void enter_the_debit_cif_code_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitCIFCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitCIFCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitCIFCode());
		transactionObj.transactionTypeDebitCIFCode().sendKeys(transactionTestData.get("Credit CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the CIF code for cash deposite$")
	public void enter_the_cif_code_for_cash_deposite() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitCIFCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitCIFCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitCIFCode());
		transactionObj.transactionTypeDebitCIFCode().sendKeys(transactionTestData.get("Credit CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the debit serial number in transaction$")
	public void enter_the_debit_serial_number_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitSerialNumber());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitSerialNumber());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitSerialNumber());
		transactionObj.transactionTypeDebitSerialNumber().sendKeys(transactionTestData.get("Credit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 100; i++) {
			try {
				if (!(csmCommonWebElements.csmLoadingImage().isDisplayed())) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^click on ok button of dormant account error in transaction screen$")
	public void click_on_ok_button_of_dormant_account_error_in_transaction_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
	}

	@And("^close the memo alert in transaction screen$")
	public void close_the_memo_alert_in_transaction_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.memoAlertCloseButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.memoAlertCloseButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.memoAlertCloseButton());
	}

	@And("^enter the serial number for cash deposite$")
	public void enter_the_serial_number_for_cash_deposite() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitSerialNumber());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitSerialNumber());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitSerialNumber());
		transactionObj.transactionTypeDebitSerialNumber().sendKeys(transactionTestData.get("Credit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 100; i++) {
			try {
				if (!(csmCommonWebElements.csmLoadingImage().isDisplayed())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the currency code$")
	public void enter_the_currency_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceCurrencyCodeInput());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceCurrencyCodeInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceCurrencyCodeInput());
		transactionObj.transactionMaintenanceCurrencyCodeInput()
				.sendKeys(transactionTestData.get("Input Currency Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(csmCommonWebElements.csmLoadingImage().isDisplayed())) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					System.out.println("Still Loading");
				}

			}
		}
	}

	@And("^enter the credit branch code in transaction$")
	public void enter_the_credit_branch_code_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditBranchCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditBranchCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditBranchCode());
		transactionObj.transactionTypeCreditBranchCode().sendKeys(transactionTestData.get("Debit Branch Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the credit gl code in transaction$")
	public void enter_the_credit_gl_code_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditGlCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditGlCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditGlCode());
		transactionObj.transactionTypeCreditGlCode().sendKeys(transactionTestData.get("Debit Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the credit CIF number in transaction$")
	public void enter_the_credit_cif_number_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditCIFCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditCIFCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditCIFCode());
		transactionObj.transactionTypeCreditCIFCode().sendKeys(transactionTestData.get("Debit CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^enter the credit serial number in transaction$")
	public void enter_the_credit_serial_number_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditSerialNumCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditSerialNumCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditSerialNumCode());
		transactionObj.transactionTypeCreditSerialNumCode().sendKeys(transactionTestData.get("Debit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^click on charge button$")
	public void click_on_charge_button() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionTypeChargesButton());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeChargesButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeChargesButton());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify original charge amount field should get shows with disable status$")
	public void verify_original_charge_amount_field_should_get_shows_with_disable_status() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionTypeOriginalAmount());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(transactionObj.transactionTypeOriginalAmount().isDisplayed());
		try {
			transactionObj.transactionTypeOriginalAmount().sendKeys("Test");
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@And("^enter the amount for deposite in transaction$")
	public void enter_the_amount_for_deposite_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionDepositeAmountInputBox());
		transactionObj.transactionDepositeAmountInputBox().sendKeys(transactionTestData.get("Deposite Amount"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
	}

	@And("^click on save button in transaction$")
	public void click_on_save_button_in_transaction() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmSaveButton());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveButton());
				clicksAndActionsHelper.doubleClick(csmCommonWebElements.csmSaveButton());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(5000);

	}

	@Then("^verify system should show the validation for charge waiver in transaction screen$")
	public void verify_system_should_show_the_validation_for_charge_waiver_in_transaction_screen() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				transactionObj.transaction_WaivedAlertPopupWithOkBtn().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(transactionObj.transaction_WaivedAlertPopupWithOkBtn().isDisplayed());
		clicksAndActionsHelper.moveToElement(transactionObj.transaction_WaivedAlertPopupWithOkBtn());
		clicksAndActionsHelper.clickOnElement(transactionObj.transaction_WaivedAlertPopupWithOkBtn());
	}

	@Then("^verify system should not show the validation for charge waiver$")
	public void verify_system_should_not_show_the_validation_for_charge_waiver() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 100; i++) {
			try {
				transactionObj.transaction_WaivedAlertPopupWithOkBtn().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 100) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status);
	}

	@And("^get the transaction number which is created now$")
	public void get_the_transaction_number_which_is_created_now() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transaction_TransactionNumber());
		String transaNum = transactionObj.transaction_TransactionNumber().getText();
		System.out.println(transactionObj.transaction_TransactionNumber().getText());
		String finalTransaNum = transaNum.substring(15, 19);
		excelDataForTransWaiver.updateTestData(transactionTestData.get("DataSet ID"), "Transaction Number",
				finalTransaNum);
		System.out.println("Transaction Number" + finalTransaNum);
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transaction_TransactionNumberOkButton());
		clicksAndActionsHelper.moveToElement(transactionObj.transaction_TransactionNumberOkButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.transaction_TransactionNumberOkButton());
	}

	@And("^click on approve feature under transaction feature$")
	public void click_on_approve_feature_under_transaction_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionApproveFeature());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionApproveFeature());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionApproveFeature());
	}

	@And("^search the transaction number under transaction approve feature$")
	public void search_the_transaction_number_under_transaction_approve_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionApproveTransactionNoSearch());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionApproveTransactionNoSearch());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionApproveTransactionNoSearch());
		transactionObj.transactionApproveTransactionNoSearch().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionApproveTransactionNoSearch().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 100; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the suggested record from the transaction approve$")
	public void select_the_suggested_record_from_the_transaction_approve() throws Throwable {
		String xpath = "//td[contains(text(),'" + transactionTestData.get("Transaction Number") + "')]";
		for (int i = 0; i <= 1000; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on approve button$")
	public void click_on_approve_button() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmApproveBtn());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveBtn());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveBtn());
				break;

			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on ok button after approve the transaction record$")
	public void click_on_ok_button_after_approve_the_transaction_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionApproveOkButton());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionApproveOkButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionApproveOkButton());
	}

	@And("^close the transaction tab$")
	public void close_the_transaction_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionCloseTransactionTab());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionCloseTransactionTab());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionCloseTransactionTab());
	}

	@And("^search the approved trsnaction number in transaction maintenenace screen$")
	public void search_the_approved_trsnaction_number_in_transaction_maintenenace_screen() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNumber());
		transactionObj.transactionSearchTransactionNumber().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNumber().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^verify transaction status should show as approved$")
	public void verify_transaction_status_should_show_as_approved() throws Throwable {
		robot = new Robot();
		for (int i = 0; i <= 100; i++) {
			try {
				Assert.assertEquals(transactionObj.transactionTransactionStatus().getText(), "Approved");
				break;
			} catch (Exception e) {
				if (i != 100) {
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				} else if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("^open the approved transaction record$")
	public void open_the_approved_transaction_record() throws Throwable {
		String xpath = "//td[contains(text(),'" + transactionTestData.get("Transaction Number") + "')]";
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

	@And("^check system should deduct the charges for the transaction$")
	public void check_system_should_deduct_the_charges_for_the_transaction() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionChargeValidation());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionChargeValidation().getText().isBlank())) {
				System.out.println("Charge Amount " + transactionObj.transactionChargeValidation().getText());
				System.out.println("Charge Amount As Per Excel " + transactionTestData.get("Waived Charge Amount"));
				break;
			} else if (i == 100) {
				Assert.fail(transactionObj.transactionChargeValidation().getText() + " Is blank");

			}
		}

		String[] spliChargeAmt = transactionObj.transactionChargeValidation().getText().split("[.]");
		for (String str : spliChargeAmt) {
			System.out.println(str);
		}
		Assert.assertNotEquals(spliChargeAmt[0], transactionTestData.get("Waived Charge Amount"));
	}

	@Then("^verify system should not deduct the charges for the transaction$")
	public void verify_system_should_not_deduct_the_charges_for_the_transaction() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionChargeValidation());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionChargeValidation().getText().isBlank())) {
				System.out.println("Charge Amount " + transactionObj.transactionChargeValidation().getText());
				System.out.println("Charge Amount As Per Excel " + transactionTestData.get("Waived Charge Amount"));
				break;
			} else if (i == 100) {
				Assert.fail(transactionObj.transactionChargeValidation().getText() + " Is blank");

			}
		}

		String[] spliChargeAmt = transactionObj.transactionChargeValidation().getText().split("[.]");
		for (String str : spliChargeAmt) {
			System.out.println(str);
		}
		Assert.assertEquals(spliChargeAmt[0], transactionTestData.get("Waived Charge Amount"));
	}

}
