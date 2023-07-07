package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMcore_TransactionObj {
	
	WebDriver driver;	
	public CSMcore_TransactionObj(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[text()='Transactions']")
	private WebElement transactions_Transactions;
	public WebElement transactionsTransactions()
	{
		return transactions_Transactions;
	}	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement transactions_MaintenanceScreen;
	public WebElement transactionsMaintenanceScreen()
	{
		return transactions_MaintenanceScreen;
	}
	@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRX_TYPE']")
	private WebElement transactions_TrxTypeInput;
	public WebElement transactionsTrxTypeInput()
	{
		return transactions_TrxTypeInput;
	}
	@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement transactions_DepositAcc_BranchcodeInput;
	public WebElement transactionsDepositAccBranchcodeInput()
	{
		return transactions_DepositAcc_BranchcodeInput;
	}
	@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
	private WebElement transactions_DebitAcc_CurrencycodeInput;
	public WebElement transactionsDebitAccCurrencycodeInput()
	{
		return transactions_DebitAcc_CurrencycodeInput;
	}
	@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
	private WebElement transactions_DebitAcc_GlcodeInput;
	public WebElement transactionsDebitAccGlcodeInput()
	{
		return transactions_DebitAcc_GlcodeInput;
	}
	@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement transactions_DebitAcc_CifcodeInput;
	public WebElement transactionsDebitAccCifcodeInput()
	{
		return transactions_DebitAcc_CifcodeInput;
	}
	@FindBy(xpath="//span[text()='close']")
	private WebElement transactions_Viewmemo_closebtn;
	public WebElement transactionsViewmemoclosebtn()
	{
		return transactions_Viewmemo_closebtn;
	}
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TRS_AC_SL']")
	private WebElement transactions_DebitAcc_SerialcodeInput;
	public WebElement transactionsDebitAccSerialcodeInput()
	{
		return transactions_DebitAcc_SerialcodeInput;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement transactions_Warning_Okbtn;
	public WebElement transactionsWarningOkbtn()
	{
		return transactions_Warning_Okbtn;
	}	
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TRS_CY']")
	private WebElement transactions_CreditAcc_CurrencyInput;
	public WebElement transactionsCreditAccCurrencyInput()
	{
		return transactions_CreditAcc_CurrencyInput;
	}
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement transactions_EnterAmountInput;
	public WebElement transactionsEnterAmountInput()
	{
		return transactions_EnterAmountInput;
	}
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
	private WebElement transactions_CreditAcc_GlcodeInput;
	public WebElement transactionsCreditAccGlcodeInput()
	{
		return transactions_CreditAcc_GlcodeInput;
	}
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
	private WebElement transactions_CreditAcc_CifcodeInput;
	public WebElement transactionsCreditAccCifcodeInput()
	{
		return transactions_CreditAcc_CifcodeInput;
	}	
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_SL']")
	private WebElement transactions_CreditAcc_SerialcodeInput;
	public WebElement transactionsCreditAccSerialcodeInput()
	{
		return transactions_CreditAcc_SerialcodeInput;
	}
	@FindBy(xpath="//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement transactions_Maintance_Savebtn;
	public WebElement transactionsMaintanceSavebtn()
	{
		return transactions_Maintance_Savebtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement transaction_Trxsuccesspopup_Okbtn;
	public WebElement transactionTrxsuccesspopupOkbtn()
	{
		return transaction_Trxsuccesspopup_Okbtn;
	}	
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement transactions_ApproveScreen;
	public WebElement transactionsApproveScreen()
	{
		return transactions_ApproveScreen;
	}
	@FindBy(xpath="//input[@name='TRS_NO']")
	private WebElement transactions_TransactionNo_InputValue;
	public WebElement transactionsTransactionNoInputValue()
	{
		return transactions_TransactionNo_InputValue;
	}
	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement transactions_TransactionNo_Doubleclk;
	public WebElement transactionsTransactionNoDoubleclk()
	{
		return transactions_TransactionNo_Doubleclk;
	}	
	
	@FindBy(xpath="//span[contains(text(),' Approve ')]")
	private WebElement transactions_Approvescreen_Appbtn;
	public WebElement transactionsApprovescreenAppbtn()
	{
		return transactions_Approvescreen_Appbtn;
	}
	
	@FindBy(xpath="//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transactions_Maintance_SearchIcon;
	public WebElement transactionsMaintanceSearchIcon()
	{
		return transactions_Maintance_SearchIcon;
	}
	@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
	private WebElement transactions_Maintance_BookedEntriesBtn;
	public WebElement transactionsMaintanceBookedEntriesBtn()
	{
		return transactions_Maintance_BookedEntriesBtn;
	}
	
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
	private WebElement transactions_CreditAcc_BranchcodeInput;
	public WebElement transactionsCreditAccBranchcodeInput()
	{
		return transactions_CreditAcc_BranchcodeInput;
	}
	
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CY']")
	private WebElement transactions_CreditAcc_CurrencyCodeInput;
	public WebElement transactionsCreditAccCurrencyCodeInput()
	{
		return transactions_CreditAcc_CurrencyCodeInput;
	}
	
	 //Param objects
	
	
	
	                                        
}
