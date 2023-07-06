package stepdefinitions;

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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_SaveAccountCIF_GLtoGLObj;
import resources.BaseClass;

public class CSM_SaveAccountCIF_GLtoGL {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	CSM_SaveAccountCIF_GLtoGLObj saveAccountCIFGLtoGL = new CSM_SaveAccountCIF_GLtoGLObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
    ExcelData csmTransactionsExcelData = new ExcelData(path, "SaveAccountCIF_GLtoGL", "Data Set ID");
    Map<String, String> testData;
    
    @Given("User_604 date test data for test case number CSM_024")
    public void User_604_date_test_data_for_test_case_number_CSM_024() {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TA_024");
    }
    @Given("User_604 date test data for test case number CSM_025")
    public void User_604_date_test_data_for_test_case_number_CSM_025() {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TA_025");
    }
    
    @Given("User_604 Click the transfer accounts flag")
    public void user_click_the_transfer_accounts_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.TransferAccount_Flag());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.TransferAccount_Flag());
		saveAccountCIFGLtoGL.TransferAccount_Flag().click();
    }

    @Then("User_604 Click the Maintenance flag under transfer acccounts flag")
    public void user_click_the_maintenance_flag_under_transfer_acccounts_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.MaintenanceFlag_Flag());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.MaintenanceFlag_Flag());
		saveAccountCIFGLtoGL.MaintenanceFlag_Flag().click();
    }

    @Then("User_604 Click the Transfer type option to select the type")
    public void user_click_the_transfer_type_option_to_select_the_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.TransferType_Select());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.TransferType_Select());
		dropDownHelper.SelectUsingVisibleText(saveAccountCIFGLtoGL.TransferType_Select(),testData.get("Transfer Type"));
	}
    

    @Then("User_604 Click the By CIF in ranges definition")
    public void user_click_the_by_cif_in_ranges_definition() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.RangeDefinition_ByCIF());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.RangeDefinition_ByCIF());
		saveAccountCIFGLtoGL.RangeDefinition_ByCIF().click();
    }

    @Then("User_604 Enter the CIF code in the CIF box")
    public void user_enter_the_cif_code_in_the_cif_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.CIFType_Enter());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.CIFType_Enter());
		saveAccountCIFGLtoGL.CIFType_Enter().click();
		saveAccountCIFGLtoGL.CIFType_Enter().sendKeys(testData.get("CIF enter"));
		saveAccountCIFGLtoGL.CIFType_Enter().sendKeys(Keys.TAB);
    }

    @Then("User_604 Enter the Original GL code in the GL box")
    public void user_enter_the_original_gl_code_in_the_gl_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.OriginalGL_Enter());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.OriginalGL_Enter());
		saveAccountCIFGLtoGL.OriginalGL_Enter().click();
		saveAccountCIFGLtoGL.OriginalGL_Enter().sendKeys(testData.get("Original GL"));
		saveAccountCIFGLtoGL.OriginalGL_Enter().sendKeys(Keys.TAB);
    }

    @Then("User_604 Enter the destination GL in the GL box")
    public void user_enter_the_destination_gl_in_the_gl_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.DestinationGL_Enter());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.DestinationGL_Enter());
		saveAccountCIFGLtoGL.DestinationGL_Enter().click();
		saveAccountCIFGLtoGL.DestinationGL_Enter().sendKeys(testData.get("Destination GL"));
		saveAccountCIFGLtoGL.DestinationGL_Enter().sendKeys(Keys.TAB);
    }

    @Then("User_604 Enter the reason code in the reason box")
    public void user_enter_the_reason_code_in_the_reason_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.Reason_Code());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.Reason_Code());
		saveAccountCIFGLtoGL.Reason_Code().click();
		saveAccountCIFGLtoGL.Reason_Code().sendKeys(testData.get("REASON"));
		saveAccountCIFGLtoGL.Reason_Code().sendKeys(Keys.TAB);
    }

    @Then("User_604 Click the retrive button to show the records")
    public void user_click_the_retrive_button_to_show_the_records() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.Retirbe_Icon());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.Retirbe_Icon());
		saveAccountCIFGLtoGL.Retirbe_Icon().click();
		
    }
    
    

    @Then("User_604 Click the save button to save the retirved records")
    public void user_click_the_save_button_to_save_the_retirved_records() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.SaveButton_Retrieve());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.SaveButton_Retrieve());
		saveAccountCIFGLtoGL.SaveButton_Retrieve().click();
		Thread.sleep(5000);
		try {
			for (int i = 0; i < 700; i++) {
				if (saveAccountCIFGLtoGL.CSM_serverloadingPopup().isDisplayed()) {
					saveAccountCIFGLtoGL.CSM_serverloadingPopup().click();
					saveAccountCIFGLtoGL.SaveButton_Retrieve().click();
					break;
				}
			}
			
		} catch (Exception e) {
			
		}
    }
    
    @Given("User_604 Click the Approve Flag")
    public void user_click_the_approve_flag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.Approve_Flag());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.Approve_Flag());
		saveAccountCIFGLtoGL.Approve_Flag().click();
    }

    @Then("User_604 Click the Destination GL Grid to enter the GL")
    public void user_click_the_destination_gl_grid_to_enter_the_gl() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.ApproveDestination_GLGrid());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.ApproveDestination_GLGrid());
		saveAccountCIFGLtoGL.ApproveDestination_GLGrid().click();
		saveAccountCIFGLtoGL.ApproveDestination_GLGrid().sendKeys(testData.get("Destination GL"));
		saveAccountCIFGLtoGL.ApproveDestination_GLGrid().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
    }

    @Then("User_604 Select the First record of the destination GL for reject")
    public void user_select_the_first_record_of_the_destination_gl_for_reject() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.DestinationGL_Select());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.DestinationGL_Select());
		clicksAndActionsHelper.doubleClick(saveAccountCIFGLtoGL.DestinationGL_Select());
    }

    @Then("User_604 Click the reject icon for reject the selected GL")
    public void user_click_the_reject_icon_for_reject_the_selected_gl() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.Reject_Icon());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.Reject_Icon());
		saveAccountCIFGLtoGL.Reject_Icon().click();
    }
    
    @Then("User_604 Click the By GL in ranges definition")
    public void user_click_the_by_gl_in_ranges_definition() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, saveAccountCIFGLtoGL.RangeDefinitionBy_GL());
		clicksAndActionsHelper.moveToElement(saveAccountCIFGLtoGL.RangeDefinitionBy_GL());
		saveAccountCIFGLtoGL.RangeDefinitionBy_GL().click();
    }

}