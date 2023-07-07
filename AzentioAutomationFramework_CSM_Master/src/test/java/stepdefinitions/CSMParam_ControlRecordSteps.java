package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
import pageobjects.csmParam.CSMParam_ControlRecordsObj;
import resources.BaseClass;

public class CSMParam_ControlRecordSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	CSMParam_ControlRecordsObj controlRecordsObj = new CSMParam_ControlRecordsObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	String csmParampath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForCheuqeBookRequestExecution = new ExcelData(path, "CheuqeBookRequestExecutionTrack",
			"TestCaseID");
	ExcelData excelDataforControlRecords = new ExcelData(csmParampath, "CSMParam_ControlRecordsTestData", "DataSet ID");
	Map<String, String> chequbookRequestExecutionData = new HashMap<>();
	Map<String, String> controlRecordsTestData = new HashMap<>();
	DropDownHelper dropdownHelper = new DropDownHelper(driver);

	@And("get the test data for test case ID CHB_081_02")
	public void get_the_test_data_for_test_case_id_CHB_081_02() throws Throwable {
		chequbookRequestExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_081_02");

		controlRecordsTestData = excelDataforControlRecords
				.getTestdata(chequbookRequestExecutionData.get("Data Set ID"));
	}
	@And("get the test data for test case ID CHB_075_01")
	public void get_the_test_data_for_test_case_id_CHB_075_01() throws Throwable {
		chequbookRequestExecutionData = excelDataForCheuqeBookRequestExecution.getTestdata("CHB_075_01");

		controlRecordsTestData = excelDataforControlRecords
				.getTestdata(chequbookRequestExecutionData.get("Data Set ID"));
	}

	@And("^click on parametters feature in csm Param$")
	public void click_on_parametters_feature_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.csmParamParameterFeature());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.csmParamParameterFeature());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.csmParamParameterFeature());
	}

	@And("^click on system parameters feature$")
	public void click_on_system_parameters_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.parametersSystemParametersFeature());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.parametersSystemParametersFeature());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.parametersSystemParametersFeature());
	}

	@And("^click on control records sub feature$")
	public void click_on_control_records_sub_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.parameterControlRecordsFeature());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.parameterControlRecordsFeature());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.parameterControlRecordsFeature());
	}

	@And("^click on update after approve in control records$")
	public void click_on_update_after_approve_in_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordUpdateAfterApproveFeature());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordUpdateAfterApproveFeature());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordUpdateAfterApproveFeature());
	}

	@And("un check the chequebook advance process in control record")
	public void un_check_the_chequebook_advance_process_in_control_record() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				controlRecordsObj.controlRecordsAdvancedChequebookProcessFlag());
		String reasonOnRejecting = controlRecordsObj.controlRecordsAdvancedChequebookProcessFlag()
				.getAttribute("initialvalue");
		if (reasonOnRejecting.equals("checked")) {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsAdvancedChequebookProcessFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsAdvancedChequebookProcessFlag());
		} else {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsAdvancedChequebookProcessFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsAdvancedChequebookProcessFlag());
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsAdvancedChequebookProcessFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsAdvancedChequebookProcessFlag());
		}
	}

	@And("^check the reason on rejecting label in control records$")
	public void check_the_reason_on_rejecting_label_in_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsReasonOnRejectingFlag());
		String reasonOnRejecting = controlRecordsObj.controlRecordsReasonOnRejectingFlag().getAttribute("initialvalue");
		if (reasonOnRejecting.equalsIgnoreCase("checked")) {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
		} else {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
		}

	}

	@And("^uncheck the reason on rejecting label in control records$")
	public void uncheck_the_reason_on_rejecting_label_in_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsReasonOnRejectingFlag());
		String reasonOnRejecting = controlRecordsObj.controlRecordsReasonOnRejectingFlag().getAttribute("initialvalue");
		if (reasonOnRejecting.isBlank()) {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
		} else {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsReasonOnRejectingFlag());
		}
	}

	@And("^click on other information tab in control records$")
	public void click_on_other_information_tab_in_control_records() throws Throwable {
		clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsOtherInformationTab());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsOtherInformationTab());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsOtherInformationTab());
	}

	@And("^click on record rejection reason in mandatory falg in control records$")
	public void click_on_record_rejection_reason_in_mandatory_falg_in_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
		String reasonOnRejecting = controlRecordsObj.controlRecordsRejectReasonMandatoryFlag()
				.getAttribute("initialvalue");
		if (reasonOnRejecting.equalsIgnoreCase("checked")) {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
		} else {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
		}
	}

	@And("^uncheck the reject reason is mandatory field in conntrol records$")
	public void uncheck_the_reject_reason_is_mandatory_field_in_conntrol_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
		String reasonOnRejecting = controlRecordsObj.controlRecordsRejectReasonMandatoryFlag()
				.getAttribute("initialvalue");
		if (reasonOnRejecting.isBlank()) {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());

		} else {
			clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
			clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsRejectReasonMandatoryFlag());
		}
	}

	@And("select the cheque based on dropdown to account")
	public void select_the_cheque_based_on_dropdown_to_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown());
		dropdownHelper.SelectUsingIndex(controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown(), 1);
		dropdownHelper.SelectUsingIndex(controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown(), 2);
		dropdownHelper.SelectUsingIndex(controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown(), 1);
		dropdownHelper.SelectUsingVisibleText(controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown(),
				controlRecordsTestData.get("Cheque Unique Based On"));
	}
	@And("select the cheque based on dropdown to branch")
	public void select_the_cheque_based_on_dropdown_to_branch() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown());
		dropdownHelper.SelectUsingIndex(controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown(), 1);
		dropdownHelper.SelectUsingIndex(controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown(), 2);
		dropdownHelper.SelectUsingIndex(controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown(), 1);
		dropdownHelper.SelectUsingVisibleText(controlRecordsObj.controlRecordsChequeUniqueBasedOnDropdown(),
				controlRecordsTestData.get("Cheque Unique Based On"));
	}

	@And("^click on update after approve screen under control records$")
	public void click_on_update_after_approve_screen_under_control_records() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmParamUpdateAfterApproveBtn());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmParamUpdateAfterApproveBtn());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmParamUpdateAfterApproveBtn());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("^click on ok button for update confirmation in control records$")
	public void click_on_ok_button_for_update_confirmation_in_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.updateOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.updateOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.updateOkButton());
	}

	@And("^close the update after approve screen on control records$")
	public void close_the_update_after_approve_screen_on_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controRecordUpdatAfterApproveTabClose());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.controRecordUpdatAfterApproveTabClose());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.controRecordUpdatAfterApproveTabClose());
	}

	@And("^click on ok button in save confirmation of control records$")
	public void click_on_ok_button_in_save_confirmation_of_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveConfirmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveConfirmOkButton());
	}

	@And("^clik on ok button while close the update after approve of control records$")
	public void clik_on_ok_button_while_close_the_update_after_approve_of_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
	}

	@And("^click on approve feature under control records$")
	public void click_on_approve_feature_under_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordApproveFeature());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordApproveFeature());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordApproveFeature());
	}

	@And("^approve the control records feature$")
	public void approve_the_control_records_feature() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(csmCommonWebElements.csmApproveBtnWithLabel());
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveBtnWithLabel());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveBtnWithLabel());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on ok in approve confirmation in control records$")
	public void click_on_ok_in_approve_confirmation_in_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmConfirmApprovOkButton());
	}

	@And("^click on ok button in approve successful pop up in control records$")
	public void click_on_ok_button_in_approve_successful_pop_up_in_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveSuccessOkButton());
	}

	@And("^click on alert activation tab under control records$")
	public void click_on_alert_activation_tab_under_control_records() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.controlRecordsAlertActivationTab());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.controlRecordsAlertActivationTab());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.controlRecordsAlertActivationTab());
	}

	@And("^open the account balance over drawn section$")
	public void open_the_account_balance_over_drawn_section() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, controlRecordsObj.alertActivationTabAccountBalanceOverDrawn());
		clicksAndActionsHelper.moveToElement(controlRecordsObj.alertActivationTabAccountBalanceOverDrawn());
		clicksAndActionsHelper.clickOnElement(controlRecordsObj.alertActivationTabAccountBalanceOverDrawn());
		clicksAndActionsHelper.doubleClick(controlRecordsObj.alertActivationTabAccountBalanceOverDrawn());
	}

	@Then("^verify transaction on staff account field got added in control records$")
	public void verify_transaction_on_staff_account_field_got_added_in_control_records() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(controlRecordsObj.alertActivationTabStaffAccountTransactions());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(controlRecordsObj.alertActivationTabStaffAccountTransactions().isDisplayed());
	}

}
