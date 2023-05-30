package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
	ExcelData excelDataForTransaction = new ExcelData(path, "CSM_Transaction", "DataSet ID");
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

    @And("^user update test data set id for TRS_023$")
    public void user_update_test_data_set_id_for_trs023() throws Throwable {
    	testData = excelDataForTransaction.getTestdata("TRS_023_D1");
    }

	
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
        CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys(testData.get("TRXType"));
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
        CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys(testData.get("TRXType"));
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
        CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys(testData.get("TRXType"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys(Keys.TAB);
    }

    @And("^user Enter the BranchCode under TRXType$")
    public void user_enter_the_branchcode_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode().sendKeys(testData.get("BranchCode"));
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_BranchCode().sendKeys(Keys.TAB);
    }

    @And("^user Enter the CurrencyCode under TRXType$")
    public void user_enter_the_currencycode_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode().sendKeys(testData.get("CurrencyCode"));
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_CurrencyCode().sendKeys(Keys.TAB);
    }

    @And("^user Enter the GLCode under TRXType$")
    public void user_enter_the_glcode_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode().sendKeys(testData.get("GLCode"));
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_GLCode().sendKeys(Keys.TAB);
    }

    @And("^user Enter the CifCode under TRXType$")
    public void user_enter_the_cifcode_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode().sendKeys(testData.get("CIFCode"));
        
        CSMTransactionObject.CSMCore_Transactions_Maintenance_CIFCode().sendKeys(Keys.TAB);
    }

    @And("^user Enter the SerialNo under TRXType$")
    public void user_enter_the_serialno_under_trxtype() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo());
       //CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo().sendKeys(testData.get("SerialNo"));
        CSMTransactionObject.CSMCore_Transactions_Maintenance_SerialNo().sendKeys(Keys.TAB);
    }
    @And("^user validate the popup$")
    public void user_validate_the_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.nonInternalGlCodeValidationPopUp());
    	Assert.assertTrue(CSMTransactionObject.nonInternalGlCodeValidationPopUp().isDisplayed());
    	
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
    @And("^user update test data set id for TRS_024$")
    public void user_update_test_data_set_id_for_trs024() throws Throwable {
    	testData = excelDataForTransaction.getTestdata("TRS_024_D1");
    }

    @And("^user Enter the Arabicword No2 on UPAA screen$")
    public void user_enter_the_arabicword_no2_on_upaa_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2());
       // CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2().sendKeys(testData.get("User_Id"));
        CSMTransactionObject.CSMparam_transactionType_UPAA_Arabicword_No2().sendKeys("trs debit");
    }
    @And("^user Enter the code in UPAA field for TRS_024$")
    public void user_enter_the_code_in_upaa_field_for_trs024() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_UPA_code());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_UPA_code());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_UPA_code());
       // CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys(testData.get("User_Id"));
        //CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys("377");
        CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys("135");
        CSMTransactionObject.CSMParam_TransactionType_UPA_code().sendKeys(Keys.ENTER);
    }

    @And("^user Enter the code in Approve field for TRS_024$")
    public void user_enter_the_code_in_approve_field_for_trs024() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMParam_TransactionType_Approve_code());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMParam_TransactionType_Approve_code());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMParam_TransactionType_Approve_code());
       // CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys(testData.get("User_Id"));
        //CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys("377");
        CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys("135");
        CSMTransactionObject.CSMParam_TransactionType_Approve_code().sendKeys(Keys.ENTER);
    }

    @And("^user Enter the TRXType on maintance screen for TRS_024$")
    public void user_enter_the_trxtype_on_maintance_screen_for_trs024() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType());
       // CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys(testData.get("User_Id"));
        //CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys("377");
        CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys("135");
        CSMTransactionObject.CSMCore_Transactions_Maintenance_TRXType().sendKeys(Keys.TAB);
    }



    
    //TRS_027
    
    
    @And("^User click the Transactions$")
    public void User_click_the_Transactions() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_Transactions());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_Transactions());  
    }

    @Then("^Click the Maintenance Below the Transactions$")
    public void click_the_maintenance_below_the_transactions() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_MaintenanceScrn());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_MaintenanceScrn());  
    }
    
    @And("^enter the value in trx type$")
    public void enter_the_value_in_trx_type() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_Trxtypevalue());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_Trxtypevalue());
   	 CSMTransactionObject.Transactions_Trxtypevalue().sendKeys("377");
   	 CSMTransactionObject.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
    }

