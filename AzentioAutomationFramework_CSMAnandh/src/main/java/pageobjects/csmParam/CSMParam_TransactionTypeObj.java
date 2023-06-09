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

}
