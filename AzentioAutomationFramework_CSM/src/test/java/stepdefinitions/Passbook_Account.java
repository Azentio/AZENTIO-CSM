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
import pageobjects.Passbook_CSM;
import pageobjects.Transaction_CAM;
import resources.BaseClass;

public class Passbook_Account {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Passbook_CSM Passbook_CSMobject = new Passbook_CSM(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin csmLogin = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("^User create SADS login to passbook for Account Restriction$")
    public void user_create_sads_login_to_passbook_for_account_restriction() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication();    }

    @And("^User click on the Passbook in CSM Module$")
    public void user_click_on_the_passbook_in_csm_module() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.Passbook(), 60, 2);
    	Passbook_CSMobject.Passbook().click();
    	 }

    @And("^User click on the Maintenance in CSM Module$")
    public void user_click_on_the_maintenance_in_csm_module() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.Maintenance(), 60, 2);
    	Passbook_CSMobject.Maintenance().click();
    }

    @And("^User click on the Passbook Type in CSM Module$")
    public void user_click_on_the_passbook_type_in_csm_module() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.passbookType(), 60, 2);
    	Passbook_CSMobject.passbookType().click();
    	Passbook_CSMobject.passbookType().sendKeys(testData.get("Search"));
    }

    @And("^User click on the Branch code in CSM Module$")
    public void user_click_on_the_branch_code_in_csm_module() throws Throwable {
       selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.BranchCode(), 60, 2);
       Passbook_CSMobject.BranchCode().click();
       Passbook_CSMobject.BranchCode().sendKeys(testData.get("Branch Code"));
    }

    @And("^User click on the Currency code in CSM Module$")
    public void user_click_on_the_currency_code_in_csm_module() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.CurrencyCode(), 60, 2);
    	Passbook_CSMobject.CurrencyCode().click();
    	Passbook_CSMobject.CurrencyCode().sendKeys(testData.get("Currency Code"));
    }

    @And("^User clcik on the GL code in CSM Module$")
    public void user_clcik_on_the_gl_code_in_csm_module() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.Glcode(), 60, 2);
    	Passbook_CSMobject.Glcode().click();
    	Passbook_CSMobject.Glcode().sendKeys(testData.get("GL code"));
    	
    }

    @And("^User click on the CIF code in CSM Module$")
    public void user_click_on_the_cif_code_in_csm_module() throws Throwable {
        selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.CifCode(), 60, 2);
        Passbook_CSMobject.CifCode().click();
        Passbook_CSMobject.CifCode().sendKeys(testData.get("CIF Code"));
    }

    @And("^Uesr click on the Serial code in CSM Module$")
    public void uesr_click_on_the_serial_code_in_csm_module() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.SerialNo(), 60, 2);
    	Passbook_CSMobject.SerialNo().click();
    	Passbook_CSMobject.SerialNo().sendKeys(testData.get("serial No"));
    }

    @And("^User click on the Save button in CSM Module$")
    public void user_click_on_the_save_button_in_csm_module() throws Throwable {
    	selenium_Actions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Passbook_CSMobject.SaveButton(), 60, 2);
    	Passbook_CSMobject.SaveButton().click();
    }
	
}
