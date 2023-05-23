package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSM_Transaction_Object;
import resources.BaseClass;

public class CSM_Transaction_Steps {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSM_Transaction_Object CSMTransactionObject = new CSM_Transaction_Object(driver);
	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData excelDataForChequeBookRequest = new ExcelData(path, "", "DataSet_ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> chequeBookRequestTestData = new HashMap<>();
	Map<String, String> chargeWaiverExecutionData = new HashMap<>();
	Map<String, String> testData;

//	@And("^user click the TransactionType under Systemparameters submenu$")
//    public void user_click_the_transactiontype_under_systemparameters_submenu() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType());
//        clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType());
//        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType());  
//    
//	}
	
	//TRS_023
	
    @And("^user click the UPAA field under TransactionType$")
    public void user_click_the_upaa_field_under_transactiontype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_UPA());
        clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_UPA());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_UPA());
    }

    @And("^user Enter the code in UPAA field$")
    public void user_enter_the_code_in_upaa_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_UPA_code());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_UPA_code());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_UPA_code());
       // CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys(testData.get("User_Id"));
        //CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys("377");
        CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys("784");
        CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys(Keys.ENTER);
    }

    @And("^user double click the code on UPAA field$")
    public void user_double_click_the_code_on_upaa_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_UPA_code_doubleClick());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_UPA_code_doubleClick());
        clicksAndActionsHelper.doubleClick(CSMTransactionObject.CSMParam_TransactionType_UPA_code_doubleClick());
    }

    @And("^user check the status of the AllowInternalGLAccount CheckBox$")
    public void user_check_the_status_of_the_allowinternalglaccount_checkbox() throws Throwable {
    	try {
    		waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL());
        	if (CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL().getAttribute("initialvalue").isBlank()) {
        		clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL());
                clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL());
                
                clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL());
                clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL());
        			
        	} else {

        	
        		clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL());
                clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL());
        	
        	}
		} catch (Exception e) {
			
		}
    	
   }

    @And("^user click UpdateAfterApprove Button$")
    public void user_click_updateafterapprove_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL_UPAButton());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL_UPAButton());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_AllowInternalGL_UPAButton());
    }
    @And("^user click Approve field under TransactionType$")
    public void user_click_approve_field_under_transactiontype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_Approve());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_Approve());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_Approve());
    }

    @And("^user Enter the code in Approve field$")
    public void user_enter_the_code_in_approve_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_Approve_code());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_Approve_code());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_Approve_code());
       // CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys(testData.get("User_Id"));
        //CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys("377");
        CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys("784");
        CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys(Keys.ENTER);
    }

    @And("^user double click the code on Approve field$")
    public void user_double_click_the_code_on_approve_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_Approve_code_doubleClick());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_Approve_code_doubleClick());
        clicksAndActionsHelper.doubleClick(CSMTransactionObject.CSMParam_TransactionType_Approve_code_doubleClick());
    }

    @And("^user click Approve Button$")
    public void user_click_approve_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton());
    }

    @And("^user click Transaction submenu on CSMCore$")
    public void user_click_transaction_submenu_on_csmcore() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions());
    }

    @And("^user click Maintance screen under Transaction submenu$")
    public void user_click_maintance_screen_under_transaction_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance());
    }

    @And("^user Enter the TRXType on maintance screen$")
    public void user_enter_the_trxtype_on_maintance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys(testData.get("User_Id"));
        //CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys("377");
        CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys("784");
        CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys(Keys.TAB);
    }

    @And("^user Enter the BranchCode under TRXType$")
    public void user_enter_the_branchcode_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode().sendKeys("1");
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode().sendKeys(Keys.TAB);
    }

    @And("^user Enter the CurrencyCode under TRXType$")
    public void user_enter_the_currencycode_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode().sendKeys("840");
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode().sendKeys(Keys.TAB);
    }

    @And("^user Enter the GLCode under TRXType$")
    public void user_enter_the_glcode_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode().sendKeys("400402");
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode().sendKeys(Keys.TAB);
    }

    @And("^user Enter the CifCode under TRXType$")
    public void user_enter_the_cifcode_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode().sendKeys("0");
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode().sendKeys(Keys.TAB);
    }

    @And("^user Enter the SerialNo under TRXType$")
    public void user_enter_the_serialno_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo().sendKeys("0");
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo().sendKeys(Keys.TAB);
    }
    
  //TRS_024
    
    @And("^user Enter the Arabicword No1 on UPAA screen$")
    public void user_enter_the_arabicword_no1_on_upaa_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No1());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No1());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No1());
       // CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No1().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No1().sendKeys("trs debit");
        
    }

    @And("^user Enter the Arabicword No2 on UPAA screen$")
    public void user_enter_the_arabicword_no2_on_upaa_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2());
       // CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2().sendKeys("trs debit");
    }
}
