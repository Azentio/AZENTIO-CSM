package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Chequebook_Object {
	WebDriver driver;

	public CSM_Chequebook_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//@CHB_186
	
	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement csmParam_Systemparameter ;

	public WebElement csmParam_Systemparameter() {
		return csmParam_Systemparameter;
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
	
	@FindBy(id = "td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID")
	private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;

	public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick() {
		return csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;
	}
	
	@FindBy(xpath = "//select[@id='view_show_recieve_E000MA']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch() {
		return csmParam_User_Userid_doubleclick_logintobranch;
	}
	
	// check if the retrive button is  in the field  da karthi
	
	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;
	}
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;

	public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok() {
		return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;
	}
	@FindBy(id="E000P")
	private WebElement csmParam_User_Approve;

	public WebElement csmParam_User_Approve() {
		return csmParam_User_Approve;
	}
	@FindBy(id = "tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_UserID;

	public WebElement csmParam_User_Approve_UserID() {
		return csmParam_User_Approve_UserID;
	}
	
	@FindBy(id="td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")
	private WebElement csmParam_User_Approve_Username_doubleclick;
	public WebElement csmParam_User_Approve_Username_doubleclick() {
		return csmParam_User_Approve_Username_doubleclick;
	}
	
	@FindBy(id="tellerParamMaint_FormId_E000P_Approve_key")
	private WebElement csmParam_User_Approve_Username_doubleclick_Approve;

	public WebElement csmParam_User_Approve_Username_doubleclick_Approve() {
		return csmParam_User_Approve_Username_doubleclick_Approve;
	}
	
//	@FindBy(id =  "_popup_path_sol_confirm_ok")
//	private WebElement csmParam_User_Approve_Username_doubleclick_Approve_Ok;
//
//	public WebElement csmParam_User_Approve_Username_doubleclick_Approve_Ok() {
//		return csmParam_User_Approve_Username_doubleclick_Approve_Ok;
//	}
	//CSM_Core Page Objects -----Start-------------------------------------
	@FindBy(xpath =  "//td[text()='Chequebook Request']")
	private WebElement csmcore_ChequeBookRequest;

	public WebElement csmcore_ChequeBookRequest() {
		return csmcore_ChequeBookRequest;
	}
	
	@FindBy(xpath =  "//td[text()='Send To/Receive From Provider']")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom() {
		return csmcore_ChequeBookRequest_senttoreceivefrom;
	}
	@FindBy(xpath =  "//span[text()='Send To Provider']")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider;
	}
	@FindBy(xpath =  "//span[text()=' Retrieve ']")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_retrivebutton;
	}
	@FindBy(id =  "chqBkImpExpGridTbl_Id_Q000TP_gs_ctschqbookVO.BRANCH_CODE")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_Senttoprovider_Inputfield;
	}
	@FindBy(xpath = "//span[text()='Receive From Provider']")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider;
	}
	
	@FindBy(id="chqBkImpExpGridTbl_Id_Q000RP_gs_ctschqbookVO.BRANCH_CODE")
	private WebElement csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield;

	public WebElement csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield() {
		return csmcore_ChequeBookRequest_senttoreceivefrom_recievefromprovider_Inputfield;
	}
	//CSM_Core Page object----------End-------------------
	
	//@CHB_180
		@FindBy(xpath = "//td[text()='Parameters']")
		private WebElement csmParam_ParameterMainModule;

		public WebElement csmParamParameterMainModule() {
			return csmParam_ParameterMainModule;
		}

		@FindBy(xpath = "//td[text()='Accounts Parameters']")
		private WebElement csmParam_AccountParameter;

		public WebElement csmParam_AccountParameter() {
			return csmParam_AccountParameter;
		}
		
		@FindBy(xpath = "//td[text()='General Ledger']")
		private WebElement csmParam_General_ledger;

		public WebElement csmParam_General_ledger() {
			return csmParam_General_ledger;
		}
		
		@FindBy(id="P014UP")
		private WebElement csmParam_General_ledger_Updateafterapprove;

		public WebElement csmParam_General_ledger_Updateafterapprove() {
			return csmParam_General_ledger_Updateafterapprove;
		}
		
		@FindBy(id = "genLedgerParamListGridTbl_Id_P014UP_gs_GL_CODE")
		private WebElement csmParam_General_ledger_code;

		public WebElement csmParam_General_ledger_code() {
			return csmParam_General_ledger_code;
		}
		@FindBy(xpath =  "//td[text()='400402']")
		private WebElement csmParam_General_ledger_code_doubleclick;

		public WebElement csmParam_General_ledger_code_doubleclick() {
			return csmParam_General_ledger_code_doubleclick;
		}
		@FindBy(xpath = "//span[text()='Additional Details']")
		private WebElement csmParam_General_ledger_code_additionaloptions;

		public WebElement csmParam_General_ledger_code_additionaloptions() {
			return csmParam_General_ledger_code_additionaloptions;
		}
		
		@FindBy(id="allow_internal_overdraw_P014UP")
		private WebElement csmParam_General_ledger_code_additionaloptions_dropdown;

		public WebElement csmParam_General_ledger_code_additionaloptions_dropdown() {
			return csmParam_General_ledger_code_additionaloptions_dropdown;
		}
		
		@FindBy(id="genLedgerParamFormId_P014UP_update_key")
		private WebElement csmParam_General_ledger_upadatebutton;

		public WebElement csmParam_General_ledger_upadatebutton() {
			return csmParam_General_ledger_upadatebutton;
		}
		@FindBy(xpath = "//td[text()='General Ledger']//ancestor::a//following-sibling::ul//span[text()='Approve']")
		private WebElement csmParam_General_ledger_Approve;

		public WebElement csmParam_General_ledger_Approve() {
			return csmParam_General_ledger_Approve;
		}
		@FindBy(id="genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE")
		private WebElement csmParam_General_ledger_Approve_inputfield;

		public WebElement csmParam_General_ledger_Approve_inputfield() {
			return csmParam_General_ledger_Approve_inputfield;
		}
		@FindBy(id="td_genLedgerParamListGridTbl_Id_P014P_1_ADDITIONAL_REFERENCE")
		private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick;

		public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick() {
			return csmParam_General_ledger_Approve_inputfield_doubleclick;
		}

		@FindBy(xpath = "//label[@id='genLedgerParamFormId_P014P_approve_key']")
		private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve;

		public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve() {
			return csmParam_General_ledger_Approve_inputfield_doubleclick_Approve;
		}
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK;

		public WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK() {
			return csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK;
		}
		
		
