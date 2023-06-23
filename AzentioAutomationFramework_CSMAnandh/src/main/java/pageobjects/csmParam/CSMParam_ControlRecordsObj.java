package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_ControlRecordsObj {
	WebDriver driver;

	public CSMParam_ControlRecordsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Parameters')]")
	private WebElement csmParam_ParameterFeature;

	public WebElement csmParamParameterFeature() {
		return csmParam_ParameterFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'System Parameters')]")
	private WebElement parameters_SystemParametersFeature;

	public WebElement parametersSystemParametersFeature() {
		return parameters_SystemParametersFeature;
	}

	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement parameter_ControlRecordsFeature;

	public WebElement parameterControlRecordsFeature() {
		return parameter_ControlRecordsFeature;
	}

	@FindBy(xpath = "//td[text()='Control Record']//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')]")
	private WebElement controlRecord_UpdateAfterApproveFeature;

	public WebElement controlRecordUpdateAfterApproveFeature() {
		return controlRecord_UpdateAfterApproveFeature;
	}

	@FindBy(xpath = "//td[text()='Control Record']//ancestor::a//following-sibling::ul//span[text()='Approve']")
	private WebElement controlRecord_ApproveFeature;

	public WebElement controlRecordApproveFeature() {
		return controlRecord_ApproveFeature;
	}

	@FindBy(xpath = "//input[@name='controlrecordCO.ctscontrolVO.CHQBOOK_REJECT_REASON']")
	private WebElement controlRecords_ReasonOnRejectingFlag;

	public WebElement controlRecordsReasonOnRejectingFlag() {
		return controlRecords_ReasonOnRejectingFlag;
	}

	@FindBy(name = "controlrecordCO.ctscontrolVO.CHQBOOK_PROCESS")
	private WebElement controlRecords_AdvancedChequebookProcessFlag;

	public WebElement controlRecordsAdvancedChequebookProcessFlag() {
		return controlRecords_AdvancedChequebookProcessFlag;
	}

	@FindBy(xpath = "//a[contains(text(), 'Other Information ')]")
	private WebElement controlRecords_OtherInformationTab;

	public WebElement controlRecordsOtherInformationTab() {
		return controlRecords_OtherInformationTab;
	}

	@FindBy(xpath = "//input[@name='controlrecordCO.ctscontrolVO.REJECTION_REASON_MAND_YN']")
	private WebElement controlRecords_RejectReasonMandatoryFlag;

	public WebElement controlRecordsRejectReasonMandatoryFlag() {
		return controlRecords_RejectReasonMandatoryFlag;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Control Record / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement controlRecords_ControlRecordUpdateAfterApprove;

	public WebElement controRecordUpdatAfterApproveTabClose() {
		return controlRecords_ControlRecordUpdateAfterApprove;
	}

	@FindBy(name = "controlrecordCO.ctscontrolVO.CHQ_UNIQUE")
	private WebElement controlRecords_ChequeUniqueBasedOnDropdown;

	public WebElement controlRecordsChequeUniqueBasedOnDropdown() {
		return controlRecords_ChequeUniqueBasedOnDropdown;
	}

	@FindBy(xpath = "//a[contains(text(),' Alert Activation ')]")
	private WebElement controlRecords_AlertActivationTab;

	public WebElement controlRecordsAlertActivationTab() {
		return controlRecords_AlertActivationTab;
	}

	@FindBy(xpath = "//span[contains(text(),'Account Balance Overdrawn')]//parent::td//div/div")
	private WebElement alertActivationTab_AccountBalanceOverDrawn;

	public WebElement alertActivationTabAccountBalanceOverDrawn() {
		return alertActivationTab_AccountBalanceOverDrawn;
	}

	@FindBy(xpath = "//span[contains(text(),'Staff Accounts Transaction')]")
	private WebElement alertActivationTab_StaffAccountTransactions;

	public WebElement alertActivationTabStaffAccountTransactions() {
		return alertActivationTab_StaffAccountTransactions;
	}

	@FindBy(xpath = "//span[contains(text(),'Amendment of CIF')]//ancestor::td[@title='Amendment of CIF']")
	private WebElement alertActivationTab_AmendCIFSection;

	public WebElement alertActivationTabAmendCIFSection() {
		return alertActivationTab_AmendCIFSection;
	}

	@FindBy(xpath = "//span[contains(text(),'Reinstate CIF')]//parent::td//following-sibling::td//input")
	private WebElement alertActivation_residentCIFFlagStatus;

	public WebElement alertActivationresidentCIFFlagStatus() {
		return alertActivation_residentCIFFlagStatus;
	}

	@FindBy(xpath = "(//td[@title='Account Balance Overdrawn']/div/div)[1]")
	private WebElement alertActivation_AccountBalanceOverdrawnSection;

	public WebElement alertActivationAccountBalanceOverdrawnSection() {
		return alertActivation_AccountBalanceOverdrawnSection;
	}

	@FindBy(xpath = "//span[contains(text(),'Account Dormant')]")
	private WebElement alertActivation_AccountDormantLabel;

	public WebElement alertActivationAccountDormantLabel() {
		return alertActivation_AccountDormantLabel;
	}

	@FindBy(xpath = "//span[contains(text(),'Account Dormant')]//parent::td//following-sibling::td//input")
	private WebElement alertActivation_AccountDormantFlagStatus;

	public WebElement alertActivationAccountDormantFlagStatus() {
		return alertActivation_AccountDormantFlagStatus;
	}

	@FindBy(xpath = "(//span[contains(text(),'CIF is Non-Resident')]//parent::td//following-sibling::td//input)[1]")
	private WebElement alertActivation_CIFisNonResidentFlagStatus;

	public WebElement alertActivationCIFisNonResidentFlagStatus() {
		return alertActivation_CIFisNonResidentFlagStatus;
	}

	@FindBy(xpath = "(//span[contains(text(),'CIF is Non-Resident')])[1]")
	private WebElement alertActivation_CIFisNonResidentLabel;

	public WebElement alertActivationCIFisNonResidentLabel() {
		return alertActivation_CIFisNonResidentLabel;
	}

	@FindBy(xpath = "(//span[contains(text(),'No Signature Found')]//parent::td//following-sibling::td//input)[1]")
	private WebElement alertActivation_NoSignatureFoundFlagStatus;

	public WebElement alertActivationNoSignatureFoundFlagStatus() {
		return alertActivation_NoSignatureFoundFlagStatus;
	}

	@FindBy(xpath = "//td[@title='0026-No Signature Found']//span")
	private WebElement alertActivation_NoSignatureFoundLabel;

	public WebElement alertActivationNoSignatureFoundLabel() {
		return alertActivation_NoSignatureFoundLabel;
	}

	@FindBy(xpath = "(//span[contains(text(),'Value Date Changed')])[1]")
	private WebElement alertActivation_ValueDateChangedLabel;

	public WebElement alertActivationValueDateChangedLabel() {
		return alertActivation_ValueDateChangedLabel;
	}

	@FindBy(xpath = "(//span[contains(text(),'Value Date Changed')]//parent::td//following-sibling::td//input)[1]")
	private WebElement alertActivation_ValueDateChangedFlag;

	public WebElement alertActivationValueDateChangedFlag() {
		return alertActivation_ValueDateChangedFlag;
	}

	@FindBy(xpath = "(//span[contains(text(),'Overdraw Limit Exceeded')])[1]")
	private WebElement alertActivation_OverdrawLimitExceededLabel;

	public WebElement alertActivationOverdrawLimitExceededLabel() {
		return alertActivation_OverdrawLimitExceededLabel;
	}

	@FindBy(xpath = "(//span[contains(text(),'Overdraw Limit Exceeded')]//parent::td//following-sibling::td//input)[1]")
	private WebElement alertActivation_OverdrawLimitExceededFlagStatus;

	public WebElement alertActivationOverdrawLimitExceededFlagStatus() {
		return alertActivation_OverdrawLimitExceededFlagStatus;
	}

	@FindBy(xpath = "(//td[@title='KYC Outstanding']/div/div[1])[1]")
	private WebElement alertActivation_KYCOutStandingLabel;

	public WebElement alertActivationKYCOutStandingLabel() {
		return alertActivation_KYCOutStandingLabel;
	}

	@FindBy(xpath = "//td[@title='KYC Outstanding']//following-sibling::td//input")
	private WebElement alertActivation_KYCOutStandingFlagStatus;

	public WebElement alertActivationKYCOutStandingFlagStatus() {
		return alertActivation_KYCOutStandingFlagStatus;
	}
}
