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
import pageobjects.Delete_chequeBook;
import resources.BaseClass;

public class Delete_chequebook {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Delete_chequeBook Delete_chequeBookobj = new Delete_chequeBook(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	
	@Given("^User login to cheque book in delect$")
    public void user_login_to_cheque_book_in_delect() throws Throwable {
		 driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMApplication();
    }

    @And("^User click the Chequebook Request button1 in delete$")
    public void user_click_the_chequebook_request_button1_in_delete() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Delete_chequeBookobj.Chequebook1(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Delete_chequeBookobj.Chequebook1());
    	Delete_chequeBookobj.Chequebook1().click();
    }

    @And("^User select the To deleted chequebook button$")
    public void user_select_the_to_deleted_chequebook_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Delete_chequeBookobj.Destroyed_cheque(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Delete_chequeBookobj.Destroyed_cheque());
    	Delete_chequeBookobj.Destroyed_cheque().click(); 
    }

    @And("^User enter the code button for To delete chequebook$")
    public void user_enter_the_code_button_for_to_delete_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Delete_chequeBookobj.Destroyed_code(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Delete_chequeBookobj.Destroyed_code());
    	Delete_chequeBookobj.Destroyed_code().click();
    	Delete_chequeBookobj.Destroyed_code().sendKeys("Code1");
    }

    @And("^User enter the From Number for To delete chequebook$")
    public void user_enter_the_from_number_for_to_delete_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Delete_chequeBookobj.Destroyed_code(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Delete_chequeBookobj.Destroyed_code());
    	Delete_chequeBookobj.Destroyed_code().click();
    	Delete_chequeBookobj.Destroyed_code().sendKeys("FromNumber1");
    }

    @And("^User enter the To Number for To delete chequebook$")
    public void user_enter_the_to_number_for_to_delete_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Delete_chequeBookobj.Destroyed_code(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Delete_chequeBookobj.Destroyed_code());
    	Delete_chequeBookobj.Destroyed_code().click();
    	Delete_chequeBookobj.Destroyed_code().sendKeys("ToNumber1");   
    }

    @And("^User click the To delete button for To delete chequebook$")
    public void user_click_the_to_delete_button_for_to_delete_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Delete_chequeBookobj.ToDestroy(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Delete_chequeBookobj.ToDestroy());
    	Delete_chequeBookobj.ToDestroy().click();
    	
    }

    @And("^user click on ok button To delete chequebook$")
    public void user_click_on_ok_button_to_delete_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Delete_chequeBookobj.okBUTTON(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Delete_chequeBookobj.okBUTTON());
    	Delete_chequeBookobj.okBUTTON().click();
    
    }
}
