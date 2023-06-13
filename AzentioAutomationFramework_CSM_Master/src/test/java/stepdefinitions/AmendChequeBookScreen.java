package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.AmendChequebookOBJ;
import resources.BaseClass;

public class AmendChequeBookScreen extends BaseClass {
	WebDriver driver = BaseClass.driver;
	AmendChequebookOBJ amendChequeBookObj = new AmendChequebookOBJ(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	@Given("^User Launch CSM Core Application$")
    public void user_launch_csm_core_application() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplication();
		
    }
	
    @Then("^User Verify the system is changing the chequebook status from submitted to apply to submit$")
    public void user_verify_the_system_is_changing_the_chequebook_status_from_submitted_to_apply_to_submit() throws Throwable {
    	String xpath ="//table[@id='chequeBookQueryTbl_Id_Q000QR']//td[text()='"+805+"']/parent::tr//td[text()='Apply To Submit']";
    	for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^User Click Amend Cheque book Menu$")
    public void user_click_amend_cheque_book_menu() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.AmendChequeCardMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.AmendChequeCardMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.AmendChequeCardMenu());
    }

    @And("^User Click Maintanence sub menu$")
    public void user_click_maintanence_sub_menu() throws Throwable {
    	 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.MaintenanceIcon());
    	 seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.MaintenanceIcon());
         seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.MaintenanceIcon());
    }

    @And("^User Select the Product type$")
    public void user_select_the_product_type() throws Throwable {
    	 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.productType());
         seleniumActions.getDropDownHelper().SelectUsingVisibleText(amendChequeBookObj.productType(),"Chequebook");
    }

    @And("^User Enter the Request Number in Amend Cheque Maintanence screen$")
    public void user_enter_the_request_number_in_amend_cheque_maintanence_screen() throws Throwable {
    	 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.chequeRequestNo());
    	 seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeRequestNo());
         seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeRequestNo());
         amendChequeBookObj.chequeRequestNo().sendKeys("205");
    }

    @And("^User Click Retrieve button$")
    public void user_click_retrieve_button() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.retrieve());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.retrieve());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.retrieve());
    }

    @And("^User Click the Checkbox for retrieved record$")
    public void user_click_the_checkbox_for_retrieved_record() throws Throwable {
        String xpath = "//td[text()='"+694+"']/parent::tr//input";
        for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^User click the Update button$")
    public void user_click_the_update_button() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.updateAmend());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.updateAmend());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.updateAmend());
    }

    @And("^User Confirm Save Record$")
    public void user_confirm_save_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.confirmSaveRecord());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.confirmSaveRecord());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.confirmSaveRecord());
    }

    @And("^User Success Ok pop up message$")
    public void user_success_ok_pop_up_message() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.recordSavedSuccessfully());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.recordSavedSuccessfully());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.recordSavedSuccessfully());
    }

    @And("^User Click Chequebook Request Menu$")
    public void user_click_chequebook_request_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequebookRequestModule());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequebookRequestModule());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequebookRequestModule());
    }

    @And("^User Click Chequebook Query Sub Menu$")
    public void user_click_chequebook_query_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequebookQuerySubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequebookQuerySubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequebookQuerySubMenu());
    }

    @And("^User Enter Branch Code in Chequebook Query Screen$")
    public void user_enter_branch_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.branchCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.branchCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.branchCodeInChequeBookQuery());
		amendChequeBookObj.branchCodeInChequeBookQuery().sendKeys("0001");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
    }

    @And("^User Enter Currency Code in Chequebook Query Screen$")
    public void user_enter_currency_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.currencyCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.currencyCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.currencyCodeInChequeBookQuery());
		amendChequeBookObj.currencyCodeInChequeBookQuery().sendKeys("840");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		
    }

    @And("^User Enter GL Code in Chequebook Query Screen$")
    public void user_enter_gl_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.glCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.glCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.glCodeInChequeBookQuery());
		amendChequeBookObj.glCodeInChequeBookQuery().sendKeys("150150");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
    }

    @And("^User Enter CIF Code in Chequebook Query Screen$")
    public void user_enter_cif_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.cifCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.cifCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.cifCodeInChequeBookQuery());
		amendChequeBookObj.cifCodeInChequeBookQuery().sendKeys("993437");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
    }

    @And("^User Enter Serial no in Chequebook Query Screen$")
    public void user_enter_serial_no_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.serialNoInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.serialNoInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.serialNoInChequeBookQuery());
		amendChequeBookObj.serialNoInChequeBookQuery().sendKeys("000");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
    }
    @And("^User Enter Cheque book search code in Chequebook Query Screen$")
    public void user_enter_cheque_book_search_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequebookCodeInCheckbooQueryScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequebookCodeInCheckbooQueryScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequebookCodeInCheckbooQueryScreen());
		amendChequeBookObj.chequebookCodeInCheckbooQueryScreen().sendKeys("805");
		amendChequeBookObj.chequebookCodeInCheckbooQueryScreen().sendKeys(Keys.ENTER);
    }


    
}
