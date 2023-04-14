package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequeBookRequestObj {
	WebDriver driver;
	public ChequeBookRequestObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Chequebook Request']")
	private WebElement csm_chequeBookRequestModule;
	public WebElement csmChequeBookRequestModule()
	{
		return csm_chequeBookRequestModule;
	}
	@FindBy(xpath="//span[text()='Chequebook Query']")
	private WebElement csm_chequeBooQueryModule;
	public WebElement csmchequeBooQueryModule()
	{
		return csm_chequeBooQueryModule;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBooQueryModule_BranchCode;
	public WebElement chequeBooQueryModuleBranchCode()
	{
		return chequeBooQueryModule_BranchCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBooQueryModule_CurrencyCode;
	public WebElement chequeBooQueryModuleCurrencyCode()
	{
		return chequeBooQueryModule_CurrencyCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBooQueryModule_AccGlCode;
	public WebElement chequeBooQueryModuleAccGlCode()
	{
		return chequeBooQueryModule_AccGlCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBooQueryModule_CIFNumber;
	public WebElement chequeBooQueryModuleCIFNumber()
	{
		return chequeBooQueryModule_CIFNumber;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_SL']")
	private WebElement chequeBooQueryModule_SLNumber;
	public WebElement chequeBooQueryModuleSLNumber()
	{
		return chequeBooQueryModule_SLNumber;
	}
	@FindBy(xpath="//input[@id='chequeBookQueryTbl_Id_Q000QR_gs_CODE']")
	private WebElement chequeBooQueryModule_ChequeCode;
	public WebElement chequeBooQueryModuleChequeCode()
	{
		return chequeBooQueryModule_ChequeCode;
	}
	@FindBy(xpath="//span[@id='spanLookup_status_sl_Q000QR']//span")
	private WebElement chequeBooQueryModule_LiveSearch;
	public WebElement chequeBooQueryModuleLiveSearch()
	{
		return chequeBooQueryModule_LiveSearch;
	}
	@FindBy(xpath="//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.GL_CODE']")
	private WebElement chequeBooQueryModuleLiveSearch_GlCode;
	public WebElement chequeBooQueryModuleLiveSearchGlCode()
	{
		return chequeBooQueryModuleLiveSearch_GlCode;
	}
	@FindBy(xpath="//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.CIF_SUB_NO']")
	private WebElement chequeBooQueryModuleLiveSearch_CIFNo;
	public WebElement chequeBooQueryModuleLiveSearchCIFNo()
	{
		return chequeBooQueryModuleLiveSearch_CIFNo;
	}
	@FindBy(xpath="//table[@id='chequeBookQueryTbl_Id_Q000QR']//tr[2]")
	private WebElement chequeBooQueryModuleLiveSearch_TableValidation;
	public WebElement chequeBooQueryModuleLiveSearchTableValidation()
	{
		return chequeBooQueryModuleLiveSearch_TableValidation;
	}
	@FindBy(xpath="//span[text()='To Be Destroyed']")
	private WebElement toBeDestroy_MainModule;
	public WebElement toBeDestroyMainModule()
	{
		return toBeDestroy_MainModule;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement toBeDestroy_SearchChequeCode;
	public WebElement toBeDestroySearchChequeCode()
	{
		return toBeDestroy_SearchChequeCode;
	}
	@FindBy(xpath="//button[@id='chequeBook_toDestroy_Q000TD']")
	private WebElement toBeDestroy_ToDestroyButton;
	public WebElement toBeDestroyToDestroyButton()
	{
		return toBeDestroy_ToDestroyButton;
	}
	@FindBy(xpath="//input[@id='acc_br_Q000TD']")
	private WebElement toBeDestroy_BranchCodeValidation;
	public WebElement toBeDestroyBranchCodeValidation()
	{
		return toBeDestroy_BranchCodeValidation;
	}
	@FindBy(xpath="//span[text()='Approve Destroyed']")
	private WebElement destroy_MainModule;
	public WebElement destroyMainModule()
	{
		return destroy_MainModule;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE']")
	private WebElement destroy_ChequeCodeSearch;
	public WebElement destroyChequeCodeSearch()
	{
		return destroy_ChequeCodeSearch;
	}
	@FindBy(xpath="//button[@id='chequeBook_destroy_Q000AD']")
	private WebElement destroy_DestroyButon;
	public WebElement destroyDestroyButon()
	{
		return destroy_DestroyButon;
	}
	@FindBy(xpath="//center//input[@value='Ok']")
	private WebElement destroy_DestroyAlertOkButton;
	public WebElement destroyDestroyAlertOkButton()
	{
		return destroy_DestroyAlertOkButton;
	}
	@FindBy(xpath="//div[@class='jMsgbox-contentWrap']")
	private WebElement destroy_TransactionNumber;
	public WebElement destroyTransactionNumber()
	{
		return destroy_TransactionNumber;
	}
	@FindBy(xpath="//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Maintenance']")
	private WebElement chequeBook_MaintenenaceScreen;
	public WebElement chequeBookMaintenenaceScreen()
	{
		return chequeBook_MaintenenaceScreen;
	}
	@FindBy(xpath="//a[@id='infoBarSearchButton_Q000MT']")
	private WebElement chequeBookMaintenance_Search;
	public WebElement chequeBookMaintenaceSearch()
	{
		return chequeBookMaintenance_Search;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE']")
	private WebElement chequeBookMaintenance_SearchChequeCode;
	public WebElement chequeBookMaintenanceSearchChequeCode()
	{
		return chequeBookMaintenance_SearchChequeCode;
	}
	@FindBy(xpath="//table[@id='chequeBookGridTbl_Id_Q000MT']//td[text()='Approved']")
	private WebElement ChequeBook_ApprovedStatus;

	public WebElement ChequeBookApprovedStatus() {
		return ChequeBook_ApprovedStatus;
	}
	@FindBy(xpath="//input[@id='acc_br_Q000AD']")
	private WebElement destroyed_BranchCodeValidation;
	public WebElement destroyedBranchCodeValidation()
	{
		return destroyed_BranchCodeValidation;
	}
	
}
