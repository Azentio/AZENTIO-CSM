package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CIFTypeCreationObj {
	WebDriver driver;

	public CIFTypeCreationObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='CIF Parameters']")
	private WebElement csmParam_CifParameterMainModule;

	public WebElement csmParamCifParameterMainModule() {
		return csmParam_CifParameterMainModule;
	}
	@FindBy(xpath="//td[text()='CIF Type']")
	private WebElement csmParam_CifTypeMainModule;

	public WebElement csmParamCifTypeMainModule() {
		return csmParam_CifTypeMainModule;
	}
	@FindBy(xpath="//td[text()='CIF Type']//ancestor::li//span[text()='Maintenance']")
	private WebElement cifType_Maintenance;

	public WebElement cifTypeMaintenance() {
		return cifType_Maintenance;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.TYPE_CODE']")
	private WebElement cifType_CifTypeInput;

	public WebElement cifTypeInputBox() {
		return cifType_CifTypeInput;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.BRIEF_DESC_ENG']")
	private WebElement cifType_BriefNameInput;

	public WebElement cifTypeBriefNameInput() {
		return cifType_BriefNameInput;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.LONG_DESC_ENG']")
	private WebElement cifType_LongNameInput;

	public WebElement cifTypeLongNameInput() {
		return cifType_LongNameInput;
	}
	@FindBy(xpath="//input[@value='V']")
	private WebElement cifType_IndividualCIFradioOption;

	public WebElement cifTypeIndividualCIFradioOption() {
		return cifType_IndividualCIFradioOption;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.CLIENT']")
	private WebElement cifType_CIFIsAClientOption;

	public WebElement cifTypeCIFIsAClientOption() {
		return cifType_CIFIsAClientOption;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.MIN_AGE']")
	private WebElement cifType_MinAgeTextBox;

	public WebElement cifTypeMinAgeTextBox() {
		return cifType_MinAgeTextBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.MAX_AGE']")
	private WebElement cifType_MaxAgeTextBox;

	public WebElement cifTypeMaxAgeTextBox() {
		return cifType_MaxAgeTextBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.MIN_AGE_PROCEED']")
	private WebElement cifType_MinAgeAllowToProceed;

	public WebElement cifTypeMinAgeAllowToProceed() {
		return cifType_MinAgeAllowToProceed;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.MAX_AGE_PROCEED']")
	private WebElement cifType_MaxAgeAllowToProceed;

	public WebElement cifTypeMaxAgeAllowToProceed() {
		return cifType_MaxAgeAllowToProceed;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.DEFAULT_ECO_SECTOR']")
	private WebElement cifType_EcoSectorInputBox;

	public WebElement cifTypeEcoSectorInputBox() {
		return cifType_EcoSectorInputBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.DEFAULT_SUB_ECO_SECTOR']")
	private WebElement cifType_SubEcoSectorInputBox;

	public WebElement cifTypeSubEcoSectorInputBox() {
		return cifType_SubEcoSectorInputBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.ecoDescr']")
	private WebElement cifType_EcoSectorDescription;

	public WebElement cifTypeEcoSectorDescription() {
		return cifType_EcoSectorDescription;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.subEcoDescr']")
	private WebElement cifType_SubEcoSectorDescription;

	public WebElement cifTypeSubEcoSectorDescription() {
		return cifType_SubEcoSectorDescription;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.DEFAULT_ROLE_CODE']")
	private WebElement cifType_RoleCodeInputBox;

	public WebElement cifTypeRoleCodeInputBox() {
		return cifType_RoleCodeInputBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.roleDescr']")
	private WebElement cifType_RoleCodeDescription;

	public WebElement cifTypeRoleCodeDescription() {
		return cifType_RoleCodeDescription;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.rifcttVO.LEGAL_STATUS']")
	private WebElement cifType_LegalStatusInputBox;

	public WebElement cifTypeLegalStatusInputBox() {
		return cifType_LegalStatusInputBox;
	}
	@FindBy(xpath="//input[@name='ciftypeparamCO.legalDesc']")
	private WebElement cifType_LegalStatusDescription;

	public WebElement cifTypeLegalStatusDescription() {
		return cifType_LegalStatusDescription;
	}
	@FindBy(xpath="//span[text()='Allowed Account Types']")
	private WebElement cifType_AllowedAccountTypeTab;

	public WebElement cifTypeAllowedAccountTypeTab() {
		return cifType_AllowedAccountTypeTab;
	}
	@FindBy(xpath="//td[@id='add_tab4_GridTbl_Id_P010MT']")
	private WebElement cifType_AllowedAccountTypeAddButton;

	public WebElement cifTypeAllowedAccountTypeAddButton() {
		return cifType_AllowedAccountTypeAddButton;
	}
	@FindBy(xpath="//input[@name='lookupTxt_rifcttAccTypeVO.GL_CODE']")
	private WebElement cifType_AllowedAccountTypeGlCodeTextBox;

	public WebElement cifTypeAllowedAccountTypeGlCodeTextBox() {
		return cifType_AllowedAccountTypeGlCodeTextBox;
	}
	@FindBy(xpath="//td[@tdlabel='Number of Accounts']//input")
	private WebElement cifType_AllowedAccountTypeNumberOfAccountsTextBox;

	public WebElement cifTypeAllowedAccountTypeNumberOfAccountsTextBox() {
		return cifType_AllowedAccountTypeNumberOfAccountsTextBox;
	}
	@FindBy(xpath="//td[text()='CIF Type']//ancestor::li//span[text()='Approve']")
	private WebElement cifType_ApproveModule;

	public WebElement cifTypeApproveModule() {
		return cifType_ApproveModule;
	}
	@FindBy(xpath="(//input[@name='TYPE_CODE'])[2]")
	private WebElement cifType_SearchCIFCode;

	public WebElement cifTypeSearchCIFCode() {
		return cifType_SearchCIFCode;
	}
	
	
	
	
}
