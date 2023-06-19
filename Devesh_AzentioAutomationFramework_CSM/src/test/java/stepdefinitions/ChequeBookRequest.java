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
import io.cucumber.java.en.Then;
import pageobjects.ChequeBookRequestObj;
import pageobjects.TransactionOnStaffAccountsObj;
import resources.BaseClass;

public class ChequeBookRequest extends BaseClass{
	WebDriver driver= BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	CSMLogin csmLogin = new CSMLogin(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ChequeBookRequestObj chequeBookRequestObj = new ChequeBookRequestObj(driver);
	TransactionOnStaffAccountsObj transactionsObj = new TransactionOnStaffAccountsObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ExcelData excelData = new ExcelData(System.getProperty("user.dir") + "\\TestData\\CSM_TestData.xlsx",
			"ChequeBookTestData", "Data Set ID");
	Map<String, String> testData = new HashMap<>();
	String dataSetID;
	
	@Then("^navigate to chequebook request menu option$")
    public void navigate_to_chequebook_request_menu_option() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_MenuOption());
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_MenuOption());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_MenuOption());
		chequeBookRequestObj.chequeBookRequest_MenuOption().click();
    }

    @Then("^click on To Reactivate submenu$")
    public void click_on_to_reactivate_submenu() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToReactivate());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToReactivate());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToReactivate());
    	chequeBookRequestObj.chequeBookRequest_ToReactivate().click();
    }

    @Then("^select suspended record$")
    public void select_suspended_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    }
    
    @And("^click on To Reactivate button$")
    public void click_on_to_reactivate_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToReactivate_ToReactivateSubmitButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToReactivate_ToReactivateSubmitButton());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToReactivate_ToReactivateSubmitButton());
    	chequeBookRequestObj.chequeBookRequest_ToReactivate_ToReactivateSubmitButton().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }
    
    @Then("^remove the current tab$")
    public void remove_the_current_tab() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RemoveTab());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_RemoveTab());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RemoveTab());
    	for (int i = 0; i <=200; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_SubMenu_RemoveTab().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @Then("^navigate to Reactivate screen$")
    public void navigate_to_reactivate_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Reactivate());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Reactivate());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Reactivate());
    	chequeBookRequestObj.chequeBookRequest_Reactivate().click();
    	
    }

    @Then("^select the record to reactivate$")
    public void select_the_record_to_reactivate() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }
    
    @And("^click on Reactivate button$")
    public void click_on_reactivate_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Reactivate_ReactivateSubmitButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Reactivate_ReactivateSubmitButton());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Reactivate_ReactivateSubmitButton());
    	chequeBookRequestObj.chequeBookRequest_Reactivate_ReactivateSubmitButton().click();
    }
    
    @Then("^navigate to maintenance screen$")
    public void navigate_to_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Maintenance());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance());
    	chequeBookRequestObj.chequeBookRequest_Maintenance().click();
    }

    @Then("^click on search button$")
    public void click_on_search_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_SearchButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_SearchButton());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_SearchButton());
    	for (int i = 0; i <=200; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_SubMenu_SearchButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

	@Then("^select the reactivated record$")
	public void select_the_reactivated_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']")));
		WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
		clicksAndActionsHelper.doubleClick(record);
	}
    
    @And("^check the status should be Approved$")
    public void check_the_status_should_be_approved() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase(testData.get("Status"));
    	Assert.assertTrue(status);
    }
    
    //22//////////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^navigate to To Be Reversed screen$")
    public void navigate_to_to_be_reversed_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversedChequebook());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToBeReversedChequebook());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversedChequebook());
    	chequeBookRequestObj.chequeBookRequest_ToBeReversedChequebook().click();
    }

    @Then("^select Approved record$")
    public void select_approved_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    }

    @And("^click on To Be Reversed button$")
    public void click_on_to_be_reversed_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToReactivate_ToReactivateSubmitButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton());
    	chequeBookRequestObj.chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }
    
    @Then("^navigate to Reverse Chequebook screen$")
    public void navigate_to_reverse_chequebook_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ReverseChequebook());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ReverseChequebook());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ReverseChequebook());
    	chequeBookRequestObj.chequeBookRequest_ReverseChequebook().click();
    }

    @Then("^select the record to reverse$")
    public void select_the_record_to_reverse() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }

    @And("^click on Reverse button$")
    public void click_on_reverse_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Reverse_ReverseSubmitButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Reverse_ReverseSubmitButton());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Reverse_ReverseSubmitButton());
    	chequeBookRequestObj.chequeBookRequest_Reverse_ReverseSubmitButton().click();
    }
    
    @Then("^select the reversed record$")
    public void select_the_reversed_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']")));
		WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
		clicksAndActionsHelper.doubleClick(record);
    }

    @And("^check the status should be Reversed$")
    public void check_the_status_should_be_reversed() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase(testData.get("Status"));
    	Assert.assertTrue(status);
    }
    
    //23/////////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^create a new chequebook with user A$")
    public void create_a_new_chequebook_with_user_a() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_NumberOfChequebook());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_NumberOfChequebook().sendKeys(testData.get("NumberOfChequeBooks"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_ChequeCODE());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_ChequeCODE().sendKeys(testData.get("ChequeCode"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_AccountNumberLookup());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_AccountNumberLookup().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCODE());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCODE().sendKeys(testData.get("BranchCode"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_Currency());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_Currency().sendKeys(testData.get("Currency"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_GL());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_GL().sendKeys(testData.get("GL"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_CifNo());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_CifNo().sendKeys(testData.get("CifNo"));
    	try {
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_SerialNo());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_SerialNo().sendKeys(testData.get("SerialNo"));
    	try {
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
//    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCodeRecord());
//    	clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCodeRecord());
    	
    }

    @Then("^click on save button$")
    public void click_on_save_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_SaveButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Maintenance_SaveButton());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_SaveButton().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_WarningPopup());
    	for (int i = 0; i <=200; i++) {
    		try {
    			chequeBookRequestObj.chequeBookRequest_WarningPopup().click();
    		} catch (Exception e) {
    			// TODO: handle exception
    		}
		}
    	
    }
    
    @Then("^click on delete button$")
    public void click_on_delete_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_DeleteButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Maintenance_DeleteButton());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_DeleteButton().click();
    }
    
    @Then("^update the new record code$")
    public void update_the_new_record_code() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_SavedRecord());
    	String code = chequeBookRequestObj.chequeBookRequest_Maintenance_SavedRecord().getText();
        excelData.updateTestData(dataSetID, "Code", code);
        testData = excelData.getTestdata(dataSetID);
        
    }

    @Then("^Login with Branch Manager user$")
    public void login_with_branch_manager_user() throws Throwable {
    	csmLogin.loginIntoCSMApplication("CSMUser1");
    }

    @Then("^navigate to approve screen$")
    public void navigate_to_approve_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Approve());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Approve());
    	chequeBookRequestObj.chequeBookRequest_Approve().click();
    }

    @Then("^select the record to approve$")
    public void select_the_record_to_approve() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }

    @And("^click on approve button$")
    public void click_on_approve_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton());
    	chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton().click();
    }
    
    @And("^click on approve button and waive charges$")
    public void click_on_approve_button_and_waive_charges() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton());
    	chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton().click();
		for (int i = 0; i <= 50; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_WarningPopup());
				chequeBookRequestObj.chequeBookRequest_WarningPopup().click();
				javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Maintenance_ChargesCollapsible());
				waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_ChargesCollapsible());
				chequeBookRequestObj.chequeBookRequest_Maintenance_ChargesCollapsible().click();
				waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_WaiveCharges());
				chequeBookRequestObj.chequeBookRequest_Maintenance_WaiveCharges().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton());
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton());
    	chequeBookRequestObj.chequeBookRequest_Approve_ApproveButton().click();
    }
    
    @Then("^select the approved record$")
    public void select_the_approved_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		for (int i = 0; i <= 200; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']")));
				WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
				clicksAndActionsHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton());
		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    }
    
    @And("^check the status of the record approved by BM$")
    public void check_the_status_of_the_record_approved_by_bm() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase(testData.get("Status"));
    	Assert.assertTrue(status);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	String sts = chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getText();
    	excelData.updateTestData(dataSetID, "Status", sts);
        testData = excelData.getTestdata(dataSetID);
    }
    
    @And("^check the status should be added in the status table with the user ID and time$")
    public void check_the_status_should_be_added_in_the_status_table_with_the_user_id_and_time() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_StatusTable());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_StatusTable().click();
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("(//td[@title='"+testData.get("")+"'])[2]/../td[@tdlabel='User Name']")));
    	driver.findElement(By.xpath("(//td[@title='"+testData.get("Status")+"'])[2]/../td[@tdlabel='User Name']")).isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("(//td[@title='"+testData.get("")+"'])[2]/../td[@tdlabel='Status Date']")));
    	driver.findElement(By.xpath("(//td[@title='"+testData.get("Status")+"'])[2]/../td[@tdlabel='Status Date']")).isDisplayed();

    }
    
    //24/////////////////////////////////////////////////////////////////////////////////////////////

    @Then("^navigate to apply to submit screen$")
    public void navigate_to_apply_to_submit_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApplyToSubmit());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ApplyToSubmit());
    	chequeBookRequestObj.chequeBookRequest_ApplyToSubmit().click();
    	
    }

    @Then("^select a approved chequebook request$")
    public void select_a_approved_chequebook_request() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }

    @Then("^click on apply submit button$")
    public void click_on_apply_submit_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApplyToSubmit());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_AppltToSubmit_ApplySubmitButton());
    	chequeBookRequestObj.chequeBookRequest_AppltToSubmit_ApplySubmitButton().click();
    }

    @Then("^navigate to submit screen$")
    public void navigate_to_submit_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Submit());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Submit());
    	chequeBookRequestObj.chequeBookRequest_Submit().click();
    }

    @Then("^open the chequebook request$")
    public void open_the_chequebook_request() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }

    @Then("^click on submit button$")
    public void click_on_submit_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Submit_SubmitButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Submit_SubmitButton());
    	chequeBookRequestObj.chequeBookRequest_Submit_SubmitButton().click();
    }

    @Then("^retrieve the submitted chequebook in maintenance screen$")
    public void retrieve_the_submitted_chequebook_in_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']")));
		WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
		clicksAndActionsHelper.doubleClick(record);
    }
    
    
    
    //25/////////////////////////////////////////////////////////////////////////////////////////////

    @Then("^navigate to To Cancel screen$")
    public void navigate_to_to_cancel_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToCancel());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToCancel());
    	chequeBookRequestObj.chequeBookRequest_ToCancel().click();
    }

    @Then("^retrieve the submitted chequebook request$")
    public void retrieve_the_submitted_chequebook_request() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
