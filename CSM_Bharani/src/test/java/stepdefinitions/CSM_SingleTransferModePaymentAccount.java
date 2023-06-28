package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.SingleTransferModeaPaymentAccObj;
import resources.BaseClass;

public class CSM_SingleTransferModePaymentAccount {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	SingleTransferModeaPaymentAccObj singleTransferModePayment = new SingleTransferModeaPaymentAccObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
    ExcelData csmTransactionsExcelData = new ExcelData(path, "CSMParam_UserUpdateAfterApprove", "DataSet ID");
    Map<String, String> testData;
    
    @Given("User click the Update after approve flag")
    public void user_click_the_update_after_approve_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.Transactiontype_Flag());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.Transactiontype_Flag());
		singleTransferModePayment.Transactiontype_Flag().click();
    }
    @And("User Enter the code in the update after approve flag")
    public void user_enter_the_code_in_the_update_after_approve_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.CodeGridBox_UpdateAfterApprove());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.CodeGridBox_UpdateAfterApprove());
		singleTransferModePayment.CodeGridBox_UpdateAfterApprove().click();
    }
    
    @Then("User click the enter code record in the update after approve flag to view the details")
    public void user_click_the_enter_code_record_in_the_update_after_approve_flag_to_view_the_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.CodeGridBox_Click());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.CodeGridBox_Click());
		singleTransferModePayment.CodeGridBox_Click().click();  
    }
}
