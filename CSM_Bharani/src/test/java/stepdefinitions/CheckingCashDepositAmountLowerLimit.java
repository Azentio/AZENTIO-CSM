package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_CheckingMultiTransfer;
import pageobjects.csm.CheckingCashDepositAmountGreaterLimit;
import pageobjects.csm.CheckingCashDepositAmountLowerLimitobj;
import resources.BaseClass;

public class CheckingCashDepositAmountLowerLimit {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	CSM_CheckingMultiTransfer checkingMultiTransferObj = new CSM_CheckingMultiTransfer(driver);
	CheckingCashDepositAmountGreaterLimit checkingAmountGreaterLimit = new CheckingCashDepositAmountGreaterLimit(driver);
	CheckingCashDepositAmountLowerLimitobj checkingAmountLowerLimit = new CheckingCashDepositAmountLowerLimitobj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
    ExcelData csmTransactionsExcelData = new ExcelData(path, "CSMParam_UserUpdateAfterApprove", "DataSet ID");
    Map<String, String> testData;
    
    @Given("User update test data for test case number Param_097")
    public void user_update_test_data_for_test_case_number_param_097() {
    	testData = csmTransactionsExcelData.getTestdata("DS_01_CIFType_01");
    }
	
	@Given("User_604 Click the User Flag")
	public void user_click_the_user_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.UserFlag_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.UserFlag_604());
		checkingAmountLowerLimit.UserFlag_604().click();
	}

	@Then("User_604 Click the update after approve option")
	public void user_click_the_update_after_approve_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.UpdateAfterApprove_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.UpdateAfterApprove_604());
		checkingAmountLowerLimit.UpdateAfterApprove_604().click();
	}

	@Then("User_604 Click the User ID grid in Update after approve")
	public void user_click_the_user_id_grid_in_update_after_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.UserIDBox_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.UserIDBox_604());
		checkingAmountLowerLimit.UserIDBox_604().click();
		checkingAmountLowerLimit.UserIDBox_604().sendKeys(testData.get("User ID Update After Approve"));
		checkingAmountLowerLimit.UserIDBox_604().sendKeys(Keys.ENTER);
	}

	@Then("User_604 Select the searched user id")
	public void user_select_the_searched_user_id() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.BharaniAcc_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.BharaniAcc_604());
		//checkingAmountLowerLimit.BharaniAcc_604().click();
		clicksAndActionsHelper.doubleClick(checkingAmountLowerLimit.BharaniAcc_604());
	}

	@Then("User_604 Click the CIF type flag")
	public void user_click_the_cif_type_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.CIFTypes_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.CIFTypes_604());
		checkingAmountLowerLimit.CIFTypes_604().click();   
	}

	@Then("User_604 Select the code type")
	public void user_select_the_code_type() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.CodeNo_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.CodeNo_604());
		checkingAmountLowerLimit.CodeNo_604().click(); 
	}

	@Then("User_604 Click the checkbox icon")
	public void user_click_the_checkbox_icon() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.WarnUserCheckBox_604());
		
			for (int i = 0; i < 500; i++) {
				
				try {
					javaScriptHelper.scrollIntoView(checkingAmountLowerLimit.WarnUserCheckBox_604());
					break;
				} catch (Exception e) {
					
				}
			}
		
		
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.WarnUserCheckBox_604());
		checkingAmountLowerLimit.WarnUserCheckBox_604().click(); 
	    
	}

	@Then("User_604 Click the Ok button")
	public void user_click_the_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.OkButton_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.OkButton_604());
		checkingAmountLowerLimit.OkButton_604().click();
	    
	}

	   

	@Then("User_604 Click the Update after approve button to save the record")
	public void user_click_the_update_after_approve_button_to_save_the_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.UpdateSaveApprove_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.UpdateSaveApprove_604());
		checkingAmountLowerLimit.UpdateSaveApprove_604().click();
	}

	@Then("User_604 Click the Ok Popup to confirm the record")
	public void user_click_the_ok_popup_to_confirm_the_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.OkPopUpConfirm_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.OkPopUpConfirm_604());
		checkingAmountLowerLimit.OkPopUpConfirm_604().click();
	    
	}
	
	@Then("User_604 Click the Ok button finally")
	public void user_click_the_ok_button_finally() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.OkPopupFinal_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.OkPopupFinal_604());
		checkingAmountLowerLimit.OkPopupFinal_604().click();
		
	}
	    

	@Then("User_604 Click the approve flag")
	public void user_click_the_approve_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.ApproveFlag_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.ApproveFlag_604());
		checkingAmountLowerLimit.ApproveFlag_604().click();
		
			
		}
	
	@Then("User_604 Click the User ID grid approve")
	public void user_click_the_user_id_grid_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.ApproveUserId_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.ApproveUserId_604());
		checkingAmountLowerLimit.ApproveUserId_604().click();
		checkingAmountLowerLimit.ApproveUserId_604().sendKeys(testData.get("User ID Approve Grid"));
		checkingAmountLowerLimit.ApproveUserId_604().sendKeys(Keys.ENTER);  
	}

	@Then("User_604 Click the Approve button to save the record")
	public void user_click_the_approve_button_to_save_the_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingAmountLowerLimit.Approvebutton_604());
		clicksAndActionsHelper.moveToElement(checkingAmountLowerLimit.Approvebutton_604());
		checkingAmountLowerLimit.Approvebutton_604().click(); 
	}
}

