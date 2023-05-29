package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_UserAccessObj {
	WebDriver driver;
	public CSMParam_UserAccessObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='System Parameters']")
	private WebElement csmParam_SystemParameter;
	public WebElement csmParamSystemParameter()
	{
		return csmParam_SystemParameter;
	}
	@FindBy(xpath="//td[text()='User']")
	private WebElement systemParameter_UserMainModule;
	public WebElement systemParameterUserMainModule()
	{
		return systemParameter_UserMainModule;
	}
	@FindBy(xpath="//td[text()='User']//ancestor::li//span[text()='Maintenance']")
	private WebElement user_Maintenance;
	public WebElement userMaintenance()
	{
		return user_Maintenance;
	}
	@FindBy(xpath="//td[text()='User']//ancestor::li//span[text()='Update after Approve']")
	private WebElement user_UpdateAfterApprove;
	public WebElement userUpdateAfterApprove()
	{
		return user_UpdateAfterApprove;
	}
	@FindBy(xpath="//input[@name='USER_ID']")
	private WebElement user_SearchUserID;
	public WebElement userSearchUserID()
	{
		return user_SearchUserID;
	}
	@FindBy(xpath="//span[text()=' Account Types ']")
	private WebElement user_AccountTypeAccess;
	public WebElement userAccountTypeAccess()
	{
		return user_AccountTypeAccess;
	}
	@FindBy(xpath="//span[text()=' CIF Types ']")
	private WebElement user_CIFTypeAccess;
	public WebElement userCIFTypeAccess()
	{
		return user_CIFTypeAccess;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstellerciftypedetVO.CIF_TYPE']")
	private WebElement user_CIFTypeAccessInputBox;
	public WebElement userCIFTypeAccessInputBox()
	{
		return user_CIFTypeAccessInputBox;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstellerciftypedetVO.TRX_TYPE']")
	private WebElement user_CIFTypeTransactionInputBox;
	public WebElement userCIFTypeTransactionInputBox()
	{
		return user_CIFTypeTransactionInputBox;
	}
	
	@FindBy(xpath="//td[@id='add_tab4_GridTbl_Id_E000MA']")
	private WebElement userAccess_PlusIcon;
	public WebElement userAccessPlusIcon()
	{
		return userAccess_PlusIcon;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstelleracctypedetVO.ACC_TYPE']")
	private WebElement userAccess_SearchAccountType;
	public WebElement userAccessSearchAccountType()
	{
		return userAccess_SearchAccountType;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstelleracctypedetVO.TRX_TYPE']")
	private WebElement userAccess_SearchTransaction;
	public WebElement userAccessSearchTransaction()
	{
		return userAccess_SearchTransaction;
	}
	@FindBy(xpath="//td[@tdlabel='W/D Limit']//input")
	private WebElement userAccess_SearchWdLimit;
	public WebElement userAccessSearchWdLimit()
	{
		return userAccess_SearchWdLimit;
	}
	@FindBy(xpath="//span[text()='Ok']")
	private WebElement userAccess_OkButton;
	public WebElement userAccessOkButton()
	{
		return userAccess_OkButton;
	}
	@FindBy(xpath="//label[text()='Update After Approve ']//ancestor::button")
	private WebElement userAccess_UpdateAfterApproveButton;
	public WebElement userAccessUpdateAfterApproveButton()
	{
		return userAccess_UpdateAfterApproveButton;
	}
	@FindBy(xpath="//div[text()='Confirm Save Process']//ancestor::div//center//input[1]")
	private WebElement userAccess_SaveConfirmOkButton;
	public WebElement userAccessSaveConfirmOkButton()
	{
		return userAccess_SaveConfirmOkButton;
	}
	@FindBy(xpath="//div[text()='Record was Updated Successfully']//ancestor::div//center//input[1]")
	private WebElement userAccess_SaveSuccessOkButton;
	public WebElement userAccessSaveSuccessOkButton()
	{
		return userAccess_SaveSuccessOkButton;
	}
	@FindBy(xpath="//td[text()='User']//ancestor::li//span[text()='Approve']")
	private WebElement userAccess_ApproveModule;
	public WebElement userAccessApproveModule()
	{
		return userAccess_ApproveModule;
	}
	
}
