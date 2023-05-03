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
import pageobjects.Certificate_product;

import resources.BaseClass;

public class ChargeWaiver_CertificateProduct {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Certificate_product Certificate_productobj = new Certificate_product(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	

    @And("^User Click On The Certificate Link$")
    public void user_click_on_the_certificate_link() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.certificatebutton() , 60,2);
    	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.certificatebutton());
    	 Certificate_productobj.certificatebutton().click();
    }

    @And("^User Click On The Maintenance Box$")
    public void user_click_on_the_maintenance_box() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.Maintenancebutton() , 60,2);
   	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.Maintenancebutton());
   	 Certificate_productobj.Maintenancebutton().click();
        
    }

    @And("^User Click On The Certificate searchButton$")
    public void user_click_on_the_certificate_searchbutton() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.cerifiticateSearchbutton() , 60,2);
   	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.cerifiticateSearchbutton());
   	 Certificate_productobj.cerifiticateSearchbutton().click();
    }

    @And("^User Select  On The Certficate Code$")
    public void user_select_on_the_certficate_code() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.certificatecode() , 60,2);
   	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.certificatecode());
   	 Certificate_productobj.certificatecode().click();
   	Certificate_productobj.certificatecode().sendKeys(testData.get("Code"));
   	 
    }

    @And("^User Select On The Bill Certificate$")
    public void user_select_on_the_bill_certificate() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.Billdetails() , 60,2);
      	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.Billdetails());
      	 Certificate_productobj.Billdetails().click();
      
    }

    @And("^User Click On The CIFNo$")
    public void user_click_on_the_cifno() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.CIFNo() , 60,2);
     	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.CIFNo());
     	 Certificate_productobj.CIFNo().click();
     	Certificate_productobj.CIFNo().sendKeys(testData.get("Code"));
     	Certificate_productobj.CIFNo().sendKeys(testData.get("CIF No")); 
        
    }

    @And("^User Click On The Number Of Bills$")
    public void user_click_on_the_number_of_bills() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.Numberofbills() , 60,2);
    	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.Numberofbills());
    	 Certificate_productobj.certificatecode().sendKeys(testData.get("Number of Bills"));
    	 Certificate_productobj.Numberofbills().click();
    }

    @And("^User Click On The Total Amount Bill$")
    public void user_click_on_the_total_amount_bill() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.Totalamount_bill() , 60,2);
    	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.Totalamount_bill());
    	 Certificate_productobj.Totalamount_bill().click();
    	 Certificate_productobj.Totalamount_bill().sendKeys(testData.get("Total Amount Bills"));
        
    }

    @And("^User Click On The Deduct Certificate$")
    public void user_click_on_the_deduct_certificate() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.deductcertificate(), 60,2);
    	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.deductcertificate());
    	 Certificate_productobj.deductcertificate().click();
    }

    @And("^User Click On The Credit Account$")
    public void user_click_on_the_credit_account() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.credit_Account(), 60,2);
   	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.credit_Account());
   	 Certificate_productobj.credit_Account().click();
    }

    @And("^User Click On The POP Up Msg$")
    public void user_click_on_the_pop_up_msg() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Certificate_productobj.POPupmsg(), 60,2);
   	 ClicksAndActionsHelperobj.moveToElement(Certificate_productobj.POPupmsg());
   	 Certificate_productobj.POPupmsg().click();
    }



}
