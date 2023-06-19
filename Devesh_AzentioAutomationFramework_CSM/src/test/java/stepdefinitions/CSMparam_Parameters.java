package stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSMparam_ParametersObj;
import pageobjects.ChequeBookRequestObj;
import resources.BaseClass;

public class CSMparam_Parameters extends BaseClass{
	WebDriver driver= BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	CSMLogin csmLogin = new CSMLogin(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	CSMparam_ParametersObj csmParam_ParametersObj = new CSMparam_ParametersObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ExcelData excelData = new ExcelData(System.getProperty("user.dir") + "\\TestData\\CSM_TestData.xlsx",
			"CSMparam_ParametersTestData", "Data Set ID");
	ExcelData excelData1 = new ExcelData(System.getProperty("user.dir") + "\\TestData\\CSM_TestData.xlsx",
			"ChequeBookTestData", "Data Set ID");
	Map<String, String> testData = new HashMap<>();
	String dataSetID;

	@Given("^navigate to csm param and login with valid credentials$")
    public void navigate_to_csm_param_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getCSMparamsUrl());
		csmLogin.loginIntoCSMParamApplication("CSMParamUser1");
    }
	
	@Then("^navigate to system parameters under parameters menu option$")
    public void navigate_to_system_parameters_under_parameters_menu_option() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.parameters_MenuOption());
    	csmParam_ParametersObj.parameters_MenuOption().click();
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.parameters_SystemParameters_MenuOption());
    	csmParam_ParametersObj.parameters_SystemParameters_MenuOption().click();
    }

    @Then("^navigate to ChequeBook under Cheques Menu$")
    public void navigate_to_chequebook_under_cheques_menu() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_Cheques());
    	javascripthelper.scrollIntoView(csmParam_ParametersObj.systemParameters_Cheques());
    	csmParam_ParametersObj.systemParameters_Cheques().click();
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_Cheques_ChequeBook());
    	csmParam_ParametersObj.systemParameters_Cheques_ChequeBook().click();
    }

    @Then("^open maintenance screen$")
    public void open_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Maintenance());
    	javascripthelper.scrollIntoView(csmParam_ParametersObj.cheques_ChequeBook_Maintenance());
    	csmParam_ParametersObj.cheques_ChequeBook_Maintenance().click();
    	try {
//    		waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton());
    		csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @Then("^fill the valid details to create chequebook$")
    public void fill_the_valid_details_to_create_chequebook() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Code());
    	csmParam_ParametersObj.cheques_ChequeBook_Code().sendKeys(testData.get("Code"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_BriefName());
    	csmParam_ParametersObj.cheques_ChequeBook_BriefName().sendKeys(testData.get("BriefName"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_NumberOfCheques());
    	csmParam_ParametersObj.cheques_ChequeBook_NumberOfCheques().sendKeys(testData.get("NumberOfCheques"));
    	javascripthelper.scrollIntoView(csmParam_ParametersObj.cheques_ChequeBook_AllowAutoApproveFlag());
    	Select s = new Select(csmParam_ParametersObj.cheques_ChequeBook_Language());
    	s.selectByVisibleText(testData.get("Language"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_ChequeType());
    	csmParam_ParametersObj.cheques_ChequeBook_ChequeType().sendKeys(testData.get("ChequeType"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Design());
    	csmParam_ParametersObj.cheques_ChequeBook_Design().sendKeys(testData.get("Design"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Leaves());
    	csmParam_ParametersObj.cheques_ChequeBook_Leaves().sendKeys(testData.get("Leaves"));
    }

    @Then("^click on the Allow auto approve flag$")
    public void click_on_the_allow_auto_approve_flag() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_AllowAutoApproveFlag());
    	csmParam_ParametersObj.cheques_ChequeBook_AllowAutoApproveFlag().click();;
    }
    
    @Then("^click on the Auto Submit upon Approve flag$")
    public void click_on_the_auto_submit_upon_approve_flag() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_AutoSubmitUponApproveFlag());
    	csmParam_ParametersObj.cheques_ChequeBook_AutoSubmitUponApproveFlag().click();;
    }
    
    @Then("^click on the Allow auto submit and Auto Submit upon Approve flag$")
    public void click_on_the_allow_auto_submit_and_auto_submit_upon_approve_flag() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_AllowAutoSubmitFlag());
    	csmParam_ParametersObj.cheques_ChequeBook_AllowAutoSubmitFlag().click();;
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_AutoSubmitUponApproveFlag());
    	csmParam_ParametersObj.cheques_ChequeBook_AutoSubmitUponApproveFlag().click();;
    }
    
    @Then("^click on the Allow auto submit flag$")
    public void click_on_the_allow_auto_submit_flag() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_AllowAutoSubmitFlag());
    	csmParam_ParametersObj.cheques_ChequeBook_AllowAutoSubmitFlag().click();;
    }
    
    @Then("^Click on save button$")
    public void click_on_save_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_SaveButton());
    	csmParam_ParametersObj.Cheques_ChequeBook_SaveButton().click();;
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton());
    	for (int i = 0; i <= 200; i++) {
			try {
				csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_SuccessPopupOkButton());
    	for (int i = 0; i <= 200; i++) {
    		try {
    			csmParam_ParametersObj.Cheques_ChequeBook_SuccessPopupOkButton().click();
    			break;
    		} catch (Exception e) {
    			// TODO: handle exception
    			if(i==200) {
    				Assert.fail(e.getMessage());
    			}
    		}
    		
    	}
    }

    @Then("^navigate to approve screen to approve the saved chequebook$")
    public void navigate_to_approve_screen_to_approve_the_saved_chequebook() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Approve());
    	for (int i = 0; i <= 200; i++) {
			try {
				csmParam_ParametersObj.cheques_ChequeBook_Approve().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @Then("^retrive the chequebook record$")
    public void retrive_the_chequebook_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Approve_Code());
    	csmParam_ParametersObj.cheques_ChequeBook_Approve_Code().sendKeys(testData.get("Code"));
    	csmParam_ParametersObj.cheques_ChequeBook_Approve_Code().sendKeys(Keys.ENTER);
    	for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")).isDisplayed();
				WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
				clicksAndActionsHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @Then("^click on approve button to approve the chequebook record$")
    public void click_on_approve_button_to_approve_the_chequebook_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_ApproveButton());
    	javascripthelper.scrollIntoView(csmParam_ParametersObj.cheques_ChequeBook_ApproveButton());
    	csmParam_ParametersObj.cheques_ChequeBook_ApproveButton().click();
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton());
    	csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton().click();
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_SuccessPopupOkButton());
    	csmParam_ParametersObj.Cheques_ChequeBook_SuccessPopupOkButton().click();
    }
    
    @Then("^click on search button to search approved chequebook$")
    public void click_on_search_button_to_search_approved_chequebook() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Maintenance_SearchButton());
    	for (int i = 0; i <= 200; i++) {
			try {
				csmParam_ParametersObj.cheques_ChequeBook_Maintenance_SearchButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    @Then("^retrieve the approved record in maintenance screen$")
    public void retrieve_the_approved_record_in_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Approved_Code());
    	csmParam_ParametersObj.cheques_ChequeBook_Approved_Code().sendKeys(testData.get("Code"));
    	csmParam_ParametersObj.cheques_ChequeBook_Approved_Code().sendKeys(Keys.ENTER);
		for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")).isDisplayed();
				WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
				clicksAndActionsHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    

    @And("^verify the chequebook is created$")
    public void verify_the_chequebook_is_created() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Maintenance_StatusSpan());
    	boolean status = csmParam_ParametersObj.cheques_ChequeBook_Maintenance_Status().getAttribute("value").equalsIgnoreCase(testData.get("Status"));
    	Assert.assertTrue(status);
    }
    
    //---------------------------155----------------------------//
    @Then("^fill the valid details to create a specific chequebook code$")
    public void fill_the_valid_details_to_create_a_specific_chequebook_code() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Code());
    	csmParam_ParametersObj.cheques_ChequeBook_Code().sendKeys(testData.get("Code"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_BriefName());
    	csmParam_ParametersObj.cheques_ChequeBook_BriefName().sendKeys(testData.get("BriefName"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_NumberOfCheques());
    	csmParam_ParametersObj.cheques_ChequeBook_NumberOfCheques().sendKeys(testData.get("NumberOfCheques"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Language());
    	csmParam_ParametersObj.cheques_ChequeBook_Language().click();
    	Select s = new Select(csmParam_ParametersObj.cheques_ChequeBook_Language());
    	s.selectByVisibleText(testData.get("Language"));
    	
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_CancelSchema());
    	csmParam_ParametersObj.cheques_ChequeBook_CancelSchema().sendKeys(testData.get("CancelSchema"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_DestroySchema());
    	csmParam_ParametersObj.cheques_ChequeBook_DestroySchema().sendKeys(testData.get("DestroySchema"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_TrxTypeCharges());
    	csmParam_ParametersObj.cheques_ChequeBook_TrxTypeCharges().sendKeys(testData.get("TrxTypeCharges"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_SpecificSchema());
    	csmParam_ParametersObj.cheques_ChequeBook_SpecificSchema().sendKeys(testData.get("SpecificSchema"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_NormalSchema());
    	csmParam_ParametersObj.cheques_ChequeBook_NormalSchema().sendKeys(testData.get("NormalSchema"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_InHouseSchema());
    	csmParam_ParametersObj.cheques_ChequeBook_InHouseSchema().sendKeys(testData.get("InHouseSchema"));
    	
    	javascripthelper.scrollIntoView(csmParam_ParametersObj.cheques_ChequeBook_AllowAutoApproveFlag());
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_ChequeType());
    	csmParam_ParametersObj.cheques_ChequeBook_ChequeType().sendKeys(testData.get("ChequeType"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Design());
    	csmParam_ParametersObj.cheques_ChequeBook_Design().sendKeys(testData.get("Design"));
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Leaves());
    	csmParam_ParametersObj.cheques_ChequeBook_Leaves().sendKeys(testData.get("Leaves"));
    	
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_DisableChequeNumberGeneration());
    	csmParam_ParametersObj.cheques_ChequeBook_DisableChequeNumberGeneration().click();
    	
    }
    
    @Then("^retrieve the approved record in maintenance screen and update new cheque code$")
    public void retrieve_the_approved_record_in_maintenance_screen_and_update_new_cheque_code() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.cheques_ChequeBook_Approved_Code());
    	csmParam_ParametersObj.cheques_ChequeBook_Approved_Code().sendKeys(testData.get("Code"));
    	for (int i = 0; i <= 200; i++) {
			try {
				csmParam_ParametersObj.cheques_ChequeBook_Approved_Code().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	for (int i = 0; i <= 200; i++) {
			try {
				String chequeCode = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")).getText();
				excelData1.updateTestData("CHB_155_D1", "ChequeCode", chequeCode);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")).isDisplayed();
				WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
				clicksAndActionsHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    //------------------------------157----------------------------//
    
    @Then("^navigate to Control Record$")
    public void navigate_to_control_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord());
    	csmParam_ParametersObj.systemParameters_ControlRecord().click();
    }
    
    @And("^Click on update and approve under control record$")
    public void click_on_update_and_approve_under_control_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_UpdateAfterApprove());
    	csmParam_ParametersObj.systemParameters_ControlRecord_UpdateAfterApprove().click();
    }
    
    @Then("^update bulk destroy period to 40$")
    public void update_bulk_destroy_period_to_40() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_BulkDestroyPeriod());
    	csmParam_ParametersObj.systemParameters_ControlRecord_BulkDestroyPeriod().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE ,testData.get("BulkDestroyPeriod"));
    	csmParam_ParametersObj.systemParameters_ControlRecord_BulkDestroyPeriod().sendKeys(testData.get("BulkDestroyPeriod"));
    	
    }
    
	@And("^uncheck chequebook advanced process flag$")
	public void uncheck_chequebook_advanced_process_flag() throws Throwable {
		try {
			csmParam_ParametersObj.systemParameters_ControlRecord_CheckedChequebookAdvancedProcessFlag().isDisplayed();
			waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_ChequebookAdvancedProcessFlag());
			csmParam_ParametersObj.systemParameters_ControlRecord_ChequebookAdvancedProcessFlag().click();
		} catch (Exception e) {
			
		}
		
	}
	
	@Then("^click on update after approve button$")
    public void click_on_update_after_approve_button() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_UpdateAfterApproveButton());
		javascripthelper.scrollIntoView(csmParam_ParametersObj.systemParameters_ControlRecord_UpdateAfterApproveButton());
		waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_UpdateAfterApproveButton());
		csmParam_ParametersObj.systemParameters_ControlRecord_UpdateAfterApproveButton().click();
		try {
			waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_NoChangesAvailable());
			boolean status = csmParam_ParametersObj.systemParameters_ControlRecord_NoChangesAvailable().isDisplayed();
			if(status==true) {
				Assert.fail("No changes Available");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton());
		csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton().click();
		waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_SuccessPopupOkButton());
		csmParam_ParametersObj.Cheques_ChequeBook_SuccessPopupOkButton().click();
    }

    @Then("^navigate to approve under control record$")
    public void navigate_to_approve_under_control_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_Approve());
		csmParam_ParametersObj.systemParameters_ControlRecord_Approve().click();
    }
    
    @Then("^click on approve button under control record approve$")
    public void click_on_approve_button_under_control_record_approve() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_ApproveButton());
    	javascripthelper.scrollIntoView(csmParam_ParametersObj.systemParameters_ControlRecord_ApproveButton());
    	waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.systemParameters_ControlRecord_ApproveButton());
		csmParam_ParametersObj.systemParameters_ControlRecord_ApproveButton().click();
		waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton());
		csmParam_ParametersObj.Cheques_ChequeBook_ConfirmPopupOkButton().click();
		waithelper.waitForElementwithFluentwait(driver, csmParam_ParametersObj.Cheques_ChequeBook_SuccessPopupOkButton());
		csmParam_ParametersObj.Cheques_ChequeBook_SuccessPopupOkButton().click();
    }

    
    //------------------------------158----------------------------//
    //------------------------------159----------------------------//
    
    
    //////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^select data set Id to create a chequebook for system behavior Allow Auto Approve is Checked$")
    public void select_data_set_id_to_create_a_chequebook_for_system_behavior_allow_auto_approve_is_checked() throws Throwable {
    	dataSetID = "CHB_055_01_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set Id to create a chequebook for system behavior Auto Submit upon Approve is checked$")
    public void select_data_set_id_to_create_a_chequebook_for_system_behavior_auto_submit_upon_approve_is_checked() throws Throwable {
    	dataSetID = "CHB_057_01_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set Id to create a chequebook for system behavior Allow Auto Submit and auto submit upon approve is checked$")
    public void select_data_set_id_to_create_a_chequebook_for_system_behavior_allow_auto_submit_and_auto_submit_upon_approve_is_checked() throws Throwable {
    	dataSetID = "CHB_058_01_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set Id to create a chequebook for system behavior Allow Auto Submit is checked$")
    public void select_data_set_id_to_create_a_chequebook_for_system_behavior_allow_auto_submit_is_checked() throws Throwable {
    	dataSetID = "CHB_059_01_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set Id to create a chequebook for system behaviors is unchecked$")
    public void select_data_set_id_to_create_a_chequebook_for_system_behaviors_is_unchecked() throws Throwable {
    	dataSetID = "CHB_060_01_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to create multi chequebook$")
    public void select_data_set_id_to_create_multi_chequebook() throws Throwable {
    	dataSetID = "CHB_155_01_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to set Bulk Destroy Period$")
    public void select_data_set_id_to_set_bulk_destroy_period() throws Throwable {
    	dataSetID = "CHB_156_01_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to update bulk destroy period to 40 days$")
    public void select_data_set_id_to_update_bulk_destroy_period_to_40_days() throws Throwable {
    	dataSetID = "CHB_157_01_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
}








