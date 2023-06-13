package stepdefinitions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM_TransactionOnStaffAccount_Obj;
import resources.BaseClass;

public class CSM_TransactionOnStaffAccount_Steps extends BaseClass{
      WebDriver driver = BaseClass.driver;
      ConfigFileReader configFileRead = new ConfigFileReader();
      CSMLogin login = new CSMLogin(driver);
      Selenium_Actions seleniumActions = new Selenium_Actions(driver);
      CSM_TransactionOnStaffAccount_Obj csmTransactionOnStaffAccount = new CSM_TransactionOnStaffAccount_Obj(driver);
      String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
  	  ExcelData csmTransactionsStaffAccountExcelData = new ExcelData(path,"CSM_Transaction_On_StaffAccount","Data Set ID");
  	  Map<String, String> testData;
  	  
  	@Given("^user login as csm params application$")
    public void user_login_as_csm_params_application() throws Throwable {
  		String paramsApplicationUrl = configFileRead.getCSMparamsUrl();
		driver.get(paramsApplicationUrl);
		login.loginIntoCSMParamApplication();
    }

    @Then("^user click confirm message ok button$")
    public void user_click_confirm_message_ok_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.confirmOkButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.confirmOkButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.confirmOkButton());
    }

    @And("^user click parameters menu$")
    public void user_click_parameters_menu() throws Throwable {
    	
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.parametersMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.parametersMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.parametersMenu());
    }

    @And("^user click system parameters submenu$")
    public void user_click_system_parameters_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.systemParametersSubmenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.systemParametersSubmenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.systemParametersSubmenu());
    }

    @And("^user click user submenu$")
    public void user_click_user_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.userSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.userSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.userSubMenu());
    }

    @And("^user click populate user submenu$")
    public void user_click_populate_user_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.populateUserSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.populateUserSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.populateUserSubMenu());
    }

    @And("^user click maintenance under populate user submenu$")
    public void user_click_maintenance_under_populate_user_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.maintenanceInPopulateUserSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.maintenanceInPopulateUserSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.maintenanceInPopulateUserSubMenu());
    }

    @And("^user click and enter the value in code under maintenance screen$")
    public void user_click_and_enter_the_value_in_code_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.codeInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.codeInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.codeInMaintenanceSubMenu());
        csmTransactionOnStaffAccount.codeInMaintenanceSubMenu().sendKeys("157");
    }

    @And("^user click and enter the value in brief description field under maintenance screen$")
    public void user_click_and_enter_the_value_in_brief_description_field_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.briefDescriptionInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.briefDescriptionInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.briefDescriptionInMaintenanceSubMenu());
        csmTransactionOnStaffAccount.briefDescriptionInMaintenanceSubMenu().sendKeys("test157");
    }

    @And("^user click and enter the value in long description field under maintenance screen$")
    public void user_click_and_enter_the_value_in_long_description_field_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.longDescriptionInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.longDescriptionInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.longDescriptionInMaintenanceSubMenu());
        csmTransactionOnStaffAccount.longDescriptionInMaintenanceSubMenu().sendKeys("test");
    }

    @And("^user click and enter the value in brief description arabic field under maintenance screen$")
    public void user_click_and_enter_the_value_in_brief_description_arabic_field_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.briefDescriptionInArabic());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.briefDescriptionInArabic());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.briefDescriptionInArabic());
        csmTransactionOnStaffAccount.briefDescriptionInArabic().sendKeys("briefArabic");
    }

    @And("^user click and enter the value in long description arabic field under maintenance screen$")
    public void user_click_and_enter_the_value_in_long_description_arabic_field_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.longDescriptionInArabic());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.longDescriptionInArabic());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.longDescriptionInArabic());
        csmTransactionOnStaffAccount.longDescriptionInArabic().sendKeys("longArabic");
    }

    @And("^user click and enter the value in user code field$")
    public void user_click_and_enter_the_value_in_user_code_field() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.userCodeInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.userCodeInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.userCodeInMaintenanceSubMenu());
        csmTransactionOnStaffAccount.userCodeInMaintenanceSubMenu().sendKeys("320561");
    }
    
    @And("^user click add icon in destination branches$")
    public void user_click_add_icon_in_destination_branches() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.addIconInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.addIconInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.addIconInMaintenanceSubMenu());
    }
    
    @And("^user randomly click in destination branches$")
    public void user_randomly_click_in_destination_branches() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.randomClickInDestinationBranches());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.randomClickInDestinationBranches());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.randomClickInDestinationBranches());
    }
    
    @And("^user click and enter the value in branch field$")
    public void user_click_and_enter_the_value_in_branch_field() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeField());
        csmTransactionOnStaffAccount.branchCodeField().sendKeys("2");
