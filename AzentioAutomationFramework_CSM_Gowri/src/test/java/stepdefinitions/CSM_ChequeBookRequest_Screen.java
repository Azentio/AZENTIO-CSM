package stepdefinitions;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pageobjects.CSM_ChequeBook_Request_All_OBJ;
import pageobjects.CSM_Passbook_OBJ;
import resources.BaseClass;

public class CSM_ChequeBookRequest_Screen extends BaseClass{
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_ChequeBook_Request_All_OBJ ChequeBookRequestObject = new CSM_ChequeBook_Request_All_OBJ(driver);
    String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData csmChequeBookRequestExcelData = new ExcelData(path,"CSM_Chequebook","Data Set ID");
	Map<String, String> testData;
	
	
   @Given("^user login as csm application$")
    public void user_login_as_csm_application() throws Throwable {
		String csmApplicationUrl = configFileReader.getCSMApplicationUrl();
	    driver.get(csmApplicationUrl);
	    login.loginIntoCSMApplication();
	}
    
    @Then("^user click the proceed button under receive from provider$")
    public void user_click_the_proceed_button_under_receive_from_provider() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.ProceedButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.ProceedButton());
        ChequeBookRequestObject.ProceedButton().click();
    }
    
    @Then("^user validate the send to provider status record present in the maintenance screen under chequebook request$")
    public void user_validate_the_send_to_provider_status_record_present_in_the_maintenance_screen_under_chequebook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.sendToProviderValidateMessage());
    	Assert.assertTrue(ChequeBookRequestObject.sendToProviderValidateMessage().isDisplayed());
    }

    @Then("^user validate the status record present in the maintenance screen under chequebook request$")
    public void user_validate_the_status_record_present_in_the_maintenance_screen_under_chequebook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.ValidateMessage());
    	Assert.assertTrue(ChequeBookRequestObject.ValidateMessage().isDisplayed());
    }

    @And("^user click the chequebook request screen$")
    public void user_click_the_chequebook_request_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.ChequeBookRequest());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.ChequeBookRequest());
        ChequeBookRequestObject.ChequeBookRequest().click();
    }

    @And("^user click the send to/receive from provider screen$")
    public void user_click_the_send_toreceive_from_provider_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.ReceiveFromProviderSelect());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.ReceiveFromProviderSelect());
        ChequeBookRequestObject.ReceiveFromProviderSelect().click();
    }
    
    @And("^user search chequebook code in send to provider screen$")
    public void user_search_chequebook_code_in_send_to_provider_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.searchChequeBookCodeInSendToProviderScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.searchChequeBookCodeInSendToProviderScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.searchChequeBookCodeInSendToProviderScreen());
        ChequeBookRequestObject.searchChequeBookCodeInSendToProviderScreen().sendKeys(testData.get("Sent to provider Cheque Code"));
        ChequeBookRequestObject.searchChequeBookCodeInSendToProviderScreen().sendKeys(Keys.ENTER);
    }
   

    @And("^user click the send to provider$")
    public void user_click_the_send_to_provider() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.sendToProviderSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.sendToProviderSubMenu());
        ChequeBookRequestObject.sendToProviderSubMenu().click();
    }


    @And("^user click the receive from provider$")
    public void user_click_the_receive_from_provider() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.ReceiveFromProviderButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.ReceiveFromProviderButton());
        ChequeBookRequestObject.ReceiveFromProviderButton().click();
    }

    @And("^user select the batch no under receive from provider$")
    public void user_select_the_batch_no_under_receive_from_provider() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.BatchNoSelect());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.BatchNoSelect());
        seleniumActions.getDropDownHelper().SelectUsingVisibleText(ChequeBookRequestObject.BatchNoSelect(), "2020-01-01-");
    }
    
    @And("^user click the check box under send to provider$")
    public void user_click_the_check_box_under_send_to_provider() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.SelectCheckBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.SelectCheckBox());
        ChequeBookRequestObject.SelectCheckBox().click();
    }
    
    @Then("^user click the proceed button under send to provider$")
    public void user_click_the_proceed_button_under_send_to_provider() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.proceedButtonInSendToProviderScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.proceedButtonInSendToProviderScreen());
        ChequeBookRequestObject.proceedButtonInSendToProviderScreen().click();
    }

    @And("^user click the check box under receive from provider$")
    public void user_click_the_check_box_under_receive_from_provider() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.SelectCheckBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.SelectCheckBox());
        ChequeBookRequestObject.SelectCheckBox().click();
    }

    @And("^user click the maintenance screen under chequebook request$")
    public void user_click_the_maintenance_screen_under_chequebook_request() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.MaintenanceButton());
		        ChequeBookRequestObject.MaintenanceButton().click();
		        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
    	
    }

    @And("^user click search icon under maintenance$")
    public void user_click_search_icon_under_maintenance() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.SearchIcon());
		        ChequeBookRequestObject.SearchIcon().click();
		        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
    	
    }

    @And("^user enter the cheque code under maintenance screen$")
    public void user_enter_the_cheque_code_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.ChequeBookCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.ChequeBookCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.ChequeBookCode());        
        ChequeBookRequestObject.ChequeBookCode().sendKeys(testData.get("Maintenance Cheque Code"));
        ChequeBookRequestObject.ChequeBookCode().sendKeys(Keys.ENTER);
    }
    
   
    
    
    //next test case - reactivate chequebook request
    
    @Then("^user verify the status approved present in the maintenace screen$")
    public void user_verify_the_status_approved_present_in_the_maintenace_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.validatePopup());
    	Assert.assertTrue(ChequeBookRequestObject.validatePopup().isDisplayed());
    }

    @And("^user click the to reactivate screen$")
    public void user_click_the_to_reactivate_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toReactivateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toReactivateScreen());
        ChequeBookRequestObject.toReactivateScreen().click();
    }

    @And("^user click the cheque code under to reactivate screen$")
    public void user_click_the_cheque_code_under_to_reactivate_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCode());
        ChequeBookRequestObject.chequeBookCode().click();
        ChequeBookRequestObject.chequeBookCode().sendKeys(testData.get("Reactivate Cheque Code"));
        ChequeBookRequestObject.chequeBookCode().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.chequeBookCode());
    }

    @And("^user click the to reactivate button$")
    public void user_click_the_to_reactivate_button() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toReactivateButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toReactivateButton());
        ChequeBookRequestObject.toReactivateButton().click();
    }

    @And("^user click the reactivate screen$")
    public void user_click_the_reactivate_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reactivateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reactivateScreen());
        ChequeBookRequestObject.reactivateScreen().click();
    }

    @And("^user enter the chequebook code under reactivate screen$")
    public void user_enter_the_chequebook_code_under_reactivate_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCode());
        ChequeBookRequestObject.chequeBookCode().click();
        ChequeBookRequestObject.chequeBookCode().sendKeys("470");
    }

    @And("^user click the reactivate button under reactivate screen$")
    public void user_click_the_reactivate_button_under_reactivate_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reactivateClickButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reactivateClickButton());
        ChequeBookRequestObject.reactivateClickButton().click();
    }

    
    @And("^user enter the chequebook code under maintenance screen$")
    public void user_enter_the_chequebook_code_under_maintenance_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeCode());
        ChequeBookRequestObject.chequeCode().click();
        ChequeBookRequestObject.chequeCode().sendKeys(testData.get("Maintenance Cheque Code"));
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.chequeCode());
    }
    
    
    //reverse chequebook
    @Then("^user click the ok button to validate the confirm message popup$")
    public void user_click_the_ok_button_to_validate_the_confirm_message_popup() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.confirmMessagePopup());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.confirmMessagePopup());
        Assert.assertTrue(ChequeBookRequestObject.confirmMessagePopup().isDisplayed());
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.clickOkButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.clickOkButton());
        ChequeBookRequestObject.clickOkButton().click();
        
    }

    @And("^user click the to be reversed chequebook screen$")
    public void user_click_the_to_be_reversed_chequebook_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toBeReversedChequeBook());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toBeReversedChequeBook());
        ChequeBookRequestObject.toBeReversedChequeBook().click();
    }

    @And("^user click the checkbook code in to be reversed chequebook screen$")
    public void user_click_the_checkbook_code_in_to_be_reversed_chequebook_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCodeToBeReversed());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCodeToBeReversed());
        ChequeBookRequestObject.chequeBookCodeToBeReversed().click();
    }

    @And("^user enter the value in chequebook code$")
    public void user_enter_the_value_in_chequebook_code() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCodeToBeReversed());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCodeToBeReversed());
        ChequeBookRequestObject.chequeBookCodeToBeReversed().sendKeys(testData.get("To Be Reversed ChequeBook Code"));
        ChequeBookRequestObject.chequeBookCodeToBeReversed().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.doubleClickTheRecord());
        //ChequeBookRequestObject.chequeBookCodeToBeReversed().sendKeys(Keys.ENTER);
        
    }

    @And("^user click the to be reversed button$")
    public void user_click_the_to_be_reversed_button() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.clickTheToBeReversedButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.clickTheToBeReversedButton());
        ChequeBookRequestObject.clickTheToBeReversedButton().click();
    }

    @And("^user click the reverse chequebook screen$")
    public void user_click_the_reverse_chequebook_screen() throws Throwable {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookScreen());