//    @And("^enter the single transfer in trx type$")
//    public void enter_the_single_transfer_in_trx_type() throws Throwable {  
//   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_Trxtypevalue());
//   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_Trxtypevalue());
//   	//single transfer(debit account)
//   	 CSMTransactionObject.Transactions_Trxtypevalue().sendKeys("685");
//   	 CSMTransactionObject.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
//    }

    @Then("^enter values of Branch code$")
    public void enter_values_of_branch_code() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_depositAcc_Branchcode());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_depositAcc_Branchcode());  
   	 CSMTransactionObject.Transactions_depositAcc_Branchcode().sendKeys("0001");
    }

    @And("^enter values of Currency code$")
    public void enter_values_of_Currency_code() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_debitAcc_Currencycode());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_debitAcc_Currencycode());  
   	// CSMTransactionObject.Transactions_debitAcc_Currencycode().sendKeys("840");
   	 CSMTransactionObject.Transactions_debitAcc_Currencycode().sendKeys("586");
    }

    @And("^enter values of Gl code$")
    public void enter_values_of_Gl_code() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_debitAcc_Glcode());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_debitAcc_Glcode());  
   	 CSMTransactionObject.Transactions_debitAcc_Glcode().sendKeys("8456");
   	 //CSMTransactionObject.Transactions_debitAcc_Glcode().sendKeys("5916");

    }

    @And("^enter values of Cif code$")
    public void enter_values_of_Cif_code() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_debitAcc_Cifcode());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_debitAcc_Cifcode());
   	 CSMTransactionObject.Transactions_debitAcc_Cifcode().sendKeys("993602");
   	 //CSMTransactionObject.Transactions_debitAcc_Cifcode().sendKeys("993567");

    }

    @Then("^enter values of serial$")
    public void enter_values_of_serial() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_debitAcc_serialcode());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_debitAcc_serialcode());  
   	 CSMTransactionObject.Transactions_debitAcc_serialcode().sendKeys("0");
    }
    
    @Then("^System show the warning popup clikc ok button$")
    public void system_show_the_warning_popup_clikc_ok_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_Warning_okbtn());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_Warning_okbtn()); 
    }
    
    @And("^user enter the currency$")
    public void user_enter_the_currency() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_debitAcc_currency());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_debitAcc_currency());  
   	 CSMTransactionObject.Transactions_debitAcc_currency().sendKeys("840");
    }
    
    @And("^Enter the Amount in this Checkbox$")
    public void Enter_the_Amount_in_this_Checkbox() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_EnterAmount());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_EnterAmount());  
   	 CSMTransactionObject.Transactions_EnterAmount().sendKeys("1000");
    }
    
  
    
    @And("^click the save button$")
    public void click_the_save_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_savebtn());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_savebtn());  
    }
    
    @And("^system show the popup success user click the ok button$")
    public void system_show_the_popup_success_user_click_the_ok_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_successokbtn());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_successokbtn());  
   	 Thread.sleep(2000);
    }

    @Then("^user Enter the Transaction number$")
    public void user_enter_the_transaction_number() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_transactionNo_codeValue());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_transactionNo_codeValue());  
   	 CSMTransactionObject.Transactions_transactionNo_codeValue().sendKeys("7521");
    }

    @And("^User click the Approve screen$")
    public void user_click_the_approve_screen() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_Approvescrn());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_Approvescrn());  
    }         

    @And("^double click the Value$")
    public void double_click_the_value() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_transactionNo_Doubleclk());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_transactionNo_Doubleclk());  
    }
    
    @Then("^click the Approve button$")
    public void click_the_approve_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_Approvebtn());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_Approvebtn());  
    }
    
    @And("^User click the Maintenance screen$")
    public void user_click_the_maintenance_screen() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_MaintenanceScrn());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_MaintenanceScrn());  
    }
    
    @Then("^click the search button$")
    public void click_the_search_button() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_searchbtn());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_searchbtn());  
    }
    
    @And("^enter the trx number$")
    public void enter_the_trx_number() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_trxno_code());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_trxno_code());  
    }
    
    @And("^double click the data$")
    public void double_click_the_data() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_doubleclk_codevalue());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_doubleclk_codevalue());  
    }


    @Then("^click the Booked Entries$")
    public void click_the_booked_entries() throws Throwable {
   	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.Transactions_BookedEntries());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.Transactions_BookedEntries());  
    }
    
    //TRS_025
    @And("^user deal with the Currency Denomination chequebox$")
    public void user_deal_with_the_currency_denomination_chequebox() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
