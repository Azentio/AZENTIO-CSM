package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMPARAM_GeneralLedgerObj {
	WebDriver driver;
	public CSMPARAM_GeneralLedgerObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement csmParam_Parameters;
	public WebElement csmParamParameters()
	{
		return csmParam_Parameters;
	}
	@FindBy(xpath="//td[text()='Accounts Parameters']")
	private WebElement parameters_AccountsParameters;
	public WebElement parametersAccountsParameters()
	{
		return parameters_AccountsParameters;
	}
	@FindBy(xpath="//td[text()='General Ledger']")
	private WebElement accountsParameters_GeneralLedger;
	public WebElement accountsParametersGeneralLedger()
	{
		return accountsParameters_GeneralLedger;
	}
	@FindBy(xpath="//td[text()='General Ledger']//ancestor::li//span[text()='Maintenance']")
	private WebElement generalLedger_Maintenance;
	public WebElement generalLedgerMaintenance()
	{
		return generalLedger_Maintenance;
	}
	@FindBy(xpath="//input[@name='genLedgerParamCO.genLedgerVO.GL_CODE']")
	private WebElement generalLedger_Code;
	public WebElement generalLedgerCode()
	{
		return generalLedger_Code;
	}
	@FindBy(xpath="//input[@name='genLedgerParamCO.genLedgerVO.BRIEF_DESC_ENG']")
	private WebElement generalLedger_BriefName;
	public WebElement generalLedgerBriefName()
	{
		return generalLedger_BriefName;
	}
	@FindBy(xpath="//input[@name='genLedgerParamCO.genLedgerVO.LONG_DESC_ENG']")
	private WebElement generalLedger_LongName;
	public WebElement generalLedgerLongName()
	{
		return generalLedger_LongName;
	}
	@FindBy(xpath="//span[text()='Additional Details']")
	private WebElement generalLedger_AdditionalDetails;
	public WebElement generalLedgerAdditionalDetails()
	{
		return generalLedger_AdditionalDetails;
	}
	@FindBy(xpath="//select[@name='genLedgerParamCO.genLedgerVO.GL_CATEGORY']")
	private WebElement generalLedger_GlCategory;
	public WebElement generalLedgerGlCategory()
	{
		return generalLedger_GlCategory;
	}
	@FindBy(xpath="//select[@name='genLedgerParamCO.genLedgerVO.AC_SIGN']")
	private WebElement generalLedger_AccountSign;
	public WebElement generalLedgerAccountSign()
	{
		return generalLedger_AccountSign;
	}
	@FindBy(xpath="//label[text()='Save ']")
	private WebElement generalLedger_Save;
	public WebElement generalLedgerSave()
	{
		return generalLedger_Save;
	}
	@FindBy(xpath="//div[text()='Saved Successfully']//ancestor::div//center//input[@id='_popup_path_sol_ok']")
	private WebElement generalLedger_SavePopupOkButton;
	public WebElement generalLedgerSavePopupOkButton()
	{
		return generalLedger_SavePopupOkButton;
	}
	@FindBy(xpath="//input[@id='genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE']")
	private WebElement generalLedgerApprove_SearchGlCode;
	public WebElement generalLedgerApproveSearchGlCode()
	{
		return generalLedgerApprove_SearchGlCode;
	}
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement generalLedger_Approve;
	public WebElement generalLedgerApprove()
	{
		return generalLedger_Approve;
	}
	@FindBy(xpath="//button[@id='genLedgerParamMaint_approve_P014P']")
	private WebElement generalLedger_ApproveButon;
	public WebElement generalLedgerApproveButon()
	{
		return generalLedger_ApproveButon;
	}
	@FindBy(xpath="//div[text()='Confirm Approve Process']//ancestor::div//center//input[1]")
	private WebElement generalLedger_ConfirmApproveButon;
	public WebElement generalLedgerConfirmApproveButon()
	{
		return generalLedger_ConfirmApproveButon;
	}
	@FindBy(xpath="//div[text()='Record was Approved Successfully']//ancestor::div//center//input[1]")
	private WebElement generalLedger_AfterApproveOkButon;
	public WebElement generalLedgerAfterApproveOkButon()
	{
		return generalLedger_AfterApproveOkButon;
	}
	

}
