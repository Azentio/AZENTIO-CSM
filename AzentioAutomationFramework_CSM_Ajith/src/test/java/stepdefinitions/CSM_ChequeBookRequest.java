package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.ChequeBookRequestObj;
import resources.BaseClass;


public class CSM_ChequeBookRequest extends BaseClass{
	WebDriver driver = BaseClass.driver;
	ChequeBookRequestObj chequeBookRequestObj = new ChequeBookRequestObj(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ChequebookRequest","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
    @And("^User update Test data id for checking if the user is able to suspend a chequebook short process$")
    public void user_update_test_data_id_for_checking_if_the_user_is_able_to_suspend_a_chequebook_short_process() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_007");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
	@Then("^User Validate the suspended chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_suspended_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.suspendRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.suspendRecordValidationInCBMaintenance().isDisplayed());
	}

    @And("^User Click Suspend Sub Menu$")
    public void user_click_suspend_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.suspendScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.suspendScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.suspendScreen());
    }

    @And("^User search the chequebook code in chequebook request Maintenance Screen$")
    public void user_search_the_chequebook_code_in_chequebook_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.suspendSearchCheuqueCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.suspendSearchCheuqueCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.suspendSearchCheuqueCode());
		chequeBookRequestObj.suspendSearchCheuqueCode().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.suspendSearchCheuqueCode().sendKeys(Keys.ENTER);
		
    }

    @And("^User Select the Searched Record in chequebook request Maintenance Screen$")
    public void user_select_the_searched_record_in_chequebook_request_maintenance_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.suspendSelectCheuqueCode());
				seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.suspendSelectCheuqueCode());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	try {
    		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.viewMemoPopupClose());
    		chequeBookRequestObj.viewMemoPopupClose().click();
		} catch (Exception e) {
			
		}
		
		
    }

    @And("^User click suspend button to suspend the cheque book record$")
    public void user_click_suspend_button_to_suspend_the_cheque_book_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.suspendButton());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.suspendButton());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.suspendButton());
    }

    @And("^User Click Maintanence sub menu in chequebook request$")
    public void user_click_maintanence_sub_menu_in_chequebook_request() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.CBMaintenanceScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.CBMaintenanceScreen());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }
    @And("^User Click Search button in chequebook request Maintenance Screen$")
    public void user_click_search_button_in_chequebook_request_maintenance_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchButtonInCBMaintenance());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }
    @And("^User Search Suspended chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_suspended_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {	
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}
		
    }
}