//    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
//        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
        waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
        if (CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox().getAttribute("initialvalue").isBlank()) {
        clicksAndActionsHelper.moveToElement(CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
        clicksAndActionsHelper.clickUsingActionClass(CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox(),
        		CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
        } else {
        clicksAndActionsHelper.moveToElement(CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
        clicksAndActionsHelper.clickUsingActionClass(CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox(),
        		CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
        clicksAndActionsHelper.moveToElement(CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox());
        		CSMTransactionObject.TransactionType_UPAA_dealwithCurrencyDominationChequbox();
        }
    }
    //TRS_063
    

    @And("^user update test data set id for TRS_063$")
    public void user_update_test_data_set_id_for_trs063() throws Throwable {
    	testData = excelDataForTransaction.getTestdata("TRS_063_D1");
    }
    
    @And("^user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063$")
    public void user_enter_the_code_in_inputfield_on_updateafterapprove_screen_under_transactiontype_for_trs063() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			
    		
        	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.csmParam_Transactiontype_inputfield());
        	clicksAndActionsHelper.moveToElement(CSMTransactionObject.csmParam_Transactiontype_inputfield());
            clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_Transactiontype_inputfield());
            CSMTransactionObject.csmParam_Transactiontype_inputfield().sendKeys(testData.get("TRXType"));  
            CSMTransactionObject.csmParam_Transactiontype_inputfield().sendKeys(Keys.TAB);
        	}
            
    }
    @And("^user click the AccountParameter submenu under Parameters$")
    public void user_click_the_accountparameter_submenu_under_parameters() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters());
       	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters());  
    }

    @And("^user click the AccountType under AccountParameters$")
    public void user_click_the_accounttype_under_accountparameters() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters_AccountTypes());
       	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes()); 
    }

    @And("^user click the UPA field under AccountTypes$")
    public void user_click_the_upa_field_under_accounttypes() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPAField());
      	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPAField()); 
    }

    @And("^user Enter the TypeCode in UPA field$")
    public void user_enter_the_typecode_in_upa_field() throws Throwable {

    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPA_TypeCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPA_TypeCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPA_TypeCode());
        CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPA_TypeCode().sendKeys(testData.get("TRXType"));  
        CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPA_TypeCode().sendKeys(Keys.ENTER);
    }

    @And("^user double click the TypeCode in UPA field$")
    public void user_double_click_the_typecode_in_upa_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick());
     	 clicksAndActionsHelper.doubleClick(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick()); 
    }

    @And("^user click the Instructions in AccountTypes$")
    public void user_click_the_instructions_in_accounttypes() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions());
     	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions()); 
    }

    @And("^user deal with AllowAccess checkBox under Instructions$")
    public void user_deal_with_allowaccess_checkbox_under_instructions() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
      

        if (CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag().getAttribute("initialvalue").isBlank()) {
        clicksAndActionsHelper.moveToElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
        clicksAndActionsHelper.clickUsingActionClass(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag(),
        		CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
        } else {
        clicksAndActionsHelper.moveToElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
        clicksAndActionsHelper.clickUsingActionClass(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag(),
        		CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());

        }
    }

    @And("^user click UPA Button$")
    public void user_click_upa_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton());
    	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton()); 
    }
    @And("^user click the Approve field under AccountTypes$")
    public void user_click_the_approve_field_under_accounttypes() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField());
   	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField()); 
   }
    

    @And("^user Enter the TypeCode in Approve Field$")
    public void user_enter_the_typecode_in_approve_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode());
    	clicksAndActionsHelper.moveToElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode());
        clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode());
        CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode().sendKeys(testData.get("TRXType"));  
        CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode().sendKeys(Keys.TAB);
    }

    @And("^user double click the Typecode in Approve field$")
    public void user_double_click_the_typecode_in_approve_field() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick());
      	 clicksAndActionsHelper.doubleClick(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick()); 
    }

    @And("^user click the Approve button$")
    public void user_click_the_approve_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton());
     	 clicksAndActionsHelper.clickOnElement(CSMTransactionObject.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton()); 
    }


}
