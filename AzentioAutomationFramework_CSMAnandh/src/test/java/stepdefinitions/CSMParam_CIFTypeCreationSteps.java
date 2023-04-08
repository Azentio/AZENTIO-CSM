package stepdefinitions;

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
import pageobjects.csmParam.CIFTypeCreationObj;
import resources.BaseClass;

public class CSMParam_CIFTypeCreationSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	CIFTypeCreationObj cifTypeCreationObj = new CIFTypeCreationObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData excelDataforCIFType = new ExcelData(testDataPath, "CSMParam_CIFTypeTestData", "DataSet ID");
	ExcelData exelDataForUserAccess = new ExcelData(testDataPath, "CSMParam_userAccessTestData", "DataSet ID");
	Map<String, String> cifTypeTestData = new HashMap<>();

	@And("^click on CIF parameter module$")
	public void click_on_cif_parameter_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.csmParamCifParameterMainModule());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.csmParamCifParameterMainModule());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.csmParamCifParameterMainModule());
	}

	@And("^click o CIF type module$")
	public void click_o_cif_type_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.csmParamCifTypeMainModule());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.csmParamCifTypeMainModule());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.csmParamCifTypeMainModule());
	}

	@And("^click on maintenance screen under CIF type module$")
	public void click_on_maintenance_screen_under_cif_type_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeMaintenance());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeMaintenance());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeMaintenance());
	}

	@And("^get the test data for creating the CIF type record$")
	public void get_the_test_data_for_creating_the_cif_type_record() throws Throwable {
		cifTypeTestData = excelDataforCIFType.getTestdata("DS_01_CIFType_01");
	}

	@And("^enter the cif Type code in code input box$")
	public void enter_the_cif_type_code_in_code_input_box() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeInputBox());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeInputBox());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeInputBox());
		cifTypeCreationObj.cifTypeInputBox().sendKeys(cifTypeTestData.get("CIF Type Code"));
	}

	@And("^enter the brief name in cif type$")
	public void enter_the_brief_name_in_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeBriefNameInput());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeBriefNameInput());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeBriefNameInput());
		cifTypeCreationObj.cifTypeBriefNameInput()
				.sendKeys(cifTypeTestData.get("CIF Type Code") + cifTypeTestData.get("Brief Name"));
	}

	@And("^enter the long name in cif type$")
	public void enter_the_long_name_in_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeLongNameInput());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeLongNameInput());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeLongNameInput());
		cifTypeCreationObj.cifTypeLongNameInput()
				.sendKeys(cifTypeTestData.get("CIF Type Code") + cifTypeTestData.get("Long Name"));
	}

	@And("^choose the CIF type as individual CIF$")
	public void choose_the_cif_type_as_individual_cif() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeIndividualCIFradioOption());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeIndividualCIFradioOption());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeIndividualCIFradioOption());

	}

	@And("^choose CIF is a client$")
	public void choose_cif_is_a_client() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeCIFIsAClientOption());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeCIFIsAClientOption());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeCIFIsAClientOption());
	}

	@And("^enter the value of economic sector in CIF type$")
	public void enter_the_value_of_economic_sector_in_cif_type() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(cifTypeCreationObj.cifTypeEcoSectorInputBox());
				clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeEcoSectorInputBox());
				clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeEcoSectorInputBox());
				cifTypeCreationObj.cifTypeEcoSectorInputBox().sendKeys(cifTypeTestData.get("Economic Sector"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeEcoSectorDescription());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeEcoSectorDescription());
		for (int i = 0; i <= 200; i++) {
			if (!(cifTypeCreationObj.cifTypeEcoSectorDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 200) {
				Assert.fail("data is not populated");
			}
		}
	}

	@And("^enter the the role code in CIF type$")
	public void enter_the_the_role_code_in_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeRoleCodeInputBox());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeRoleCodeInputBox());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeRoleCodeInputBox());
		cifTypeCreationObj.cifTypeRoleCodeInputBox().sendKeys(cifTypeTestData.get("Role"));
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeRoleCodeDescription());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeRoleCodeDescription());
		for (int i = 0; i <= 200; i++) {
			if (!(cifTypeCreationObj.cifTypeRoleCodeDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 200) {
				Assert.fail("data is not populated");
			}
		}
	}

	@And("^enter the subeconomic sector in CIF type$")
	public void enter_the_subeconomic_sector_in_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeSubEcoSectorInputBox());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeSubEcoSectorInputBox());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeSubEcoSectorInputBox());

		cifTypeCreationObj.cifTypeSubEcoSectorInputBox().sendKeys(cifTypeTestData.get("Sub Economic Sector"));
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeSubEcoSectorDescription());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeSubEcoSectorDescription());
		for (int i = 0; i <= 200; i++) {
			if (!(cifTypeCreationObj.cifTypeSubEcoSectorDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 200) {
				Assert.fail("data is not populated");
			}
		}
	}

	@And("^enter the legal status in CIf type$")
	public void enter_the_legal_status_in_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeLegalStatusInputBox());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeLegalStatusInputBox());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeLegalStatusInputBox());
		cifTypeCreationObj.cifTypeLegalStatusInputBox().sendKeys(cifTypeTestData.get("Legal Status"));
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeLegalStatusDescription());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeLegalStatusDescription());
		for (int i = 0; i <= 200; i++) {
			if (!(cifTypeCreationObj.cifTypeLegalStatusDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 200) {
				Assert.fail("data is not populated");
			}
		}
	}

	@And("^click on allowed account type section$")
	public void click_on_allowed_account_type_section() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(cifTypeCreationObj.cifTypeAllowedAccountTypeTab());
				clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeAllowedAccountTypeTab());
				clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeAllowedAccountTypeTab());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on add button under allowed account type$")
	public void click_on_add_button_under_allowed_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeAllowedAccountTypeAddButton());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeAllowedAccountTypeAddButton());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeAllowedAccountTypeAddButton());
	}

	@And("^enter the Gl code in allowed account type$")
	public void enter_the_gl_code_in_allowed_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeAllowedAccountTypeGlCodeTextBox());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeAllowedAccountTypeGlCodeTextBox());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeAllowedAccountTypeGlCodeTextBox());
		cifTypeCreationObj.cifTypeAllowedAccountTypeGlCodeTextBox().sendKeys(cifTypeTestData.get("Allow Gl Code"));
		waitHelper.waitForElementwithFluentwait(driver,
				cifTypeCreationObj.cifTypeAllowedAccountTypeNumberOfAccountsTextBox());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeAllowedAccountTypeNumberOfAccountsTextBox());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeAllowedAccountTypeNumberOfAccountsTextBox());
	}

	@And("^click on save button in account type screen$")
	public void click_on_save_button_in_account_type_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveButton());
	}

	@And("^click ok button in confirm save in CIF type$")
	public void click_ok_button_in_confirm_save_in_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveConfirmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveConfirmOkButton());
	}

	@And("^click on save confirmation OK button after saving the CIF type record$")
	public void click_on_save_confirmation_ok_button_after_saving_the_cif_type_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveSuccessOkButton());
	}

	@And("^click approve module under CIf type$")
	public void click_approve_module_under_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeApproveModule());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeApproveModule());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeApproveModule());
	}

	@And("^search the CIf type code$")
	public void search_the_cif_type_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, cifTypeCreationObj.cifTypeSearchCIFCode());
		clicksAndActionsHelper.moveToElement(cifTypeCreationObj.cifTypeSearchCIFCode());
		clicksAndActionsHelper.clickOnElement(cifTypeCreationObj.cifTypeSearchCIFCode());
		cifTypeCreationObj.cifTypeSearchCIFCode().sendKeys(cifTypeTestData.get("CIF Type Code"));
		cifTypeCreationObj.cifTypeSearchCIFCode().sendKeys(Keys.ENTER);
	}

	@And("^select the CIF code in suggested result$")
	public void select_the_cif_code_in_suggested_result() throws Throwable {
		String xPath = "(//td[text()='" + cifTypeTestData.get("CIF Type Code") + "'])[2]";
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xPath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xPath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xPath)));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on approve button in CIF type$")
	public void click_on_approve_button_in_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmApproveButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveButton());
	}

	@And("^click on ok in approve confirmation in CIF type$")
	public void click_on_ok_in_approve_confirmation_in_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmConfirmApprovOkButton());
	}

	@And("^click on ok in after approval confirmation$")
	public void click_on_ok_in_after_approval_confirmation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveSuccessOkButton());
		exelDataForUserAccess.updateTestData("DS01_ActType_Acces_04", "CIFType", cifTypeTestData.get("CIF Type Code"));
	}

}
