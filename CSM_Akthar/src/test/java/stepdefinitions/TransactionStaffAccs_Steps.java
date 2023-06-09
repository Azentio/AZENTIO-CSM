package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csm.TransactionStaffAcc_obj;
import resources.BaseClass;

public class TransactionStaffAccs_Steps {
	
	private static final boolean Status = false;
	WebDriver driver = BaseClass.driver;
	CSMLogin csmLogin = new CSMLogin(driver);
	ConfigFileReader configFileRead = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	TransactionStaffAcc_obj transactionStaffAcc = new TransactionStaffAcc_obj(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	String transactionNo;
	 String path = System.getProperty("user.dir") +
	 "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForTransaction= new ExcelData(path, "CSM_Transaction", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	Map<String, String> chequeBookRequestTestData = new HashMap<>();
    Map<String, String> chargeWaiverExecutionData = new HashMap<>();
    Map<String, String> testData;
	
	

	@Given("User login to Csm Param application")
	public void User_login_to_Csm_Param_application ()throws Throwable {
		String paramsApplicationUrl = configFileRead.getCSMparamsUrl();
		 driver.get(paramsApplicationUrl);
		 csmLogin.loginIntoCSMParamApplication();
	}
	
	//TSA_148//
	
	  @Then("^Click the Parameters$")
	    public void click_the_parameters() throws Throwable {
		  waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_Module());
		  clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_Module());
	    }

	  @And("^Click the System Parameters$")
	    public void click_the_system_parameters() throws Throwable {
		  waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_Systemparameters());
		  clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_Systemparameters());
	    }

		@Then("^Click the Control Record$")
	    public void click_the_control_record() throws Throwable {
			 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_ControlRecord());
			 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_ControlRecord());
	    }
		  @And("^Click the Update After Approve$")
		    public void click_the_update_after_approve() throws Throwable {
				 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_UpdateAfterApprove());
				 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_UpdateAfterApprove());
		    
		    }

	    @Then("^Select The Alert Activation$")
	    public void select_the_alert_activation() throws Throwable {
	    	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_AlertActivation());
			 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_AlertActivation());
	    }

	    @And("^Click the Account Balance Overdown$")
	    public void click_the_account_balance_overdown() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_ABO());
			clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_ABO());		
	    }

	    @Then("^The Flag of Staff Account Transaction should be checked$")
	    public void the_flag_of_staff_account_transaction_should_be_checked() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_SATCheckboArea());
	    	javascripthelper.scrollIntoView(transactionStaffAcc.TransactionStaffAcc_SATCheckboArea());
	    	for (int i = 0; i <200; i++) {
				try {
					clicksAndActionsHelper.moveToElement(transactionStaffAcc.TransactionStaffAcc_SATCheckboArea());
					clicksAndActionsHelper.doubleClick(transactionStaffAcc.TransactionStaffAcc_SATCheckboArea());
			    	clicksAndActionsHelper.moveToElement(transactionStaffAcc.TransactionStaffAcc_SAT());
					clicksAndActionsHelper.doubleClick(transactionStaffAcc.TransactionStaffAcc_SAT());
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    	
	    	
			//Thread.sleep(3000);
			
	    }	

	    @And("^Click the CIF parameters$")
	    public void click_the_cif_parameters() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_Cifparameters());
	    	clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_Cifparameters());
	    }
	    @And("^Click the CIF type$")
	    public void click_the_cif_type() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_Ciftype());
	    	clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_Ciftype());
	    }
	    
	    @Then("^Click the Update After Approve under the  CIF type$")
	    public void click_the_update_after_approve_under_the_cif_type() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_UPA());
	    	clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_UPA());
	    }
	    @And("^Enter the value in Brife Desc Eng$")
	    public void enter_the_value_Brife_Desc_Eng() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_BrifeDescEng());
	    	clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_BrifeDescEng());
	    	transactionStaffAcc.TransactionStaffAcc_BrifeDescEng().sendKeys("staff");
	    	transactionStaffAcc.TransactionStaffAcc_BrifeDescEng().sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(3000);
	    }
	   
	    @Then("Doubleclick of the existing record")
	        public void Doubleclick_of_the_existing_record() throws Throwable{
	    	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_Existingdata());
	    	clicksAndActionsHelper.doubleClick(transactionStaffAcc.TransactionStaffAcc_Existingdata());
	    }

         @And("^Click the Main Information$")
	        public void Click_the_Main_Information() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
	    	clicksAndActionsHelper.clickOnElement(transactionStaffAcc.TransactionStaffAcc_MI());
	    	Thread.sleep(3000);
	    }	    