//        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.randomClickInDestinationBranches());
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.randomClickInDestinationBranches());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.randomClickInDestinationBranches());
    }

    
    @And("^user click search icon$")
    public void user_click_search_icon() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.searchIconForBranchField());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.searchIconForBranchField());
			} catch (Exception e) {
				if (i==199) {
		              Assert.fail(e.getMessage());
		           }	
			}
			
		}
//        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.searchIconForBranchField());
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.searchIconForBranchField());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.searchIconForBranchField());
    }

    @And("^user click branch code under destination branches$")
    public void user_click_branch_code_under_destination_branches() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.branchCodeIcon());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.branchCodeIcon());
    }

    @And("^user enter the value in branch code and doubleclick the branch code$")
    public void user_enter_the_value_in_branch_code_and_doubleclick_the_branch_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeIcon());
    	csmTransactionOnStaffAccount.branchCodeIcon().sendKeys("2");
    	csmTransactionOnStaffAccount.branchCodeIcon().sendKeys(Keys.ENTER);
    	seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.doubleClkTheRecord());
    	seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.doubleClkTheRecord());
    }

    @And("^user click and enter the value in branch code field$")
    public void user_click_and_enter_the_value_in_branch_code_field() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    	try {
          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeField());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.branchCodeField());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.branchCodeField());
          csmTransactionOnStaffAccount.branchCodeField().sendKeys("2");
          break;
    	} catch (Exception e) {
    	if (i==199) {
              Assert.fail(e.getMessage());
           }

        }
     }

   }
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeField());
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.branchCodeField());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.branchCodeField());
//        csmTransactionOnStaffAccount.branchCodeField().sendKeys("2");
    

    @And("^user click and enter the value in new user template field$")
    public void user_click_and_enter_the_value_in_new_user_template_field() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.newUserTemplateField());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.newUserTemplateField());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.newUserTemplateField());
        csmTransactionOnStaffAccount.newUserTemplateField().sendKeys("3");
    }

    @And("^user click save button under populate user$")
    public void user_click_save_button_under_populate_user() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.saveButtonInPopulateSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.saveButtonInPopulateSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.saveButtonInPopulateSubMenu());
    }
    
    @And("^user click success message ok button$")
    public void user_click_success_message_ok_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.successOkButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.successOkButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.successOkButton());
    }

    @And("^user click approve screen under populate user$")
    public void user_click_approve_screen_under_populate_user() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.approveScreenInPopulateUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.approveScreenInPopulateUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.approveScreenInPopulateUser());
    }

    @And("^user click and enter the value in cheque code under approve screen$")
    public void user_click_and_enter_the_value_in_cheque_code_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.chequeCodeInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.chequeCodeInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.chequeCodeInApproveScreen());
        csmTransactionOnStaffAccount.chequeCodeInApproveScreen().sendKeys("157");
        csmTransactionOnStaffAccount.chequeCodeInApproveScreen().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.retrieveRecordInApproveScreen());
    }

    @And("^user click approve button$")
    public void user_click_approve_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.approveButtonInUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.approveButtonInUser());
        seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionOnStaffAccount.approveButtonInUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.approveButtonInUser());
    }

    @And("^user click populate screen$")
    public void user_click_populate_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.populateScreenInPopulateUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.populateScreenInPopulateUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.populateScreenInPopulateUser());
    }

    @And("^user click and enter the value in cheque code under populate screen$")
    public void user_click_and_enter_the_value_in_cheque_code_under_populate_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.chequeCodeInPopulateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.chequeCodeInPopulateScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.chequeCodeInPopulateScreen());
        csmTransactionOnStaffAccount.chequeCodeInPopulateScreen().sendKeys("157");
        csmTransactionOnStaffAccount.chequeCodeInPopulateScreen().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.retrieveRecordInPopulateScreen());
    }

    @And("^user click populate button$")
    public void user_click_populate_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.populateButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.populateButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.populateButton());
    }
    
    @And("^user logout from the csm params application$")
    public void user_logout_from_the_csm_params_application() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.logoutButtonInCsmParamsApplication());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.logoutButtonInCsmParamsApplication());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.logoutButtonInCsmParamsApplication());
    }
    
    //TSA_017
    @And("^user click the check box suspend user in logged in branch under maintenance screen$")
    public void user_click_the_check_box_suspend_user_in_logged_in_branch_under_maintenance_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.suspendCheckBoxInPopulateUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.suspendCheckBoxInPopulateUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.suspendCheckBoxInPopulateUser());
    }
    
    
    //TRS_041
    
    @And("^user update test data set id for TRS_041$")
    public void user_update_test_data_set_id_for_trs041() throws Throwable {
        
    }
    
    @Then("^user click save button$")
    public void user_click_save_button() throws Throwable {
        
    }

    @And("^user click currency field and enter the value$")
    public void user_click_currency_field_and_enter_the_value() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.csmTransactionsCurrencyField());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.csmTransactionsCurrencyField());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.csmTransactionsCurrencyField());
        csmTransactionOnStaffAccount.csmTransactionsCurrencyField().sendKeys(testData.get("Currency"));
        csmTransactionOnStaffAccount.csmTransactionsCurrencyField().sendKeys(Keys.TAB);
        
    }

    @And("^user click amount field and enter the value$")
    public void user_click_amount_field_and_enter_the_value() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.csmTransactionsAmountField());
    			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.csmTransactionsAmountField());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.csmTransactionsAmountField());
    	        csmTransactionOnStaffAccount.csmTransactionsAmountField().sendKeys(testData.get("Amount"));
    	        csmTransactionOnStaffAccount.csmTransactionsAmountField().sendKeys(Keys.TAB);
    	        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
    	}
    		
