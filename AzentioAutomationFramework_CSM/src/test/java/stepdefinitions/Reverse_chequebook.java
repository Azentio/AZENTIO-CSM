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
import pageobjects.ChequeBook_Cancel;
import pageobjects.Cheque_ReveresBook;
import resources.BaseClass;

public class Reverse_chequebook {
 
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Cheque_ReveresBook Cheque_ReveresBookobj = new Cheque_ReveresBook(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("^User login to cheque book in Cancel$")
    public void user_login_to_cheque_book_in_cancel() throws Throwable {
		String CSMApplicationUrl = configFileReader.getCSMApplicationUrl();
		driver.get(configFileReader.getCSMApplicationUrl());
        login.loginIntoCSMApplication();
    }

    @And("^User click the Chequebook Request button1$")
    public void user_click_the_chequebook_request_button1() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cheque_ReveresBookobj.Chequebook1(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Cheque_ReveresBookobj.Chequebook1());
    	Cheque_ReveresBookobj.Chequebook1().click();
    }

    @And("^User select the To Reversed chequebook button$")
    public void user_select_the_to_reversed_chequebook_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cheque_ReveresBookobj.ReversedChequebook(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Cheque_ReveresBookobj.ReversedChequebook());
    	Cheque_ReveresBookobj.ReversedChequebook().click();
    }

    @And("^User enter the code button for To Reversed chequebook$")
    public void user_enter_the_code_button_for_to_reversed_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cheque_ReveresBookobj.Reverse_code(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Cheque_ReveresBookobj.Reverse_code());
    	Cheque_ReveresBookobj.Reverse_code().click();
    	Cheque_ReveresBookobj.Reverse_code().sendKeys("Code");
    }

    @And("^User enter the From Number for To Reversed chequebook$")
    public void user_enter_the_from_number_for_to_reversed_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cheque_ReveresBookobj.FromNumber2(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Cheque_ReveresBookobj.FromNumber2());
    	Cheque_ReveresBookobj.FromNumber2().click();
    	Cheque_ReveresBookobj.FromNumber2().sendKeys("FromNumber");
    }

    @And("^User enter the To Number for To Reversed chequebook$")
    public void user_enter_the_to_number_for_to_reversed_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cheque_ReveresBookobj.ToNumber2(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Cheque_ReveresBookobj.ToNumber2());
    	Cheque_ReveresBookobj.ToNumber2().click();
    	Cheque_ReveresBookobj.ToNumber2().sendKeys("ToNumber");
    }

    @And("^User click the Tocancelbutton for To Reversed chequebook$")
    public void user_click_the_tocancelbutton_for_to_reversed_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cheque_ReveresBookobj.Reversed_submit(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Cheque_ReveresBookobj.Reversed_submit());
    	Cheque_ReveresBookobj.Reversed_submit().click();
    }

    @And("^user click on ok button To Reversed chequebook$")
    public void user_click_on_ok_button_to_reversed_chequebook() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cheque_ReveresBookobj.okBUTTON2(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Cheque_ReveresBookobj.okBUTTON2());
    	Cheque_ReveresBookobj.okBUTTON2().click();
    }
	
	
}