//    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
//    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
//    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }

    @Then("^click on To Cancel button$")
    public void click_on_to_cancel_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToCancel_ToCancelButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToCancel_ToCancelButton());
    	chequeBookRequestObj.chequeBookRequest_ToCancel_ToCancelButton().click();
    }

    @Then("^navigate to Approve cancel screen$")
    public void navigate_to_approve_cancel_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveCancel());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ApproveCancel());
    	chequeBookRequestObj.chequeBookRequest_ApproveCancel().click();
    }

    @Then("^click on cancel button$")
    public void click_on_cancel_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveCancel_CancelButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ApproveCancel_CancelButton());
    	chequeBookRequestObj.chequeBookRequest_ApproveCancel_CancelButton().click();
    }

    @Then("^retrieve the approved cancelled chequebook in maintenance screen$")
    public void retrieve_the_approved_cancelled_chequebook_in_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']")));
		WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
		clicksAndActionsHelper.doubleClick(record);
    }
    
    
    //26/////////////////////////////////////////////////////////////////////////////////////////////

    @Then("^navigate to To be destroyed screen$")
    public void navigate_to_to_be_destroyed_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeDestroyed());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToBeDestroyed());
    	chequeBookRequestObj.chequeBookRequest_ToBeDestroyed().click();
    }

    @Then("^click on To Destroy button$")
    public void click_on_to_destroy_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeDestroyed_ToDestroyButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToBeDestroyed_ToDestroyButton());
    	chequeBookRequestObj.chequeBookRequest_ToBeDestroyed_ToDestroyButton().click();
    }

    @Then("^navigate to Approve Destroyed screen$")
    public void navigate_to_approve_destroyed_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveDestroyed());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ApproveDestroyed());
    	chequeBookRequestObj.chequeBookRequest_ApproveDestroyed().click();
    }

    @Then("^click on Destory button$")
    public void click_on_destory_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveDestroyed_DestroyButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ApproveDestroyed_DestroyButton());
    	chequeBookRequestObj.chequeBookRequest_ApproveDestroyed_DestroyButton().click();
    }

    @Then("^retrieve the approved destroyed chequebook in maintenance screen$")
    public void retrieve_the_approved_destroyed_chequebook_in_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']")));
		WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
		clicksAndActionsHelper.doubleClick(record);
    }
    
    //27/////////////////////////////////////////////////////////////////////////////////////////////

    @Then("^navigate to To Suspend screen$")
    public void navigate_to_to_suspend_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToSuspend());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToSuspend());
    	chequeBookRequestObj.chequeBookRequest_ToSuspend().click();
    }

    @Then("^click on To Suspend button$")
    public void click_on_to_suspend_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToSuspend_ToSuspendButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ToSuspend_ToSuspendButton());
    	chequeBookRequestObj.chequeBookRequest_ToSuspend_ToSuspendButton().click();
    }

    @Then("^navigate to Suspend screen$")
    public void navigate_to_suspend_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Suspend());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Suspend());
    	chequeBookRequestObj.chequeBookRequest_Suspend().click();
    }

    @Then("^click on Suspend button$")
    public void click_on_suspend_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Suspend_SuspendButton());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Suspend_SuspendButton());
    	chequeBookRequestObj.chequeBookRequest_Suspend_SuspendButton().click();
    }

    @Then("^retrieve the approved suspended chequebook in maintenance screen$")
    public void retrieve_the_approved_suspended_chequebook_in_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']")));
		WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
		clicksAndActionsHelper.doubleClick(record);
    }
    
    //55//////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^create a new chequebook request$")
    public void create_a_new_chequebook_request() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_NumberOfChequebook());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_NumberOfChequebook().sendKeys(testData.get("NumberOfChequeBooks"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_ChequeCODE());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_ChequeCODE().sendKeys(testData.get("ChequeCode"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_AccountNumberLookup());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_AccountNumberLookup().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCODE());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCODE().sendKeys(testData.get("BranchCode"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_Currency());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_Currency().sendKeys(testData.get("Currency"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_GL());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_GL().sendKeys(testData.get("GL"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_CifNo());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_CifNo().sendKeys(testData.get("CifNo"));
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_Maintenance_SerialNo());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_SerialNo());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_SerialNo().sendKeys(testData.get("SerialNo"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCodeRecord());
    	clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCodeRecord());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton());
    	try {
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    	} catch (Exception e) {
    		// TODO: handle exception
    	}
    	
    }
    
    @And("^Check the status of the submitted record$")
    public void check_the_status_of_the_submitted_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase("Apply To Submit");
    	Assert.assertTrue(status);
    }
    
    @And("^Check the status of the submitted record after submit$")
    public void check_the_status_of_the_submitted_record_after_submit() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase("Submitted");
    	Assert.assertTrue(status);
    }
    
    //57//////////////////////////////////////////////////////////////////////////////////////////
   
    @Then("^retrieve the saved chequebook in maintenance screen$")
    public void retrieve_the_saved_chequebook_in_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
		for (int i = 0; i <=200; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <=200; i++) {
			try {
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
		
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton());
		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    }
    
    @Then("^verify the chequebook is created successfully with active status$")
    public void verify_the_chequebook_is_created_successfully_with_active_status() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase(testData.get("Status"));
    	Assert.assertTrue(status);
    }
    
    @Then("^verify the chequebook is created successfully with Submitted status$")
    public void verify_the_chequebook_is_created_successfully_with_submitted_status() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase("Submitted");
    	Assert.assertTrue(status);
    }
    
    //58//////////////////////////////////////////////////////////////////////////////////////////
    
    //59//////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^verify the chequebook will be approved successfully$")
    public void verify_the_chequebook_will_be_approved_successfully() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase("Approved");
    	Assert.assertTrue(status);
    }
    
    @Then("^verify the chequebook will be submitted directly$")
    public void verify_the_chequebook_will_be_submitted_directly() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase("Submitted");
    	Assert.assertTrue(status);
    }
    
    @Then("^select the apply to submit record$")
    public void select_the_apply_to_submit_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
