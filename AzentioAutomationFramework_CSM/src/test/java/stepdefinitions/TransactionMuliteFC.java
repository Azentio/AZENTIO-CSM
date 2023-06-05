package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pageobjects.Transaction_MultiTransfer;
import resources.BaseClass;

public class TransactionMuliteFC {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Transaction_MultiTransfer Transaction_MultiTransferobj = new Transaction_MultiTransfer(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Then("^User navigate to CSM application and login with valid credentials$")
    public void user_navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
    driver.get(configFileReader.getCSMApplicationUrl());
    login.loginIntoCSMApplication();
   		}     
    
    @And("^User click the Transactions$")
    public void User_click_the_Transactions() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_Transactions());
   	Transaction_MultiTransferobj.Transactions_Transactions().click();
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_Transactions());  
    }

    @Then("^Click the Maintenance Below the Transactions$")
    public void click_the_maintenance_below_the_transactions() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_MaintenanceScrn());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_MaintenanceScrn());  
   	Transaction_MultiTransferobj.Transactions_MaintenanceScrn().click();
    }
    
    @And("^enter the value in trx type$")
    public void enter_the_value_in_trx_type() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_Trxtypevalue());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_Trxtypevalue());
   	Transaction_MultiTransferobj.Transactions_Trxtypevalue().sendKeys("377");
   	Transaction_MultiTransferobj.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
 	Transaction_MultiTransferobj.Transactions_Trxtypevalue().click();
    }

    @And("^enter the single transfer in trx type$")
    public void enter_the_single_transfer_in_trx_type() throws Throwable {  
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_Trxtypevalue());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_Trxtypevalue());
   	//single transfer(debit account)
   	Transaction_MultiTransferobj.Transactions_Trxtypevalue().sendKeys("685");
   	Transaction_MultiTransferobj.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
	Transaction_MultiTransferobj.Transactions_Trxtypevalue().click();
    }

    @Then("^enter values of Branch code$")
    public void enter_values_of_branch_code() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_depositAcc_Branchcode());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_depositAcc_Branchcode());  
   	Transaction_MultiTransferobj.Transactions_depositAcc_Branchcode().sendKeys("0001");
 	Transaction_MultiTransferobj.Transactions_depositAcc_Branchcode().click();
    }

    @And("^enter values of Currency code$")
    public void enter_values_of_Currency_code() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_debitAcc_Currencycode());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_debitAcc_Currencycode());  
   	Transaction_MultiTransferobj.Transactions_debitAcc_Currencycode().sendKeys("840");
	Transaction_MultiTransferobj.Transactions_debitAcc_Currencycode().click();
    }

    @And("^enter values of Gl code$")
    public void enter_values_of_Gl_code() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_debitAcc_Glcode());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_debitAcc_Glcode());  
   	Transaction_MultiTransferobj.Transactions_debitAcc_Glcode().sendKeys("5916");
   	Transaction_MultiTransferobj.Transactions_debitAcc_Glcode().click();
    }

    @And("^enter values of Cif code$")
    public void enter_values_of_Cif_code() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_debitAcc_Cifcode());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_debitAcc_Cifcode());
   	Transaction_MultiTransferobj.Transactions_debitAcc_Cifcode().click();
   	Transaction_MultiTransferobj.Transactions_debitAcc_Cifcode().sendKeys("993567");
    }

    @Then("^enter values of serial$")
    public void enter_values_of_serial() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_debitAcc_serialcode());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_debitAcc_serialcode());  
   	Transaction_MultiTransferobj.Transactions_debitAcc_serialcode().sendKeys("0");
   	Transaction_MultiTransferobj.Transactions_debitAcc_serialcode().click();
    }
    
    @Then("^System show the warning popup clikc ok button$")
    public void system_show_the_warning_popup_clikc_ok_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_Warning_okbtn());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_Warning_okbtn()); 
   	Transaction_MultiTransferobj.Transactions_Warning_okbtn().click();
    }
    
    @And("^user enter the currency$")
    public void user_enter_the_currency() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_debitAcc_currency());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_debitAcc_currency());  
   	Transaction_MultiTransferobj.Transactions_debitAcc_currency().sendKeys("840");
	Transaction_MultiTransferobj.Transactions_debitAcc_currency().click();
    }
    
    @And("^Enter the Amount in this Checkbox$")
    public void Enter_the_Amount_in_this_Checkbox() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_EnterAmount());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_EnterAmount());  
   	Transaction_MultiTransferobj.Transactions_EnterAmount().sendKeys("1000");
	Transaction_MultiTransferobj.Transactions_EnterAmount().click();
    }
    
  
    
    @And("^click the save button$")
    public void click_the_save_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_savebtn());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_savebtn());  
    }
    
    @And("^system show the popup success user click the ok button$")
    public void system_show_the_popup_success_user_click_the_ok_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_successokbtn());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_successokbtn());  
   	 Thread.sleep(2000);
    }

    @Then("^user Enter the Transaction number$")
    public void user_enter_the_transaction_number() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_transactionNo_codeValue());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_transactionNo_codeValue());  
   	Transaction_MultiTransferobj.Transactions_transactionNo_codeValue().sendKeys("7521");
    }

    @And("^User click the Approve screen$")
    public void user_click_the_approve_screen() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_Approvescrn());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_Approvescrn());  
    }         

    @And("^double click the Value$")
    public void double_click_the_value() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_transactionNo_Doubleclk());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_transactionNo_Doubleclk());  
    }
    
    @Then("^click the Approve button$")
    public void click_the_approve_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_Approvescrn());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_Approvescrn());  
   	Transaction_MultiTransferobj.Transactions_Approvescrn().click();
    }
    
    @And("^User click the Maintenance screen$")
    public void user_click_the_maintenance_screen() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_MaintenanceScrn());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_MaintenanceScrn());  
   	Transaction_MultiTransferobj.Transactions_MaintenanceScrn().click();
    }
    
    @Then("^click the search button$")
    public void click_the_search_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_searchbtn());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_searchbtn());  
   	Transaction_MultiTransferobj.Transactions_searchbtn().click();

    }
    
    @And("^enter the trx number$")
    public void enter_the_trx_number() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_trxno_code());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_trxno_code());  
    }
    
    @And("^double click the data$")
    public void double_click_the_data() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_doubleclk_codevalue());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_doubleclk_codevalue());  
    }


    @Then("^click the Booked Entries$")
    public void click_the_booked_entries() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,Transaction_MultiTransferobj.Transactions_BookedEntries());
   	ClicksAndActionsHelperobj.clickOnElement(Transaction_MultiTransferobj.Transactions_BookedEntries());  
    }
}
