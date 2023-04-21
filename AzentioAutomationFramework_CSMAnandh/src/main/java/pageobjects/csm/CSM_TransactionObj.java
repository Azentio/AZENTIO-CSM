package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_TransactionObj {
	WebDriver driver;

	public CSM_TransactionObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_TransactionMainModule;

	public WebElement csmTransactionMainModule() {
		return csm_TransactionMainModule;
	}

	@FindBy(xpath = "//a[@id='D001MT']//span[text()='Maintenance']")
	private WebElement transaction_Maintenance;

	public WebElement transactionMaintenance() {
		return transaction_Maintenance;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transaction_SearchIcon;

	public WebElement transactionSearchIcon() {
		return transaction_SearchIcon;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement transaction_SearchTransactionNumber;

	public WebElement transactionSearchTransactionNumber() {
		return transaction_SearchTransactionNumber;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement transaction_TransactionStatus;

	public WebElement transactionTransactionStatus() {
		return transaction_TransactionStatus;
	}

	@FindBy(xpath = "//td[text()='Reversed']")
	private WebElement transaction_TransactionReversedStatus;

	public WebElement transactionTransactionReversedStatus() {
		return transaction_TransactionReversedStatus;
	}

	@FindBy(xpath = "//a[text()='Transactions / Maintenance']//parent::td//following-sibling::td//span")
	private WebElement transaction_Closebutton;

	public WebElement transactionClosebutton() {
		return transaction_Closebutton;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement transaction_TransactionTypeInput;

	public WebElement transactionTransactionTypeInput() {
		return transaction_TransactionTypeInput;
	}

	@FindBy(xpath = "//input[@id='trx_type_desc_D001MT']")
	private WebElement transaction_TransactionTypeInputDescription;

	public WebElement transactionTransactionTypeInputDescription() {
		return transaction_TransactionTypeInputDescription;
	}

	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement transactionType_DebitBranchCode;

	public WebElement transactionTypeDebitBranchCode() {
		return transactionType_DebitBranchCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement transactionType_DebitCurrencyCode;

	public WebElement transactionTypeDebitCurrencyCode() {
		return transactionType_DebitCurrencyCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement transactionType_DebitGlCode;

	public WebElement transactionTypeDebitGlCode() {
		return transactionType_DebitGlCode;
	}

	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement transactionType_DebitCIFCode;

	public WebElement transactionTypeDebitCIFCode() {
		return transactionType_DebitCIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement transactionType_DebitSerialNumber;

	public WebElement transactionTypeDebitSerialNumber() {
		return transactionType_DebitSerialNumber;
	}

	@FindBy(xpath = "//button[@id='btnCharges_D001MT']")
	private WebElement transactionType_ChargesButton;

	public WebElement transactionTypeChargesButton() {
		return transactionType_ChargesButton;
	}

	@FindBy(xpath = "//table[@parenttableid='trxMgntBatchGridTbl_Id_D001MT']//td[@tdlabel='Original_Amt_key']")
	private WebElement transactionType_OriginalAmount;

	public WebElement transactionTypeOriginalAmount() {
		return transactionType_OriginalAmount;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Maintenance')]")
	private WebElement transactionMaintenance_label;

	public WebElement transactionMaintenanceLabel() {
		return transactionMaintenance_label;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement transactionMaintenance_CurrencyCodeInput;

	public WebElement transactionMaintenanceCurrencyCodeInput() {
		return transactionMaintenance_CurrencyCodeInput;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement transactionType_CreditBranchCode;

	public WebElement transactionTypeCreditBranchCode() {
		return transactionType_CreditBranchCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement transactionType_CreditGlCode;

	public WebElement transactionTypeCreditGlCode() {
		return transactionType_CreditGlCode;
	}

	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement transactionType_CreditCIFCode;

	public WebElement transactionTypeCreditCIFCode() {
		return transactionType_CreditCIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement transactionType_CreditSerialNumCode;

	public WebElement transactionTypeCreditSerialNumCode() {
		return transactionType_CreditSerialNumCode;
	}

	@FindBy(xpath = "//div[contains(text(),'Charges amount is waived by the system')]//parent::div//following-sibling::center//input[@value='Ok']")
	private WebElement transaction_WaivedAlertPopup_WithOk;

	public WebElement transaction_WaivedAlertPopupWithOkBtn() {
		return transaction_WaivedAlertPopup_WithOk;
	}

	@FindBy(xpath = "//input[@id='amount_D001MT']")
	private WebElement transaction_DepositeAmountInputBox;

	public WebElement transactionDepositeAmountInputBox() {
		return transaction_DepositeAmountInputBox;
	}

	@FindBy(xpath = "//td[contains(text(),'Transactions')]//ancestor::h3//following-sibling::ul//span[text()='Approve']")
	private WebElement transaction_ApproveFeature;

	public WebElement transactionApproveFeature() {
		return transaction_ApproveFeature;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement transactionApprove_TransactionNoSearch;

	public WebElement transactionApproveTransactionNoSearch() {
		return transactionApprove_TransactionNoSearch;
	}
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement transaction_TransactionNumber;

	public WebElement transaction_TransactionNumber() {
		return transaction_TransactionNumber;
	}
	@FindBy(xpath = "//div[contains(text(),'Transaction No')]//parent::div//following-sibling::center//input")
	private WebElement transaction_TransactionNumberOkButton;

	public WebElement transaction_TransactionNumberOkButton() {
		return transaction_TransactionNumberOkButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Transactions / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement transaction_closeTransactionTab;

	public WebElement transactionCloseTransactionTab() {
		return transaction_closeTransactionTab;
	}
	@FindBy(xpath="(//table[@class='ui-jqgrid-ftable']//td[@tdlabel='in Charged CY'])[1]")
	private WebElement transaction_ChargeValidation;

	public WebElement transactionChargeValidation() {
		return transaction_ChargeValidation;
	}
	@FindBy(xpath="//div[contains(text(),'Approved')]//parent::div//following-sibling::center//input")
	private WebElement transaction_ApproveOkButton;

	public WebElement transactionApproveOkButton() {
		return transaction_ApproveOkButton;
	}
}
