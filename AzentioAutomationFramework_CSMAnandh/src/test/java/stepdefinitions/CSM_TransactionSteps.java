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
import helper.DropDownHelper;
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
	DropDownHelper dropdownHelper = new DropDownHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForChargeWaiverExecution = new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	ExcelData excelDataForTransWaiver = new ExcelData(path, "CSM_Transaction", "DataSet ID");
	ExcelData excelDataForTransactionTestData = new ExcelData(path, "CSM_Transaction", "DataSet ID");
	ExcelData excelDataFortransactionTestData = new ExcelData(path, "TransactionTestData", "DataSet ID");
	ExcelData excelDataForTransactionExecution = new ExcelData(path, "Transaction_ExecutionTracker", "TestCaseID");
	Map<String, String> transactionTestData = new HashMap<>();
	Map<String, String> transactionExecutionData = new HashMap<>();
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

	@And("^get the test data for test case CW_19$")
	public void get_the_test_data_for_test_case_cw19() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_019");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_21$")
	public void get_the_test_data_for_test_case_cw21() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_021");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_22$")
	public void get_the_test_data_for_test_case_cw22() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_022");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_23$")
	public void get_the_test_data_for_test_case_cw23() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_023");
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

	@And("^change the system date within excemption date$")
	public void change_the_system_date_within_excemption_date() throws Throwable {
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
		csmCommonWebElements.csmInputSystemDate().sendKeys(transactionTestData.get("ExcemptionDate"));
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

	@And("^get the test data for test case ID TRS_005$")
	public void get_the_test_data_for_test_case_id_trs005() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_005");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_006$")
	public void get_the_test_data_for_test_case_id_trs006() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_006");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}
	 @And("^get the test data for test case ID TRS_007$")
	    public void get_the_test_data_for_test_case_id_trs007() throws Throwable {
			transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_007");
			System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
			transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
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
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}

		}
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

	@And("^click on ok buton in staff member ok button$")
	public void click_on_ok_buton_in_staff_member_ok_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionsStaffMemberOkButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionsStaffMemberOkButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify system should show the validation message for no access for account type$")
	public void verify_system_should_show_the_validation_message_for_no_access_for_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionsNoAccountTypeAccessValidation());
		String accountTypeValidation = transactionObj.transactionsNoAccountTypeAccessValidation().getText();
		System.out.println(accountTypeValidation);
		boolean accTypeAccess = accountTypeValidation.contains(transactionTestData.get("Credit Gl Code"));
		System.out.println(accTypeAccess);
		Assert.assertTrue(accTypeAccess);

	}

	@Then("^verify system should show the validation message for no access for CIF type$")
	public void verify_system_should_show_the_validation_message_for_no_access_for_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionsNoCIFTypeAccessValidation());
		Assert.assertTrue(transactionObj.transactionsNoCIFTypeAccessValidation().isDisplayed());
	}
	@Then("^verify system should show the validation message for no access for Priority$")
    public void verify_system_should_show_the_validation_message_for_no_access_for_priority() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionsNoPriorityAccessValidation());
		Assert.assertTrue(transactionObj.transactionsNoPriorityAccessValidation().isDisplayed());
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
		for (int i = 0; i <= 100; i++) {
			try {
				if (!(csmCommonWebElements.csmLoadingImage().isDisplayed()))

				{
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^give the ending date in transaction of SO$")
	public void give_the_ending_date_in_transaction_of_so() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeSOEndingDateInput());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeSOEndingDateInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeSOEndingDateInput());
		transactionObj.transactionTypeSOEndingDateInput().sendKeys(transactionTestData.get("Ending Date"));
		robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 500; i++) {
			try {
				if (!(csmCommonWebElements.csmLoadingImage().isDisplayed())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
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

	@And("^click on server response ok button if exist$")
	public void click_on_server_response_ok_button_if_exist() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionServerResponsePopupOkButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionServerResponsePopupOkButton());

				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmSaveButton());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveButton());
				clicksAndActionsHelper.doubleClick(csmCommonWebElements.csmSaveButton());
				break;
			} catch (Exception e) {

			}
		}
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

	@And("^close the transaction maintenance tab$")
	public void close_the_transaction_maintenance_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionCloseTransactionTab());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionCloseTransactionTab());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionCloseTransactionTab());
	}

	@And("^close the transaction approve button$")
	public void close_the_transaction_approve_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionApproveCloseButton());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionApproveCloseButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionApproveCloseButton());
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

	@Then("^verify system should show the validatio for charge waiver under approve for amend standing order$")
	public void verify_system_should_show_the_validatio_for_charge_waiver_under_approve_for_amend_standing_order()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionChargeValidation());
		Assert.assertTrue(transactionObj.transactionChargeValidation().isDisplayed());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionChargeValidation());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionChargeValidation());
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
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertEquals(transactionObj.transactionTransactionStatus().getText(), "Approved");
				break;
			} catch (Exception e) {
				if (i != 500) {
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				} else if (i == 500) {
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

	@And("^click on to be stopped screen under transaction module$")
	public void click_on_to_be_stopped_screen_under_transaction_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transaction_ToBeStoppedStandingOrder());
		clicksAndActionsHelper.moveToElement(transactionObj.transaction_ToBeStoppedStandingOrder());
		clicksAndActionsHelper.clickOnElement(transactionObj.transaction_ToBeStoppedStandingOrder());
	}

	@And("^search for the approved record in to be stopped search$")
	public void search_for_the_approved_record_in_to_be_stopped_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the approved record in to be stopped screen$")
	public void select_the_approved_record_in_to_be_stopped_screen() throws Throwable {
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

	@And("^give the to be stopped reason$")
	public void give_the_to_be_stopped_reason() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.toBeStoppedStandingOrderToDoStoppedReason());
				clicksAndActionsHelper.moveToElement(transactionObj.toBeStoppedStandingOrderToDoStoppedReason());
				clicksAndActionsHelper.clickOnElement(transactionObj.toBeStoppedStandingOrderToDoStoppedReason());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		transactionObj.toBeStoppedStandingOrderToDoStoppedReason().sendKeys(transactionTestData.get("Suspend Reason"));
	}

	@And("^click on to Stop SO button$")
	public void click_on_to_stop_so_button() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.toBeStoppedStandingOrderStopSOButton());
				clicksAndActionsHelper.moveToElement(transactionObj.toBeStoppedStandingOrderStopSOButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.toBeStoppedStandingOrderStopSOButton());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionTypeInputDescription());
		transactionObj.transactionTransactionTypeInputDescription().isDisplayed();
		for (int i = 0; i <= 500; i++) {
			try {
				if (transactionObj.transactionTransactionTypeInputDescription().getAttribute("prevvalue").isBlank()) {
					break;
				} else if (i == 500) {
					Assert.fail("took more time to populate the date");
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^close the to be stopped tab$")
	public void close_the_to_be_stopped_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.toBeStoppedStandingOrderTabCloseButton());
		clicksAndActionsHelper.moveToElement(transactionObj.toBeStoppedStandingOrderTabCloseButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.toBeStoppedStandingOrderTabCloseButton());
	}

	@And("^click on to stop so feature$")
	public void click_on_to_stop_so_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionStopStandingOrder());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionStopStandingOrder());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionStopStandingOrder());
	}

	@And("^search for the transation which was to be stopped$")
	public void search_for_the_transation_which_was_to_be_stopped() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the to be stopped transaction SO$")
	public void select_the_to_be_stopped_transaction_so() throws Throwable {
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

	@And("^click on stop SO button$")
	public void click_on_stop_so_button() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.toBeStoppedStandingOrderStopSOButton());
				clicksAndActionsHelper.moveToElement(transactionObj.toBeStoppedStandingOrderStopSOButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.toBeStoppedStandingOrderStopSOButton());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify system should through the validation for Charge waive for stopped record of SO$")
	public void verify_system_should_through_the_validation_for_charge_waive_for_stopped_record_of_so()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transaction_WaivedAlertPopupWithOkBtn());
		clicksAndActionsHelper.moveToElement(transactionObj.transaction_WaivedAlertPopupWithOkBtn());
		Assert.assertTrue(transactionObj.transaction_WaivedAlertPopupWithOkBtn().isDisplayed());
	}

	@And("^update the transaction number in test case CW_020$")
	public void update_the_transaction_number_in_test_case_cw020() throws Throwable {
		excelDataForTransWaiver.updateTestData(transactionTestData.get("Update DataSetID"), "Transaction Number",
				transactionTestData.get("Transaction Number"));
	}

	@And("^click on reactive standing order in transaction feature$")
	public void click_on_reactive_standing_order_in_transaction_feature() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionReactiveStandingOrderFeature());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionReactiveStandingOrderFeature());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionReactiveStandingOrderFeature());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^get the test data for test case CW_020$")
	public void get_the_test_data_for_test_case_cw020() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_020");
		transactionTestData = excelDataForTransWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^search for the suspended record under reactive standing order$")
	public void search_for_the_suspended_record_under_reactive_standing_order() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the suspended standing order in reactive standing order$")
	public void select_the_suspended_standing_order_in_reactive_standing_order() throws Throwable {
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

	@And("^click on reactive SO in reactive standing order feature$")
	public void click_on_reactive_so_in_reactive_standing_order_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.reactiveStandingOrderFeatureReactivateSOButton());
				clicksAndActionsHelper.moveToElement(transactionObj.reactiveStandingOrderFeatureReactivateSOButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.reactiveStandingOrderFeatureReactivateSOButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionTypeInputDescription());
		for (int i = 0; i <= 100; i++) {
			try {
				if (transactionObj.transactionTransactionTypeInputDescription().getAttribute("prevvalue").isBlank()) {
					break;
				}
			} catch (Exception e) {

			}

		}

	}

	@And("^close the reactive SO feature$")
	public void close_the_reactive_so_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transactionObj.transactionReactiveStandingOrderlabelCloseButton());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionReactiveStandingOrderlabelCloseButton());
				clicksAndActionsHelper
						.clickOnElement(transactionObj.transactionReactiveStandingOrderlabelCloseButton());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on approve reactive standing order feature$")
	public void click_on_approve_reactive_standing_order_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transactionObj.transactionApproveReactiveStandingOrderFeature());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionApproveReactiveStandingOrderFeature());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionApproveReactiveStandingOrderFeature());
	}

	@And("^search for reactivated SO in search view$")
	public void search_for_reactivated_so_in_search_view() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the reactvated record for approval$")
	public void select_the_reactvated_record_for_approval() throws Throwable {
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

	@And("^click on apply reactive SO button in approve reactive SO$")
	public void click_on_apply_reactive_so_button_in_approve_reactive_so() throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.approveReactivateStandingOrderApplyReactivateSOButton());
				clicksAndActionsHelper
						.moveToElement(transactionObj.approveReactivateStandingOrderApplyReactivateSOButton());
				clicksAndActionsHelper
						.clickOnElement(transactionObj.approveReactivateStandingOrderApplyReactivateSOButton());
				break;
			} catch (Exception e) {
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionTypeInputDescription());
		for (int i = 0; i <= 100; i++) {
			if (transactionObj.transactionTransactionTypeInputDescription().getAttribute("prevvalue").isBlank()) {
				break;
			}

		}
	}

	@Then("^verify system should show the validation for charge waiver for reactive SO$")
	public void verify_system_should_show_the_validation_for_charge_waiver_for_reactive_so() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transaction_WaivedAlertPopupWithOkBtn());
		Assert.assertTrue(transactionObj.transaction_WaivedAlertPopupWithOkBtn().isDisplayed());
		clicksAndActionsHelper.moveToElement(transactionObj.transaction_WaivedAlertPopupWithOkBtn());
		clicksAndActionsHelper.clickOnElement(transactionObj.transaction_WaivedAlertPopupWithOkBtn());
	}

	@And("^close the transaction approve tab$")
	public void close_the_transaction_approve_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transationApproveTabCloseButton());
		clicksAndActionsHelper.moveToElement(transactionObj.transationApproveTabCloseButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.transationApproveTabCloseButton());
	}

	@And("^click on amend standing order feature$")
	public void click_on_amend_standing_order_feature() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionAmendStnadingOrderFeature());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionAmendStnadingOrderFeature());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionAmendStnadingOrderFeature());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^search for approved standing order in amend standing order$")
	public void search_for_approved_standing_order_in_amend_standing_order() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the approved standing order in amend standing order$")
	public void select_the_approved_standing_order_in_amend_standing_order() throws Throwable {
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

	@And("^amend the amount in standing order record$")
	public void amend_the_amount_in_standing_order_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionDepositeAmountInputBox());
		transactionObj.transactionDepositeAmountInputBox().clear();
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.doubleClick(transactionObj.transactionDepositeAmountInputBox());
		transactionObj.transactionDepositeAmountInputBox().sendKeys(transactionTestData.get("Amend Amount"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.amendStandingOrderLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.amendStandingOrderLabel());
		clicksAndActionsHelper.doubleClick(transactionObj.amendStandingOrderLabel());
		for (int i = 0; i <= 100; i++) {
			try {
				if (!(csmCommonWebElements.csmLoadingImage().isDisplayed())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^click on amend SO button in amend standing order$")
	public void click_on_amend_so_button_in_amend_standing_order() throws Throwable {
		javascriptHelper.scrollIntoView(transactionObj.amendStandingOrderAmendStandingOrderButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.amendStandingOrderAmendStandingOrderButton());
		clicksAndActionsHelper.doubleClick(transactionObj.amendStandingOrderAmendStandingOrderButton());
	}

	@And("^click on ok button for updation in amend standng order$")
	public void click_on_ok_button_for_updation_in_amend_standng_order() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmConfirmUpdateOkButon());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmConfirmUpdateOkButon());
		clicksAndActionsHelper.doubleClick(csmCommonWebElements.csmConfirmUpdateOkButon());
	}

	@And("^close the amend staning order tab$")
	public void close_the_amend_staning_order_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionTypeInputDescription());
		for (int i = 0; i <= 100; i++) {
			try {
				if (transactionObj.transactionTransactionTypeInputDescription().getAttribute("prevvalue").isBlank()) {
					break;
				}
			} catch (Exception e) {

			}

		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(transactionObj.amendStandingOrderTabCloseButton());
				clicksAndActionsHelper.doubleClick(transactionObj.amendStandingOrderTabCloseButton());
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^click on to be closed standing order feature$")
	public void click_on_to_be_closed_standing_order_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionToBeClosedStandingOrderFeature());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionToBeClosedStandingOrderFeature());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionToBeClosedStandingOrderFeature());
	}

	@And("^search for approved transaction in to be closed standing order$")
	public void search_for_approved_transaction_in_to_be_closed_standing_order() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the transaction in to be closed standing order$")
	public void select_the_transaction_in_to_be_closed_standing_order() throws Throwable {
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

	@And("^enter the reason for close the standing order$")
	public void enter_the_reason_for_close_the_standing_order() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.toBeClosedStandingOrderReason());
				clicksAndActionsHelper.moveToElement(transactionObj.toBeClosedStandingOrderReason());
				clicksAndActionsHelper.clickOnElement(transactionObj.toBeClosedStandingOrderReason());
				transactionObj.toBeClosedStandingOrderReason().sendKeys(transactionTestData.get("Close Reason"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on to close SO button$")
	public void click_on_to_close_so_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.toBeClosedStandingOrderToCloseSOButton());
		clicksAndActionsHelper.moveToElement(transactionObj.toBeClosedStandingOrderToCloseSOButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.toBeClosedStandingOrderToCloseSOButton());
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionTypeInputDescription());
		for (int i = 0; i <= 100; i++) {
			try {
				if (transactionObj.transactionTransactionTypeInputDescription().getAttribute("prevvalue").isBlank()) {
					break;
				}
			} catch (Exception e) {

			}

		}
	}

	@And("^close the to be close SO label$")
	public void close_the_to_be_close_so_label() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.toBeClosedStandingOrderLabelCloseButton());
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.toBeClosedStandingOrderLabelCloseButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.toBeClosedStandingOrderLabelCloseButton());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on close SO feature$")
	public void click_on_close_so_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionCloseStandingOrderFeature());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionCloseStandingOrderFeature());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionCloseStandingOrderFeature());
	}

	@And("^search for To be closed SO Records in close SO$")
	public void search_for_to_be_closed_so_records_in_close_so() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the to be closed SO in close SO$")
	public void select_the_to_be_closed_so_in_close_so() throws Throwable {
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

	@And("^click on close SO button$")
	public void click_on_close_so_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.closeStandingOrderCloseSOButton());
				clicksAndActionsHelper.moveToElement(transactionObj.closeStandingOrderCloseSOButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.closeStandingOrderCloseSOButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify system should show the validation for charge waiver for clos standing order$")
	public void verify_system_should_show_the_validation_for_charge_waiver_for_clos_standing_order() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionChargeValidation());
		Assert.assertTrue(transactionObj.transactionChargeValidation().isDisplayed());
	}

	@And("^click on cancel feature under transaction$")
	public void click_on_cancel_feature_under_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactinCancelFeature());
		clicksAndActionsHelper.moveToElement(transactionObj.transactinCancelFeature());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactinCancelFeature());

	}

	@And("^search for approved record under cancel$")
	public void search_for_approved_record_under_cancel() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the approved record in cancel feature$")
	public void select_the_approved_record_in_cancel_feature() throws Throwable {
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

	@And("^select the cancel reason$")
	public void select_the_cancel_reason() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.cancelCancelReasonDropdown());
		dropdownHelper.SelectUsingVisibleText(transactionObj.cancelCancelReasonDropdown(),
				transactionTestData.get("Cancel Reason"));
	}

	@And("^click on cancel button under cancel feature$")
	public void click_on_cancel_button_under_cancel_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.cancelCancelButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.cancelCancelButton());
				clicksAndActionsHelper.doubleClick(transactionObj.cancelCancelButton());
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify system should show the validation for charge waiver in transaction cance$")
	public void verify_system_should_show_the_validation_for_charge_waiver_in_transaction_cance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionChargeValidation());
		Assert.assertTrue(transactionObj.transactionChargeValidation().isDisplayed());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionChargeValidation());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionChargeValidation());
	}

	@Then("^verify transaction maintenance gridgot cleared$")
	public void verify_transaction_maintenance_gridgot_cleared() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.isTransactionDataAvailableInCSM());
		Assert.assertTrue(transactionObj.isTransactionDataAvailableInCSM().isDisplayed());
	}

	@Then("^verify system should show the transaction details for the perticular transaction in search grid$")
	public void verify_system_should_show_the_transaction_details_for_the_perticular_transaction_in_search_grid()
			throws Throwable {
		String xpath = "//td[text()='" + transactionTestData.get("Other Teller Transaction Number") + "']";
		boolean status = false;
		for (int i = 0; i <= 300; i++) {
			try {
				status = driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status);
	}

	@Then("^verify system should not show the transaction which was created by other teller$")
	public void verify_system_should_not_show_the_transaction_which_was_created_by_other_teller() throws Throwable {
		String xpath = "//td[text()='" + transactionTestData.get("Other Teller Transaction Number") + "']";
		boolean status = false;
		for (int i = 0; i <= 300; i++) {
			try {
				status = driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}
		Assert.assertFalse(status);
	}

	@And("^get the test data for test case ID TRS_001$")
	public void get_the_test_data_for_test_case_id_trs001() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_001");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_002$")
	public void get_the_test_data_for_test_case_id_trs002() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_002");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_003$")
	public void get_the_test_data_for_test_case_id_trs003() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_003");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_004$")
	public void get_the_test_data_for_test_case_id_trs004() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_004");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^change the system date to current date$")
	public void change_the_system_date_to_current_date() throws Throwable {
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
		System.out.println("Transaction date " + transactionTestData.get("System Date"));
		System.out.println("Transaction Type " + transactionTestData.get("Transaction Type"));
		System.out.println("Transa Own " + transactionTestData.get("Own Teller Transaction number"));
		System.out.println("Other Trans num " + transactionTestData.get("Other Teller Transaction Number"));
		csmCommonWebElements.csmInputSystemDate().sendKeys(transactionTestData.get("System Date"));
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

	@And("^click on search in transaction maintenance screen$")
	public void click_on_search_in_transaction_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSearchButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSearchButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSearchButton());
	}

	@And("^clear the transaction maintenenace grid$")
	public void clear_the_transaction_maintenenace_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmGridClearButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmGridClearButton());
		clicksAndActionsHelper.clickUsingActionClass(csmCommonWebElements.csmGridClearButton(),
				csmCommonWebElements.csmGridClearButton());
	}

	@And("^enter the transaction number in transaction maintenance search grid which was done by other teller$")
	public void enter_the_transaction_number_in_transaction_maintenance_search_grid_which_was_done_by_other_teller()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().clear();
		transactionObj.transactionSearchTransactionNo()
				.sendKeys(transactionTestData.get("Other Teller Transaction Number"));
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^system should display the transaction details which was created by himself$")
	public void system_should_display_the_transaction_details_which_was_created_by_himself() throws Throwable {
		robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		String xpath = "//td[text()='" + transactionTestData.get("Own Teller Transaction number") + "']";
		boolean status = false;
		for (int i = 0; i <= 300; i++) {
			try {
				status = driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status);
	}

	@And("^enter the transaction number in transaction maintenance search grid which was done by him self$")
	public void enter_the_transaction_number_in_transaction_maintenance_search_grid_which_was_done_by_him_self()
			throws Throwable {

		transactionObj.transactionSearchTransactionNo().clear();
		robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo()
				.sendKeys(transactionTestData.get("Own Teller Transaction number"));
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^verify system should show the transaction number in maintenance grid$")
	public void verify_system_should_show_the_transaction_number_in_maintenance_grid() throws Throwable {
		String xpath = "//td[text()='" + transactionTestData.get("Current Date Transaction number") + "']";
		boolean status = false;
		for (int i = 0; i <= 300; i++) {
			try {
				status = driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status);
	}

	@And("^enter the transaction number which is created at the meentioned date$")
	public void enter_the_transaction_number_which_is_created_at_the_meentioned_date() throws Throwable {
		transactionObj.transactionSearchTransactionNo().clear();
		robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo()
				.sendKeys(transactionTestData.get("Current Date Transaction number"));
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^verify system should show the transaction details of the past date$")
	public void verify_system_should_show_the_transaction_details_of_the_past_date() throws Throwable {
		String xpath = "//td[text()='" + transactionTestData.get("Past transaction number") + "']";
		boolean status = false;
		for (int i = 0; i <= 500; i++) {
			try {
				status = driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status);
	}

	@Then("^verify system should not show the transaction details of the past date$")
	public void verify_system_should_not_show_the_transaction_details_of_the_past_date() throws Throwable {
		String xpath = "//td[text()='" + transactionTestData.get("Past transaction number") + "']";
		boolean status = false;
		for (int i = 0; i <= 500; i++) {
			try {
				status = driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
			}
		}
		Assert.assertFalse(status);
	}

	@And("^enter the transaction number which was created at past date$")
	public void enter_the_transaction_number_which_was_created_at_past_date() throws Throwable {
		transactionObj.transactionSearchTransactionNo().clear();
		robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNo());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNo());
		transactionObj.transactionSearchTransactionNo().sendKeys(transactionTestData.get("Past transaction number"));
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

}
