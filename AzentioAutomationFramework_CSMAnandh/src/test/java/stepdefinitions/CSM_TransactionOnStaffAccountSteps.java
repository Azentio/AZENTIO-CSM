package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_UserAccessObj;
import resources.BaseClass;

public class CSM_TransactionOnStaffAccountSteps extends BaseClass {

	WebDriver driver = BaseClass.driver;

	CSMParam_UserAccessObj userObj = new CSMParam_UserAccessObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	Robot robot;
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ConfigFileReader configFileReader = new ConfigFileReader();
	ExcelData exceldataForTransactionOnStaffAccount = new ExcelData(path, "TrasactionOnStaffAccountTestDat",
			"DataSet ID");
	ExcelData excelDataForTASExecution = new ExcelData(path, "TransactionOnStaffAccount_Execu", "TestCaseID");
	Map<String, String> tasTestData = new HashMap<>();
	Map<String, String> tasExecutionData = new HashMap<>();
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData csmParamLoginTestData = new ExcelData(TestDataPath, "CSMParam_login", "Stage");
	Map<String, String> csmLoginTestData = new HashMap<>();

	@Given("^navigate to CSM Param URL$")
	public void navigate_to_csm_param_url() throws Throwable {
		driver.get(configFileReader.getCSMparamsUrl());
	}

	@And("^enter the user name which got suspended in logged in branch$")
	public void enter_the_user_name_which_got_suspended_in_logged_in_branch() throws Throwable {
		csmLoginTestData = csmParamLoginTestData.getTestdata("CSMParamUser2");
		csmCommonWebElements = new CSMCommonWebElements(driver);
		clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		csmCommonWebElements.csmUserName().click();
		csmCommonWebElements.csmUserName().sendKeys(csmLoginTestData.get("userName"));
	}

