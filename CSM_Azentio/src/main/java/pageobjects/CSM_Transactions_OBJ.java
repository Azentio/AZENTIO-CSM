package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Transactions_OBJ {

	WebDriver driver;

	public CSM_Transactions_OBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//legend[text()='  Force logout   ']")
private WebElement ForceLogoutPopup;
public WebElement ForceLogoutPopup()
{
	return ForceLogoutPopup;
}

@FindBy(xpath="//span[text()=' Yes']")
private WebElement ForceLogoutYes;
public WebElement ForceLogoutYes()
{
	return ForceLogoutYes;
}

@FindBy(xpath="//td[text()='Transactions']")
private WebElement Transactions;
public WebElement Transactions()
{
 	return Transactions;
}
@FindBy(id="D001MT")
private WebElement Maintenance;
public WebElement Maintenance()
{
	return Maintenance;
}
@FindBy(xpath="//label[text()='TRX Type ']/parent::td/following-sibling::td[1]//input")
private WebElement TransactionsTrxType;
public WebElement TransactionsTrxType()
{
	return TransactionsTrxType;
}
@FindBy(xpath="//a[text()='Transactions / Maintenance']")
private WebElement TrxMaintance;
public WebElement TrxMaintance()
{
	return TrxMaintance;
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
@FindBy(xpath="//div[text()='WARNING']/parent::div/following-sibling::div/div")
private WebElement WarningMessage;
public WebElement WarningMessage()
{
	return WarningMessage;
}
@FindBy(xpath="(//input[@value='Ok'])[2]")
private WebElement WarningMessagePopupOk;
public WebElement WarningMessagePopupOk()
{
	return WarningMessagePopupOk;
}
@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[7]")
private WebElement SerialNo;
public WebElement SerialNo()
{
	return SerialNo;
}
@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//span[@role='button'])[1]")
private WebElement CreditAccountSearchIcon;
public WebElement CreditAccountSearchIcon()
{
	return CreditAccountSearchIcon;
}
@FindBy(xpath="//div[text()='Access Denied']/parent::div/following-sibling::div/div")
private WebElement AccessDeniedPopup;
public WebElement AccessDeniedPopup()
{
	return AccessDeniedPopup;
}
@FindBy(xpath="(//input[@value='Ok'])[2]")
private WebElement AccessDeniedPopupOk;
public WebElement AccessDeniedPopupOk()
{
	return AccessDeniedPopupOk;
}
@FindBy(xpath="//label[text()='Log Out ']")
private WebElement LogoutButton;
public WebElement LogoutButton()
{
	return LogoutButton;
}
}












