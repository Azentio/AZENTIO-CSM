package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.Chequebook_Request;
import resources.BaseClass;

public class Cheque_RequestCSM {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Chequebook_Request Chequebook_Requestobj = new Chequebook_Request(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("^User create SADS login to chequebook Request for Account Restriction$")
    public void user_create_sads_login_to_chequebook_request_for_account_restriction() throws Throwable {
        driver.get(configFileReader.getCSMApplicationUrl());
        login.loginIntoCSMApplication();
    }

    @And("^user click on the cheque book request in CSM$")
    public void user_click_on_the_cheque_book_request_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.chequebook1(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.chequebook1());
    	
    }

    @And("^user click on the Maintenance in CSM$")
    public void user_click_on_the_maintenance_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.Maintenance12(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.Maintenance12());
}

    @And("^User click on the No Of cheque book in CSM$")
    public void user_click_on_the_no_of_cheque_book_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.NoofChequeBooks(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.NoofChequeBooks());
    }

    @And("^User click on the cheque code in CSM$")
    public void user_click_on_the_cheque_code_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.chequeCode(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.chequeCode());
     
}

   
    @And("^User click on the Branch code in CSM$")
    public void user_click_on_the_branch_code_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.BranchCode(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.BranchCode());
    }

    @And("^User click on the Currency code in CSM$")
    public void user_click_on_the_currency_code_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.CurrencyCode(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.CurrencyCode());    
       
    }

    @And("^User clcik on the GL code in CSM$")
    public void user_clcik_on_the_gl_code_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.Glcode(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.Glcode());
    }

    @And("^User click on the CIF code in CSM$")
    public void user_click_on_the_cif_code_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.CifCode(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.CifCode());
        
   }

    @And("^Uesr click on the Serial code in CSM$")
    public void uesr_click_on_the_serial_code_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.SerialNo(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.SerialNo());
    }

    @And("^User click on the Save button in CSM$")
    public void user_click_on_the_save_button_in_csm() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,Chequebook_Requestobj.SaveButton(), 60, 2);
    	Chequebook_Requestobj.chequebook1().click();
    	ClicksAndActionsHelperobj.moveToElement(Chequebook_Requestobj.SaveButton());

    }


}
