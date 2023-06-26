package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_CertificateObj {
	WebDriver driver;

	public CSM_CertificateObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Certificates')]")
	private WebElement csm_CertificateFeature;

	public WebElement csmCertificateFeature() {
		return csm_CertificateFeature;
	}

	@FindBy(xpath = "(//td[contains(text(),'Active')]//preceding-sibling::td[8]//input)[2]")
	private WebElement certificate_DeductFromAccount;

	public WebElement certificateDeductFromAccount() {
		return certificate_DeductFromAccount;
	}

	@FindBy(xpath = "(//td[contains(text(),'Active')]//preceding-sibling::td[9]//input)[1]")
	private WebElement certificate_CreditAccount;

	public WebElement certificateCreditAccount() {
		return certificate_CreditAccount;
	}

	@FindBy(xpath = "//td[contains(text(),'Certificates')]//ancestor::h3//following-sibling::ul//span[contains(text(),'Maintenance')]")
	private WebElement certificate_Maintenance;

	public WebElement certificateMaintenance() {
		return certificate_Maintenance;
	}

	@FindBy(xpath = "//td[contains(text(),'Certificates')]//ancestor::h3//following-sibling::ul//span[text()='Approve']")
	private WebElement certificate_ApproveFeature;

	public WebElement certificateApproveFeature() {
		return certificate_ApproveFeature;
	}

	@FindBy(xpath = "//input[@name='CIF_NO']")
	private WebElement certificateApprove_CIFNumberInput;

	public WebElement certificateApproveCIFNumberInput() {
		return certificateApprove_CIFNumberInput;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.CERTIFICATE_TYPE']")
	private WebElement certificateMaintenance_CertificateTypeInput;

	public WebElement certificateMaintenanceCertificateTypeInput() {
		return certificateMaintenance_CertificateTypeInput;
	}

	@FindBy(xpath = "//a[contains(text(),'Certificates / Maintenance')]")
	private WebElement certificateMaintenance_Label;

	public WebElement certificateMaintenanceLabel() {
		return certificateMaintenance_Label;
	}

	@FindBy(xpath = "//a[contains(text(),'Certificates / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement certificateMaintenance_LabelClose;

	public WebElement certificateMaintenanceLabelClose() {
		return certificateMaintenance_LabelClose;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificate_typeVO.BRIEF_DESC_ENG']")
	private WebElement certificateMaintenance_CertificateTypeDescription;

	public WebElement certificateMaintenanceCertificateTypeDescription() {
		return certificateMaintenance_CertificateTypeDescription;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.CIF_NO']")
	private WebElement certificateMaintenance_CIFNumberInput;

	public WebElement certificateMaintenanceCIFNumberInput() {
		return certificateMaintenance_CIFNumberInput;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.CIF_NAME']")
	private WebElement certificateMaintenance_CIFNumberDescription;

	public WebElement certificateMaintenanceCIFNumberDescription() {
		return certificateMaintenance_CIFNumberDescription;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.NUMBER_OF_BILLS']")
	private WebElement certificateMaintenance_NumberOfBillsInput;

	public WebElement certificateMaintenanceNumberOfBillsInput() {
		return certificateMaintenance_NumberOfBillsInput;
	}

	@FindBy(xpath = "//input[@name='certificateCO.ctscertificateVO.TOTAL_AMOUNT_OF_BILLS']")
	private WebElement certificateMaintenance_TotalAmountOfBillsInput;

	public WebElement certificateMaintenanceTotalAmountOfBillsInput() {
		return certificateMaintenance_TotalAmountOfBillsInput;
	}

	@FindBy(xpath = "//span[contains(text(),'Charges')]//parent::div")
	private WebElement certificateMaintenance_ChargesSection;

	public WebElement certificateMaintenanceChargesSection() {
		return certificateMaintenance_ChargesSection;
	}

	@FindBy(xpath = "//span[contains(text(),' Waive Charges ')]//ancestor::button")
	private WebElement certificateMaintenance_WaiveChargesButton;

	public WebElement certificateMaintenanceWaiveChargesButton() {
		return certificateMaintenance_WaiveChargesButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Cannot clear charges')]//parent::div//following-sibling::center//input[1]")
	private WebElement certificateMaintenance_canNotClearChargesOkButton;

	public WebElement certificateMaintenancecanNotClearChargesOkButton() {
		return certificateMaintenance_canNotClearChargesOkButton;
	}

	@FindBy(xpath = "//td[@tdlabel='CV Amount']")
	private WebElement certificateApprove_ZeroChargeValidation;

	public WebElement certificateApproveZeroChargeValidation() {
		return certificateApprove_ZeroChargeValidation;
	}

}
