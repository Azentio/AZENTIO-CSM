package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chequebook_Request {
	WebDriver driver;
	public Chequebook_Request(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[text()='Chequebook Request']")
	private WebElement chequebook1;
	public WebElement chequebook1() {
		return chequebook1;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Maintenance12;
	public WebElement Maintenance12() {
		return Maintenance12;
	}
	@FindBy(xpath="//input[@title='Number of ChequeBooks']")
	private WebElement NoofChequeBooks;
	public WebElement NoofChequeBooks() {
		return NoofChequeBooks;
	}
	@FindBy(xpath="//span[@id='spanLookup_CHEQUE_CODE_Q000MT']") 
	private WebElement chequeCode;
	public WebElement chequeCode() {
		return chequeCode;
	}
	@FindBy(xpath="//select[@id='check_status_type_QG001MT']")
	private WebElement Status;
	public WebElement Status() {
		return Status;
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
	@FindBy(xpath="//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement SaveButton;
	public WebElement SaveButton() {
		return SaveButton;
	}
}