//      seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseChequeBookScreen());
//      ChequeBookRequestObject.reverseChequeBookScreen().click();
        for(int i=0;i<200;i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookScreen());
		        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseChequeBookScreen());
		        ChequeBookRequestObject.reverseChequeBookScreen().click();
				break;
			} catch (Exception e) {
		     if(i==199) {
		    	Assert.fail(e.getMessage());
		     }
			}
		}
		
    }
    

    @And("^user click the chequebook code in reverse chequebook screen$")
    public void user_click_the_chequebook_code_in_reverse_chequebook_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseChequeBookCode());
        ChequeBookRequestObject.reverseChequeBookCode().click();
    }

    @And("^user enter the value in chequebook code under reverse chequebook screen$")
    public void user_enter_the_value_in_chequebook_code_under_reverse_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseChequeBookCode());
        ChequeBookRequestObject.reverseChequeBookCode().sendKeys(testData.get("Reverse ChequeBook Code"));
        ChequeBookRequestObject.reverseChequeBookCode().sendKeys(Keys.ENTER);
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookCode());
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.doubleClickTheRecord());
    }

    @And("^user click the reverse button under reverse chequebook screen$")
    public void user_click_the_reverse_button_under_reverse_chequebook_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseButton());
        ChequeBookRequestObject.reverseButton().click();
    }
    @Then("^user validate the status record present in the maintenance screen for reverse chequebook$")
    public void user_validate_the_status_record_present_in_the_maintenance_screen_for_reverse_chequebook() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.validatePopup());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.validatePopup());
        Assert.assertTrue(ChequeBookRequestObject.validatePopup().isDisplayed());
    }

    @And("^user enter the cheque code for reverse chequebook$")
    public void user_enter_the_cheque_code_for_reverse_chequebook() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.maintenanceChequeBookCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.maintenanceChequeBookCode());
        ChequeBookRequestObject.maintenanceChequeBookCode().sendKeys(testData.get("Maintenance Cheque Code"));
        ChequeBookRequestObject.maintenanceChequeBookCode().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.doubleClickTheRecord());
    }
    
    
    
    //creation of chequebook
    
    @And("^User Enter the Number of Cheque Books$")
    public void user_enter_the_number_of_cheque_books() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.noOfChequeBooks());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.noOfChequeBooks());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.noOfChequeBooks());
		ChequeBookRequestObject.noOfChequeBooks().sendKeys(testData.get("No of Cheque boooks"));
    }
    
    @And("^User Cheque Code in Cheque book Maintenance Screen$")
    public void user_cheque_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_chequeCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_chequeCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_chequeCode());
		ChequeBookRequestObject.chequeBookCreation_chequeCode().sendKeys(testData.get("Cheque Code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookMaintenance());
		
    }
    
    @And("^User Enter the Branch Code in Cheque book Maintenance Screen$")
    public void user_enter_the_branch_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_BranchCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_BranchCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_BranchCode());
		ChequeBookRequestObject.chequeBookCreation_BranchCode().sendKeys(testData.get("Branch code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookMaintenance());
    }
    
    @And("^User Enter the Currency Code in Cheque book Maintenance Screen$")
    public void user_enter_the_currency_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_CurrencyCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_CurrencyCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_CurrencyCode());
		ChequeBookRequestObject.chequeBookCreation_CurrencyCode().sendKeys(testData.get("Currency code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookMaintenance());
    }
    
    @And("^User Enter the GL Code in Cheque book Maintenance Screen$")
    public void user_enter_the_gl_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_GlCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_GlCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_GlCode());
		ChequeBookRequestObject.chequeBookCreation_GlCode().sendKeys(testData.get("GL code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookMaintenance());
    }
    
    @And("^User Enter the CIF Code in Cheque book Maintenance Screen$")
    public void user_enter_the_cif_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_CifCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_CifCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_CifCode());
		ChequeBookRequestObject.chequeBookCreation_CifCode().sendKeys(testData.get("CIF code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookMaintenance());
    }
    
    @And("^User Enter the Serial No in Cheque book Maintenance Screen$")
    public void user_enter_the_serial_no_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_SerialNo());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_SerialNo());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_SerialNo());
		ChequeBookRequestObject.chequeBookCreation_SerialNo().sendKeys(testData.get("Serial No"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookMaintenance());
    }
    
    @And("^User Click Save button in Cheque book Maintenance Screen$")
    public void user_click_save_button_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_Save());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_Save());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_Save());
    }
    
    @And("^User click ok button for no signatures and no finger print pop up warning Message$")
    public void user_click_ok_button_for_no_signatures_and_no_finger_print_pop_up_warning_message() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp());
    }
    
    @And("^User Validate Cheque book created$")
    public void user_validate_cheque_book_created() throws Throwable {
        String xpath ="//td[text()='Active']/preceding-sibling::td[text()='0']"
        		+ "/preceding-sibling::td[text()='"+testData.get("CIF code")+"']"
        		+ "/preceding-sibling::td[text()='"+testData.get("GL code")+"']"
        		+ "/preceding-sibling::td[text()='"+testData.get("Currency code")+"']/preceding-sibling::td[3]";
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
    
    @And("^User Store the newly created Cheque book code$")
    public void user_store_the_newly_created_cheque_book_code() throws Throwable {
    	 String xpath ="//td[text()='Active']/preceding-sibling::td[text()='0']"
         		+ "/preceding-sibling::td[text()='"+testData.get("CIF code")+"']"
         		+ "/preceding-sibling::td[text()='"+testData.get("GL code")+"']"
         		+ "/preceding-sibling::td[text()='"+testData.get("Currency code")+"']/preceding-sibling::td[3]";
        for (int i = 0; i <200; i++) {
			try {
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.println(text);
				//excelData.updateTestData(testExecutionData.get("Data Set ID"), "Created Cheque Book Code", text);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    
    
    
    //approve a record
    
    
    @And("^User Click Approve Sub Menu$")
    public void user_click_approve_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.approveSubMenu());
    	seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.approveSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.approveSubMenu());
    }
    
    @And("^User Search Cheque Book Code in Approve Screen$")
    public void user_search_cheque_book_code_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.searchChequeBookCodeInApproveScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.searchChequeBookCodeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.searchChequeBookCodeInApproveScreen());
		ChequeBookRequestObject.searchChequeBookCodeInApproveScreen().sendKeys(testData.get("Approve ChequeBookCode"));
		ChequeBookRequestObject.searchChequeBookCodeInApproveScreen().sendKeys(Keys.ENTER);
    }
    
    @And("^User Select Cheque Book Code in Approve Screen$")
    public void user_select_cheque_book_code_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.selectChequeBookCodeInApproveScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.selectChequeBookCodeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.selectChequeBookCodeInApproveScreen());
    }
    
    
    @And("^User Click Approve button in Approve Screen$")
    public void user_click_approve_buttonin_approve_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.approveButton());
				seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.approveButton());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    @And("^User Click Ok button in Warning pop up Message in Approve Screen$")
    public void user_click_ok_button_in_warning_pop_up_message_in_approve_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				if (ChequeBookRequestObject.closeIconInWarningPopUpcancelScreen().isDisplayed()) {
					seleniumActions.getClickAndActionsHelper()
					.moveToElement(ChequeBookRequestObject.closeIconInWarningPopUpcancelScreen());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(ChequeBookRequestObject.closeIconInWarningPopUpcancelScreen());
			break;
				}
				
		
			} catch (Exception e) {
				if (i==199) {
				Assert.fail(e.getMessage());	
				}
			}
    	}
    }
    
    
    @And("^User Search Approved chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_approved_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.searchChequeBookCodeInCBMaintenance());
		ChequeBookRequestObject.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("Maintenance Cheque Code"));
		String xpath ="//td[text()='"+testData.get("Maintenance Cheque Code")+"']";
		
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.findButtonInCBMaintenance());
			}
			
		}
	
    }
    
    @Then("^User Validate the Approved chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_approved_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.approvedRecordValidationInCBMaintenance());
		Assert.assertTrue(ChequeBookRequestObject.approvedRecordValidationInCBMaintenance().isDisplayed());
    }
    
    
    //check the collected by id field @CHB_047
    
    @And("^user click the submit screen$")
    public void user_click_the_submit_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.submitScreenChequeBookRequest());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.submitScreenChequeBookRequest());
        ChequeBookRequestObject.submitScreenChequeBookRequest().click();
    }
    
    @And("^user click the search icon in submit screen$")
    public void user_click_the_search_icon_in_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.searchIconInSubmitScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.searchIconInSubmitScreen());
        ChequeBookRequestObject.searchIconInSubmitScreen().click();
    }
    
    @And("^user click the cheque code in submit screen$")
    public void user_click_the_cheque_code_in_submit_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeCodeInSubmitScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeCodeInSubmitScreen());
        ChequeBookRequestObject.chequeCodeInSubmitScreen().click();
    }
    
    @And("^user enter the value in cheque code under submit screen$")
    public void user_enter_the_value_in_cheque_code_under_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeCodeInSubmitScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeCodeInSubmitScreen());
        ChequeBookRequestObject.chequeCodeInSubmitScreen().sendKeys(testData.get("Cheque Code"));
        ChequeBookRequestObject.chequeCodeInSubmitScreen().sendKeys(Keys.ENTER);
        
       
    }
    
    @Then("^user retrieve the record which was created checkbook$")
    public void user_retrieve_the_record_which_was_created_checkbook() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.doubleClickInSubmitScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.doubleClickInSubmitScreen());
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.doubleClickInSubmitScreen());
    }
    
    @And("^user click to maximize the request information menu$")
    public void user_click_to_maximize_the_request_information_menu() throws Throwable {
        
        for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.requestInformationInSubmitScreen());
		        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.requestInformationInSubmitScreen());
		        ChequeBookRequestObject.requestInformationInSubmitScreen().click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
        
			
		
    }
    
    @Then("^user validate to check the collected by id field$")
    public void user_validate_to_check_the_collected_by_id_field() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.collectedByIdField());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.collectedByIdField());
        ChequeBookRequestObject.collectedByIdField().click();
    }

    
 
    //@CHB_048 test case
    
    @And("^user click the number of chequebooks button$")
    public void user_click_the_number_of_chequebooks_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.numberOfChequeBooksInMaintenance());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.numberOfChequeBooksInMaintenance());
        ChequeBookRequestObject.numberOfChequeBooksInMaintenance().click();
    }

    @And("^user enter the value in number of chequebooks$")
    public void user_enter_the_value_in_number_of_chequebooks() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.numberOfChequeBooksInMaintenance());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.numberOfChequeBooksInMaintenance());
        ChequeBookRequestObject.numberOfChequeBooksInMaintenance().sendKeys(testData.get("No of Cheque boooks"));
    }

    @And("^user click the cheque code$")
    public void user_click_the_cheque_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeCodeInMaintenanceScreen());
        ChequeBookRequestObject.chequeCodeInMaintenanceScreen().click();
    }

    @And("^user enter the value in cheque code under chequebook request screen$")
    public void user_enter_the_value_in_cheque_code_under_chequebook_request_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeCodeInMaintenanceScreen());
        ChequeBookRequestObject.chequeCodeInMaintenanceScreen().sendKeys(testData.get("Cheque Code"));
    }

    @And("^user click the branch code$")
    public void user_click_the_branch_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.branchCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.branchCodeInMaintenanceScreen());
        ChequeBookRequestObject.branchCodeInMaintenanceScreen().click();
    }

    @And("^user enter the value in branch code$")
    public void user_enter_the_value_in_branch_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.branchCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.branchCodeInMaintenanceScreen());
        ChequeBookRequestObject.branchCodeInMaintenanceScreen().sendKeys(testData.get("Branch code"));
    }

    @And("^user click the currency code$")
    public void user_click_the_currency_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.currencyCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.currencyCodeInMaintenanceScreen());
        ChequeBookRequestObject.currencyCodeInMaintenanceScreen().click();
    }

    @And("^user enter the value in currency code$")
    public void user_enter_the_value_in_currency_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.currencyCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.currencyCodeInMaintenanceScreen());
        ChequeBookRequestObject.currencyCodeInMaintenanceScreen().sendKeys(testData.get("Currency code"));
    }
    
    @And("^user click the chequebook request/maintenance icon$")
    public void user_click_the_chequebook_requestmaintenance_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.randomClickInChequeBookCreation());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.randomClickInChequeBookCreation());
        ChequeBookRequestObject.randomClickInChequeBookCreation().click();
    }
    
    @And("^user click the gl code$")
    public void user_click_the_gl_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.glCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.glCodeInMaintenanceScreen());
        ChequeBookRequestObject.glCodeInMaintenanceScreen().click();
    }

    @And("^user enter the value in gl code$")
    public void user_enter_the_value_in_gl_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.glCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.glCodeInMaintenanceScreen());
        ChequeBookRequestObject.glCodeInMaintenanceScreen().sendKeys(testData.get("GL code"));
    }

    @And("^user click the cif code$")
    public void user_click_the_cif_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.cifCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.cifCodeInMaintenanceScreen());
        ChequeBookRequestObject.cifCodeInMaintenanceScreen().click();
    }

    @And("^user enter the value in cif code$")
    public void user_enter_the_value_in_cif_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.cifCodeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.cifCodeInMaintenanceScreen());
        ChequeBookRequestObject.cifCodeInMaintenanceScreen().sendKeys(testData.get("CIF code"));
    }

    @And("^user click the serial number$")
    public void user_click_the_serial_number() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.serialNoInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.serialNoInMaintenanceScreen());
        ChequeBookRequestObject.serialNoInMaintenanceScreen().click();
    }

    @And("^user enter the value in serial number$")
    public void user_enter_the_value_in_serial_number() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.serialNoInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.serialNoInMaintenanceScreen());
        ChequeBookRequestObject.serialNoInMaintenanceScreen().sendKeys(testData.get("Serial No"));
    }

    @And("^user click the 	save button under chequebook request$")
    public void user_click_the_save_button_under_chequebook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.saveButtonInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.saveButtonInMaintenanceScreen());
        ChequeBookRequestObject.saveButtonInMaintenanceScreen().click();
    }
    
    @And("^user click the search icon in maintenance screen$")
    public void user_click_the_search_icon_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.SearchIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.SearchIcon());
        ChequeBookRequestObject.SearchIcon().click();
    }
    
    @Then("^user validate the status submitted$")
    public void user_validate_the_status_submitted() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.validatePopup());
    	Assert.assertTrue(ChequeBookRequestObject.validatePopup().isDisplayed());
    }

    @And("^user click the cheque code in maintenance screen$")
    public void user_click_the_cheque_code_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.maintenanceChequeBookCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.maintenanceChequeBookCode());
        ChequeBookRequestObject.maintenanceChequeBookCode().click();
    }

    @And("^user enter the value in cheque code in maintenance screen$")
    public void user_enter_the_value_in_cheque_code_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.maintenanceChequeBookCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.maintenanceChequeBookCode());
        ChequeBookRequestObject.maintenanceChequeBookCode().sendKeys(testData.get("Maintenance Cheque Code"));
    }
    
    
    
    //FOM CIF product creation @CHB_053
    
    @And("^user click the front office management screen$")
    public void user_click_the_front_office_management_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.frontOfficeManagementScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.frontOfficeManagementScreen());
        ChequeBookRequestObject.frontOfficeManagementScreen().click();
        
    }

    @And("^user click the maintenance screen under front office management$")
    public void user_click_the_maintenance_screen_under_front_office_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.MaintenanceButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.MaintenanceButton());
        ChequeBookRequestObject.MaintenanceButton().click();
    }
    
    @And("^user click the status in maintenance screen$")
    public void user_click_the_status_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.statusButtonInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.statusButtonInMaintenanceScreen());
        ChequeBookRequestObject.statusButtonInMaintenanceScreen().click();
    }

    @And("^user enter the value in status$")
    public void user_enter_the_value_in_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.statusButtonInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.statusButtonInMaintenanceScreen());
        ChequeBookRequestObject.statusButtonInMaintenanceScreen().sendKeys(testData.get("Status"));
        ChequeBookRequestObject.statusButtonInMaintenanceScreen().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.statusButtonInMaintenanceScreen());
    }

    @And("^user click the cif products in front office maintenance screen$")
    public void user_click_the_cif_products_in_front_office_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.cifProducts());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.cifProducts());
        ChequeBookRequestObject.cifProducts().click();
    }

    @And("^user click the account brief name$")
    public void user_click_the_account_brief_name() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.accountBriefName());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.accountBriefName());
        ChequeBookRequestObject.accountBriefName().click();
    }

    @And("^user enter the value in account brief name$")
    public void user_enter_the_value_in_account_brief_name() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.accountBriefName());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.accountBriefName());
        ChequeBookRequestObject.accountBriefName().sendKeys(testData.get("Account Brief Name"));
    }

    @And("^user click the checkbox chequebook$")
    public void user_click_the_checkbox_chequebook() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.clickCheckBoXInFomScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.clickCheckBoXInFomScreen());
        ChequeBookRequestObject.clickCheckBoXInFomScreen().click();
    }

    @And("^user click the save button in front office management$")
    public void user_click_the_save_button_in_front_office_management() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.saveButtonInFomScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.saveButtonInFomScreen());
        ChequeBookRequestObject.saveButtonInFomScreen().click();
    }
    
    //@CHB_049
    
    @And("^user click the apply to submit screen under checkbook request$")
    public void user_click_the_apply_to_submit_screen_under_checkbook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.applyToSubmitScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.applyToSubmitScreen());
        ChequeBookRequestObject.applyToSubmitScreen().click();
    }

    @And("^user click the search icon in apply to submit screen$")
    public void user_click_the_search_icon_in_apply_to_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.searchIconInApplyToSubmit());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.searchIconInApplyToSubmit());
        ChequeBookRequestObject.searchIconInApplyToSubmit().click();
    }

    @And("^user click the check code icon in apply to submit screen$")
    public void user_click_the_check_code_icon_in_apply_to_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.checkCodeInApplyToSubmit());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.checkCodeInApplyToSubmit());
        ChequeBookRequestObject.checkCodeInApplyToSubmit().click();
    }

    @And("^user enter the value in check code$")
    public void user_enter_the_value_in_check_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.checkCodeInApplyToSubmit());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.checkCodeInApplyToSubmit());
        ChequeBookRequestObject.checkCodeInApplyToSubmit().sendKeys(testData.get("Cheque Code"));
        ChequeBookRequestObject.checkCodeInApplyToSubmit().sendKeys(Keys.ENTER);
    }

    @And("^user retrieve the approved record in apply to submit screen$")
    public void user_retrieve_the_approved_record_in_apply_to_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.doubleClickInApplyToSubmitScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.doubleClickInApplyToSubmitScreen());
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.doubleClickInApplyToSubmitScreen());
    }

    @And("^user click the apply to submit button in apply to submit screen$")
    public void user_click_the_apply_to_submit_button_in_apply_to_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.applyToSubmitButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.applyToSubmitButton());
        ChequeBookRequestObject.applyToSubmitButton().click();
    }
    
    
    
    //@CHB_078
    
    @Then("^user validate to check the disable of from number and to number$")
    public void user_validate_to_check_the_disable_of_from_number_and_to_number() throws Throwable {
        
    }

    @And("^user click the from number$")
    public void user_click_the_from_number() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.fromNumber());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.fromNumber());
        ChequeBookRequestObject.fromNumber().click();
    }

    @And("^user click the to number$")
    public void user_click_the_to_number() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toNumber());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toNumber());
        ChequeBookRequestObject.toNumber().click();
    }
    
    
    //@CHB_050
    
    @Then("^user validate the chequebook details to approve the record$")
    public void user_validate_the_chequebook_details_to_approve_the_record() throws Throwable {
        
    }

    @And("^system generate the alert message$")
    public void system_generate_the_alert_message() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.bmApproval());
    	Assert.assertTrue(ChequeBookRequestObject.bmApproval().isDisplayed());
    }

    @And("^user click the approve button in apply to submit screen$")
    public void user_click_the_approve_button_in_apply_to_submit_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.approveButtonInBmApproval());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.approveButtonInBmApproval());
        ChequeBookRequestObject.approveButtonInBmApproval().click();
    }

    @And("^user click the username$")
    public void user_click_the_username() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.usernameInBmApproval());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.usernameInBmApproval());
        ChequeBookRequestObject.usernameInBmApproval().click();
    }

    @And("^user enter the value in username$")
    public void user_enter_the_value_in_username() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.usernameInBmApproval());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.usernameInBmApproval());
        ChequeBookRequestObject.usernameInBmApproval().sendKeys(testData.get("User Name"));
    }

    @And("^user click the password$")
    public void user_click_the_password() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.passwordInBmApproval());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.passwordInBmApproval());
        ChequeBookRequestObject.passwordInBmApproval().click();
    }

    @And("^user enter the value in password$")
    public void user_enter_the_value_in_password() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.usernameInBmApproval());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.usernameInBmApproval());
        ChequeBookRequestObject.usernameInBmApproval().sendKeys(testData.get("Password"));
    }

    @And("^user click the submit button in user information$")
    public void user_click_the_submit_button_in_user_information() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.submitButtonINBmApproval());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.submitButtonINBmApproval());
        ChequeBookRequestObject.submitButtonINBmApproval().click();
    }
    
    
    //@CHB_082
    
    @And("^user validate the confirm message in reverse chequebook submenu$")
    public void user_validate_the_confirm_message_in_reverse_chequebook_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.confirmErrorMessagePopup());
    	Assert.assertTrue(ChequeBookRequestObject.confirmErrorMessagePopup().isDisplayed());
    }

    @And("^user click the ok button in reverse chequebook submenu$")
    public void user_click_the_ok_button_in_reverse_chequebook_submenu() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.okButtonInReverseChequeBookSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.okButtonInReverseChequeBookSubMenu());
        ChequeBookRequestObject.okButtonInReverseChequeBookSubMenu().click();
    }
    @And("^user update test data set id for CHB_082$")
    public void user_update_test_data_set_id_for_chb082() throws Throwable {
    	testData = csmChequeBookRequestExcelData.getTestdata("CHB_082_D1");
    }
    @Then("^user validate the new sequence from number and to number in maintenance screen$")
    public void user_validate_the_new_sequence_from_number_and_to_number_in_maintenance_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.fromNumberInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.fromNumberInMaintenanceScreen());
        ChequeBookRequestObject.fromNumberInMaintenanceScreen().click();
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toNumberInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toNumberInMaintenanceScreen());
        ChequeBookRequestObject.toNumberInMaintenanceScreen().click();
		
    }
    
    //CHB_083
    
    @And("^user update test data set id for CHB_083$")
    public void user_update_test_data_set_id_for_chb083() throws Throwable {
    	testData = csmChequeBookRequestExcelData.getTestdata("CHB_083_D2");
    }
    @Then("^user validate the default same sequence in from number and to number in maintenance screen$")
    public void user_validate_the_default_same_sequence_in_from_number_and_to_number_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.fromNumberInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.fromNumberInMaintenanceScreen());
        ChequeBookRequestObject.fromNumberInMaintenanceScreen().click();
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toNumberInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toNumberInMaintenanceScreen());
        ChequeBookRequestObject.toNumberInMaintenanceScreen().click();
    }
    
    //CHB_084
    
    @And("^user update test data set id for CHB_084$")
    public void user_update_test_data_set_id_for_chb084() throws Throwable {
    	testData = csmChequeBookRequestExcelData.getTestdata("CHB_083_D3");
    }
    @Then("^user validate the default reversed sequences in from number and to number in maintenance screen$")
    public void user_validate_the_default_reversed_sequences_in_from_number_and_to_number_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.fromNumberInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.fromNumberInMaintenanceScreen());
        ChequeBookRequestObject.fromNumberInMaintenanceScreen().click();
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toNumberInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toNumberInMaintenanceScreen());
        ChequeBookRequestObject.toNumberInMaintenanceScreen().click();
    }
    
    //CHB_085
    
    @And("^user update test data set id for CHB_085$")
    public void user_update_test_data_set_id_for_chb085() throws Throwable {
        
    } 
    
    @And("^user click to cancel screen submenu$")
    public void user_click_to_cancel_screen_submenu() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toCancelScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toCancelScreen());
        ChequeBookRequestObject.toCancelScreen().click();
    }

    @And("^user click the cheque code in to cancel screen$")
    public void user_click_the_cheque_code_in_to_cancel_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.codeInToCancelScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.codeInToCancelScreen());
        ChequeBookRequestObject.codeInToCancelScreen().click();
    }

    @And("^user enter the value in cheque code$")
    public void user_enter_the_value_in_cheque_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.codeInToCancelScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.codeInToCancelScreen());
        ChequeBookRequestObject.codeInToCancelScreen().sendKeys("591");
        ChequeBookRequestObject.codeInToCancelScreen().sendKeys(Keys.ENTER);
    }

    @And("^user retrieve the created chequebook record in to cancel screen$")
    public void user_retrieve_the_created_chequebook_record_in_to_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.retrieveTheRecord());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.retrieveTheRecord());
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.retrieveTheRecord());
        
    }

    @And("^user click the cancel reason button to fill the reason in to cancel screen$")
    public void user_click_the_cancel_reason_button_to_fill_the_reason_in_to_cancel_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.cancelReason());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.cancelReason());
        ChequeBookRequestObject.cancelReason().click();
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.cancelReason());
        ChequeBookRequestObject.cancelReason().sendKeys("50");
    }

    @And("^user click to cancel button$")
    public void user_click_to_cancel_button() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toCancelButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toCancelButton());
        ChequeBookRequestObject.toCancelButton().click();
    }

    @And("^user navigate to click the approve cancel screen$")
    public void user_navigate_to_click_the_approve_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.approveCancelScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.approveCancelScreen());
        ChequeBookRequestObject.approveCancelScreen().click();
    }

    @And("^user click the cheque code in approve cancel screen$")
    public void user_click_the_cheque_code_in_approve_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.codeInApproveCancelScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.codeInApproveCancelScreen());
        ChequeBookRequestObject.codeInApproveCancelScreen().click();
    }

    @And("^user retrieve the cancelled record in approve screen$")
    public void user_retrieve_the_cancelled_record_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.retrieveTheRecord());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.retrieveTheRecord());
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.retrieveTheRecord());
    }

    @And("^user click the cancel button in approve screen$")
    public void user_click_the_cancel_button_in_approve_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.cancelButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.cancelButton());
        ChequeBookRequestObject.cancelButton().click();
    }
    
    @Then("^user validate to modify the from number and to number$")
    public void user_validate_to_modify_the_from_number_and_to_number() throws Throwable {
        
    }
    
    
    //@CHB_086
    
    @And("^user update test data set id for CHB_086$")
    public void user_update_test_data_set_id_for_chb086() throws Throwable {
        
    }
    
    
    //@CHB_141
    
    @And("^user update test data set id for CHB_141$")
    public void user_update_test_data_set_id_for_chb141() throws Throwable {
        
    }
    @Then("^user click to destroy button$")
    public void user_click_to_destroy_button() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toDestroyButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toDestroyButton());
        ChequeBookRequestObject.toDestroyButton().click();
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp());
        ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp().click();
    }

    @Then("^user click the reject button in approve destroyed screen$")
    public void user_click_the_reject_button_in_approve_destroyed_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.rejectButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.rejectButton());
        ChequeBookRequestObject.rejectButton().click();
    }

    @And("^user click to be destroyed screen$")
    public void user_click_to_be_destroyed_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toBeDestroyedScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toBeDestroyedScreen());
        ChequeBookRequestObject.toBeDestroyedScreen().click();
    }

    @And("^user retrieve the approved chequebook record in to be destroyed screen$")
    public void user_retrieve_the_approved_chequebook_record_in_to_be_destroyed_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.retrieveApprovedRecordInToBeDestroyedScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.retrieveApprovedRecordInToBeDestroyedScreen());
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.retrieveApprovedRecordInToBeDestroyedScreen());
    }

    @And("^system force to user to fill the reason in to be destroyed screen$")
    public void system_force_to_user_to_fill_the_reason_in_to_be_destroyed_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reasonMessage());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reasonMessage());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.reasonMessage());
        ChequeBookRequestObject.reasonMessage().sendKeys(testData.get("Reason Field"));

    }
    
    @Then("^user click to destroy button to destroy the approved record$")
    public void user_click_to_destroy_button_to_destroy_the_approved_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toDestroyButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toDestroyButton());
        ChequeBookRequestObject.toDestroyButton().click();
    }

    @And("^user navigate to click the approve destroyed screen$")
    public void user_navigate_to_click_the_approve_destroyed_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.approveDestroyedScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.approveDestroyedScreen());
        ChequeBookRequestObject.approveDestroyedScreen().click();
    }

    @And("^user click the cheque code in approve destroyed screen$")
    public void user_click_the_cheque_code_in_approve_destroyed_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeCodeInApproveDestroyedScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeCodeInApproveDestroyedScreen());
        ChequeBookRequestObject.chequeCodeInApproveDestroyedScreen().click();
    }

    @And("^user retrieve the to be destroyed record in approve destroyed screen$")
    public void user_retrieve_the_to_be_destroyed_record_in_approve_destroyed_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.retrieveRecordInApproveDestroyedScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.retrieveRecordInApproveDestroyedScreen());
        ChequeBookRequestObject.retrieveRecordInApproveDestroyedScreen().sendKeys(testData.get("Approve Destroyed"));
        ChequeBookRequestObject.retrieveRecordInApproveDestroyedScreen().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.retrieveRecordInApproveDestroyedScreen());
    }
    
    //@CHB_142
    @Then("^user validate the cannot proceed popup message under reverse chequebook screen$")
    public void user_validate_the_cannot_proceed_popup_message_under_reverse_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.validatePopupInReverseChequeBookSubMenu());
    	Assert.assertTrue(ChequeBookRequestObject.validatePopupInReverseChequeBookSubMenu().isDisplayed());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.okButtonInReverseChequeBookSubMenu());
    	seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.okButtonInReverseChequeBookSubMenu());
    	ChequeBookRequestObject.okButtonInReverseChequeBookSubMenu().click();
    }
    
    @And("^user fill the reason field in reverse chequebook screen$")
    public void user_fill_the_reason_field_in_reverse_chequebook_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reasonBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reasonBox());
        ChequeBookRequestObject.reasonBox().click();
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reasonBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reasonBox());
        ChequeBookRequestObject.reasonBox().sendKeys(testData.get("Reason Field"));
    }

    @And("^user click the reject button under reverse chequebook screen$")
    public void user_click_the_reject_button_under_reverse_chequebook_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.rejectButtonInReverseChequeBookSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.rejectButtonInReverseChequeBookSubMenu());
        ChequeBookRequestObject.rejectButtonInReverseChequeBookSubMenu().click();
    }
    
    @And("^user update test data set id for CHB_142$")
    public void user_update_test_data_set_id_for_chb142() throws Throwable {
    	//testData = csmChequeBookRequestExcelData.getTestdata("CHB_082_D1");
    }
    
    //CHB_143
    
    @And("^user update test data set id for CHB_143$")
    public void user_update_test_data_set_id_for_chb143() throws Throwable {
    	//testData = csmChequeBookRequestExcelData.getTestdata("CHB_082_D1");
    }
    
    //CHB_144
    
    @And("^user update test data set id for CHB_144$")
    public void user_update_test_data_set_id_for_chb144() throws Throwable {
    	//testData = csmChequeBookRequestExcelData.getTestdata("CHB_082_D1");
    }
    
    @And("^user click and fill the value in reason field in to be reversed chequebook screen$")
    public void user_click_and_fill_the_value_in_reason_field_in_to_be_reversed_chequebook_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reasonBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reasonBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.reasonBox());
        ChequeBookRequestObject.reasonBox().sendKeys(testData.get("Reason Field"));
        
    }
    
    //@CHB_145
    
    @And("^user update test data set id for CHB_145$")
    public void user_update_test_data_set_id_for_chb145() throws Throwable {
    	//testData = csmChequeBookRequestExcelData.getTestdata("CHB_082_D1");
    }
    
    @And("^user check on the reason field and fill the reason in to be reversed chequebook screen$")
    public void user_check_on_the_reason_field_and_fill_the_reason_in_to_be_reversed_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reasonBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reasonBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.reasonBox());
        ChequeBookRequestObject.reasonBox().sendKeys(testData.get("Reason Field"));
    }
    
    //@CHB_146
    
    @And("^user update test data set id for CHB_146$")
    public void user_update_test_data_set_id_for_chb146() throws Throwable {
        
    }
    
    @And("^user check on the reason field and fill the reason in reverse chequebook screen$")
    public void user_check_on_the_reason_field_and_fill_the_reason_in_reverse_chequebook_screen() throws Throwable {
        
    }
    
    //@CHB_179
    
    @And("^user update test data set id for CHB_179$")
    public void user_update_test_data_set_id_for_chb179() throws Throwable {
    	testData = csmChequeBookRequestExcelData.getTestdata("CHB_179_01");
    }
    
    @Then("^user select the required dropdown field under additonal details$")
    public void user_select_the_required_dropdown_field_under_additonal_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_code_additionaloptions_dropdown());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_code_additionaloptions_dropdown());
        seleniumActions.getDropDownHelper().SelectUsingVisibleText(ChequeBookRequestObject.csmParam_General_ledger_code_additionaloptions_dropdown(), "Don't Notify and Proceed");
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_code_additionaloptions_dropdown());
        seleniumActions.getDropDownHelper().SelectUsingVisibleText(ChequeBookRequestObject.csmParam_General_ledger_code_additionaloptions_dropdown(), "Notify and Don't Proceed");
    }

    @Then("^user click on approve button$")
    public void user_click_on_approve_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve());
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK());
    }

    @Then("^user verify required flag is checked or not$")
    public void user_verify_required_flag_is_checked_or_not() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds());
    	seleniumActions.getJavascriptHelper().scrollIntoView(ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds());
    	for (int i = 0; i < 200; i++) {
    		try {
    			if (ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds().getAttribute("checked").equalsIgnoreCase("checked")) {
    				ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds().click();
    				break;
    			} 
    		} catch (Exception e) {
//    			if (i == 199) {
//    				Assert.fail(e.getMessage());
//				}
    			
    		}
		}
    	
    }
    @And("^user click the Account parameters submenu$")
    public void user_click_the_account_parameters_submenu() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParams_AccountsParameters());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParams_AccountsParameters());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParams_AccountsParameters());
    }

    @And("^user click the General Ledger submenu$")
    public void user_click_the_general_ledger_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.genralLedgerInParams());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.genralLedgerInParams());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.genralLedgerInParams());
    }

    @And("^user click the update after approve screen under general ledger$")
    public void user_click_the_update_after_approve_screen_under_general_ledger() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_Updateafterapprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_Updateafterapprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_General_ledger_Updateafterapprove());
    }

    @And("^user click code under update after approve screen$")
    public void user_click_code_under_update_after_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_code());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_code());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_General_ledger_code());
    }

    @And("^user enter the value in code$")
    public void user_enter_the_value_in_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_code());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_code());
        ChequeBookRequestObject.csmParam_General_ledger_code().sendKeys(testData.get("User Code"));
        ChequeBookRequestObject.csmParam_General_ledger_code().sendKeys(Keys.ENTER);
    }

    @And("^user retrieve the record under update approve screen$")
    public void user_retrieve_the_record_under_update_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_code_doubleclick());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_code_doubleclick());
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.csmParam_General_ledger_code_doubleclick());
    }

    @And("^user click on additional details$")
    public void user_click_on_additional_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_code_additionaloptions());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_code_additionaloptions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_General_ledger_code_additionaloptions());
    }

    @And("^user click on update button$")
    public void user_click_on_update_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_upadatebutton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_upadatebutton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_General_ledger_upadatebutton());
    }
    
    @And("^user click on ok button$")
    public void user_click_on_ok_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.chequeBookCreation_OkbuttonWarningPopUp());
    }

    @And("^user click on approve screen$")
    public void user_click_on_approve_screen() throws Throwable {
//    	for (int i = 0; i < 200; i++) {
//    		try {
//    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
//    	        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
//    	        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
//			} catch (Exception e) {
//				if(i==199) {
//	        		Assert.fail(e.getMessage());
//			}
//		  }
//		}
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
    }     
    

    @And("^user click and enter the value in code under approve screen$")
    public void user_click_and_enter_the_value_in_code_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_Approve_inputField());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_Approve_inputField());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_General_ledger_Approve_inputField());
        ChequeBookRequestObject.csmParam_General_ledger_Approve_inputField().sendKeys(testData.get("User Code"));
        ChequeBookRequestObject.csmParam_General_ledger_Approve_inputField().sendKeys(Keys.ENTER);
    }

    @And("^user retrieve the internal account record in approve screen$")
    public void user_retrieve_the_internal_account_record_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick());
        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.csmParam_General_ledger_Approve_inputfield_doubleclick());
        
    }

    @And("^user click on transaction type submenu$")
    public void user_click_on_transaction_type_submenu() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype());
    }

    @And("^user click on update after approve$")
    public void user_click_on_update_after_approve() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_Updateafterapprovefield());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_Updateafterapprovefield());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_Updateafterapprovefield());
    }

    @And("^user click and enter the value in code under transaction type$")
    public void user_click_and_enter_the_value_in_code_under_transaction_type() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_inputfield());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_inputfield());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_inputfield());
        ChequeBookRequestObject.csmParam_Transactiontype_inputfield().sendKeys("377");
        ChequeBookRequestObject.csmParam_Transactiontype_inputfield().sendKeys(Keys.ENTER);
        
    }

    @And("^user retrieve the record under transaction type$")
    public void user_retrieve_the_record_under_transaction_type() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_inputfield_doubleclick());
    	        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_inputfield_doubleclick());
    	        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.csmParam_Transactiontype_inputfield_doubleclick());
