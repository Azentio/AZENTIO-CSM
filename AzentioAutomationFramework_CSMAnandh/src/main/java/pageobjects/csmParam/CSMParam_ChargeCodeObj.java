package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_ChargeCodeObj {
	WebDriver driver;

	public CSMParam_ChargeCodeObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Charges']")
	private WebElement csmParam_ChargesFeature;

	public WebElement csmParamChargesFeature() {
		return csmParam_ChargesFeature;
	}

	@FindBy(xpath = "//td[contains(text(),'Maintenance of Charges')]")
	private WebElement charges_MaintenanceOfChargesFeature;

	public WebElement chargesMaintenanceOfChargesFeature() {
		return charges_MaintenanceOfChargesFeature;
	}

	@FindBy(xpath = "(//td[contains(text(),'Maintenance of Charges')]//ancestor::a//following-sibling::ul//span[contains(text(),'Update After Approve')])[1]")
	private WebElement maintenanceOfCharges_UpdateAfterApproveScreen;

	public WebElement maintenanceOfChargesUpdateAfterApproveScreen() {
		return maintenanceOfCharges_UpdateAfterApproveScreen;
	}

	@FindBy(xpath = "(//td[contains(text(),'Maintenance of Charges')]//ancestor::a//following-sibling::ul//span[contains(text(),'Approve')])[1]")
	private WebElement maintenanceOfCharges_ApproveScreen;

	public WebElement maintenanceOfChargesApproveScreen() {
		return maintenanceOfCharges_ApproveScreen;
	}

	@FindBy(name = "chargesparamCO.ctschargesVO.ALLOW_CLEARING")
	private WebElement chargeCode_AllowUserToModifyAndClearChargeFlag;

	public WebElement chargeCodeAllowUserToModifyAndClearChargeFlag() {
		return chargeCode_AllowUserToModifyAndClearChargeFlag;
	}

	@FindBy(name = "chargesparamCO.ctschargesVO.ALLOW_MODIFY")
	private WebElement chargeCode_AllowUserModifyFlag;

	public WebElement chargeCodeAllowUserModifyFlag() {
		return chargeCode_AllowUserModifyFlag;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement chargeUpdateAfterApprove_ChargeCodeInputSearch;

	public WebElement chargeUpdateAfterApprove_ChargeCodeInputSearch() {
		return chargeUpdateAfterApprove_ChargeCodeInputSearch;
	}

	@FindBy(id = "Parameters / System Parameters / Charges / Maintenance of Charges / Update After Approve")
	private WebElement csmParam_ChargeUpdateAfterApproveMaintenanceLabel;

	public WebElement csmParamChargeUpdateAfterApproveMaintenanceLabel() {
		return csmParam_ChargeUpdateAfterApproveMaintenanceLabel;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Charges / Maintenance of Charges / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement csmParam_ChargeUpdateAfterApproveMaintenanceLabelClose;

	public WebElement csmParamChargeUpdateAfterApproveMaintenanceLabelClose() {
		return csmParam_ChargeUpdateAfterApproveMaintenanceLabelClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / Charges / Maintenance of Charges / Approve')]//parent::td//following-sibling::td//span")
	private WebElement csmParam_ChargeApproveMaintenanceLabelClose;

	public WebElement csmParamChargeApproveMaintenanceLabelClose() {
		return csmParam_ChargeApproveMaintenanceLabelClose;
	}
}
