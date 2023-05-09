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
import pageobjects.csmParam.CSMPARAM_GeneralLedgerObj;
import resources.BaseClass;

public class CSMParam_GeneralLedgerSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	DropDownHelper dropdownHelper = new DropDownHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMPARAM_GeneralLedgerObj csmParamGeneralLedgerObj = new CSMPARAM_GeneralLedgerObj(driver);
	String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData exelDataForGeneralLedger = new ExcelData(testDataPath, "CSMParam_GeneralLedgerTestData", "DataSet ID");
	ExcelData exelDataForAccountType = new ExcelData(testDataPath, "CSMParam_AccountTypeTestData", "DataSet ID");
	Map<String, String> glCreationTestData = new HashMap<>();

	@And("^click on parameter module$")
	public void click_on_parameter_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.csmParamParameters());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.csmParamParameters());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.csmParamParameters());
	}

	@And("^click on accounts parameter$")
	public void click_on_accounts_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.parametersAccountsParameters());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.parametersAccountsParameters());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.parametersAccountsParameters());
	}

	@And("^get the test data for gl Creation$")
	public void get_the_test_data_for_gl_creation() throws Throwable {
		glCreationTestData = exelDataForGeneralLedger.getTestdata("DS01_Pre_req_GL_01");
	}

	@And("^click on general ledger module$")
	public void click_on_general_ledger_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.accountsParametersGeneralLedger());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.accountsParametersGeneralLedger());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.accountsParametersGeneralLedger());
	}

	@And("^click on maintenance under general ledger$")
	public void click_on_maintenance_under_general_ledger() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerMaintenance());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerMaintenance());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerMaintenance());
	}

	@And("^enter the GL code under gl maintenance$")
	public void enter_the_gl_code_under_gl_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerCode());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerCode());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerCode());
		csmParamGeneralLedgerObj.generalLedgerCode().sendKeys(glCreationTestData.get("Code"));

	}

	@And("^enter the brief name under gl maintenance$")
	public void enter_the_brief_name_under_gl_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerBriefName());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerBriefName());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerBriefName());
		csmParamGeneralLedgerObj.generalLedgerBriefName().sendKeys(glCreationTestData.get("Brief Name"));
	}

	@And("^enter the long name under Gl maintenance$")
	public void enter_the_long_name_under_gl_maintenance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerLongName());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerLongName());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerLongName());
		csmParamGeneralLedgerObj.generalLedgerLongName().sendKeys(glCreationTestData.get("Long Name"));
	}

	@And("^click on additional details tab$")
	public void click_on_additional_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerAdditionalDetails());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerAdditionalDetails());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerAdditionalDetails());
	}

	@And("^select the Gl category$")
	public void select_the_gl_category() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerGlCategory());
		dropdownHelper.SelectUsingVisibleText(csmParamGeneralLedgerObj.generalLedgerGlCategory(),
				glCreationTestData.get("Gl Category"));

	}

	@And("^enter the Account sign under addditional details tab$")
	public void enter_the_account_sign_under_addditional_details_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerAccountSign());
		dropdownHelper.SelectUsingVisibleText(csmParamGeneralLedgerObj.generalLedgerAccountSign(),
				glCreationTestData.get("Account Sign"));
	}

	@And("^save the gl record$")
	public void save_the_gl_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerSave());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerSave());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerSave());
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerSavePopupOkButton());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerSavePopupOkButton());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerSavePopupOkButton());
	}

	@And("^click on approve module under GL screen$")
	public void click_on_approve_module_under_gl_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerApprove());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerApprove());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerApprove());
	}

	@And("^search for saved record in approve screen$")
	public void search_for_saved_record_in_approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerApproveSearchGlCode());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerApproveSearchGlCode());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerApproveSearchGlCode());
		csmParamGeneralLedgerObj.generalLedgerApproveSearchGlCode().sendKeys(glCreationTestData.get("Code"));
		csmParamGeneralLedgerObj.generalLedgerApproveSearchGlCode().sendKeys(Keys.ENTER);

	}

	@And("^select the Gl record from search suggestion$")
	public void select_the_gl_record_from_search_suggestion() throws Throwable {
		String xpath = "(//tr//td[text()='" + glCreationTestData.get("Code") + "'])[1]";
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

	@And("^click on approve button in general ledger record$")
	public void click_on_approve_button_in_general_ledger_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerApproveButon());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerApproveButon());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerApproveButon());
	}

	@And("^click on ok button in confirm popup under Gl approval$")
	public void click_on_ok_button_in_confirm_popup_under_gl_approval() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerConfirmApproveButon());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerConfirmApproveButon());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerConfirmApproveButon());
	}

	@And("^click on ok button after approval in Gl$")
	public void click_on_ok_button_after_approval_in_gl() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmParamGeneralLedgerObj.generalLedgerAfterApproveOkButon());
		clicksAndActionsHelper.moveToElement(csmParamGeneralLedgerObj.generalLedgerAfterApproveOkButon());
		clicksAndActionsHelper.clickOnElement(csmParamGeneralLedgerObj.generalLedgerAfterApproveOkButon());
		exelDataForAccountType.updateTestData("DS01_Pre_req_actType_01", "Type Code", glCreationTestData.get("Code"));
	}
}
