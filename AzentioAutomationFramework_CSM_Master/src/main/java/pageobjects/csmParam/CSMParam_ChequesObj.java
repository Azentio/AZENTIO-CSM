package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_ChequesObj {
	WebDriver driver;

	public CSMParam_ChequesObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Cheques')]")
	private WebElement systemParameter_ChequesFeature;

	public WebElement systemParameterChequesFeature() {
		return systemParameter_ChequesFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'ChequeBook')]")
	private WebElement cheques_ChequebookFeature;

	public WebElement chequesChequebookFeature() {
		return cheques_ChequebookFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'ChequeBook')]//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')]")
	private WebElement chequeBook_UpdateAfterApproveFeature;

	public WebElement chequeBookUpdateAfterApproveFeature() {
		return chequeBook_UpdateAfterApproveFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'ChequeBook')]//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement chequeBook_ApproveFeature;

	public WebElement chequeBookApproveFeature() {
		return chequeBook_ApproveFeature;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement chequeBook_SearchChequeCode;

	public WebElement chequeBookSearchChequeCode() {
		return chequeBook_SearchChequeCode;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.ALLOW_AUTO_APPROVE_YN")
	private WebElement chequeBook_AllowAutoApproveFlag;

	public WebElement chequeBookAllowAutoApproveFlag() {
		return chequeBook_AllowAutoApproveFlag;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.ALLOW_AUTO_SUBMIT_YN")
	private WebElement chequeBook_AllowAutoSubmitFlag;

	public WebElement chequeBookAllowAutoSubmitFlag() {
		return chequeBook_AllowAutoSubmitFlag;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.AUTO_SUBMIT")
	private WebElement chequeBook_AutoSubmitUponApproveFlag;

	public WebElement chequeBookAutoSubmitUponApproveFlag() {
		return chequeBook_AutoSubmitUponApproveFlag;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.CHQ_AMENDABLE")
	private WebElement chequeBook_ChequePaperNumberAmendableOnRequestFlag;

	public WebElement chequeBookChequePaperNumberAmendableOnRequestFlag() {
		return chequeBook_ChequePaperNumberAmendableOnRequestFlag;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Cheques / ChequeBook / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookUpdateAfterApprove_TabClose;

	public WebElement chequeBookUpdateAfterApproveTabClose() {
		return chequeBookUpdateAfterApprove_TabClose;
	}

	@FindBy(xpath = "//span[contains(text(),' account_type_currency_key ')]")
	private WebElement chequeBook_AccountTypeCurrencyKeyButton;

	public WebElement chequeBookAccountTypeCurrencyKeyButton() {
		return chequeBook_AccountTypeCurrencyKeyButton;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.CHQ_FR_AMENDABLE")
	private WebElement chequeBook_AllowAmendFromNumberFlag;

	public WebElement chequeBookAllowAmendFromNumberFlag() {
		return chequeBook_AllowAmendFromNumberFlag;
	}

	@FindBy(name = "chequesbookCO.ctschequesVO.DISABLE_GENERATE")
	private WebElement chequeBook_DisableGenerateFromNumberFlag;

	public WebElement chequeBookDisableGenerateFromNumberFlag() {
		return chequeBook_DisableGenerateFromNumberFlag;
	}
	@FindBy(name="chequesbookCO.ctschequesVO.REUSE_CHQ_NBR_YN")
	private WebElement chequeBook_ReuseCancelledReversedDeletedChqNbrFlag;

	public WebElement chequeBookReuseCancelledReversedDeletedChqNbrFlag() {
		return chequeBook_ReuseCancelledReversedDeletedChqNbrFlag;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequeglcyVO.GL_CODE']")
	private WebElement chequeBook_AccountTypeAccessGlcodeInput;

	public WebElement chequeBookAccountTypeAccessGlcodeInput() {
		return chequeBook_AccountTypeAccessGlcodeInput;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctschequeglcyVO.CURRENCY_CODE']")
	private WebElement chequeBook_AccountTypeAccessCurrencyCodeInput;

	public WebElement chequeBookAccountTypeAccessCurrencyCodeInput() {
		return chequeBook_AccountTypeAccessCurrencyCodeInput;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement chequeBook_AccountTypeAccessOkButton;

	public WebElement chequeBookAccountTypeAccessOkButton() {
		return chequeBook_AccountTypeAccessOkButton;
	}
}