//		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
//		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
//		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']")));
		WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code") + "']"));
		clicksAndActionsHelper.doubleClick(record);
    }
    
    //60//////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^verify the chequebook will be applied to submission sucessfully$")
    public void verify_the_chequebook_will_be_applied_to_submission_sucessfully() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase("Apply To Submit");
    	Assert.assertTrue(status);
    }
    
    @Then("^verify the chequebook will be submitted successfully$")
    public void verify_the_chequebook_will_be_submitted_successfully() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase("Submitted");
    	Assert.assertTrue(status);
    }
    
    //75//////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^verify system will default chq no From number 1 and To number 10$")
    public void verify_system_will_default_chq_no_from_number_1_and_to_number_10() throws Throwable {
       
    }
    
    //95//////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^check the system is retrieving only approved chequebook$")
    public void check_the_system_is_retrieving_only_approved_chequebook() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status());
    	boolean status = chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status().getAttribute("value").equalsIgnoreCase("Approve");
    	Assert.assertTrue(status);
    }

    @Then("^verify chequebook status should be To be Reversed$")
    public void verify_chequebook_status_should_be_to_be_reversed() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status());
    	boolean status = chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status().getAttribute("value").equalsIgnoreCase("To Be Reversed");
    	Assert.assertTrue(status);
    }

    @Then("^verify the chequebook status should be Reversed$")
    public void verify_the_chequebook_status_should_be_reversed() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status());
    	boolean status = chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status().getAttribute("value").equalsIgnoreCase("Reversed");
    	Assert.assertTrue(status);
    }
    
    //96//////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^navigate to Send To Branch screen$")
    public void navigate_to_send_to_branch_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SendToBranch());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SendToBranch());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SendToBranch());
    	chequeBookRequestObj.chequeBookRequest_SendToBranch().click();
    }

    @Then("^check the chequebook with status Received should be retrieved$")
    public void check_the_chequebook_with_status_received_should_be_retrieved() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	try {
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().isDisplayed();
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status());
    	boolean status = chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status().getAttribute("value").equalsIgnoreCase("Received From Provider");
    	Assert.assertTrue(status);
    }

    @Then("^get the destination branch code$")
    public void get_the_destination_branch_code() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_DestinationBranch());
    	String destinationBranchCode = chequeBookRequestObj.chequeBookRequest_DestinationBranch().getAttribute("initialvalue").toString();
    	System.out.println("Destination Branch Code - "+destinationBranchCode);
    	excelData.updateTestData(dataSetID, "DestinationBranchCode", destinationBranchCode);
        testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^login with the destination branch code$")
    public void login_with_the_destination_branch_code() throws Throwable {
    	csmLogin.loginIntoCSMApplication("CSMUser1");
    }

    @Then("^navigate to In Branch screen$")
    public void navigate_to_in_branch_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_InBranch());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_InBranch());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_InBranch());
    	chequeBookRequestObj.chequeBookRequest_InBranch().click();
    }

    @And("^check the chequebook should be received at the selected branch$")
    public void check_the_chequebook_should_be_received_at_the_selected_branch() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	boolean receivedChequebook = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")).isDisplayed();
    	Assert.assertTrue(receivedChequebook);
    }
    
    //97/////////////////////////////////////////////////////////////////////////////////////////////
   
    @Then("^create a new chequebook without InHouse Charges with type 12$")
    public void create_a_new_chequebook_without_inhouse_charges_with_type_12() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_NumberOfChequebook());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_NumberOfChequebook().sendKeys(testData.get("NumberOfChequeBooks"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_ChequeCODE());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_ChequeCODE().sendKeys(testData.get("ChequeCode"));
//    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_AccountNumberLookup());
//    	chequeBookRequestObj.chequeBookRequest_Maintenance_AccountNumberLookup().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCODE());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCODE().sendKeys(testData.get("BranchCode"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_Currency());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_Currency().sendKeys(testData.get("Currency"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_GL());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_GL().sendKeys(testData.get("GL"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_CifNo());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_CifNo().sendKeys(testData.get("CifNo"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_SerialNo());
    	chequeBookRequestObj.chequeBookRequest_Maintenance_SerialNo().sendKeys(testData.get("SerialNo"));
//    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCodeRecord());
//    	clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBookRequest_Maintenance_BranchCodeRecord());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton());
    	chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_PrintingLocation());
    	chequeBookRequestObj.chequeBookRequest_PrintingLocation().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_InHouse());
    	chequeBookRequestObj.chequeBookRequest_InHouse().click();
    	
    }
    
    @And("^verify the chequebook should be approved with status Submitted$")
    public void verify_the_chequebook_should_be_approved_with_status_submitted() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus());
    	boolean status=chequeBookRequestObj.chequeBookRequest_SubMenu_RecordStatus().getAttribute("value").equalsIgnoreCase("Submitted");
    	Assert.assertTrue(status);
    }
    
    //98/////////////////////////////////////////////////////////////////////////////////////////////
    
    
    //99/////////////////////////////////////////////////////////////////////////////////////////////
    
    //155/////////////////////////////////////////////////////////////////////////////////////////////
    

    @Then("^navigate to approve or reject and destroy screen$")
    public void navigate_to_approve_or_reject_and_destroy_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy());
    	chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy().click();
    }

    @Then("^click on retrieve button in approve reject bulk destroy screen$")
    public void click_on_retrieve_button_in_approve_reject_bulk_destroy_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_RetrieveKey());
    	chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_RetrieveKey().click();
    }
    
    @Then("^select multiple chequebook$")
    public void select_multiple_chequebook() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_FirstCheckbox());
    	chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_FirstCheckbox().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_SecondCheckbox());
    	chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_SecondCheckbox().click();
    }

    @Then("^click on destroy button$")
    public void click_on_destroy_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_DestroyButton());
    	chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_DestroyButton().click();
    }

    @Then("^verify the chequebook will be destroyed$")
    public void verify_the_chequebook_will_be_destroyed() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	try {
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().isDisplayed();
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status());
    	boolean status = chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status().getAttribute("value").equalsIgnoreCase("Destroyed");
    	Assert.assertTrue(status);
    }

    @Then("^navigate to transaction screen$")
    public void navigate_to_transaction_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, transactionsObj.transactions_MenuOption());
    	javascripthelper.scrollIntoView(transactionsObj.transactions_MenuOption());
    	waithelper.waitForElementwithFluentwait(driver, transactionsObj.transactions_MenuOption());
    	transactionsObj.transactions_MenuOption().click();
    }
    
    @Then("^click on maintenance screen under transaction menu$")
    public void click_on_maintenance_screen_under_transaction_menu() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, transactionsObj.transactions_Maintenance());
    	transactionsObj.transactions_Maintenance().click();
    }

    @Then("^retrieve the transaction for destroyed charges$")
    public void retrieve_the_transaction_for_destroyed_charges() throws Throwable {

    }

    @Then("^verify the transaction is created successfully$")
    public void verify_the_transaction_is_created_successfully() throws Throwable {
        
    }
    
    @Then("^update the new record code1$")
    public void update_the_new_record_code1() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_SavedRecord());
    	String code = chequeBookRequestObj.chequeBookRequest_Maintenance_SavedRecord().getText();
        excelData.updateTestData(dataSetID, "Code1", code);
        testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^retrieve the saved chequebook request code1 in maintenance screen$")
    public void retrieve_the_saved_chequebook_request_code1_in_maintenance_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code1"));
		for (int i = 0; i <=200; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <=200; i++) {
			try {
				WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code1") + "']"));
				clicksAndActionsHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton());
		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    }
    

    @Then("^select the record to approve record code1$")
    public void select_the_record_to_approve_record_code1() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code1"));
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code1")+"']")));
    	WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code1")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }

    @Then("^select the approved record code1$")
    public void select_the_approved_record_code1() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code1"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		for (int i = 0; i <= 200; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code1") + "']")));
				WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code1") + "']"));
				clicksAndActionsHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton());
		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    }

    @Then("^update the new record code2$")
    public void update_the_new_record_code2() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_Maintenance_SavedRecord());
    	String code = chequeBookRequestObj.chequeBookRequest_Maintenance_SavedRecord().getText();
        excelData.updateTestData(dataSetID, "Code2", code);
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select the record to approve record code2$")
    public void select_the_record_to_approve_record_code2() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code2"));
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code2")+"']")));
    	WebElement record =driver.findElement(By.xpath("//td[text()='"+testData.get("Code2")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_AlertClose().click();
    }

    @Then("^select the approved record code2$")
    public void select_the_approved_record_code2() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
		chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code2"));
		javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc());
		chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(testData.get("StatusDescription"));
		for (int i = 0; i <= 200; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='" + testData.get("Code2") + "']")));
				WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code2") + "']"));
				clicksAndActionsHelper.doubleClick(record);
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton());
		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    }
    
    @Then("^user should select approved chequebooks$")
    public void user_should_select_approved_chequebooks() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']/../td/input")));
    	driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']/../td/input")).click();
    	driver.findElement(By.xpath("//td[text()='"+testData.get("Code1")+"']/../td/input")).click();
    }
    
    
    //156/////////////////////////////////////////////////////////////////////////////////////////////

    @Then("^user should select current system date$")
    public void user_should_select_current_system_date() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_HeaderRunningDate());
    	chequeBookRequestObj.chequeBookRequest_HeaderRunningDate().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField());
    	chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
    	LocalDate date = LocalDate.now();
    	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");
    	String systemDate=date.format(dateFormatter);
