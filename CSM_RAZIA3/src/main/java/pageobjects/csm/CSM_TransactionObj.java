package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.cucumber.java.en.Then;

public class CSM_TransactionObj {

	
		WebDriver driver;
		public CSM_TransactionObj (WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
			
			}
	

@FindBy(id="hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;

	public WebElement CSMDateToChangeTheCurrentDate() {
		return CSM_DateToChangeTheCurrentDate;
	}
	
	@FindBy(id="global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;

	public WebElement CSMDateInUserRunningDate() {
		return CSM_DateInUserRunningDate;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")

	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;

	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday()

	{

	    return csmOkButtonForConfirmationPopUpForCompanyHoliday;

	}
	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate;

	public WebElement CSMUseButtonInChangeRunningDate() {
		return CSM_UseButtonInChangeRunningDate;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
		return CSM_ClearCacheInTechnicalDetailsIcon;

	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu() {
		return CSM_OkButtonInInformationPopUpMenu;
	}
	
	@FindBy(id="_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;

	public WebElement CSMCloseButtonInChangeRunningDate() {
		return CSM_CloseButtonInChangeRunningDate;
	}
	
	@FindBy(id="tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon;

	public WebElement CSMTechnicalDetailsIcon() {
		return CSM_TechnicalDetailsIcon;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp;

	public WebElement CSMOkButtonUnderInformationPopUp() {
		return CSM_OkButtonUnderInformationPopUp;
	}
	
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu() {
		return CSM_TransactionsMainMenu;
	}
	
	@FindBy(id="D001MT")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions() {
		return CSM_MaintenanceUnderTransactions;
	}
	
	@FindBy(id="lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen() {
		return CSM_TRXTypeInMaintenanceScreen;
	}
	
//	@FindBy(id="Transactions / Maintenance")
//	private WebElement CSM_TransactionsMaintenanceForLoading;
//
//	public WebElement CSM_TransactionsMaintenanceForLoading() {
//		return CSM_TransactionsMaintenanceForLoading;
//	}
	//id="trs_ac_br_D001MT"
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement CSM_BranchCodeInCreditAc;

	public WebElement CSMBranchCodeInCreditAc() {
		return CSM_BranchCodeInCreditAc;
	}
	//id="trs_ac_cy_D001MT"
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CY']")
	private WebElement CSM_CurrencyCodeCreditAc;

	public WebElement CSMCurrencyCodeCreditAc() {
		return CSM_CurrencyCodeCreditAc;
	}
	//id="trs_ac_gl_D001MT
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement CSM_GLCodeCreditAc;

	public WebElement CSMGLCodeCreditAc() {
		return CSM_GLCodeCreditAc;
	}
	//id="trs_ac_cif_D001MT
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement CSM_CIFCodeInCreditAc;

	public WebElement CSMCIFCodeInCreditAc() {
		return CSM_CIFCodeInCreditAc;
	}
	//id="lookuptxt_trs_ac_sl_D001MT"
	@FindBy(xpath="//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement CSM_SerialInCreditAc;
	public WebElement CSMSerialInCreditAc() {
		return CSM_SerialInCreditAc;
	}
		@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu() {
		return CSM_OkButtonInWarningPopUpMenu;
	}
	//id="lookuptxt_trs_cy_D001MT"
	@FindBy(id="lookuptxt_trs_cy_D001MT")
	private WebElement CSM_CurrencyInMaintenanceScreen;

	public WebElement CSMCurrencyInMaintenanceScreen() {
		return CSM_CurrencyInMaintenanceScreen;
	}
	
	@FindBy(id="amount_D001MT")
	private WebElement CSM_AmountInMaintenanceScreen;

	public WebElement CSMAmountInMaintenanceScreen() {
		return CSM_AmountInMaintenanceScreen;
	}
	//Account detail add
	@FindBy(xpath="//label[text()='Account Details ']")
	private WebElement CSM_AccountDetailsInMaintenanceScreen;

	public WebElement CSM_AccountDetailsInMaintenanceScreen() {
		return CSM_AccountDetailsInMaintenanceScreen;
	}
	
	@FindBy(id="add_trxMgntAccountDtlGridTbl_Id_D001MT")
	private WebElement CSM_addbtn_AccountDetails;

	public WebElement CSM_addbtn_AccountDetails() {
		return CSM_addbtn_AccountDetails;
	}
	@FindBy(id="td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR")
	private WebElement CSM_addbtn_Branch;

	public WebElement CSM_addbtn_Branch() {
		return CSM_addbtn_Branch;
	}
	@FindBy(id="new_1685338396215_ctstrsACCDETVO.AC_GL")
	private WebElement CSM_addbtn_Gl;

	public WebElement CSM_addbtn_Gl() {
		return CSM_addbtn_Gl;
	}
	@FindBy(id="new_1685338396215_ctstrsACCDETVO.AC_CIF")
	private WebElement CSM_addbtn_Cif;
	

	public WebElement CSM_addbtn_Cif() {
		return CSM_addbtn_Cif;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement CSM_addbtn_Sl;

	public WebElement CSM_addbtn_Sl() {
		return CSM_addbtn_Sl;
	}
//
	@FindBy(id="new_1685338823692_ctstrsACCDETVO.FC_AMOUNT")
	private WebElement CSM_addbtn_Amount;
	public WebElement CSM_addbtn_Amount() {
		return CSM_addbtn_Amount;
	}
	
	@FindBy(id="new_1685338823692_ctstrsACCDETVO.INSTRUCTIONS1")
	private WebElement CSM_addbtn_instr1;

	public WebElement CSM_addbtn_instr1() {
		return CSM_addbtn_instr1;
	}
	@FindBy(id="new_1685338823692_ctstrsACCDETVO.INSTRUCTIONS2")
	private WebElement CSM_addbtn_instr2;

	public WebElement CSM_addbtn_instr2() {
		return CSM_addbtn_instr2;
	}
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']//span")
	private WebElement CSM_addbtn_ok;

	public WebElement CSM_addbtn_ok() {
		return CSM_addbtn_ok;
	}
	
	
	@FindBy(id="amount_D001MT")
	private WebElement CSM_AmountUnderMaintenanceScreen;

	public WebElement CSMAmountUnderMaintenanceScreen() {
		return CSM_AmountUnderMaintenanceScreen;
	}
	
	@FindBy(xpath = "//td[text()='USD']")
	private WebElement CSM_CurrencyName;

	public WebElement CSMCurrencyName() {
		return CSM_CurrencyName;
	}
	
	@FindBy(id="trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen() {
		return CSM_SaveButtonInMaintenanceScreen;
	}
	
	@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
	private WebElement CSM_GetTheTransactionNo;

	public WebElement CSMGetTheTransactionNo() {
		return CSM_GetTheTransactionNo;
	}
	
	@FindBy(id="D001AU")
	private WebElement CSM_ApproveScreenUnderTransactions;

	public WebElement CSMApproveScreenUnderTransactions() {
		return CSM_ApproveScreenUnderTransactions;
	}
	
	@FindBy(id="trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_TransactionNoInApproveScreen;

	public WebElement CSMTransactionNoInApproveScreen() {
		return CSM_TransactionNoInApproveScreen;
	}

	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_DoubleClickOnTheTransactionNo;

	public WebElement CSMDoubleClickOnTheTransactionNo() {
		return CSM_DoubleClickOnTheTransactionNo;
	}		
	

		
	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")

    private WebElement Transactions_transactionNo_Doubleclk;
 
    public WebElement Transactions_transactionNo_Doubleclk() {

        return Transactions_transactionNo_Doubleclk;

    }
	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement CSM_ApproveButtonInApproveScreen;

	public WebElement CSMApproveButtonInApproveScreen() {
		return CSM_ApproveButtonInApproveScreen;
	}		
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}		
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}
	
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSM_OkButtonInAccessDeniedPopUpMenu;
	}



 @FindBy(xpath="//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Economic Sector: Limit Amount should be between 0.0  and 300')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
private WebElement csm_transaction_warningpop_Economicsector_limitAmount;

public WebElement csm_transaction_warningpop_Economicsector_limitAmount_118() {
	return csm_transaction_warningpop_Economicsector_limitAmount;
}

//@FindBy(xpath="//div[text()='Cannot Proceed']//parent::div//following-sibling::div//div[contains(text(),'Economic Sector: Limit Amount should be between 0.0  and 300')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
//private WebElement Csm_maintenance_cannotproceedpop ;
//
//public WebElement Csm_maintenance_cannotproceedpop_117() {
//	return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
//}


		@FindBy(xpath="//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Currency: Limit Amount should be between 0.0  and 300.00')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
		private WebElement CSM_CurrencyLimit_pop_ok;

		public WebElement CSM_CurrencyLimit_pop_ok() {
			return CSM_CurrencyLimit_pop_ok;
		}	

@FindBy(xpath="//div[text()='Cannot Proceed']")
private WebElement CSM_cannotproceed_msg;

public WebElement CSM_cannotproceed_msg117() {
	return CSM_cannotproceed_msg;
}
@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance() {
		return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
	}
	
	@FindBy(id="infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen;

	public WebElement CSMSearchButtonInMaintenanceScreen() {
		return CSM_SearchButtonInMaintenanceScreen;
	}
	
	@FindBy(id="trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_EnterTheTransactionNoInSearchBox;

	public WebElement CSMEnterTheTransactionNoInSearchBox() {
		return CSM_EnterTheTransactionNoInSearchBox;
	}
	
	@FindBy(id="trxMgntDefFormId_D001MT_Booked_Entries_key")
	private WebElement CSM_BookedEntriesInMaintenanceScreen;

	public WebElement CSMBookedEntriesInMaintenanceScreen() {
		return CSM_BookedEntriesInMaintenanceScreen;
	}
	
	
	
	
	
	
	//debit
	@FindBy(id="trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeINdebitAc;
	public WebElement CSM_BranchCodeINdebitAc() {
		return CSM_BranchCodeINdebitAc;
	}
	
	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodedebitAc;

	public WebElement CSM_CurrencyCodedebitAc() {
		return CSM_CurrencyCodedebitAc;
	}
	
	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement CSM_GLCodedebitAc;

	public WebElement CSM_GLCodedebitAc() {
		return CSM_GLCodedebitAc;
	}
	
	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc;

	public WebElement CSM_CIFCodeIndebitAc() {
		return CSM_CIFCodeIndebitAc;
	}
	
	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc;
	public WebElement CSM_SerialIndebitAc() {
		return CSM_SerialIndebitAc;
	}
///t ac @31
//
//	@FindBy(id="to_trs_ac_br_D001MT")
//	private WebElement CSM_BranchCodeInDebitAc;
//
//	public WebElement CSM_BranchCodeInDebitAc() {
//		return CSM_BranchCodeInDebitAc;
//	}
//	
//
//	@FindBy(id="to_trs_ac_gl_D001MT")
//	private WebElement CSM_GlcodeInDebitAc;
//
//	public WebElement CSM_GlcodeInDebitAc() {
//		return CSM_GlcodeInDebitAc;
//	}
//	
//	@FindBy(id="to_trs_ac_cif_D001MT")
//	private WebElement CSM_CifcodeInDebitAc;
//
//	public WebElement CSM_CifcodeInDebitAc() {
//		return CSM_CifcodeInDebitAc;
//	}
//	@FindBy(id="lookuptxt_to_trs_ac_sl_D001MT")
//	private WebElement CSM_SerialcodeInDebitAc;
//
//	public WebElement CSM_SerialcodeInDebitAc() {
//		return CSM_SerialcodeInDebitAc;
//	}

		////param prerequites
	@FindBy(xpath ="//td[text()='Parameters']")
	private WebElement  csmparam_parameters ;

	public WebElement csmparam_parameters() {
		return csmparam_parameters;
	}
	@FindBy(xpath ="//td[text()='System Parameters']")
	private WebElement  csmparam_sysparameter_submenu ;

	public WebElement csmparam_sysparameter_submenu() {
		return csmparam_sysparameter_submenu;
	}
	
	@FindBy(xpath = "//td[text()='User']")
	private WebElement csmParam_Systemparameter_User ;

	public WebElement csmParam_Systemparameter_User() {
		return csmParam_Systemparameter_User;
	}
	
	@FindBy(xpath = "//span[text()='Update after Approve']")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove ;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove() {
		return csmParam_Systemparameter_User_UpadateAfterapprove;
	}
	
	@FindBy(id = "tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid;
	}
	//(xpath="//td[text()='ANANDH']")
	
	@FindBy(id="td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.CODE")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;
	}
	
	@FindBy(xpath = "//select[@id='view_show_recieve_E000MA']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch() {
		return csmParam_User_Userid_doubleclick_logintobranch;
	}
	   @FindBy(id="_popup_path_sol_confirm_ok")
		private WebElement success_ok;
		public WebElement success_ok() {
			return success_ok;
		}
	// check if the retrive button is  in the field  
	
	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;
	}
	@FindBy(id = "_popup_path_sol_confirm_ok")//input[@id='_popup_path_sol_confirm_ok']
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmparam_Transactiontype_UPA_Confirm_success69;

	public WebElement csmparam_Transactiontype_UPA_Confirm_success69() {
		return csmparam_Transactiontype_UPA_Confirm_success69;
	}
	
	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']") //button[@id='ok_btn_4_E000MA']
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;
	}
	
	
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement csmParam_User_Approve;

	public WebElement csmParam_User_Approve() {
		return csmParam_User_Approve;
	}
	
	@FindBy(xpath="//label[text()='Approve ']")
	private WebElement csmParam_User_Approvebttn;

	public WebElement csmParam_User_Approvebttn() {
		return csmParam_User_Approvebttn;
	}
	@FindBy(id = "tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_UserID;

	public WebElement csmParam_User_Approve_UserID() {
		return csmParam_User_Approve_UserID;
	}
	
	//id="td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID
	@FindBy(xpath="//td[text()='RAZIA']")
	private WebElement csmParam_User_Approve_Username_doubleclick;
	public WebElement csmParam_User_Approve_Username_doubleclick() {
		return csmParam_User_Approve_Username_doubleclick;
	}
	
	@FindBy(id="tellerParamMaint_FormId_E000P_Approve_key")
	private WebElement csmParam_User_Approve_Username_doubleclick_Approve;

	public WebElement csmParam_User_Approve_Username_doubleclick_Approve() {
		return csmParam_User_Approve_Username_doubleclick_Approve;
	}
	@FindBy(xpath="//span[text()=' Limits ']")
	private WebElement csm_sysparam_user_updateafterapprove_Limits;

	public WebElement csm_sysparam_user_updateafterapprove_Limits() {
		return csm_sysparam_user_updateafterapprove_Limits;
	}
	@FindBy(id="add_tab3_C_GridTbl_Id_E000MA")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn;
		public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn;
	}

			    @FindBy(id = "td_tab3_C_GridTbl_Id_E000MA_0_rn")
		        private WebElement limits_retriveTheRecord ;

		         public WebElement limits_retriveTheRecord() {
		            return limits_retriveTheRecord;
		        }  
		        @FindBy(xpath = "//td[@id='del_tab3_C_GridTbl_Id_E000MA']")
		        private WebElement limits_DeleteButton ;

		 

		        public WebElement limits_DeleteButton() {
		            return limits_DeleteButton;
		        }  
		
		
		
		
	@FindBy(xpath="(//input[@role='livesearch'])[1]")
	private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_currency;
		public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_currency() {
		return csm_sysparam_user_updateafterapprove_Limits_addbtn_currency;
	}	
		@FindBy(xpath="(//input[@role='livesearch'])[2]")
		private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx;
			public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx() {
			return csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx;
		}
			//(//td[@id='td_tab3_C_GridTbl_Id_E000MA_1_TRX_DESC'])[2]//following-sibling::td[1]//input
			@FindBy(xpath="//td[@tdlabel='W/D Limit']//input")
						private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits;
				public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits() {
				return csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits;
			}
				
				@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Warn User If Limit Exceed']/input")
				private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check;
					public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check() {
					return csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check;
				}
					
					
					@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Proceed If Limit Exceed']//input")
					private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check;
						public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check() {
						return csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check;
					}
										

				@FindBy(xpath="//span[contains(text(),'Ok')]")
				private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_ok;
				public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_ok() {
				return csm_sysparam_user_updateafterapprove_Limits_addbtn_ok;
			}
										
	//029 param
				@FindBy(xpath = "//*[@id=\"transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE\"]")
				private WebElement csmParam_Transactiontype_inputfield ;

				public WebElement csmParam_Transactiontype_inputfield() {
				return csmParam_Transactiontype_inputfield;
				}
				@FindBy(xpath = "//td[text()='Accounts Parameters']")
				private WebElement csmParam_AccountParameters ;

				public WebElement csmParam_AccountParameters() {
				return csmParam_AccountParameters;
				}
				@FindBy(xpath = "//td[text()='Account Type']")
				private WebElement csmParam_AccountParameters_AccountTypes ;

				public WebElement csmParam_AccountParameters_AccountTypes() {
				return csmParam_AccountParameters_AccountTypes;
				}
				@FindBy(xpath = "//a[@id='P017MA']")
				private WebElement csmParam_AccountParameters_AccountTypes_UPAField ;

				public WebElement csmParam_AccountParameters_AccountTypes_UPAField() {
				return csmParam_AccountParameters_AccountTypes_UPAField;
				}
				@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
				private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode ;

				public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode() {
				return csmParam_AccountParameters_AccountTypes_UPA_TypeCode;
				}
				//td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']
				@FindBy(xpath = "(//td[text()='96145'])[1]")
				private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick ;

				public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick() {
				return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;
				}
				@FindBy(xpath = "//div[@id='instructionsColl_P017MA']")
				private WebElement csmParam_AccountParameters_AccountTypes_Instructions;

				public WebElement csmParam_AccountParameters_AccountTypes_Instructions() {
				return csmParam_AccountParameters_AccountTypes_Instructions;
				}
				@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
				private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;

				public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag() {
				return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;
				}
				@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']")
				private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton;

				public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton() {
				return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton;
				}
				@FindBy(xpath = "//a[@id='P017P']//span[2]")
				private WebElement csmParam_AccountParameters_AccountTypes_ApproveField;

				public WebElement csmParam_AccountParameters_AccountTypes_ApproveField() {
				return csmParam_AccountParameters_AccountTypes_ApproveField;
				}
				@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
				private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode;

				public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode() {
				return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode;
				}
				@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017P_1_TYPE_CODE']")
				private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick;

				public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick() {
				return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick;
				}
				@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
				private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton;

				public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton() {
				return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton;
				}
				@FindBy(xpath="//div[contains(text(),'Amount Exceeds')]")
				private WebElement AmountExceedsWarningPopUp;
				public WebElement AmountExceedsWarningPopUp()
				{
				return AmountExceedsWarningPopUp;
				}
				@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
				private WebElement checkIfValueIsEntered;
				public WebElement checkIfValueIsEntered()
				{
				return checkIfValueIsEntered;
				}
				@FindBy(xpath = "//td[text()='Transaction Type']")
						private WebElement csmParam_Transactiontype ;

					public WebElement csmParam_Transactiontype() {
						return csmParam_Transactiontype;
					}
					
					@FindBy(xpath = "//a[@id='P024MA']")
					private WebElement csmParam_Transactiontype_Updateafterapprovefield ;

				public WebElement csmParam_Transactiontype_Updateafterapprovefield() {
					return csmParam_Transactiontype_Updateafterapprovefield;
				}
				
//				@FindBy(xpath = "//*[@id=\"transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE\"]")
//				private WebElement csmParam_Transactiontype_inputfield ;
//				public WebElement csmParam_Transactiontype_inputfield() {
//				return csmParam_Transactiontype_inputfield;
//				}
//				
				
				@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
				private WebElement csmParam_Transactiontype_inputfield_doubleclick ;

				public WebElement csmParam_Transactiontype_inputfield_doubleclick() {
				return csmParam_Transactiontype_inputfield_doubleclick;
				}
				@FindBy(xpath = "//input[@id=\"proceed_on_insuff_fund_P024MA\"]")
				private WebElement csmParam_Transactiontype_proceedoninsufficentfunds ;

				public WebElement csmParam_Transactiontype_proceedoninsufficentfunds() {
				return csmParam_Transactiontype_proceedoninsufficentfunds;
				}
				@FindBy(xpath = "//input[@id='force_overdraw_P024MA']")
				private WebElement csmParam_Transactiontype_Forceoverdrawn ;

				public WebElement csmParam_Transactiontype_Forceoverdrawn() {
				return csmParam_Transactiontype_Forceoverdrawn;
				}
				
				
				
				@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
				private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton ;

				public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton() {
				return csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton;
				}
				//@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
				//private WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok ;
				//
				//public WebElement csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok() {
				//return csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton_Ok;
				//}
				@FindBy(xpath = "//a[@id='P024P']")
				private WebElement csmParam_Transactiontype_Approvefield ;

				public WebElement csmParam_Transactiontype_Approvefield() {
				return csmParam_Transactiontype_Approvefield;
				}

				@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
				private WebElement csmParam_Transactiontype_Approve_Inputfield ;

				public WebElement csmParam_Transactiontype_Approve_Inputfield() {
				return csmParam_Transactiontype_Approve_Inputfield;
				}
				@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
				private WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick ;

				public WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick() {
				return csmParam_Transactiontype_Approve_Inputfield_doubleclick;
				}
				@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
				private WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve ;

				public WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve() {
				return csmParam_Transactiontype_Approve_Inputfield_doubleclick_Approve;
				}
//=@122
							
				@FindBy(xpath = "//a[@id='E000MA']")

				private WebElement updateAfterApproveInUser;

				public WebElement updateAfterApproveInUser()

				{

				    return updateAfterApproveInUser;

				}

				@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")

				private WebElement userIdInUpdateAfterApprove;

				public WebElement userIdInUpdateAfterApprove()

				{

				    return userIdInUpdateAfterApprove;

				}

				@FindBy(id="td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID")

				private WebElement doubleClickUserInUpdateAfterApprove;

				public WebElement doubleClickUserInUpdateAfterApprove()

				{

				    return doubleClickUserInUpdateAfterApprove;

				}

				@FindBy(xpath="(//input[@name='USER_ID'])[2]")

				private WebElement userIdInApproveScreen;

				public WebElement userIdInApproveScreen()

				{

				    return userIdInApproveScreen;

				}

				@FindBy(xpath="//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID']")

				private WebElement doubleClickRecordInApproveScreen;

				public WebElement doubleClickRecordInApproveScreen()

				{

				    return doubleClickRecordInApproveScreen;

				}

				@FindBy(xpath="//td[@id='td_tab5_E_GridTbl_Id_E000MA_0_rn']")

				private WebElement selectRowForDeleteInEcoSector;

				public WebElement selectRowForDeleteInEcoSector()

				{

				    return selectRowForDeleteInEcoSector;

				}

				@FindBy(xpath="//td[@id='del_tab5_E_GridTbl_Id_E000MA']")

				private WebElement deleteButtonInEcoSector;

				public WebElement deleteButtonInEcoSector()

				{

				    return deleteButtonInEcoSector;

				}

				
				@FindBy(xpath="//span[text()='grant_all_key']")

				private WebElement grantallkey_InEcoSector;

				public WebElement grantallkey_InEcoSector()

				{

				    return grantallkey_InEcoSector;

				}
				
				
				
				@FindBy(xpath="//span[text()=' Limits ']")

				private WebElement limitsButtonInUpdateAfterApprove;

				public WebElement limitsButtonInUpdateAfterApprove()

				{

				    return limitsButtonInUpdateAfterApprove;

				}

				@FindBy(xpath="//td[@id='add_tab3_C_GridTbl_Id_E000MA']")

				private WebElement addIconInUpdateAfterApprove;

				public WebElement addIconInUpdateAfterApprove()

				{

				    return addIconInUpdateAfterApprove;

				}

				@FindBy(xpath="//input[@name='lookupTxt_ctstellerlimitVO.CY_CODE']")

				private WebElement accountCurrencyInUpdateAfterApprove;

				public WebElement accountCurrencyInUpdateAfterApprove()

				{

				    return accountCurrencyInUpdateAfterApprove;

				}

				@FindBy(xpath="//input[@name='lookupTxt_ctstellerlimitVO.TRX_TYPE']")

				private WebElement transactionBoxInUpdateAfterApprove;

				public WebElement transactionBoxInUpdateAfterApprove()

				{

				    return transactionBoxInUpdateAfterApprove;

				}

				@FindBy(xpath="//td[@tdlabel='W/D Limit']//input")

				private WebElement withdrawalLimitInUpdateAfterApprove;

				public WebElement withdrawalLimitInUpdateAfterApprove()

				{

				    return withdrawalLimitInUpdateAfterApprove;

				}

				@FindBy(xpath="//td[@tdlabel='Deposit Limit']//input")

				private WebElement depositLimitInUpdateAfterApprove;

				public WebElement depositLimitInUpdateAfterApprove()

				{

				    return depositLimitInUpdateAfterApprove;

				}

				@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Warn User If Limit Exceed']/input")

				private WebElement warnUserIfLimitExceedFlagInUpdateAfterApprove;

				public WebElement warnUserIfLimitExceedFlagInUpdateAfterApprove()

				{

				    return warnUserIfLimitExceedFlagInUpdateAfterApprove;

				}

				@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Proceed If Limit Exceed']//input")

				private WebElement proceedIfLimitExceedFlagInUpdateAfterApprove;

				public WebElement proceedIfLimitExceedFlagInUpdateAfterApprove()

				{

				    return proceedIfLimitExceedFlagInUpdateAfterApprove;

				}

				//confirmOkButton()

				@FindBy(xpath="//span[text()='Ok']")

				private WebElement okButtonInUpdateAfterApprove;

				public WebElement okButtonInUpdateAfterApprove()

				{

				    return okButtonInUpdateAfterApprove;

				}

				@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")

				private WebElement updateAfterApproveButtonInUpdateAfterApprove;

				public WebElement updateAfterApproveButtonInUpdateAfterApprove()

				{

				    return updateAfterApproveButtonInUpdateAfterApprove;

				}

				//confirmOkButton()

				//CSMOkButtonInAccessDeniedPopUpMenu

				@FindBy(xpath="//a[@id='E000P']")

				private WebElement approveScreenInUser;

				public WebElement approveScreenInUser()

				{

				    return approveScreenInUser;

				}

				@FindBy(id="tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")

				private WebElement userIdInApprove;

				public WebElement userIdInApprove()

				{

				    return userIdInApprove;

				}

				@FindBy(id="td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")

				private WebElement doubleClickUserIdInApprove;

				public WebElement doubleClickUserIdInApprove()

				{

				    return doubleClickUserIdInApprove;

				}

				@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")

				private WebElement approveButtonInUser;

				public WebElement approveButtonInUser()

				{

				    return approveButtonInUser;

				}

				//confirmOkButton

				//successOkButton

				 

				//TRS_122

				@FindBy(xpath = "//span[text()=' Eco Sector ']")

				private WebElement ecoSectorInUpdateAfterApprove;

				public WebElement ecoSectorInUpdateAfterApprove()

				{

				    return ecoSectorInUpdateAfterApprove;

				}

				@FindBy(id="add_tab5_E_GridTbl_Id_E000MA")

				private WebElement addIconInEcoSectorLimit;

				public WebElement addIconInEcoSectorLimit()

				{

				    return addIconInEcoSectorLimit;

				}

				@FindBy(xpath="//input[@name='lookupTxt_ctstellerciftypedetVO.CIF_TYPE']")

				private WebElement ecoSectorLimit;

				public WebElement ecoSectorLimit()

				{

				    return ecoSectorLimit;

				}

				@FindBy(xpath="//input[@name='lookupTxt_ctstellerciftypedetVO.TRX_TYPE']")

				private WebElement transactionInEcoSectorLimit;

				public WebElement transactionInEcoSectorLimit()

				{

				    return transactionInEcoSectorLimit;

				}

				//withdrawalLimitInUpdateAfterApprove

				//depositLimitInUpdateAfterApprove

				@FindBy(xpath="//td[@tdlabel='Overdraw Limit']//input")

				private WebElement overdrawLimitInUpdateAfterApprove;

				public WebElement overdrawLimitInUpdateAfterApprove()

				{

				    return overdrawLimitInUpdateAfterApprove;

				}

				@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input")

				private WebElement localApprovalLimitLimitInUpdateAfterApprove;

				public WebElement localApprovalLimitLimitInUpdateAfterApprove()

				{

				    return localApprovalLimitLimitInUpdateAfterApprove;

				}
			

				@FindBy(xpath="//div[contains(text(),'Saved Successfully')]")

				private WebElement getTransactionNumber;

				public WebElement getTransactionNumber()

				{

				   return getTransactionNumber;

				}
				
			
				@FindBy(xpath="	//div[contains(text(),'Saved Successfully')]//following::input")

				private WebElement getTransactionOkPop ;

				public WebElement getTransactionOkPop ()

				{

				    return getTransactionOkPop;

				}

				@FindBy(xpath="//span[text()='Delete All']")

				private WebElement ecoSectorInUpdateAfterApprove_DeleteAll ;

				public WebElement ecoSectorInUpdateAfterApprove_DeleteAll ()

				{

				    return ecoSectorInUpdateAfterApprove_DeleteAll;

				}	
				
				@FindBy(xpath="(//input[@name='trxMgntCO.ctstrsVO.BRANCH_CODE'])[2]")
				private WebElement CSM_Transaction_TellerAC_Branchinput;
				public WebElement CSM_Transaction_TellerAC_Branchinput() {
					return CSM_Transaction_TellerAC_Branchinput;
				}
				
				@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.CTRL_CY']")
				private WebElement CSM_Transaction_TellerAc_Currencyinput;
				public WebElement CSM_Transaction_TellerAc_Currencyinput() {
					return CSM_Transaction_TellerAc_Currencyinput;
				}
				@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.CTRL_GL']")
				private WebElement CSM_Transaction_TellerAc_Glinput;
				public WebElement CSM_Transaction_TellerAc_Glinput() {
					return CSM_Transaction_TellerAc_Glinput;
				}
				
				@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.CTRL_CIF']")
				private WebElement CSM_Transaction_TellerAc_Cifinput;
				public WebElement CSM_Transaction_TellerAc_Cifinput() {
					return CSM_Transaction_TellerAc_Cifinput;
				}
				@FindBy(xpath="//input[@id='lookuptxt_ctrl_sl_D001MT']")
				private WebElement CSM_Transaction_TellerAc_Serialinput;
				public WebElement CSM_Transaction_TellerAc_Serialinput() {
					return CSM_Transaction_TellerAc_Serialinput;
				}
}
