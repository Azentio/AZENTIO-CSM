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

}