//		id="genLedgerParamFormId_P014P_approve_key"
//		@FindBy(id = "genLedgerParamCode_P014MT")
//		private WebElement csmParam_General_ledger_inputcode;
	//
//		public WebElement csmParam_General_ledger_inputcode() {
//			return csmParam_General_ledger_inputcode;
//		}
	//	
//		@FindBy(id = "gl_type_P014MT")
//		private WebElement csmParam_General_ledger_type;
	//
//		public WebElement csmParam_General_ledger_type() {
//			return csmParam_General_ledger_type;
//		}
//		@FindBy(id = "genLedgerParamBriefDescEng_P014MT")
//		private WebElement csmParam_General_ledger_Briefname;
	//
//		public WebElement csmParam_General_ledger_Briefname() {
//			return csmParam_General_ledger_Briefname;
//		}
	//	
//		@FindBy(id = "genLedgerParamLongDescEng_P014MT")
//		private WebElement csmParam_General_ledger_Longname;
	//
//		public WebElement csmParam_General_ledger_Longname() {
//			return csmParam_General_ledger_Longname;
//		}
	//	
//		@FindBy(xpath = "//span[text()='Additional Details']")
//		private WebElement csmParam_General_ledger_Additionaldetails;
	//
//		public WebElement csmParam_General_ledger_Additionaldetails() {
//			return csmParam_General_ledger_Additionaldetails;
//		}
//		@FindBy(id = "ac_sign_P014MT")
//		private WebElement csmParam_General_ledger_AccountSign;
	//
//		public WebElement csmParam_General_ledger_AccountSign() {
//			return csmParam_General_ledger_AccountSign;
//		}
	//	
//		@FindBy(id = "allow_internal_overdraw_P014MT")
//		private WebElement csmParam_General_ledger_AllowOverdraw ;
	//
//		public WebElement csmParam_General_ledger_AllowOverdraw() {
//			return csmParam_General_ledger_AllowOverdraw;
//		}
//		@FindBy(id = "genLedgerParamFormId_P014MT_Save_key")
//		private WebElement csmParam_General_ledger_Savekey ;
	//
//		public WebElement csmParam_General_ledger_Savekey() {
//			return csmParam_General_ledger_Savekey;
//		}
	//	
