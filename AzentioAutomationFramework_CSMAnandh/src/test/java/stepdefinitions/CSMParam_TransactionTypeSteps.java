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
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_TransactionTypeObj;
import resources.BaseClass;

public class CSMParam_TransactionTypeSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	CSMParam_TransactionTypeObj transactionTypeObj = new CSMParam_TransactionTypeObj(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMCommonWebElements csmCOmmonWebElements = new CSMCommonWebElements(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	String ParamDataPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	Map<String, String> transactionExecutionData = new HashMap<>();
	Map<String, String> transactionTypeTestData = new HashMap<>();
	Robot robot;
	ExcelData excelDataForTransactionTestData = new ExcelData(ParamDataPath, "CSMParam_TransactionTypeTestDat",
			"DataSet ID");
	ExcelData excelDataForTransactionExecution = new ExcelData(path, "Transaction_ExecutionTracker", "TestCaseID");

	@And("^get the test data for test case ID TRS_046_01$")
	public void get_the_test_data_for_test_case_id_trs04601() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_046_01");
		transactionTypeTestData = excelDataForTransactionTestData
				.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_045_01$")
	public void get_the_test_data_for_test_case_id_trs04501() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_045_01");
		transactionTypeTestData = excelDataForTransactionTestData
				.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_044_01$")
	public void get_the_test_data_for_test_case_id_trs04401() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_044_01");
		transactionTypeTestData = excelDataForTransactionTestData
				.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^get the test data for test case ID TRS_047_50_01$")
	public void get_the_test_data_for_test_case_id_trs04701() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_047_50_01");
		transactionTypeTestData = excelDataForTransactionTestData
				.getTestdata(transactionExecutionData.get("DataSet ID"));
	}
	@And("^get the test data for test case ID TRS_095_02$")
    public void get_the_test_data_for_test_case_id_trs09502() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_095_02");
		transactionTypeTestData = excelDataForTransactionTestData
				.getTestdata(transactionExecutionData.get("DataSet ID"));
    }

	@And("^get the test data for test case ID TRS_049_01$")
	public void get_the_test_data_for_test_case_id_trs04901() throws Throwable {
		transactionExecutionData = excelDataForTransactionExecution.getTestdata("TRS_049_01");
		transactionTypeTestData = excelDataForTransactionTestData
				.getTestdata(transactionExecutionData.get("DataSet ID"));
	}

	@And("^click on transaction type feature$")
	public void click_on_transaction_type_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionTypeObj.systemParameterTransactionTypeFeature());
		transactionTypeObj.systemParameterTransactionTypeFeature().click();
	}

	@And("^click on update after approve in transcation type$")
	public void click_on_update_after_approve_in_transcation_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionTypeObj.transactionTypeUpdateAfterApprove());
		transactionTypeObj.transactionTypeUpdateAfterApprove().click();
	}

	@And("^search the deposite transaction number in update after approve$")
	public void search_the_deposite_transaction_number_in_update_after_approve() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, transactionTypeObj.transactionTypeTransactionCode());
		clicksAndActionsHelper.clickUsingActionClass(transactionTypeObj.transactionTypeTransactionCode(),
				transactionTypeObj.transactionTypeTransactionCode());
		transactionTypeObj.transactionTypeTransactionCode().sendKeys(transactionTypeTestData.get("TransactionType"));
		transactionTypeObj.transactionTypeTransactionCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

	}
	 @And("^search the transaction type in update after approve transaction type$")
	    public void search_the_transaction_type_in_update_after_approve_transaction_type() throws Throwable {
		 robot = new Robot();
			waitHelper.waitForElementwithFluentwait(driver, transactionTypeObj.transactionTypeTransactionCode());
			clicksAndActionsHelper.clickUsingActionClass(transactionTypeObj.transactionTypeTransactionCode(),
					transactionTypeObj.transactionTypeTransactionCode());
			transactionTypeObj.transactionTypeTransactionCode().sendKeys(transactionTypeTestData.get("TransactionType"));
			transactionTypeObj.transactionTypeTransactionCode().sendKeys(Keys.ENTER);
			for (int i = 0; i <= 10; i++) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
	    }

	@And("^select the transaction record in update after approve screen$")
	public void select_the_transaction_record_in_update_after_approve_screen() throws Throwable {
		String xpath = "//td[contains(text(),'" + transactionTypeTestData.get("TransactionType") + "')]";
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

	@And("^uncheck the multi branch field in transaction type$")
	public void uncheck_the_multi_branch_field_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionTypeObj.transactionTypeEnableMultiBranchFalg());
		String flagStatus = transactionTypeObj.transactionTypeEnableMultiBranchFalg().getAttribute("initialvalue");
		if (!(flagStatus.isBlank())) {
			clicksAndActionsHelper.moveToElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
			clicksAndActionsHelper.clickOnElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());

		} else {
			clicksAndActionsHelper.moveToElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
			clicksAndActionsHelper.clickOnElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
			clicksAndActionsHelper.moveToElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
			clicksAndActionsHelper.clickOnElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
		}
	}

	@And("^check the multi branch field in transaction type$")
	public void check_the_multi_branch_field_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionTypeObj.transactionTypeEnableMultiBranchFalg());
		String flagStatus = transactionTypeObj.transactionTypeEnableMultiBranchFalg().getAttribute("initialvalue");
		if (!(flagStatus.isBlank())) {
			clicksAndActionsHelper.moveToElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
			clicksAndActionsHelper.clickOnElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
			clicksAndActionsHelper.moveToElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
			clicksAndActionsHelper.clickOnElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());

		} else {

			clicksAndActionsHelper.moveToElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
			clicksAndActionsHelper.clickOnElement(transactionTypeObj.transactionTypeEnableMultiBranchFalg());
		}
	}

	@And("^check the Allow Back Dated Value Date flag$")
	public void check_the_allow_backdated_value_date_flag() throws Throwable {

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionTypeObj.transactionTypeAllowBackDateValuaDateFlag());
				if (transactionTypeObj.transactionTypeAllowBackDateValuaDateFlag().getAttribute("initialvalue")
						.isBlank()) {
					System.out.println("Allow back dated falg value " + transactionTypeObj
							.transactionTypeAllowBackDateValuaDateFlag().getAttribute("initialvalue"));
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeAllowBackDateValuaDateFlag(),
							transactionTypeObj.transactionTypeAllowBackDateValuaDateFlag());
				} else {
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeAllowBackDateValuaDateFlag(),
							transactionTypeObj.transactionTypeAllowBackDateValuaDateFlag());
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeAllowBackDateValuaDateFlag(),
							transactionTypeObj.transactionTypeAllowBackDateValuaDateFlag());
				}
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^check the Allow Post Dated Value Date flag$")
	public void check_the_allow_postdated_value_date_flag() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionTypeObj.transactionTypeAllowPostDateVAluDateFalg());
				if (transactionTypeObj.transactionTypeAllowPostDateVAluDateFalg().getAttribute("initialvalue")
						.isBlank()) {
					System.out.println("Post dated falg value " + transactionTypeObj
							.transactionTypeAllowPostDateVAluDateFalg().getAttribute("initialvalue"));
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeAllowPostDateVAluDateFalg(),
							transactionTypeObj.transactionTypeAllowPostDateVAluDateFalg());
				} else {
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeAllowPostDateVAluDateFalg(),
							transactionTypeObj.transactionTypeAllowPostDateVAluDateFalg());
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeAllowPostDateVAluDateFalg(),
							transactionTypeObj.transactionTypeAllowPostDateVAluDateFalg());
				}
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^check the allow internal GL flag$")
	public void check_the_allow_internal_gl_flag() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionTypeObj.transactionTypeAllowInternalGlsFlag());
				System.out.println("Allow Internal Gl falg value "
						+ transactionTypeObj.transactionTypeAllowInternalGlsFlag().getAttribute("initialvalue"));
				if ((transactionTypeObj.transactionTypeAllowInternalGlsFlag().getAttribute("initialvalue").isBlank())
						|| (transactionTypeObj.transactionTypeAllowInternalGlsFlag().getAttribute("initialvalue")
								.isEmpty())) {
					clicksAndActionsHelper.moveToElement(transactionTypeObj.transactionTypeAllowInternalGlsFlag());
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeAllowInternalGlsFlag(),
							transactionTypeObj.transactionTypeAllowInternalGlsFlag());

				}
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^check the enable multi branch flag$")
	public void check_the_enable_multi_branch_flag() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionTypeObj.transactionTypeEnableMultiBranchFlag());
				if (transactionTypeObj.transactionTypeEnableMultiBranchFlag().getAttribute("initialvalue").isBlank()) {
					System.out.println("Post multi branch falg value "
							+ transactionTypeObj.transactionTypeEnableMultiBranchFlag().getAttribute("initialvalue"));
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeEnableMultiBranchFlag(),
							transactionTypeObj.transactionTypeEnableMultiBranchFlag());
				} else {
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeEnableMultiBranchFlag(),
							transactionTypeObj.transactionTypeEnableMultiBranchFlag());
					clicksAndActionsHelper.clickUsingActionClass(
							transactionTypeObj.transactionTypeEnableMultiBranchFlag(),
							transactionTypeObj.transactionTypeEnableMultiBranchFlag());
				}
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^check the force overdrawn flg under transaction type$")
	public void check_the_force_overdrawn_flg_under_transaction_type() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionTypeObj.transactionTypeForceOverdrawnFlag());
				if (transactionTypeObj.transactionTypeForceOverdrawnFlag().getAttribute("initialvalue").isBlank()) {
					System.out.println("Post multi branch falg value "
							+ transactionTypeObj.transactionTypeForceOverdrawnFlag().getAttribute("initialvalue"));
					clicksAndActionsHelper.clickUsingActionClass(transactionTypeObj.transactionTypeForceOverdrawnFlag(),
							transactionTypeObj.transactionTypeForceOverdrawnFlag());
				} else {
					clicksAndActionsHelper.clickUsingActionClass(transactionTypeObj.transactionTypeForceOverdrawnFlag(),
							transactionTypeObj.transactionTypeForceOverdrawnFlag());
					clicksAndActionsHelper.clickUsingActionClass(transactionTypeObj.transactionTypeForceOverdrawnFlag(),
							transactionTypeObj.transactionTypeForceOverdrawnFlag());
				}
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on update after approve button in transaction type$")
	public void click_on_update_after_approve_button_in_transaction_type() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCOmmonWebElements.csmParamUpdateAfterApproveBtn());
				clicksAndActionsHelper.clickUsingActionClass(csmCOmmonWebElements.csmParamUpdateAfterApproveBtn(),
						csmCOmmonWebElements.csmParamUpdateAfterApproveBtn());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on ok button in update confirmation of transaction type$")
	public void click_on_ok_button_in_update_confirmation_of_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCOmmonWebElements.csmSaveConfirmOkButton());
		csmCOmmonWebElements.csmSaveConfirmOkButton().click();

	}

	@And("^click on ok button of successfull update in transaction type$")
	public void click_on_ok_button_of_successfull_update_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCOmmonWebElements.updateOkButton());
		csmCOmmonWebElements.updateOkButton().click();
	}

	@And("^close the transaction type update after approve screen$")
	public void close_the_transaction_type_update_after_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transactionTypeObj.transactionTypeUpdateAfterApproveLabelClose());
		transactionTypeObj.transactionTypeUpdateAfterApproveLabelClose().click();

	}

	@And("^click on approve feature under transaction type$")
	public void click_on_approve_feature_under_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionTypeObj.transactionTypeApproveFeature());
		transactionTypeObj.transactionTypeApproveFeature().click();
	}

	@And("^search for the transaction type which is updated$")
	public void search_for_the_transaction_type_which_is_updated() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, transactionTypeObj.transactionTypeTransactionCode());
		clicksAndActionsHelper.clickUsingActionClass(transactionTypeObj.transactionTypeTransactionCode(),
				transactionTypeObj.transactionTypeTransactionCode());
		transactionTypeObj.transactionTypeTransactionCode().sendKeys(transactionTypeTestData.get("TransactionType"));
		transactionTypeObj.transactionTypeTransactionCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@And("^select the updated transaction type in approval screen$")
	public void select_the_updated_transaction_type_in_approval_screen() throws Throwable {
		String xpath = "//td[contains(text(),'" + transactionTypeTestData.get("TransactionType") + "')]";
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

	@And("^click on approve button in transaction type approval$")
	public void click_on_approve_button_in_transaction_type_approval() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCOmmonWebElements.csmApproveBtnWithLabel());
				clicksAndActionsHelper.clickUsingActionClass(csmCOmmonWebElements.csmApproveBtnWithLabel(),
						csmCOmmonWebElements.csmApproveBtnWithLabel());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on ok button in update confirmation in transaction type$")
	public void click_on_ok_button_in_update_confirmation_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCOmmonWebElements.csmConfirmApprovOkButton());
		csmCOmmonWebElements.csmConfirmApprovOkButton().click();
	}

	@And("^click on ok button in successful approval of transaction type$")
	public void click_on_ok_button_in_successful_approval_of_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCOmmonWebElements.csmApproveSuccessOkButton());
		csmCOmmonWebElements.csmApproveSuccessOkButton().click();
	}

}
