package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_AccountsObj {
	WebDriver driver;

	public CSM_AccountsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Accounts']")
	private WebElement csm_AccountsMainModule;

	public WebElement csmAccountsMainModule() {
		return csm_AccountsMainModule;
	}

	@FindBy(xpath = "//td[text()='Fixed Maturity Accounts']")
	private WebElement accounts_FixedMaturiyAccounts;

	public WebElement accountsFixedMaturityAccounts() {
		return accounts_FixedMaturiyAccounts;
	}

	@FindBy(xpath = "//span[text()='Opening']")
	private WebElement fixedMaturiyAccounts_Opening;

	public WebElement fixedMaturiyAccountsOpening() {
		return fixedMaturiyAccounts_Opening;
	}

	@FindBy(xpath = "//td[text()='General Accounts']")
	private WebElement accounts_GeneralAccounts;

	public WebElement accountsGeneralAccounts() {
		return accounts_GeneralAccounts;
	}

	@FindBy(xpath = "//td[text()='General Accounts']//ancestor::li//span[text()='Opening']")
	private WebElement generalAccounts_Opening;

	public WebElement generalAccountsOpening() {
		return generalAccounts_Opening;
	}

	@FindBy(xpath = "//a[@id='A003']//span[text()='Account Query']")
	private WebElement accounts_AccountQuery;

	public WebElement accountsAccountQuery() {
		return accounts_AccountQuery;
	}

	@FindBy(xpath = "//td[text()='Closed Dormant Accounts']")
	private WebElement accounts_ClosedDormantAccounts;

	public WebElement accountsClosedDormantAccounts() {
		return accounts_ClosedDormantAccounts;
	}

	@FindBy(xpath = "//td[text()='Closed Dormant Accounts']//ancestor::li//span[text()='Maintenance']")
	private WebElement closedDormantAccounts_Maintenance;

	public WebElement closedDormantAccountsMaintenance() {
		return closedDormantAccounts_Maintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CIF_A002CDAMT']")
	private WebElement closedDormantAccount_InputCIFCode;

	public WebElement closedDormantAccountInputCIFCode() {
		return closedDormantAccount_InputCIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A001MT']")
	private WebElement fom_CurrencyCode;

	public WebElement fomCurrencyCode() {
		return fom_CurrencyCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_glType_A001MT']")
	private WebElement fom_GlCode;

	public WebElement fomGLCode() {
		return fom_GlCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A001MT']")
	private WebElement fom_CIFNo;

	public WebElement fomCIFNo() {
		return fom_CIFNo;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_currencyCode_A002MT']")
	private WebElement generalAccounts_CurrencyCode;

	public WebElement generalAccountsCurrencyCode() {
		return generalAccounts_CurrencyCode;
	}

	@FindBy(xpath="//input[@name='accountsManagementCO.currencyDesc']")
	private WebElement generalAccounts_CurrencyDescription;
	public WebElement generalAcccountsCurrencyDescription()
	{
		return generalAccounts_CurrencyDescription;
	}
	@FindBy(xpath="//input[@name='accountsManagementCO.glDesc']")
	private WebElement generalAccounts_glDescription;
	public WebElement generalAccountsGlDescription()
	{
		return generalAccounts_glDescription;
	}
	@FindBy(xpath="//input[@name='accountsManagementCO.cifName']")
	private WebElement generalAccounts_CIFName;
	public WebElement generalAccountsCIFName()
	{
		return generalAccounts_CIFName;
	}
	@FindBy(xpath="//span[text()='close']")
	private WebElement accounts_MemoClose;
	public WebElement accountsMemoClose()
	{
		return accounts_MemoClose;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_glType_A002MT']")
	private WebElement generalAccounts_GLType;

	public WebElement generalAccountsGLType() {
		return generalAccounts_GLType;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_cifNo_A002MT']")
	private WebElement generalAccounts_CIFNo;

	public WebElement generalAccountsCIFNo() {
		return generalAccounts_CIFNo;
	}
	@FindBy(xpath="//input[@name='accountsManagementCO.cifName']")
	private WebElement generalAccounts_CIFNameDescription;

	public WebElement generalAccountsCIFNameDescription() {
		return generalAccounts_CIFNameDescription;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CIF_A002CDAMT']")
	private WebElement ClosedDormantAccount_CIFNo;

	public WebElement ClosedDormantAccountCIFNo() {
		return ClosedDormantAccount_CIFNo;
	}
	@FindBy(xpath="//input[@id='lookuptxt_currencyCode_A001MT']")
	private WebElement fma_CurrecyCode;

	public WebElement fmaCurrecyCode() {
		return fma_CurrecyCode;
	}
	@FindBy(xpath="//input[@name='accountsManagementCO.currencyDesc']")
	private WebElement fma_CurrecyCodeDescription;

	public WebElement fmaCurrecyCodeDescription() {
		return fma_CurrecyCodeDescription;
	}
	@FindBy(xpath="//input[@id='lookuptxt_glType_A001MT']")
	private WebElement fma_GlType;

	public WebElement fmaGlType() {
		return fma_GlType;
	}
	@FindBy(xpath="//input[@name='accountsManagementCO.glDesc']")
	private WebElement fma_GlTypeDescription;

	public WebElement fmaGlTypeDescription() {
		return fma_GlTypeDescription;
	}
	@FindBy(xpath="//input[@id='lookuptxt_cifNo_A001MT']")
	private WebElement fma_CIFNo;

	public WebElement fmaCIFNo() {
		return fma_CIFNo;
	}
	@FindBy(xpath="//input[@name='accountsManagementCO.cifName']")
	private WebElement fma_CIFNoDescription;

	public WebElement fmaCIFNoDescription() {
		return fma_CIFNoDescription;
	}

}
