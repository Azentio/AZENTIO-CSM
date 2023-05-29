package stepdefinitions;


import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_ChequebookChargesObj;
import resources.BaseClass;

public class CSM_chequebookchargestep extends BaseClass {
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver) ;
	ClicksAndActionsHelper clicksAdActionsHelper =  new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Action = new Selenium_Actions(driver);
	CSM_ChequebookChargesObj CSMChequebookChargesObj = new CSM_ChequebookChargesObj(driver);
	CSMLogin login  = new CSMLogin(driver);

	
	
    @Then("^click the Maintenance screen under chequebookrequest$")
    public void click_the_maintenance_screen_under_chequebookrequest() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequebookrequest_flag_maintenance());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequebookrequest_flag_maintenance());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequebookrequest_flag_maintenance());
		 //CSMChequebookChargesObj.chequebookrequest_flag_maintenance().click();
     }
   
    @And("^enter the no of chequebooks under Maintenance screen$")
    public void enter_the_no_of_chequebooks_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.noOfChequeBooks());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.noOfChequeBooks());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.noOfChequeBooks());
		// CSMChequebookChargesObj.noOfChequeBooks().click();
		 CSMChequebookChargesObj.noOfChequeBooks().sendKeys("2");
       
    }
    @Then("^enter the value in chequecode under Maintenance screen$")
    public void enter_the_value_in_chequecode_under_maintenance_screen() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequeBookCreation_chequeCode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequeBookCreation_chequeCode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequeBookCreation_chequeCode());
		// CSMChequebookChargesObj.chequeBookCreation_chequeCode().click();
		 CSMChequebookChargesObj.chequeBookCreation_chequeCode().sendKeys("136");
      
   }
    @And("^enter the branchcode under Maintenance screen$")
    public void enter_the_branchcode_under_maintenance_screen() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequeBookCreation_BranchCode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequeBookCreation_BranchCode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequeBookCreation_BranchCode());
		// CSMChequebookChargesObj.chequeBookCreation_BranchCode().click();
		 CSMChequebookChargesObj.chequeBookCreation_BranchCode().sendKeys("01");
    }
   
    @Then("^enter the currencycode under Maintenance screen$")
    public void enter_the_currencycode_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequeBookCreation_CurrencyCode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequeBookCreation_CurrencyCode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequeBookCreation_CurrencyCode());
		 //CSMChequebookChargesObj.chequeBookCreation_CurrencyCode().click();
		 CSMChequebookChargesObj.chequeBookCreation_CurrencyCode().sendKeys("840");
       
    }
    @And("^enter the glcode under Maintenance screen$")
    public void enter_the_glcode_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequeBookCreation_GlCode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequeBookCreation_GlCode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequeBookCreation_GlCode());
		 //CSMChequebookChargesObj.chequeBookCreation_GlCode().click();
		 CSMChequebookChargesObj.chequeBookCreation_GlCode().sendKeys("96123");
          }
   
       @And("^enter the cifcode under Maintenance screen$")
    public void enter_the_cifcode_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequeBookCreation_CifCode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequeBookCreation_CifCode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequeBookCreation_CifCode());
		 //CSMChequebookChargesObj.chequeBookCreation_CifCode().click();
		 CSMChequebookChargesObj.chequeBookCreation_CifCode().sendKeys("78");
      
    }

    @And("^enter the Serialno under Maintenance screen$")
    public void enter_the_serialno_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequeBookCreation_SerialNo());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequeBookCreation_SerialNo());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequeBookCreation_SerialNo());
		 CSMChequebookChargesObj.chequeBookCreation_SerialNo().click();
		 CSMChequebookChargesObj.chequeBookCreation_SerialNo().sendKeys("0");     
    }
    
    @Then("^click on save button under  Maintenance screen$")
    public void click_on_save_button_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequeBookCreation_Save());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequeBookCreation_Save());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequeBookCreation_Save());
		// CSMChequebookChargesObj.chequeBookCreation_Save().click();
	 
    }

    @Then("^click the charge button and verify the changes$")
    public void click_the_charge_button_and_verify_the_changes() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMChequebookChargesObj.chequeBookCreation_charges_btn());
		 clicksAdActionsHelper.moveToElement(CSMChequebookChargesObj.chequeBookCreation_charges_btn());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookChargesObj.chequeBookCreation_charges_btn());
		// CSMChequebookChargesObj.chequeBookCreation_charges_btn().click();
    	
    }

   


}