//         @Then("^Click the Transaction Type$")
//         public void click_the_transaction_type() throws Throwable {
//         waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
//         
//         }
//
//         @Then("^Click the Search button$")
//         public void click_the_search_button() throws Throwable {
//         waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
//         }
//
//         @And("^ Enter the code value$")
//         public void enter_the_code_value() throws Throwable {
//         waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
//         }
//      
//         @And("^ select the Transaction Status$")
//         public void select_the_transaction_status() throws Throwable {
//        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
//         }
//
//         @Then("^click ok button$")
//         public void click_ok_button() throws Throwable {
//        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
//         }
//
//         @And("^ Click the Update After Approve$")
//         public void click_the_update_after_Approve() throws Throwable {
//        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
//         }
//         
//         @Then("^enter the transaction No in below Checkbox$")
//         public void enter_the_transaction_no_in_below_checkbox() throws Throwable {
//           
//         }        
//
//         @And("^click the Approve below the Transactions$")
//         public void click_the_approve_below_the_transactions() throws Throwable {
//           
//         }
//
//         @And("^User double click the data$")
//         public void user_double_click_the_data() throws Throwable {
//           
//         }
//
//         @And("^click the Approve button$")
//         public void click_the_approve_button() throws Throwable {
//           
//         }
         
         
       //TRS_017//
         
         @And("^user update test data set id for TRS_017$")
         public void user_update_test_data_set_id_for_TRS017() throws Throwable {
        	 testData = excelDataForTransaction.getTestdata("TRS_017_D1");
         }
         
         
         @And("^user check the flag Main Acc credit$")
         public void user_check_the_flag_main_Acc_credit() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Mainacc_credit_flag());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Mainacc_credit_flag());
        	 
         }
         
    //TRS_018//
         
         @And("^user update test data set id for TRS_018$")
         public void user_update_test_data_set_id_for_TRS018() throws Throwable {
        	 testData = excelDataForTransaction.getTestdata("TRS_018_D1");
         }
         
         
         @And("^User click the Transaction type$")
         public void user_click_the_transaction_type() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_TranscationType());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_TranscationType());
         }
         
         @Then("^Click the Update after approve$")
         public void Click_the_update_after_approve() throws Throwable {
        	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_UPA());
        	clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_UPA());
        	Thread.sleep(2000);
        	
         }

         @And("^Enter the Code value$")
         public void Enter_the_code_value() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Entercodevalue());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Entercodevalue());
         	 transactionStaffAcc.Transactions_Entercodevalue().sendKeys(testData.get("Transaction Type code"));
         	 Thread.sleep(2000);
        	 transactionStaffAcc.Transactions_Entercodevalue().sendKeys(Keys.ENTER);
         }

         @And("^Enter the single transfer Code value$")
         public void enter_the_single_transfer_code_value() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Entercodevalue());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Entercodevalue());
         	//single transfer(debit account)
        	 transactionStaffAcc.Transactions_Entercodevalue().sendKeys(testData.get("Transaction Type code"));
        	 transactionStaffAcc.Transactions_Entercodevalue().sendKeys(Keys.ENTER);
        	 
         }        

         @Then("^User double click the Existing data$")
         public void user_double_click_the_Existing_data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transaction_existingdata());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transaction_existingdata());
         	clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transaction_existingdata());
         }

          @And("^Allow internal GL Account flag should be checked$")
          public void allow_internal_GL_account_flag_should_be_checked() throws Throwable {
       	  waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_GLflagChecked());
          clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_GLflagChecked());            
       }
         
         
         @And("^just check the flag UPA$")
         public void just_check_the_flag_upa() throws Throwable {	
			for (int i = 0; i < 200; i++) {
				try {
					clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_Checkuncheck());
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
        	 //waitHelper.waitForElementwithFluentwait(driver, transactionStaffAcc.Transactions_Checkuncheck());     	 
        	 		}
         
         @Then("^Click the Update After approve button$")
         public void Click_the_Update_After_approve_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_UPAbtn());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_UPAbtn());
         	 
            
         }

         @And("^System giving information message click ok button$")
         public void system_giving_information_message_click_ok_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_informationOkbtn());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_informationOkbtn()); 
         }

         @Then("^system show the success popup click ok button$")
         public void system_show_the_success_popup_click_ok_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Recordwasupdatesccess());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Recordwasupdatesccess()); 
         }



         @And("^User Click the Approve Below the Transaction type$")
         public void user_click_the_approve_below_the_transaction_type() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Approve());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Approve()); 
         }

         @Then("^Enter the Approved record in the code$")
         public void enter_the_approved_record_in_the_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_codevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_codevalue());
        	 transactionStaffAcc.Transactions_codevalue().sendKeys(testData.get("Transaction Type code"));
        	 transactionStaffAcc.Transactions_codevalue().sendKeys(Keys.ENTER);
         }
         
         @Then("^Enter the single transfar Approved record in the code$")
         public void enter_the_single_transfar_approved_record_in_the_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_codevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_codevalue());
        	 //single transfer(debit account)
        	 transactionStaffAcc.Transactions_codevalue().sendKeys("685");
        	 transactionStaffAcc.Transactions_codevalue().sendKeys(Keys.ENTER);
         }  
         
         @And("^User Double Click the Data$")
         public void User_Double_Click_the_Data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_existingdata());
        	 Thread.sleep(1000);
         	 clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_existingdata());
         }
         


         @And("^User click the approve button$")
         public void user_click_the_approve_button() throws Throwable {
        	  //waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Approvebtn());
        	 for (int i = 0; i < 200; i++) {
				try {
					 javascripthelper.scrollIntoView(transactionStaffAcc.Transactions_Approvebtn());
					 javascripthelper.JSEClick(transactionStaffAcc.Transactions_Approvebtn());
					 break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					} 
				}
			}
        	  
         
            
         }


         @And("^System show the  confirm popup user click the ok button$")
         public void system_show_the_confirm_popup_user_click_the_ok_button() throws Throwable {   
         waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Confirmokbtn());
         clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Confirmokbtn()); 
         }

         @And("^System show the record was successfully$")
         public void system_show_the_record_was_successfully() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_recordwassuccess_okbtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_recordwassuccess_okbtn());  
         }
         
         @Then("^User navigate to CSM application and login with valid credentials$")
         public void user_navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
         driver.get(configFileRead.getCSMApplicationUrl());
         csmLogin.loginIntoCSMApplication();
        		}     
         
         @And("^User click the Transactions$")
         public void User_click_the_Transactions() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Transactions());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Transactions());  
         }

         @Then("^Click the Maintenance Below the Transactions$")
         public void click_the_maintenance_below_the_transactions() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_MaintenanceScrn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_MaintenanceScrn()); 
        	 Thread.sleep(2000);
         }
         
         @And("^enter the value in trx type$")
         public void enter_the_value_in_trx_type() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Trxtypevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Trxtypevalue());
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(testData.get("Transaction Type code"));
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
         }

         @And("^enter the single transfer in trx type$")
         public void enter_the_single_transfer_in_trx_type() throws Throwable {  
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Trxtypevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Trxtypevalue());
        	//single transfer(debit account)
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(testData.get("Transaction Type code"));
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
         }

         @Then("^enter values of Branch code$")
         public void enter_values_of_Branch_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_depositAcc_Branchcode()); 
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_depositAcc_Branchcode());  
        	 transactionStaffAcc.Transactions_depositAcc_Branchcode().sendKeys(testData.get("Credit Branch Code"));
         }

         @And("^enter values of Currency code$")
         public void enter_values_of_Currency_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Currencycode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Currencycode());  
        	 transactionStaffAcc.Transactions_debitAcc_Currencycode().sendKeys(testData.get("Credit Currency Code"));
         }

