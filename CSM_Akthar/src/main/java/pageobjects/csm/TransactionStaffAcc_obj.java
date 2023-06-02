package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionStaffAcc_obj {
	WebDriver driver;	
	public TransactionStaffAcc_obj(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//TSA_148//
	
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement TransactionStaffAcc_Module;
	public WebElement TransactionStaffAcc_Module()
	{
		return TransactionStaffAcc_Module;
	}
	@FindBy(xpath="//td[text()='System Parameters']")
	private WebElement TransactionStaffAcc_Systemparameters;
	public WebElement TransactionStaffAcc_Systemparameters()
	{
		return TransactionStaffAcc_Systemparameters;
	}
	@FindBy(xpath="//td[text()='Control Record']")
	private WebElement TransactionStaffAcc_ControlRecord;
	public WebElement TransactionStaffAcc_ControlRecord()
	{
		return TransactionStaffAcc_ControlRecord;
	}
	@FindBy(xpath="//a[@id='O001UP']/span[text()='Update After Approve']")
	private WebElement TransactionStaffAcc_UpdateAfterApprove;
	public WebElement TransactionStaffAcc_UpdateAfterApprove()
	{
		return TransactionStaffAcc_UpdateAfterApprove;
	}
	
	@FindBy(xpath="//a[text()=' Alert Activation ']")
	private WebElement TransactionStaffAcc_AlertActivation;
	public WebElement TransactionStaffAcc_AlertActivation()
	{
		return TransactionStaffAcc_AlertActivation;
	}
	
	@FindBy(xpath="//span[text()='Account Balance Overdrawn']//ancestor::tr[@id='TRX']/td/div/div")
	private WebElement TransactionStaffAcc_ABO;
	public WebElement TransactionStaffAcc_ABO()
	{
		return TransactionStaffAcc_ABO;
	}
	
	@FindBy(xpath="//span[text()='0048-Staff Accounts Transaction']/ancestor::td/following-sibling::td[@aria-describedby='tab4_GridTbl_Id_O001UP_ctscontrolAlertVO.ACTIVATE']")
	private WebElement TransactionStaffAcc_SATCheckboArea;
	public WebElement TransactionStaffAcc_SATCheckboArea()
	{
		return TransactionStaffAcc_SATCheckboArea;
	}
	@FindBy(xpath="//span[text()='0048-Staff Accounts Transaction']/ancestor::td/following-sibling::td/input[@type='checkbox']")
	private WebElement TransactionStaffAcc_SAT;
	public WebElement TransactionStaffAcc_SAT()
	{
		return TransactionStaffAcc_SAT;
	}
	@FindBy(xpath="//td[text()='CIF Parameters']")
	private WebElement TransactionStaffAcc_Cifparameters;
	public WebElement TransactionStaffAcc_Cifparameters()
	{
		return TransactionStaffAcc_Cifparameters;
	}
	@FindBy(xpath="//td[text()='CIF Type']")
	private WebElement TransactionStaffAcc_Ciftype;
	public WebElement TransactionStaffAcc_Ciftype()
	{
		return TransactionStaffAcc_Ciftype;
	}
	@FindBy(xpath="//a[@id='P010MA']/span[text()='Update After Approve']")
	private WebElement TransactionStaffAcc_UPA;
	public WebElement TransactionStaffAcc_UPA()
	{
		return TransactionStaffAcc_UPA;
	}	
	
	@FindBy(xpath="//a[@id='infoBarSearchButton_P010MA']")
	private WebElement TransactionStaffAcc_Searchbtn;
	public WebElement TransactionStaffAcc_Searchbtn()
	{
		return TransactionStaffAcc_Searchbtn;
	}
	@FindBy(xpath="//input[@id='cifTypeParamList_GridTbl_Id_P010MA_gs_rifcttVO.BRIEF_DESC_ENG']")
	private WebElement TransactionStaffAcc_BrifeDescEng;
	public WebElement TransactionStaffAcc_BrifeDescEng()
	{
		return TransactionStaffAcc_BrifeDescEng;
	}
	
	@FindBy(xpath="//td[text()='Pers Staff']")
	private WebElement TransactionStaffAcc_Existingdata;
	public WebElement TransactionStaffAcc_Existingdata()
	{
		return TransactionStaffAcc_Existingdata;
	}
	@FindBy(xpath="//span[text()='Main Information']")
	private WebElement TransactionStaffAcc_MI;
	public WebElement TransactionStaffAcc_MI()
	{
		return TransactionStaffAcc_MI;
	}
	
	
	//TRS_017//
	
	@FindBy(xpath="//input[@id='cr_dr_forex_P024MAC']")
	private WebElement Transactions_Mainacc_credit_flag;
	public WebElement Transactions_Mainacc_credit_flag()
	{
		return Transactions_Mainacc_credit_flag;
	}
	
	@FindBy(xpath="//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement Transaction_existingdata;
	public WebElement Transaction_existingdata()
	{
		return Transaction_existingdata;
	}
	
	//TRS_018//
	
	@FindBy(xpath="//td[text()='Transaction Type']")
	private WebElement Transactions_TranscationType;
	public WebElement Transactions_TranscationType()
	{
		return Transactions_TranscationType;
	}
	@FindBy(xpath="//span[text()='Update After Approve']")
	private WebElement Transactions_UPA;
	public WebElement Transactions_UPA()
	{
		return Transactions_UPA;
	}
	@FindBy(xpath="//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Transactions_Entercodevalue;
	public WebElement Transactions_Entercodevalue()
	{
		return Transactions_Entercodevalue;
	}
	@FindBy(xpath="//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement Transactions_Existingdata;
	public WebElement Transactions_Existingdata()
	{
		return Transactions_Existingdata;
	}
	
	@FindBy(xpath="//label[@id='lbl_nostro_mvt_P024MA']")
	private WebElement Transactions_GLflagChecked;
	public WebElement Transactions_GLflagChecked()
	{
		return Transactions_GLflagChecked;
	}
	@FindBy(xpath="//label[text()='Update After Approve ']")
	private WebElement Transactions_UaAbtn;
	public WebElement Transactions_UaAbtn()
	{
		return Transactions_UaAbtn;
	}
	@FindBy(xpath="//input[@id='credit_card_payment_yn_P024MA']")
	private WebElement Transactions_Checkuncheck;
	public WebElement Transactions_Checkuncheck()
	{
		return Transactions_Checkuncheck;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Transactions_informationOkbtn;
	public WebElement Transactions_informationOkbtn()    
	{
		return Transactions_informationOkbtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Recordwasupdatesccess;
	public WebElement Transactions_Recordwasupdatesccess()
	{
		return Transactions_Recordwasupdatesccess;
	}
	
	@FindBy(xpath="//a[@id='P024P']")
	private WebElement Transactions_Approve;
	public WebElement Transactions_Approve()
	{
		return Transactions_Approve;
	}
	@FindBy(xpath="//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Transactions_codevalue;
	public WebElement Transactions_codevalue()
	{
		return Transactions_codevalue;
	}
	@FindBy(xpath="//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement Transactions_existingdata;
	public WebElement Transactions_existingdata()
	{
		return Transactions_existingdata;
	}
	@FindBy(xpath="//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement Transactions_Approvebtn;
	public WebElement Transactions_Approvebtn()
	{
	
		return Transactions_Approvebtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Transactions_Confirmokbtn;
	public WebElement Transactions_Confirmokbtn()
	{
		return Transactions_Confirmokbtn;    
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_recordwassuccess_okbtn;
	public WebElement Transactions_recordwassuccess_okbtn()
	{
		return Transactions_recordwassuccess_okbtn;    
	}
	
	@FindBy(xpath="//td[text()='Transactions']")
	private WebElement Transactions_Transactions;
	public WebElement Transactions_Transactions()
	{
		return Transactions_Transactions;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Transactions_MaintenanceScrn;
	public WebElement Transactions_MaintenanceScrn()
	{
		return Transactions_MaintenanceScrn;
	}
	@FindBy(xpath="//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Transactions_Trxtypevalue;
	public WebElement Transactions_Trxtypevalue()
	{
		return Transactions_Trxtypevalue;
	}
	@FindBy(xpath="//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_depositAcc_Branchcode;
	public WebElement Transactions_depositAcc_Branchcode()
	{
		return Transactions_depositAcc_Branchcode;
	}
	
	@FindBy(xpath="//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_debitAcc_Currencycode;
	public WebElement Transactions_debitAcc_Currencycode()
	{
		return Transactions_debitAcc_Currencycode;
	}
	@FindBy(xpath="//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_debitAcc_Glcode;
	public WebElement Transactions_debitAcc_Glcode()
	{
		return Transactions_debitAcc_Glcode;
	}
	@FindBy(xpath="//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_debitAcc_Cifcode;
	public WebElement Transactions_debitAcc_Cifcode()
	{
		return Transactions_debitAcc_Cifcode;
	}
	@FindBy(xpath="//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_debitAcc_serialcode;
	public WebElement Transactions_debitAcc_serialcode()
	{
		return Transactions_debitAcc_serialcode;
	}
	@FindBy(xpath="//span[text()='close']")
	private WebElement Transactions_viewmemo_closebtn;
	public WebElement Transactions_viewmemo_closebtn()
	{
		return Transactions_viewmemo_closebtn;
	}
	
	
	@FindBy(xpath="//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency;
	public WebElement Transactions_debitAcc_currency()
	{
		return Transactions_debitAcc_currency;
	}
	
	@FindBy(xpath="//input[@id='amount_D001MT']")
	private WebElement Transactions_EnterAmount;
	public WebElement Transactions_EnterAmount()
	{
		return Transactions_EnterAmount;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn;
	public WebElement Transactions_Warning_okbtn()
	{
		return Transactions_Warning_okbtn;
	}	
	@FindBy(xpath="//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement Transactions_savebtn;
	public WebElement Transactions_savebtn()
	{
		return Transactions_savebtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_successokbtn;
	public WebElement Transactions_successokbtn()
	{
		return Transactions_successokbtn;
	}
	@FindBy(xpath="//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn;
	public WebElement Transactions_Approvescrn()
	{
		return Transactions_Approvescrn;
	}
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue;
	public WebElement Transactions_transactionNo_codeValue()
	{
		return Transactions_transactionNo_codeValue;
	}
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk;
	public WebElement Transactions_transactionNo_Doubleclk()
	{
		return Transactions_transactionNo_Doubleclk;
	}	
	
	@FindBy(xpath="//div[contains(text(),'Saved Successfully')]")
	private WebElement getTransactionNumber;
	public WebElement getTransactionNumber()
	{
		return getTransactionNumber;
	}
	@FindBy(xpath="//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_searchbtn;
	public WebElement Transactions_searchbtn()
	{
		return Transactions_searchbtn;
	}	
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_trxno_code;
	public WebElement Transactions_trxno_code()
	{
		return Transactions_trxno_code;
	}	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_doubleclk_codevalue;
	public WebElement Transactions_doubleclk_codevalue()
	{
		return Transactions_doubleclk_codevalue;
	}	
	@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
	private WebElement Transactions_BookedEntries;
	public WebElement Transactions_BookedEntries()
	{
		return Transactions_BookedEntries;
	}	
	@FindBy(xpath="//td[text()='Queries']")
	private WebElement Transactions_Queries;
	public WebElement Transactions_Queries()
	{
		return Transactions_Queries;
	}
	@FindBy(xpath="//td[text()='Statement Of Accounts']")
	private WebElement Transactions_SOA;
	public WebElement Transactions_SOA()
	{
		return Transactions_SOA;
	}
	@FindBy(xpath="//span[text()='By Trade Date']")
	private WebElement Transactions_BTD;
	public WebElement Transactions_BTD()
	{
		return Transactions_BTD;
	}
	@FindBy(xpath="//input[@id='accCy_QUER001T']")
	private WebElement Transactions_Queries_Currencycode;
	public WebElement Transactions_Queries_Currencycode()
	{
		return Transactions_Queries_Currencycode;
	}
	@FindBy(xpath="//input[@id='accGl_QUER001T']")
	private WebElement Transactions_Queries_GLcode;
	public WebElement Transactions_Queries_GLcode()
	{
		return Transactions_Queries_GLcode;
	}
	@FindBy(xpath="//input[@id='accCif_QUER001T']")
	private WebElement Transactions_Queries_cifcode;
	public WebElement Transactions_Queries_cifcode()
	{
		return Transactions_Queries_cifcode;
	}
	@FindBy(xpath="//input[@id='lookuptxt_accSl_QUER001T']")
	private WebElement Transactions_Queries_Serialcode;
	public WebElement Transactions_Queries_Serialcode()
	{
		return Transactions_Queries_Serialcode;
	}
	@FindBy(xpath="//label[@id='statementOfAccountsForm_QUER001T_Retrieve_key']")
	private WebElement Transactions_Queries_retrivebtn;
	public WebElement Transactions_Queries_retrivebtn()
	{
		return Transactions_Queries_retrivebtn;
	}

//TRS_060//
	
	@FindBy(xpath="//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement Transactions_withdraw_codevalue;
	public WebElement Transactions_withdraw_codevalue()
	{
		return Transactions_withdraw_codevalue;
	}
	
	@FindBy(xpath="//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement Transactions_withdraw_Existingvalue;
	public WebElement Transactions_withdraw_Existingvalue()
	{
		return Transactions_withdraw_Existingvalue;
	}
	
	@FindBy(xpath="//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement Transactions_withdraw_Approvecode;
	public WebElement Transactions_withdraw_Approvecode()
	{
		return Transactions_withdraw_Approvecode;
	}

	@FindBy(xpath="//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement Transactions_withdraw_ApproveExistingvalue;
	public WebElement Transactions_withdraw_ApproveExistingvalue()
	{
		return Transactions_withdraw_ApproveExistingvalue;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Nochages_okbtn;
	public WebElement Transactions_Nochages_okbtn()
	{
		return Transactions_Nochages_okbtn;
	}
	
	//TRS_061//
	
	@FindBy(xpath="//td[text()='Accounts Parameters']")
	private WebElement Transactions_Accountparameters;
	public WebElement Transactions_Accountparameters()
	{
		return Transactions_Accountparameters;
	}
	
	@FindBy(xpath="//td[text()='Account Type']")
	private WebElement Transactions_Accounttype;
	public WebElement Transactions_Accounttype()
	{
		return Transactions_Accounttype;
	}
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement Transactions_acctype_approve;
	public WebElement Transactions_acctype_approve()
	{
		return Transactions_acctype_approve;
	}
	@FindBy(xpath="(//span[text()='Update After Approve'])[1]")
	private WebElement Transactions_acctype_UPA;
	public WebElement Transactions_acctype_UPA()
	{
		return Transactions_acctype_UPA;
	}
	@FindBy(xpath="//td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']")
	private WebElement Transactions_Doubleclk;
	public WebElement Transactions_Doubleclk()
	{
		return Transactions_Doubleclk;
	}
	@FindBy(xpath="//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
	private WebElement Transactions_typecode;
	public WebElement Transactions_typecode()
	{
		return Transactions_typecode;
	}
	@FindBy(xpath="//span[text()='Instructions']")
	private WebElement Transactions_instructions;
	public WebElement Transactions_instructions()
	{
		return Transactions_instructions;
	}
	@FindBy(xpath="//input[@id='allow_overdrawn_P017MA']")
	private WebElement Transactions_allowoverdrawn;
	public WebElement Transactions_allowoverdrawn()
	{
		return Transactions_allowoverdrawn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_information_okbtn;
	public WebElement Transactions_information_okbtn()
	{
		return Transactions_information_okbtn;
	}
	@FindBy(xpath="//input[@id='proceed_on_insuff_fund_P024MA']")
	private WebElement Transactions_proceedflag_uncheck;
	public WebElement Transactions_proceedflag_uncheck()
	{
		return Transactions_proceedflag_uncheck;
	}
	
	@FindBy(xpath="//td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']")
	private WebElement Transactions_ACCtype_UPA_Doubleclk;
	public WebElement Transactions_ACCtype_UPA_Doubleclk()
	{
		return Transactions_ACCtype_UPA_Doubleclk;
	}
	@FindBy(xpath="//td[@id='td_acctypeList_GridTbl_Id_P017P_1_TYPE_CODE']")
	private WebElement Transactions_ACCtype_App_Doubleclk;
	public WebElement Transactions_ACCtype_App_Doubleclk()
	{
		return Transactions_ACCtype_App_Doubleclk;
	}
	
	
	@FindBy(xpath="//td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']")
	private WebElement Transactions_Approve_data;
	public WebElement Transactions_Approve_data()
	{
		return Transactions_Approve_data;
	}
	
	@FindBy(xpath="//td[@id='td_acctypeList_GridTbl_Id_P017P_1_TYPE_CODE']")
	private WebElement Transactions_Acctype_App_doubleclk;
	public WebElement Transactions_Acctype_App_doubleclk()
	{
		return Transactions_Acctype_App_doubleclk;
	}
	
	@FindBy(xpath="//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
	private WebElement Transactions_Acctype_App_codevalue;
	public WebElement Transactions_Acctype_App_codevalue()
	{
		return Transactions_Acctype_App_codevalue;
	}
	
	@FindBy(xpath="//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
	private WebElement Transactions_Acctype_Appbtn;
	public WebElement Transactions_Acctype_Appbtn()
	{
		return Transactions_Acctype_Appbtn;
	}
	
//TRS_057//
	
	@FindBy(xpath="//input[@id='default_trscy_P024MA']")
	private WebElement Transactions_flag_setAcc;
	public WebElement Transactions_flag_setAcc()
	{
		return Transactions_flag_setAcc;
	}
	
	@FindBy(xpath="")
	private WebElement Transactions_;
	public WebElement Transactions_()
	{
		return Transactions_;
	}
	
	
	
	
	
	
}
