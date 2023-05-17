package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;
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
import io.cucumber.java.en.Given;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSM_Chequebook_Object;
import resources.BaseClass;

public class CSM_Chequebookrequest_step {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSM_Chequebook_Object csmChequebookObject = new CSM_Chequebook_Object(driver);
	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData excelDataForChequeBookRequest = new ExcelData(path, "CSM_Systemparameters", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> chequeBookRequestTestData = new HashMap<>();
	Map<String, String> chargeWaiverExecutionData = new HashMap<>();
	
	
	Map<String, String> testData;
	
	
	//@CHB_186


    @And("^user click the parameters menu$")
    public void user_click_the_parameters_menu() throws Throwable {
    	
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParamParameterMainModule());
        clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParamParameterMainModule());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParamParameterMainModule());
       // csmChequebookObject.csmParamParameterMainModule().click();
    	}

    @And("^user click the system parameters submenu$")
    public void user_click_the_system_parameters_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_Systemparameter());
        clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_Systemparameter());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_Systemparameter());
    }

    @And("^user click the User screen in system parameters$")
    public void user_click_the_user_screen_in_system_parameters() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_Systemparameter_User());
        clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_Systemparameter_User());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_Systemparameter_User());
    }

    @And("^user click the update after approve screen$")
    public void user_click_the_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove());
        clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove());
    }
    @And("^user update test data set id for CHB_186$")
    public void user_update_test_data_set_id_for_chb186() throws Throwable {
          testData = excelDataForChequeBookRequest.getTestdata("CHB_186_D1");
    }

    @And("^user click and send the values in user id under update after approve screen$")
    public void user_click_the_user_id_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid());
       // csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys(testData.get("User_Id"));
     csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys("karthik");
        
        csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys(Keys.ENTER);
        
    }
    
    @And("^user double click the user id$")
    public void user_double_click_the_user_id() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick());
        clicksAndActionsHelper.doubleClick(csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick());
        
        //dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch(),"Logged-in branch"  );
        
    }

