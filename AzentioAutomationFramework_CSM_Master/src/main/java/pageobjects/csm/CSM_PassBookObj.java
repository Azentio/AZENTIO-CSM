package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_PassBookObj {
	WebDriver driver;

	public CSM_PassBookObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'PassBooks')]")
	private WebElement csm_PassBookFeature;

	public WebElement csmPassBookFeature() {
		return csm_PassBookFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'PassBooks')]//ancestor::h3//following-sibling::ul//span[contains(text(),'Maintenance')]")
	private WebElement passBook_Maintenance;

	public WebElement passBookMaintenanceFeature() {
		return passBook_Maintenance;
	}

	@FindBy(xpath = "//a[contains(text(),'PassBooks / Maintenance')]")
	private WebElement passbookMaintenance_Label;

	public WebElement passbookMaintenanceLabel() {
		return passbookMaintenance_Label;
	}

	@FindBy(xpath = "//a[contains(text(),'PassBooks / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement passbookMaintenance_LabelClose;

	public WebElement passbookMaintenanceLabelClose() {
		return passbookMaintenance_LabelClose;
	}

	@FindBy(xpath = "//span[contains(text(),'Charges')]")
	private WebElement passbokkIssue_ChargesSection;

	public WebElement passbookIssueChargesSection() {
		return passbokkIssue_ChargesSection;
	}

	@FindBy(xpath = "//a[contains(text(),'PassBooks / Issue Passbooks')]//parent::td//following-sibling::td//span")
	private WebElement passbookIssuePassbook_LabelClose;

	public WebElement passbookIssuePassbookLabelClose() {
		return passbookIssuePassbook_LabelClose;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.CODE']")
	private WebElement passbookMaintenance_PassbookCode;

	public WebElement passbookMaintenancePassBookCode() {
		return passbookMaintenance_PassbookCode;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.PASSBK_TYPE']")
	private WebElement passbookMaintenance_PassbookType;

	public WebElement passbookMaintenancePassbookType() {
		return passbookMaintenance_PassbookType;
	}

	@FindBy(xpath = "//input[@name='passBookCO.type_desc']")
	private WebElement passbookMaintenance_PassbookTypeDescription;

	public WebElement passbookMaintenancePassbookTypeDescription() {
		return passbookMaintenance_PassbookTypeDescription;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_CY']")
	private WebElement passbookMaintenance_CurrencCode;

	public WebElement passbookMaintenanceCurrencyCode() {
		return passbookMaintenance_CurrencCode;
	}

	@FindBy(xpath = "//input[@name='passBookCO.cy_name']")
	private WebElement passbookMaintenance_CurrencCodeDescription;

	public WebElement passbookMaintenanceCurrencCodeDescription() {
		return passbookMaintenance_CurrencCodeDescription;
	}

	@FindBy(xpath = "//input[@name='passBookCO.cy_name']")
	private WebElement passbookMaintenance_GLCodeDescription;

	public WebElement passbookMaintenanceGLCodeDescription() {
		return passbookMaintenance_GLCodeDescription;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_GL']")
	private WebElement passbookMaintenance_GLCode;

	public WebElement passbookMaintenanceGLCode() {
		return passbookMaintenance_GLCode;
	}

	@FindBy(xpath = "//input[@name='passBookCO.ac_type']")
	private WebElement passbookMaintenance_AccountTypeDescription;

	public WebElement passbookMaintenanceAccountTypeDescription() {
		return passbookMaintenance_AccountTypeDescription;
	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_CIF']")
	private WebElement passbookMainenance_CIFNumber;

	public WebElement passbookMaintenanceCIFNumber() {
		return passbookMainenance_CIFNumber;

	}

	@FindBy(xpath = "//input[@name='passBookCO.passBookVO.ACC_SL']")
	private WebElement passbookMainenance_SerialNumber;

	public WebElement passbookMainenanceSerialNumber() {
		return passbookMainenance_SerialNumber;

	}

	@FindBy(xpath = "//td[contains(text(),'PassBooks')]//ancestor::h3//following-sibling::ul//span[contains(text(),'Issue Passbooks')]")
	private WebElement passbook_IssuePassbook;

	public WebElement passbookIssuePassbook() {
		return passbook_IssuePassbook;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement passbook_SearchPassbookCode;

	public WebElement passbookSearchPassbookCode() {
		return passbook_SearchPassbookCode;
	}

	@FindBy(xpath = "//label[contains(text(),'Issue ')]//ancestor::button")
	private WebElement passbook_IssueButton;

	public WebElement passbookIssueButtton() {
		return passbook_IssueButton;
	}

	@FindBy(xpath = "//td[contains(text(),'PassBooks')]//ancestor::h3//following-sibling::ul//span[contains(text(),'Close Passbooks')]")
	private WebElement passbook_ClosePassbook;

	public WebElement passbookClosePassbook() {
		return passbook_ClosePassbook;
	}

	@FindBy(xpath = "//label[contains(text(),'Close ')]//ancestor::button")
	private WebElement closePassbook_CloseButton;

	public WebElement closePassbookCloseButton() {
		return closePassbook_CloseButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot clear charges')]//parent::div//following-sibling::center//input[1]")
	private WebElement passbook_canNotClearChargesOkButton;

	public WebElement passbookCanNotClearChargesOkButton() {
		return passbook_canNotClearChargesOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Confirm Closing Process')]//parent::div//following-sibling::center//input[1]")
	private WebElement passbook_CloseConfirmationOkButton;

	public WebElement passbookCloseConfirmationOkButton() {
		return passbook_CloseConfirmationOkButton;
	}

	@FindBy(xpath = "(//td[@tdlabel='CV Amount'])[2]")
	private WebElement passbook_ChargeAmountTotal;

	public WebElement passbookChargeAmountTotal() {
		return passbook_ChargeAmountTotal;
	}

	@FindBy(xpath = "//span[contains(text(),' Waive Charges ')]//ancestor::button")
	private WebElement passBook_WaiveChargesButton;

	public WebElement passBookWaiveChargesButton() {
		return passBook_WaiveChargesButton;
	}

	@FindBy(xpath = "//td[@tdlabel='CV Amount']")
	private WebElement passbookIssue_ZeroChargeValidation;

	public WebElement passbookIssueZeroChargeValidation() {
		return passbookIssue_ZeroChargeValidation;
	}

}
