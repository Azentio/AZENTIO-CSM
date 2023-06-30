package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_TransactionTypeObj {
	WebDriver driver;

	public CSMParam_TransactionTypeObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Transaction Type')]")
	private WebElement systemParameter_TransactionTypeFeature;

	public WebElement systemParameterTransactionTypeFeature() {
		return systemParameter_TransactionTypeFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'Transaction Type')]//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')]")
	private WebElement transactionType_UpdateAfterApprove;

	public WebElement transactionTypeUpdateAfterApprove() {
		return transactionType_UpdateAfterApprove;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement transactionType_TransactionCode;

	public WebElement transactionTypeTransactionCode() {
		return transactionType_TransactionCode;
	}

	@FindBy(xpath = "//input[@name='TYPE']")
	private WebElement transactionType_SearchTypeCode;

	public WebElement transactionTypeSearchTypeCode() {
		return transactionType_SearchTypeCode;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement transactionTypeGrid_NextButton;

	public WebElement transactionTypeGridNextButton() {
		return transactionTypeGrid_NextButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Transaction Type / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement transactionType_UpdateAfterApproveLabelClose;

	public WebElement transactionTypeUpdateAfterApproveLabelClose() {
		return transactionType_UpdateAfterApproveLabelClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Transaction Type / Update After Approve')]")
	private WebElement transactionType_UpdateAfterApproveLabel;

	public WebElement transactionTypeUpdateAfterApproveLabel() {
		return transactionType_UpdateAfterApproveLabel;
	}

	@FindBy(xpath = "//td[contains(text(),'Transaction Type')]//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement transactionType_ApproveFeature;

	public WebElement transactionTypeApproveFeature() {
		return transactionType_ApproveFeature;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.MULTI_BRANCH']")
	private WebElement transactionType_EnableMultiBranchFalg;

	public WebElement transactionTypeEnableMultiBranchFalg() {
		return transactionType_EnableMultiBranchFalg;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.ALLOW_CLEARING_CHRG")
	private WebElement transactionType_AllowUserToModifyClearChargeFlag;

	public WebElement transactionTypeAllowUSerToModifyClearChargeFlag() {
		return transactionType_AllowUserToModifyClearChargeFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.BACK_DATED_VDATE")
	private WebElement transactionType_AllowBackDateVAluDateFalg;

	public WebElement transactionTypeAllowBackDateValuaDateFlag() {
		return transactionType_AllowBackDateVAluDateFalg;
	}

	// initialvalue
	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.POST_DATED_VDATE")
	private WebElement transactionType_AllowPostDateVAluDateFalg;

	public WebElement transactionTypeAllowPostDateVAluDateFalg() {
		return transactionType_AllowPostDateVAluDateFalg;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.NOSTRO_MVT")
	private WebElement transactionType_AllowInternalGlsFlag;

	public WebElement transactionTypeAllowInternalGlsFlag() {
		return transactionType_AllowInternalGlsFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.MULTI_BRANCH")
	private WebElement transactionType_EnableMultiBranchFlag;

	public WebElement transactionTypeEnableMultiBranchFlag() {
		return transactionType_EnableMultiBranchFlag;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeExtendedVO.FORCE_OVERDRAW']")
	private WebElement transactionType_ForceOverdrawnFlag;

	public WebElement transactionTypeForceOverdrawnFlag() {
		return transactionType_ForceOverdrawnFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_CASH")
	private WebElement transactionType_DeductChargeFroMCashFlag;

	public WebElement transactionTypeDeductChargeFromCash() {
		return transactionType_DeductChargeFroMCashFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_OTHER")
	private WebElement transactionType_DeductChargeFromOtherAccountFlag;

	public WebElement transactionTypeDeductChargeFromOtherAccountFlag() {
		return transactionType_DeductChargeFromOtherAccountFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_CREDITOR")

	private WebElement transactionType_DeductChargeFromCreditorAccountFlag;

	public WebElement transactionTypeDeductChargeFromCreditorAccountFlag() {
		return transactionType_DeductChargeFromCreditorAccountFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_DEBITOR")
	private WebElement transactionType_DeductChargeFromDebitorAccountFlag;

	public WebElement transactionTypeDeductChargeFromDebitorAccountFlag() {
		return transactionType_DeductChargeFromDebitorAccountFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.DEDUCT_TELLER")
	private WebElement transactionType_DeductChargeFromTellerAccountFlag;

	public WebElement transactionTypeDeductChargeFromTellerAccountFlag() {
		return transactionType_DeductChargeFromTellerAccountFlag;
	}

	@FindBy(xpath = "//span[contains(text(),' Transaction Status ')]//parent::a")
	private WebElement transactionType_TransactionStatusButton;

	public WebElement transactionTypeTransactionStatusButton() {
		return transactionType_TransactionStatusButton;
	}

	@FindBy(xpath = "//td[@tdlabel='AND/OR']")
	private WebElement transactionTypeStatus_ANDORDropdownClickable;

	public WebElement transactionTypeStatusANDORDropdownClickable() {
		return transactionTypeStatus_ANDORDropdownClickable;
	}

	@FindBy(xpath = "//td[@id='td_tab31_GridTbl_Id_P024MA_1_ctstrxtypeStatusVO.AND_OR']//select")
	private WebElement transactionTypeStatus_ANDORDropdown;

	public WebElement transactionTypeStatusANDORDropdown() {
		return transactionTypeStatus_ANDORDropdown;
	}

	@FindBy(xpath = "//td[@tdlabel='Priority']//input")
	private WebElement transactionTypeStatus_PriorityInput;

	public WebElement transactionTypeStatusPriorityInput() {
		return transactionTypeStatus_PriorityInput;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeStatusVO.STATUS_CODE']")
	private WebElement transactionTypeStatus_StatusCodeInput;

	public WebElement transactionTypeStatusStatusCodeInput() {
		return transactionTypeStatus_StatusCodeInput;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeStatusVO.USER_LEVEL']")
	private WebElement transactionTypeStatus_UserLevelInput;

	public WebElement transactionTypeStatusUserLevelInput() {
		return transactionTypeStatus_UserLevelInput;
	}

	@FindBy(xpath = "//td[@id='del_tab31_GridTbl_Id_P024MA']//span")
	private WebElement transactionStatus_DeleteRowNumber;

	public WebElement transactionStatusDeleteRowNumber() {
		return transactionStatus_DeleteRowNumber;
	}

	@FindBy(xpath = "//td[@id='add_tab31_GridTbl_Id_P024MA']//span")
	private WebElement transactionStatus_AddNewRow;

	public WebElement transactionStatusAddNewRow() {
		return transactionStatus_AddNewRow;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement transactionStatus_OkButton;

	public WebElement transactionStatusOkButton() {
		return transactionStatus_OkButton;
	}

	@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.RQST_CY_NOMINATION_DET']")
	private WebElement transactionType_RequestCurrencyDenominationFlag;

	public WebElement transactionTypeRequestCurrencyDenominationFlag() {
		return transactionType_RequestCurrencyDenominationFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.CR_DR_FOREX")
	private WebElement transactionType_MainAccountDebitFlag;

	public WebElement transactionTypeMainAccountDebitFlag() {
		return transactionType_MainAccountDebitFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.FORBID_MULTI_CIF_TRX")
	private WebElement transactionType_ForbitMultipleCIFFlag;

	public WebElement transactionTypeForbitMultipleCIFFlag() {
		return transactionType_ForbitMultipleCIFFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.TRSFR_METHOD")
	private WebElement transactionType_ModeOfPaymentDropdown;

	public WebElement transactionTypeModeOfPaymentDropdown() {
		return transactionType_ModeOfPaymentDropdown;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.CR_DR_FOREX")
	private WebElement transactionType_MainCreditFlag;

	public WebElement transactionTypeMainCreditFlag() {
		return transactionType_MainCreditFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.NOT_USE_IN_TRX")
	private WebElement transactionType_NotBeUsedInTransactionFlag;

	public WebElement transactionTypeNotBeUsedInTransactionFlag() {
		return transactionType_NotBeUsedInTransactionFlag;
	}

	@FindBy(name = "transactiontypesCO.ctstrxtypeVO.HIDE_IN_TRS")
	private WebElement transactionType_HideTransactionFlag;

	public WebElement transactionTypeHideTransactionFlag() {
		return transactionType_HideTransactionFlag;
	}
	@FindBy(name="transactiontypesCO.ctstrxtypeVO.AUTO_APPROVE_WITHIN_LIMIT")
	private WebElement transactionType_AutoApproveWithinLimitFlag;

	public WebElement transactionTypeFAutoApproveWithinLimitFlag() {
		return transactionType_AutoApproveWithinLimitFlag;
	}

}
