package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_CheckingMultiTransfer;
import resources.BaseClass;

public class CSM_CheckingMultiTransferStep {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	CSM_CheckingMultiTransfer checkingMultiTransferObj = new CSM_CheckingMultiTransfer(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	@And("^User Click on Date to Change the Current Date$")
    public void user_click_on_date_to_change_the_current_date() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,checkingMultiTransferObj.CSMDateToChangeTheCurrentDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(checkingMultiTransferObj.CSMDateToChangeTheCurrentDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(checkingMultiTransferObj.CSMDateToChangeTheCurrentDate());
    }

    @And("^User Enter the Date in User Running Date$")
    public void user_enter_the_date_in_user_running_date() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,checkingMultiTransferObj.CSMDateInUserRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(checkingMultiTransferObj.CSMDateInUserRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(checkingMultiTransferObj.CSMDateInUserRunningDate());
        checkingMultiTransferObj.CSMDateInUserRunningDate().clear();
        //checkingMultiTransferObj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        checkingMultiTransferObj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
    }

    @And("^User Click on Use Button in Change Running Date Popup$")
    public void user_click_on_use_button_in_change_running_date_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,checkingMultiTransferObj.CSMUseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(checkingMultiTransferObj.CSMUseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(checkingMultiTransferObj.CSMUseButtonInChangeRunningDate());
    }

    @And("^User Click Ok Button in Information PopUp menu$")
    public void user_click_ok_button_in_information_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,checkingMultiTransferObj.CSMOkButtonUnderInformationPopUp());
        seleniumActions.getClickAndActionsHelper().moveToElement(checkingMultiTransferObj.CSMOkButtonUnderInformationPopUp());
        seleniumActions.getClickAndActionsHelper().clickOnElement(checkingMultiTransferObj.CSMOkButtonUnderInformationPopUp());
    }

    @And("^User Click on Close Button in Change Running Date Popup$")
    public void user_click_on_close_button_in_change_running_date_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,checkingMultiTransferObj.CSMCloseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(checkingMultiTransferObj.CSMCloseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(checkingMultiTransferObj.CSMCloseButtonInChangeRunningDate());
    }

    @And("^User Click on Technical Details Icon$")
    public void user_click_on_technical_details_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,checkingMultiTransferObj.CSMTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(checkingMultiTransferObj.CSMTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().clickOnElement(checkingMultiTransferObj.CSMTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Clear Cache in Technical Details Icon$")
    public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,checkingMultiTransferObj.CSM_ClearCacheInTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(checkingMultiTransferObj.CSM_ClearCacheInTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().clickOnElement(checkingMultiTransferObj.CSM_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Ok Button Under Information PopUp Menu$")
    public void user_click_ok_button_under_information_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,checkingMultiTransferObj.CSMOkButtonUnderInformationPopUp());
        seleniumActions.getClickAndActionsHelper().moveToElement(checkingMultiTransferObj.CSMOkButtonUnderInformationPopUp());
        seleniumActions.getClickAndActionsHelper().clickOnElement(checkingMultiTransferObj.CSMOkButtonUnderInformationPopUp());
    }
	@And("^Click the Transactions flag$")
    public void click_the_transactions_flag() throws Throwable {
    waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.Core_TransactionsFlag());
    clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.Core_TransactionsFlag());
    checkingMultiTransferObj.Core_TransactionsFlag().click();
	}
	@Then("^Click the Maintenance flag on the Transaction$")
    public void click_the_maintenance_flag_on_the_transaction() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.Transactions_Maintenance());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.Transactions_Maintenance());
		checkingMultiTransferObj.Transactions_Maintenance().click();
	}
	@And("^Enter the code in TRXTypeBox in Maintenance flag$")
    public void enter_the_code_in_trxtypebox_in_maintenance_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.Maintenance_TRXTypeBox());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.Maintenance_TRXTypeBox());
		checkingMultiTransferObj.Maintenance_TRXTypeBox().click();
		checkingMultiTransferObj.Maintenance_TRXTypeBox().sendKeys("587");
		checkingMultiTransferObj.Maintenance_TRXTypeBox().sendKeys(Keys.ENTER);
		checkingMultiTransferObj.Maintenance_TRXTypeBox().sendKeys(Keys.TAB);
	}
	 @Then("^Enter the Branch code in Branch code Maintenance flag$")
	    public void enter_the_branch_code_in_branch_code_maintenance_flag() throws Throwable {
	    waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.TRXType_BranchCode());
	    clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.TRXType_BranchCode());
	    checkingMultiTransferObj.TRXType_BranchCode().click();
	    checkingMultiTransferObj.TRXType_BranchCode().sendKeys("0001");
	    checkingMultiTransferObj.TRXType_BranchCode().sendKeys(Keys.TAB);
	}

	@And("^Enter the Currency code in Maintenance flag$")
	public void enter_the_currency_code_in_maintenance_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.TRXType_CurrencyCode());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.TRXType_CurrencyCode());
		checkingMultiTransferObj.TRXType_CurrencyCode().click();
		checkingMultiTransferObj.TRXType_CurrencyCode().sendKeys("840");
		checkingMultiTransferObj.TRXType_CurrencyCode().sendKeys(Keys.TAB);
	}

	@Then("^Enter the Gl code in Maintenance flag$")
	public void enter_the_gl_code_in_maintenance_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.TRXType_CurrencyCode());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.TRXType_GLCode());
		checkingMultiTransferObj.TRXType_GLCode().click();
		checkingMultiTransferObj.TRXType_GLCode().sendKeys("100100");
		checkingMultiTransferObj.TRXType_GLCode().sendKeys(Keys.TAB);
	}

	@And("^Enter the Cif code in Maintenance flag$")
	public void enter_the_cif_code_in_maintenance_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.TRXType_CifCode());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.TRXType_CifCode());
		checkingMultiTransferObj.TRXType_CifCode().click();
		checkingMultiTransferObj.TRXType_CifCode().sendKeys("1158");
		checkingMultiTransferObj.TRXType_CifCode().sendKeys(Keys.TAB);
	}

	@Then("^Click the Ok popup$")
	public void click_the_ok_popup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.Ok_Popup());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.Ok_Popup());
		checkingMultiTransferObj.Ok_Popup().click();
	}

	@And("^Click the Close popup$")
	public void click_the_close_popup() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.Close_Popup());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.Close_Popup());
		checkingMultiTransferObj.Close_Popup().click();
	}
	@Then("^Enter the serial number in Maintenance flag$")
    public void enter_the_serial_number_in_maintenance_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.TRXTypeSerial_No());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.TRXTypeSerial_No());
		checkingMultiTransferObj.TRXTypeSerial_No().click();
		checkingMultiTransferObj.TRXTypeSerial_No().sendKeys("0");
		checkingMultiTransferObj.TRXTypeSerial_No().sendKeys(Keys.TAB);	
    }
	
	@And("^Enter the currency code flag$")
    public void enter_the_currency_code_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.CurrencyCode_Flag());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.CurrencyCode_Flag());
		checkingMultiTransferObj.CurrencyCode_Flag().click();
		checkingMultiTransferObj.CurrencyCode_Flag().sendKeys("840");
		checkingMultiTransferObj.CurrencyCode_Flag().sendKeys(Keys.TAB);		
    }
	@Then("^Enter the debit amount in Maintenance flag$")
    public void enter_the_debit_amount_in_maintenance_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.Debit_Amount());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.Debit_Amount());
		checkingMultiTransferObj.Debit_Amount().click();
		checkingMultiTransferObj.Debit_Amount().sendKeys("50");
		checkingMultiTransferObj.Debit_Amount().sendKeys(Keys.TAB);
    }
	@And("^Click the Account details flag$")
    public void click_the_account_details_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.Account_DetailsIcon());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.Account_DetailsIcon());
		checkingMultiTransferObj.Account_DetailsIcon().click();
    }
	@Then("^Click the Add account details icon$")
    public void click_the_add_account_details_icon() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.AddIcon_AccountDetails());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.AddIcon_AccountDetails());
		checkingMultiTransferObj.AddIcon_AccountDetails().click();	
    }
	@And("^Click the first row to add the account details$")
    public void click_the_first_row_to_add_the_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.First_RowClick());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.First_RowClick());
		checkingMultiTransferObj.First_RowClick().click();	
    }
	@Then("^Enter the branch code in account details$")
    public void enter_the_branch_code_in_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.BranchCode_AccountDetails());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.BranchCode_AccountDetails());
		checkingMultiTransferObj.BranchCode_AccountDetails().click();
		checkingMultiTransferObj.BranchCode_AccountDetails().sendKeys("1");
		checkingMultiTransferObj.BranchCode_AccountDetails().sendKeys(Keys.TAB);	
    }
	@And("^Enter the GL code in account details$")
    public void enter_the_gl_code_in_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.GLCode_AccountDetails());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.GLCode_AccountDetails());
		checkingMultiTransferObj.GLCode_AccountDetails().click();
		checkingMultiTransferObj.GLCode_AccountDetails().sendKeys("2299");
		checkingMultiTransferObj.GLCode_AccountDetails().sendKeys(Keys.TAB); 
		}
	@Then("^Enter the Cif code in account details$")
    public void enter_the_cif_code_in_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.CIFCode_AccountDetails());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.CIFCode_AccountDetails());
		checkingMultiTransferObj.CIFCode_AccountDetails().click();
		checkingMultiTransferObj.CIFCode_AccountDetails().sendKeys("993594");
		checkingMultiTransferObj.CIFCode_AccountDetails().sendKeys(Keys.TAB); 
    }
	@And("^Enter the serial number in account details$")
    public void enter_the_serial_number_in_account_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.SerialNumber_AccountDetails());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.SerialNumber_AccountDetails());
		checkingMultiTransferObj.SerialNumber_AccountDetails().click();
		checkingMultiTransferObj.SerialNumber_AccountDetails().sendKeys("0");
		checkingMultiTransferObj.SerialNumber_AccountDetails().sendKeys(Keys.TAB);	
    }
	@And("^Enter the debit amount for first account$")
    public void enter_the_debit_amount_for_first_account() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, checkingMultiTransferObj.FirstAmount_AccountDetails());
		clicksAndActionsHelper.moveToElement(checkingMultiTransferObj.FirstAmount_AccountDetails());
		checkingMultiTransferObj.FirstAmount_AccountDetails().click();
		checkingMultiTransferObj.FirstAmount_AccountDetails().sendKeys("25");
		checkingMultiTransferObj.FirstAmount_AccountDetails().sendKeys(Keys.TAB);
		
    }
	
	 
	 
}
