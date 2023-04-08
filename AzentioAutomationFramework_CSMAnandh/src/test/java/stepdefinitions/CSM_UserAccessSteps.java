package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_UserAccessObj;
import resources.BaseClass;

public class CSM_UserAccessSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMCommonWebElements csmCommonElements = new CSMCommonWebElements(driver);
	CSMParam_UserAccessObj userAccessObj = new CSMParam_UserAccessObj(driver);
	JavascriptHelper javascriptHelper= new JavascriptHelper(driver); 
	String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData exelDataForUserAccess = new ExcelData(testDataPath, "CSMParam_userAccessTestData", "DataSet ID");
	ExcelData excelDataforCIFType = new ExcelData(testDataPath, "CSMParam_CIFTypeTestData", "DataSet ID");
	Map<String,String> userAccessTestData= new HashMap<>();
	

	@And("^click on system parameter$")
	public void click_on_system_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.csmParamSystemParameter());
		clicksAndActionsHelper.moveToElement(userAccessObj.csmParamSystemParameter());
		clicksAndActionsHelper.clickOnElement(userAccessObj.csmParamSystemParameter());
	}

	@And("^click on user module under system parameter$")
	public void click_on_user_module_under_system_parameter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.systemParameterUserMainModule());
		clicksAndActionsHelper.moveToElement(userAccessObj.systemParameterUserMainModule());
		clicksAndActionsHelper.clickOnElement(userAccessObj.systemParameterUserMainModule());
	}
	@And("^get the test data for give acess to account type$")
    public void get_the_test_data_for_give_acess_to_account_type() throws Throwable {
		userAccessTestData=exelDataForUserAccess.getTestdata("DS01_ActType_Acces_03");
    }

	@And("^click on update after approve screen under user module$")
	public void click_on_update_after_approve_screen_under_user_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userUpdateAfterApprove());
		clicksAndActionsHelper.moveToElement(userAccessObj.userUpdateAfterApprove());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userUpdateAfterApprove());
	}
	 @And("^get the test data for the user access record which is done on account type access$")
	    public void get_the_test_data_for_the_user_access_record_which_is_done_on_account_type_access() throws Throwable {
		 userAccessTestData=exelDataForUserAccess.getTestdata("DS01_ActType_Acces_04");
	    }
	 @And("^get the test data for give access to CIF Type$")
	    public void get_the_test_data_for_give_access_to_cif_type() throws Throwable {
		 userAccessTestData=exelDataForUserAccess.getTestdata("DS01_ActType_Acces_04");
	    }
	@And("^search the user ID in user module$")
	public void search_the_user_id_in_user_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userSearchUserID());
		clicksAndActionsHelper.moveToElement(userAccessObj.userSearchUserID());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userSearchUserID());
		userAccessObj.userSearchUserID().sendKeys(userAccessTestData.get("UserName"));
		userAccessObj.userSearchUserID().sendKeys(Keys.ENTER);
	}

	@And("^select the user from suggestion$")
	public void select_the_user_from_suggestion() throws Throwable {
		String xpath = "//td[text()='" + userAccessTestData.get("UserName") + "']";
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;

			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	 @And("^click on CIf type access option$")
	    public void click_on_cif_type_access_option() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userCIFTypeAccessInputBox());
			clicksAndActionsHelper.moveToElement(userAccessObj.userCIFTypeAccessInputBox());
			clicksAndActionsHelper.clickOnElement(userAccessObj.userCIFTypeAccessInputBox());
	    }

	    @And("^click on add button in CIF type access page$")
	    public void click_on_add_button_in_cif_type_access_page() throws Throwable {
	    
			
	    }

	    @And("^enter the CIF type in access screen$")
	    public void enter_the_cif_type_in_access_screen() throws Throwable {
	    	
	    	waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userCIFTypeAccessInputBox());
			clicksAndActionsHelper.moveToElement(userAccessObj.userCIFTypeAccessInputBox());
			clicksAndActionsHelper.clickOnElement(userAccessObj.userCIFTypeAccessInputBox());
			userAccessObj.userCIFTypeAccessInputBox().sendKeys(userAccessTestData.get("CIFType"));
			
	    	
	    }

	    @And("^enter the Transaction number in CIF type access screen$")
	    public void enter_the_transaction_number_in_cif_type_access_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userCIFTypeTransactionInputBox());
			clicksAndActionsHelper.moveToElement(userAccessObj.userCIFTypeTransactionInputBox());
			clicksAndActionsHelper.clickOnElement(userAccessObj.userCIFTypeTransactionInputBox());
			userAccessObj.userCIFTypeTransactionInputBox().sendKeys(userAccessTestData.get("CIF Transaction No"));
			waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchWdLimit());
			clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchWdLimit());
			clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchWdLimit());
	    }

	    @And("^click on ok button in CIF type access screen$")
	    public void click_on_ok_button_in_cif_type_access_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userCIFTypeAccessInputBox());
			clicksAndActionsHelper.moveToElement(userAccessObj.userCIFTypeAccessInputBox());
			clicksAndActionsHelper.clickOnElement(userAccessObj.userCIFTypeAccessInputBox());
	    }
	@And("^click on account type access option$")
	public void click_on_account_type_access_option() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccountTypeAccess());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccountTypeAccess());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccountTypeAccess());
	}

	@And("^click on add button in account type access$")
	public void click_on_add_button_in_account_type_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessPlusIcon());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessPlusIcon());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessPlusIcon());
	}

	@And("^enter the account type for access$")
	public void enter_the_account_type_for_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchAccountType());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchAccountType());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchAccountType());
		userAccessObj.userAccessSearchAccountType().sendKeys(userAccessTestData.get("AccountType"));
		
		
	}

	@And("^enter the transaction number for access$")
	public void enter_the_transaction_number_for_access() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchTransaction());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchTransaction());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchTransaction());
		userAccessObj.userAccessSearchTransaction().sendKeys(userAccessTestData.get("AccountType Transaction No"));
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSearchWdLimit());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSearchWdLimit());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSearchWdLimit());
		
	}

	@And("^click on ok button in access screen$")
	public void click_on_ok_button_in_access_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessOkButton());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessOkButton());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessOkButton());
	}

	@And("^click on update after approve button$")
	public void click_on_update_after_approve_button() throws Throwable {
		for(int i=0;i<=300;i++)
		{
			try
			{
				javascriptHelper.scrollIntoView(userAccessObj.userAccessUpdateAfterApproveButton());
				clicksAndActionsHelper.moveToElement(userAccessObj.userAccessUpdateAfterApproveButton());
				clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessUpdateAfterApproveButton());
				break;
			}
			catch(Exception e)
			{
				if(i==300)
				{
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on ok button in update confirmation$")
	public void click_on_ok_button_in_update_confirmation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSaveConfirmOkButton());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSaveConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSaveConfirmOkButton());
	}

	@And("^click on ok button in saved successfully in user screen$")
	public void click_on_ok_button_in_saved_successfully_in_user_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessSaveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessSaveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessSaveSuccessOkButton());
	}

	@And("^click on approval module under user module$")
	public void click_on_approval_module_under_user_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, userAccessObj.userAccessApproveModule());
		clicksAndActionsHelper.moveToElement(userAccessObj.userAccessApproveModule());
		clicksAndActionsHelper.clickOnElement(userAccessObj.userAccessApproveModule());
	}

	@And("^click on approve button in user module$")
	public void click_on_approve_button_in_user_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmApproveButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmApproveButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmApproveButton());
	}

	@And("^click on approval confirmation ok button under user screen$")
	public void click_on_approval_confirmation_ok_button_under_user_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmConfirmApprovOkButton());
	}

	@And("^click on ok button after approval screen under user screen$")
	public void click_on_ok_button_after_approval_screen_under_user_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonElements.csmApproveSuccessOkButton());
		excelDataforCIFType.updateTestData("DS_01_CIFType_01", "Allow Gl Code", userAccessTestData.get("AccountType"));
	}
}
