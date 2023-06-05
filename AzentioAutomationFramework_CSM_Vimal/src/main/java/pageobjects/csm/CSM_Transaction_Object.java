package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Transaction_Object {
	
	WebDriver driver;
	
	public CSM_Transaction_Object(WebDriver driver) {
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
	
	
	
}