//    		for (int i = 0; i < 200; i++) {
//    	           try {
//    	               seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSMCurrencyName());
//    	               csmTransactionOnStaffAccount.CSMCurrencyName().isDisplayed();
//    	                break;
//    	            } catch (Exception e) {
//    	                if (i==199) {
//    	                    Assert.fail(e.getMessage());
//    	                }
//    	            }            
//    	        }
    		
			
		}
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.csmTransactionsAmountField());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.csmTransactionsAmountField());
//        csmTransactionOnStaffAccount.csmTransactionsAmountField().sendKeys(testData.get("Amount"));
    
    @And("^user check if the  value is entered or not$")

    public void user_check_if_the_value_is_entered_or_not() throws Throwable {
    	try {

        seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionOnStaffAccount.checkIfValueIsEntered());
        if ((csmTransactionOnStaffAccount.checkIfValueIsEntered().getAttribute("prevvalue")) != null){
        	csmTransactionOnStaffAccount.checkIfValueIsEntered().isDisplayed();
        }
        else
        {       
         
        }
      } catch (Exception e){
    	  
      }
    }
    
    
    
    
    @And("^user click value date field and enter the value$")
    public void user_click_value_date_field_and_enter_the_value() throws Throwable {
        
    }
    @And("^user click approve screen$")
    public void user_click_approve_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.approveScreenInUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.approveScreenInUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.approveScreenInUser());
    }

    @And("^user click search icon in approve screen$")
    public void user_click_search_icon_in_approve_screen() throws Throwable {
        
    }

    @And("^user click transaction number and enter the value$")
    public void user_click_transaction_number_and_enter_the_value() throws Throwable {
        
    }

    @And("^user retrieve the record under approve screen$")
    public void user_retrieve_the_record_under_approve_screen() throws Throwable {
        
    }
    @And("^user click search icon in maintenance screen$")
    public void user_click_search_icon_in_maintenance_screen() throws Throwable {
        
    }
    @Then("^user click the booked entries$")
    public void user_click_the_booked_entries() throws Throwable {
        
    }

    @And("^user retrieve the record in maintenance screen under transactions$")
    public void user_retrieve_the_record_in_maintenance_screen_under_transactions() throws Throwable {
        
    }
    
    //TRS_042
    
    @And("^user update test data set id for TRS_042$")
    public void user_update_test_data_set_id_for_trs042() throws Throwable {
        
    }
    
    @And("^user click and enter the value in debit account branch code under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_branch_code_under_maintenance() throws Throwable {
        
    }

    @And("^user click and enter the value in debit account currency under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_currency_under_maintenance() throws Throwable {
        
    }

    @And("^user click and enter the value in debit account gl code under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_gl_code_under_maintenance() throws Throwable {
        
    }

    @And("^user click and enter the value in debit account cif code under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_cif_code_under_maintenance() throws Throwable {
        
    }
    
    @And("^user click and enter the value in debit account serial number under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_serial_number_under_maintenance() throws Throwable {
        
    }
    
    //TRS_078
    
    @And("^user update test data set id for TRS_078$")
    public void user_update_test_data_set_id_for_trs078() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_078_D1");
    }
    
    @And("^User Click on Date to Change the Current Date$")
    public void user_click_on_date_to_change_the_current_date() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMDateToChangeTheCurrentDate());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMDateToChangeTheCurrentDate());
    	        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
			
		}
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSMDateToChangeTheCurrentDate());
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMDateToChangeTheCurrentDate());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMDateToChangeTheCurrentDate());
    }

    @And("^User Enter the Date in User Running Date$")
    public void user_enter_the_date_in_user_running_date() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSMDateInUserRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMDateInUserRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMDateInUserRunningDate());
        csmTransactionOnStaffAccount.CSMDateInUserRunningDate().clear();
        //transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date =LocalDate.now();
        String format = date.format(dtFormatter);
        csmTransactionOnStaffAccount.CSMDateInUserRunningDate().sendKeys(format);
    }

    @And("^User Click on Use Button in Change Running Date Popup$")
    public void user_click_on_use_button_in_change_running_date_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSMUseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMUseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMUseButtonInChangeRunningDate());
    }
    
    @Given("User Click Ok Button for confirmation PopUp for Company Holiday")
    public void user_click_ok_button_for_confirmation_pop_up_for_company_holiday() {
    	for (int i = 0; i < 50; i++) {

            try {

                if (csmTransactionOnStaffAccount.csmOkButtonForConfirmationPopUpForCompanyHoliday().isDisplayed()) {
                    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                    break;
               }            
              } catch (Exception e)
            {
            	  if (i==49) {
  					Assert.fail(e.getMessage());
  				}  
            }
        }
      }
    

    @And("^User Click Ok Button in Information PopUp menu$")
    public void user_click_ok_button_in_information_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
    }

    @And("^User Click on Close Button in Change Running Date Popup$")
    public void user_click_on_close_button_in_change_running_date_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSMCloseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMCloseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMCloseButtonInChangeRunningDate());
    }

    @And("^User Click on Technical Details Icon$")
    public void user_click_on_technical_details_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSMTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Clear Cache in Technical Details Icon$")
    public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSM_ClearCacheInTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSM_ClearCacheInTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSM_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Ok Button Under Information PopUp Menu$")
    public void user_click_ok_button_under_information_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionOnStaffAccount.CSMOkButtonUnderInformationPopUp());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMOkButtonUnderInformationPopUp());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMOkButtonUnderInformationPopUp());
    }	
    @And("^user click and enter the value in trx type under transactions$")
    public void user_click_and_enter_the_value_in_trx_type_under_transactions() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.TransactionsTrxType());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.TransactionsTrxType());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.TransactionsTrxType());
        csmTransactionOnStaffAccount.TransactionsTrxType().sendKeys(testData.get("Trx Type"));
    }
    
    @Then("^user click and enter the value for branch code in currency account$")
    public void user_click_and_enter_the_value_for_branch_code_in_currency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountBranchCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountBranchCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountBranchCode());
        csmTransactionOnStaffAccount.debitAccountBranchCode().sendKeys(testData.get("Debit Currecncy Code"));
    }
    
    @Then("^user validate the stopper message popup$")
    public void user_validate_the_stopper_message_popup() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.csmStopperMessagePopupInTransactions());
        Assert.assertTrue(csmTransactionOnStaffAccount.csmStopperMessagePopupInTransactions().isDisplayed());
    }
    
    @And("^user click and enter the value for currency code in curency account$")
    public void user_click_and_enter_the_value_for_currency_code_in_curency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountCurrency());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountCurrency());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountCurrency());
        csmTransactionOnStaffAccount.debitAccountCurrency().sendKeys(testData.get("Debit Currecncy Code"));
    }
    
    @And("^user click and enter the value for GL code in currency account$")
    public void user_click_and_enter_the_value_for_gl_code_in_currency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountGlCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountGlCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountGlCode());
        csmTransactionOnStaffAccount.debitAccountGlCode().sendKeys(testData.get("Debit GL Code"));
    }
    
    @And("^user click and enter the value for CIF code in currency account$")
    public void user_click_and_enter_the_value_for_cif_code_in_currency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountCifCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountCifCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountCifCode());
        csmTransactionOnStaffAccount.debitAccountCifCode().sendKeys(testData.get("Debit CIF Code "));
    }
    
    @And("^user click and enter the value for serial number in currency account$")
    public void user_click_and_enter_the_value_for_serial_number_in_currency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountSerialNo());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountSerialNo());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountSerialNo());
        csmTransactionOnStaffAccount.debitAccountSerialNo().sendKeys(testData.get("Debit Serial No"));
    }
    
    
    //TRS_079
    
    @And("^user update test data set id for TRS_079$")
    public void user_update_test_data_set_id_for_trs079() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_079_D2");
    }
    
    @And("^user enter the branch code value in credit account details$")
    public void user_enter_the_branch_code_value_in_credit_account_details() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountBranchCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountBranchCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountBranchCode());
        csmTransactionOnStaffAccount.debitAccountBranchCode().sendKeys(testData.get("Debit Branch Code"));
    }

    @And("^user enter the currency value in credit account details$")
    public void user_enter_the_currency_value_in_credit_account_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountCurrency());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountCurrency());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountCurrency());
        csmTransactionOnStaffAccount.debitAccountCurrency().sendKeys(testData.get("Debit Currecncy Code"));
    }

    @And("^user enter the GL code in credit account details$")
    public void user_enter_the_gl_code_in_credit_account_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountGlCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountGlCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountGlCode());
        csmTransactionOnStaffAccount.debitAccountGlCode().sendKeys(testData.get("Debit GL Code"));
    }

    @And("^user enter the CIF code in credit account details$")
    public void user_enter_the_cif_code_in_credit_account_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountCifCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountCifCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountCifCode());
        csmTransactionOnStaffAccount.debitAccountCifCode().sendKeys(testData.get("Debit CIF Code "));
    }

    @And("^user enter the serial number in credit account details$")
    public void user_enter_the_serial_number_in_credit_account_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.debitAccountSerialNo());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.debitAccountSerialNo());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.debitAccountSerialNo());
        csmTransactionOnStaffAccount.debitAccountSerialNo().sendKeys(testData.get("Debit Serial No"));
    }
    
    @And("^user click ok button in warning popup menu$")
    public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
    }
    
    @And("^user click save button in transactions menu$")
    public void user_click_save_button_in_transactions_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.saveButtonInTransactions());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.saveButtonInTransactions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.saveButtonInTransactions());
    }
    
    @Given("user click ok button in warning popup menu under transactions")
    public void user_click_ok_button_in_warning_popup_menu_under_transactions() {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.warningPopupInEcoSector());
    	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.warningPopupInEcoSector());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.warningPopupInEcoSector());
    	        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
