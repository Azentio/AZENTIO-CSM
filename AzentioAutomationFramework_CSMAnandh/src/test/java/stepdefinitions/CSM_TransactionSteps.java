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
import pageobjects.csm.CSM_QueriesObj;
import pageobjects.csm.CSM_TransactionObj;
import resources.BaseClass;
import resources.DateIncrementDecrement;

public class CSM_TransactionSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	CSM_TransactionObj transactionObj = new CSM_TransactionObj(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	CSM_QueriesObj csmQueriesObj = new CSM_QueriesObj(driver);
	DropDownHelper dropdownHelper = new DropDownHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForChargeWaiverExecution = new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	ExcelData excelDataForChargeWaiver = new ExcelData(path, "CSM_ChargeWaiverTestData", "DataSet ID");
	ExcelData excelDataForTransactionTestData = new ExcelData(path, "CSM_Transaction", "DataSet ID");
	ExcelData excelDataFortransactionTestData = new ExcelData(path, "TransactionTestData", "DataSet ID");
	ExcelData excelDataForTransactionExecution = new ExcelData(path, "Transaction_ExecutionTracker", "TestCaseID");
	DateIncrementDecrement dateIncrementDerement = new DateIncrementDecrement();
	Map<String, String> transactionTestData = new HashMap<>();
	Map<String, String> transactionExecutionData = new HashMap<>();
	Map<String, String> chargeWaiverExecutionData = new HashMap<>();
	Robot robot;
	String valueDate = "";

	@And("^get the test data for test case CW_001$")
	public void get_the_test_data_for_test_case_cw001() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_001");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
		System.out.println("Data Set ID " + chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_003$")
	public void get_the_test_data_for_test_case_cw003() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_003");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_04$")
	public void get_the_test_data_for_test_case_cw04() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_004");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_005$")
	public void get_the_test_data_for_test_case_cw005() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_005");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_006$")
	public void get_the_test_data_for_test_case_cw006() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_006");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));

	}

	@And("^get the test data for test case CW_007$")
	public void get_the_test_data_for_test_case_cw007() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_007");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_19$")
	public void get_the_test_data_for_test_case_cw19() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_019");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_21$")
	public void get_the_test_data_for_test_case_cw21() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_021");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_22$")
	public void get_the_test_data_for_test_case_cw22() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_022");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case CW_23$")
	public void get_the_test_data_for_test_case_cw23() throws Throwable {
		chargeWaiverExecutionData = excelDataForChargeWaiverExecution.getTestdata("CW_023");
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
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

	@And("^get the test data for test case ID TRS_048$")
	public void get_the_test_data_for_test_case_id_trs048() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_048");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_044$")
	public void get_the_test_data_for_test_case_id_trs044() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_044");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_046$")
	public void get_the_test_data_for_test_case_id_trs046() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_046");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_045$")
	public void get_the_test_data_for_test_case_id_trs045() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_045");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_049$")
	public void get_the_test_data_for_test_case_id_trs049() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_049");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_047$")
	public void get_the_test_data_for_test_case_id_trs047() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_047");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_050$")
	public void get_the_test_data_for_test_case_id_trs050() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_050");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}
	@And("get the test data for test case ID TRS_156")
	public void get_the_test_data_for_test_case_id_trs_156() {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_156");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_089$")
	public void get_the_test_data_for_test_case_id_trs089() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_089");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_095$")
	public void get_the_test_data_for_test_case_id_trs095() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_095");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_090$")
	public void get_the_test_data_for_test_case_id_trs090() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_090");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_091$")
	public void get_the_test_data_for_test_case_id_trs091() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_091");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_092$")
	public void get_the_test_data_for_test_case_id_trs092() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_092");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_093$")
	public void get_the_test_data_for_test_case_id_trs093() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_093");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_094$")
	public void get_the_test_data_for_test_case_id_trs094() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_094");
		System.out.println("Data Set ID " + transactionExecutionData.get("DataSet ID"));
		transactionTestData = excelDataFortransactionTestData.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^enter the transaction type code in transaction$")
	public void enter_the_transaction_type_code_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionTypeInput());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTransactionTypeInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTransactionTypeInput());
		System.out.println("Transaction Type code " + transactionTestData.get("Transaction Type code"));
		transactionObj.transactionTransactionTypeInput().sendKeys(transactionTestData.get("Transaction Type code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

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

		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeDebitBranchCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^choose the transaction reason in transaction maintenance$")
	public void choose_the_transaction_reason_in_transaction_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTrxPurpose());
		dropdownHelper.SelectUsingIndex(transactionObj.transactionTrxPurpose(), 2);
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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeDebitBranchCode().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeDebitCurrencyCode().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^click on live search in deposte transaction$")
	public void click_on_live_search_in_deposte_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionManagementDepositeLiveSearch());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionManagementDepositeLiveSearch());
		clicksAndActionsHelper.doubleClick(transactionObj.transactionManagementDepositeLiveSearch());

	}

	@And("^search for branch code in deposite transaction live search$")
	public void search_for_branch_code_in_deposite_transaction_live_search() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionManagementDepositeLiveSearchBranchCode());
				clicksAndActionsHelper
						.moveToElement(transactionObj.transactionManagementDepositeLiveSearchBranchCode());
				transactionObj.transactionManagementDepositeLiveSearchBranchCode()
						.sendKeys(transactionTestData.get("Credit Branch Code"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^search for gl code in deposite transaction live search$")
	public void search_for_gl_code_in_deposite_transaction_live_search() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionManagementDepositeLiveSearchGlCode());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionManagementDepositeLiveSearchGlCode());
				transactionObj.transactionManagementDepositeLiveSearchGlCode()
						.sendKeys(transactionTestData.get("Credit Gl Code"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^select the other branch account from live search in deposite transaction$")
	public void select_the_other_branch_account_from_live_search_in_deposite_transaction() throws Throwable {
		// table[@id='gridtab_trs_ac_sl_D001MT']//tr[2]//td[6]
		String xpath = "//table[@id='gridtab_trs_ac_sl_D001MT']//tr[2]//td[6]";

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

	@And("^search for currency code in deposite live search$")
	public void search_for_currency_code_in_deposite_live_search() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionManagementDepositeLiveSearchCurrencyCode());
				clicksAndActionsHelper
						.moveToElement(transactionObj.transactionManagementDepositeLiveSearchCurrencyCode());
				transactionObj.transactionManagementDepositeLiveSearchCurrencyCode()
						.sendKeys(transactionTestData.get("Credit Currency Code"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^search for CIF number in deposite transaction live search$")
	public void search_for_cif_number_in_deposite_transaction_live_search() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionManagementDepositeLiveSearchCIFCode());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionManagementDepositeLiveSearchCIFCode());
				transactionObj.transactionManagementDepositeLiveSearchCIFCode()
						.sendKeys(transactionTestData.get("Credit CIF Code"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^search for serial number in deposite transaction live search$")
	public void search_for_serial_number_in_deposite_transaction_live_search() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionManagementDepositeLiveSearchSerialNumber());
				clicksAndActionsHelper
						.moveToElement(transactionObj.transactionManagementDepositeLiveSearchSerialNumber());
				transactionObj.transactionManagementDepositeLiveSearchSerialNumber()
						.sendKeys(transactionTestData.get("Credit Serial Number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify system should show the validation for multi branch validation$")
	public void verify_system_should_show_the_validation_for_multi_branch_validation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionManagementMultiBranchValidation());
		Assert.assertTrue(transactionObj.transactionManagementMultiBranchValidation().isDisplayed());

	}

	@And("clear the currency code value from deposite")
	public void clear_the_currency_code_value_from_deposite() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitCurrencyCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitCurrencyCode());
		for (int i = 0; i <= 10; i++) {
			try {
				transactionObj.transactionTypeDebitCurrencyCode().sendKeys(Keys.BACK_SPACE);
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			if (transactionObj.transactionTypeDebitCurrencyCode().getAttribute("prevvalue").isBlank()) {
				break;
			}
		}

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
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeDebitCurrencyCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
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
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeDebitGlCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeDebitGlCode().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeDebitCIFCode().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeDebitCIFCode().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
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
		for (int i = 0; i <= 200; i++) {
			if (transactionObj.transactionTypeDebitSerialNumber().getAttribute("prevvalue").isBlank()) {
				break;
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

		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.memoAlertCloseButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.memoAlertCloseButton());
				break;
			} catch (Exception e) {

			}

		}

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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeDebitSerialNumber().getAttribute("prevvalue").isBlank())) {
				break;
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

	@And("^click on ok button no resident pop up$")
	public void click_on_ok_button_no_resident_pop_up() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceIsNoResidentOkbuton());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceIsNoResidentOkbuton());
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
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeCreditBranchCode().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeCreditGlCode().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
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
		for (int i = 0; i <= 500; i++) {
			if (!(transactionObj.transactionTypeCreditCIFCode().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
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
			if (!(transactionObj.transactionTypeCreditSerialNumCode().getAttribute("prevvalue").isBlank())) {
				break;
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
		String amount = transactionTestData.get("Deposite Amount") + "0.00";
		System.out.println("Deposite Amount " + amount);
		transactionObj.transactionDepositeAmountInputBox().sendKeys(amount);
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

	@And("^enter the limit exceed amount for deposite in transaction$")
	public void enter_the_limit_exceed_amount_for_deposite_in_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionDepositeAmountInputBox());
		transactionObj.transactionDepositeAmountInputBox().sendKeys(transactionTestData.get("Exceed Deposite Amount"));
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

	@Then("^verify system should show the validation for limit of account type$")
	public void verify_system_should_show_the_validation_for_limit_of_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transactionObj.transactionManagementAccountTypeLimitCanNotProceedValidation());
		Assert.assertTrue(transactionObj.transactionManagementAccountTypeLimitCanNotProceedValidation().isDisplayed());
	}

	@And("^change the value date to past date in transaction maintenance$")
	public void change_the_value_date_to_past_date_in_transaction_maintenance() throws Throwable {
		String date = transactionTestData.get("System Date");
		String[] split = date.split("/");
		int year = Integer.parseInt(split[2]);
		int month = Integer.parseInt(split[1]);
		int day = Integer.parseInt(split[0]);
		String ValueDate = dateIncrementDerement.dateDecrementor(year, month, day);
		System.out.println("Value date " + ValueDate);
		String[] valueDateSplit = ValueDate.split("-");
		String strMonth = "";
		String dateValidation = "";

		switch (valueDateSplit[1]) {
		case "Jan":
			strMonth = "01";
			break;
		case "Feb":
			strMonth = "02";
			break;
		case "Mar":
			strMonth = "03";
			break;
		case "Apr":
			strMonth = "04";
			break;
		case "May":
			strMonth = "05";
			break;
		case "June":
			strMonth = "06";
			break;
		case "Jul":
			strMonth = "07";
			break;
		case "Aug":
			strMonth = "08";
			break;
		case "Sep":
			strMonth = "09";
			break;
		case "Oct":
			strMonth = "10";
			break;
		case "Nov":
			strMonth = "11";
			break;
		case "Dec":
			strMonth = "12";
			break;
		}

		String valueDateOne = "";

		String beforeProcessDate = valueDateSplit[2].toString();
		int intDate = Integer.parseInt(beforeProcessDate);
		if (intDate <= 9) {
			valueDateOne = "0" + beforeProcessDate;
		} else {
			valueDateOne = beforeProcessDate;
		}

		valueDate = valueDateOne + "/" + strMonth + "/" + valueDateSplit[0].toString();
		System.out.println("Past Value Date " + valueDate);

		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactinMaintenanceValueDateInput());
		for (int i = 0; i < 13; i++) {
			clicksAndActionsHelper.clickOnElement(transactionObj.transactinMaintenanceValueDateInput());
			transactionObj.transactinMaintenanceValueDateInput().sendKeys(Keys.BACK_SPACE);
		}
		transactionObj.transactinMaintenanceValueDateInput().sendKeys(valueDate);
		transactionObj.transactinMaintenanceValueDateInput().sendKeys(Keys.ENTER);
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		// prevvalue
		for (int i = 0; i <= 200; i++) {
			if (!transactionObj.transactinMaintenanceValueDateInput().getAttribute("prevvalue").isBlank()) {
				break;
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				dateValidation = javascriptHelper
						.executeScript("return document.getElementsByName('trxMgntCO.ctstrsVO.VALUE_DATE')[0].value")
						.toString();
				if (!(dateValidation.isBlank())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^change the value date to post date in transaction maintenance$")
	public void change_the_value_date_to_post_date_in_transaction_maintenance() throws Throwable {
		String date = transactionTestData.get("System Date");
		String[] split = date.split("/");
		int year = Integer.parseInt(split[2]);
		int month = Integer.parseInt(split[1]);
		int day = Integer.parseInt(split[0]);
		String ValueDate = dateIncrementDerement.dateIncrementor(year, month, day);
		System.out.println("Value date " + ValueDate);
		String[] valueDateSplit = ValueDate.split("-");
		String strMonth = "";
		String dateValidation = "";

		switch (valueDateSplit[1]) {
		case "Jan":
			strMonth = "01";
			break;
		case "Feb":
			strMonth = "02";
			break;
		case "Mar":
			strMonth = "03";
			break;
		case "Apr":
			strMonth = "04";
			break;
		case "May":
			strMonth = "05";
			break;
		case "June":
			strMonth = "06";
			break;
		case "Jul":
			strMonth = "07";
			break;
		case "Aug":
			strMonth = "08";
			break;
		case "Sep":
			strMonth = "09";
			break;
		case "Oct":
			strMonth = "10";
			break;
		case "Nov":
			strMonth = "11";
			break;
		case "Dec":
			strMonth = "12";
			break;
		}
		String valueDateOne = "";

		String beforeProcessDate = valueDateSplit[2].toString();
		int intDate = Integer.parseInt(beforeProcessDate);
		if (intDate <= 9) {
			System.out.println("Date " + intDate);
			valueDateOne = "0" + beforeProcessDate;
			System.out.println("value Date " + valueDateOne);
		} else {
			valueDateOne = beforeProcessDate;
		}

		valueDate = valueDateOne + "/" + strMonth + "/" + valueDateSplit[0].toString();
		System.out.println("Post Value Date " + valueDate);

		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactinMaintenanceValueDateInput());
		for (int i = 0; i < 13; i++) {
			clicksAndActionsHelper.clickOnElement(transactionObj.transactinMaintenanceValueDateInput());
			transactionObj.transactinMaintenanceValueDateInput().sendKeys(Keys.BACK_SPACE);
		}
		transactionObj.transactinMaintenanceValueDateInput().sendKeys(valueDate);
		transactionObj.transactinMaintenanceValueDateInput().sendKeys(Keys.ENTER);
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		// prevvalue
		for (int i = 0; i <= 400; i++) {
			if (!transactionObj.transactinMaintenanceValueDateInput().getAttribute("prevvalue").isBlank()) {
				break;
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				dateValidation = javascriptHelper
						.executeScript("return document.getElementsByName('trxMgntCO.ctstrsVO.VALUE_DATE')[0].value")
						.toString();
				if (!(dateValidation.isBlank())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^give the ending date in transaction of SO$")
	public void give_the_ending_date_in_transaction_of_so() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeSOEndingDateInput());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeSOEndingDateInput());
				transactionObj.transactionTypeSOEndingDateInput().sendKeys(transactionTestData.get("Ending Date"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
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

	@And("^change the value date to past date in multi credit transaction$")
	public void change_the_value_date_to_past_date_in_multi_credit_transaction() throws Throwable {
		String date = transactionTestData.get("System Date");
		String[] split = date.split("/");
		int year = Integer.parseInt(split[2]);
		int month = Integer.parseInt(split[1]);
		int day = Integer.parseInt(split[0]);
		String ValueDate = dateIncrementDerement.dateDecrementor(year, month, day);
		System.out.println("Value date " + ValueDate);
		String[] valueDateSplit = ValueDate.split("-");
		String strMonth = "";
		String dateValidation = "";

		switch (valueDateSplit[1]) {
		case "Jan":
			strMonth = "01";
			break;
		case "Feb":
			strMonth = "02";
			break;
		case "Mar":
			strMonth = "03";
			break;
		case "Apr":
			strMonth = "04";
			break;
		case "May":
			strMonth = "05";
			break;
		case "Jun":
			strMonth = "06";
			break;
		case "Jul":
			strMonth = "07";
			break;
		case "Aug":
			strMonth = "08";
			break;
		case "Sep":
			strMonth = "09";
			break;
		case "Oct":
			strMonth = "10";
			break;
		case "Nov":
			strMonth = "11";
			break;
		case "Dec":
			strMonth = "12";
			break;
		}

		valueDate = valueDateSplit[2].toString() + "/" + strMonth + "/" + valueDateSplit[0].toString();
		System.out.println("Post Value Date " + valueDate);

		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactinMaintenanceValueDateInput());
		for (int i = 0; i < 13; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactinMaintenanceValueDateInput());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactinMaintenanceValueDateInput());
				transactionObj.transactinMaintenanceValueDateInput().sendKeys(Keys.BACK_SPACE);
			} catch (Exception e) {

			}
		}
		transactionObj.transactinMaintenanceValueDateInput().sendKeys(valueDate);
		transactionObj.transactinMaintenanceValueDateInput().sendKeys(Keys.ENTER);
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		// prevvalue
		for (int i = 0; i <= 200; i++) {
			if (!transactionObj.transactinMaintenanceValueDateInput().getAttribute("prevvalue").isBlank()) {
				break;
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				dateValidation = javascriptHelper
						.executeScript("return document.getElementsByName('trxMgntCO.ctstrsVO.VALUE_DATE')[0].value")
						.toString();
				if (!(dateValidation.isBlank())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^enter the amount for debit from the account$")
	public void enter_the_amount_for_debit_from_the_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionDepositeAmountInputBox());
		transactionObj.transactionDepositeAmountInputBox().sendKeys(transactionTestData.get("Withdraw Amount"));
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

	@Then("^verify system should show the validation for limit for account type$")
	public void verify_system_should_show_the_validation_for_limit_for_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transactionObj.transactionManagementAccountTypeLimitWarningValidation());
		Assert.assertTrue(transactionObj.transactionManagementAccountTypeLimitWarningValidation().isDisplayed());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionManagementAccountTypeLimitWarningValidation());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionManagementAccountTypeLimitWarningValidation());
	}

	@Then("^verify system should not show the validation for limit for account type$")
	public void verify_system_should_not_show_the_validation_for_limit_for_account_type() throws Throwable {
		boolean status = true;
		boolean statusForCannotProceedMsg = true;
		for (int i = 0; i <= 300; i++) {
			try {
				status = transactionObj.transactionManagementAccountTypeLimitWarningValidation().isDisplayed();
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				status = transactionObj.transactionManagementAccountTypeLimitCanNotProceedValidation().isDisplayed();
			} catch (Exception e) {

			}
		}
		Assert.assertTrue(status);
		Assert.assertTrue(statusForCannotProceedMsg);
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
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmPleaseWaitServerOkbuton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmPleaseWaitServerOkbuton());
				break;
			} catch (Exception e) {
			}

		}

	}

	@And("^click on ok button in transaction warning$")
	public void click_on_ok_button_in_transaction_warning() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transactionObj.transactionManagementAccountTypeLimitWarningValidation());

		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper
						.moveToElement(transactionObj.transactionManagementAccountTypeLimitWarningValidation());
				clicksAndActionsHelper
						.clickOnElement(transactionObj.transactionManagementAccountTypeLimitWarningValidation());
				break;
			} catch (Exception e) {
				if (i == 500) {
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
		excelDataForChargeWaiver.updateTestData(transactionTestData.get("DataSet ID"), "Transaction Number",
				finalTransaNum);
		System.out.println("Transaction Number" + finalTransaNum);
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transaction_TransactionNumberOkButton());
		clicksAndActionsHelper.moveToElement(transactionObj.transaction_TransactionNumberOkButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.transaction_TransactionNumberOkButton());
	}

	@And("^store the transaction number in transaction excel database$")
	public void store_the_transaction_number_in_transaction_excel_database() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transaction_TransactionNumber());
		String transaNum = transactionObj.transaction_TransactionNumber().getText();
		System.out.println(transactionObj.transaction_TransactionNumber().getText());
		String finalTransaNum = transaNum.substring(15, 19);
		excelDataFortransactionTestData.updateTestData(transactionTestData.get("DataSet ID"), "Transaction Number",
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
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionApproveOkButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionApproveOkButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

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
		excelDataForChargeWaiver.updateTestData(transactionTestData.get("Update DataSetID"), "Transaction Number",
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
		transactionTestData = excelDataForChargeWaiver.getTestdata(chargeWaiverExecutionData.get("Data Set ID"));
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
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
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
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmCompanyHolidayOkButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmCompanyHolidayOkButton());
				break;
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.closeOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.closeOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.closeOkButton());
		Thread.sleep(1000);
	}

	@And("^change the system date to given date$")
	public void change_the_system_date_to_given_date() throws Throwable {
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
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmCompanyHolidayOkButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmCompanyHolidayOkButton());
				break;
			} catch (Exception e) {

			}
		}
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
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^system should display the transaction details which was created by himself$")
	public void system_should_display_the_transaction_details_which_was_created_by_himself() throws Throwable {
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
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
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^verify system should show the transaction number in maintenance grid$")
	public void verify_system_should_show_the_transaction_number_in_maintenance_grid() throws Throwable {
		robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
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
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^verify system should show the transaction details of the past date$")
	public void verify_system_should_show_the_transaction_details_of_the_past_date() throws Throwable {
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
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
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		transactionObj.transactionSearchTransactionNo().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^click on booked entries button in approved transactions$")
	public void click_on_booked_entries_button_in_approved_transactions() throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionApproveBookedEntries());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionApproveBookedEntries());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionApproveBookedEntries());
				break;
			} catch (Exception e) {
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	// Queries

	@And("^click on queries feature$")
	public void click_on_queries_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.csmQueriesFeature());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.csmQueriesFeature());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.csmQueriesFeature());
	}

	@And("^click on statement of accounts feature$")
	public void click_on_statement_of_accounts_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesStatementOfAccounts());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesStatementOfAccounts());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesStatementOfAccounts());
	}

	@And("^click on by value date under statements of accounts$")
	public void click_on_by_value_date_under_statements_of_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesByValueDateFeature());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesByValueDateFeature());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesByValueDateFeature());
	}

	@And("^enter the branch code in staments of accounts$")
	public void enter_the_branch_code_in_staments_of_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesBranchCodeInput());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesBranchCodeInput());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesBranchCodeInput());
		csmQueriesObj.queriesBranchCodeInput().sendKeys(null);
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesLabel());
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(csmQueriesObj.queriesBranchCodeInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the currency code in staments of accounts$")
	public void enter_the_currency_code_in_staments_of_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesCurrencyCodeInput());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesCurrencyCodeInput());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesCurrencyCodeInput());
		csmQueriesObj.queriesCurrencyCodeInput().sendKeys(transactionTestData.get("Credit Currency Code"));
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesLabel());
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(csmQueriesObj.queriesCurrencyCodeInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the account type in statements of accounts$")
	public void enter_the_account_type_in_statements_of_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesGlCodeInput());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesGlCodeInput());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesGlCodeInput());
		csmQueriesObj.queriesGlCodeInput().sendKeys(transactionTestData.get("Credit Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesLabel());
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(csmQueriesObj.queriesGlCodeInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the CIF number in staments of accounts$")
	public void enter_the_cif_number_in_staments_of_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesCIFNumberInput());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesCIFNumberInput());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesCIFNumberInput());
		csmQueriesObj.queriesCIFNumberInput().sendKeys(transactionTestData.get("Credit CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesLabel());
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(csmQueriesObj.queriesCIFNumberInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the serial number in statements of accounts$")
	public void enter_the_serial_number_in_statements_of_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesSerialNumberInput());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesSerialNumberInput());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesSerialNumberInput());
		csmQueriesObj.queriesSerialNumberInput().sendKeys(transactionTestData.get("Credit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesLabel());
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(csmQueriesObj.queriesSerialNumberInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the from date in statements of accounts$")
	public void enter_the_from_date_in_statements_of_accounts() throws Throwable {
		for (int i = 0; i <= 14; i++) {

			clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesFromDateInput());
			csmQueriesObj.queriesFromDateInput().sendKeys(Keys.BACK_SPACE);
		}
		csmQueriesObj.queriesFromDateInput().sendKeys(valueDate);
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesLabel());
		for (int i = 0; i <= 100; i++) {
			try {
				if (!(csmQueriesObj.queriesFromDateInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^enter the to date in statements of accounts$")
	public void enter_the_to_date_in_statements_of_accounts() throws Throwable {
		for (int i = 0; i <= 14; i++) {

			clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesToDateInput());
			csmQueriesObj.queriesToDateInput().sendKeys(Keys.BACK_SPACE);
		}
		csmQueriesObj.queriesToDateInput().sendKeys(valueDate);
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesLabel());
		clicksAndActionsHelper.clickOnElement(csmQueriesObj.queriesLabel());
		for (int i = 0; i <= 100; i++) {
			try {
				if (!(csmQueriesObj.queriesToDateInput().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^click on retrive button in statements of accounts$")
	public void click_on_retrive_button_in_statements_of_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmQueriesObj.queriesRetriveButton());
		clicksAndActionsHelper.moveToElement(csmQueriesObj.queriesRetriveButton());
		clicksAndActionsHelper.clickUsingActionClass(csmQueriesObj.queriesRetriveButton(),
				csmQueriesObj.queriesRetriveButton());
	}

	@Then("^verify system should display the CV amount in statement of accounts screen$")
	public void verify_system_should_display_the_cv_amount_in_statement_of_accounts_screen() throws Throwable {
		int amt = Integer.parseInt(transactionTestData.get("Deposite Amount"));
		String amount = String.format("%,d", amt);
		String xpath = "//td[contains(text(),'" + amount + "')]";
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

	@And("^enter the debit branch code$")
	public void enter_the_debit_branch_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitBranchCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitBranchCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitBranchCode());
		transactionObj.transactionTypeDebitBranchCode().sendKeys(transactionTestData.get("Debit Branch Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeDebitBranchCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^enter the debit currency code$")
	public void enter_the_debit_currency_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitCurrencyCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitCurrencyCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitCurrencyCode());
		transactionObj.transactionTypeDebitCurrencyCode().sendKeys(transactionTestData.get("Debit Currency Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeDebitCurrencyCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the debit gl code$")
	public void enter_the_debit_gl_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitGlCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitGlCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitGlCode());
		transactionObj.transactionTypeDebitGlCode().sendKeys(transactionTestData.get("Debit Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeDebitGlCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the debit cif number$")
	public void enter_the_debit_cif_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitCIFCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitCIFCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitCIFCode());
		transactionObj.transactionTypeDebitCIFCode().sendKeys(transactionTestData.get("Debit CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeDebitCIFCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the debit debit serial number$")
	public void enter_the_debit_debit_serial_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeDebitSerialNumber());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeDebitSerialNumber());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeDebitSerialNumber());
		transactionObj.transactionTypeDebitSerialNumber().sendKeys(transactionTestData.get("Debit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeDebitSerialNumber().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the credit branch code$")
	public void enter_the_credit_branch_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditBranchCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditBranchCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditBranchCode());
		transactionObj.transactionTypeCreditBranchCode().sendKeys(transactionTestData.get("Credit Branch Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeCreditBranchCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the credit gl code$")
	public void enter_the_credit_gl_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditGlCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditGlCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditGlCode());
		transactionObj.transactionTypeCreditGlCode().sendKeys(transactionTestData.get("Credit Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeCreditGlCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the credit cif number$")
	public void enter_the_credit_cif_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditCIFCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditCIFCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditCIFCode());
		transactionObj.transactionTypeCreditCIFCode().sendKeys(transactionTestData.get("Credit CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeCreditCIFCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@And("^enter the serial number$")
	public void enter_the_serial_number() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditSerialNumCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditSerialNumCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditSerialNumCode());
		transactionObj.transactionTypeCreditSerialNumCode().sendKeys(transactionTestData.get("Credit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeCreditSerialNumCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^enter the credit serial number$")
	public void enter_the_credit_serial_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTypeCreditSerialNumCode());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionTypeCreditSerialNumCode());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionTypeCreditSerialNumCode());
		transactionObj.transactionTypeCreditSerialNumCode().sendKeys(transactionTestData.get("Credit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				if (!(transactionObj.transactionTypeCreditSerialNumCode().getAttribute("prevvalue").isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^enter the amount for debit transfer transaction$")
	public void enter_the_amount_for_debit_transfer_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionDepositeAmountInputBox());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionDepositeAmountInputBox());
		transactionObj.transactionDepositeAmountInputBox().sendKeys(transactionTestData.get("Deposite Amount"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionMaintenanceLabel());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenanceLabel());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenanceLabel());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
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

	@And("^click on account details button in transaction maintenance$")
	public void click_on_account_details_button_in_transaction_maintenance() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionsMaintenanceAccountDetailsButton());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionsMaintenanceAccountDetailsButton());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionsMaintenanceAccountDetailsButton());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on add button in acccount details of transaction maintenance$")
	public void click_on_add_button_in_acccount_details_of_transaction_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transactionObj.transactionsMaintenanceAccountDetailsAddButton());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionsMaintenanceAccountDetailsAddButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionsMaintenanceAccountDetailsAddButton());

	}

	@And("^enter the branch code in first grid of account details$")
	public void enter_the_branch_code_in_first_grid_of_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsBlankBranchCodeOne());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsBlankBranchCodeOne());
		clicksAndActionsHelper.clickUsingActionClass(transactionObj.additionalDetailsBlankBranchCodeOne(),
				transactionObj.additionalDetailsBlankBranchCodeOne());
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionaDetailsBranchCodeInput());
		clicksAndActionsHelper.moveToElement(transactionObj.additionaDetailsBranchCodeInput());
		clicksAndActionsHelper.clickUsingActionClass(transactionObj.additionaDetailsBranchCodeInput(),
				transactionObj.additionaDetailsBranchCodeInput());
		transactionObj.additionaDetailsBranchCodeInput().sendKeys(transactionTestData.get("Debit Branch Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.csmAdditionalDetailsLabel());
		for (int i = 0; i <= 300; i++) {
			if (!(transactionObj.additionaDetailsBranchCodeInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^enter the gl code in frist grid of account details$")
	public void enter_the_gl_code_in_frist_grid_of_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsGLCodeInput());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsGLCodeInput());
		clicksAndActionsHelper.clickUsingActionClass(transactionObj.additionalDetailsGLCodeInput(),
				transactionObj.additionalDetailsGLCodeInput());
		transactionObj.additionalDetailsGLCodeInput().sendKeys(transactionTestData.get("Debit Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.csmAdditionalDetailsLabel());
		for (int i = 0; i <= 300; i++) {
			if (!(transactionObj.additionalDetailsGLCodeInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^enter the cif number in first grid of account details$")
	public void enter_the_cif_number_in_first_grid_of_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsCIFNumberInput());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsCIFNumberInput());
		clicksAndActionsHelper.clickUsingActionClass(transactionObj.additionalDetailsCIFNumberInput(),
				transactionObj.additionalDetailsCIFNumberInput());
		transactionObj.additionalDetailsCIFNumberInput().sendKeys(transactionTestData.get("Debit CIF Code"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.csmAdditionalDetailsLabel());
		for (int i = 0; i <= 300; i++) {
			if (!(transactionObj.additionalDetailsCIFNumberInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^enter the serial number in frist grid of account details$")
	public void enter_the_serial_number_in_frist_grid_of_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsSerialNumberInput());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsSerialNumberInput());
		clicksAndActionsHelper.clickUsingActionClass(transactionObj.additionalDetailsSerialNumberInput(),
				transactionObj.additionalDetailsSerialNumberInput());
		transactionObj.additionalDetailsSerialNumberInput().sendKeys(transactionTestData.get("Debit Serial Number"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.csmAdditionalDetailsLabel());
		for (int i = 0; i <= 300; i++) {
			if (!(transactionObj.additionalDetailsSerialNumberInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^enter the amount in first grid of account details$")
	public void enter_the_amount_in_first_grid_of_account_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.additionalDetailsAmountInput());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsAmountInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.additionalDetailsAmountInput());
		transactionObj.additionalDetailsAmountInput().sendKeys(transactionTestData.get("Withdraw Amount"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.csmAdditionalDetailsLabel());
		for (int i = 0; i <= 300; i++) {
			if (!(transactionObj.additionalDetailsAmountInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^click on live search in second row of account details$")
	public void click_on_live_search_in_second_row_of_account_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.additionalDetailsBlankBranchCodeTwo());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsBlankBranchCodeTwo());
		clicksAndActionsHelper.clickUsingActionClass(transactionObj.additionalDetailsBlankBranchCodeTwo(),
				transactionObj.additionalDetailsBlankBranchCodeTwo());
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsLiveSearchButton());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsLiveSearchButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.additionalDetailsLiveSearchButton());
	}

	@And("^enter the second account branch code in account details$")
	public void enter_the_second_account_branch_code_in_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsLiveSearchBranchCodeInput());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsLiveSearchBranchCodeInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.additionalDetailsLiveSearchBranchCodeInput());
		transactionObj.additionalDetailsLiveSearchBranchCodeInput()
				.sendKeys(transactionTestData.get("Debit Branch Code Two"));
	}

	@And("^search the second gl code in additional account details$")
	public void search_the_second_gl_code_in_additional_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsLiveSearchGlCodeInput());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsLiveSearchGlCodeInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.additionalDetailsLiveSearchGlCodeInput());
		transactionObj.additionalDetailsLiveSearchGlCodeInput().sendKeys(transactionTestData.get("Debit Gl Code Two"));

	}

	@And("^search the second cif number in additional account details$")
	public void search_the_second_cif_number_in_additional_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsLiveSearchCIFCodeInput());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsLiveSearchCIFCodeInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.additionalDetailsLiveSearchCIFCodeInput());
		transactionObj.additionalDetailsLiveSearchCIFCodeInput()
				.sendKeys(transactionTestData.get("Debit CIF Code Two"));
	}

	@And("^search the second serial number in additional account details$")
	public void search_the_second_serial_number_in_additional_account_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.additionalDetailsLiveSearchSerialNumberInput());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsLiveSearchSerialNumberInput());
		clicksAndActionsHelper.clickOnElement(transactionObj.additionalDetailsLiveSearchSerialNumberInput());
		transactionObj.additionalDetailsLiveSearchSerialNumberInput()
				.sendKeys(transactionTestData.get("Debit Serial Number Two"));
	}

	@And("^select the record for second additional account$")
	public void select_the_record_for_second_additional_account() throws Throwable {
		String xpath = "// td[contains(text(),'" + transactionTestData.get("Debit Serial Number Two") + "')]";
		for (int i = 0; i <= 50; i++) {
			try {

				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				// clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^enter the amount in second grid of account details$")
	public void enter_the_amount_in_second_grid_of_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsAmountInput2());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsAmountInput2());
		clicksAndActionsHelper.clickOnElement(transactionObj.additionalDetailsAmountInput2());
		transactionObj.additionalDetailsAmountInput2().sendKeys(transactionTestData.get("Debit Amount Two"));
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.moveToElement(transactionObj.csmAdditionalDetailsLabel());
		clicksAndActionsHelper.clickOnElement(transactionObj.csmAdditionalDetailsLabel());
		for (int i = 0; i <= 300; i++) {
			if (!(transactionObj.additionalDetailsAmountInput2().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}
	}

	@And("^click on ok button in additional account details$")
	public void click_on_ok_button_in_additional_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.additionalDetailsOkButton());
		clicksAndActionsHelper.moveToElement(transactionObj.additionalDetailsOkButton());
		clicksAndActionsHelper.clickOnElement(transactionObj.additionalDetailsOkButton());
	}

	@Then("^verify system should show the stopper message for transaction approval$")
	public void verify_system_should_show_the_stopper_message_for_transaction_approval() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.csmInvalidBranchExchangeValidation());
		Assert.assertTrue(transactionObj.csmInvalidBranchExchangeValidation().isDisplayed());
	}

}
