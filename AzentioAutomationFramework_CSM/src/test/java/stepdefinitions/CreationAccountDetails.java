package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import pageobjects.AccountCreation;
import pageobjects.Transaction_Suspend;
import resources.BaseClass;

public class CreationAccountDetails {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	AccountCreation AccountCreationobject = new AccountCreation(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	ExcelData exceldata = new ExcelData("C:\\Users\\ININDC00075\\git\\AZENTIO-CSM_sridhar10\\AzentioAutomationFramework_CSM\\TestData\\CSM_Transaction", "User_Transaction", "Data Set ID");
	

	@Given("User Login to CSM Param process in Transfer Account")

	public void user_login_to_csm_param_process_in_transfer_account() {
		 driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMApplication();
	    
	}

	 

	@And("User click the click the Maintenance in CSM param in CSM param")

	public void User_click_the_click_the_maintenance_in_csm_param_in_csm_param() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Maintenance12(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Maintenance12());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Maintenance12());

	}

	 

	@And("User click the system parameters in CSM Param")

	public void User_click_the_system_parameters_in_csm_param() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.SystemParametersbutton(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.SystemParametersbutton());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.SystemParametersbutton());


	}

	 

	@And("User click the Account Parameters in Transfer Account")

	public void user_click_the_account_parameters_in_transfer_account() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.AccountParametertransfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.AccountParametertransfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.AccountParametertransfer());

	}

	 

	@And("User click the General Leger in Transfer")

	public void user_click_the_general_leger_in_transfer(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.GeneralLedgerTransfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.GeneralLedgerTransfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.GeneralLedgerTransfer());
		
	}

	 

	@And("User Enter the GL Code Value in Transfer")

	public void user_enter_the_gl_code_value_in_transfer(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Gl_Code_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Gl_Code_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Gl_Code_Transfer());
		AccountCreationobject.GeneralLedgerTransfer().sendKeys(testData.get("GL Value"));
	}

	 

	@And("User Enter Brief Name details in Transfer Account")

	public void user_enter_brief_name_details_in_transfer_account(Integer int1) {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.BrifeName_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.BrifeName_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.BrifeName_Transfer());
		AccountCreationobject.BrifeName_Transfer().sendKeys(testData.get("Brief Name"));
	    
	}

	 

	@And("User Enter Long Name details in Transfer Account")

	public void user_enter_long_name_details_in_transfer_account(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.LongName_transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.LongName_transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.LongName_transfer());
		AccountCreationobject.LongName_transfer().sendKeys(testData.get("Long Name"));
	}

	 

	@And("User click the Additional details in Transfer Account")

	public void user_click_the_additional_details_in_transfer_account(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Additionaldetails_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Additionaldetails_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Additionaldetails_Transfer());

	}

	 

	@And("User Select GL Category in Transfer Account")

	public void user_select_gl_category_in_transfer_account(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.GL_Category_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.GL_Category_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.GL_Category_Transfer());
		AccountCreationobject.GL_Category_Transfer().sendKeys(testData.get("GL Category"));
	}

	 

	@And("User Select Account Sign in Transfer Account")

	public void user_select_account_sign_in_transfer_account(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.aCCOUNTsIGN_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.aCCOUNTsIGN_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.aCCOUNTsIGN_Transfer());
		AccountCreationobject.aCCOUNTsIGN_Transfer().sendKeys(testData.get("Account Sign"));
	}

	 

	@And("User click the Save button")

	public void user_click_the_save_button(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Save_AccountType_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Save_AccountType_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Save_AccountType_Transfer());
	}

	 

	@And("User click the Popup msg Success")

	public void user_click_the_popup_msg_success(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.POPupmsg(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.POPupmsg());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.POPupmsg());

	}

	 

	@And("User Click the Approve button")

	public void user_click_the_approve_button(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Approve_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Approve_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Approve_Transfer());

	}

	 

	@And("User Enter the Transfer code value in Transfer Account")

	public void user_enter_the_transfer_code_value_in_transfer_account(Integer int1) {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CodevalueGL(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Approve_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Approve_Transfer());

	}

	 

	@And("User Click the double click the Transfer code details")

	public void user_click_the_double_click_the_transfer_code_details(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.doubleClickUserInUpdateAfterApprove(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());

	}

	 

	@And("User Click the Submit Approve Button")

	public void user_click_the_submit_approve_button(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.SubmitApproveAlert(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.SubmitApproveAlert());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.SubmitApproveAlert());

	}

	 

	@And("User click the Account type in transfer Account")

	public void user_click_the_account_type_in_transfer_account(Integer int1) {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Account_Type_transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Account_Type_transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Account_Type_transfer());

	}

	 

	@And("User Click the click the Maintenance in transfer Account")

	public void user_click_the_click_the_maintenance_in_transfer_account(Integer int1) {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Maintenance12(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Maintenance12());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Maintenance12());

	}

	 

	@And("User Enter Account Type in Transfer")

	public void user_enter_account_type_in_transfer(Integer int1) {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Account_type_code(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Account_type_code());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Account_type_code());

	}

	 

	@And("User Click the Instructions button in Transfer Account")

	public void user_click_the_instructions_button_in_transfer_account(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Instructions_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Instructions_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Instructions_Transfer());

	}

	 

	@And("User Select the Period in Transfer")

	public void user_select_the_period_in_transfer(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Period_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Period_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Period_Transfer());
		AccountCreationobject.Period_Transfer().sendKeys(testData.get("Period Number"));
	}

	 

	@And("User Select the client in Transfer")

	public void user_select_the_client_in_transfer(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Client_Name_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Client_Name_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Client_Name_Transfer());
		AccountCreationobject.Client_Name_Transfer().sendKeys(testData.get("Client Name"));
	}

	 

	@And("User Click the Card Details in Transfer Account")

	public void user_click_the_card_details_in_transfer_account(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Card_Details_TRANSFER(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Card_Details_TRANSFER());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Card_Details_TRANSFER());
		AccountCreationobject.Card_Details_TRANSFER().sendKeys(testData.get("Card Details"));
	}

	 

	@And("User Select the Affect Card in Transfer")

	public void user_select_the_affect_card_in_transfer(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Affect_Card_Transfer(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Affect_Card_Transfer());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Affect_Card_Transfer());
		AccountCreationobject.Affect_Card_Transfer().sendKeys(testData.get("Affect Card"));
	}

	 

	@And("User Enter the Card code in Transfer")

	public void user_enter_the_card_code_in_transfer(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Card_Details_TRANSFER(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Card_Details_TRANSFER());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Card_Details_TRANSFER());
		AccountCreationobject.Card_Details_TRANSFER().sendKeys(testData.get("Card code"));
	}

	 

	@And("User click the Affect cheque book")

	public void user_click_the_affect_cheque_book(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Affect_Chequebook(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Affect_Chequebook());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Affect_Chequebook());

	}

	 

	@And("User Enter the Cheque book code value")

	public void user_enter_the_cheque_book_code_value(Integer int1) {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Cheque_BookCode(), 60, 2);
		ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Cheque_BookCode());
		ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Cheque_BookCode());
		AccountCreationobject.Cheque_BookCode().sendKeys(testData.get("Cheque Bookcode"));
	}
	

	@And("User Click the Approve button in Account Type")

	public void user_click_the_approve_button_in_account_type() {
        waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.ApprovebuttonAlert(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.ApprovebuttonAlert());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.ApprovebuttonAlert());
	}

	 

	@And("User Enter the Type code value")

	public void user_enter_the_type_code_value() {

		 waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.Account_type_code(), 60, 2);
		    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Account_type_code());
		    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Account_type_code());
		    AccountCreationobject.Account_type_code().sendKeys(testData.get("Type Code"));
	}

	 

	@And("User Click the double click the Account details")

	public void user_click_the_double_click_the_account_details() {
		 waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.doubleClickUserInUpdateAfterApprove(), 60, 2);
		    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
		    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
	  
	}

	 

	@And("User Click the Submit approve button")

	public void user_click_the_Submit_approve_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.SubmitApproveAlert(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.SubmitApproveAlert());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.SubmitApproveAlert());

	}

	 

	@And("User Click the CIF Paramerters in CSM Param")

	public void user_click_the_cif_paramerters_in_csm_param() {

	   waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Parameters(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Parameters());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Parameters());
	}

	 

	@And("User Select the CIF Type")

	public void user_select_the_cif_type() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Type(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Type());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Type());

	}

	 

	@And("User Click the Maintenance")

	public void user_click_the_maintenance() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.Maintenance12(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Maintenance12());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Maintenance12());
	}

	 

	@And("User Enter CIF type value in Transfer Account")

	public void user_enter_cif_type_value_in_transfer_account() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Type_Code(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Type_Code());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Type_Code());
	    AccountCreationobject.CIF_Type_Code().sendKeys(testData.get(testData.get("CIF TypeCode")));
	}

	 

	@And("User Enter Brief Name details in Transfer Account1")

	public void user_enter_brief_name_details_in_transfer_account1() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Brief_Name(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Brief_Name());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Brief_Name());
	    AccountCreationobject.CIF_Brief_Name().sendKeys(testData.get("Berify Name1"));
	}

	 

	@And("User Enter Long Name details in Transfer Account1")

	public void user_enter_long_name_details_in_transfer_account1() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.LongName_transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.LongName_transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.LongName_transfer());
	    AccountCreationobject.LongName_transfer().sendKeys(testData.get("Long Name1"));
	}

	 

	@And("User Select the Type value in CIF Type Transfer")

	public void user_select_the_type_value_in_cif_type_transfer() {

	    waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Civil_Code(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Civil_Code());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Civil_Code());
	}

	 

	@And("User Click the CIF type is a client Transfer")

	public void user_click_the_cif_type_is_a_client_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Type_Client(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Type_Client());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Type_Client());

	}

	 

	@And("User Click the CIF Is a Staff Transfer")

	public void user_click_the_cif_is_a_staff_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Staff(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Staff());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Staff());
	}

	 

	@And("User Enter the Min Age in CIF Type Transfer")

	public void user_enter_the_min_age_in_cif_type_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_min_age(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_min_age());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_min_age());
	    AccountCreationobject.CIF_min_age().sendKeys(testData.get("Min Age"));
	}

	 

	@And("User Enter the Max Age in CIF Type Transfer")

	public void user_enter_the_max_age_in_cif_type_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Max_Age(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Max_Age());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Max_Age());
	    AccountCreationobject.CIF_Max_Age().sendKeys(testData.get("Max Age"));
	}

	 

	@And("User Enter the Encnomic Sector value Transfer")

	public void user_enter_the_encnomic_sector_value_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Ecosector(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Ecosector());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Ecosector());
	    AccountCreationobject.CIF_Ecosector().sendKeys("EcoScetor");
	}

	 

	@And("User Enter the Role Code Value Transfer")

	public void user_enter_the_role_code_value_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Role_Code(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Role_Code());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Role_Code());
	    AccountCreationobject.CIF_Role_Code().sendKeys("Role Code");
	}

	 

	@And("User Enter the Sub Eco Sector Transfer")

	public void user_enter_the_sub_eco_sector_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,AccountCreationobject.CIF_Sub_Ecosector(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Sub_Ecosector());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Sub_Ecosector());
	    AccountCreationobject.CIF_Sub_Ecosector().sendKeys("Sub EcoSector");
	}

	 

	@And("User Enter the Priority code value Transfer")

	public void user_enter_the_priority_code_value_transfer() {

	    waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CIF_priority(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_priority());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_priority());
	    AccountCreationobject.CIF_priority().sendKeys("Priority code");
	}

	 

	@And("User Enter the Civil code value Transfer")

	public void user_enter_the_civil_code_value_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CIF_Civil_Code(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Civil_Code());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Civil_Code());
	    AccountCreationobject.CIF_Civil_Code().sendKeys("Civil Code");
	}

	 

	@And("User Enter the Nationality for Transfer")

	public void user_enter_the_nationality_for_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CIF_Nationality(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Nationality());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Nationality());
	    AccountCreationobject.CIF_Nationality().sendKeys("Nationality");
	}

	 

	@And("User Select Entity type for Transfer")

	public void user_select_entity_type_for_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Entity_Type_Transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Entity_Type_Transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Entity_Type_Transfer());
	    AccountCreationobject.Entity_Type_Transfer().sendKeys("Entity Type");

	}

	 

	@And("User Click the Allow CIF creation KYC box Transfer")

	public void user_click_the_allow_cif_creation_kyc_box_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Allow_Type_KYC_Creation(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Allow_Type_KYC_Creation());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Allow_Type_KYC_Creation());


	}

	 

	@And("User click the save button")

	public void User_click_the_save_button() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Save_Button_submit(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Save_Button_submit());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Save_Button_submit());

	}

	 

	@And("User click the Confirm button")

	public void user_click_the_confirm_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.POPupmsg(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.POPupmsg());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.POPupmsg());

	}

	 

	@And("User click the Popup msg Success")

	public void user_click_the_popup_msg_success() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.POPupmsg(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.POPupmsg());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.POPupmsg());

	}

	 

	@And("User Click the Approve button in CIF Type")

	public void user_click_the_approve_button_in_cif_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.ApprovebuttonAlert(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.ApprovebuttonAlert());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.ApprovebuttonAlert());
	    

	}

	 

	@And("User Enter the CIF code value")

	public void user_enter_the_cif_code_value() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.TypeCode(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.TypeCode());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.TypeCode());
	    AccountCreationobject.TypeCode().sendKeys("Type Code");
	}

	 

	@And("User Click the double click the CIF details")

	public void User_click_the_double_click_the_cif_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.doubleClickUserInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
	}

	 

	@And("User Click the Submit approve button CIF Type")

	public void user_click_the_submit_approve_button_cif_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.SubmitApproveAlert(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.SubmitApproveAlert());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.SubmitApproveAlert());
	}

	 

	@And("User click the Confirm button1")

	public void User_click_the_confirm_button1() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.POPupmsg(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.POPupmsg());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.POPupmsg());

	}

	

	@And("User Click the System parameters in CSM Param")

	public void user_click_the_system_parameters_in_csm_param() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.SystemParametersbutton(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.SystemParametersbutton());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.SystemParametersbutton());

	}

	 

	@And("User Click the User in Transfer")

	public void user_click_the_user_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.user_Transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.user_Transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.user_Transfer());

	}

	 

	@And("User Click the Update after Approve button")

	public void user_click_the_update_after_approve_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.updateAfterApproveInUser(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.updateAfterApproveInUser());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.updateAfterApproveInUser());
	}

	 

	@And("User Enter User Id details in Transfer")

	public void user_enter_user_id_details_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.userIdInApproveScreen(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.userIdInApproveScreen());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.userIdInApproveScreen());

	}

	 

	@And("User Click the double click the Id details")

	public void user_click_the_double_click_the_id_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.doubleClickUserInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());

	}

	 

	@And("User select Account Types in Transfer")

	public void user_select_account_types_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.AccountType_User(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.AccountType_User());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.AccountType_User());

	}

	 

	@And("User Click the Add button in Account type")

	public void user_click_the_add_button_in_account_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Add_Button_Transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Add_Button_Transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Add_Button_Transfer());

	}

	 

	@And("User Enter the Account Numberin Type")

	public void user_enter_the_account_numberin_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Account_Type_transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Account_Type_transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Account_Type_transfer());
	   
	}

	 

	@And("User Enter thr Transaction serial number")

	public void user_enter_thr_transaction_serial_number() {


		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.TransactionSerail_number(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.TransactionSerail_number());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.TransactionSerail_number());
	    AccountCreationobject.TransactionSerail_number().sendKeys(testData.get("Serial Number"));

	}

	 

	@And("User Click the Ok button in Account Type")

	public void user_click_the_ok_button_in_account_type() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.okButtonInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	    
	}

	 

	@And("User Select CIF type in User")

	public void user_select_cif_type_in_user() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CifType_User(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CifType_User());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CifType_User());
	    AccountCreationobject.CifType_User().sendKeys(testData.get("CIF Number"));
	    
	}

	 

	@And("User Click the Add button in CIF type")

	public void user_click_the_add_button_in_cif_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Add_Button_Transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Add_Button_Transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Add_Button_Transfer());

	}

	 

	@And("User Enter the CIF Number in Type")

	public void user_enter_the_cif_number_in_type() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CIFNumber_user(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIFNumber_user());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIFNumber_user());
	    AccountCreationobject.CIFNumber_user().sendKeys(testData.get("CIF Number"));

	}

	 

	@And("User Enter thr Transaction serial number in CIF Type")

	public void user_enter_thr_transaction_serial_number_in_cif_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.TransactionSerail_number(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.TransactionSerail_number());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.TransactionSerail_number());
	    AccountCreationobject.TransactionSerail_number().sendKeys(testData.get("Serial number1"));
	}

	 

	@And("User Click the Ok button in CIF Type")

	public void user_click_the_ok_button_in_cif_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.okButtonInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	}

	 

	@And("User click the submit Update button")

	public void user_click_the_submit_update_button() {

	    waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.okButtonInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	}

	 

	@And("User Click the Approve button in User id")

	public void user_click_the_approve_button_in_user_id() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.userIdInApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.userIdInApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.userIdInApprove());

	}

	 

	@And("User Enter the User Id value")

	public void user_enter_the_user_id_value() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.userIdInApproveScreen(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.userIdInApproveScreen());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.userIdInApproveScreen());
	    AccountCreationobject.userIdInApproveScreen().sendKeys(testData.get("User ID"));

	}

	 

	@And("User Click the double click the CIF details")

	public void user_click_the_double_click_the_cif_details() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.doubleClickUserInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());

	}

	 

	@And("User Click the Submit approve button User details")

	public void user_click_the_submit_approve_button_user_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.SubmitApproveAlert(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.SubmitApproveAlert());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.SubmitApproveAlert());

	}

	 

	@And("User click the Confirm button1")

	public void user_click_the_confirm_button1() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.ConfirmButton_User(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.ConfirmButton_User());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.ConfirmButton_User());

	}

	 

	@Given("User login to CSM Core12")

	public void user_login_to_csm_core12() {
		 driver.get(configFileReader.getCSMparamsUrl());
	        login.loginIntoCSMParamApplication();
	}

	 

	@And("User Click the Front office Management in CSM Core")

	public void user_click_the_front_office_management_in_csm_core() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.FrontOffice_Transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.FrontOffice_Transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.FrontOffice_Transfer());
	}

	 

	@And("User Click the Maintenance box")

	public void user_click_the_maintenance_box() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Maintenance12(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Maintenance12());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Maintenance12());
	}

	 

	@And("User Enter the Cif Type in Transfer")

	public void user_enter_the_cif_type_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CSM_CIF_Type_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CSM_CIF_Type_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CSM_CIF_Type_frontoffice());
	    AccountCreationobject.CSM_CIF_Type_frontoffice().sendKeys(testData.get("CIF TypeNew"));
	}

	 

	@And("User Enter the Id type in Transfer")

	public void user_enter_the_id_type_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CIVIL_id_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIVIL_id_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIVIL_id_frontoffice());
	    AccountCreationobject.CIVIL_id_frontoffice().sendKeys(testData.get("Civil Id"));
	}

	 

	@And("User Enter the any ten digit number")

	public void user_enter_the_any_ten_digit_number() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CIF_IDNO_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_IDNO_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_IDNO_frontoffice());
	    AccountCreationobject.CIF_IDNO_frontoffice().sendKeys(testData.get("Ten Civil Number"));
	}

	 

	@And("User Enter the Date Of Birth in Transfer")

	public void user_enter_the_date_of_birth_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.DOB_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.DOB_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.DOB_frontoffice());
	    AccountCreationobject.DOB_frontoffice().sendKeys(testData.get("Data Of Birth"));

	}

	 

	@And("User Enter the ID Expriy date in Transfer")

	public void user_enter_the_id_expriy_date_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.ID_Expirydate_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.ID_Expirydate_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.ID_Expirydate_frontoffice());
	    AccountCreationobject.ID_Expirydate_frontoffice().sendKeys(testData.get("ID Expriy"));
	}

	 

	@And("User Select the Married Status in Transfer")

	public void user_select_the_married_status_in_transfer() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Marital_Status_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Marital_Status_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Marital_Status_frontoffice());
	    AccountCreationobject.Marital_Status_frontoffice().sendKeys(testData.get("Married Status"));
	}

	 

	@And("User Enter the Brife name details")

	public void user_enter_the_brife_name_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.BrifeName_Transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.BrifeName_Transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.BrifeName_Transfer());
	    AccountCreationobject.BrifeName_Transfer().sendKeys(testData.get("brife Name"));
	}

	 

	@And("User Enter the Long Name details")

	public void user_enter_the_long_name_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Long_Name_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Long_Name_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Long_Name_frontoffice());
	    AccountCreationobject.BrifeName_Transfer().sendKeys(testData.get("Long Name"));

	}

	 

	@And("User Enter Block details in Transfer")

	public void user_enter_block_details_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Address_Block_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Address_Block_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Address_Block_frontoffice());
	    AccountCreationobject.BrifeName_Transfer().sendKeys(testData.get("Address Block"));
	}

	 

	@And("User Enter the Home tel Number in Transfer")

	public void user_enter_the_home_tel_number_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Address_TElnumber_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Address_TElnumber_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Address_TElnumber_frontoffice());
	    AccountCreationobject.Address_TElnumber_frontoffice().sendKeys(testData.get("Home Number"));

	}

	 

	@And("User Enter the Work tel number in Transfer")

	public void user_enter_the_work_tel_number_in_transfer() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Address_Worknumber_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Address_Worknumber_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Address_Worknumber_frontoffice());
	    AccountCreationobject.Address_Worknumber_frontoffice().sendKeys(testData.get("Work Number"));
	}

	 

	@And("User Enter the Moblie Number in Transfer")

	public void user_enter_the_moblie_number_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Address_MOBnumber_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Address_MOBnumber_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Address_MOBnumber_frontoffice());
	    AccountCreationobject.Address_MOBnumber_frontoffice().sendKeys(testData.get("Mobile Number"));

	}

	 

	@And("User Select the Statement in Transfer")

	public void user_select_the_statement_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Statement_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Statement_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Statement_frontoffice());
	    AccountCreationobject.Statement_frontoffice().sendKeys(testData.get("Statement"));


	}

	 

	@And("User Click Additional details button")

	public void user_click_additional_details_button() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Additionaldetails_Transfer(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Additionaldetails_Transfer());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Additionaldetails_Transfer());
	   

	}

	 

	@And("User Enter the Ecnomic Agent key Number Value")

	public void user_enter_the_ecnomic_agent_key_number_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Economic_AgentKey_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Economic_AgentKey_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Economic_AgentKey_frontoffice());
	    AccountCreationobject.Economic_AgentKey_frontoffice().sendKeys(testData.get("ECnomi AgentKey"));

	}

	 

	@And("User Enter the Legal status value")

	public void user_enter_the_legal_status_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Legal_Status_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Legal_Status_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Legal_Status_frontoffice());
	    AccountCreationobject.Legal_Status_frontoffice().sendKeys(testData.get("Legal Status"));

	}

	 

	@And("User Enter the Economic Secter value")

	public void user_enter_the_economic_secter_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Eco_Sector_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Eco_Sector_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Eco_Sector_frontoffice());
	    AccountCreationobject.Eco_Sector_frontoffice().sendKeys(testData.get("Eco Sector"));

	}

	 

	@And("User Enter the SubEco Sector value")

	public void user_enter_the_sub_eco_sector_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Sub_ECOSector_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Sub_ECOSector_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Sub_ECOSector_frontoffice());
	    AccountCreationobject.Sub_ECOSector_frontoffice().sendKeys(testData.get("SubEco sector"));

	}

	 

	/*@And("User Enter the Ranking value")

	public void user_enter_the_ranking_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.ran(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Address_MOBnumber_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Address_MOBnumber_frontoffice());
	    AccountCreationobject.Address_MOBnumber_frontoffice().sendKeys(testData.get("Ranking Number"));


	}*/

	 

	@And("User Enter the Division Number details")

	public void user_enter_the_division_number_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Division_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Division_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Division_frontoffice());
	    AccountCreationobject.Division_frontoffice().sendKeys(testData.get("Division Number"));


	}

	 

	@And("User Enter the Department value details")

	public void user_enter_the_department_value_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Department_Accounts(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Department_Accounts());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Department_Accounts());
	    AccountCreationobject.Department_Accounts().sendKeys(testData.get("Department Number"));


	}
	@And("User Click the Save button")

	public void User_click_the_Save_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Save_Key_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Save_Key_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Save_Key_frontoffice());

	}

	 

	@And("User click the confirm the CIF Number")

	public void user_click_the_confirm_the_cif_number() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.ConfirmButton_User(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.ConfirmButton_User());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.ConfirmButton_User());
	}

	 

	@And("User Click the Vaildalite button")

	public void user_click_the_vaildalite_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Validate_Key_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Validate_Key_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Validate_Key_frontoffice());
	}

	 

	@And("User Click the ok popup msg button")

	public void user_click_the_ok_popup_msg_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.POPupmsg(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.POPupmsg());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.POPupmsg());
	}

	 

	@And("User click the FACTA button")

	public void user_click_the_facta_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.FATCP_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.FATCP_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.FATCP_frontoffice());
	}

	 

	@And("User Select the No value in FACTA")

	public void user_select_the_no_value_in_facta() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.NoValueFATCA_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.NoValueFATCA_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.NoValueFATCA_frontoffice());
	    AccountCreationobject.NoValueFATCA_frontoffice().sendKeys("No Value FATCA");
	}

	 

	@And("User Click the PAT value")

	public void user_click_the_pat_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.PEP_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.PEP_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.PEP_frontoffice());
	}

	 

	@And("User Select the NO value in PAT")

	public void user_select_the_no_value_in_pat() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.NoValuePEP_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.NoValuePEP_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.NoValuePEP_frontoffice());
	    AccountCreationobject.PEP_frontoffice().sendKeys("No Value PEP");
	}

	 

	@And("User Click the save button")

	public void user_click_the_save_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Save_Key_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Save_Key_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Save_Key_frontoffice());
	}

	 

	@And("User Click the OK popup msg2")

	public void user_click_the_ok_popup_msg2() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.POPupmsg(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.POPupmsg());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.POPupmsg());
	}

	 

	@And("User Click the vailadite button")

	public void user_click_the_vailadite_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Validate_Key_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Validate_Key_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Validate_Key_frontoffice());

	}

	 

	@And("User click the yes continu the transfer")

	public void user_click_the_yes_continu_the_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.POPupmsg(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.POPupmsg());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Validate_Key_frontoffice());


	}

	 

	@And("User Click the Approve button")

	public void user_click_the_approve_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.ApprovebuttonAlert(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.ApprovebuttonAlert());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.ApprovebuttonAlert());

	}

	 

	@And("User Enter the CIF Number value")

	public void user_enter_the_cif_number_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CIFNOApprove_Frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIFNOApprove_Frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIFNOApprove_Frontoffice());

	}

	 

	@And("User Click the double click the CIF Type details")

	public void user_click_the_double_click_the_cif_type_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.doubleClickUserInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());

	}

	 

	@And("User Click the Submit Approve button")

	public void user_click_the_submit_approve_button() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.SubmitApproveAlert(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.SubmitApproveAlert());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.SubmitApproveAlert());

	}

	 

	@And("User click the ok button1")

	public void user_click_the_ok_button1() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.okButtonInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.okButtonInUpdateAfterApprove());

	}

	 

	@And("User Click the Account tab")

	public void user_click_the_account_tab() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Accopunts_CSM(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Accopunts_CSM());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Accopunts_CSM());


	}

	 

	@And("User Click the General Activites")

	public void user_click_the_general_activites() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.GeneralAccounts_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.GeneralAccounts_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.GeneralAccounts_frontoffice());

	}

	 

	@And("User click the Opening button in Transfer")

	public void user_click_the_opening_button_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Opening_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Opening_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Opening_frontoffice());

	}

	 

	@And("User Enter the Currency value")

	public void user_enter_the_currency_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Currencycodevalue_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Currencycodevalue_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Currencycodevalue_frontoffice());

	}

	 

	@And("User Enter the Type value in Transfer")

	public void user_enter_the_type_value_in_transfer() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.GlType_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.GlType_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.GlType_frontoffice());

	}
	 

	@And("User Enter the CIF Number details")

	public void user_enter_the_cif_number_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CiFNo_Accounts(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CiFNo_Accounts());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CiFNo_Accounts());


	}

	 

	@And("User Enter Brife name details")

	public void user_enter_brife_name_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CIF_Brief_Name(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CIF_Brief_Name());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CIF_Brief_Name());

	}

	 

	@And("User Enter the Division value details")

	public void user_enter_the_division_value_details() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Division_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Division_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Division_frontoffice());
	    AccountCreationobject.Division_frontoffice().sendKeys(testData.get("Division Value"));
	}

	 

	@And("User Enter the Deparment value details")

	public void user_enter_the_deparment_value_details() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.DepartmentOne_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.DepartmentOne_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.DepartmentOne_frontoffice());
	    AccountCreationobject.Department_Accounts().sendKeys("Department Value");

	}

	 

	@And("User Click the Mailing details button")

	public void user_click_the_mailing_details_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.MailingDetails_Accounts(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.MailingDetails_Accounts());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.MailingDetails_Accounts());

	}

	 

	@And("User Enter the Descrition value In Transfer")

	public void user_enter_the_descrition_value_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Description_Accounts(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Description_Accounts());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Description_Accounts());
	    AccountCreationobject.Description_Accounts().sendKeys("Description Value");
	}

	 

	@And("User Click the Save Button in Transfer")

	public void user_click_the_save_button_in_transfer() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Save_Key_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Save_Key_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Save_Key_frontoffice());
	}

	 

	@And("User click the Ok popup msg3")

	public void user_click_the_ok_popup_msg3() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.okButtonInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	}

	 

	@And("User Click the Authorize button in Transfer")

	public void user_click_the_authorize_button_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Authorize_Key(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Authorize_Key());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Authorize_Key());

	}

	 

	@And("User Enter the CIF No Value in Authorize process")

	public void user_enter_the_cif_no_value_in_authorize_process() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.CiFNo_Accounts(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.CiFNo_Accounts());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.CiFNo_Accounts());
	    AccountCreationobject.CiFNo_Accounts().sendKeys(testData.get("CIF NUmber Accopunt"));
	}

	 

	@And("User Click the double click the CIF Number details")

	public void user_click_the_double_click_the_cif_number_details() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.doubleClickUserInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.doubleClickUserInUpdateAfterApprove());

	}

	 

	@And("User Click the Save in Authroize button")

	public void user_click_the_save_in_authroize_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Save_Key_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Save_Key_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Save_Key_frontoffice());
	}

	 

	@And("User click the Ok button2 in Transfer")

	public void user_click_the_ok_button2_in_transfer() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.okButtonInUpdateAfterApprove(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.okButtonInUpdateAfterApprove());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.okButtonInUpdateAfterApprove());

	}

	 

	@And("User click the ok button in Success button")

	public void user_click_the_ok_button_in_success_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.Successok_Button(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.Successok_Button());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.Successok_Button());
	}
	@And("User close the Popup Message in Front office Management")

	public void user_close_the_popup_message_in_front_office_management() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, AccountCreationobject.ClosePopupmsg_frontoffice(), 60, 2);
	    ClicksAndActionsHelperobj.moveToElement(AccountCreationobject.ClosePopupmsg_frontoffice());
	    ClicksAndActionsHelperobj.clickOnElement(AccountCreationobject.ClosePopupmsg_frontoffice());

	}
	 
	
}