//		@FindBy(id = "_popup_path_sol_ok")
//		private WebElement csmParam_General_ledger_Okbutton ;
	//
//		public WebElement csmParam_General_ledger_Okbutton() {
//			return csmParam_General_ledger_Okbutton;
//		}
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
@FindBy(xpath = "//*[@id=\"transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE\"]")
private WebElement csmParam_Transactiontype_inputfield ;

public WebElement csmParam_Transactiontype_inputfield() {
return csmParam_Transactiontype_inputfield;
}
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
@FindBy(xpath = "//td[text()='Chequebook Request']")
private WebElement csmcore_Chequebookrequest ;

public WebElement csmcore_Chequebookrequest() {
return csmcore_Chequebookrequest;
}

@FindBy(xpath = "//a[@id='Q000MT']")
private WebElement csmcore_Chequebookrequest_maintanace ;

public WebElement csmcore_Chequebookrequest_maintanace() {
return csmcore_Chequebookrequest_maintanace;
}
@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
private WebElement csmcore_Chequebookrequest_maintanace_Code ;

public WebElement csmcore_Chequebookrequest_maintanace_Code() {
return csmcore_Chequebookrequest_maintanace_Code;
}

@FindBy(xpath = "//a[@id='Chequebook Request / Maintenance']")
private WebElement csmcore_Chequebookrequest_maintanace_Code_clickonsomething ;

public WebElement csmcore_Chequebookrequest_maintanace_Code_clickonsomething() {
return csmcore_Chequebookrequest_maintanace_Code_clickonsomething;
}
@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
private WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode ;

public WebElement csmcore_Chequebookrequest_maintanace_Code_branchcode() {
return csmcore_Chequebookrequest_maintanace_Code_branchcode;
}


@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
private WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks ;

public WebElement csmcore_Chequebookrequest_maintanace_NoofChequeBooks() {
return csmcore_Chequebookrequest_maintanace_NoofChequeBooks;
}
@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
private WebElement csmcore_Chequebookrequest_maintanace_currencyCode ;

public WebElement csmcore_Chequebookrequest_maintanace_currencyCode() {
return csmcore_Chequebookrequest_maintanace_currencyCode;
}
@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
private WebElement csmcore_Chequebookrequest_maintanace_GLcode ;

public WebElement csmcore_Chequebookrequest_maintanace_GLcode() {
return csmcore_Chequebookrequest_maintanace_GLcode;
}
@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
private WebElement csmcore_Chequebookrequest_maintanace_CIFCode ;

public WebElement csmcore_Chequebookrequest_maintanace_CIFCode() {
return csmcore_Chequebookrequest_maintanace_CIFCode;
}
@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
private WebElement csmcore_Chequebookrequest_maintanace_SerialNo ;

public WebElement csmcore_Chequebookrequest_maintanace_SerialNo() {
return csmcore_Chequebookrequest_maintanace_SerialNo;
}
@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
private WebElement csmcore_Chequebookrequest_maintanace_SaveButton ;

public WebElement csmcore_Chequebookrequest_maintanace_SaveButton() {
return csmcore_Chequebookrequest_maintanace_SaveButton;
}
@FindBy(xpath = "//a[@id='Q000AP']")
private WebElement csmcore_Chequebookrequest_Approve ;

public WebElement csmcore_Chequebookrequest_Approve() {
return csmcore_Chequebookrequest_Approve;
}
@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CHEQUE_CODE']")
private WebElement csmcore_Chequebookrequest_Approve_InputField ;

public WebElement csmcore_Chequebookrequest_Approve_InputField() {
return csmcore_Chequebookrequest_Approve_InputField;
}
@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CHEQUE_CODE']")
private WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick ;

public WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick() {
return csmcore_Chequebookrequest_Approve_InputField_doubleclick;
}
@FindBy(xpath = "//button[@id='chequeBook_approve_Q000AP']")
private WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton ;

public WebElement csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton() {
return csmcore_Chequebookrequest_Approve_InputField_doubleclick_Approvebutton;
}
@FindBy(xpath="//div[contains(text(),'Cannot Proceed')]")
private WebElement cannotProceedWarningPopUp;
public WebElement cannotProceedWarningPopUp()
{
return cannotProceedWarningPopUp;
}
@FindBy(id="global_user_run_date")
private WebElement CSM_DateInUserRunningDate;

public WebElement CSMDateInUserRunningDate() {
	return CSM_DateInUserRunningDate;
}
}
