package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then;
import pageobjects.CSM_Passbook_OBJ;
import resources.BaseClass;

public class CSM_Passbooks_Restriction extends BaseClass{
    
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_Passbook_OBJ csmPassbookObject = new CSM_Passbook_OBJ(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\Test_Data.xlsx";
	ExcelData csmTransactionsExcelData = new ExcelData(path,"CSM_Passbooks","Data Set ID");
	Map<String, String> testData;
	
//	@Given("^user login as csm core application$")
//    public void user_login_as_csm_core_application() throws Throwable {
//		String csmApplicationUrl = configFileReader.getCSMApplicationUrl();
//		driver.get(csmApplicationUrl);
//		login.loginIntoCSMApplication();
//    }

    @Then("^user enter the value for passbook type$")
    public void user_enter_the_value_for_passbook_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.PassBookType());
    	csmPassbookObject.PassBookType().click();
    	csmPassbookObject.PassBookType().sendKeys(testData.get("Passbook type"));
        
    }
    
    @And("^user click the passbooks maintenance icon$")
    public void user_click_the_passbooks_maintenance_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.PassbookTypeSearchIcon());
    	csmPassbookObject.PassbookTypeSearchIcon().click();
    }

    
    @And("^user update test data set id for TC_SAD_0074$")
    public void user_update_test_data_set_id_for_tcsad0074() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("TC_SAD_0074_D1");
    }

    @And("^user click the passbooks in menu options$")
    public void user_click_the_passbooks_in_menu_options() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.PassBookIcon());
        csmPassbookObject.PassBookIcon().click();
    }

    @And("^user click the maintenance under passbooks$")
    public void user_click_the_maintenance_under_passbooks() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.Maintenance());
        csmPassbookObject.Maintenance().click();
    }

    @And("^user enter the branch code value under passbook type$")
    public void user_enter_the_branch_code_value_under_passbook_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.BranchCode());
        csmPassbookObject.BranchCode().click();
        csmPassbookObject.BranchCode().sendKeys(testData.get("Transaction Branchcode"));
    }

    @And("^user enter the currency code value under passbook type$")
    public void user_enter_the_currency_code_value_under_passbook_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.CurrencyCode());
        csmPassbookObject.CurrencyCode().click();
        csmPassbookObject.CurrencyCode().sendKeys(testData.get("Currency code"));
    }

    @And("^user enter the GL code value under passbook type$")
    public void user_enter_the_gl_code_value_under_passbook_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.Glcode());
        csmPassbookObject.Glcode().click();
        csmPassbookObject.Glcode().sendKeys(testData.get("Glcode"));
    }

    @And("^user enter the CIF code value under passbook type$")
    public void user_enter_the_cif_code_value_under_passbook_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.CifCode());
        csmPassbookObject.CifCode().click();
        csmPassbookObject.CifCode().sendKeys(testData.get("CifCode"));
    }

    @And("^user enter the serial no value under passbook type$")
    public void user_enter_the_serial_no_value_under_passbook_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.SerialNo());
        csmPassbookObject.SerialNo().click();
        csmPassbookObject.SerialNo().sendKeys(testData.get("SerialNo"));
    }
    
    @Then("^user verify the popup message$")
    public void user_verify_the_popup_message() throws Throwable {
        
    }

    @And("^user logout from this application$")
    public void user_logout_from_this_application() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmPassbookObject.LogoutButton());
        csmPassbookObject.LogoutButton().click();
    }
    
    
    
    
    
    
    //@TC_SAD_0075
    @And("^user update test data set id for TC_SAD_0075$")
    public void user_update_test_data_set_id_for_tcsad0075() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("TC_SAD_0075_D2");
    }
    
    
    
    //TC_SAD_0076
    @And("^user update test data set id for TC_SAD_0076$")
    public void user_update_test_data_set_id_for_tcsad0076() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("TC_SAD_0076_D2");
    }
	
}
