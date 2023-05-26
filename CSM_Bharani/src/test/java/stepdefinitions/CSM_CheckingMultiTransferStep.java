package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
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
	WaitHelper waitHelper = new WaitHelper(driver);
	
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
	
	
	
	
	
	
}
