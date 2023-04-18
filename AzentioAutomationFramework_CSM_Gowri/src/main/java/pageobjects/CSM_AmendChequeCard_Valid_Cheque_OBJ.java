package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_AmendChequeCard_Valid_Cheque_OBJ {

	WebDriver driver;
	
	public CSM_AmendChequeCard_Valid_Cheque_OBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
@FindBy(xpath="//td[text()='Amend Cheque/Card status']")
public WebElement AmendChequeCardOptions;
private WebElement AmendChequeCardOptions()
{
	return AmendChequeCardOptions;
}
@FindBy(xpath="(//span[text()='Maintenance'])[1]")
public WebElement MaintenanceIcon;
private WebElement MaintenanceIcon()
{
	return MaintenanceIcon;
}
@FindBy(xpath="//select[@id='product_type_QG001MT']")
public WebElement ProductType;
private WebElement ProductType()
{
	return ProductType;
}
@FindBy(xpath="((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[1]")
public WebElement BranchCode;
private WebElement BranchCode()
{
	return BranchCode;
}
@FindBy(xpath="((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[2]")
public WebElement CurrencyCode;
private WebElement CurrencyCode()
{
	return CurrencyCode;
}
@FindBy(xpath="((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[3]")
public WebElement GlCode;
private WebElement GlCode()
{
	return GlCode;
}
@FindBy(xpath="((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[4]")
public WebElement CifCode;
private WebElement CifCode()
{
	return CifCode;
}
@FindBy(xpath="((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[5]")
public WebElement SerialNo;
private WebElement SerialNo()
{
	return SerialNo;
}
@FindBy(xpath="//a[@id='Amend Cheque/Card status / Maintenance']")
public WebElement MaintenanceRandomClick;
private WebElement MaintenanceRandomClick()
{
	return MaintenanceRandomClick;
}
@FindBy(xpath="(//label[text()='Cheque No ']//parent::td//following-sibling::td[3]//input)[1]")
public WebElement ChequeNo;
private WebElement ChequeNo()
{
	return ChequeNo;
}
@FindBy(xpath="//button[@id='retrieveBtn_QG001MT']")
public WebElement RetrieveButton;
private WebElement RetrieveButton()
{
	return RetrieveButton;
}





}
