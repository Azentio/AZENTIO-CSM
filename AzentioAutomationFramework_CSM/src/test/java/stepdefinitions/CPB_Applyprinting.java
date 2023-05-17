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
import pageobjects.ChequeBook_Printing;
import pageobjects.FunctionalTesting_ChequeBook;
import resources.BaseClass;

public class CPB_Applyprinting {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ChequeBook_Printing ChequeBook_Printingobj = new ChequeBook_Printing(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	 @Given("^User login to CSM application$")
	    public void user_login_to_csm_application() throws Throwable {
		 String CSMApplicationUrl = configFileReader.getCSMApplicationUrl();
			driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMApplication();
	    }

	    @And("^Click the Parameters button $")
	    public void click_the_parameters_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Printingobj.Parameters1(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Printingobj.Parameters1());
	    	ChequeBook_Printingobj.Parameters1().click();
	    }

	    @And("^Click the System parameters button$")
	    public void click_the_system_parameters_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Printingobj.SystemParameters(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Printingobj.SystemParameters());
	    	ChequeBook_Printingobj.SystemParameters().click();
	    }

	    @And("^Click the control Record button $")
	    public void click_the_control_record_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Printingobj.Controlrecord(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Printingobj.Controlrecord());
	    	ChequeBook_Printingobj.Controlrecord().click(); 
	    }

	    @And("^Click the Apply cheque printing box$")
	    public void click_the_apply_cheque_printing_box() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Printingobj.Applychqprint(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Printingobj.Applychqprint());
	    	ChequeBook_Printingobj.Applychqprint().click();
	    }
}
