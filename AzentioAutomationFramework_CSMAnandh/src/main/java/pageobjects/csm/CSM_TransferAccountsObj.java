package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_TransferAccountsObj {
	WebDriver driver;

	public CSM_TransferAccountsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Transfer Accounts')]")
	private WebElement csm_TranferAccountsMainFeature;

	public WebElement csmTransferAccountsMainFeature() {
		return csm_TranferAccountsMainFeature;
	}

	@FindBy(xpath = "//td[text()='Transfer Accounts']//ancestor::h3//following-sibling::ul//span[text()='Maintenance']")
	private WebElement transferAccounts_MaintenanceFeature;

	public WebElement transferAccountsMaintenanceFeature() {
		return transferAccounts_MaintenanceFeature;
	}

	@FindBy(xpath = "//select[@name='transferAccountsCO.cts_TRSFR_ACCVO.TRANSFER_TYPE']")
	private WebElement transferAccounts_TranferAccountsDropdown;

	public WebElement transferAccountsTranferAccountsDropdown() {
		return transferAccounts_TranferAccountsDropdown;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_BR")
	private WebElement transferAccounts_ToAccountBranchCode;

	public WebElement transferAccountsToAccountBranchCode() {
		return transferAccounts_ToAccountBranchCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CY")
	private WebElement transferAccounts_ToAccountCurrencyCode;

	public WebElement transferAccountsToAccountCurrencyCode() {
		return transferAccounts_ToAccountCurrencyCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_GL")
	private WebElement transferAccounts_ToAccountGlCode;

	public WebElement transferAccountsToAccountGlCode() {
		return transferAccounts_ToAccountGlCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CIF")
	private WebElement transferAccounts_ToAccountCIFCode;

	public WebElement transferAccountsToAccountCIFCode() {
		return transferAccounts_ToAccountCIFCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_SL")
	private WebElement transferAccounts_ToAccountSerialNumber;

	public WebElement transferAccountsToAccountSerialNumber() {
		return transferAccounts_ToAccountSerialNumber;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_BR")
	private WebElement transferAccounts_fromAccountBranchCode;

	public WebElement transferAccountsFromAccountBranchCode() {
		return transferAccounts_fromAccountBranchCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CY")
	private WebElement transferAccounts_fromAccountCurrencyCode;

	public WebElement transferAccountsFromAccountCurrencyCode() {
		return transferAccounts_fromAccountCurrencyCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_GL")
	private WebElement transferAccounts_fromAccountGlCode;

	public WebElement transferAccountsFromAccountGlCode() {
		return transferAccounts_fromAccountGlCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CIF")
	private WebElement transferAccounts_FromAccountCIFCode;

	public WebElement transferAccountsFromAccountCIFCode() {
		return transferAccounts_FromAccountCIFCode;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_SL")
	private WebElement transferAccounts_FromAccountSerialNumber;

	public WebElement transferAccountsFromAccountSerialNumber() {
		return transferAccounts_FromAccountSerialNumber;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.REASON_CODE")
	private WebElement transferAccounts_ReasonCodeInput;

	public WebElement transferAccountsReasonCodeInput() {
		return transferAccounts_ReasonCodeInput;
	}

	@FindBy(name = "transferAccountsCO.cts_TRSFR_ACCVO.DESTINATION_BRANCH")
	private WebElement transferAccounts_DestinationInput;

	public WebElement transferAccountsDestinationInput() {
		return transferAccounts_DestinationInput;
	}

	@FindBy(id = "transferAccountsMaint_setExceptions_TA001MT")
	private WebElement transferAccounts_SetExceptionButton;

	public WebElement transferAccountsSetExceptionButton() {
		return transferAccounts_SetExceptionButton;
	}

	@FindBy(id = "transferAccounts_retrieve_TA001MT")
	private WebElement transferAccounts_RetriveButton;

	public WebElement transferAccountsRetriveButton() {
		return transferAccounts_RetriveButton;
	}

	@FindBy(xpath = "(//td[@tdlabel='Exception Factor'])[1]")
	private WebElement transferAccounts_BlankExceptionfactorFirstGridInput;

	public WebElement transferAccountsBlankExceptionfactorFirstGridInput() {
		return transferAccounts_BlankExceptionfactorFirstGridInput;
	}

	@FindBy(xpath = "(//td[@tdlabel='Exception Factor'])[2]")
	private WebElement transferAccounts_BlankExceptionfactorSecondGridInput;

	public WebElement transferAccountsBlankExceptionfactorSecondGridInput() {
		return transferAccounts_BlankExceptionfactorSecondGridInput;
	}

	@FindBy(xpath = "//select[@gridid='transferAccountsCriteriaTbl_Id_TA001MT']")
	private WebElement transferAccounts_ExceptionFactorDropdown;

	public WebElement transferAccountsExceptionFactorDropdown() {
		return transferAccounts_ExceptionFactorDropdown;
	}

	@FindBy(name = "lookupTxt_transferAccountsCriteriaVO.CRITERIA_VALUE")
	private WebElement transferAccounts_CriteriaValueInput;

	public WebElement transferAccountsCriteriaValueInput() {
		return transferAccounts_CriteriaValueInput;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement transferAccounts_ExceptionOkButton;

	public WebElement transferAccountsExceptionOkButton() {
		return transferAccounts_ExceptionOkButton;
	}

}
