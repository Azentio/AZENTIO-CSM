package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.experimental.FieldDefaults;

public class Passbook_CSM {
	WebDriver driver;
	public Passbook_CSM(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
   @FindBy(xpath="//td[text()='PassBooks']")
   private WebElement Passbook;
   public WebElement Passbook(){
	   return Passbook;
   }
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Maintenance;
	public WebElement Maintenance() {
		return Maintenance;
	}
	@FindBy(xpath="//input[@id='passbkCode_S000MT']")
	private WebElement passbookcode;
	public WebElement passbookcode() {
		return passbookcode;
	}
	@FindBy(xpath="//input[@id='status_S000MT']")
	private WebElement Status;
	public WebElement Status() {
		return Status;
	}
	@FindBy(xpath="//input[@id='branchName_S000MT']")
	private WebElement BranchName1;
	public WebElement BranchName1() {
		return BranchName1;
	}
	@FindBy(xpath="//input[@id='dateCreated_S000MT']") 
	private WebElement DateCreated;
	public WebElement DateCreated() {
		return DateCreated;
	}
	@FindBy(xpath="//input[@id='lookuptxt_passbookType_S000MT']")
	private WebElement passbookType;
	public WebElement passbookType() {
		return passbookType;
	}
	@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[3]")
	private WebElement BranchCode;
	public WebElement BranchCode()
	{
	return BranchCode;
	}
	@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[4]")
	private WebElement CurrencyCode;
	public WebElement CurrencyCode()
	{
	return CurrencyCode;
	}
	@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[5]")
	private WebElement GlCode;
	public WebElement Glcode()
	{
	return GlCode;
	}
	@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[6]")
	private WebElement CifCode;
	public WebElement CifCode()
	{
	return CifCode;
	}
	@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[7]")
	private WebElement SerialNo;
	public WebElement SerialNo()
	{
	return SerialNo;
	}
	@FindBy(xpath="//input[@id='lookuptxt_accAddRef_S000MT']")
	private WebElement AccountNo;
	public WebElement AccountNo() {
		return AccountNo;
	}
	@FindBy(xpath="//select[@id='deductCharges_S000MT']")
	private WebElement DeductCharges;
	public WebElement DeductCharges() {
		return DeductCharges;
	}
	@FindBy(xpath="//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement SaveButton;
	public WebElement SaveButton() {
		return SaveButton;
	}
	@FindBy(xpath="//a[@id='PassBooks / Maintenance']")
	private WebElement Reclickelement;
	public WebElement Reclickelement() {
		return Reclickelement;
	}
	@FindBy(xpath="//input[@id='passbkCode_S000MT']")
	private WebElement passcode_ChargeWai;
	public WebElement passcode_ChargeWai() {
		return passcode_ChargeWai;
	}
	@FindBy(xpath="//input[@name='passBookCO.passBookVO.DATE_CREATED']")
	private WebElement PassbookData_created;
	public WebElement PassbookData_created() {
		return PassbookData_created;
	}
	@FindBy(xpath="//select[@name='passBookCO.passBookVO.CHARGES_DEDUCT']")
	private WebElement DeductCharge_passbook;
	public WebElement DeductCharge_passbook() {
		return DeductCharge_passbook;
	}
}