//    	        seleniumActions.getJavascriptHelper().scrollIntoView(ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds());
    	        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());	
				}
				
			}
			
		}
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_inputfield_doubleclick());
//        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_inputfield_doubleclick());
//        seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.csmParam_Transactiontype_inputfield_doubleclick());
    }

    @And("^user click on update after approve button$")
    public void user_click_on_update_after_approve_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveButton());
        seleniumActions.getJavascriptHelper().scrollIntoView(ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_proceedoninsufficentfunds_UpdateAfterApproveButton());
    }
    
    @Then("^user click on approve button under transaction type$")
    public void user_click_on_approve_button_under_transactio_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve());
    }

    @And("^user click on approve screen under transaction type$")
    public void user_click_on_approve_screen_under_transaction_type() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
    	        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
    	        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
//        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
//        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_Approvefield());
    }

    @And("^user click and enter the value in code in approve screen under transaction type$")
    public void user_click_and_enter_the_value_in_code_in_approve_screen_under_transaction_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield());
        ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield().sendKeys("377");
        ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield().sendKeys(Keys.ENTER);
    }

    @And("^user retrieve the internal account record in approve screen under transaction type$")
    public void user_retrieve_the_internal_account_record_in_approve_screen_under_transaction_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield_doubleclick());
        seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield_doubleclick());
        seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.csmParam_Transactiontype_Approve_Inputfield_doubleclick());
    }
}
    
    
    
    
    
    
    
    
    
    


