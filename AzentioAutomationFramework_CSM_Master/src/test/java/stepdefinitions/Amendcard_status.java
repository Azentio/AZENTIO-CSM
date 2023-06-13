package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.csm.Amendcheque_card;
import resources.BaseClass;

public class Amendcard_status {
	
	WebDriver driver = BaseClass.driver;
	Amendcheque_card Amendcheque_cardobj = new Amendcheque_card(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	Map<String, String> testData = new HashMap<>();
	CSMLogin csmLogin = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	String excelPath=System.getProperty("user.dir")+"\\TestData\\CSMTestData.xlsx";
	ExcelData exceldata = new ExcelData(excelPath, "Amend cheque card Status", "Data Set ID");
	
	@Given("^User login to Card Status for cheque book$")
    public void user_login_to_card_status_for_cheque_book() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
        csmLogin.loginIntoCSMApplication();    
        }

    @And("^User click on the Amend cheque card status in cancelled Record$")
    public void user_click_on_the_amend_cheque_card_status_in_cancelled_record() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.AmendChequeCard(), 60, 2);
    	Amendcheque_cardobj.AmendChequeCard().click();
    	ClicksAndActionsHelperobj.clickOnElement(Amendcheque_cardobj.AmendChequeCard());
    }

    @And("^user click on the maintenance in cancelled Record$")
    public void user_click_on_the_maintenance_in_cancelled_record() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.Maintenancebutton(), 60, 2);
    	Amendcheque_cardobj.Maintenancebutton().click();
    	ClicksAndActionsHelperobj.clickOnElement(Amendcheque_cardobj.Maintenancebutton());
    }

    @And("^user Select on the Product type in cancelled Record$")
    public void user_select_on_the_product_type_in_cancelled_record() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.productType(), 60, 2);
    	Amendcheque_cardobj.productType().click();
    	ClicksAndActionsHelperobj.clickOnElement(Amendcheque_cardobj.productType());
    	
    }

    @And("^User click on the chequeNo in Cancelled Record$")
    public void user_click_on_the_chequeno_in_cancelled_record() throws Throwable {
    waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.RequestNo(), 60, 2);
    Amendcheque_cardobj.RequestNo().click();
    ClicksAndActionsHelperobj.clickOnElement(Amendcheque_cardobj.RequestNo());
    Amendcheque_cardobj.RequestNo().sendKeys(testData.get("RequestNo"));
    
    
}

    @And("^User Select on the Status in Cancelled Record$")
    public void user_select_on_the_status_in_cancelled_record() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.ChequeStatus(), 60, 2);
        Amendcheque_cardobj.ChequeStatus().click();
        ClicksAndActionsHelperobj.moveToElement(Amendcheque_cardobj.ChequeStatus());
        
    }

    @And("^User click on the Branch code in Cancelled Record$")
    public void user_click_on_the_branch_code_in_cancelled_record() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.BranchCode(), 60, 2);
        Amendcheque_cardobj.BranchCode().click();
        ClicksAndActionsHelperobj.moveToElement(Amendcheque_cardobj.BranchCode());
        Amendcheque_cardobj.BranchCode().sendKeys(testData.get("Branch code"));
    }

    @And("^User click on the Currency button in Cancelled Record$")
    public void user_click_on_the_currency_button_in_cancelled_record() throws Throwable {
      waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.CurrencyCode(), 60, 2);
      Amendcheque_cardobj.CurrencyCode().click();
      ClicksAndActionsHelperobj.moveToElement(Amendcheque_cardobj.CurrencyCode());
      Amendcheque_cardobj.CurrencyCode().sendKeys(testData.get("Currency Code"));
    }

    @And("^User click on the GL code in Cancelled Record$")
    public void user_click_on_the_gl_code_in_cancelled_record() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.Glcode(), 60, 2);
        Amendcheque_cardobj.Glcode().click();
        ClicksAndActionsHelperobj.moveToElement(Amendcheque_cardobj.Glcode());
        Amendcheque_cardobj.Glcode().sendKeys(testData.get("GL code"));
    }

    @And("^User click on the CIF type in Cancelled Record$")
    public void user_click_on_the_cif_type_in_cancelled_record() throws Throwable {
    waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.CifCode(), 60, 2);
    Amendcheque_cardobj.CifCode().click();
    ClicksAndActionsHelperobj.moveToElement(Amendcheque_cardobj.CifCode());
    Amendcheque_cardobj.CifCode().sendKeys(testData.get("CIF code"));
}

    @And("^User click on the Serial Number in Cancelled Record$")
    public void user_click_on_the_serial_number_in_cancelled_record() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.SerialNo(), 60, 2); 
    	Amendcheque_cardobj.SerialNo().click();
    	ClicksAndActionsHelperobj.moveToElement(Amendcheque_cardobj.SerialNo());
    	Amendcheque_cardobj.SerialNo().sendKeys(testData.get("Serial Number"));
    }

    @And("^User click on the Update button in Cancelled Record$")
    public void user_click_on_the_update_button_in_cancelled_record() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.UpdateButton(), 60, 2);   
    	Amendcheque_cardobj.UpdateButton().click();
    	ClicksAndActionsHelperobj.moveToElement(Amendcheque_cardobj.UpdateButton());
    }

    @And("^User click on the icon button in Cancelled Record$")
    public void user_click_on_the_icon_button_in_cancelled_record() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, Amendcheque_cardobj.iconbutton(), 60, 2);
        Amendcheque_cardobj.iconbutton().click();
        ClicksAndActionsHelperobj.moveToElement(Amendcheque_cardobj.UpdateButton());
    }

}
	
	
	


