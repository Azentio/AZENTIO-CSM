package pageobjects.CSM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChargeWaiverObject {
	WebDriver driver;
	public ChargeWaiverObject(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//td[text()='Accounts']")
	private WebElement chargeWaiverAccountsFlag;
	public WebElement chargeWaiver_AccountsFlag() {
		return chargeWaiverAccountsFlag;
	}
	@FindBy(xpath="//td[text()='Fixed Maturity Accounts']//ancestor::a/table[1]/tbody[1]/tr[1]/td[1]")
	private WebElement chargeWaiverAccountsFixedMaturityAccount;
	public WebElement chargeWaiver_Accounts_FixedMaturityAccount() {
		return chargeWaiverAccountsFixedMaturityAccount;
	}
	@FindBy(xpath="//span[text()='Opening']")
	private WebElement chargeWaiverAccountsFMAOpening;
	public WebElement chargeWaiver_Accounts_FMA_Opening() {
		return chargeWaiverAccountsFMAOpening;
	}
	@FindBy(xpath="//input[@id='lookuptxt_currencyCode_A001MT']")
	private WebElement chargeWaiverAccountsFMACurrencyCode;
	public WebElement chargeWaiver_Accounts_FMA_CurrencyCode() {
		return chargeWaiverAccountsFMACurrencyCode;
	}
	@FindBy(xpath="//input[@id='lookuptxt_glType_A001MT']")
	private WebElement chargeWaiverAccountsFMAGLType;
	public WebElement chargeWaiver_Accounts_FMA_GLType() {
		return chargeWaiverAccountsFMAGLType;
	}
	@FindBy(xpath="//input[@id='lookuptxt_cifNo_A001MT']")
	private WebElement chargeWaiverAccountsFMACIFNo;
	public WebElement chargeWaiver_Accounts_FMA_CIFNo() {
		return chargeWaiverAccountsFMACIFNo;
	}
	@FindBy(xpath="//span[text()='View Memo']//following-sibling::a")
	private WebElement chargeWaiverAccountsFMAViewMemoCloseButton;
	public WebElement chargeWaiver_Accounts_FMA_ViewMemoCloseButton() {
		return chargeWaiverAccountsFMAViewMemoCloseButton;
	}
	@FindBy(xpath="//span[text()='Instructions']")
	private WebElement chargeWaiverAccountsFMAInstruction;
	public WebElement chargeWaiver_Accounts_FMA_Instruction() {
		return chargeWaiverAccountsFMAInstruction;
	}
	@FindBy(xpath="//label[text()='Amount ']//parent::td[1]//following-sibling::td[1]//input[@id='amount_A001MT']")
	private WebElement chargeWaiverAccountsFMAInstructionTransferAmount;
	public WebElement chargeWaiver_Accounts_FMA_Instruction_TransferAmount() {
		return chargeWaiverAccountsFMAInstructionTransferAmount;
	}
	@FindBy(xpath="//input[@id='lookuptxt_openDepTrxType_A001MT']")
	private WebElement chargeWaiverAccountsFMAInstructionTrxType;
	public WebElement chargeWaiver_Accounts_FMA_Instruction_TrxType() {
		return chargeWaiverAccountsFMAInstructionTrxType;
	}
	@FindBy(xpath="//label[text()='Trx Type ']")
	private WebElement chargeWaiverAccountsFMAInstructionTrxTypeClick;
	public WebElement chargeWaiver_Accounts_FMA_Instruction_TrxType_Click() {
		return chargeWaiverAccountsFMAInstructionTrxTypeClick;
	}
	@FindBy(xpath="//button[@id='fmaSave_A001MT']")
	private WebElement chargeWaiverAccountsFMAInstructionSaveButton;
	public WebElement chargeWaiver_Accounts_FMA_Instruction_SaveButton() {
		return chargeWaiverAccountsFMAInstructionSaveButton;
	}
	@FindBy(xpath="//label[text()='Currency']")
	private WebElement chargeWaiverAccountsFMACurrencyClick;
	public WebElement chargeWaiver_Accounts_FMA_CurrencyClick() {
		return chargeWaiverAccountsFMACurrencyClick;
	}
	
	//General Accounts//
	
	@FindBy(xpath="//td[text()='General Accounts']")
	private WebElement chargeWaiverAccountsGeneralAccount;
	public WebElement chargeWaiver_Accounts_GeneralAccount() {
		return chargeWaiverAccountsGeneralAccount;
	}
	@FindBy(xpath="//span[text()='Close With Transfer']")
	private WebElement chargeWaiverAccountsGACloseWithTransfer;
	public WebElement chargeWaiver_Accounts_GA_CloseWithTransfer() {
		return chargeWaiverAccountsGACloseWithTransfer;
	}
	@FindBy(xpath="//input[@name='GL_CODE']")
	private WebElement chargeWaiverAccountsGAGLCode;
	public WebElement chargeWaiver_Accounts_GA_GLCode() {
		return chargeWaiverAccountsGAGLCode;
	}
//	@FindBy(xpath="//input[@name='CIF_SUB_NO']")
//	private WebElement chargeWaiverAccountsGACIFNo;
//	public WebElement chargeWaiver_Accounts_GA_CIFNo() {
//		return chargeWaiverAccountsGACIFNo;
//	}
//	@FindBy(xpath="//input[@name='CIF_SUB_NO']")
//	private WebElement chargeWaiverAccountsGACIFNo;
//	public WebElement chargeWaiver_Accounts_GA_CIFNo() {
//		return chargeWaiverAccountsGACIFNo;
//	}
	
}