//        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.CSMOkButtonInAccessDeniedPopUpMenu());
    }
    
    @Then("^user navigate to approve submenu$")
    public void user_navigate_to_approve_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.approveScreenInTransactions());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.approveScreenInTransactions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.approveScreenInTransactions());
    }

    @Then("^validate the popup transaction record was sucessfully approved$")
    public void validate_the_popup_transaction_record_was_sucessfully_approved() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.successMessagePopup());
        Assert.assertTrue(csmTransactionOnStaffAccount.successMessagePopup().isDisplayed());
    }

    @And("^user click refresh icon in approve submenu$")
    public void user_click_refresh_icon_in_approve_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.refreshButtonInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.refreshButtonInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.refreshButtonInApproveScreen());
    }

    @And("^user retrieve the created record in approve submenu$")
    public void user_retrieve_the_created_record_in_approve_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.doubleClickTransactionNo());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.doubleClickTransactionNo());
        seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.doubleClickTransactionNo());
    }

    @And("^user click approve button in approve submenu$")
    public void user_click_approve_button_in_approve_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.approveButtonInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.approveButtonInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.approveButtonInApproveScreen());
    }
    
    //@TRS_080
    
    @And("^user update test data set id for TRS_080$")
    public void user_update_test_data_set_id_for_trs080() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_079_D3");
    }
    
    @Then("^user validate the cannot proceed stopper message popup under transactions$")
    public void user_validate_the_cannot_proceed_stopper_message_popup_under_transactions() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.csmStopperMessagePopupInTransactions());
        Assert.assertTrue(csmTransactionOnStaffAccount.csmStopperMessagePopupInTransactions().isDisplayed());
    }
    
    //TRS_077
    
    @And("^user update test data set id for TRS_077$")
    public void user_update_test_data_set_id_for_trs077() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_079_D4");
    }
    
    @Then("^user enter the GL code$")
    public void user_enter_the_gl_code() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.creditAccountGlCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.creditAccountGlCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.creditAccountGlCode());
        csmTransactionOnStaffAccount.creditAccountGlCode().sendKeys(Keys.DELETE);
        csmTransactionOnStaffAccount.creditAccountGlCode().sendKeys("8456");
    }
    
    @And("^user enter the cif code$")
    public void user_enter_the_cif_code() throws Throwable {
       seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.creditAccountCifCode());
       seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.creditAccountCifCode());
       seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.creditAccountCifCode());
       csmTransactionOnStaffAccount.creditAccountCifCode().sendKeys(Keys.DELETE);
       csmTransactionOnStaffAccount.creditAccountCifCode().sendKeys("993602");
       
    }
    
    @And("^user enter the serial no in credit account details$")
    public void user_enter_the_serial_no_in_credit_account_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.creditAccountSerialNo());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.creditAccountSerialNo());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.creditAccountSerialNo());
        csmTransactionOnStaffAccount.creditAccountSerialNo().sendKeys(Keys.DELETE);
        csmTransactionOnStaffAccount.creditAccountSerialNo().sendKeys("000");
    }
    
    //TRS_078_01
    
    @Then("^user click limits button$")
    public void user_click_limits_button() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.limitsButtonInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.limitsButtonInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.limitsButtonInUpdateAfterApprove());
    }

    @And("^user click update after approve$")
    public void user_click_update_after_approve() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.updateAfterApproveInUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.updateAfterApproveInUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.updateAfterApproveInUser());
    }

    @And("^user enter the value in user id$")
    public void user_enter_the_value_in_user_id() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.userIdInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.userIdInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.userIdInUpdateAfterApprove());
        csmTransactionOnStaffAccount.userIdInUpdateAfterApprove().sendKeys(testData.get("User Id"));
        csmTransactionOnStaffAccount.userIdInUpdateAfterApprove().sendKeys(Keys.ENTER);
    }

    @And("^user retrieve the selected user id$")
    public void user_retrieve_the_selected_user_id() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.doubleClickUserInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.doubleClickUserInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.doubleClickUserInUpdateAfterApprove());
    }

    @And("^user click add icon$")
    public void user_click_add_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.addIconInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.addIconInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.addIconInUpdateAfterApprove());
    }

    @And("^user enter account currency value under limits$")
    public void user_enter_account_currency_value_under_limits() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.accountCurrencyInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.accountCurrencyInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.accountCurrencyInUpdateAfterApprove());
        csmTransactionOnStaffAccount.accountCurrencyInUpdateAfterApprove().sendKeys("840");
    }

    @And("^user enter transaction value under limits$")
    public void user_enter_transaction_value_under_limits() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.transactionBoxInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.transactionBoxInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.transactionBoxInUpdateAfterApprove());
        csmTransactionOnStaffAccount.transactionBoxInUpdateAfterApprove().sendKeys("000");
    }

    @And("^user enter withdrawal limit under limits$")
    public void user_enter_withdrawal_limit_under_limits() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.withdrawalLimitInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.withdrawalLimitInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.withdrawalLimitInUpdateAfterApprove());
        csmTransactionOnStaffAccount.withdrawalLimitInUpdateAfterApprove().sendKeys("100");
    }

    @And("^user click ok button under limits$")
    public void user_click_ok_button_under_limits() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.okButtonInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.okButtonInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.okButtonInUpdateAfterApprove());
    }

    @And("^user click update after approve button$")
    public void user_click_update_after_approve_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.updateAfterApproveButtonInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.updateAfterApproveButtonInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.updateAfterApproveButtonInUpdateAfterApprove());
    }

    @And("^user click confirm ok button$")
    public void user_click_confirm_ok_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.confirmOkButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.confirmOkButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.confirmOkButton());
    }
    
    @Then("^user verify the warn user if limit exceeds flag unchecked$")
    public void user_verify_the_warn_user_if_limit_exceeds_flag_unchecked() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.warnUserIfLimitExceedFlagInUpdateAfterApprove());
    	seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionOnStaffAccount.warnUserIfLimitExceedFlagInUpdateAfterApprove());
        Assert.assertTrue(csmTransactionOnStaffAccount.warnUserIfLimitExceedFlagInUpdateAfterApprove().isDisplayed());
    }
    
    //TRS_079_02
    @Then("^user verify the warn user if limit exceeds flag checked$")
    public void user_verify_the_warn_user_if_limit_exceeds_flag_checked() throws Throwable {
        
    }

    @And("^user enter deposit limit under limits$")
    public void user_enter_deposit_limit_under_limits() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove().sendKeys("300");
        
    }
    
    //TRS_122_01
    
    
    @Then("^user click Eco sector button$")
    public void user_click_eco_sector_button() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.ecoSectorInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.ecoSectorInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.ecoSectorInUpdateAfterApprove());
    }

    @Then("^user verify the warn user if limit exceed flag checked under Eco sector$")
    public void user_verify_the_warn_user_if_limit_exceed_flag_checked_under_eco_sector() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.warnUserIfLimitExceedFlagInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.warnUserIfLimitExceedFlagInUpdateAfterApprove());
        seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionOnStaffAccount.warnUserIfLimitExceedFlagInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.warnUserIfLimitExceedFlagInUpdateAfterApprove());
    }

    @And("^user click add icon under Eco sector limit$")
    public void user_click_add_icon_under_eco_sector_limit() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.addIconInEcoSectorLimit());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.addIconInEcoSectorLimit());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.addIconInEcoSectorLimit());
    }
    
    @And("^user enter eco sector value$")
    public void user_enter_eco_sector_value() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.ecoSectorLimit());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.ecoSectorLimit());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.ecoSectorLimit());
        csmTransactionOnStaffAccount.ecoSectorLimit().sendKeys(testData.get("Eco Sector Value"));
    }

    @And("^user enter transaction value under Eco sector$")
    public void user_enter_transaction_value_under_eco_sector() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.transactionInEcoSectorLimit());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.transactionInEcoSectorLimit());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.transactionInEcoSectorLimit());
        csmTransactionOnStaffAccount.transactionInEcoSectorLimit().sendKeys(testData.get("Transaction Type"));
    }

    @And("^user enter deposit limit value under Eco sector$")
    public void user_enter_deposit_limit_value_under_eco_sector() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove().sendKeys(testData.get("Deposit Limit"));
    }
    
    @And("^user enter the value in user id under approve screen$")
    public void user_enter_the_value_in_user_id_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.userIdInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.userIdInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.userIdInApproveScreen());
        csmTransactionOnStaffAccount.userIdInApproveScreen().sendKeys(testData.get("User Id"));
        csmTransactionOnStaffAccount.userIdInApproveScreen().sendKeys(Keys.ENTER);
    }

    @And("^user retrieve the selected user id under approve screen$")
    public void user_retrieve_the_selected_user_id_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.doubleClickRecordInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.doubleClickRecordInApproveScreen());
        seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.doubleClickRecordInApproveScreen());
    }
    
    @Then("^user verify the stopper message popup$")
    public void user_verify_the_stopper_message_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.validatePopupInEcoSector());
        Assert.assertTrue(csmTransactionOnStaffAccount.validatePopupInEcoSector().isDisplayed());
    }

    @And("^user update test data set id for TRS_122$")
    public void user_update_test_data_set_id_for_trs122() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_122_D1");
    }
    
    @And("^user select the row for delete the record$")
    public void user_select_the_row_for_delete_the_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.selectRowForDeleteInEcoSector());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.selectRowForDeleteInEcoSector());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.selectRowForDeleteInEcoSector());
    }
    
    @And("^user delete the inserted record under Eco sector$")
    public void user_delete_the_inserted_record_under_eco_sector() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.deleteButtonInEcoSector());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.deleteButtonInEcoSector());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.deleteButtonInEcoSector());
    }
    
    //@TRS_123_02
    
    @Then("^user verify the proceed if limits exceeds flag checked under Eco sector$")
    public void user_verify_the_proceed_if_limits_exceeds_flag_checked_under_eco_sector() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.proceedIfLimitExceedFlagInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.proceedIfLimitExceedFlagInUpdateAfterApprove());
        seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionOnStaffAccount.proceedIfLimitExceedFlagInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.proceedIfLimitExceedFlagInUpdateAfterApprove());
    }
    
    //@TRS_124
    
    @Then("^user verify the successfully approved message popup in approve submenu$")
    public void user_verify_the_successfully_approved_message_popup_in_approve_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.successMessagePopupInApproveScreen());
        Assert.assertTrue(csmTransactionOnStaffAccount.successMessagePopupInApproveScreen().isDisplayed());
    }
    
    @And("^user update test data set id for TRS_123$")
    public void user_update_test_data_set_id_for_trs123() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_123_D2");
    }

    @And("^user update test data set id for TRS_124$")
    public void user_update_test_data_set_id_for_trs124() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_122_D1");
    }
    
    @And("^user update test data set id for TRS_122_01$")
    public void user_update_test_data_set_id_for_trs12201() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_122_01");
    }

    @And("^user update test data set id for TRS_122_02$")
    public void user_update_test_data_set_id_for_trs12202() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_122_02");
    }

    @And("^user update test data set id for TRS_123_01$")
    public void user_update_test_data_set_id_for_trs12301() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_123_01");
    }

    @And("^user update test data set id for TRS_123_02$")
    public void user_update_test_data_set_id_for_trs12302() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_123_02");
    }

    @And("^user update test data set id for TRS_124_01$")
    public void user_update_test_data_set_id_for_trs12401() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_124_01");
    }

    @And("^user update test data set id for TRS_124_02$")
    public void user_update_test_data_set_id_for_trs12402() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_124_02");
    }
    
    //@TRS_125
    
    @Then("^validate the stopper message popup$")
    public void validate_the_stopper_message_popup() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.csmStopperMessagePopupInTransactions());
        Assert.assertTrue(csmTransactionOnStaffAccount.csmStopperMessagePopupInTransactions().isDisplayed());
    }

    @And("^user update test data set id for TRS_125$")
    public void user_update_test_data_set_id_for_trs125() throws Throwable {
        testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_125_D4");
    }
    
    @Then("user enter transaction type under Eco sector")
    public void user_enter_transaction_type_under_eco_sector() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.transactionInEcoSectorLimit());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.transactionInEcoSectorLimit());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.transactionInEcoSectorLimit());
        csmTransactionOnStaffAccount.transactionInEcoSectorLimit().sendKeys(testData.get("Transaction Type1"));
    }
    
    @Then("user enter deposit limit value in Eco sector")
    public void user_enter_deposit_limit_value_in_eco_sector() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove());
        csmTransactionOnStaffAccount.depositLimitInUpdateAfterApprove().sendKeys(testData.get("Deposit Limit1"));
    }
    
    @And("^user update test data set id for TRS_125_01$")
    public void user_update_test_data_set_id_for_trs12501() throws Throwable {
    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_125_01");
    }
    
    //TRS_125_02
   
    @Then("user select the another row to delete the record")
    public void user_select_the_another_row_to_delete_the_record() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.deleteRowInEcoSector());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.deleteRowInEcoSector());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.deleteRowInEcoSector());
    }
    
    @Given("user update test data set id for TRS_125_02")
    public void user_update_test_data_set_id_for_trs12502() throws Throwable {
        testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_125_02");
    }
    
    //TRS_126
    @Given("user enter GL code")
    public void user_enter_gl_code() {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.glCodeInTransactions());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.glCodeInTransactions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.glCodeInTransactions());
        csmTransactionOnStaffAccount.glCodeInTransactions().clear();
        csmTransactionOnStaffAccount.glCodeInTransactions().sendKeys(testData.get("Debit GL Code1"));
    }
    
    @Given("user enter CIF code")
    public void user_enter_cif_code() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.cifCodeInTransactions());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.cifCodeInTransactions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.cifCodeInTransactions());
        csmTransactionOnStaffAccount.cifCodeInTransactions().sendKeys(testData.get("Debit CIF Code1"));
    }
    
    @Given("user enter serial no")
    public void user_enter_serial_no() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.serialNoInTransactions());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.serialNoInTransactions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.serialNoInTransactions());
        csmTransactionOnStaffAccount.serialNoInTransactions().sendKeys(testData.get("Debit Serial No1"));
    }
    
    @Given("user update test data set id for TRS_126$")
    public void user_update_test_data_set_id_for_trs126() throws Throwable {
        testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_126_D5");
    }
    
    //TRS_126_01
    @Given("user update test data set id for TRS_126_01")
    public void user_update_test_data_set_id_for_trs126_01() throws Throwable {
        
    }
    
    @Given("user click the transationtype submenu under systemparameters")
    public void user_click_the_transationtype_submenu_under_systemparameters() {
        
    }
    
    @Given("user click the updateafterapprove menu under transationtype")
    public void user_click_the_updateafterapprove_menu_under_transationtype() {
        
    }
    
    @Given("user Enter the code in inputfield on updateafterapprove screen under transactiontype")
    public void user_enter_the_code_in_inputfield_on_updateafterapprove_screen_under_transactiontype() {
        
    }
    
    @Given("User double click the record under updateafterapprove screen")
    public void user_double_click_the_record_under_updateafterapprove_screen() {
        
    }
    
    @Given("User unCheck the ProceedOnInsufficientFund chequebox")
    public void user_un_check_the_proceed_on_insufficient_fund_chequebox() {
        
    }

    @Given("user check the Force overdrawn")
    public void user_check_the_force_overdrawn() {
        
    }
    
    @Given("User click UpdateAfterApprove button on updateafterapprove field")
    public void user_click_update_after_approve_button_on_updateafterapprove_field() {
       
    }

    @Given("user click the save ok button")
    public void user_click_the_save_ok_button() {
        
    }
    
    @Given("user click the confirm ok")
    public void user_click_the_confirm_ok() {
        
    }
    
    @Given("user click the approve in user screen")
    public void user_click_the_approve_in_user_screen() {
        
    }
    
    @Given("user click and send the values in user id under Approve screen")
    public void user_click_and_send_the_values_in_user_id_under_approve_screen() {
        
    }
    
    @Given("user double click the user id in approve screen")
    public void user_double_click_the_user_id_in_approve_screen() {
       
    }
    
    @Given("user click the approve box")
    public void user_click_the_approve_box() {
        
    }
    
    @Given("user click the AccountParameter submenu under Parameters")
    public void user_click_the_account_parameter_submenu_under_parameters() {
        
    }
    
    @Given("user click the AccountType under AccountParameters")
    public void user_click_the_account_type_under_account_parameters() {
        
    }
    
    @Given("user click the UPA field under AccountTypes")
    public void user_click_the_upa_field_under_account_types() {
        
    }

    @Given("user Enter the TypeCode in UPA field")
    public void user_enter_the_type_code_in_upa_field() {
        
    }
    
    @Given("user double click the TypeCode in UPA field")
    public void user_double_click_the_type_code_in_upa_field() {
        
    }
    
    @Given("user click the Instructions in AccountTypes")
    public void user_click_the_instructions_in_account_types() {
       
    }
    
    @Given("user uncheck with AllowAccess checkBox under Instructions")
    public void user_uncheck_with_allow_access_check_box_under_instructions() {
        
    }
    
    @Given("user click UPA Button")
    public void user_click_upa_button() {
        
    }
    
    @Given("user click the sucesss ok")
    public void user_click_the_sucesss_ok() {
        
    }
    
    @Given("user click the Approve field under AccountTypes")
    public void user_click_the_approve_field_under_account_types() {
        
    }
    
    @Given("user Enter the TypeCode in Approve Field")
    public void user_enter_the_type_code_in_approve_field() {
       
    }

    @Given("user double click the Typecode in Approve field")
    public void user_double_click_the_typecode_in_approve_field() {
        
    }
    
    @Given("user click the Approve button")
    public void user_click_the_approve_button() {
        
    }
    
    
    
    
    
    
    
}
