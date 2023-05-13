package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM_AmendChequeCard_Valid_Cheque_OBJ;
import pageobjects.CSM_Transactions_OBJ;
import resources.BaseClass;

public class CSM_AmendChequeCard_Valid_Cheque {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_AmendChequeCard_Valid_Cheque_OBJ validChequeObj = new CSM_AmendChequeCard_Valid_Cheque_OBJ(driver);
	//String path = System.getProperty("user.dir") +"\\TestData\\Test_Data.xlsx";
	//ExcelData csmTransactionsExcelData = new ExcelData(path,"CSM_Transactions","DataSet ID");
	Map<String, String> testData;
	
	
	

    @Then("^user verify the save popup$")
    public void user_verify_the_save_popup() throws Throwable {
        
    }

    @And("^user update test data set id for ACSD_014$")
    public void user_update_test_data_set_id_for_acsd014() throws Throwable {
        
    }

    @And("^user enter the branch code value under product type$")
    public void user_enter_the_branch_code_value_under_product_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, validChequeObj.BranchCode);
    	validChequeObj.BranchCode.click();
        validChequeObj.BranchCode.sendKeys(testData.get("Branch Code"));
    }

    @And("^user enter the currency code value under product type$")
    public void user_enter_the_currency_code_value_under_product_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, validChequeObj.CurrencyCode);
    	validChequeObj.CurrencyCode.click();
        validChequeObj.CurrencyCode.sendKeys(testData.get("Currency Code"));
    }

    @And("^user enter the GL code value under product type$")
    public void user_enter_the_gl_code_value_under_product_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,validChequeObj.GlCode);
        validChequeObj.GlCode.click();
        validChequeObj.GlCode.sendKeys(testData.get("GL Code"));
    }

    @And("^user enter the CIF code value under product type$")
    public void user_enter_the_cif_code_value_under_product_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, validChequeObj.CifCode);
        validChequeObj.CifCode.click();
        validChequeObj.CifCode.sendKeys(testData.get("CIF Code"));
    }

    @And("^user enter the serial no under product type$")
    public void user_enter_the_serial_no_under_product_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, validChequeObj.SerialNo);
        validChequeObj.SerialNo.click();
        validChequeObj.SerialNo.sendKeys(testData.get("Serial No"));
    }

    @And("^user enter the cheque no under product type$")
    public void user_enter_the_cheque_no_under_product_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, validChequeObj.ChequeNo);
        validChequeObj.ChequeNo.click();
        validChequeObj.ChequeNo.sendKeys(testData.get("Cheque No"));
    }

    

    @And("^user click the check box$")
    public void user_click_the_check_box() throws Throwable {
        
    }

    @And("^user click the update button$")
    public void user_click_the_update_button() throws Throwable {
        
    }

    
}
