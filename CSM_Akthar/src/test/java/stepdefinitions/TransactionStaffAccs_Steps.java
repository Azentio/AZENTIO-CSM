package stepdefinitions;

import java.util.Iterator;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
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
	// String path = System.getProperty("user.dir") +
	// "\\TestData\\CSMTestData.xlsx";
//	ExcelData excelDataForChequeBookRequest = new ExcelData(path, "CSM_ChequeBookrequest", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);

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
         @Then("^Click the Transaction Type$")
         public void click_the_transaction_type() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
         
         }

         @Then("^Click the Search button$")
         public void click_the_search_button() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
         }

         @And("^ Enter the code value$")
         public void enter_the_code_value() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
         }
      
         @And("^ select the Transaction Status$")
         public void select_the_transaction_status() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
         }

         @Then("^click ok button$")
         public void click_ok_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
         }

         @And("^ Click the Update After Approve$")
         public void click_the_update_after_Approve() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.TransactionStaffAcc_MI());
         }
         
         @Then("^enter the transaction No in below Checkbox$")
         public void enter_the_transaction_no_in_below_checkbox() throws Throwable {
           
         }        

         @And("^click the Approve below the Transactions$")
         public void click_the_approve_below_the_transactions() throws Throwable {
           
         }

         @And("^User double click the data$")
         public void user_double_click_the_data() throws Throwable {
           
         }

         @And("^click the Approve button$")
         public void click_the_approve_button() throws Throwable {
           
         }
         
    //TRS_018//
         
         @And("^User click the Transaction type$")
         public void user_click_the_transaction_type() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_TranscationType());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_TranscationType());
         }
         
         @Then("^Click the Update after approve$")
         public void Click_the_update_after_approve() throws Throwable {
        	waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_UPA());
        	clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_UPA());
        	
         }

         @And("^Enter the Code value$")
         public void Enter_the_code_value() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Entercodevalue());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Entercodevalue());
         	 transactionStaffAcc.Transactions_Entercodevalue().sendKeys("377");
         	 Thread.sleep(2000);
        	 transactionStaffAcc.Transactions_Entercodevalue().sendKeys(Keys.ENTER);
         }

         @And("^Enter the single transfer Code value$")
         public void enter_the_single_transfer_code_value() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Entercodevalue());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Entercodevalue());
         	//single transfer(debit account)
        	 transactionStaffAcc.Transactions_Entercodevalue().sendKeys("685");
        	 transactionStaffAcc.Transactions_Entercodevalue().sendKeys(Keys.ENTER);
        	 
         }        

         @Then("^User double click the existing data$")
         public void user_double_click_the_existing_data() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Existingdata());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Existingdata());
         	clicksAndActionsHelper.doubleClick(transactionStaffAcc.Transactions_Existingdata());
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
					clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Checkuncheck());
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
         public void click_the_update_after_approve_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_UaAbtn());
         	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_UaAbtn());
         	 
            
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
        	 transactionStaffAcc.Transactions_codevalue().sendKeys("377");
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
         }
         
         @And("^enter the value in trx type$")
         public void enter_the_value_in_trx_type() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Trxtypevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Trxtypevalue());
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys("377");
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
         }

         @And("^enter the single transfer in trx type$")
         public void enter_the_single_transfer_in_trx_type() throws Throwable {  
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Trxtypevalue());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Trxtypevalue());
        	//single transfer(debit account)
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys("685");
        	 transactionStaffAcc.Transactions_Trxtypevalue().sendKeys(Keys.TAB);
         }
         
//         @And("^click the Seachbtn$")
//         public void click_the_seachbtn() throws Throwable {
//        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_TrxtypeSearchbtn());
//        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_TrxtypeSearchbtn());  
//         }

         @Then("^enter values of Branch code$")
         public void enter_values_of_branch_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_depositAcc_Branchcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_depositAcc_Branchcode());  
        	 transactionStaffAcc.Transactions_depositAcc_Branchcode().sendKeys("0001");
         }

         @And("^enter values of Currency code$")
         public void enter_values_of_Currency_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Currencycode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Currencycode());  
        	 transactionStaffAcc.Transactions_debitAcc_Currencycode().sendKeys("840");
         }

         @And("^enter values of Gl code$")
         public void enter_values_of_Gl_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Glcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Glcode());  
        	 transactionStaffAcc.Transactions_debitAcc_Glcode().sendKeys("400402");
         }

         @And("^enter values of Cif code$")
         public void enter_values_of_Cif_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_Cifcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_Cifcode());
        	 transactionStaffAcc.Transactions_debitAcc_Cifcode().sendKeys("0");
         }

         @Then("^enter values of serial$")
         public void enter_values_of_serial() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_serialcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_serialcode());  
        	 transactionStaffAcc.Transactions_debitAcc_serialcode().sendKeys("1");
         }
         
         @And("^user enter the currency$")
         public void user_enter_the_currency() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_debitAcc_currency());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_debitAcc_currency());  
        	 transactionStaffAcc.Transactions_debitAcc_currency().sendKeys("840");
         }
         
         @And("^Enter the Amount in this Checkbox$")
         public void enter_the_Amount_in_this_checkbox() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_EnterAmount());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_EnterAmount());  
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
         }


         @Then("^User Click the Queries$")
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
        	 transactionStaffAcc.Transactions_Queries_GLcode().sendKeys("400402");
         }

         @And("^enter values of cif code$")
         public void enter_values_of_cif_code() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries_cifcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_cifcode());  
        	 transactionStaffAcc.Transactions_Queries_cifcode().sendKeys("0");
         }
         @Then("^enter values of Serial$")
         public void enter_values_of_Serial() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries_Serialcode());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_Serialcode()); 
        	 transactionStaffAcc.Transactions_Queries_Serialcode().sendKeys("1");
         }

         @And("^Click the Retrive button$")
         public void click_the_retrive_button() throws Throwable {
        	 waitHelper.waitForElementwithFluentwait(driver,transactionStaffAcc.Transactions_Queries_retrivebtn());
        	 clicksAndActionsHelper.clickOnElement(transactionStaffAcc.Transactions_Queries_retrivebtn());  
        	 Thread.sleep(1000);
         }  
      

         
}

  



   

