package pageobjects.csmParamAndCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Transaction_Object_614 {
	
	WebDriver driver;
	
	public CSM_Transaction_Object_614(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//td[text()='Transactions']")
	private WebElement csm_TransactionUnderTheCSMApplication;
	public WebElement csmTransactionUnderTheCSMApplication()
	{
		return csm_TransactionUnderTheCSMApplication;
	}	
	
	
	@FindBy(xpath="//a[@id='D001MT']//span[text()='Maintenance']")
	private WebElement csm_MaintenanceUnderTheTransaction;
	public WebElement csmMaintenanceUnderTheTransaction()
	{
		return csm_MaintenanceUnderTheTransaction;
	}	
	
	
	@FindBy(xpath="//div//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement csm_TrxTypeUnderTheTransaction;
	public WebElement csmTrxTypeUnderTheTransaction()
	{
		return csm_TrxTypeUnderTheTransaction;
	}
		
	
	@FindBy(xpath="//span[@id='spanLookup_trs_ac_sl_D001MT']")
	private WebElement csm_FirstAccountCheckUnderTheTransaction;
	public WebElement csmFirstAccountCheckUnderTheTransaction()
	{
		return csm_FirstAccountCheckUnderTheTransaction;
	}	
	
	
	@FindBy(xpath="//div//input[@name='amfVO.GL_CODE']")
	private WebElement csm_FirstAccountCheckGLCodeUnderTheTransaction;
	public WebElement csmFirstAccountCheckGLCodeUnderTheTransaction()
	{
		return csm_FirstAccountCheckGLCodeUnderTheTransaction;
	}
	
	
	
	@FindBy(xpath="//tr//td[contains(text(),'312')]")
	private WebElement csm_FirstAccountCheckGLCodeSelectUnderTheTransaction;
	public WebElement csmFirstAccountCheckGLCodeSelectUnderTheTransaction()
	{
		return csm_FirstAccountCheckGLCodeSelectUnderTheTransaction;
	}
	
		
	@FindBy(xpath="//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csm_CurrencyUnderTheTransaction;
	public WebElement csmCurrencyUnderTheTransaction()
	{
		return csm_CurrencyUnderTheTransaction;
	}
	
	
	
	@FindBy(xpath="//span[@id='spanLookup_to_trs_ac_sl_D001MT']")
	private WebElement csm_SecondAccountCheckUnderTheTransaction;
	public WebElement csmSecondAccountCheckUnderTheTransaction()
	{
		return csm_SecondAccountCheckUnderTheTransaction;
	}	
	
	
	@FindBy(xpath="//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.GL_CODE']")
	private WebElement csm_SecondAccountCheckGLCodeUnderTheTransaction;
	public WebElement csmSecondAccountCheckGLCodeUnderTheTransaction()
	{
		return csm_SecondAccountCheckGLCodeUnderTheTransaction;
	}
	
	
	
	@FindBy(xpath="//tr//td[contains(text(),'313')]")
	private WebElement csm_SecondAccountCheckGLCodeSelectUnderTheTransaction;
	public WebElement csmSecondAccountCheckGLCodeSelectUnderTheTransaction()
	{
		return csm_SecondAccountCheckGLCodeSelectUnderTheTransaction;
	}
	
	
	
	@FindBy(xpath="//button[@id='trxMgntSaveBtn_D001MT'][@value='Submit']")
	private WebElement csm_SaveUnderTheTransaction;
	public WebElement csmSaveUnderTheTransaction()
	{
		return csm_SaveUnderTheTransaction;
	}
		

	
	
	@FindBy(xpath="//input[@type='button'][@value='Ok']")
	private WebElement csm_WarningMessage;
	public WebElement csmWarningMessage()
	{
		return csm_WarningMessage;
	}
	
	
//	Take the 3rd value as Transaction number

	@FindBy(xpath="//div[@class='jMsgbox-contentWrap']")
	private WebElement csm_TransactionNoPopupUnderTheTransaction;
	public WebElement csmTransactionNoPopupUnderTheTransaction()
	{
		return csm_TransactionNoPopupUnderTheTransaction;
	}	
	
	
	
	@FindBy(xpath="//a[@id='D001AU']//span[text()='Approve']")
	private WebElement csm_ApproveUnderTheTransaction;
	public WebElement csmApproveUnderTheTransaction()
	{
		return csm_ApproveUnderTheTransaction;
	}
	
	
	@FindBy(xpath="//input[@name='TRS_NO']")
	private WebElement csm_TransactionNoUnderTheApprove;
	public WebElement csmTransactionNoUnderTheApprove()
	{
		return csm_TransactionNoUnderTheApprove;
	}
	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO'][@title='7600']")
	private WebElement csm_SelectTransactionNoUnderTheApprove;
	public WebElement csmSelectTransactionNoUnderTheApprove()
	{
		return csm_SelectTransactionNoUnderTheApprove;
	}
		
	
	@FindBy(xpath="//*[text()='Approve']")
	private WebElement csm_ApproveUnderTheApprove;
	public WebElement csmApproveUnderTheApprove()
	{
		return csm_ApproveUnderTheApprove;
	}
		
	
	@FindBy(xpath="//input[@id='_popup_path_sol_ok'][@value='Ok']")
	private WebElement csm_ApproveSuccessUnderTheApprove;
	public WebElement csmApproveSuccessUnderTheApprove()
	{
		return csm_ApproveSuccessUnderTheApprove;
	}
	
	
	@FindBy(xpath="//a[@id='infoBarSearchButton_D001MT']")
	private WebElement csm_SearchUnderTheMaintenance;
	public WebElement csmSearchUnderTheMaintenance()
	{
		return csm_SearchUnderTheMaintenance;
	}
	
	
	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO'][@title='7600']")
	private WebElement csm_SelectTransactionNoUnderTheMaintenance;
	public WebElement csmSelectTransactionNoUnderTheMaintenance()
	{
		return csm_SelectTransactionNoUnderTheMaintenance;
	}	
	
	
	@FindBy(xpath="//*[text()='Booked Entries ']")
	private WebElement csm_BookedEnteriesUnderTheMaintenance;
	public WebElement csmBookedEnteriesUnderTheMaintenance()
	{
		return csm_BookedEnteriesUnderTheMaintenance;
	}
	
	@FindBy(xpath="//div//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
	private WebElement csm_FirstTransactionCurrencyUnderTheMaintenance;
	public WebElement csmFirstTransactionCurrencyUnderTheMaintenance()
	{
		return csm_FirstTransactionCurrencyUnderTheMaintenance;
	}
	
	
	
	@FindBy(xpath="//div//input[@name='trxMgntCO.ctstrsVO.TRS_CY']")
	private WebElement csm_CurrencyCodeUnderTheMaintenance;
	public WebElement csmCurrencyCodeUnderTheMaintenance()
	{
		return csm_CurrencyCodeUnderTheMaintenance;
	}
	
	/*
	 * Queries screen
	 */
	
	@FindBy(xpath="//*[text()='Queries']")
	private WebElement csm_Queries;
	public WebElement csmQueries()
	{
		return csm_Queries;
	}
	
	@FindBy(xpath="//*[text()='Statement Of Accounts']")
	private WebElement csm_StatementOfAccountsUnderTheQueries;
	public WebElement csmStatementOfAccountsUnderTheQueries()
	{
		return csm_StatementOfAccountsUnderTheQueries;
	}
	
	@FindBy(xpath="//*[text()='By Trade Date']")
	private WebElement csm_TradeByDateUnderTheQueries;
	public WebElement csmTradeByDateUnderTheQueries()
	{
		return csm_TradeByDateUnderTheQueries;
	}
		
	
	@FindBy(xpath="//span[@id='spanLookup_accSl_QUER001T']")
	private WebElement csm_AccountSearchIconUnderTheTradeByDateUnderTheQueries;
	public WebElement csmAccountSearchIconUnderTheTradeByDateUnderTheQueries()
	{
		return csm_AccountSearchIconUnderTheTradeByDateUnderTheQueries;
	}
	
	
	@FindBy(xpath="//input[@id='gridtab_accSl_QUER001T_gs_amfVO.GL_CODE']")
	private WebElement csm_GLCodeUnderTheTradeByDateUnderTheQueries;
	public WebElement csmGLCodeUnderTheTradeByDateUnderTheQueries()
	{
		return csm_GLCodeUnderTheTradeByDateUnderTheQueries;
	}
	
	
	
	@FindBy(xpath="//td[@id='td_gridtab_accSl_QUER001T_1_amfVO.GL_CODE']")
	private WebElement csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries;
	public WebElement csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries()
	{
		return csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries;
	}
		
	
	@FindBy(xpath="//label[@id='statementOfAccountsForm_QUER001T_Retrieve_key']")
	private WebElement csm_RetrieveButtonUnderTheTradeByDateUnderTheQueries;
	public WebElement csmRetrieveButtonUnderTheTradeByDateUnderTheQueries()
	{
		return csm_RetrieveButtonUnderTheTradeByDateUnderTheQueries;
	}
	
	
	@FindBy(xpath="//td[@title='1110457']//parent::tr//td[@id='td_statementOfAccountsDetGridTbl_Id_QUER001T_2_transCvAmt']']")
	private WebElement csm_CVValueUnderTheTradeByDateUnderTheQueries;
	public WebElement csmCVValueUnderTheTradeByDateUnderTheQueries()
	{
		return csm_CVValueUnderTheTradeByDateUnderTheQueries;
	}
	
	
	@FindBy(xpath="//div[@id='lookupid_trs_ac_sl_D001MT']")
	private WebElement csm_CreditAccountForDepositTransactionWithSameCurrency;
	public WebElement csmCreditAccountForDepositTransactionWithSameCurrency()
	{
		return csm_CreditAccountForDepositTransactionWithSameCurrency;
	}
	
	
	
	@FindBy(xpath="//div//input[@id='trs_ac_br_D001MT']")
	private WebElement csm_FirstAccountBranchCodeUnderMaintenenanceTRX;
	public WebElement csmFirstAccountBranchCodeUnderMaintenenanceTRX()
	{
		return csm_FirstAccountBranchCodeUnderMaintenenanceTRX;
	}
		
	
	@FindBy(xpath="//div//input[@id='trs_ac_cy_D001MT']")
	private WebElement csm_FirstAccountCurrencyCodeUnderMaintenenanceTRX;
	public WebElement csmFirstAccountCurrencyCodeUnderMaintenenanceTRX()
	{
		return csm_FirstAccountCurrencyCodeUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//div//input[@id='trs_ac_gl_D001MT']")
	private WebElement csm_FirstAccountGLCodeUnderMaintenenanceTRX;
	public WebElement csmFirstAccountGLCodeUnderMaintenenanceTRX()
	{
		return csm_FirstAccountGLCodeUnderMaintenenanceTRX;
	}
		
	
	@FindBy(xpath="//div//input[@id='trs_ac_cif_D001MT']")
	private WebElement csm_FirstAccountCIFCodeUnderMaintenenanceTRX;
	public WebElement csmFirstAccountCIFCodeUnderMaintenenanceTRX()
	{
		return csm_FirstAccountCIFCodeUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//div//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement csm_FirstAccountSerialNoUnderMaintenenanceTRX;
	public WebElement csmFirstAccountSerialNoUnderMaintenenanceTRX()
	{
		return csm_FirstAccountSerialNoUnderMaintenenanceTRX;
	}
	
	
	
	@FindBy(xpath="//div//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement csm_CurrencyCodeForTRXUnderMaintenenanceTRX;
	public WebElement csmCurrencyCodeForTRXUnderMaintenenanceTRX()
	{
		return csm_CurrencyCodeForTRXUnderMaintenenanceTRX;
	}
	
	
	@FindBy(xpath="//div//input[@id='amount_D001MT']")
	private WebElement csm_EnterAmountForTRXUnderMaintenenanceTRX;
	public WebElement csmEnterAmountForTRXUnderMaintenenanceTRX()
	{
		return csm_EnterAmountForTRXUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Account_details_key']")
	private WebElement csm_AccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_AccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	
	@FindBy(xpath="//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement csm_AddRowUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmAddRowUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_AddRowUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	
	
	@FindBy(xpath="//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR']")
	private WebElement csm_FirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmFirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_FirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR,account.CURRENCY_CODE:ctstrsACCDETVO.AC_CY,account.GL_CODE:ctstrsACCDETVO.AC_GL']")
	private WebElement csm_FirstAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmFirstAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_FirstAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR,account.CURRENCY_CODE:ctstrsACCDETVO.AC_CY,account.GL_CODE:ctstrsACCDETVO.AC_GL,account.CIF_SUB_NO:ctstrsACCDETVO.AC_CIF,criteria.trxType:lookuptxt_trx_type_D001MT,memoSC.optRef:trxmgnt_memoOptRef_D001MT']")
	private WebElement csm_FirstAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmFirstAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_FirstAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@params='trxMgntCO.ctstrsACCDETVO.AC_BR:ctstrsACCDETVO.AC_BR,trxMgntCO.ctstrsACCDETVO.AC_CY:ctstrsACCDETVO.AC_CY,trxMgntCO.ctstrsACCDETVO.AC_GL:ctstrsACCDETVO.AC_GL,trxMgntCO.ctstrsACCDETVO.AC_CIF:ctstrsACCDETVO.AC_CIF,trxMgntCO.ctstrsACCDETVO.AC_SL:ctstrsACCDETVO.AC_SL_lookuptxt,trxMgntCO.ctstrsVO.TRX_TYPE:lookuptxt_trx_type_D001MT,trxMgntCO.ctstrsVO.TRS_DATE:TRS_DATE_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CIF:trs_ac_cif_D001MT,trxMgntCO.ctstrsVO.TRSFR_METHOD:trsfr_method_D001MT,trxMgntCO.ctstrsVO.VALUE_DATE:value_date_D001MT,trxMgntCO.linkOpened:confirmVal_D001MT']")
	private WebElement csm_FirstAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmFirstAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_FirstAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	
	@FindBy(xpath="//input[@params='trxMgntCO.ctstrsACCDETVO.AC_BR:ctstrsACCDETVO.AC_BR,trxMgntCO.ctstrsACCDETVO.AC_CY:ctstrsACCDETVO.AC_CY,trxMgntCO.ctstrsACCDETVO.AC_GL:ctstrsACCDETVO.AC_GL,trxMgntCO.ctstrsACCDETVO.AC_CIF:ctstrsACCDETVO.AC_CIF,trxMgntCO.ctstrsACCDETVO.AC_SL:ctstrsACCDETVO.AC_SL_lookuptxt,trxMgntCO.ctstrsACCDETVO.FC_AMOUNT:ctstrsACCDETVO.FC_AMOUNT,trxMgntCO.trxMgntAccDetGrid:trxMgntAccDetGrid_D001MT,trxMgntCO.ctstrsVO.TRS_CY:lookuptxt_trs_cy_D001MT,trxMgntCO.ctstrsVO.TRS_AC_BR:trs_ac_br_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CY:trs_ac_cy_D001MT,trxMgntCO.ctstrsVO.TRS_AC_GL:trs_ac_gl_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CIF:trs_ac_cif_D001MT,trxMgntCO.ctstrsVO.TRS_AC_SL:lookuptxt_trs_ac_sl_D001MT,trxMgntCO.ctstrsVO.CH_AC_BR:ch_ac_br_D001MT,trxMgntCO.ctstrsVO.CH_AC_CY:ch_ac_cy_D001MT,trxMgntCO.ctstrsVO.CH_AC_GL:ch_ac_gl_D001MT,trxMgntCO.ctstrsVO.CH_AC_CIF:ch_ac_cif_D001MT,trxMgntCO.ctstrsVO.CH_AC_SL:lookuptxt_ch_ac_sl_D001MT,trxMgntCO.ctstrsVO.EXCHANGE_RATE:exchange_rate_D001MT,trxMgntCO.ctstrsVO.MULT_DIV_IND:mult_div_ind_D001MT,trxMgntCO.ctstrsVO.TRX_TYPE:lookuptxt_trx_type_D001MT,trxMgntCO.ctstrsVO.CASH_DEDUCT_IND:cash_deduct_ind_D001MT,trxMgntCO.ctstrsVO.TRSFR_METHOD:trsfr_method_D001MT,trxMgntCO.ctstrsVO.VALUE_DATE:value_date_D001MT,trxMgntCO.ctstrsVO.AMOUNT:amount_D001MT,trxMgntCO.ctstrsVO.TRS_AC_AMOUNT:trs_ac_amount_D001MT,_pageRef:pageRef_D001MT,iv_crud:ivcrud_D001MT']")
	private WebElement csm_FirstAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmFirstAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_FirstAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	
	@FindBy(xpath="//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']")
	private WebElement csm_FirstAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmFirstAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_FirstAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="(//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR'])[2]")
	private WebElement csm_SecondAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmSecondAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_SecondAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR']")
	private WebElement csm_SecondAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmSecondAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_SecondAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR,account.CURRENCY_CODE:ctstrsACCDETVO.AC_CY,account.GL_CODE:ctstrsACCDETVO.AC_GL']")
	private WebElement csm_SecondAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmSecondAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_SecondAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@params='account.BRANCH_CODE:ctstrsACCDETVO.AC_BR,account.CURRENCY_CODE:ctstrsACCDETVO.AC_CY,account.GL_CODE:ctstrsACCDETVO.AC_GL,account.CIF_SUB_NO:ctstrsACCDETVO.AC_CIF,criteria.trxType:lookuptxt_trx_type_D001MT,memoSC.optRef:trxmgnt_memoOptRef_D001MT']")
	private WebElement csm_SecondAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmSecondAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_SecondAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@params='trxMgntCO.ctstrsACCDETVO.AC_BR:ctstrsACCDETVO.AC_BR,trxMgntCO.ctstrsACCDETVO.AC_CY:ctstrsACCDETVO.AC_CY,trxMgntCO.ctstrsACCDETVO.AC_GL:ctstrsACCDETVO.AC_GL,trxMgntCO.ctstrsACCDETVO.AC_CIF:ctstrsACCDETVO.AC_CIF,trxMgntCO.ctstrsACCDETVO.AC_SL:ctstrsACCDETVO.AC_SL_lookuptxt,trxMgntCO.ctstrsVO.TRX_TYPE:lookuptxt_trx_type_D001MT,trxMgntCO.ctstrsVO.TRS_DATE:TRS_DATE_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CIF:trs_ac_cif_D001MT,trxMgntCO.ctstrsVO.TRSFR_METHOD:trsfr_method_D001MT,trxMgntCO.ctstrsVO.VALUE_DATE:value_date_D001MT,trxMgntCO.linkOpened:confirmVal_D001MT']")
	private WebElement csm_SecondAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmSecondAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_SecondAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	
	@FindBy(xpath="//input[@params='trxMgntCO.ctstrsACCDETVO.AC_BR:ctstrsACCDETVO.AC_BR,trxMgntCO.ctstrsACCDETVO.AC_CY:ctstrsACCDETVO.AC_CY,trxMgntCO.ctstrsACCDETVO.AC_GL:ctstrsACCDETVO.AC_GL,trxMgntCO.ctstrsACCDETVO.AC_CIF:ctstrsACCDETVO.AC_CIF,trxMgntCO.ctstrsACCDETVO.AC_SL:ctstrsACCDETVO.AC_SL_lookuptxt,trxMgntCO.ctstrsACCDETVO.FC_AMOUNT:ctstrsACCDETVO.FC_AMOUNT,trxMgntCO.trxMgntAccDetGrid:trxMgntAccDetGrid_D001MT,trxMgntCO.ctstrsVO.TRS_CY:lookuptxt_trs_cy_D001MT,trxMgntCO.ctstrsVO.TRS_AC_BR:trs_ac_br_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CY:trs_ac_cy_D001MT,trxMgntCO.ctstrsVO.TRS_AC_GL:trs_ac_gl_D001MT,trxMgntCO.ctstrsVO.TRS_AC_CIF:trs_ac_cif_D001MT,trxMgntCO.ctstrsVO.TRS_AC_SL:lookuptxt_trs_ac_sl_D001MT,trxMgntCO.ctstrsVO.CH_AC_BR:ch_ac_br_D001MT,trxMgntCO.ctstrsVO.CH_AC_CY:ch_ac_cy_D001MT,trxMgntCO.ctstrsVO.CH_AC_GL:ch_ac_gl_D001MT,trxMgntCO.ctstrsVO.CH_AC_CIF:ch_ac_cif_D001MT,trxMgntCO.ctstrsVO.CH_AC_SL:lookuptxt_ch_ac_sl_D001MT,trxMgntCO.ctstrsVO.EXCHANGE_RATE:exchange_rate_D001MT,trxMgntCO.ctstrsVO.MULT_DIV_IND:mult_div_ind_D001MT,trxMgntCO.ctstrsVO.TRX_TYPE:lookuptxt_trx_type_D001MT,trxMgntCO.ctstrsVO.CASH_DEDUCT_IND:cash_deduct_ind_D001MT,trxMgntCO.ctstrsVO.TRSFR_METHOD:trsfr_method_D001MT,trxMgntCO.ctstrsVO.VALUE_DATE:value_date_D001MT,trxMgntCO.ctstrsVO.AMOUNT:amount_D001MT,trxMgntCO.ctstrsVO.TRS_AC_AMOUNT:trs_ac_amount_D001MT,_pageRef:pageRef_D001MT,iv_crud:ivcrud_D001MT']")
	private WebElement csm_SecondAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmSecondAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_SecondAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	
	
	@FindBy(xpath="//*[text()='ok']")
	private WebElement csm_ClickOKUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	public WebElement csmClickOKUnderAccuntDetailsLabelUnderMaintenenanceTRX()
	{
		return csm_ClickOKUnderAccuntDetailsLabelUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//*[text()='ok']")
	private WebElement csm_ClickOKUnderMaintenanceTRX;
	public WebElement csmClickOKUnderMaintenanceTRX()
	{
		return csm_ClickOKUnderMaintenanceTRX;
	}
	
	@FindBy(xpath="//input[@id='branch_code_D001MT']")
	private WebElement csm_BranchCodeForCurrencyUnderMaintenanceTRX;
	public WebElement csmBranchCodeForCurrencyUnderMaintenanceTRX()
	{
		return csm_BranchCodeForCurrencyUnderMaintenanceTRX;
	}
	
	
	
	@FindBy(xpath="//input[@id='ctrl_cy_D001MT']")
	private WebElement csm_CurrencyCodeForCurrencyUnderMaintenanceTRX;
	public WebElement csmCurrencyCodeForCurrencyUnderMaintenanceTRX()
	{
		return csm_CurrencyCodeForCurrencyUnderMaintenanceTRX;
	}
	
	
	@FindBy(xpath="//input[@id='ctrl_gl_D001MT']")
	private WebElement csm_GLCodeForCurrencyUnderMaintenanceTRX;
	public WebElement csmGLCodeForCurrencyUnderMaintenanceTRX()
	{
		return csm_GLCodeForCurrencyUnderMaintenanceTRX;
	}
	
	@FindBy(xpath="//input[@id='ctrl_cif_D001MT']")
	private WebElement csm_CIFCodeForCurrencyUnderMaintenanceTRX;
	public WebElement csmCIFCodeForCurrencyUnderMaintenanceTRX()
	{
		return csm_CIFCodeForCurrencyUnderMaintenanceTRX;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement csm_SICodeForCurrencyUnderMaintenanceTRX;
	public WebElement csmSICodeForCurrencyUnderMaintenanceTRX()
	{
		return csm_SICodeForCurrencyUnderMaintenanceTRX;
	}
	
	
	
	@FindBy(xpath="(//input[@id='_popup_path_sol_ok'])[2]")
	private WebElement csm_ConcurrentPopUp;
	public WebElement csmConcurrentPopUp()
	{
		return csm_ConcurrentPopUp;
	}
	
	
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement csm_ClickOnParametersUnderCSMParams;
	public WebElement csmClickOnParametersUnderCSMParams()
	{
		return csm_ClickOnParametersUnderCSMParams;
	}
	
	@FindBy(xpath="//input[@id='to_trs_ac_br_D001MT']")
	private WebElement csm_SecondAccountBranchCodeUnderMaintenenanceTRX;
	public WebElement csmSecondAccountBranchCodeUnderMaintenenanceTRX()
	{
		return csm_SecondAccountBranchCodeUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement csm_SecondAccountGLCodeUnderMaintenenanceTRX;
	public WebElement csmSecondAccountGLCodeUnderMaintenenanceTRX() {
		return csm_SecondAccountGLCodeUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement csm_SecondAccountCIFCodeUnderMaintenenanceTRX;	
	public WebElement csmSecondAccountCIFCodeUnderMaintenenanceTRX() {
		return csm_SecondAccountCIFCodeUnderMaintenenanceTRX;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement csm_SecondAccountSINOUnderMaintenenanceTRX;	
	public WebElement csmSecondAccountSINOUnderMaintenenanceTRX() {
		return csm_SecondAccountSINOUnderMaintenenanceTRX;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//td[text()='System Parameters']  system parameter
	
	//td[text()='Transaction Type'] transaction type
	
	//span[text()='Update After Approve'] update after approve
	
	//input[@name='CODE']  input code name
	
	//td[text()='226'] double click entered code 
	
	
	//*[contains(text(),'CIF Charges')] click on the CIF charges
	
	//td[@id='add_tab25_GridTbl_Id_P024MA'] click + icon in cif charges
	
	
	
	
	
	
}




