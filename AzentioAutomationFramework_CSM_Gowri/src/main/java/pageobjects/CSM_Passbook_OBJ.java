package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Passbook_OBJ {
 
	WebDriver driver;

	public CSM_Passbook_OBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//td[text()='PassBooks']")
private WebElement PassBookIcon;
public WebElement PassBookIcon()
{
	return PassBookIcon;
}
@FindBy(xpath="//span[text()='Maintenance']")
private WebElement Maintenance;
public WebElement Maintenance()
{
	return Maintenance;
}
@FindBy(xpath="(//label[text()='PassBook Type']/parent::td//following-sibling::td//input)[1]")
private WebElement PassBookType;
public WebElement PassBookType()
{
	return PassBookType;
}
@FindBy(xpath="//a[text()='PassBooks / Maintenance']")
private WebElement RandomClick;
public WebElement RandomClick()
{
	return RandomClick;
}
@FindBy(xpath="(//input[@title='Branch Code'])[1]")
private WebElement BranchCode;
public WebElement BranchCode()
{
	return BranchCode;
}
@FindBy(xpath="(//input[@title='Currency Code'])[1]")
private WebElement CurrencyCode;
public WebElement CurrencyCode()
{
	return CurrencyCode;
}
@FindBy(xpath="(//input[@title='Gl Code'])[1]")
private WebElement GlCode;
public WebElement Glcode()
{
	return GlCode;
}
@FindBy(xpath="(//input[@title='CIF code'])[1]")
private WebElement CifCode;
public WebElement CifCode()
{
	return CifCode;
}
@FindBy(xpath="(//input[@title='Serial'])[1]")
private WebElement SerialNo;
public WebElement SerialNo()
{
	return SerialNo;
}
@FindBy(xpath="//span[@id='spanLookup_accSl_S000MT']")
private WebElement PassbookTypeSearchIcon;
public WebElement PassbookTypeSearchIcon()
{
	return PassbookTypeSearchIcon;
}
@FindBy(xpath="//label[text()='Save ']")
private WebElement SaveButton;
public WebElement SaveButon()
{
	return SaveButton;
}
@FindBy(xpath="//label[text()='Date Created']/parent::td//following-sibling::td//input")
private WebElement PassbookValueDate;
public WebElement PassbookValueDate()
{
	return PassbookValueDate;
}
@FindBy(xpath="//label[text()='Log Out ']")
private WebElement LogoutButton;
public WebElement LogoutButton()
{
	return LogoutButton;
}
}













