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
import pageobjects.CSM_AmendChequeCard_OBJ;
import pageobjects.CSM_Transactions_OBJ;
import resources.BaseClass;

public class CSM_AmendChequeCard_Steps {
    
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_AmendChequeCard_OBJ csmAmendChequeCard = new CSM_AmendChequeCard_OBJ(driver);
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
    
	@Given("user update test data set id for ACSD_013$")
	public void user_update_test_data_set_id_for_acsd013() throws Throwable {
		testData = csmAmendChequeCardExcelData.getTestdata("ACSD_013_D3");
	}
	
    @Then("^user enter the card type value under maintenance$")
    public void user_enter_the_card_type_value_under_maintenance() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.CardType());
        csmAmendChequeCard.CardType().click();
        csmAmendChequeCard.CardType().sendKeys(testData.get("Card Type"));
        //csmAmendChequeCard.CardType.sendKeys("0003");
    }

    @Then("^user verify the pop message$")
    public void user_verify_the_pop_message() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.ErrorPopupMessage());
        Assert.assertTrue(csmAmendChequeCard.ErrorPopupMessage().isDisplayed());
    }

    @And("^user click the amend cheque card status icon$")
    public void user_click_the_amend_cheque_card_status_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAmendChequeCard.AmendChequeCardOptions());
        csmAmendChequeCard.AmendChequeCardOptions().click();
    }

    @And("^user click the maintenance under amend cheque card status$")
    public void user_click_the_maintenance_under_amend_cheque_card_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAmendChequeCard.MaintenanceIcon());
        csmAmendChequeCard.MaintenanceIcon().click();
    }

    @And("^user select the product type under maintenance$")
    public void user_select_the_product_type_under_maintenance() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAmendChequeCard.ProductType());
    	seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmAmendChequeCard.ProductType(), testData.get("Product Type"));
        
    }

    @And("^user select the status under maintenance$")
    public void user_select_the_status_under_maintenance() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.StatusSelectIcon());
        csmAmendChequeCard.StatusSelectIcon().click();
        csmAmendChequeCard.StatusSelectIcon().sendKeys(testData.get("Status"));
        //csmAmendChequeCard.StatusSelectIcon.sendKeys("destroyed");
    }

    @And("^user enter the card number value under maintenance$")
    public void user_enter_the_card_number_value_under_maintenance() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.CardNo());
        csmAmendChequeCard.CardNo().click();
        csmAmendChequeCard.CardNo().sendKeys(testData.get("Card Number"));
        //csmAmendChequeCard.CardNo.sendKeys("350000000371");
    }

    @And("^user click the retrieve button$")
    public void user_click_the_retrieve_button() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.RetrieveButton());
        csmAmendChequeCard.RetrieveButton().click();
        //csmAmendChequeCard.RetrieveButton.sendKeys(testData.get("Application ID"));
        //csmAmendChequeCard.RetrieveButton.sendKeys("80");
    }

    @And("^user click the ok button under maintenance$")
    public void user_click_the_ok_button_under_maintenance() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.PopupMessageOkButton());
        csmAmendChequeCard.PopupMessageOkButton().click();
    }
    
    @Then("^user verify the save popup$")
    public void user_verify_the_save_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.verifyPopupInPaidCheque());
        Assert.assertTrue(csmAmendChequeCard.verifyPopupInPaidCheque().isDisplayed());
    }

    @And("^user update test data set id for ACSD_014$")
    public void user_update_test_data_set_id_for_acsd014() throws Throwable {
    	testData = csmAmendChequeCardExcelData.getTestdata("ACSD_014_D2");
    }

    @And("^user enter the branch code value under product type$")
    public void user_enter_the_branch_code_value_under_product_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.BranchCode());
    	seleniumActions.getClickAndActionsHelper().moveToElement(csmAmendChequeCard.BranchCode());
    	seleniumActions.getClickAndActionsHelper().clickOnElement(csmAmendChequeCard.BranchCode());
    	csmAmendChequeCard.BranchCode().sendKeys(testData.get("Branch Code "));
    }

    @And("^user enter the currency code value under product type$")
    public void user_enter_the_currency_code_value_under_product_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.CurrencyCode());
    	seleniumActions.getClickAndActionsHelper().moveToElement(csmAmendChequeCard.CurrencyCode());
    	seleniumActions.getClickAndActionsHelper().clickOnElement(csmAmendChequeCard.CurrencyCode());
//    	validChequeObj.CurrencyCode().click();
    	csmAmendChequeCard.CurrencyCode().sendKeys(testData.get("Currency Code "));
    }

    @And("^user enter the GL code value under product type$")
    public void user_enter_the_gl_code_value_under_product_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmAmendChequeCard.GlCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmAmendChequeCard.GlCode());
    	seleniumActions.getClickAndActionsHelper().clickOnElement(csmAmendChequeCard.GlCode());
//        validChequeObj.CurrencyCode().click();
    	csmAmendChequeCard.GlCode().sendKeys(testData.get("GL Code "));
    }

    @And("^user enter the CIF code value under product type$")
    public void user_enter_the_cif_code_value_under_product_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.CifCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmAmendChequeCard.CifCode());
    	seleniumActions.getClickAndActionsHelper().clickOnElement(csmAmendChequeCard.CifCode());
//        validChequeObj.CifCode().click();
    	csmAmendChequeCard.CifCode().sendKeys(testData.get("CIF Code "));
    }

    @And("^user enter the serial no under product type$")
    public void user_enter_the_serial_no_under_product_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.SerialNo());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmAmendChequeCard.SerialNo());
    	seleniumActions.getClickAndActionsHelper().clickOnElement(csmAmendChequeCard.SerialNo());
//        validChequeObj.SerialNo().click();
    	csmAmendChequeCard.SerialNo().sendKeys(testData.get("Serial No"));
    }

    @And("^user enter the cheque no under product type$")
    public void user_enter_the_cheque_no_under_product_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmAmendChequeCard.ChequeNo());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmAmendChequeCard.ChequeNo());
    	seleniumActions.getClickAndActionsHelper().clickOnElement(csmAmendChequeCard.ChequeNo());
//        validChequeObj.ChequeNo().click();
    	csmAmendChequeCard.ChequeNo().sendKeys(testData.get("Cheque No"));
    }

    

    @And("^user click the check box$")
    public void user_click_the_check_box() throws Throwable {
        
    }

    @And("^user click the update button$")
    public void user_click_the_update_button() throws Throwable {
        
    }
}