	@And("^enter the password in CSM Param$")
	public void enter_the_password_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmPassword());
		csmCommonWebElements.csmPassword().click();
		csmCommonWebElements.csmPassword().sendKeys(csmLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginButon());
		csmCommonWebElements.csmLoginButon().click();
	}

	@And("^enter the branch code in CSM Param$")
	public void enter_the_branch_code_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyCode());
		csmCommonWebElements.csmCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmCompanyCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmCompanyCode().sendKeys(csmLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmCompanyAndBranchLogin());

	}

	@And("^enter the company code in CSM Param$")
	public void enter_the_company_code_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmBranchCode());
		csmCommonWebElements.csmBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmBranchCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmBranchCode().sendKeys(csmLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		csmCommonWebElements.csmCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = csmCommonWebElements.csmBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}
	}

	@And("^click on contine button in CSM Param$")
	public void click_on_contine_button_in_csm_param() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		for (int i = 0; i <= 70; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmForceLogoutYesButton());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmForceLogoutYesButton());
				break;
			} catch (Exception e) {
				if (i == 70) {
					System.out.print("No Force Log out");
				}
			}
		}
	}

	@Then("^verify system wont allow user to login$")
	public void verify_system_wont_allow_user_to_login() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginValidation());
		Assert.assertFalse(csmCommonWebElements.csmLoginValidation().isDisplayed());
	}

	@And("^get the test data for test case id TSA_001_01$")
	public void get_the_test_data_for_test_case_id_tsa00101() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_001_01");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));

	}

	@And("^get the test data for test case id TSA_002_01$")
	public void get_the_test_data_for_test_case_id_tsa00201() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_002_01");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id TSA_003_01$")
	public void get_the_test_data_for_test_case_id_tsa00203() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_003");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id TSA_004_01$")
	public void get_the_test_data_for_test_case_id_tsa00401() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_004");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id TSA_005$")
	public void get_the_test_data_for_test_case_id_tsa005() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_007");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id TSA_006$")
	public void get_the_test_data_for_test_case_id_tsa006() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_006");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id TSA_001_02$")
	public void get_the_test_data_for_test_case_id_tsa00102() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_001_02");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));
	}

	@And("^get the test data for test case id TSA_002_02$")
	public void get_the_test_data_for_test_case_id_tsa00202() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_002_02");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));
	}

	@And("^click on populate user feature$")
	public void click_on_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.userPopulateUserFeature());
		userObj.userPopulateUserFeature().click();
	}

	@And("^click on maintenance under populate user feature$")
	public void click_on_maintenance_under_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenanceFeature());
		userObj.populateUserMaintenanceFeature().click();
	}

	@And("^enter the code under populate user feature$")
	public void enter_the_code_under_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenancePopulateCodeInput());
		userObj.populateUserMaintenancePopulateCodeInput().click();
		userObj.populateUserMaintenancePopulateCodeInput().sendKeys(tasTestData.get("populateCode"));

	}

	@And("^enter the brief description in populate user feature$")
	public void enter_the_brief_description_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenancepopulateBriefNameInput());
		userObj.populateUserMaintenancepopulateBriefNameInput().click();
		userObj.populateUserMaintenancepopulateBriefNameInput()
				.sendKeys(tasTestData.get("populateBriefDescription") + tasTestData.get("populateCode"));
	}

	@And("^enter the long description in populate user feature$")
	public void enter_the_long_description_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenancePopulateLongDescription());
		userObj.populateUserMaintenancePopulateLongDescription().click();
		userObj.populateUserMaintenancePopulateLongDescription()
				.sendKeys(tasTestData.get("populateLongDescription") + tasTestData.get("populateCode"));
	}

	@And("^enter the brief description of arab in populate user feature$")
	public void enter_the_brief_description_of_arab_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenancepopulateBriefNameArabInput());
		userObj.populateUserMaintenancepopulateBriefNameArabInput().click();
		userObj.populateUserMaintenancepopulateBriefNameArabInput()
				.sendKeys(tasTestData.get("populateBriefArabDescription") + tasTestData.get("populateCode"));
	}

	@And("^enter the long description of arab in populate user feature$")
	public void enter_the_long_description_of_arab_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenancepopulateLongDescNameArabInput());
		userObj.populateUserMaintenancepopulateLongDescNameArabInput().click();
		userObj.populateUserMaintenancepopulateLongDescNameArabInput()
				.sendKeys(tasTestData.get("populateBriefArabDescription") + tasTestData.get("populateCode"));
	}

	@And("^enter the user code in populate user feature$")
	public void enter_the_user_code_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenanceTellercodeInput());
		userObj.populateUserMaintenanceTellercodeInput().click();
		userObj.populateUserMaintenanceTellercodeInput().sendKeys(tasTestData.get("populateUserCode"));
		userObj.populateUserMaintenanceScreenLabel().click();
		for (int i = 0; i <= 300; i++) {
			if (!(userObj.populateUserMaintenanceTellercodeInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}

	}

	@And("^check the suspend user in logged in branch flag in populate user maintenance feature$")
	public void check_the_suspend_user_in_logged_in_branch_flag_in_populate_user_maintenance_feature()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag());
		clicksAndActionsHelper.moveToElement(userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag());
		clicksAndActionsHelper.clickOnElement(userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag());
	}

	@Then("^verify user can able to get the valiadation pop up foruser have active transaction$")
	public void verify_user_can_able_to_get_the_valiadation_pop_up_foruser_have_active_transaction() throws Throwable {
		Assert.fail("Need to write the validation step");
	}

	@And("^click on add button under destination branch area$")
	public void click_on_add_button_under_destination_branch_area() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenanceAddButton());
		userObj.populateUserMaintenanceAddButton().click();
	}

	@Then("^verify suspend user in logged in branch flag should un checked$")
	public void verify_suspend_user_in_logged_in_branch_flag_should_un_checked() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementwithFluentwait(driver,
				userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag());
		userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag().sendKeys(tasTestData.get("populateUserCode"));

		try

		{
			userObj.populateUserMaintenanceAddButton().getAttribute("initialvalue").isBlank();
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

	}

	@And("^enter the destination branch code$")
	public void enter_the_destination_branch_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenanceDestinationBranchCode());
		for (int i = 0; i <= 300; i++) {
			try {
				userObj.populateUserMaintenanceDestinationBranchCode().click();
				userObj.populateUserMaintenanceDestinationBranchCode()
						.sendKeys(tasTestData.get("destinationBranchCode"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			if (userObj.populateUserMaintenanceDestinationBranchCode().getAttribute("prevvalue").isBlank()) {
				break;
			}
		}

	}

	@And("^enter the template code in destination branch$")
	public void enter_the_template_code_in_destination_branch() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenanceDestinationBranchTemplateCode());
		userObj.populateUserMaintenanceDestinationBranchTemplateCode().click();
		userObj.populateUserMaintenanceDestinationBranchTemplateCode().clear();
		userObj.populateUserMaintenanceDestinationBranchTemplateCode()
				.sendKeys(tasTestData.get("destinationTemplateCode"));
		for (int i = 0; i <= 300; i++) {
			if (userObj.populateUserMaintenanceDestinationBranchTemplateCode().getAttribute("prevvalue").isBlank()) {
				break;
			}
		}
	}

	@And("^click on save button in populate maintenance screen$")
	public void click_on_save_button_in_populate_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveBtn());
		csmCommonWebElements.csmSaveBtn().click();

	}

	@And("^click on ok button of save confirmation in populate user feature$")
	public void click_on_ok_button_of_save_confirmation_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveConfirmOkButton());
		csmCommonWebElements.csmSaveConfirmOkButton().click();
	}

	@And("^click on ok button after save the record successfully in populate user feature$")
	public void click_on_ok_button_after_save_the_record_successfully_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveSuccessOkButton());
		csmCommonWebElements.csmSaveSuccessOkButton().click();
	}

	@And("^click on approve under populate user feature$")
	public void click_on_approve_under_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserApproveFeature());
		userObj.populateUserApproveFeature().click();

	}

	@And("^search for populate code in populate approve feature$")
	public void search_for_populate_code_in_populate_approve_feature() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateApproveSearchPopulateCode());
		userObj.populateApproveSearchPopulateCode().click();
		userObj.populateApproveSearchPopulateCode().sendKeys(tasTestData.get("populateCode"));
		userObj.populateApproveSearchPopulateCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		String xpath = "(//table[@id='populateTellerList_GridTbl_Id_E000POP']//tr[@id='1']//td[contains(text(),'"
				+ tasTestData.get("populateCode") + "')])[1]";
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

	@Then("^verify suspend user in falg is checked in approval screen$")
	public void verify_suspend_user_in_falg_is_checked_in_approval_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag());

		String falgValue = userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag()
				.getAttribute("initialvalue");
		if (falgValue.equalsIgnoreCase("checked")) {
			System.out.println("Falg is checked");
		} else {
			Assert.fail("Flag is not checked");
		}

	}

	@Then("^verify suspend user in falg is checked in suspend screen$")
	public void verify_suspend_user_in_falg_is_checked_in_suspend_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag());

		String falgValue = userObj.populateUserMaintenanceSuspendUserInLoggedInBranchFlag()
				.getAttribute("initialvalue");
		if (falgValue.equalsIgnoreCase("checked")) {
			System.out.println("Falg is checked");
		} else {
			Assert.fail("Flag is not checked");
		}
	}

	@And("^click on approve button in populate user feature$")
	public void click_on_approve_button_in_populate_user_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveBtnWithLabel());
				clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveBtnWithLabel());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on approve confirmation in populate user feature$")
	public void click_on_approve_confirmation_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populatefeatureConfirmPopulateOkButton());
		userObj.populatefeatureConfirmPopulateOkButton().click();
	}

	@And("^click on ok button after record got apprved in populate user feature$")
	public void click_on_ok_button_after_record_got_apprved_in_populate_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserApproveSuccessPopulateOkButton());
		userObj.populateUserApproveSuccessPopulateOkButton().click();
	}

	@And("^click on populate feature under populate user$")
	public void click_on_populate_feature_under_populate_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserPopulateFeature());
		userObj.populateUserPopulateFeature().click();
	}

	@And("^search for populate code in populate feature$")
	public void search_for_populate_code_in_populate_feature() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateApproveSearchPopulateCode());
		userObj.populateApproveSearchPopulateCode().click();
		userObj.populateApproveSearchPopulateCode().sendKeys(tasTestData.get("populateCode"));
		userObj.populateApproveSearchPopulateCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		String xpath = "//td[text()='" + tasTestData.get("populateCode") + "']";
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

	@And("^click on populate button in populate feature$")
	public void click_on_populate_button_in_populate_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				csmCommonWebElements.closeOkButton().click();
				break;
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateFeaturePpulateButton());
		userObj.populateFeaturePpulateButton().click();
	}

	@And("^click on ok button to confirm the populate process$")
	public void click_on_ok_button_to_confirm_the_populate_process() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populatefeatureConfirmPopulateOkButton());
		userObj.populatefeatureConfirmPopulateOkButton().click();
	}

	@And("^click on ok button after populate process success$")
	public void click_on_ok_button_after_populate_process_success() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populatefeatureSuccessPopulateOkButton());
		userObj.populatefeatureSuccessPopulateOkButton().click();
	}

	@And("^close the miantenance under the populate screen$")
	public void close_the_miantenance_under_the_populate_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserMaintenanceScreenCloseButton());
		userObj.populateUserMaintenanceScreenCloseButton().click();
	}

	@And("^close the approve screen under populate user$")
	public void close_the_approve_screen_under_populate_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserApproveScreenClose());
		userObj.populateUserApproveScreenClose().click();
	}

	@And("^close the populate screen under populate user$")
	public void close_the_populate_screen_under_populate_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.populateUserPopulateScreenClose());
		userObj.populateUserPopulateScreenClose().click();
	}

	@And("^search the populated user ID under the user feature$")
	public void search_the_populated_user_id_under_the_user_feature() throws Throwable {
		robot = new Robot();
		waitHelper.waitForElementwithFluentwait(driver, userObj.userSearchUserCode());
		clicksAndActionsHelper.moveToElement(userObj.userSearchUserCode());
		clicksAndActionsHelper.clickOnElement(userObj.userSearchUserCode());
		userObj.userSearchUserCode().sendKeys(tasTestData.get("populateUserCode"));
		userObj.userSearchUserCode().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("^verify user ID should available in destination branch$")
	public void verify_user_id_should_available_in_destination_branch() throws Throwable {
		boolean displayStatus = false;
		String xpath = "//td[contains(text(),'" + tasTestData.get("populateUserCode") + "')]";
		for (int i = 0; i <= 300; i++) {
			try {
				displayStatus = driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {

			}
		}
		Assert.assertTrue(displayStatus);

	}

	@And("^get the test data for test case TSA_007$")
	public void get_the_test_data_for_test_case_tsa007() throws Throwable {
		tasExecutionData = excelDataForTASExecution.getTestdata("TSA_007");
		tasTestData = exceldataForTransactionOnStaffAccount.getTestdata(tasExecutionData.get("Data Set ID"));
	}

	@And("^click on maintenance screen under user feature$")
	public void click_on_maintenance_screen_under_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.userMaintenance());
		userObj.userMaintenance().click();

	}

	@And("^click on search in user feature$")
	public void click_on_search_in_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSearchButton());
		csmCommonWebElements.csmSearchButton().click();

	}

	@And("^search for suspended user in user feature$")
	public void search_for_suspended_user_in_user_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.userSearchUserCode());
		clicksAndActionsHelper.moveToElement(userObj.userSearchUserCode());
		clicksAndActionsHelper.clickOnElement(userObj.userSearchUserCode());
		userObj.userSearchUserCode().sendKeys(tasTestData.get("Search User Code"));
		userObj.userSearchUserCode().sendKeys(Keys.ENTER);
		robot = new Robot();
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	@And("^select the user in user feature$")
	public void select_the_user_in_user_feature() throws Throwable {
		String xpath = "//td[contains(text(),'" + tasTestData.get("Search User Code") + "')]";
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

	@Then("^verify new status suspended got added along with new sub status$")
	public void verify_new_status_suspended_got_added_along_with_new_sub_status() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userObj.userMaintenanceUserStatus());
		String newUserStatus = userObj.userMaintenanceUserStatus().getText();
		Assert.assertEquals(newUserStatus, "Suspended");
		Assert.fail("New Staus field's code need to add");

	}
}
