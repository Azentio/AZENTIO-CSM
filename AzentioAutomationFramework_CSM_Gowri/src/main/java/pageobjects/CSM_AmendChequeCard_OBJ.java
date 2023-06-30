package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_AmendChequeCard_OBJ {

	WebDriver driver;
	
	public CSM_AmendChequeCard_OBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
@FindBy(xpath="//td[text()='Amend Cheque/Card status']")
private WebElement AmendChequeCardOptions;
public WebElement AmendChequeCardOptions()
{
	return AmendChequeCardOptions;
}
@FindBy(xpath="(//span[text()='Maintenance'])[1]")
private WebElement MaintenanceIcon;
public WebElement MaintenanceIcon()
{
	return MaintenanceIcon;
}
@FindBy(xpath="//select[@id='product_type_QG001MT']")
private WebElement ProductType;
public WebElement ProductType()
{
	return ProductType;
}
//((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[1]
@FindBy(xpath="//input[@id='BR_CODE_QG001MT']")
private WebElement BranchCode;
public WebElement BranchCode()
{
	return BranchCode;
}
//((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[2]
@FindBy(xpath="//input[@id='CY_CODE_QG001MT']")
private WebElement CurrencyCode;
public WebElement CurrencyCode()
{
	return CurrencyCode;
}
//((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[3]
@FindBy(xpath="//input[@id='GL_CODE_QG001MT']")
private WebElement GlCode;
public WebElement GlCode()
{
	return GlCode;
}
//((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[4]
@FindBy(xpath="//input[@id='CIF_SUB_NO_QG001MT']")
private WebElement CifCode;
public WebElement CifCode()
{
	return CifCode;
}
//((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[5]
@FindBy(xpath="//input[@id='lookuptxt_SL_NO_QG001MT']")
private WebElement SerialNo;
public WebElement SerialNo()
{
	return SerialNo;
}
@FindBy(xpath="//a[@id='Amend Cheque/Card status / Maintenance']")
private WebElement MaintenanceRandomClick;
public WebElement MaintenanceRandomClick()
{
	return MaintenanceRandomClick;
}
@FindBy(xpath="(//label[text()='Cheque No ']//parent::td//following-sibling::td[3]//input)[1]")
private WebElement ChequeNo;
public WebElement ChequeNo()
{
	return ChequeNo;
}
@FindBy(xpath="//button[@id='retrieveBtn_QG001MT']")
private WebElement RetrieveButton;
public WebElement RetrieveButton()
{
	return RetrieveButton;
}
//@FindBy(xpath="//td[text()='Amend Cheque/Card status']")
//public WebElement AmendChequeCardOptions;
//private WebElement AmendChequeCardOptions()
//{
//	return AmendChequeCardOptions;
//}
//@FindBy(xpath="(//span[text()='Maintenance'])[1]")
//public WebElement MaintenanceIcon;
//private WebElement MaintenanceIcon()
//{
//	return MaintenanceIcon;
//}
//@FindBy(xpath="//select[@id=\"product_type_QG001MT\"]")
//public WebElement ProductType;
//private WebElement ProductType()
//{
//	return ProductType;
//}
@FindBy(xpath="(//label[text()='Card Type '])[1]//parent::td//following-sibling::td[1]//input")
private WebElement CardType;
public WebElement CardType()
{
	return CardType;
}
@FindBy(xpath="//select[@id='currentStatus_type_QG001MT']")
private WebElement StatusSelectIcon;
public WebElement StatusSelectIcon()
{
	return StatusSelectIcon;
}
@FindBy(xpath="//label[text()='Card No ']//parent::td//following-sibling::td[1]//input")
private WebElement CardNo;
public WebElement CardNo()
{
	return CardNo;
}
@FindBy(xpath="(//label[text()='Application ID '])[1]//parent::td//following-sibling::td//input")
private WebElement ApplicationId;
public WebElement ApplicationId()
{
	return ApplicationId;
}
//@FindBy(xpath="//button[@id='retrieveBtn_QG001MT']")
//public WebElement RetrieveButton;
//private WebElement RetrieveButton()
//{
//	return RetrieveButton;
//}
@FindBy(xpath="//div[text()='[900635] No records found']")
private WebElement ErrorPopupMessage;
public WebElement ErrorPopupMessage()
{
	return ErrorPopupMessage;
}
@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
private WebElement PopupMessageOkButton;
public WebElement PopupMessageOkButton()
{
	return PopupMessageOkButton;
}
@FindBy(xpath="//div[text()='[31811] Missing / Invalid Cheque Number']")
private WebElement verifyPopupInPaidCheque;
public WebElement verifyPopupInPaidCheque()
{
	return verifyPopupInPaidCheque;
}
@FindBy(xpath="//span[text()='Approve']")
private WebElement amendChequeCardApproveScreen;
public WebElement amendChequeCardApproveScreen()
{
	return amendChequeCardApproveScreen;
}


}