//    @And("^user retrive the existing data in update after approve screen$")
//    public void user_retrive_the_existing_data_in_update_after_approve_screen() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.);
//        clicksAndActionsHelper.moveToElement(csmChequebookObject.);
//        clicksAndActionsHelper.clickOnElement(csmChequebookObject.);
//    }

    @And("^user select the logged in branch$")
    public void user_select_the_logged_in_branch() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
    	javascriptHelper.scrollIntoView(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
    	
        //dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch(),"Logged-in branch"  );
//    	dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch(), testData.get("Send to receive from chequebooks dropdown") );
        dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch(),"All branches " );
        waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
        dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch(), "Logged-in branch" );
    }
    
    @And("^user click the update after approve button$")
    public void user_click_the_update_after_approve_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove());
    }
    
    @And("^user click the save ok button$")
    public void user_click_the_save_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
    }

    @And("^user click the ok$")
    public void user_click_the_ok() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
    }

    @And("^user click the approve in user screen$")
    public void user_click_the_approve_in_user_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Approve());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Approve());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Approve());
    }

    @And("^user click and send the values in user id under Approve screen$")
    public void user_click_the_user_id_in_approve_screen() throws Throwable {
    	
				waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Approve_UserID());
		    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Approve_UserID());
		        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Approve_UserID());
		        //csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys(testData.get("User_Id"));
		        csmChequebookObject.csmParam_User_Approve_UserID().sendKeys("karthik");
		        csmChequebookObject.csmParam_User_Approve_UserID().sendKeys(Keys.ENTER);
				
    }
			
    @And("^user double click the user id in approve screen$")
    public void user_double_click_the_user_id_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Approve_Username_doubleclick());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Approve_Username_doubleclick());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Approve_Username_doubleclick());
        clicksAndActionsHelper.doubleClick(csmChequebookObject.csmParam_User_Approve_Username_doubleclick());
        
    }


    

    @And("^user click the approve box$")
    public void user_click_the_approve_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Approve_Username_doubleclick_Approve());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Approve_Username_doubleclick_Approve());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Approve_Username_doubleclick_Approve());
    	
    }

    @And("^user click the chequebook request in csmcore$")
    public void user_click_the_chequebook_request_in_csmcore() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmcore_ChequeBookRequest());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmcore_ChequeBookRequest());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmcore_ChequeBookRequest());
    }

    @And("^user click the send to receive from provider$")
    public void user_click_the_send_toreceive_from_provider() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom());
    }

    @And("^user click the send to provider screen$")
    public void user_click_the_send_to_provider_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider());
    }

    @And("^user click the retrive button in send to provider$")
    public void user_click_the_retrive_button_in_send_to_provider() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton());
    }
    
    @And("^user update test data set id for CHB_186_D3 in send to provider screen$")
    public void user_update_test_data_set_id_for_chb186d3() throws Throwable {
    	//testData = excelDataForChequeBookRequest.getTestdata("CHB_180_D3");
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield());
        //csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys(testData.get("User_Id"));
        csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield().sendKeys("1");
    }

    


    @And("^user click the receive from provider screen$")
    public void user_click_the_receive_from_provider_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider());
    }

    @And("^user update test data set id for CHB_186_D3 in receive from provider screen$")
    public void user_update_test_data_set_id_for_chb186d3_in_receive_from_provider_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield());
        //csmChequebookObject.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys(testData.get("User_Id"));
        csmChequebookObject.csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield().sendKeys("1");
    }
    
    
    //CHB_187
    @And("^user update test data set id for CHB_187$")
    public void user_update_test_data_set_id_for_chb187() throws Throwable {
    	//testData = excelDataForChequeBookRequest.getTestdata("CHB_187_D2");
    }
    
    @And("^user select the all branches$")
    public void user_select_the_all_branches() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
    	javascriptHelper.scrollIntoView(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());
       // dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch(), testData.get("Send to receive from chequebooks dropdown") );
        dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch(), "Logged-in");
        waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch());

        dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_User_Userid_doubleclick_logintobranch(),"All branches " );

    }
    //CHB_180
    

    @And("^user click the Account parameters submenu$")
    public void user_click_the_account_parameters_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_AccountParameter());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_AccountParameter());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_AccountParameter());  
    }

    @And("^user click the General Ledger submenu$")
    public void user_click_the_general_ledger_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger()); 
    }

    @And("^user click the update after approve screen under general ledger$")
    public void user_click_the_update_after_approve_screen_under_general_ledger() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_Updateafterapprove());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_Updateafterapprove());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_Updateafterapprove()); 
    }

    
    @And("^user update test data set id for CHB_180 in update after screen$")
    public void user_update_test_data_set_id_for_chb180_in_update_after_screen() throws Throwable {
    	// testData = excelDataForChequeBookRequest.getTestdata("CHB_180 _D3");
   	 waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_code());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_code());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_code());
        csmChequebookObject.csmParam_General_ledger_code().sendKeys("400402");
        csmChequebookObject.csmParam_General_ledger_code().sendKeys(Keys.ENTER);

    }


    @And("^user double click the record in Update after approve screen$")
    public void user_double_click_the_record_in_update_after_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_code_doubleclick());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_code_doubleclick());
        //clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_code_doubleclick()); 
        clicksAndActionsHelper.doubleClick(csmChequebookObject.csmParam_General_ledger_code_doubleclick());
    }

    @And("^user click Additional Details$")
    public void user_click_additional_details() throws Throwable {
        for (int i = 0; i <200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_code_additionaloptions());
		        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_code_additionaloptions());
		        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }

    @And("^user change the value as Notify and dont proceed in drop down$")
    public void user_change_the_value_as_notify_and_dont_proceed_in_drop_down() throws Throwable {
    	javascriptHelper.scrollIntoView(csmChequebookObject.csmParam_General_ledger_code_additionaloptions_dropdown());
       // dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_General_ledger_code_additionaloptions_dropdown(), testData.get("Allow_Overdraw") );
    	dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_General_ledger_code_additionaloptions_dropdown(),"Notify and Proceed" );
        waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_code_additionaloptions_dropdown());
        dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_General_ledger_code_additionaloptions_dropdown(),"Notify and Don't Proceed" );
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_code_additionaloptions_dropdown());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_code_additionaloptions_dropdown());
    }

    @And("^user click update button under the drop down$")
    public void user_click_update_button_under_the_drop_down() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_upadatebutton());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_upadatebutton());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_upadatebutton());
    }

    

    @And("^user click approve sub menu under General Ledger$")
    public void user_click_approve_sub_menu_under_general_ledger() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_Approve());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_Approve());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_Approve());
    }

//    @And("^user enter the code in Approve screen$")
//    public void user_enter_the_code_in_approve_screen() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_Approve_inputfield());
//    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield());
//        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield()); 
//        csmChequebookObject.csmParam_General_ledger_Approve_inputfield().sendKeys(testData.get("Code"));
//    }
    @And("^user update test data set id for CHB_180 in approve screen$")
    public void user_update_test_data_set_id_for_chb180_in_approve() throws Throwable {
    	// testData = excelDataForChequeBookRequest.getTestdata("CHB_180 _D3");
      	 waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_Approve_inputfield());
       	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield());
           clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield());
           csmChequebookObject.csmParam_General_ledger_Approve_inputfield().sendKeys("400402");  
           csmChequebookObject.csmParam_General_ledger_Approve_inputfield().sendKeys(Keys.ENTER);

    }
    @And("^user double click the record in Approve screen$")
    public void user_double_click_the_record_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick());
        //clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick()); 
        clicksAndActionsHelper.doubleClick(csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick());
    }

    @And("^user click the Approve button under drop down menu$")
    public void user_click_the_approve_button_under_drop_down_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve()); 
        
    }
    

    @And("^user click the ok button on information popup$")
    public void user_click_the_ok_button_on_information_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK());
    	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK());
        clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK()); 
    }

    

}
