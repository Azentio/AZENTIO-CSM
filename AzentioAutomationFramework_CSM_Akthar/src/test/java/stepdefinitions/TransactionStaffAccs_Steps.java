package stepdefinitions;

import java.awt.Robot;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csm.TransactionStaffAcc_obj;
import resources.BaseClass;

public class TransactionStaffAccs_Steps {

	private static final boolean Status = false;
	WebDriver driver = BaseClass.driver;
	CSMLogin csmLogin = new CSMLogin(driver);
	ConfigFileReader configFileRead = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	TransactionStaffAcc_obj transactionStaffAcc = new TransactionStaffAcc_obj(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	String transactionNo;
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	DropDownHelper dropDownHelper = new DropDownHelper(driver);

	ExcelData excelDataForTransaction = new ExcelData(path, "CSM_Transaction", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	Map<String, String> chequeBookRequestTestData = new HashMap<>();
	Map<String, String> chargeWaiverExecutionData = new HashMap<>();
	Map<String, String> testData;
	Robot robot;

	@Given("User_613 login to Csm Param application")
	public void User_613_login_to_Csm_Param_application() throws Throwable {
		driver.get(configFileRead.getCSMparamsUrl());
		csmLogin.loginIntoCSMParamApplication();

	}

	// TSA_148//

	@Then("^User_613 Click the Parameters$")
	public void user_613_click_the_parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_Module());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_Module());
	}

	@And("^User_613 Click the System Parameters$")
	public void user_613_click_the_system_parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_Systemparameters());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_Systemparameters());
	}

	@Then("^User_613 Click the Control Record$")
	public void user_613_click_the_control_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_ControlRecord());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_ControlRecord());
	}

	@And("^User_613 Click the Update After Approve under control record$")
	public void user_613_click_the_update_after_approve_under_control_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_UpdateAfterApprove());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_UpdateAfterApprove());

	}

	@Then("^User_613 Select The Alert Activation$")
	public void user_613_select_the_alert_activation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_AlertActivation());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_AlertActivation());
	}

	@And("^User_613 Click the Account Balance Overdown$")
	public void user_613_click_the_account_balance_overdown() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_ABO());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_ABO());
	}

	@Then("^User_613 The Flag of Staff Account Transaction should be checked$")
	public void user_613_the_flag_of_staff_account_transaction_should_be_checked() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_SATCheckboArea());
		javascripthelper.scrollIntoView(transactionStaffAcc.TransactionStaffAcc_SATCheckboArea());
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionStaffAcc.TransactionStaffAcc_SATCheckboArea());
				clicksAndActionsHelper.doubleClick(transactionStaffAcc.TransactionStaffAcc_SATCheckboArea());
				clicksAndActionsHelper.moveToElement(transactionStaffAcc.TransactionStaffAcc_SAT());
				clicksAndActionsHelper.doubleClick(transactionStaffAcc.TransactionStaffAcc_SAT());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// Thread.sleep(3000);

	}

	@And("^User_613 Click the CIF parameters$")
	public void user_613_click_the_cif_parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_Cifparameters());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_Cifparameters());
	}

	@And("^User_613 Click the CIF type$")
	public void user_613_click_the_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_Ciftype());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_Ciftype());
	}

	@Then("^User_613 Click the Update after approve under user$")
	public void user_613_click_the_update_after_approve_under_the_cif_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_UPA());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_UPA());
	}

	@And("^User_613 Enter the value in Brife Desc Eng$")
	public void user_613_enter_the_value_Brife_Desc_Eng() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_BrifeDescEng());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_BrifeDescEng());
		transactionStaffAcc.TransactionStaffAcc_BrifeDescEng().sendKeys("staff");
		transactionStaffAcc.TransactionStaffAcc_BrifeDescEng().sendKeys(Keys.ENTER);

		Thread.sleep(3000);
	}

	@Then("User_613 Double click of the existing record")
	public void user_613_Doubleclick_of_the_existing_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_Existingdata());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.TransactionStaffAcc_Existingdata());
	}

	@And("^User_613 Click the Main Information$")
	public void user_613_Click_the_Main_Information() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_MI());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_MI());
		Thread.sleep(3000);
	}

	// TRS_017//

	@And("^User_613 update test data set id for TRS_017$")
	public void user_613_update_test_data_set_id_for_TRS017() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_017_D1");
	}

	@And("^User_613 check the flag Main Acc credit$")
	public void user_613_check_the_flag_main_Acc_credit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Mainacc_credit_flag());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Mainacc_credit_flag());

	}

	@Given("User_613 Click on Date to Change the Current Date")
	public void user_613_click_on_date_to_change_the_current_date() {
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionStaffAcc.CSMDateToChangeTheCurrentDate());
				clicksAndActionsHelper.clickOnElement(transactionStaffAcc.CSMDateToChangeTheCurrentDate());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}

		}

	}

	@Given("User_613 Enter the Date in User Running Date")
	public void user_613_enter_the_date_in_user_running_date() throws Throwable {
		transactionStaffAcc.CSMDateInUserRunningDate().clear();
        //transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date =LocalDate.now();
        String format = date.format(dtFormatter);
        transactionStaffAcc.CSMDateInUserRunningDate().sendKeys(format);
	}

	@Given("User_613 Click on Use Button in Change Running Date Popup")
	public void user_613_click_on_use_button_in_change_running_date_popup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.CSMUseButtonInChangeRunningDate());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.CSMUseButtonInChangeRunningDate());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.CSMUseButtonInChangeRunningDate());
	}

	@Given("User_613 Click Ok Button in Information PopUp menu")
	public void user_613_click_ok_button_in_information_pop_up_menu() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.CSMOkButtonInAccessDeniedPopUpMenu());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.CSMOkButtonInAccessDeniedPopUpMenu());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.CSMOkButtonInAccessDeniedPopUpMenu());
	}

	@Given("User_613 Click on Close Button in Change Running Date Popup")
	public void user_613_click_on_close_button_in_change_running_date_popup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.CSMCloseButtonInChangeRunningDate());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.CSMCloseButtonInChangeRunningDate());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.CSMCloseButtonInChangeRunningDate());
	}
	
	@Then("User_613 click the Add button under account details")
	public void user_613_click_the_add_button_under_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsaddbtn());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsaccdetailsaddbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsaddbtn());
	}

	@Then("User_613 enter values of Branch code under account details")
	public void user_613_enter_values_of_branch_code_under_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactions_accdetailsno1clk());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactions_accdetailsno1clk());			
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsbranchcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsbranchcode());
		transactionStaffAcc.transactionsaccdetailsbranchcode().sendKeys(testData.get("AD branchcode"));
		transactionStaffAcc.transactionsaccdetailsbranchcode().sendKeys(Keys.TAB);
	}

	@Then("User_613 enter values of gl code under account details")
	public void user_613_enter_values_of_gl_code_under_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsglcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsglcode());
		transactionStaffAcc.transactionsaccdetailsglcode().sendKeys(testData.get("AD gl Code"));
		transactionStaffAcc.transactionsaccdetailsglcode().sendKeys(Keys.TAB);
	}

	@Then("User_613 enter values of cif number under account details")
	public void user_613_enter_values_of_cif_number_under_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailscifcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailscifcode());
		transactionStaffAcc.transactionsaccdetailscifcode().sendKeys(testData.get("AD cif Code"));
		transactionStaffAcc.transactionsaccdetailscifcode().sendKeys(Keys.TAB);
		Thread.sleep(2000);
		}

	@Then("User_613 enter values of serial under account details")
	public void user_613_enter_values_of_serial_under_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsserialcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsserialcode());
		transactionStaffAcc.transactionsaccdetailsserialcode().sendKeys(testData.get("AD serial No"));
		transactionStaffAcc.transactionsaccdetailsserialcode().sendKeys(Keys.TAB);
	  	}
	

	@Then("User_613 Enter the Amount in this Checkbox under account details")
	public void user_613_enter_the_amount_in_this_checkbox_under_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsamountcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsamountcode());
		transactionStaffAcc.transactionsaccdetailsamountcode().sendKeys(testData.get("AD Amount"));
		transactionStaffAcc.transactionsaccdetailsamountcode().sendKeys(Keys.TAB);
	}

	@Then("User_613 enter values of Branch code under account details_2")
	public void user_613_enter_values_of_branch_code_under_account_details_2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsbranchcode2());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsaccdetailsbranchcode2());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsbranchcode2());
		transactionStaffAcc.transactionsaccdetailsbranchcode2().sendKeys(testData.get("AD branchcode_2"));
		transactionStaffAcc.transactionsaccdetailsbranchcode2().sendKeys(Keys.TAB);
	}

	@Then("User_613 enter values of gl code under account details_2")
	public void user_613_enter_values_of_gl_code_under_account_details_2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsglcode2());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsaccdetailsglcode2());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsglcode2());
		transactionStaffAcc.transactionsaccdetailsglcode2().sendKeys(testData.get("AD glcode_2"));
		transactionStaffAcc.transactionsaccdetailsglcode2().sendKeys(Keys.TAB);
	}

	@Then("User_613 enter values of cif number under account details_2")
	public void user_613_enter_values_of_cif_number_under_account_details_2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailscifcode2());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsaccdetailscifcode2());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailscifcode2());
		transactionStaffAcc.transactionsaccdetailscifcode2().sendKeys(testData.get("AD cifcode_2"));
		transactionStaffAcc.transactionsaccdetailscifcode2().sendKeys(Keys.TAB);
	  	}

	@Then("User_613 enter values of serial under account details_2")
	public void user_613_enter_values_of_serial_under_account_details_2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsserialcode2());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsaccdetailsserialcode2());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsserialcode2());
		transactionStaffAcc.transactionsaccdetailsserialcode2().sendKeys(testData.get("AD serialNo_2"));
		transactionStaffAcc.transactionsaccdetailsserialcode2().sendKeys(Keys.TAB);
	  	}
	

	@Then("User_613 Enter the Amount in this Checkbox under account details_2")
	public void user_613_enter_the_amount_in_this_checkbox_under_account_details_2() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsamountcode2());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsaccdetailsamountcode2());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsamountcode2());
		transactionStaffAcc.transactionsaccdetailsserialcode2().sendKeys(testData.get("AD amount_2"));
		transactionStaffAcc.transactionsaccdetailsserialcode2().sendKeys(Keys.TAB);
	}
	
	@Then("User_613 click the ok button in account details")
	public void user_613_click_the_ok_button_in_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsaccdetailsokbtn());
		clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsaccdetailsokbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsokbtn());
	}


	// TRS_018//

	@And("^User_613 update test data set id for TRS_018$")
	public void user_613_update_test_data_set_id_for_TRS018() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_018_D1");
	}

	@And("^User_613 click the Transaction type$")
	public void user_613_click_the_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_TranscationType());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_TranscationType());
		Thread.sleep(2000);
	}

	@Then("User_613 Click the Update after approve under Transaction type")
	public void user_613_click_the_update_after_approve_under_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_UPA());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_UPA());
	}

	@And("^User_613 Enter the Code value$")
	public void Enter_the_code_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Entercodevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Entercodevalue());
		transactionStaffAcc.Transactions_Entercodevalue().sendKeys(testData.get("Transaction Type code"));
		transactionStaffAcc.Transactions_Entercodevalue().sendKeys(Keys.ENTER);

		String xpath = "//td[text()='" + String.valueOf(testData.get("Transaction Type code")) + "']";

		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i % 5 == 0) {
					clicksAndActionsHelper.moveToElement(transactionStaffAcc.TransactionsGridNextButton());
					clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionsGridNextButton());
				}
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_613 Enter the single transfer Code value$")
	public void user_613_enter_the_single_transfer_code_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Entercodevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Entercodevalue());
		Thread.sleep(2000);
		// single transfer(debit account)
		transactionStaffAcc.Transactions_Entercodevalue().sendKeys(testData.get("Transaction Type code"));
		transactionStaffAcc.Transactions_Entercodevalue().sendKeys(Keys.ENTER);

	}
	@Given("User_613 Enter the code value")
	public void user_613_enter_the_code_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Entercodevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Entercodevalue());
		transactionStaffAcc.Transactions_Entercodevalue().sendKeys(testData.get("Transaction Type code"));
		transactionStaffAcc.Transactions_Entercodevalue().sendKeys(Keys.ENTER);
	}


	@Then("^User_613 double click the Existing data$")
	public void user_613_double_click_the_Existing_data() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionExistingdata());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.transactionExistingdata());
	}

	@And("^User_613 Allow internal GL Account flag should be checked$")
	public void user_613_allow_internal_GL_account_flag_should_be_checked() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_GLflagChecked());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_GLflagChecked());

	}

	@And("^User_613 just check the flag UPA$")
	public void user_613_just_check_the_flag_upa() throws Throwable {
		for (int i = 0; i <=600; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Checkuncheck());
				break;
			} catch (Exception e) {
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// waitHelper.waitForElementwithFluentwait(driver,
		// transactionStaffAcc.Transactions_Checkuncheck());
	}

	@Then("User_613 Click the Update After approve button in Transaction type")
	public void user_613_click_the_update_after_approve_button_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionUPAUPAbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionUPAUPAbtn());
	}

	@And("^User_613 System giving information message click ok button$")
	public void user_613_system_giving_information_message_click_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_informationOkbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_informationOkbtn());
	}

	@Then("^User_613 system show the success popup click ok button$")
	public void user_613_system_show_the_success_popup_click_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Recordwasupdatesccess());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Recordwasupdatesccess());
	}

	@And("^User_613 Click the Approve Below the Transaction type$")
	public void user_613_click_the_approve_below_the_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Approve());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Approve());
	}

	@Then("^User_613 Enter the Approved record in the code$")
	public void user_613_enter_the_approved_record_in_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_codevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_codevalue());
		transactionStaffAcc.Transactions_codevalue().sendKeys(testData.get("Transaction Type code"));
		transactionStaffAcc.Transactions_codevalue().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("^User_613 Enter the single transfar Approved record in the code$")
	public void user_613_enter_the_single_transfar_approved_record_in_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_codevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_codevalue());
		// single transfer(debit account)
		transactionStaffAcc.Transactions_codevalue().sendKeys("685");
		transactionStaffAcc.Transactions_codevalue().sendKeys(Keys.ENTER);
	}

	@And("^User_613 Double click the Data in transaction type$")
	public void user_613_double_click_the_data_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactiontypeAppscrnExistingdata());
		Thread.sleep(1000);
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.TransactiontypeAppscrnExistingdata());
	}

	@And("^User_613 click the approve button$")
	public void user_613_click_the_approve_button() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Approvebtn());
		for (int i = 0; i < 200; i++) {
			try {
				javascripthelper.scrollIntoView(transactionStaffAcc.Transactions_Approvebtn());
				javascripthelper.JSEClick(transactionStaffAcc.Transactions_Approvebtn());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User_613 System show the  confirm popup user click the ok button$")
	public void user_613_system_show_the_confirm_popup_user_click_the_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Confirmokbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Confirmokbtn());
	}

	@And("^User_613 System show the record was successfully$")
	public void user_613_system_show_the_record_was_successfully() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_recordwassuccess_okbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_recordwassuccess_okbtn());
	}

	@Then("^user_613 navigate to CSM application and login with valid credentials$")
	public void user_613_navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileRead.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication();
	}

	@And("^User_613 click the Transactions$")
	public void user_613_click_the_Transactions() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Transactions());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Transactions());
	}

	@Then("^User_613 Click the Maintenance Below the Transactions$")
	public void user_613_click_the_maintenance_below_the_transactions() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_MaintenanceScrn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_MaintenanceScrn());
		Thread.sleep(2000);
	}

	@And("^User_613 enter the value in trx type$")
	public void user_613_enter_the_value_in_trx_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Trxtypevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Trxtypevalue());
		transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(testData.get("Transaction Type code"));
		transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
	}

	@And("^User_613 enter the single transfer in trx type$")
	public void user_613_enter_the_single_transfer_in_trx_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Trxtypevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Trxtypevalue());
		// single transfer(debit account)
		transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(testData.get("Transaction Type code"));
		transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
	}

	@Then("^User_613 enter values of Branch code$")
	public void user_613_enter_values_of_Branch_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_depositAcc_Branchcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_depositAcc_Branchcode());
		transactionStaffAcc.Transactions_depositAcc_Branchcode().sendKeys(testData.get("Credit Branch Code"));
		transactionStaffAcc.Transactions_depositAcc_Branchcode().sendKeys(Keys.TAB);
	}

	@And("^User_613 enter values of Currency code$")
	public void user_613_enter_values_of_Currency_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_debitAcc_Currencycode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Currencycode());
		transactionStaffAcc.Transactions_debitAcc_Currencycode().sendKeys(testData.get("Credit Currency Code"));
		transactionStaffAcc.Transactions_debitAcc_Currencycode().sendKeys(Keys.TAB);
	}

	@Then("^User_613 enter values of serial$")
	public void user_613_enter_values_of_serial() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_debitAcc_serialcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_serialcode());
		Thread.sleep(2000);
		transactionStaffAcc.Transactions_debitAcc_serialcode().sendKeys(testData.get("Credit Serial Number"));
		transactionStaffAcc.Transactions_debitAcc_serialcode().sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	@And("^User_613 system gives the view memo popup user close the popup$")
	public void user_613_system_gives_the_view_memo_popup_user_close_the_popup() throws Throwable {
		try {
			clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsviewmemoclosebtn());
			clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsviewmemoclosebtn());
		} catch (Exception e) {
			
		}
		}
	

	@Then("^User_613 System show the warning popup click ok button$")
	public void user_613_system_show_the_warning_popup_click_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Warning_okbtn());
		if (transactionStaffAcc.Transactions_Warning_okbtn().isDisplayed()) {
			clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Warning_okbtn());
		} else {
			Assert.assertTrue(true);
		}
		/*
		 * for (int i = 0; i <300; i++) { try {
		 * clicksAndActionsHelper.moveToElement(transactionStaffAcc.
		 * Transactions_Warning_okbtn());
		 * clicksAndActionsHelper.clickOnElement(transactionStaffAcc.
		 * Transactions_Warning_okbtn()); break; } catch (Exception e) { if (i==299) {
		 * Assert.fail(e.getMessage()); }
		 * 
		 * } }
		 */

	}
	


                   @Then("User_613 click the Account details button")
                    public void user_613_click_the_account_details_button() throws Throwable {
                		waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.transactionsaccdetailsbtn());                		
                        clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsaccdetailsbtn());                		
							
                   }
                   

	@And("^User_613 enter the currency$")
	public void user_613_enter_the_currency() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_debitAcc_currency());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_currency());
		transactionStaffAcc.Transactions_debitAcc_currency().sendKeys(testData.get("Credit Currency Code"));
		transactionStaffAcc.Transactions_debitAcc_currency().sendKeys(Keys.TAB);
		Thread.sleep(3000);
	}

	@And("^User_613 Enter the Amount in this Checkbox$")
	public void user_613_Enter_the_Amount_in_this_Checkbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_EnterAmount());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_EnterAmount());
		transactionStaffAcc.Transactions_EnterAmount().sendKeys(testData.get("Amend Amount"));
		transactionStaffAcc.Transactions_EnterAmount().sendKeys(Keys.TAB);

	}

	@Then("User_613 enter the gl code in credit account")
	public void user_613_enter_the_gl_code_in_credit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionscreditAccglcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionscreditAccglcode());
		transactionStaffAcc.transactionscreditAccglcode().sendKeys(testData.get("Credit Gl Code"));
		transactionStaffAcc.transactionscreditAccglcode().sendKeys(Keys.TAB);
	}

	@Then("User_613 enter the cif code in credit account")
	public void user_613_enter_the_cif_code_in_credit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsCreditAccCifcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsCreditAccCifcode());
		transactionStaffAcc.transactionsCreditAccCifcode().sendKeys(testData.get("Credit CIF Code"));
		transactionStaffAcc.transactionsCreditAccCifcode().sendKeys(Keys.TAB);
	}

	@Then("User_613 enter the Serial number in credit account")
	public void user_613_enter_the_serial_number_in_credit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsCreditAccSerialcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsCreditAccSerialcode());
		transactionStaffAcc.transactionsCreditAccSerialcode().sendKeys(testData.get("Credit Serial Number"));
		transactionStaffAcc.transactionsCreditAccSerialcode().sendKeys(Keys.TAB);
	}

	@And("^User_613 click the save button$")
	public void user_613_click_the_save_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_savebtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_savebtn());
		Thread.sleep(2000);
	}

	@And("^User_613 system show the popup success user click the ok button$")
	public void user_613_system_show_the_popup_success_user_click_the_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_successokbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_successokbtn());
		Thread.sleep(2000);
	}

	@Then("^User_613 Enter the Transaction number$")
	public void user_613_enter_the_transaction_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_transactionNo_codeValue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_transactionNo_codeValue());
		transactionStaffAcc.Transactions_transactionNo_codeValue().sendKeys(transactionNo);
	}

	@And("^User_613 get Transaction number from sucess pop up$")
	public void user_613_get_transaction_number_from_sucess_pop_up() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.getTransactionNumber());
		transactionNo = transactionStaffAcc.getTransactionNumber().getText().substring(15, 19);
		System.out.println(transactionNo);
		excelDataForTransaction.updateTestData("TRS_106_D1", "Transaction Number", transactionNo);
		testData = excelDataForTransaction.getTestdata("TRS_106_D1");
		Thread.sleep(2000);
	}

	@And("^User_613 click the Approve screen$")
	public void user_613_click_the_approve_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionStaffAcc.transactionsApprovescrn());
				clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsApprovescrn());
				break;
			} catch (Exception e) {
				if (i == 199) {

					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@And("^User_613 double click the Value$")
	public void user_613_double_click_the_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_transactionNo_Doubleclk());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_transactionNo_Doubleclk());
	}

	@And("^User_613 click the approve button in transaction type$")
	public void user_613_click_the_approve_button_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Approvebtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Approvebtn());
	}

	@And("^User_613 click the Maintenance screen$")
	public void user_613_click_the_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_MaintenanceScrn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_MaintenanceScrn());
	}

	@Then("^User_613 Click the Search button$")
	public void user_613_click_the_search_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_searchbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_searchbtn());
	}

	@And("^User_613 enter the trx number$")
	public void user_613_enter_the_trx_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_trxno_code());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_trxno_code());
	}

	@And("^User_613 double click the data$")
	public void user_613_double_click_the_data() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());
	}

	@Then("^User_613 click the Booked Entries$")
	public void user_613_click_the_booked_entries() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_BookedEntries());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_BookedEntries());
	}

	@And("^user_613 Click the Queries$")
	public void user_613_Click_the_Queries() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Queries());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries());
	}

	@And("^Click the Statement of Account$")
	public void click_the_statement_of_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_SOA());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_SOA());
	}

	@And("^Click the By trade Date$")
	public void click_the_byb_trade_date() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_BTD());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_BTD());
	}

	@And("^enter values of Currency Value$")
	public void enter_values_of_Currency_Value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Queries_Currencycode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_Currencycode());
		transactionStaffAcc.Transactions_Queries_Currencycode().sendKeys("840");
	}

	@And("^enter values of GL code$")
	public void enter_values_of_GL_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Queries_GLcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_GLcode());
		transactionStaffAcc.Transactions_Queries_GLcode().sendKeys("5916");
	}

	@And("^enter values of cif code$")
	public void enter_values_of_cif_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Queries_cifcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_cifcode());
		transactionStaffAcc.Transactions_Queries_cifcode().sendKeys("993567");
	}

	@Then("^enter values of Serial$")
	public void enter_values_of_Serial() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Queries_Serialcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_Serialcode());
		transactionStaffAcc.Transactions_Queries_Serialcode().sendKeys("0");
	}

	@And("^Click the Retrive button$")
	public void click_the_retrive_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Queries_retrivebtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_retrivebtn());
		Thread.sleep(2000);
	}

	// TRS_057//

	@And("^Check the falg of set default Trx currency is equal to account currency$")
	public void check_the_falg_of_set_default_trx_currency_is_equal_to_account_currency() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_flag_setAcc());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_flag_setAcc());
	}

	// TRS_060//

	@And("^User_613 update test data set id for TRS_060$")
	public void user_613_update_test_data_set_id_for_TRS060() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_060_D1");
	}

	@And("^System giving information message Nochanges click ok button$")
	public void system_giving_information_message_nochanges_click_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Nochages_okbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Nochages_okbtn());
	}

	@And("^User_613 enter the value in Trx type$")
	public void user_613_enter_the_value_in_Trx_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Trxtypevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Trxtypevalue());
		transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(testData.get("Transaction Type code"));
		Thread.sleep(2000);
		transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(Keys.TAB);

	}

	@And("^User_613 enter values of currency code$")
	public void user_613_enter_values_of_currency_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_debitAcc_Currencycode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Currencycode());
		transactionStaffAcc.Transactions_debitAcc_Currencycode().sendKeys(testData.get("Credit Currency Code"));
	}

	@And("^User_613 enter values of gl code$")
	public void user_613_enter_values_of_gl_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_debitAcc_Glcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Glcode());
		Thread.sleep(2000);
		transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys(testData.get("Credit Gl Code"));
		transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys(Keys.TAB);
	}

	@And("^User_613 enter values of cif number$")
	public void user_613_enter_values_of_cif_number() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_creditAcc_Cifcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_creditAcc_Cifcode());
		Thread.sleep(2000);
		transactionStaffAcc.Transactions_creditAcc_Cifcode().sendKeys(testData.get("Credit CIF Code"));
		transactionStaffAcc.Transactions_creditAcc_Cifcode().sendKeys(Keys.TAB);
	}

	// TRS_061//

	@And("^User_613 update test data set id for TRS_061$")
	public void user_613_update_test_data_set_id_for_trs061() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_061_D1");
	}

	@Then("^User_613 click the Account parameters$")
	public void user_613_click_the_account_parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Accountparameters());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Accountparameters());
	}

	@And("^User_613 click the Account type$")
	public void User_613_click_the_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Accounttype());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Accounttype());
	}

	@And("^User_613 Enter the type code$")
	public void User_613_Enter_the_type_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_typecode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_typecode());
		transactionStaffAcc.Transactions_typecode().sendKeys(testData.get("Type Code_D2"));
		transactionStaffAcc.Transactions_typecode().sendKeys(Keys.ENTER);
	}

	@Then("^User_613 click the update after Approve$")
	public void User_613_click_the_update_after_Approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_acctype_UPA());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_acctype_UPA());
	}

	@And("^User_613 click the Instructions$")
	public void User_613_click_the_Instructions() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_instructions());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_instructions());
	}

	@And("^user_613 click the Approve screen$")
	public void user_613_click_the_Approve_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_acctype_approve());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_acctype_approve());
	}

	@And("^User_613 Enter the type Code value$")
	public void user_613_enter_the_type_code_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_withdraw_codevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_withdraw_codevalue());
		transactionStaffAcc.Transactions_withdraw_codevalue().sendKeys(testData.get("Transaction Type code"));
		transactionStaffAcc.Transactions_withdraw_codevalue().sendKeys(Keys.ENTER);
	}

	@Then("^User_613 double click the typecode data$")
	public void user_613_double_click_the_typecode_data() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_withdraw_Existingvalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_withdraw_Existingvalue());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_withdraw_Existingvalue());
	}

	@Then("^User_613 Enter the Approved record in the type code$")
	public void user_613_Enter_the_approved_record_in_the_type_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_withdraw_Approvecode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_withdraw_Approvecode());
		transactionStaffAcc.Transactions_withdraw_Approvecode().sendKeys(testData.get("Transaction Type code"));
		transactionStaffAcc.Transactions_withdraw_Approvecode().sendKeys(Keys.ENTER);
	}

	@And("^User_613 Double Click the Approved typecode data$")
	public void user_613_double_click_the_approved_typecode_data() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				transactionStaffAcc.Transactions_withdraw_ApproveExistingvalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_withdraw_ApproveExistingvalue());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_withdraw_ApproveExistingvalue());
	}

	@And("^User_613 uncheck the flag of proceed on insufficient fund$")
	public void user_613_uncheck_the_flag_of_proceed_on_insufficient_fund() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_proceedflag_uncheck());
		Thread.sleep(2000);
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_proceedflag_uncheck());
	}

	@Then("^User_613 uncheck the flag Allow Overdrawn$")
	public void user_613_uncheck_the_flag_allow_overdrawn() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_allowoverdrawn());
		Thread.sleep(2000);
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_allowoverdrawn());
	}

	@And("^User_613 Double click the Data in account type$")
	public void user_613_double_click_the_Data_in_account_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_ACCtype_App_Doubleclk());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_ACCtype_App_Doubleclk());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_ACCtype_App_Doubleclk());
	}

