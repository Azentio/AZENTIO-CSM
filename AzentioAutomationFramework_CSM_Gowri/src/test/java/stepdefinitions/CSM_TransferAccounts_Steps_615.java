package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM_Transactions_OBJ;
import pageobjects.CSM_TransferAccounts_Obj_615;
import resources.BaseClass;

public class CSM_TransferAccounts_Steps_615 extends BaseClass{
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_TransferAccounts_Obj_615 csmTransferAccountsObj = new CSM_TransferAccounts_Obj_615(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\TestData.xlsx";
	ExcelData csmTransferAccountsExcelData = new ExcelData(path,"CSM_Transactions","DataSet ID");
	Map<String, String> testData;
	
	@Given("user_615 update test data set id for TA_038")
	public void user_615_update_test_data_set_id_for_ta_038() throws Throwable {
		//testData = csmTransactionsExcelData.getTestdata("");
	}

	@And("user_615 click transfer accounts menu options")
	public void user_615_click_transfer_accounts_menu_options() {
       seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsMenu_615());
       seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsMenu_615());
       seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsMenu_615());
	}

	@And("user-615 click maintenance under transfer accounts menu options")
    public void user_615_click_maintenance_under_transfer_accounts_menu_options() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsMaintenanceTab_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsMaintenanceTab_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsMaintenanceTab_615());
	}

	@Then("user_615 select the transfer type under maintenance screen")
	public void user_615_select_the_transfer_type_under_maintenance_screen() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsTransferType615());
        seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmTransferAccountsObj.csmTransferAccountsTransferType615(), testData.get("Transfer Type"));
	}

	@And("user_615 enter the value in reason field")
	public void user_615_enter_the_value_in_reason_field() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsReasonInput615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsReasonInput615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsReasonInput615());
        csmTransferAccountsObj.csmTransferAccountsReasonInput615().sendKeys(testData.get("Reason Input"));
	}

	@And("user_615 click the ranges definition By Cif")
	public void user_615_click_the_ranges_definition_by_cif() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsRangesDefinitionInput615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsRangesDefinitionInput615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsRangesDefinitionInput615());
	}

	@And("user_615 enter the value in cif field")
	public void user_615_enter_the_value_in_cif_field() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsCifInput615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsCifInput615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsCifInput615());
        csmTransferAccountsObj.csmTransferAccountsCifInput615().sendKeys(testData.get(""));
	}

	@And("user_615 enter the value in original GL")
	public void user_615_enter_the_value_in_original_gl() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsOriginalGlInput615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsCifInput615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsCifInput615());
        csmTransferAccountsObj.csmTransferAccountsCifInput615().sendKeys(testData.get(""));
	}

	@And("user_615 enter the value in destination GL")
	public void user_615_enter_the_value_in_destination_gl() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsDestinationGlInput615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsDestinationGlInput615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsDestinationGlInput615());
        csmTransferAccountsObj.csmTransferAccountsDestinationGlInput615().sendKeys(testData.get(""));
	}

	@And("user_615 click set exceptions button")
	public void user_615_click_set_exceptions_button() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_SetExceptions_Button_615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_SetExceptions_Button_615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_SetExceptions_Button_615());
	}

	@And("user_615 click add icon under reason tab")
	public void user_615_click_add_icon_under_reason_tab() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsSetExceptionsAddButton615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsAddButton615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsAddButton615());
	}

	@And("user_615 click exception factor")
	public void user_615_click_exception_factor() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionFactor615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionFactor615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionFactor615());
	}

	@Then("user_615 select the resident value under dropdown")
	public void user_615_select_the_resident_value_under_dropdown() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionFactorDropdown615());
        seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionFactorDropdown615(), "Resident");
	}

	@And("user_615 enter the exception value under reason tab")
	public void user_615_enter_the_exception_value_under_reason_tab() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionValueInput615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionValueInput615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionValueInput615());
        csmTransferAccountsObj.csmTransferAccountsSetExceptionsExceptionValueInput615().sendKeys(testData.get(""));
	}

	@And("user_615 click ok button")
	public void user_615_click_ok_button() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsSetExceptionsReasonScreenOkButton615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsReasonScreenOkButton615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsReasonScreenOkButton615());
  	}

	@And("user_615 click retrieve button")
	public void user_615_click_retrieve_button() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsRetrieveButton615());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsReasonScreenOkButton615());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsSetExceptionsReasonScreenOkButton615());
	}

	@Then("user_615 verify the accounts will be shown successfully")
	public void user_615_verify_the_accounts_will_be_shown_successfully() {
        
	}
	
	@Then("user_615 verify the accounts will be shown sucessfully under maintenance screen")
	public void user_615_verify_the_accounts_will_be_shown_sucessfully_under_maintenance_screen() {
	  
	}
	
	@Given("user_615 update test data set id for TA_039")
	public void user_615_update_test_data_set_id_for_ta_039() throws Throwable {
	    testData = csmTransferAccountsExcelData.getTestdata("");
	}

	@Then("user_615 validate the accounts will be shown sucessfully under maintenance screen")
	public void user_615_validate_the_accounts_will_be_shown_sucessfully_under_maintenance_screen() {
	   
	}

	@Then("user_615 update test data set id for TA_040")
	public void user_615_update_test_data_set_id_for_ta_040() throws Throwable {
		testData = csmTransferAccountsExcelData.getTestdata("");
	}

	@Given("user_615 update test data set id for TA_041")
	public void user_615_update_test_data_set_id_for_ta_041() throws Throwable {
	    testData = csmTransferAccountsExcelData.getTestdata("TA_041_D1");
	}

	@And("user_615 randomly click the transfer accounts maintenance tab")
	public void user_615_randomly_click_the_transfer_accounts_maintenance_tab() {
	    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csmTransferAccountsRandomClick615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csmTransferAccountsRandomClick615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csmTransferAccountsRandomClick615());
	}

	@And("user_615 enter the value in branch code field under from account")
	public void user_615_enter_the_value_in_branch_code_field_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_FromAccount_BranchCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_BranchCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_BranchCode_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_FromAccount_BranchCode_Input_615().sendKeys(testData.get("From Branch Code"));
	}

	@And("user_615 enter the value in currency code field under from account")
	public void user_615_enter_the_value_in_currency_code_field_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_FromAccount_CurrencyCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_CurrencyCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_CurrencyCode_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_FromAccount_CurrencyCode_Input_615().sendKeys(testData.get("From Currency Code "));
	}

	@And("user_615 enter the value in GL code field under from account")
	public void user_615_enter_the_value_in_gl_code_field_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_FromAccount_GlCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_GlCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_GlCode_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_FromAccount_GlCode_Input_615().sendKeys(testData.get("From GL"));
	}
	@And("user_615 enter the value in Cif code field under from account")
	public void user_615_enter_the_value_in_cif_code_field_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_FromAccount_CifCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_CifCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_CifCode_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_FromAccount_CifCode_Input_615().sendKeys(testData.get("From CIF Code"));
	}

	@And("user_615 enter the value in serial no under from account")
	public void user_615_enter_the_value_in_serial_no_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_FromAccount_SerialNo_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_SerialNo_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_FromAccount_SerialNo_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_FromAccount_SerialNo_Input_615().sendKeys(testData.get("From Serial No"));
	}

	@And("user_615 enter the value in branch code under to account")
	public void user_615_enter_the_value_in_branch_code_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_ToAccount_BranchCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_BranchCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_BranchCode_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_ToAccount_BranchCode_Input_615().sendKeys(testData.get("To Branch Code"));
	}

	@And("user_615 enter the value in currency field under to account")
	public void user_615_enter_the_value_in_currency_field_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_ToAccount_CurrencyCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_CurrencyCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_CurrencyCode_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_ToAccount_CurrencyCode_Input_615().sendKeys(testData.get("To Currency Code"));
	}

	@And("user_615 enter the value in GL field under to account")
	public void user_615_enter_the_value_in_gl_field_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_ToAccount_GlCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_GlCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_GlCode_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_ToAccount_GlCode_Input_615().sendKeys(testData.get("To GL"));
	}

	@And("user_615 enter the value in cif field under to account")
	public void user_615_enter_the_value_in_cif_field_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_ToAccount_CifCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_CifCode_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_CifCode_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_ToAccount_CifCode_Input_615().sendKeys(testData.get("To CIF Code"));
	}

	@And("user_615 enter the value in serial no under to account")
	public void user_615_enter_the_value_in_serial_no_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_ToAccount_SerialNo_Input_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_SerialNo_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_ToAccount_SerialNo_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_ToAccount_SerialNo_Input_615().sendKeys(testData.get("To Serial No"));
	}

	@Then("user_615 enter the value in destination branch field")
	public void user_615_enter_the_value_in_destination_branch_field() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Destination_Branch_Input_Field_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Destination_Branch_Input_Field_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_Destination_Branch_Input_Field_615());
	    csmTransferAccountsObj.csm_TransferAccounts_Destination_Branch_Input_Field_615().sendKeys(testData.get("Destination Branch"));
	}
	
	@Then("user_615 click save button")
	public void user_615_click_save_button() {
	    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Save_Button_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Save_Button_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_Save_Button_615());
	}

	@And("user_615 navigate to click the approve submenu")
	public void user_615_navigate_to_click_the_approve_submenu() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Approve_Submenu_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Approve_Submenu_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_Approve_Submenu_615());
	}

	@And("user_615 enter the value in from GL input field")
	public void user_615_enter_the_value_in_from_gl_input_field() {
	    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615());
	    seleniumActions.getJavascriptHelper().scrollIntoView(csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615());
	    csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615().sendKeys(testData.get("From GL"));
	}

	@And("user_615 retrieve the saved record under approve submenu")
	public void user_615_retrieve_the_saved_record_under_approve_submenu() {
	   seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_DoubleClick_615());
	   seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615());
	   seleniumActions.getClickAndActionsHelper().doubleClick(csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615());
	}

	@Then("user_615 click approve button")
	public void user_615_click_approve_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_ApproveButton_615());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_ApproveButton_615());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_ApproveSubmenu_ApproveButton_615());
	}

	@And("user_615 navigate to click transfer submenu")
	public void user_615_navigate_to_click_transfer_submenu() {
	    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_615());
	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_615());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_615());
	}

	@And("user_615 click and enter the value in batch no")
	public void user_615_click_and_enter_the_value_in_batch_no() {
	   seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_BatchNo_615());
	   seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_BatchNo_615());
	   seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_BatchNo_615());
	   csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_BatchNo_615().sendKeys(testData.get(""));
	}

	@And("user_615 retrieve the authorized record under transfer submenu")
	public void user_615_retrieve_the_authorized_record_under_transfer_submenu() {
	   seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_BatchNo_DoubleClick_615());
	   seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_BatchNo_DoubleClick_615());
	   seleniumActions.getClickAndActionsHelper().doubleClick(csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_BatchNo_DoubleClick_615());
	}

	@Then("user_615 click transfer button")
	public void user_615_click_transfer_button() {
	   seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_TransferButton_615());
	   seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_TransferButton_615());
	   seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_Transfer_SubMenu_TransferButton_615());
	}
	
	@And("user_615 update test data set id for TA_042")
	public void user_615_update_test_data_set_id_for_ta_042() throws Throwable {
	    testData = csmTransferAccountsExcelData.getTestdata(testData.get(""));
	}
	
	@And("user_615 click search icon under maintenance screen")
	public void user_615_click_search_icon_under_maintenance_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Maintenance_SearchIcon_615());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Maintenance_SearchIcon_615());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_Maintenance_SearchIcon_615());
	}

	@And("user_615 enter the batch no")
	public void user_615_enter_the_batch_no() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Maintenance_BatchNo_615());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_TransferAccounts_Maintenance_BatchNo_615());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_TransferAccounts_Maintenance_BatchNo_615());
		csmTransferAccountsObj.csm_TransferAccounts_Maintenance_BatchNo_615().sendKeys(testData.get(""));
	}

	@Then("user_615 validate the status authorized")
	public void user_615_validate_the_status_authorized() {
	    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_TransferAccounts_Maintenance_Validate_Status_615());
	    Assert.assertTrue(csmTransferAccountsObj.csm_TransferAccounts_Maintenance_Validate_Status_615().isDisplayed());
	}

	@And("user_615 navigate to click the accounts menu options")
	public void user_615_navigate_to_click_the_accounts_menu_options() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_Accounts_MenuOptions_615());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_Accounts_MenuOptions_615());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_Accounts_MenuOptions_615());
	}

	@And("user_615 click general accounts")
	public void user_615_click_general_accounts() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_Accounts_GeneralAccounts_615());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_Accounts_GeneralAccounts_615());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_Accounts_GeneralAccounts_615());
	}

	@And("user_615 click maintenance under general accounts")
	public void user_615_click_maintenance_under_general_accounts() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_AccountsMenu_Maintenance_SubMenu_615());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_AccountsMenu_Maintenance_SubMenu_615());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_AccountsMenu_Maintenance_SubMenu_615());
	}

	@And("user_615 enter the value in GL Code input field under maintenance")
	public void user_615_enter_the_value_in_gl_code_input_field_under_maintenance() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsObj.csm_AccountsMenu_Gl_Code_Input_615());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsObj.csm_AccountsMenu_Gl_Code_Input_615());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsObj.csm_AccountsMenu_Gl_Code_Input_615());
	}

	@Then("user_615 verify the closed status")
	public void user_615_verify_the_closed_status() {
	    
	}
}
