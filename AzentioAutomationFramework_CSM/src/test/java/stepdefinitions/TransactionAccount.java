package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.Transaction_CAM;
import resources.BaseClass;


public class TransactionAccount {
	
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Transaction_CAM Transaction_CAMobj = new Transaction_CAM(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin csmLogin = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	ExcelData exceldata = new ExcelData("C:\\Users\\ININDC00075\\git\\AZENTIO-CSM_sridhar10\\AzentioAutomationFramework_CSM\\TestData\\CSM_Transaction", "Transaction", "Data Set ID");
	
	
	@Given("^User create SADS login to Transaction for Account Restriction$")
    public void user_create_sads_login_to_transaction_for_account_restriction() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication();
    }

    
    @And("^user click on the Transaction button in CSM$")
    public void user_click_on_the_transaction_button_in_csm() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.Transactions(), 60, 2);
    	Transaction_CAMobj.Transactions().click();
    }

    @And("^User click on the Maintenance$")
    public void user_click_on_the_maintenance() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.Maintenance(), 60, 2);
    	Transaction_CAMobj.Maintenance().click();
    }

    @And("^User click on the TransactionsTrxType$")
    public void user_click_on_the_transactionstrxtype() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.TransactionsTrxType(), 60, 2);
    	Transaction_CAMobj.TransactionsTrxType().click();
    	
    }

    @And("^user click on the search button$")
    public void user_click_on_the_search_button() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.CreditAccountSearchIcon(), 60, 2);
    	Transaction_CAMobj.TrxSearchIcon().click();
    }

    @And("^User click on the Branch code in account Restriction$")
    public void user_click_on_the_branch_code_in_account_restriction() throws Throwable {
      selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.BranchCode(), 60, 2);
      Transaction_CAMobj.BranchCode().click();
}

    @And("^User click on the Currency button$")
    public void user_click_on_the_currency_button() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.CurrencyCode(), 60, 2);
    	Transaction_CAMobj.CurrencyCode().click();
    }

    @And("^User click on the GL code$")
    public void user_click_on_the_gl_code() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.Glcode(), 60, 2); 
    	Transaction_CAMobj.Glcode().click();
    }

    @And("^User click on the CIF type$")
    public void user_click_on_the_cif_type() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.CifCode(), 60, 2);
    	Transaction_CAMobj.CifCode().click();
    }

    @And("^User click on the Serial Number$")
    public void user_click_on_the_serial_number() throws Throwable {
    selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.SerialNo(), 60, 2);
    Transaction_CAMobj.SerialNo().click();
}

    @And("^User click on the CreditAccountSearchIcon$")
    public void user_click_on_the_creditaccountsearchicon() throws Throwable {
        selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.CreditAccountSearchIcon(), 60, 2); 
    	Transaction_CAMobj.CreditAccountSearchIcon().click();
    }

    @And("^User click on the AccessDeniedPopup$")
    public void user_click_on_the_accessdeniedpopup() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.AccessDeniedPopup(), 60, 2);
    	Transaction_CAMobj.AccessDeniedPopup().click();
    }

    @And("^User click on the AccessDeniedPopupOk$")
    public void user_click_on_the_accessdeniedpopupok() throws Throwable {
    selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction_CAMobj.AccessDeniedPopupOk(), 60, 2);
    Transaction_CAMobj.AccessDeniedPopupOk().click();
}

}
	

