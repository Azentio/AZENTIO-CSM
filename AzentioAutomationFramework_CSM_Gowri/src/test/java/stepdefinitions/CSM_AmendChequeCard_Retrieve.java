package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM_Amend_Cheque_Card_OBJ;
import pageobjects.CSM_Transactions_OBJ;
import resources.BaseClass;

public class CSM_AmendChequeCard_Retrieve {
    
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_Amend_Cheque_Card_OBJ csmAmendChequeCard = new CSM_Amend_Cheque_Card_OBJ(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData csmAmendChequeCardExcelData = new ExcelData(path,"CSM_Amend_Check_Card_Status","Data Set ID");
	Map<String, String> testData;
	
	
//	@Given("^user login as csm core application$")
//    public void user_login_as_csm_core_application() throws Throwable {
//        
//    }
	
	@And("^user update test data set id for ACSD_015$")
    public void user_update_test_data_set_id_for_acsd015() throws Throwable {
		testData = csmAmendChequeCardExcelData.getTestdata("ACSD_015_D1");
    }

    @Then("^user enter the card type value under maintenance$")
    public void user_enter_the_card_type_value_under_maintenance() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.CardType);
        csmAmendChequeCard.CardType.click();
        csmAmendChequeCard.CardType.sendKeys(testData.get("Card Type"));
        //csmAmendChequeCard.CardType.sendKeys("0003");
    }

    @Then("^user verify the pop message$")
    public void user_verify_the_pop_message() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.ErrorPopupMessage);
        Assert.assertTrue(csmAmendChequeCard.ErrorPopupMessage.isDisplayed());
    }

    @And("^user click the amend cheque card status icon$")
    public void user_click_the_amend_cheque_card_status_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAmendChequeCard.AmendChequeCardOptions);
        csmAmendChequeCard.AmendChequeCardOptions.click();
    }

    @And("^user click the maintenance under amend cheque card status$")
    public void user_click_the_maintenance_under_amend_cheque_card_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAmendChequeCard.MaintenanceIcon);
        csmAmendChequeCard.MaintenanceIcon.click();
    }

    @And("^user select the product type under maintenance$")
    public void user_select_the_product_type_under_maintenance() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAmendChequeCard.ProductType);
    	seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmAmendChequeCard.ProductType, "Card");
        
    }

    @And("^user select the status under maintenance$")
    public void user_select_the_status_under_maintenance() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.StatusSelectIcon);
        csmAmendChequeCard.StatusSelectIcon.click();
        csmAmendChequeCard.StatusSelectIcon.sendKeys(testData.get("Status"));
        //csmAmendChequeCard.StatusSelectIcon.sendKeys("destroyed");
    }

    @And("^user enter the card number value under maintenance$")
    public void user_enter_the_card_number_value_under_maintenance() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.CardNo);
        csmAmendChequeCard.CardNo.click();
        csmAmendChequeCard.CardNo.sendKeys(testData.get("Card Number"));
        //csmAmendChequeCard.CardNo.sendKeys("350000000371");
    }

    @And("^user click the retrieve button$")
    public void user_click_the_retrieve_button() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.RetrieveButton);
        csmAmendChequeCard.RetrieveButton.click();
        //csmAmendChequeCard.RetrieveButton.sendKeys(testData.get("Application ID"));
        //csmAmendChequeCard.RetrieveButton.sendKeys("80");
    }

    @And("^user click the ok button under maintenance$")
    public void user_click_the_ok_button_under_maintenance() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.PopupMessageOkButton);
        csmAmendChequeCard.PopupMessageOkButton.click();
    }
}
