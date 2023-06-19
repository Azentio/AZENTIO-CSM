package stepdefinitions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.TransactionOnStaffAccountsObj;
import resources.BaseClass;

public class TransactionOnStaffAccounts extends BaseClass{
	WebDriver driver= BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	CSMLogin csmLogin = new CSMLogin(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	TransactionOnStaffAccountsObj trxOnStaffAccountObj = new TransactionOnStaffAccountsObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ExcelData excelData = new ExcelData(System.getProperty("user.dir") + "\\TestData\\CSM_TestData.xlsx",
			"TrxOnStaffAccountTestData", "Data Set ID");
	Map<String, String> testData = new HashMap<>();
	String dataSetID;
	

    @Then("^navigate to transaction menu option$")
    public void navigate_to_transaction_menu_option() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_MenuOption());
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_MenuOption());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_MenuOption());
    	trxOnStaffAccountObj.transactions_MenuOption().click();
    }

    @Then("^navigate to maintenance screen under transaction$")
    public void navigate_to_maintenance_screen_under_transaction() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance());
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance());
    	trxOnStaffAccountObj.transactions_Maintenance().click();
    	try {
    		trxOnStaffAccountObj.transactions_ReloadTabWarningMessageOkButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @Then("^click on lookup button and fill the trx type$")
    public void click_on_lookup_button_and_fill_the_trx_type() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_TrxType_LookupButton());
    	trxOnStaffAccountObj.transactions_TrxType_LookupButton().click();
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_TrxTypeCode());
    	trxOnStaffAccountObj.transactions_TrxTypeCode().sendKeys(testData.get("TrxType"));
    	for (int i = 0; i <=200; i++) {
			try {
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath("//td[text()='"+testData.get("TrxType")+"']")));
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @Then("^Fill the From account1 and To account1 details for do not allow trx on his account flag as checked$")
    public void fill_the_from_account1_and_to_account1_details_for_do_not_allow_trx_on_his_account_flag_as_checked() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode());
    	trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode().sendKeys(testData.get("FromCurrencyCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_GlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_GlCode().sendKeys(testData.get("FromGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_CifNo().sendKeys(testData.get("FromCifNo"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().click();
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().click();
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().sendKeys(testData.get("FromSlNo"));
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
//    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Currency());
//    	trxOnStaffAccountObj.transactions_Currency().sendKeys(testData.get("Currency"));
//    	
//    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToGlCode());
//    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
//    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(testData.get("ToGlCode"));
//    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToCifNo());
//    	trxOnStaffAccountObj.transactions_Maintenance_ToCifNo().sendKeys(testData.get("ToCifNo"));
//    	try {
//    		Thread.sleep(2000);
//    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToSlNo());
//    	trxOnStaffAccountObj.transactions_Maintenance_ToSlNo().sendKeys(testData.get("ToSlNo"));
//    	try {
//    		Thread.sleep(2000);
//    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//    	
//    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Amount());
//    	trxOnStaffAccountObj.transactions_Amount().sendKeys(testData.get("Amount"));
//    	
//    	
    }
    	
    @Then("^Fill the From account1 and To account1 details for do not allow trx on his account flag as unchecked$")
    public void fill_the_from_account1_and_to_account1_details_for_do_not_allow_trx_on_his_account_flag_as_unchecked() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode());
    	trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode().sendKeys(testData.get("FromCurrencyCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_GlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_GlCode().sendKeys(testData.get("FromGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_CifNo().sendKeys(testData.get("FromCifNo"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().click();
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().click();
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().sendKeys(testData.get("FromSlNo"));
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().sendKeys(testData.get("Currency"));
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToGlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(testData.get("ToGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToCifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_ToCifNo().sendKeys(testData.get("ToCifNo"));
    	try {
    		Thread.sleep(2000);
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToSlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_ToSlNo().sendKeys(testData.get("ToSlNo"));
    	try {
    		Thread.sleep(2000);
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Amount());
    	trxOnStaffAccountObj.transactions_Maintenance_Amount().sendKeys(testData.get("Amount"));
    	
    	
    }
    
    @Then("^Fill the From account2 and To account2 details under transaction management$")
    public void fill_the_from_account2_and_to_account2_details_under_transaction_management() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode());
    	trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode().sendKeys(testData.get("FromCurrencyCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_GlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_GlCode().sendKeys(testData.get("FromGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_CifNo().sendKeys(testData.get("FromCifNo"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().click();
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().click();
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().sendKeys(testData.get("FromSlNo"));
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().sendKeys(testData.get("Currency"));
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToGlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(testData.get("ToGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToCifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_ToCifNo().sendKeys(testData.get("ToCifNo"));
    	try {
    		Thread.sleep(2000);
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToSlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_ToSlNo().sendKeys(testData.get("ToSlNo"));
    	try {
    		Thread.sleep(2000);
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Amount());
    	trxOnStaffAccountObj.transactions_Maintenance_Amount().sendKeys(testData.get("Amount"));
    	
    	
    }
    
    @Then("^click on save button under transaction maintenance screen$")
    public void click_on_save_button_under_transaction_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_SaveButton());
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_SaveButton());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_SaveButton());
    	trxOnStaffAccountObj.transactions_SaveButton().click();
    }

    @Then("^verify system must display User does not have access to make a Transaction on his own Account message$")
    public void verify_system_must_display_user_does_not_have_access_to_make_a_transaction_on_his_own_account_message() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_CannotProceedDisplayMessage());
    	boolean status = trxOnStaffAccountObj.transactions_CannotProceedDisplayMessage().isDisplayed();
    	Assert.assertTrue(status);
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CannotProceedOkButton());
    	trxOnStaffAccountObj.transactions_Maintenance_CannotProceedOkButton().click();
    	
    }
    
    @Then("^verify system should accept this fully$")
    public void verify_system_should_accept_this_fully() throws Throwable {
        
    }
    
    @Then("^click on new button to perform a new transaction$")
    public void click_on_new_button_to_perform_a_new_transaction() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_NewButton());
    	trxOnStaffAccountObj.transactions_Maintenance_NewButton().click();
    }
    
    //---------------------------------167-----------------------------------//
    
    @Given("^navigate to CSM application and login with another user$")
    public void navigate_to_csm_application_and_login_with_another_user() throws Throwable {
        
    }
    
    @Then("^Fill the From account1 and To account1 details for do not allow trx on his account flag as checked for another user$")
    public void fill_the_from_account1_and_to_account1_details_for_do_not_allow_trx_on_his_account_flag_as_checked_for_another_user() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode());
    	trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode().sendKeys(testData.get("FromCurrencyCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_GlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_GlCode().sendKeys(testData.get("FromGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_CifNo().sendKeys(testData.get("FromCifNo"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().click();
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().click();
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().sendKeys(testData.get("FromSlNo"));
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().sendKeys(testData.get("Currency"));
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToGlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(testData.get("ToGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToCifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_ToCifNo().sendKeys(testData.get("ToCifNo"));
    	try {
    		Thread.sleep(2000);
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToSlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_ToSlNo().sendKeys(testData.get("ToSlNo"));
    	try {
    		Thread.sleep(2000);
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Amount());
    	trxOnStaffAccountObj.transactions_Maintenance_Amount().sendKeys(testData.get("Amount"));
    }
    
    //---------------------------------168-----------------------------------//

    @Then("^Fill the From account3 and To account3 details under transaction management$")
    public void fill_the_from_account3_and_to_account3_details_under_transaction_management() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode());
    	trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode().sendKeys(testData.get("FromCurrencyCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_GlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_GlCode().sendKeys(testData.get("FromGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_CifNo().sendKeys(testData.get("FromCifNo"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().click();
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().click();
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().sendKeys(testData.get("FromSlNo"));
    	try {
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
    	trxOnStaffAccountObj.transactions_Maintenance_Currency().sendKeys(testData.get("Currency"));
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToGlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCode().sendKeys(testData.get("ToGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToCifNo());
    	trxOnStaffAccountObj.transactions_Maintenance_ToCifNo().sendKeys(testData.get("ToCifNo"));
    	try {
    		Thread.sleep(2000);
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToSlNo());
    	trxOnStaffAccountObj.transactions_Maintenance_ToSlNo().sendKeys(testData.get("ToSlNo"));
    	try {
    		Thread.sleep(2000);
    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Amount());
    	trxOnStaffAccountObj.transactions_Maintenance_Amount().sendKeys(testData.get("Amount"));
    }

    

    //--------------------------------------------------------------------------------------//
   
    @Then("^select data set ID when user perform transaction if do not allow trx on his account flag is checked$")
    public void select_data_set_id_when_user_perform_transaction_if_do_not_allow_trx_on_his_account_flag_is_checked() throws Throwable {
    	dataSetID = "TSA_165_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID when user perform transaction if do not allow trx on his account flag is unchecked$")
    public void select_data_set_id_when_user_perform_transaction_if_do_not_allow_trx_on_his_account_flag_is_unchecked() throws Throwable {
    	dataSetID = "TSA_166_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
	
    @Then("^select data set ID when user perform transaction if do not allow trx on his account flag is checked for another user$")
    public void select_data_set_id_when_user_perform_transaction_if_do_not_allow_trx_on_his_account_flag_is_checked_for_another_user() throws Throwable {
    	dataSetID = "TSA_167_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID when user perform transaction if do not allow trx on his account flag is checked for related user$")
    public void select_data_set_id_when_user_perform_transaction_if_do_not_allow_trx_on_his_account_flag_is_checked_for_related_user() throws Throwable {
    	dataSetID = "TSA_168_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

	
}
	