//    	excelData.updateTestData(dataSetID, "SystemDate", systemDate);
//		testData = excelData.getTestdata(dataSetID);
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField());
    	chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField().sendKeys(systemDate);
//    	chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField().sendKeys(testData.get("SystemDate"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_UserRunningDateCalendarUseButton());
    	chequeBookRequestObj.chequeBookRequest_UserRunningDateCalendarUseButton().click();
    	for (int i = 0; i <= 50; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_CalendarHolidayConfirmPopup().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_CalendarSuccessfullyPopup());
    	chequeBookRequestObj.chequeBookRequest_CalendarSuccessfullyPopup().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_CalendarCloseButton());
    	chequeBookRequestObj.chequeBookRequest_CalendarCloseButton().click();
    }

    @Then("^user should login after 40 days$")
    public void user_should_login_after_40_days() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_HeaderRunningDate());
    	String appDate = chequeBookRequestObj.chequeBookRequest_HeaderRunningDate().getText();
    	System.out.println("User Running Date - "+appDate);
    	SimpleDateFormat parser = new SimpleDateFormat("dd MMM yyyy");
    	Date convertedDate = parser.parse(appDate);
    	System.out.println("Converted Date - "+convertedDate);
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    	String dateInNewFormat = formatter.format(convertedDate);
    	//----after 40 days date----//
    	LocalDate plus40days= LocalDate.parse(dateInNewFormat).plusDays(40);
    	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	String after40days = plus40days.format(formatter1);
    	System.out.println("After 40 days Date will be - "+after40days);
		//--------------------------//
		excelData.updateTestData(dataSetID, "AddedDate", after40days);
		testData = excelData.getTestdata(dataSetID);
    	
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_HeaderRunningDate());
    	for (int i = 0; i <= 50; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_HeaderRunningDate().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField());
    	chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
    
    	// getting system date - Method 1 ----------------//
