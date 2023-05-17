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
import io.cucumber.java.en.Given;
import pageobjects.ChequeBook_Cancel;
import resources.BaseClass;

public class Cancel_process {
	
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ChequeBook_Cancel ChequeBook_Cancelobj = new ChequeBook_Cancel(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("^User login to cheque book in Reverse$")
    public void user_login_to_cheque_book_in_reverse() throws Throwable {
		 driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMApplication();
    }

    @And("^User click the Chequebook Request button$")
    public void user_click_the_chequebook_request_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Cancelobj.Chequebook1(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Cancelobj.Chequebook1());
    	ChequeBook_Cancelobj.Chequebook1().click();
    	
    }

    @And("^User click the To Cancelchequebook button$")
    public void user_select_the_to_cancelchequebook_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Cancelobj.Cancelchequebook(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Cancelobj.Cancelchequebook());
    	ChequeBook_Cancelobj.Cancelchequebook().click();
    }

    @And("^User enter the code button$")
    public void user_enter_the_code_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Cancelobj.code_Cancel(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Cancelobj.code_Cancel());
    	ClicksAndActionsHelperobj.doubleClick(ChequeBook_Cancelobj.code_Cancel());
    	ChequeBook_Cancelobj.code_Cancel().click();
    	ChequeBook_Cancelobj.code_Cancel().sendKeys("Code");
    	ChequeBook_Cancelobj.code_Cancel().sendKeys(Keys.ENTER);
    }

    @And("^User enter the From Number$")
    public void user_enter_the_from_number() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Cancelobj.FromNumber(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Cancelobj.FromNumber());
    	ClicksAndActionsHelperobj.doubleClick(ChequeBook_Cancelobj.FromNumber());
    	ChequeBook_Cancelobj.FromNumber().click();
    	ChequeBook_Cancelobj.FromNumber().sendKeys("FromNumber");
    	ChequeBook_Cancelobj.FromNumber().sendKeys(Keys.ENTER);
    }

    @And("^User enter the To Number$")
    public void user_enter_the_to_number() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Cancelobj.ToNumber(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Cancelobj.ToNumber());
    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Cancelobj.ToNumber());
    	ChequeBook_Cancelobj.ToNumber().click();
    	ChequeBook_Cancelobj.ToNumber().sendKeys("ToNumber");
    	ChequeBook_Cancelobj.ToNumber().sendKeys(Keys.ENTER);
    }

    @And("^User click the Tocancelbutton$")
    public void user_click_the_tocancelbutton() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Cancelobj.Tocancelbutton(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Cancelobj.Tocancelbutton());
    	ChequeBook_Cancelobj.Tocancelbutton().click();
    }

    @And("^user click on ok button$")
    public void user_click_on_ok_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ChequeBook_Cancelobj.okBUTTON1(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(ChequeBook_Cancelobj.okBUTTON1());
    	ChequeBook_Cancelobj.okBUTTON1().click();
    }

}
