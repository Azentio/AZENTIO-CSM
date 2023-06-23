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
import pageobjects.SMS_productCW;
import resources.BaseClass;

public class SMSProduct_charge {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	SMS_productCW SMS_productCWobj = new SMS_productCW(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);

	@Given("^User login to SMS product$")
    public void user_login_to_sms_product() throws Throwable {
		 driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMApplication();
    }

    @And("^user click on the SMSsubscription in charge$")
    public void user_click_on_the_smssubscription_in_charge() throws Throwable {
    waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.SMSsubscription(), 60, 2);
    ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.SMSsubscription());
    SMS_productCWobj.SMSsubscription().click();
    }
     
    @And("^user click on the Maintenance in charge$")
    public void user_click_on_the_Maintenance_in_charge() throws Throwable {
    waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.Maintenancebutton147(), 60, 2);
    ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.Maintenancebutton147());
    SMS_productCWobj.Maintenancebutton147().click();
    }
    @And("^user click on the CIFNumber in charge$")
    public void user_click_on_the_cifnumber_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.CIFNumber(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.CIFNumber());
        SMS_productCWobj.CIFNumber().click();    
        SMS_productCWobj.CIFNumber().sendKeys(testData.get("CIF"));    

    }

    @And("^user Enter on the MobileNo in charge$")
    public void user_Enter_on_the_mobileno_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.MobileNo(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.MobileNo());
        SMS_productCWobj.MobileNo().click();  
        SMS_productCWobj.CIFNumber().sendKeys("Moblie NO");    
}

    @And("^user click on the DeductCharges in charge$")
    public void user_click_on_the_deductcharges_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.DeductCharges(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.DeductCharges());
        SMS_productCWobj.DeductCharges().click();
    }

    @And("^user click on the Deductselect in charge$")
    public void user_click_on_the_deductselect_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.DeductChargesBycash(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.DeductChargesBycash());
        SMS_productCWobj.DeductChargesBycash().click();    
        }

    @And("^user click on the SMSsubscriptiondetails in charge$")
    public void user_click_on_the_smssubscriptiondetails_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.SmsSubscriptionTemplate(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.SmsSubscriptionTemplate());
        SMS_productCWobj.SmsSubscriptionTemplate().click();    }

    @And("^user click on the pLUSButton in charge$")
    public void user_click_on_the_plusbutton_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.SMSSubscription_puls(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.SMSSubscription_puls());
        SMS_productCWobj.SMSSubscription_puls().click();
    }

    @And("^user click on the searchbutton in Charge$")
    public void user_click_on_the_searchbutton_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.Exceedlimit(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.Exceedlimit());
        SMS_productCWobj.Exceedlimit().click();   
        }

    @And("^user click on the servicecode in charge$")
    public void user_click_on_the_servicecode_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.Servicecode_SMS(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.Servicecode_SMS());
        SMS_productCWobj.Servicecode_SMS().click();
    }

    @And("^User click on the SMSsubscriptiondetails Template in Charge$")
    public void user_click_on_the_smssubscriptiondetails_template_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.SmsSubscriptionTemplate(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.SmsSubscriptionTemplate());
        SMS_productCWobj.SmsSubscriptionTemplate().click();
    }

    @And("^User click on the updateafterApprove in Charge$")
    public void user_click_on_the_updateafterapprove_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.UpdateAfter(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.UpdateAfter());
        SMS_productCWobj.UpdateAfter().click();
    }

    @And("^User click on the codesearchbox in Charge$")
    public void user_click_on_the_codesearchbox_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.codebox(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.codebox());
        SMS_productCWobj.codebox().click();  
        SMS_productCWobj.codebox().sendKeys("Code"); 
        }

    @And("^User click on the updateApprove in Charge$")
    public void user_click_on_the_updateapprove_in_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.UpdateAftersubmit(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.UpdateAftersubmit());
        SMS_productCWobj.UpdateAftersubmit().click();
    }
    @Given("user click on the Save Button in Charge")
    public void user_click_on_the_save_button_in_charge() {
     waitHelper.waitForElementToVisibleWithFluentWait(driver, SMS_productCWobj.Savebutton_SMS(), 60, 2);
     ClicksAndActionsHelperobj.moveToElement(SMS_productCWobj.Savebutton_SMS());
     SMS_productCWobj.Savebutton_SMS().click();
     
        

    }
	
	
}
