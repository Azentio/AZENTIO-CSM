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
	@FindBy(xpath="//span[text()='Update After Approve']")
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
	private WebElement transaction_existingdata;
	public WebElement transaction_existingdata()
	{
		return transaction_existingdata;
	}
	
	@FindBy(xpath="//label[text()='Update After Approve ']")
	private WebElement transactionUPA_UPAbtn;
	public WebElement transactionUPAUPAbtn()
	{
		return transactionUPA_UPAbtn;
	}
	
	@FindBy(id="hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;
	public WebElement CSMDateToChangeTheCurrentDate()
	{
	    return CSM_DateToChangeTheCurrentDate;
	}	

	@FindBy(id="global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;
	public WebElement CSMDateInUserRunningDate()
	{
	    return CSM_DateInUserRunningDate;
	}
	
	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate;
	public WebElement CSMUseButtonInChangeRunningDate() 
	{
	    return CSM_UseButtonInChangeRunningDate;
	}	

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSMOkButtonInAccessDeniedPopUpMenu;
	public WebElement CSMOkButtonInAccessDeniedPopUpMenu()
	{
	    return CSMOkButtonInAccessDeniedPopUpMenu;
	}	

	@FindBy(id="_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;
	public WebElement CSMCloseButtonInChangeRunningDate() 
	{
	    return CSM_CloseButtonInChangeRunningDate;
	}
	
	@FindBy(xpath ="//label[@id='trxMgntDefFormId_D001MT_Account_details_key']")
	private WebElement transactions_accdetailsbtn;
	public WebElement transactionsaccdetailsbtn() 
	{
	    return transactions_accdetailsbtn;
	}
	@FindBy(xpath="//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement transactions_accdetails_addbtn;
	public WebElement transactionsaccdetailsaddbtn() 
	{
	    return transactions_accdetails_addbtn;
	}
	
	@FindBy(xpath="//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_rn']")
	private WebElement transactions_accdetails_no1clk;
	public WebElement transactions_accdetailsno1clk() 
	{
	    return transactions_accdetails_no1clk;
	}
	@FindBy(xpath="//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']/div/input[@gridid='trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement transactions_accdetails_branchcode;
	public WebElement transactionsaccdetailsbranchcode() 
	{
	    return transactions_accdetails_branchcode;
	}
	@FindBy(xpath="//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']/div/input[@gridid='trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement transactions_accdetails_glcode;
	public WebElement transactionsaccdetailsglcode() 
	{
	    return transactions_accdetails_glcode;
	}
	@FindBy(xpath="//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']/div/input[@gridid='trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement transactions_accdetails_cifcode;
	public WebElement transactionsaccdetailscifcode() 
	{
	    return transactions_accdetails_cifcode;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement transactions_accdetails_serialcode;
	public WebElement transactionsaccdetailsserialcode() 
	{
	    return transactions_accdetails_serialcode;
	}
	
	@FindBy(xpath="//input[@id='new_1687502806947_ctstrsACCDETVO.FC_AMOUNT']")
	private WebElement transactions_accdetails_amountcode;
	public WebElement transactionsaccdetailsamountcode() 
	{
	    return transactions_accdetails_amountcode;
	}
	
	@FindBy(xpath="//input[@id='new_1687504981435_ctstrsACCDETVO.FC_AMOUNT']")
	private WebElement transactions_accdetails_amountcode2;
	public WebElement transactionsaccdetailsamountcode2() 
	{
	    return transactions_accdetails_amountcode2;
	}
	
	@FindBy(xpath="//input[@id='new_1687504981435_ctstrsACCDETVO.AC_BR']")
	private WebElement transactions_accdetails_branchcode2;
	public WebElement transactionsaccdetailsbranchcode2() 
	{
	    return transactions_accdetails_branchcode2;
	}
	
	@FindBy(xpath="//input[@id='new_1687504981435_ctstrsACCDETVO.AC_GL']")
	private WebElement transactions_accdetails_glcode2;
	public WebElement transactionsaccdetailsglcode2() 
	{
	    return transactions_accdetails_glcode2;
	}
	
	@FindBy(xpath="//input[@id='new_1687504981435_ctstrsACCDETVO.AC_CIF']")
	private WebElement transactions_accdetails_cifcode2;
	public WebElement transactionsaccdetailscifcode2() 
	{
	    return transactions_accdetails_cifcode2;
	}
	@FindBy(xpath="//input[@id='new_1687504981435_ctstrsACCDETVO.AC_SL_lookuptxt_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement transactions_accdetails_serialcode2;
	public WebElement transactionsaccdetailsserialcode2() 
	{
	    return transactions_accdetails_serialcode2;
	}
	@FindBy(xpath="//span[text()='ok']")
	private WebElement transactions_accdetails_okbtn;
	public WebElement transactionsaccdetailsokbtn() 
	{
	    return transactions_accdetails_okbtn;
	}
	//TRS_018//
	
	@FindBy(xpath="//td[text()='Transaction Type']")
	private WebElement Transactions_TranscationType;
	public WebElement Transactions_TranscationType()
	{
		return Transactions_TranscationType;
	}
	@FindBy(xpath="//a[@id='P024MA']/span[text()='Update After Approve']")
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
	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement Transactions_GridNextButton;
	public WebElement TransactionsGridNextButton()
	{
		return Transactions_GridNextButton;
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
	@FindBy(xpath="//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.CREDIT_CARD_PAYMENT_YN']")
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
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement Transactions_debitAcc_Cifcode;
	public WebElement Transactions_debitAcc_Cifcode()
	{
		return Transactions_debitAcc_Cifcode;
	}
	
	@FindBy(xpath="//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_creditAcc_Cifcode;
	public WebElement Transactions_creditAcc_Cifcode()
	{
		return Transactions_creditAcc_Cifcode;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_debitAcc_serialcode;
	public WebElement Transactions_debitAcc_serialcode()
	{
		return Transactions_debitAcc_serialcode;
	}
	@FindBy(xpath="//span[text()='close']")
	private WebElement transactions_viewmemo_closebtn;
	public WebElement transactionsviewmemoclosebtn()
	{
		return transactions_viewmemo_closebtn;
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
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement transactions_Approvescrn;
	public WebElement transactionsApprovescrn()
	{
		return transactions_Approvescrn;
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
	
	
	
	//TRS_105//
	
	
	@FindBy(xpath="//td[text()='User']")
	private WebElement Transactions_User;
	public WebElement Transactions_User()
	{
		return Transactions_User;
	}
	
	@FindBy(xpath="//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement Transactions_User_userid;
	public WebElement Transactions_User_userid()
	{
		return Transactions_User_userid;
	}
	
	@FindBy(xpath="//td[@id='td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.CODE']")
	private WebElement Transactions_User_doubleclk;
	public WebElement Transactions_User_doubleclk()
	{
		return Transactions_User_doubleclk;
	}
	
	@FindBy(xpath="//span[contains(text(),' CIF Types ')]")
	private WebElement Transactions_User_CifType;
	public WebElement Transactions_User_CifType()
	{
		return Transactions_User_CifType;
	}
	
	@FindBy(xpath="//td[@id='td_tab5_C_GridTbl_Id_E000MA_7_ctstellerciftypedetVO.CIF_TYPE']")
	private WebElement Transactions_Ciftype_Code;
	public WebElement Transactions_Ciftype_Code()
	{
		return Transactions_Ciftype_Code;
	}
	
	@FindBy(xpath="//td[@id='add_tab5_C_GridTbl_Id_E000MA']")
	private WebElement Transactions_Ciftype_Addsym;
	public WebElement Transactions_Ciftype_Addsym()
	{
		return Transactions_Ciftype_Addsym;
	}
	
	@FindBy(xpath="//input[@id='new_1685954235933_ctstellerciftypedetVO.TRX_TYPE_lookuptxt_tab5_C_GridTbl_Id_E000MA']")
	private WebElement Transactions_Ciftype_Transactions;
	public WebElement Transactions_Ciftype_Transactions()
	{
		return Transactions_Ciftype_Transactions;
	}
	
	@FindBy(xpath="//input[@id='new_1685954235933_ctstellerciftypedetVO.WITHD_LIMIT_CV']")
	private WebElement Transactions_Ciftype_WDLimit;
	public WebElement Transactions_Ciftype_WDLimit()
	{
		return Transactions_Ciftype_WDLimit;
	}
	@FindBy(xpath="//input[@id='new_1685954235933_ctstellerciftypedetVO.DEP_LIMIT_CV']")
	private WebElement Transactions_Ciftype_DepositLimit;
	public WebElement Transactions_Ciftype_DepositLimit()
	{
		return Transactions_Ciftype_DepositLimit;
	}
	@FindBy(xpath="//td[@id='td_tab5_C_GridTbl_Id_E000MA_8_ctstellerciftypedetVO.WARN_USER_LIMIT_EXCEED']")
	private WebElement Transactions_Ciftype_Warn_Flag;
	public WebElement Transactions_Ciftype_Warn_Flag()
	{
		return Transactions_Ciftype_Warn_Flag;
	}
	
	@FindBy(xpath="//span[text()='Ok']")
	private WebElement Transactions_Ciftype_okbtn;
	public WebElement Transactions_Ciftype_okbtn()
	{
		return Transactions_Ciftype_okbtn;
	}
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement Transactions_User_appscrn;
	public WebElement Transactions_User_appscrn()
	{
		return Transactions_User_appscrn;
	}
	@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement Transactions_User_appbtn;
	public WebElement Transactions_User_appbtn()
	{
		return Transactions_User_appbtn;
	}
	
	@FindBy(xpath="//a[@id='E000MA']/span[text()='Update after Approve']")
	private WebElement Transactions_User_UPA;
	public WebElement Transactions_User_UPA()
	{
		return Transactions_User_UPA;
	}
	@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement Transactions_User_UPAbtn;
	public WebElement Transactions_User_UPAbtn()
	{
		return Transactions_User_UPAbtn;
	}
	
	@FindBy(xpath="//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.CODE']")
	private WebElement Transactions_User_Appdoubleclk;
	public WebElement Transactions_User_Appdoubleclk()
	{
		return Transactions_User_Appdoubleclk;
	}
	
	@FindBy(xpath="//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement Transactions_User_Appcodevalue;
	public WebElement Transactions_User_Appcodevalue()
	{
		return Transactions_User_Appcodevalue;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_trx_type_D001MT']]")
	private WebElement Transactions_trxvalue;
	public WebElement Transactions_trxvalue()
	{
		return Transactions_trxvalue;
	}
	
	//TRS_106 //
	
	
	@FindBy(xpath="//span[text()=' Priority ']")
	private WebElement Transactions_priority;
	public WebElement Transactions_priority()
	{
		return Transactions_priority;
	}
	
	@FindBy(xpath="//td[@id='td_tab5_P_GridTbl_Id_E000MA_1_ctstellerciftypedetVO.CIF_TYPE']")
	private WebElement Transactions_priority_one;
	public WebElement Transactions_priority_one()
	{
		return Transactions_priority_one;
	}
	
	//TRS_106//
	
	
	@FindBy(xpath="//a[@id='D001AU']")
	private WebElement Transactions_core_appscrn;
	public WebElement Transactions_core_appscrn()
	{
		return Transactions_core_appscrn;
	}
	 
	  //TRS_161//
	
	@FindBy(xpath="//td[text()='Charges']")
	private WebElement Transactions_Charges;
	public WebElement Transactions_Charges()
	{
		return Transactions_Charges;
	}	
	
	@FindBy(xpath="//td[text()='Maintenance of Charges']")
	private WebElement Transactions_MaintanceofCharges;
	public WebElement Transactions_MaintanceofCharges()
	{
		return Transactions_MaintanceofCharges;
	}	
	
	@FindBy(xpath="//a[@id='C0011MA']")
	private WebElement Transactions_Charges_UPA;
	public WebElement Transactions_Charges_UPA()
	{
		return Transactions_Charges_UPA;
	}
	
	@FindBy(xpath="//input[@id= 'chargesParamList_GridTbl_Id_C0011MA_gs_ctschargesVO.BRIEF_NAME_ENG']")
	private WebElement Transactions_Charges_Briefname;
	public WebElement Transactions_Charges_Briefname()
	{
		return Transactions_Charges_Briefname;
	}
	
	@FindBy(xpath="//td[@id='td_chargesParamList_GridTbl_Id_C0011MA_2_ctschargesVO.CODE']")
	private WebElement Transactions_Charges_existingdata;
	public WebElement Transactions_Charges_existingdata()
	{
		return Transactions_Charges_existingdata;
	}
	
	
	@FindBy(xpath="//input[@id='allow_clearing_C0011MA']")
	private WebElement Transactions_Charges_allowclrflag;
	public WebElement Transactions_Charges_allowclrflag()
	{
		return Transactions_Charges_allowclrflag;
	}
	
	@FindBy(xpath="//input[@id='allow_modify_C0011MA']")
	private WebElement Transactions_Charges_allowflag;
	public WebElement Transactions_Charges_allowflag()
	{
		return Transactions_Charges_allowflag;
	}
	
	@FindBy(xpath="//label[@id='chargesParamMaint_FormId_C0011MA_Update_After_Approve_key']")
	private WebElement Transactions_Charges_UPAbtn;
	public WebElement Transactions_Charges_UPAbtn()
	{
		return Transactions_Charges_UPAbtn;
	}
	
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement Transactions_Charges_Appscrn;
	public WebElement Transactions_Charges_Appscrn()
	{
		return Transactions_Charges_Appscrn;
	}
	
	@FindBy(xpath="//input[@id='chargesParamList_GridTbl_Id_C0011P_gs_ctschargesVO.CODE']")
	private WebElement Transactions_Charges_code;
	public WebElement Transactions_Charges_code()
	{
		return Transactions_Charges_code;
	}
	
	@FindBy(xpath="//td[@id='td_chargesParamList_GridTbl_Id_C0011P_1_ctschargesVO.CODE']")
	private WebElement Transactions_Charges_Existingdata;
	public WebElement Transactions_Charges_Existingdata()
	{
		return Transactions_Charges_Existingdata;
	}
	
	@FindBy(xpath="//label[@id='chargesParamMaint_FormId_C0011P_Approve_key']")
	private WebElement Transactions_Charges_Appbtn;
	public WebElement Transactions_Charges_Appbtn()
	{
		return Transactions_Charges_Appbtn;
	}	
	
	@FindBy(xpath="//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement transactions_creditAcc_glcode;
	public WebElement transactionscreditAccglcode()
	{
		return transactions_creditAcc_glcode;
	}
	
	@FindBy(xpath="//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement transactions_CreditAcc_Cifcode;
	public WebElement transactionsCreditAccCifcode()
	{
		return transactions_CreditAcc_Cifcode;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement transactions_CreditAcc_Serialcode;
	public WebElement transactionsCreditAccSerialcode()
	{
		return transactions_CreditAcc_Serialcode;
	}
	
	@FindBy(xpath="//input[@id='charge_D001MT']")
	private WebElement Transactions_cv_charges;
	public WebElement Transactions_cv_charges()
	{
		return Transactions_cv_charges;
	}
	

}

	

