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
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.csmParam.CSMParam_AccountsTypeObj;
import resources.BaseClass;

public class CSMParam_AccountTypeSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	CSMParam_AccountsTypeObj accountTypeObj = new CSMParam_AccountsTypeObj(driver);
	DropDownHelper dropdownHelper = new DropDownHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData exelDataForAccountType = new ExcelData(testDataPath, "CSMParam_AccountTypeTestData", "DataSet ID");
	ExcelData exelDataForUserAccess = new ExcelData(testDataPath, "CSMParam_userAccessTestData", "DataSet ID");
	Map<String,String> accountTypeTestData= new HashMap<>();
	
	@And("^click on account type module$")
	public void click_on_account_type_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountsParameterAccountsType());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountsParameterAccountsType());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountsParameterAccountsType());
	}

	@And("^click on maintenance under account type$")
	public void click_on_maintenance_under_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeMaintenance());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeMaintenance());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeMaintenance());
	}
	@And("^get the test data for creating account type$")
    public void get_the_test_data_for_creating_account_type() throws Throwable {
		accountTypeTestData=exelDataForAccountType.getTestdata("DS01_Pre_req_actType_01");
    }
	@And("^enter the gl code in account type$")
	public void enter_the_gl_code_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeGlCode());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeGlCode());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeGlCode());
		accountTypeObj.accountTypeGlCode().sendKeys(accountTypeTestData.get("Type Code"));
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeBriefnameDescription());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeBriefnameDescription());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeBriefnameDescription());
		for (int i = 0; i <= 500; i++) {
			if (!(accountTypeObj.accountTypeBriefnameDescription().getAttribute("prevvalue").isEmpty())) {
				break;
			} else if (i == 500) {
				Assert.fail("data not populated");
			}
		}

	}

	@And("^click on instructions tab in account type$")
	public void click_on_instructions_tab_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeInstructionTab());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeInstructionTab());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeInstructionTab());

	}

	@And("^select the gl category in account type$")
	public void select_the_gl_category_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeCategoryDropdown());
		dropdownHelper.SelectUsingVisibleText(accountTypeObj.accountTypeCategoryDropdown(), accountTypeTestData.get("category"));
	}

	@And("^select the Period in account type$")
	public void select_the_period_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypePeriodDropdown());
		dropdownHelper.SelectUsingVisibleText(accountTypeObj.accountTypePeriodDropdown(), accountTypeTestData.get("Period"));

	}

	@And("^select the client bank in account type$")
	public void select_the_client_bank_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeClientBankDropdown());
		dropdownHelper.SelectUsingVisibleText(accountTypeObj.accountTypeClientBankDropdown(), accountTypeTestData.get("Client bank"));
	}

	@And("^click on sve button in account type$")
	public void click_on_sve_button_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeSaveButton());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeSaveButton());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeSaveButton());
	}

	@And("^click on confirm ok button in account type$")
	public void click_on_confirm_ok_button_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeSaveConfirmOkButton());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeSaveConfirmOkButton());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeSaveConfirmOkButton());
	}

	@And("^click on ok button after save the account type record$")
	public void click_on_ok_button_after_save_the_account_type_record() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeSaveSuccessOkButton());
				clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeSaveSuccessOkButton());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on approve screen under account type$")
	public void click_on_approve_screen_under_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeApproveTab());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeApproveTab());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeApproveTab());
	}

	@And("^enter the gl code and search in account type approval screen$")
	public void enter_the_gl_code_and_search_in_account_type_approval_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeApproveSearchGlCode());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeApproveSearchGlCode());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeApproveSearchGlCode());
		accountTypeObj.accountTypeApproveSearchGlCode().sendKeys(accountTypeTestData.get("Type Code"));
		accountTypeObj.accountTypeApproveSearchGlCode().sendKeys(Keys.ENTER);
	}

	@And("^select the record from suggestio in Account type$")
	public void select_the_record_from_suggestio_in_account_type() throws Throwable {
		String xpath = "(//td[text()='" + accountTypeTestData.get("Type Code") + "'])[1]";
		for (int i = 0; i <= 500; i++)

		{
			try {
				clicksAndActionHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^approve the account type record$")
	public void approve_the_account_type_record() throws Throwable {
		Thread.sleep(6000);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(accountTypeObj.accountTypeApproveButton());
				clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeApproveButton());
				clicksAndActionHelper.doubleClick(accountTypeObj.accountTypeApproveButton());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on ok buttton for confirm approval in account type$")
	public void click_on_ok_buttton_for_confirm_approval_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeConfirmApprovOkButton());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeConfirmApprovOkButton());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeConfirmApprovOkButton());
	}

	@And("^click on ok button after approve thee record in account type$")
	public void click_on_ok_button_after_approve_thee_record_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, accountTypeObj.accountTypeApproveSuccessOkButton());
		clicksAndActionHelper.moveToElement(accountTypeObj.accountTypeApproveSuccessOkButton());
		clicksAndActionHelper.clickOnElement(accountTypeObj.accountTypeApproveSuccessOkButton());
		exelDataForUserAccess.updateTestData("DS01_ActType_Acces_03", "AccountType",accountTypeTestData.get("Type Code"));
		exelDataForUserAccess.updateTestData("DS01_ActType_Acces_04", "AccountType",accountTypeTestData.get("Type Code"));
	}

}