//	@Then("^Double click the data$")
//	public void double_click_the_Data() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());
//		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());
//	}

	// TRS_062//

	@And("^User_613 update test data set id for TRS_062$")
	public void user_613_update_test_data_set_id_for_trs062() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_062_D1");
	}

	@Then("User_613 enter values of serial for single transfer in debit account")
	public void user_613_enter_values_of_serial_for_single_transfer_in_debit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_debitAcc_serialcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_serialcode());
		transactionStaffAcc.Transactions_debitAcc_serialcode().sendKeys(testData.get("Debit Serial Number"));
		transactionStaffAcc.Transactions_debitAcc_serialcode().sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	@Then("User_613 enter values of gl code for single transfer in debit account")
	public void user_613_enter_values_of_gl_code_for_single_transfer_in_debit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_debitAcc_Glcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Glcode());
		Thread.sleep(2000);
		transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys(testData.get("Debit Gl Code"));
		transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys(Keys.TAB);

	}

	@And("User_613 enter values of cif number for single transfer in debit account")
	public void user_613_enter_values_of_cif_number_for_single_transfer_in_debit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_debitAcc_Cifcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Cifcode());
		transactionStaffAcc.Transactions_debitAcc_Cifcode().sendKeys(testData.get("Debit CIF Code"));
		Thread.sleep(2000);
		transactionStaffAcc.Transactions_debitAcc_Cifcode().sendKeys(Keys.TAB);

		// Thread.sleep(2000);
	}

	@And("^User_613 enter the type code$")
	public void User_613_enter_the_type_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Acctype_App_codevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Acctype_App_codevalue());
		transactionStaffAcc.Transactions_Acctype_App_codevalue().sendKeys(testData.get("Type Code_D2"));
		transactionStaffAcc.Transactions_Acctype_App_codevalue().sendKeys(Keys.ENTER);
	}

	@Then("^User_613 click the Approve button$")
	public void user_613_click_the_Approve_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Acctype_Appbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Acctype_Appbtn());
	}

	// TRS_105//

	@And("^User_613 update test data set id for TRS_105$")
	public void user_613_update_test_data_set_id_for_TRS105() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_105_D1");
	}

	@Then("^User_613 Click the user$")
	public void user_613_click_the_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User());
	}

	@Then("User_613 Click the Update after approve in transaction type")
	public void user_613_Click_the_update_after_approve_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.TransactionStaffAcc_UPA());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_UPA());
	}

	@Then("^User_613 Enter the Name in the UserId$")
	public void user_613_enter_the_name_in_the_user_id() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User_userid());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_userid());
		transactionStaffAcc.Transactions_User_userid().sendKeys(testData.get("UserId"));
		transactionStaffAcc.Transactions_User_userid().sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	@Then("^User_613 click the cif types$")
	public void user_613_click_the_cif_types() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User_CifType());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_CifType());

	}

	@And("^User_613 enter the code values$")
	public void user_613_enter_the_code_values() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Ciftype_Code());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_Code());
		javascripthelper.scrollIntoView(transactionStaffAcc.Transactions_Ciftype_Code());
		Thread.sleep(2000);
	}

	@Then("^User_613 enter the Transaction$")
	public void user_613_enter_the_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Ciftype_Transactions());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_Transactions());

	}

	@And("^enter the value in deposit limit$")
	public void enter_the_value_in_deposit_limit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Ciftype_DepositLimit());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_DepositLimit());

	}

	@Then("^User_613 check the flag of Warn user If Limit Exceeds$")
	public void user_613_check_the_flag_of_warn_user_if_limit_exceeds() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Ciftype_Warn_Flag());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_Warn_Flag());
		Thread.sleep(2000);
	}

	@And("^User_613 click the ok button$")
	public void user_613_click_the_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Ciftype_okbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_okbtn());
		Thread.sleep(2000);
	}

	@And("^User_613 Click the approve screen in user$")
	public void user_613_click_the_approve_screen_in_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User_appscrn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_appscrn());

	}

	@Then("^User_613 Click the Approve button under user$")
	public void click_the_Approve_button_under_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User_appbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_appbtn());
	}

	@And("^User_613 double click the data in User$")
	public void user_613_double_click_the_data_in_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User_doubleclk());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_User_doubleclk());

	}

	@And("^Click the Add symbol$")
	public void click_the_add_symbol() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Ciftype_Addsym());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_Addsym());
		Thread.sleep(2000);
	}

	@Then("^User_613 Click the update After approve button in user$")
	public void user_613_Click_the_update_after_approve_button_in_user() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User_UPAbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_UPAbtn());

	}

	@Then("^user_613 Enter the Name in the user_613Id$")
	public void user_613_enter_the_name_in_the_user_613id() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User_Appcodevalue());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_Appcodevalue());
		transactionStaffAcc.Transactions_User_Appcodevalue().sendKeys(testData.get("user_613Id"));
		transactionStaffAcc.Transactions_User_Appcodevalue().sendKeys(Keys.ENTER);

	}

	@And("^User_613 double click the Data$")
	public void user_613_double_click_the_Data() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_User_Appdoubleclk());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_User_Appdoubleclk());

	}

	// TRS_106//

	@And("^User_613 update test data set id for TRS_106$")
	public void user_613_update_test_data_set_id_for_trs106() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_106_D1");
	}

	@Then("User_613 click the Priority")
	public void user_613_click_the_priority() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_priority());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_priority());
	}

	@Then("User_613 Click the Number one")
	public void user_613_click_the_number_one() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_priority_one());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_priority_one());
	}

	// TRS-107//

	@And("^User_613 update test data set id for TRS_107$")
	public void user_613_update_test_data_set_id_for_trs107() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_107_D1");
	}

	// TRS_161//

	@And("^User_613 update test data set id for TRS_161$")
	public void user_613_update_test_data_set_id_for_trs161() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_161_D1");
	}

	@Then("User_613 click the Charges")
	public void user_613_click_the_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges());
	}

	@Then("User_613 Click the Maintance of charges")
	public void user_613_click_the_maintance_of_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_MaintanceofCharges());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_MaintanceofCharges());

	}

	@Then("User_613 Enter the Value of T in Brief Name")
	public void user_613_enter_the_value_of_t_in_brief_name() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges_Briefname());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges_Briefname());
		transactionStaffAcc.Transactions_Charges_Briefname().sendKeys(testData.get("UserId"));
	}

	@Then("User_613 double click the Existing data of charges")
	public void user_613_double_click_the_existing_data_of_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsChargesexistingdata());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.transactionsChargesexistingdata());
	}

	@Then("User_613 Uncheck the flag of Allow modify and clear")
	public void user_613_uncheck_the_flag_of_allow_modify_and_clear() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges_allowclrflag());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges_allowclrflag());

	}

	@Then("User_613 uncheck the flag of Allow modify")
	public void user_613_uncheck_the_flag_of_allow_modify() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges_allowflag());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges_allowflag());
	}

	@Then("User_613 click the update after approve button")
	public void user_613_click_the_update_after_approve_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges_UPAbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges_UPAbtn());
	}

	@Then("User_613 Click the Update after approve in charges")
	public void user_613_click_the_update_after_approve_in_transaction_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges_UPA());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges_UPA());
	}

	@Then("User_613 click the Approve screen in Charges")
	public void user_613_click_the_approve_screen_in_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges_Appscrn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges_Appscrn());
		Thread.sleep(2000);
	}

	@Then("User_613 enter the code value under charges")
	public void user_613_enter_the_code_value_under_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges_code());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges_code());
		transactionStaffAcc.Transactions_Charges_code().sendKeys(testData.get("Type Code_D2"));
		transactionStaffAcc.Transactions_Charges_code().sendKeys(Keys.ENTER);
	}

	@Then("User_613 double click the data in the code")
	public void user_613_double_click_the_data_in_the_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsChargesAppscrnExistingdata());
		clicksAndActionsHelper.doubleClick(transactionStaffAcc.transactionsChargesAppscrnExistingdata());
		Thread.sleep(2000);
	}

	@Then("User_613 click the Approve button in charges")
	public void user_613_click_the_approve_button_in_charges() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Charges_Appbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Charges_Appbtn());
	}

	@Then("User_613 enter the Debit account in glcode value")
	public void user_613_enter_the_debit_account_in_glcode_value() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionscreditAccglcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionscreditAccglcode());
		transactionStaffAcc.transactionscreditAccglcode().sendKeys(testData.get("Debit Gl Code"));
	}

	@Then("User_613 enter the Ciftype value in Debit account")
	public void user_613_enter_the_ciftype_value_in_debit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsCreditAccCifcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsCreditAccCifcode());
		transactionStaffAcc.transactionsCreditAccCifcode().sendKeys(testData.get("Debit CIF Code"));
	}

	@Then("User_613 enter the serial value in Debit account")
	public void user_613_enter_the_serial_value_in_debit_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionsCreditAccSerialcode());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionsCreditAccSerialcode());
		transactionStaffAcc.transactionsCreditAccSerialcode().sendKeys(testData.get("Debit Serial Number"));
	}

	@Then("User_613 the Cv Charges is Enabeled")
	public void user_613_the_cv_charges_is_enabeled() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_cv_charges());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_cv_charges());
		transactionStaffAcc.Transactions_cv_charges().isDisplayed();

	}

	// TRS_157//

	@And("^User_613 update test data set id for TRS_157$")
	public void user_613_update_test_data_set_id_for_trs157() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TRS_157_D1");
	}
	
	@Given("User_613 click the acc control record")
	public void user_613_click_the_acc_cobntrol_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.accparameterAccControlRecord());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.accparameterAccControlRecord());
	
		
	}

	@Then("User_613 click the Update after approve screen under account parameters")
	public void user_613_click_the_update_after_approve_screen_under_account_parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.accparameterAccControlRecordUPA());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.accparameterAccControlRecordUPA());
	
	}

	@Then("User_613 click the JvAccounts tab in maintance")
	public void user_613_click_the_jvaccounts_tab_in_maintance() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.accparameterAccControlRecordJvAccountsTab());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.accparameterAccControlRecordJvAccountsTab());
	}

	@Then("User_613 click the Accounts under JvAccounts tab")
	public void user_613_click_the_accounts_under_jvaccounts_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.accparameterAccControlRecordAccounts());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.accparameterAccControlRecordAccounts());
	}

	@Then("User_613 Check the flag of proceed on modified account")
	public void user_613_check_the_flag_of_proceed_on_modified_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.accparameterAccControlRecordProceedFflag());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.accparameterAccControlRecordProceedFflag());
	}

	@Then("User_613 click the update button in account parameters")
	public void user_613_click_the_update_button_in_account_parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.accparameterAccControlRecordUpdatebtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.accparameterAccControlRecordUpdatebtn()); 
	}

	@Given("User_613 click the Accounts")
	public void user_613_click_the_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionAccounts());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionAccounts());
	}

	@Then("User_613 click the General Accounts")
	public void user_613_click_the_general_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionGeneralaccounts());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionGeneralaccounts());
	}

	@Then("User_613 Click the maintenance under General accounts")
	public void user_613_click_the_maintenance_under_general_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionGeneralaccountsmaintenance());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionGeneralaccountsmaintenance());
	}

	@Then("User_613 Enter the value in Status Tab")
	public void user_613_enter_the_value_in_status_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transactionGeneralaccountsmaintenancestatus());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transactionGeneralaccountsmaintenancestatus());
	}

