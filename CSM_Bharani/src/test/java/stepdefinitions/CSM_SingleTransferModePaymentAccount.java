package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
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
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
    ExcelData csmTransactionsExcelData = new ExcelData(path, "SingleTransferModePaymentAcc", "Data Set ID");
    Map<String, String> testData;
   
    
    @Given("User update test data for test case number Param_095")
    public void user_update_test_data_for_test_case_number_param_095() {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TSA_397");
    }
    
    @Given("User click the Transaction type flag")
    public void user_click_the_transaction_type_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.Transactiontype_Flag());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.Transactiontype_Flag());
		singleTransferModePayment.Transactiontype_Flag().click();
		
    }
       
    @Given("User click the Update after approve flag")
    public void user_click_the_update_after_approve_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.UpdateAfter_ApproveFlag());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.UpdateAfter_ApproveFlag());
		singleTransferModePayment.UpdateAfter_ApproveFlag().click();
		
    }
    
    @And("User Enter the code in the update after approve flag")
    public void user_enter_the_code_in_the_update_after_approve_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.CodeGridBox_UpdateAfterApprove());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.CodeGridBox_UpdateAfterApprove());
		singleTransferModePayment.CodeGridBox_UpdateAfterApprove().click();
		singleTransferModePayment.CodeGridBox_UpdateAfterApprove().sendKeys(testData.get("TRX Type"));
		singleTransferModePayment.CodeGridBox_UpdateAfterApprove().sendKeys(Keys.ENTER);
    }
    
    @Then("User click the enter code record in the update after approve flag to view the details")
    public void user_click_the_enter_code_record_in_the_update_after_approve_flag_to_view_the_details() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.CodeGridBox_Click());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.CodeGridBox_Click());
		clicksAndActionsHelper.doubleClick(singleTransferModePayment.CodeGridBox_Click());
		
    }
    @Then("User select the transfer type as Local")
    public void user_select_the_transfer_type_as_local() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.Transfer_Type());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.Transfer_Type());
		singleTransferModePayment.CodeGridBox_Click().click();
		dropDownHelper.SelectUsingVisibleText(singleTransferModePayment.Transfer_Type(), testData.get("Transfer Type "));  
    }
    
    @Given("User check the Forbid multiple cif flag")
    public void user_check_the_forbid_multiple_cif_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.Forbid_MultipleCIF_Flag());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.Forbid_MultipleCIF_Flag());
		singleTransferModePayment.Forbid_MultipleCIF_Flag().click();
    }

    @Then("User Click the update after approve flag to save the record")
    public void user_click_the_update_after_approve_flag_to_save_the_record() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, singleTransferModePayment.UpdateAfter_ApproveKey());
		clicksAndActionsHelper.moveToElement(singleTransferModePayment.UpdateAfter_ApproveKey());
		singleTransferModePayment.UpdateAfter_ApproveKey().click();
        
    }
}
