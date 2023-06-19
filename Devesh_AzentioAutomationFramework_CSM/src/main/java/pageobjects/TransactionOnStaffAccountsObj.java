package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionOnStaffAccountsObj {
	
	WebDriver driver;

	public TransactionOnStaffAccountsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Transactions Menu
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement transactions_MenuOption;
	
	public WebElement transactions_MenuOption() {
		return transactions_MenuOption;
	}
	
	// Transaction Maintenance
	@FindBy(xpath = "//a[@id='D001MT']/span[text()='Maintenance']")
	private WebElement transactions_Maintenance;
	
	public WebElement transactions_Maintenance() {
		return transactions_Maintenance;
	}
	
	// Transaction Search button
	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transactions_SearchButton;
	
	public WebElement transactions_SearchButton() {
		return transactions_SearchButton;
	}
	
	// Trx type input field
	@FindBy(xpath = "//input[@id='gridtab_trx_type_D001MT_gs_CODE']")
	private WebElement transactions_TrxTypeCode;
	
	public WebElement transactions_TrxTypeCode() {
		return transactions_TrxTypeCode;
	}
	
	// Trx type lookup button
	@FindBy(xpath = "//span[@id='spanLookup_trx_type_D001MT']/span")
	private WebElement transactions_TrxType_LookupButton;
	
	public WebElement transactions_TrxType_LookupButton() {
		return transactions_TrxType_LookupButton;
	}
	
	// credit account details lookup button
	@FindBy(xpath = "//span[@id='spanLookup_trs_ac_sl_D001MT']/span")
	private WebElement transactions_Maintenance_CreditAccountLookupButton;
	
	public WebElement transactions_Maintenance_CreditAccountLookupButton() {
		return transactions_Maintenance_CreditAccountLookupButton;
	}
	
	// credit account details lookup button
	@FindBy(xpath = "//span[@id='spanLookup_trs_ac_sl_D001MT']/span")
	private WebElement transactions_Maintenance_FromAccountLookupButton;
	
	public WebElement transactions_Maintenance_FromAccountLookupButton() {
		return transactions_Maintenance_FromAccountLookupButton;
	}
	
	// Debit A/c Currency code
	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement transactions_Maintenance_FromCurrencyCode;
	
	public WebElement transactions_Maintenance_FromCurrencyCode() {
		return transactions_Maintenance_FromCurrencyCode;
	}
	
	// To A/c Currency code
	@FindBy(xpath = "//input[@id='ctrl_cy_D001MT']")
	private WebElement transactions_Maintenance_ToCurrencyCode;
	
	public WebElement transactions_Maintenance_ToCurrencyCode() {
		return transactions_Maintenance_ToCurrencyCode;
	}
	
	// Debit A/c GL code
	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement transactions_Maintenance_GlCode;
	
	public WebElement transactions_Maintenance_GlCode() {
		return transactions_Maintenance_GlCode;
	}

	// To A/c GL code
	@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
	private WebElement transactions_Maintenance_ToGlCode;
	
	public WebElement transactions_Maintenance_ToGlCode() {
		return transactions_Maintenance_ToGlCode;
	}
	
	// Debit A/c CIF No
	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement transactions_Maintenance_CifNo;
	
	public WebElement transactions_Maintenance_CifNo() {
		return transactions_Maintenance_CifNo;
	}
	
	// To A/c CIF No
	@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
	private WebElement transactions_Maintenance_ToCifNo;
	
	public WebElement transactions_Maintenance_ToCifNo() {
		return transactions_Maintenance_ToCifNo;
	}
	
	// ViewMemo CloseButton
	@FindBy(xpath = "//span[text()='close']")
	private WebElement transactions_ViewMemoCloseButton;

	public WebElement transactions_ViewMemoCloseButton() {
		return transactions_ViewMemoCloseButton;
	}
	
	// Debit A/c Sl No
	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement transactions_Maintenance_SlNo;
	
	public WebElement transactions_Maintenance_SlNo() {
		return transactions_Maintenance_SlNo;
	}
	
	// From A/c Additional reference
	@FindBy(xpath = "//input[@id='lookuptxt_acc_additional_reference_D001MT']")
	private WebElement transactions_Maintenance_AdditionalRef;
	
	public WebElement transactions_Maintenance_AdditionalRef() {
		return transactions_Maintenance_AdditionalRef;
	}
	
	// To A/c Sl No
	@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
	private WebElement transactions_Maintenance_ToSlNo;
	
	public WebElement transactions_Maintenance_ToSlNo() {
		return transactions_Maintenance_ToSlNo;
	}

	// To account details lookup button
	@FindBy(xpath = "//span[@id='spanLookup_to_trs_ac_sl_D001MT']/span")
	private WebElement transactions_Maintenance_ToAccountLookupButton;
	
	public WebElement transactions_Maintenance_ToAccountLookupButton() {
		return transactions_Maintenance_ToAccountLookupButton;
	}
	// credit A/c branch code lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.BRANCH_CODE']")
	private WebElement transactions_Maintenance_BranchCodeLookupInput;

	public WebElement transactions_Maintenance_BranchCodeLookupInput() {
		return transactions_Maintenance_BranchCodeLookupInput;
	}
	// credit A/c currency lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.CURRENCY_CODE']")
	private WebElement transactions_Maintenance_CurrencyLookupInput;

	public WebElement transactions_Maintenance_CurrencyLookupInput() {
		return transactions_Maintenance_CurrencyLookupInput;
	}
	// credit A/c GL code lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.GL_CODE']")
	private WebElement transactions_Maintenance_GlCodeLookupInput;

	public WebElement transactions_Maintenance_GlCodeLookupInput() {
		return transactions_Maintenance_GlCodeLookupInput;
	}
	// credit A/c CIF lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.CIF_SUB_NO']")
	private WebElement transactions_Maintenance_CifLookupInput;

	public WebElement transactions_Maintenance_CifLookupInput() {
		return transactions_Maintenance_CifLookupInput;
	}
	// credit A/c Slno lookup input
	@FindBy(xpath = "//input[@id='gridtab_trs_ac_sl_D001MT_gs_amfVO.SL_NO']")
	private WebElement transactions_Maintenance_SlNoLookupInput;

	public WebElement transactions_Maintenance_SlNoLookupInput() {
		return transactions_Maintenance_SlNoLookupInput;
	}
	// credit A/c Branch code first value
	@FindBy(xpath = "//td[@id='td_gridtab_trs_ac_sl_D001MT_1_amfVO.BRANCH_CODE']")
	private WebElement transactions_Maintenance_LookupFirstRecord;

	public WebElement transactions_Maintenance_LookupFirstRecord() {
		return transactions_Maintenance_LookupFirstRecord;
	}
	
	// Currency
	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement transactions_Maintenance_Currency;
	
	public WebElement transactions_Maintenance_Currency() {
		return transactions_Maintenance_Currency;
	}
	
	// Amount
	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement transactions_Maintenance_Amount;
	
	public WebElement transactions_Maintenance_Amount() {
		return transactions_Maintenance_Amount;
	}
	// Amount label
	@FindBy(xpath = "//label[@id='lbl_amount_D001MT']")
	private WebElement transactions_Maintenance_AmountLabel;
	
	public WebElement transactions_Maintenance_AmountLabel() {
		return transactions_Maintenance_AmountLabel;
	}
	
	// Debit A/c branch code lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.BRANCH_CODE']")
	private WebElement transactions_Maintenance_ToBranchCodeLookupInput;

	public WebElement transactions_Maintenance_ToBranchCodeLookupInput() {
		return transactions_Maintenance_ToBranchCodeLookupInput;
	}
	// Debit A/c currency lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.CURRENCY_CODE']")
	private WebElement transactions_Maintenance_ToCurrencyLookupInput;

	public WebElement transactions_Maintenance_ToCurrencyLookupInput() {
		return transactions_Maintenance_ToCurrencyLookupInput;
	}
	// Debit A/c GL code lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.GL_CODE']")
	private WebElement transactions_Maintenance_ToGlCodeLookupInput;

	public WebElement transactions_Maintenance_ToGlCodeLookupInput() {
		return transactions_Maintenance_ToGlCodeLookupInput;
	}
	// Debit A/c CIF lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.CIF_SUB_NO']")
	private WebElement transactions_Maintenance_ToCifLookupInput;

	public WebElement transactions_Maintenance_ToCifLookupInput() {
		return transactions_Maintenance_ToCifLookupInput;
	}
	// Debit A/c Slno lookup input
	@FindBy(xpath = "//input[@id='gridtab_to_trs_ac_sl_D001MT_gs_amfVO.SL_NO']")
	private WebElement transactions_Maintenance_ToSlNoLookupInput;

	public WebElement transactions_Maintenance_ToSlNoLookupInput() {
		return transactions_Maintenance_ToSlNoLookupInput;
	}
	// Debit A/c Branch code first value
	@FindBy(xpath = "//td[@id='td_gridtab_to_trs_ac_sl_D001MT_1_amfVO.BRANCH_CODE']")
	private WebElement transactions_Maintenance_ToAccountLookupFirstRecord;

	public WebElement transactions_Maintenance_ToAccountLookupFirstRecord() {
		return transactions_Maintenance_ToAccountLookupFirstRecord;
	}
	
	// Save Button
	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement transactions_SaveButton;
	
	public WebElement transactions_SaveButton() {
		return transactions_SaveButton;
	}
	
	// Display message
	@FindBy(xpath = "//div[contains(text(),'[3089] User does not have access to make a Transaction on his own Account.')]")
	private WebElement transactions_CannotProceedDisplayMessage;
	
	public WebElement transactions_CannotProceedDisplayMessage() {
		return transactions_CannotProceedDisplayMessage;
	}
	
	// New button
	@FindBy(xpath = "//a[@id='addNewGridRec_D001MT']")
	private WebElement transactions_Maintenance_NewButton;
	
	public WebElement transactions_Maintenance_NewButton() {
		return transactions_Maintenance_NewButton;
	}
	
	// Cannot Proceed ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement transactions_Maintenance_CannotProceedOkButton;
	
	public WebElement transactions_Maintenance_CannotProceedOkButton() {
		return transactions_Maintenance_CannotProceedOkButton;
	}
	
	// reload tab warning message
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement transactions_ReloadTabWarningMessageOkButton;

	public WebElement transactions_ReloadTabWarningMessageOkButton() {
		return transactions_ReloadTabWarningMessageOkButton;
	}
	
//	// Display message
//	@FindBy(xpath = "//div[text()='Cannot Proceed, From ACC & To ACC are the same']")
//	private WebElement transactions_CannotProceedDisplayMessage;
//	
//	public WebElement transactions_CannotProceedDisplayMessage() {
//		return transactions_CannotProceedDisplayMessage;
//	}
	
	
}
