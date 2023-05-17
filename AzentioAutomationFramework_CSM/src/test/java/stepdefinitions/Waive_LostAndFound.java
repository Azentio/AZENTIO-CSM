package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.Lostfound_Management;
import resources.BaseClass;

public class Waive_LostAndFound {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Lostfound_Management Lostfound_Managementobj = new Lostfound_Management(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("^User login in CSM Lost&Found in waive chargessss$")
    public void user_login_in_csm_lostfound_in_waive_charge() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
        login.loginIntoCSMApplication();
    }

    @Given("^User login in CSM Param in waive chargessss$")
    public void user_login_in_csm_param_in_waive_charge() throws Throwable {
    	driver.get(configFileReader.getCSMApplicationUrl());
        login.loginIntoCSMParamApplication();
       
    }

    @And("^User click on Element LostFound_CW to Waive charge$")
    public void user_click_on_element_lostfoundcw_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.LostFound_CW(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.LostFound_CW());
    	Lostfound_Managementobj.LostFound_CW().click();
    	
       
    }

    @And("^User click on Element Maintenancebutton_lostfound to waive charge$")
    public void user_click_on_element_maintenancebuttonlostfound_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.Maintenancebutton_lostfound(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.Maintenancebutton_lostfound());
    	Lostfound_Managementobj.Maintenancebutton_lostfound().click();
    	
    	
       
    }

    @And("^User click on Element search button to waive charge$")
    public void user_click_on_element_search_button_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.SearchBUTTOn1(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.SearchBUTTOn1());
    	Lostfound_Managementobj.SearchBUTTOn1().click();
    	
       
    }

    @And("^User click on Element TRx_No to waive charge$")
    public void user_click_on_element_trxno_to_waive_charge() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.TRX_No(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.TRX_No());
    	Lostfound_Managementobj.TRX_No().click();
    	Lostfound_Managementobj.TRX_No().sendKeys(testData.get("TRx_No"));
    	
    }

    @And("^User click on Element ShortName_Eng to waive charge$")
    public void user_click_on_element_shortnameeng_to_waive_charge() throws Throwable {
      	 waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.ShortName_Eng(), 60,2);
     	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.ShortName_Eng());
     	Lostfound_Managementobj.ShortName_Eng().click();
     	Lostfound_Managementobj.ShortName_Eng().sendKeys(testData.get("ShortName"));
       
    }

    @And("^Close the pop msg in lost and found management$")
    public void close_the_pop_msg_in_lost_and_found_management() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.okBUTTON(),60,2);
      	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.okBUTTON());
      	Lostfound_Managementobj.okBUTTON().click();
        
       
    }

    @And("^User click on Element ChargesDetails_Lost to waive charge$")
    public void user_click_on_element_chargesdetailslost_to_waive_charge() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.ChargesDetails_Lost(), 60,2);
       	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.ChargesDetails_Lost());
       	Lostfound_Managementobj.ChargesDetails_Lost().click();
       
    }

    @And("^User click on Element Savebox to waive charge$")
    public void user_click_on_element_savebox_to_waive_charge() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.Savebox(), 60,2);
        	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.Savebox());
        	Lostfound_Managementobj.Savebox().click();
        
       
    }

    @And("^User click on Element Parameters12 to Waive charge$")
    public void user_click_on_element_parameters12_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.Parameters12(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.Parameters12());
    	Lostfound_Managementobj.Parameters12().click();
    
       
    }

    @And("^User click on Element SystemParameters to Waive charge$")
    public void user_click_on_element_systemparameters_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.SystemParameters(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.SystemParameters());
    	Lostfound_Managementobj.SystemParameters().click();
       
    }

    @And("^User click on Element Transactiontype1 to Waive charge$")
    public void user_click_on_element_transactiontype1_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.Transactiontype1(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.Transactiontype1());
    	Lostfound_Managementobj.Transactiontype1().click();
    }

    @And("^User click on Element Maintenancebutton_lostfound1 to Waive charge$")
    public void user_click_on_element_maintenancebuttonlostfound1_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.Maintenancebutton_lostfound1(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.Maintenancebutton_lostfound1());
    	Lostfound_Managementobj.Maintenancebutton_lostfound1().click();
    
       
    }

    @And("^User click on Element CODESEARCHbox1 to Waive charge$")
    public void user_click_on_element_codesearchbox1_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.CODESEARCHbox1(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.CODESEARCHbox1());
    	Lostfound_Managementobj.CODESEARCHbox1().click();
    	Lostfound_Managementobj.CODESEARCHbox1().sendKeys(testData.get("Code"));
       
    }

    @And("^User click on Element ShortDESCRIPTIONs to Waive charge$")
    public void user_click_on_element_shortdescriptions_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.ShortDESCRIPTIONs(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.ShortDESCRIPTIONs());
    	Lostfound_Managementobj.ShortDESCRIPTIONs().click();
    	Lostfound_Managementobj.ShortDESCRIPTIONs().sendKeys(testData.get("Short Decription")); 
    }

    @And("^User click on Element AllowUSERbox1 to Waive charge$")
    public void user_click_on_element_allowuserbox1_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.AllowUSERbox1(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.AllowUSERbox1());
    	Lostfound_Managementobj.AllowUSERbox1().click();
    
    }

    @And("^User click on Element UpdateAfterAPPROVE123 to waive charge$")
    public void user_click_on_element_updateafterapprove123_to_waive_charge() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.UpdateAfterAPPROVE123(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.UpdateAfterAPPROVE123());
    	Lostfound_Managementobj.UpdateAfterAPPROVE123().click();
    }

    @And("^User click on Element okBUTTON$")
    public void user_click_on_element_okbutton() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.okBUTTON(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.okBUTTON());
    	Lostfound_Managementobj.okBUTTON().click();
       
    }
    @And("^User click on Element search button to Waive charge1$")
    public void user_click_on_element_search_button_to_waive_charge1() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Lostfound_Managementobj.SearchBUTTOn1(), 60,2);
    	ClicksAndActionsHelperobj.moveToElement(Lostfound_Managementobj.SearchBUTTOn1());
    	Lostfound_Managementobj.SearchBUTTOn1().click();
    }

}