//    	SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
//    	Date date = new Date();
//		System.out.println(formatter.format(date));
		//after 40 days 
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());
//		cal.add(Calendar.DATE, 40);
//		String output=formatter.format(cal.getTime());
//		System.out.println(output);
		// getting system date - Method 2 ----------------//
//		LocalDate date = LocalDate.now().plusDays(40);
//		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");
//		String after40Days=date.format(dateFormatter);
//		System.out.println("after 40 day - "+after40Days);
		
//		excelData.updateTestData(dataSetID, "AddedDate", after40Days);
//		testData = excelData.getTestdata(dataSetID);
		
		
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField());
    	chequeBookRequestObj.chequeBookRequest_UserRunningDateInputField().sendKeys(testData.get("AddedDate"));
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_UserRunningDateCalendarUseButton());
    	chequeBookRequestObj.chequeBookRequest_UserRunningDateCalendarUseButton().click();
    	for (int i = 0; i <= 50; i++) {
			try {
				chequeBookRequestObj.chequeBookRequest_CalendarHolidayConfirmPopup().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_CalendarSuccessfullyPopup());
    	chequeBookRequestObj.chequeBookRequest_CalendarSuccessfullyPopup().click();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_CalendarCloseButton());
    	chequeBookRequestObj.chequeBookRequest_CalendarCloseButton().click();
    }

    @Then("^navigate to bulk destroy screen$")
    public void navigate_to_bulk_destroy_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_BulkDestroy());
    	javascripthelper.scrollIntoView(chequeBookRequestObj.chequeBookRequest_BulkDestroy());
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_BulkDestroy());
    	chequeBookRequestObj.chequeBookRequest_BulkDestroy().click();
    }

    @Then("^click on retrieve button$")
    public void click_on_retrieve_button() throws Throwable {
    	Thread.sleep(10000);
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_BulkDestroy_RetrieveKey());
		chequeBookRequestObj.chequeBookRequest_BulkDestroy_RetrieveKey().click();
		waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_BulkDestroy_FirstRecordRow());
    }

    @Then("^verify system will show all chequebooks having the approve status for 40 days and above$")
    public void verify_system_will_show_all_chequebooks_having_the_approve_status_for_40_days_and_above() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")).isDisplayed();
    }
    
    //157/////////////////////////////////////////////////////////////////////////////////////////////
    //158/////////////////////////////////////////////////////////////////////////////////////////////
    //159/////////////////////////////////////////////////////////////////////////////////////////////
    
    

    @Then("^user should select all rows$")
    public void user_should_select_all_rows() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_FirstRecordRow()).isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows());
    	chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows().click();
    }

    @Then("^verify system will select all rows$")
    public void verify_system_will_select_all_rows() throws Throwable {
//    	List<WebElement> elements = driver.findElements(By.xpath("//table[@id='chequeBookBulkDestroyGridTbl_Id_Q000BAD']/tbody/tr[@aria-selected='false']"));
    	List<WebElement> elements = driver.findElements(By.xpath("//table[@id='chequeBookBulkDestroyGridTbl_Id_Q000BAD']/tbody/tr[1]/following-sibling::tr"));
    	for (WebElement webElement : elements) {
    		boolean status = webElement.getAttribute("aria-selected").equalsIgnoreCase("true");
    		Assert.assertTrue("No rows are selected",status);
		}
    }
    
    //160/////////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^user should select new checkbox$")
    public void user_should_select_new_checkbox() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']/../td/input")));
    	driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']/../td/input")).click();
        
    }

    @Then("^user should select all chequebook$")
    public void user_should_select_all_chequebook() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows());
    	chequeBookRequestObj.chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows().click();
    }
    
    @Then("^user should invoke destroy button$")
    public void user_should_invoke_destroy_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_BulkDestroy_ToDestroyButton());
    	chequeBookRequestObj.chequeBookRequest_BulkDestroy_ToDestroyButton().click();
    	try {
			waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_WarningPopup());
			chequeBookRequestObj.chequeBookRequest_WarningPopup().click();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @Then("^verify status will be To be destroy for all rows$")
    public void verify_status_will_be_to_be_destroy_for_all_rows() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code1"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	try {
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().isDisplayed();
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status());
    	boolean status = chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status().getAttribute("value").equalsIgnoreCase("To be Destroyed");
    	Assert.assertTrue(status);
    }
    
    //163/////////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^user should select a specific row$")
    public void user_should_select_a_specific_row() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code1")+"']/../td/input")));
    	driver.findElement(By.xpath("//td[text()='"+testData.get("Code1")+"']/../td/input")).click();
        driver.findElement(By.xpath("//td[text()='"+testData.get("Code2")+"']/../td/input")).click();
        driver.findElement(By.xpath("//td[text()='"+testData.get("Code3")+"']/../td/input")).click();
    }
    
    @Then("^user should fill the remark field$")
    public void user_should_fill_the_remark_field() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_BulkDestroy_Remarks());
    	chequeBookRequestObj.chequeBookRequest_BulkDestroy_Remarks().sendKeys(testData.get("Remarks"));
    }
    
    @Then("^user should click on To Destroy button$")
    public void user_should_click_on_to_destroy_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_BulkDestroy_ToDestroyButton());
    	chequeBookRequestObj.chequeBookRequest_BulkDestroy_ToDestroyButton().click();
    }
    
    @Then("^verify the selected chequebook status will be To be destroyed$")
    public void verify_the_selected_chequebook_status_will_be_to_be_destroyed() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code1"));
    	chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//td[text()='"+testData.get("Code1")+"']")));
    	WebElement record = driver.findElement(By.xpath("//td[text()='"+testData.get("Code1")+"']"));
    	clicksAndActionsHelper.doubleClick(record);
    	try {
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().isDisplayed();
    		chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status());
    	boolean status = chequeBookRequestObj.chequeBookRequest_ToBeReversed_Status().getAttribute("value").equalsIgnoreCase("To be Destroyed");
    	Assert.assertTrue(status);
    }
    
    @Then("^retrieve the saved chequebook request code2 in maintenance screen$")
    public void retrieve_the_saved_chequebook_request_code2_in_maintenance_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_SubMenu_Code());
    	chequeBookRequestObj.chequeBookRequest_SubMenu_Code().sendKeys(testData.get("Code2"));
    	for (int i = 0; i <=200; i++) {
    		try {
    			chequeBookRequestObj.chequeBookRequest_SubMenu_StatusDesc().sendKeys(Keys.ENTER);
    			break;
    		} catch (Exception e) {
    			// TODO: handle exception
    			if(i==200) {
    				Assert.fail(e.getMessage());
    			}
    		}
    	}
    	for (int i = 0; i <=200; i++) {
    		try {
    			WebElement record = driver.findElement(By.xpath("//td[text()='" + testData.get("Code2") + "']"));
    			clicksAndActionsHelper.doubleClick(record);
    			break;
    		} catch (Exception e) {
    			// TODO: handle exception
    			if(i==200) {
    				Assert.fail(e.getMessage());
    			}
    		}
    	}
    	
    	waithelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton());
    	chequeBookRequestObj.chequeBookRequest_ViewMemoCloseButton().click();
    }
    
    //157/////////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^open the alert to invoke destroy$")
    public void open_the_alert_to_invoke_destroy() throws Throwable {
       
    }

    @Then("^select the row to destoy$")
    public void select_the_row_to_destoy() throws Throwable {
       
    }

    @Then("^branch manager should invoke destroy$")
    public void branch_manager_should_invoke_destroy() throws Throwable {
       
    }
    
    //1/////////////////////////////////////////////////////////////////////////////////////////////
    //1/////////////////////////////////////////////////////////////////////////////////////////////
    
    ///////////////////////////////////////////////////////////////////////////////////////////////
    //        					D A T A      S E T     I D'S
    ///////////////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^select data set ID to check user is able to reactivate chequebook$")
    public void select_data_set_id_to_check_user_is_able_to_reactivate_chequebook() throws Throwable {
    	dataSetID = "CHB_021_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check user is able to reverse chequebook$")
    public void select_data_set_id_to_check_user_is_able_to_reverse_chequebook() throws Throwable {
    	dataSetID = "CHB_022_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check BM user is able to approve a record under chequebook request$")
    public void select_data_set_id_to_check_bm_user_is_able_to_approve_a_record_under_chequebook_request() throws Throwable {
    	dataSetID = "CHB_023_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check BM user is able to submit a chequebook$")
    public void select_data_set_id_to_check_bm_user_is_able_to_submit_a_chequebook() throws Throwable {
    	dataSetID = "CHB_024_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check BM user is able to cancel a chequebook$")
    public void select_data_set_id_to_check_bm_user_is_able_to_cancel_a_chequebook() throws Throwable {
    	dataSetID = "CHB_025_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check BM user is able to destroy a chequebook$")
    public void select_data_set_id_to_check_bm_user_is_able_to_destroy_a_chequebook() throws Throwable {
    	dataSetID = "CHB_026_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check BM user is able to suspend a chequebook$")
    public void select_data_set_id_to_check_bm_user_is_able_to_suspend_a_chequebook() throws Throwable {
    	dataSetID = "CHB_027_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check for Current System Behavior when Allow auto approve is checked$")
    public void select_data_set_id_to_check_for_current_system_behavior_when_allow_auto_approve_is_checked() throws Throwable {
    	dataSetID = "CHB_055_02_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check for Current System Behavior when Auto Submit upon Approve is checked$")
    public void select_data_set_id_to_check_for_current_system_behavior_when_auto_submit_upon_approve_is_checked() throws Throwable {
    	dataSetID = "CHB_057_02_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check for Current System Behavior when Allow Auto Submit and auto submit upon approval is checked$")
    public void select_data_set_id_to_check_for_current_system_behavior_when_allow_auto_submit_and_auto_submit_upon_approval_is_checked() throws Throwable {
    	dataSetID = "CHB_058_02_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check for Current System Behavior when Allow Auto Submit is checked$")
    public void select_data_set_id_to_check_for_current_system_behavior_when_allow_auto_submit_is_checked() throws Throwable {
    	dataSetID = "CHB_059_02_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check for Current System Behaviors is unchecked$")
    public void select_data_set_id_to_check_for_current_system_behaviors_is_unchecked() throws Throwable {
    	dataSetID = "CHB_060_02_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID to check if system is defaulting Deleted sequences$")
    public void select_data_set_id_to_check_if_system_is_defaulting_deleted_sequences() throws Throwable {
    	dataSetID = "CHB_075_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for checking if the system is retrieving only approved chequebook under To Be Reversed Screen$")
    public void select_data_set_id_for_checking_if_the_system_is_retrieving_only_approved_chequebook_under_to_be_reversed_screen() throws Throwable {
    	dataSetID = "CHB_095_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for checking if chequebooks with status received are only shown under Send to Branch Screen$")
    public void select_data_set_id_for_checking_if_chequebooks_with_status_received_are_only_shown_under_send_to_branch_screen(String strArg1) throws Throwable {
    	dataSetID = "CHB_096_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for checking if the user is able to create chequebook without InHouse Charges$")
    public void select_data_set_id_for_checking_if_the_user_is_able_to_create_chequebook_without_inhouse_charges() throws Throwable {
    	dataSetID = "CHB_097_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID checking if the system is creating same sequence for other chequebook if the uniqueness is set to company$")
    public void select_data_set_id_checking_if_the_system_is_creating_same_sequence_for_other_chequebook_if_the_uniqueness_is_set_to_company() throws Throwable {
    	dataSetID = "CHB_098_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID checking if the system is creating same sequence for other chequebook if the uniqueness is set to branch$")
    public void select_data_set_id_checking_if_the_system_is_creating_same_sequence_for_other_chequebook_if_the_uniqueness_is_set_to_branch() throws Throwable {
    	dataSetID = "CHB_099_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for checking if the destroy charges are deducted after destroying multi chequebook$")
    public void select_data_set_id_for_checking_if_the_destroy_charges_are_deducted_after_destroying_multi_chequebook() throws Throwable {
    	dataSetID = "CHB_155_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for Checking if the inputted Bulk Destroy Period is applicable on retrieved cheques$")
    public void select_data_set_id_for_checking_if_the_inputted_bulk_destroy_period_is_applicable_on_retrieved_cheques() throws Throwable {
    	dataSetID = "CHB_156_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for checking if the user is able to destroy by alert$")
    public void select_data_set_id_for_checking_if_the_user_is_able_to_destroy_by_alert() throws Throwable {
    	dataSetID = "CHB_157_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for checking if the user is able to reject destroy by alert$")
    public void select_data_set_id_for_checking_if_the_user_is_able_to_reject_destroy_by_alert() throws Throwable {
    	dataSetID = "CHB_158_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for Checking if the user is able to select all rows$")
    public void select_data_set_id_for_checking_if_the_user_is_able_to_select_all_rows() throws Throwable {
    	dataSetID = "CHB_159_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for Checking if the user is able to select all rows with the new checkbox column checked$")
    public void select_data_set_id_for_checking_if_the_user_is_able_to_select_all_rows_with_the_new_checkbox_column_checked() throws Throwable {
    	dataSetID = "CHB_160_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for Checking if the user is able to select any row and click To Destroy$")
    public void select_data_set_id_for_checking_if_the_user_is_able_to_select_any_row_and_click_to_destroy() throws Throwable {
    	dataSetID = "CHB_163_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
}