//         @And("^enter values of Gl code$")
//         public void enter_values_of_Gl_code() throws Throwable {
//        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Glcode());
//        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Glcode());  
//        	 transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys("5916");
////        	 transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys("5916");
//         }
//
//         @And("^enter values of Cif code$")
//         public void enter_values_of_Cif_code() throws Throwable {
//        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Cifcode());
//        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Cifcode());
//        	 transactionStaffAcc.Transactions_debitAcc_Cifcode().sendKeys("993567");
////        	  transactionStaffAcc.Transactions_debitAcc_Cifcode().sendKeys("993575");
//         }

         @Then("^enter values of serial$")
         public void enter_values_of_serial() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_serialcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_serialcode()); 
        	 Thread.sleep(2000);
        	 transactionStaffAcc.Transactions_debitAcc_serialcode().sendKeys(testData.get("Credit Serial Number"));
        	 transactionStaffAcc.Transactions_debitAcc_serialcode().sendKeys(Keys.TAB);
        	 Thread.sleep(1000);
         }
         
         @And("^system gives the view memo popup user close the popup$")
         public void system_gives_the_view_memo_popup_user_close_the_popup() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_viewmemo_closebtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_viewmemo_closebtn()); 
         }
         
         @Then("^System show the warning popup click ok button$")
         public void system_show_the_warning_popup_click_ok_button() throws Throwable {
        	 //waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Warning_okbtn());
        	 for (int i = 0; i <300; i++) {
        		 try {
 					clicksAndActionsHelper.moveToElement(transactionStaffAcc.Transactions_Warning_okbtn());
 					clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Warning_okbtn());
 					break;
 			} catch (Exception e) {
 				if (i==299) {
 					Assert.fail(e.getMessage());
				}
 				
 			}
			}
        	 
        	// transactionStaffAcc.Transactions_Warning_okbtn().click();
        	 //Thread.sleep(2000);
         }
         
         @And("^user enter the currency$")
         public void user_enter_the_currency() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_currency());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_currency());  
        	 transactionStaffAcc.Transactions_debitAcc_currency().sendKeys(testData.get("Credit Currency Code"));
        	 transactionStaffAcc.Transactions_debitAcc_currency().sendKeys(Keys.TAB);
        	 Thread.sleep(3000);
         }
         
         @And("^Enter the Amount in this Checkbox$")
         public void Enter_the_Amount_in_this_Checkbox() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_EnterAmount());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_EnterAmount());  
        	 transactionStaffAcc.Transactions_EnterAmount().sendKeys(testData.get("Amend Amount"));
        	 transactionStaffAcc.Transactions_EnterAmount().sendKeys(Keys.TAB);
        	 Thread.sleep(3000);
        	 
        	 
         }        
       
         
         @And("^click the save button$")
         public void click_the_save_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_savebtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_savebtn());  
         }
         
         @And("^system show the popup success user click the ok button$")
         public void system_show_the_popup_success_user_click_the_ok_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_successokbtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_successokbtn());  
        	 Thread.sleep(2000);
         }

         @Then("^user Enter the Transaction number$")
         public void user_enter_the_transaction_number() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_transactionNo_codeValue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_transactionNo_codeValue());  
        	 transactionStaffAcc.Transactions_transactionNo_codeValue().sendKeys(transactionNo);
         }
         @And("^User get Transaction number from sucess pop up$")
         public void user_get_transaction_number_from_sucess_pop_up() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.getTransactionNumber());
        	 transactionNo = transactionStaffAcc.getTransactionNumber().getText().substring(15, 18);
        	 System.out.println(transactionNo);
         }

         @And("^User click the Approve screen$")
         public void user_click_the_approve_screen() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Approvescrn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Approvescrn());  
         }         

         @And("^double click the Value$")
         public void double_click_the_value() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_transactionNo_Doubleclk());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_transactionNo_Doubleclk());  
         }
         
         @Then("^click the Approve button$")
         public void click_the_approve_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Approvebtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Approvebtn());  
         }
         
         @And("^User click the Maintenance screen$")
         public void user_click_the_maintenance_screen() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_MaintenanceScrn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_MaintenanceScrn());  
         }
         
         @Then("^click the search button$")
         public void click_the_search_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_searchbtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_searchbtn());  
         }
         
         @And("^enter the trx number$")
         public void enter_the_trx_number() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_trxno_code());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_trxno_code());  
         }
         
         @And("^double click the data$")
         public void double_click_the_data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk()); 
        	 clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());
         }


         @Then("^click the Booked Entries$")
         public void click_the_booked_entries() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_BookedEntries());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_BookedEntries());  
         }
         
         @And("^User Click the Queries$")
         public void User_Click_the_Queries() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries());  
         }
         
         @And("^Click the Statement of Account$")
         public void click_the_statement_of_account() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_SOA());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_SOA());  
         }
         
         @And("^Click the By trade Date$")
         public void click_the_byb_trade_date() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_BTD());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_BTD());  
         }       

         @And("^enter values of Currency Value$")
         public void enter_values_of_Currency_Value() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries_Currencycode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_Currencycode()); 
        	 transactionStaffAcc.Transactions_Queries_Currencycode().sendKeys("840");
         }

         @And("^enter values of GL code$")
         public void enter_values_of_GL_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries_GLcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_GLcode());  
        	 transactionStaffAcc.Transactions_Queries_GLcode().sendKeys("5916");
         }

         @And("^enter values of cif code$")
         public void enter_values_of_cif_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries_cifcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_cifcode());  
        	 transactionStaffAcc.Transactions_Queries_cifcode().sendKeys("993567");
         }
         @Then("^enter values of Serial$")
         public void enter_values_of_Serial() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries_Serialcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_Serialcode()); 
        	 transactionStaffAcc.Transactions_Queries_Serialcode().sendKeys("0");
         }

         @And("^Click the Retrive button$")
         public void click_the_retrive_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries_retrivebtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_retrivebtn());  
        	 Thread.sleep(2000);
         }  
         
         //TRS_057//
         
         @And("^Check the falg of set default Trx currency is equal to account currency$")
         public void check_the_falg_of_set_default_trx_currency_is_equal_to_account_currency() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_flag_setAcc());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_flag_setAcc());
         }
      
     //TRS_060//
         
         @And("^user update test data set id for TRS_060$")
         public void user_update_test_data_set_id_for_TRS060() throws Throwable {
        	 testData = excelDataForTransaction.getTestdata("TRS_060_D1");
         }
         
         @And("^System giving information message Nochanges click ok button$")
         public void system_giving_information_message_nochanges_click_ok_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Nochages_okbtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Nochages_okbtn());
         }
         
             @And("^enter the value in Trx type$")
             public void enter_the_value_in_Trx_type() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Trxtypevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Trxtypevalue());
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(testData.get("Transaction Type code"));
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(Keys.TAB); 
        	 Thread.sleep(2000);
         }

         @And("^enter values of currency code$")
         public void enter_values_of_currency_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Currencycode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Currencycode());  
        	 transactionStaffAcc.Transactions_debitAcc_Currencycode().sendKeys(testData.get("Credit Currency Code"));
         }

         @And("^enter values of gl code$")
         public void enter_values_of_gl_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Glcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Glcode()); 
        	 Thread.sleep(2000);
        	 transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys(testData.get("Credit Gl Code"));
         }

         @And("^enter values of cif number$")
         public void enter_values_of_cif_number() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Cifcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Cifcode());
        	 Thread.sleep(2000);
        	 transactionStaffAcc.Transactions_debitAcc_Cifcode().sendKeys(testData.get("Credit CIF Code"));
        	 transactionStaffAcc.Transactions_debitAcc_Cifcode().sendKeys(Keys.TAB);
         }

        //TRS_061//
         
         @And("^user update test data set id for TRS_061$")
         public void user_update_test_data_set_id_for_trs061() throws Throwable {
        	 testData = excelDataForTransaction.getTestdata("TRS_061_D1"); 
         }
         
         @Then("^user click the Account parameters$")
         public void user_click_the_account_parameters() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Accountparameters());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Accountparameters());
         }        

         @And("^click the Account type$")
         public void click_the_account_type() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Accounttype());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Accounttype());
         }

         @And("^Enter the type code$")
         public void Enter_the_type_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_typecode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_typecode());
        	 transactionStaffAcc.Transactions_typecode().sendKeys(testData.get("Type Code_D2"));
        	 transactionStaffAcc.Transactions_typecode().sendKeys(Keys.ENTER);
         }
         @Then("^click the update after Approve$")
         public void click_the_update_after_Approve() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_acctype_UPA());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_acctype_UPA());
         }

         @And("^click the Instructions$")
         public void click_the_Instructions() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_instructions());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_instructions());
         }

         @And("^user click the Approve screen$")
         public void user_click_the_Approve_screen() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_acctype_approve());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_acctype_approve());
         }
         
         @And("^Enter the type Code value$")
         public void enter_the_type_code_value() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_withdraw_codevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_withdraw_codevalue()); 
        	 transactionStaffAcc.Transactions_withdraw_codevalue().sendKeys(testData.get("Transaction Type code"));
        	 transactionStaffAcc.Transactions_withdraw_codevalue().sendKeys(Keys.ENTER);
         }
         
         @Then("^User double click the typecode data$")
         public void user_double_click_the_typecode_data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_withdraw_Existingvalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_withdraw_Existingvalue()); 
        		clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_withdraw_Existingvalue());
         }
         @Then("^Enter the Approved record in the type code$")
         public void Enter_the_approved_record_in_the_type_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_withdraw_Approvecode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_withdraw_Approvecode()); 
        	 transactionStaffAcc.Transactions_withdraw_Approvecode().sendKeys(testData.get("Transaction Type code"));
        	 transactionStaffAcc.Transactions_withdraw_Approvecode().sendKeys(Keys.ENTER);
         }


         @And("^User Double Click the Approved typecode Data$")
         public void User_double_click_the_approved_typecode_Data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_withdraw_ApproveExistingvalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_withdraw_ApproveExistingvalue()); 
        	 clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_withdraw_ApproveExistingvalue());
         }
        
         @And("^uncheck the flag of proceed on insufficient fund$")
         public void uncheck_the_flag_of_proceed_on_insufficient_fund() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_proceedflag_uncheck());
        	 Thread.sleep(2000);
        	 clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_proceedflag_uncheck()); 
         }
         @Then("^uncheck the flag Allow Overdrawn$")
         public void uncheck_the_flag_allow_overdrawn() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_allowoverdrawn());
        	 Thread.sleep(2000);
			 clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_allowoverdrawn());  
         }
         @And("^double click the Data$")
         public void double_click_the_Data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_ACCtype_App_Doubleclk());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_ACCtype_App_Doubleclk());  
        	 clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_ACCtype_App_Doubleclk());
         }
         @Then("^Double click the data$")
         public void Double_click_the_Data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());        	  
        	 clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_ACCtype_UPA_Doubleclk());
         }
         
         
         //TRS_062//
         
         @And("^user update test data set id for TRS_062$")
         public void user_update_test_data_set_id_for_trs062() throws Throwable {
        	 testData = excelDataForTransaction.getTestdata("TRS_062_D1");
         }
         
         @Then("^enter values of serial for single transfer$")
         public void enter_values_of_serial_for_single_transfer() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_serialcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_serialcode()); 
        	 transactionStaffAcc.Transactions_debitAcc_serialcode().sendKeys(testData.get("Credit Serial Number"));
        	 Thread.sleep(2000);
         }

         @And("^enter values of gl code for single transfer$")
         public void enter_values_of_gl_code_for_single_transfer() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Glcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Glcode()); 
        	 Thread.sleep(2000);
        	 transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys(testData.get("Credit Gl Code"));
         }

         @And("^enter values of cif number for single transfer$")
         public void enter_values_of_cif_number_for_single_transfer() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Cifcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Cifcode());
        	 Thread.sleep(2000);
        	 transactionStaffAcc.Transactions_debitAcc_Cifcode().sendKeys(testData.get("Credit CIF Code"));
        	 Thread.sleep(3000);
         }
         
         @And("^enter the type code$")
         public void enter_the_type_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Acctype_App_codevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Acctype_App_codevalue());
        	 transactionStaffAcc.Transactions_Acctype_App_codevalue().sendKeys(testData.get("Type Code_D2"));
        	 transactionStaffAcc.Transactions_Acctype_App_codevalue().sendKeys(Keys.ENTER);
         }

         @Then("^user click the Approve button$")
         public void user_click_the_Approve_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Acctype_Appbtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Acctype_Appbtn());  
         }         
         
         
        //TRS_105//
         
         @And("^user update test data set id for TRS_105$")
         public void user_update_test_data_set_id_for_TRS105() throws Throwable {
        	 testData = excelDataForTransaction.getTestdata("TRS_105_D1");
         }

         @Then("^Click the User$")
         public void click_the_user() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User());
         }

         @Then("^User Enter the Name in the UserId$")
         public void User_enter_the_name_in_the_Userid() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_userid());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_userid());
        	 transactionStaffAcc.Transactions_User_userid().sendKeys(testData.get("UserId"));
        	 transactionStaffAcc.Transactions_User_userid().sendKeys(Keys.ENTER);
        	 Thread.sleep(2000);

         }

         @Then("^User click the cif types$")
         public void user_click_the_cif_types() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_CifType());
             clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_CifType());            
             
         }
         
         @And("^enter the code values$")
         public void enter_the_code_values() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Ciftype_Code());
             clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_Code()); 
            javascripthelper.scrollIntoView(transactionStaffAcc.Transactions_Ciftype_Code());
            Thread.sleep(2000);
         }                       
                        
         
         @Then("^user enter the Transaction$")
         public void user_enter_the_transaction() throws Throwable {             
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Ciftype_Transactions());
             clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_Transactions()); 
             
         }
         
         @And("^enter the value in deposit limit$")
         public void enter_the_value_in_deposit_limit() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Ciftype_DepositLimit());
             clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_DepositLimit());   
           
          
         }
         
         @Then("^check the flag of Warn user If Limit Exceeds$")
         public void check_the_flag_of_warn_user_if_limit_exceeds() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Ciftype_Warn_Flag());
             clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_Warn_Flag()); 
             Thread.sleep(2000);
         }

         @And("^click the ok button$")
         public void click_the_ok_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Ciftype_okbtn());
             clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_okbtn()); 
             Thread.sleep(2000);
         }
         
         @And("^Click the approve screen$")
         public void click_the_approve_screen() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_appscrn());
             clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_appscrn());   
           
         }
         
         @Then("^Click the Approve button$")
         public void click_the_Approve_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_appbtn());
             clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_appbtn());   
         }
         
             @And("^User double click the data$")
             public void user_double_click_the_data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_doubleclk());
             clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_User_doubleclk()); 
            
             
             }
         
           @And("^Click the Add symbol$")
           public void click_the_add_symbol() throws Throwable {        	   
        	   waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Ciftype_Addsym());
               clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Ciftype_Addsym());   
               Thread.sleep(2000);
         }    
           
           @Then("^Click the update After approve button$")
           public void Click_the_update_After_approve_button() throws Throwable {
          	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_UPAbtn());
           	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_UPAbtn());           	 
              
           }
           
           @Then("^user Enter the Name in the UserId$")
           public void user_enter_the_name_in_the_Userid() throws Throwable {
          	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_Appcodevalue());
          	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_User_Appcodevalue());
          	 transactionStaffAcc.Transactions_User_Appcodevalue().sendKeys(testData.get("UserId"));
          	 transactionStaffAcc.Transactions_User_Appcodevalue().sendKeys(Keys.ENTER);

           }
           @And("^user double click the Data$")
           public void user_double_click_the_Data() throws Throwable {
      	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_User_Appdoubleclk());
           clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_User_Appdoubleclk());  
 
           }
           
           //TRS_106//
           
           @And("^user update test data set id for TRS_106$")
           public void user_update_test_data_set_id_for_trs106() throws Throwable {
          	 testData = excelDataForTransaction.getTestdata("TRS_106_D1"); 
           }
           
           @Then("User click the Priority")
           public void user_click_the_priority() throws Throwable {
        	   waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_priority());
               clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_priority());  
           }
           
           @Then("Click the Number one")
           public void click_the_number_one() throws Throwable {
        	   waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_priority_one());
               clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_priority_one());  
           }
           
          //TRS-107//
           
           @And("^user update test data set id for TRS_107$")
           public void user_update_test_data_set_id_for_trs107() throws Throwable {
          	 testData = excelDataForTransaction.getTestdata("TRS_107_D1"); 
           }
           
         
}

  



   