//	@Then("User_613 Double click the value under Status")
//	public void user_613_double_click_the_value_under_status() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.());
//		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.());
//	}

	@Then("User_613 rename the Brief name")
	public void user_613_rename_the_brief_name() {
	   
	}

	@Then("User_613 click the update button")
	public void user_613_click_the_update_button() {
	   
	}
	
	
	//TRS_037//
	
	@Given("User_613 click the Transfer Accounts")
	public void user_613_click_the_transfer_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferAccounts());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferAccounts());
	}

	@Then("User_613 click the Maintance under Transfer account")
	public void user_613_click_the_maintance_under_transfer_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferAccountsMaintenance());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferAccountsMaintenance());
	}

	@Then("User_613 Select the Transfer type from GL to GL")
	public void user_613_select_the_transfer_type_from_gl_to_gl() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceGLtoGL());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceGLtoGL());
		dropDownHelper.SelectUsingVisibleText(transactionStaffAcc.transferaccmaintanceGLtoGL(),testData.get("UserId"));		
	}

	
	@Then("User_613 Enter the value in Cif")
	public void user_613_enter_the_value_in_cif() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceCifinput());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceCifinput());
		transactionStaffAcc.transferaccmaintanceCifinput().sendKeys(testData.get("Credit CIF Code"));
	}

	@Then("User_613 Enter the original GL")
	public void user_613_enter_the_original_gl() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceGLinput());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceGLinput());
		transactionStaffAcc.transferaccmaintanceGLinput().sendKeys(testData.get("Credit Gl Code"));
	}

	@Then("User_613 Enter the Destination GL")
	public void user_613_enter_the_destination_gl() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceDestinationGLinput());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceDestinationGLinput());
		transactionStaffAcc.transferaccmaintanceDestinationGLinput().sendKeys(testData.get("Debit Gl Code"));
	}

	@Then("User_613 Enter the Reason field")
	public void user_613_enter_the_reason_field() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceReasoninput());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceReasoninput());
		transactionStaffAcc.transferaccmaintanceReasoninput().sendKeys(testData.get("Transactions"));
	}

	@Then("User_613 click the Set Exception")
	public void user_613_click_the_set_exception() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceSetexceptionbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceSetexceptionbtn());
		
	}
	
	@And("User_613 Click the Add symbol")
	public void user_613_click_the_add_symbol() {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceSetexceptionbtnAddsymbol());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceSetexceptionbtnAddsymbol());
	}

	@Then("User_613 Select the exception factor in Ranking")
	public void user_613_select_the_exception_factor_in_ranking() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceSetexceptionbtnExceptionfactorTab());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceSetexceptionbtnExceptionfactorTab());
		dropDownHelper.SelectUsingVisibleText(transactionStaffAcc.transferaccmaintanceSetexceptionbtnExceptionfactorTab(),testData.get("Deposit"));
	}

	@Then("User_613 Select the value in Set Exception")
	public void user_613_select_the_value_in_set_exception() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceSetexceptionbtnSearchbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceSetexceptionbtnSearchbtn());
	}

	@Then("User_613 Click the ok button in Set Exception")
	public void user_613_click_the_ok_button_in_set_exception() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceSetexceptionbtnSearchbtn_Okbtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceSetexceptionbtnSearchbtn_Okbtn());
	}

	@Then("User_613 click the Retrive button")
	public void user_613_click_the_retrive_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.transferaccmaintanceRetrivebtn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.transferaccmaintanceRetrivebtn());
	}

	@Then("User_613 Click the Update After Approve in control record")
	public void user_613_click_the_update_after_approve_in_control_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.controlrecordUpascrn());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.controlrecordUpascrn());
	}

	@Then("User_613 click the No Access privilege")
	public void user_613_click_the_no_access_privilege() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.alertactivationNAPflag());
		clicksAndActionsHelper.clickOnElement(transactionStaffAcc.alertactivationNAPflag());
	}
	
	@And("^User_613 update test data set id for TA_037$")
	public void user_613_update_test_data_set_id_for_ta037() throws Throwable {
		testData = excelDataForTransaction.getTestdata("TA_037_D1");
	}

}
