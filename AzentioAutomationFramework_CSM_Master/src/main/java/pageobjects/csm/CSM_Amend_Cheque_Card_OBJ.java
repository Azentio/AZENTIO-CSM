package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Amend_Cheque_Card_OBJ {
     
	WebDriver driver;
	
	public CSM_Amend_Cheque_Card_OBJ(WebDriver driver) {
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
@FindBy(xpath="//select[@id=\"product_type_QG001MT\"]")
public WebElement ProductType;
private WebElement ProductType()
{
	return ProductType;
}
@FindBy(xpath="(//label[text()='Card Type '])[1]//parent::td//following-sibling::td[1]//input")
public WebElement CardType;
private WebElement CardType()
{
	return CardType;
}
@FindBy(xpath="//select[@id='currentStatus_type_QG001MT']")
public WebElement StatusSelectIcon;
private WebElement StatusSelectIcon()
{
	return StatusSelectIcon;
}
@FindBy(xpath="//label[text()='Card No ']//parent::td//following-sibling::td[1]//input")
public WebElement CardNo;
private WebElement CardNo()
{
	return CardNo;
}
@FindBy(xpath="(//label[text()='Application ID '])[1]//parent::td//following-sibling::td//input")
public WebElement ApplicationId;
private WebElement ApplicationId()
{
	return ApplicationId;
}
@FindBy(xpath="//button[@id='retrieveBtn_QG001MT']")
public WebElement RetrieveButton;
private WebElement RetrieveButton()
{
	return RetrieveButton;
}
@FindBy(xpath="//div[text()='[900635] No records found']")
public WebElement ErrorPopupMessage;
private WebElement ErrorPopupMessage()
{
	return ErrorPopupMessage;
}
@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
public WebElement PopupMessageOkButton;
private WebElement PopupMessageOkButton()
{
	return PopupMessageOkButton;
}
}
