package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_AccountsTypeObj {
	WebDriver driver;
	public CSMParam_AccountsTypeObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Account Type']")
	private WebElement accountsParameter_AccountType;
	public WebElement accountsParameterAccountsType()
	{
		return accountsParameter_AccountType;
	}
	@FindBy(xpath="//td[text()='Account Type']//ancestor::li//span[text()='Maintenance']")
	private WebElement accountType_Maintenance;
	public WebElement accountTypeMaintenance()
	{
		return accountType_Maintenance;
	}
	@FindBy(xpath="//input[@id='lookuptxt_type_code_P017MT']")
	private WebElement accountType_GlCode;
	public WebElement accountTypeGlCode()
	{
		return accountType_GlCode;
	}
	@FindBy(xpath="//input[@name='acctypeCO.rifattVO.BRIEF_DESC_ENG']")
	private WebElement accountType_BriefnameDescription;
	public WebElement accountTypeBriefnameDescription()
	{
		return accountType_BriefnameDescription;
	}
	@FindBy(xpath="//span[text()='Instructions']")
	private WebElement accountType_InstructionTab;
	public WebElement accountTypeInstructionTab()
	{
		return accountType_InstructionTab;
	}
	@FindBy(xpath="//select[@name='acctypeCO.rifattVO.CATEGORY']")
	private WebElement accountType_CategoryDropdown;
	public WebElement accountTypeCategoryDropdown()
	{
		return accountType_CategoryDropdown;
	}
	@FindBy(xpath="//select[@name='acctypeCO.rifattVO.TERM_IND']")
	private WebElement accountType_PeriodDropdown;
	public WebElement accountTypePeriodDropdown()
	{
		return accountType_PeriodDropdown;
	}
	@FindBy(xpath="//select[@name='acctypeCO.rifattVO.BC_IND']")
	private WebElement accountType_ClientBankDropdown;
	public WebElement accountTypeClientBankDropdown()
	{
		return accountType_ClientBankDropdown;
	}
	@FindBy(xpath="//button[@id='acctypeMaint_Maint_save_P017MT']")
	private WebElement accountType_SaveButton;
	public WebElement accountTypeSaveButton()
	{
		return accountType_SaveButton;
	}
	@FindBy(xpath="//td[text()='Account Type']//ancestor::li//span[text()='Approve']")
	private WebElement accountType_ApproveTab;
	public WebElement accountTypeApproveTab()
	{
		return accountType_ApproveTab;
	}
	@FindBy(xpath="//div[text()='Confirm Save Process']//ancestor::div//center//input[1]")
	private WebElement accountType_SaveConfirmOkButton;
	public WebElement accountTypeSaveConfirmOkButton()
	{
		return accountType_SaveConfirmOkButton;
	}
	@FindBy(xpath="//div[text()='Record Saved Successfully']//ancestor::div//center//input[1]")
	private WebElement accountType_SaveSuccessOkButton;
	public WebElement accountTypeSaveSuccessOkButton()
	{
		return accountType_SaveSuccessOkButton;
	}
	@FindBy(xpath="//label[text()='Approve ']//ancestor::button")
	private WebElement accountType_ApproveButton;
	public WebElement accountTypeApproveButton()
	{
		return accountType_ApproveButton;
	}
	@FindBy(xpath="//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
	private WebElement accountType_ApproveSearchGlCode;
	public WebElement accountTypeApproveSearchGlCode()
	{
		return accountType_ApproveSearchGlCode;
	}
	@FindBy(xpath="//div[text()='Confirm Approve Process']//ancestor::div//center//input[1]")
	private WebElement accountType_ConfirmApprovOkButton;
	public WebElement accountTypeConfirmApprovOkButton()
	{
		return accountType_ConfirmApprovOkButton;
	}
	@FindBy(xpath="//div[text()='Record was Approved Successfully']//ancestor::div//center//input[1]")
	private WebElement accountType_ApproveSuccessOkButton;
	public WebElement accountTypeApproveSuccessOkButton()
	{
		return accountType_ApproveSuccessOkButton;
	}
}
