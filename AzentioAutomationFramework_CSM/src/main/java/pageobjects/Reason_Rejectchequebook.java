package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reason_Rejectchequebook {

	 WebDriver driver;
	 public Reason_Rejectchequebook(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }

@FindBy(xpath="//td[text()='Parameters']")
private WebElement Parameters1;
public WebElement Parameters1() {
	   return Parameters1;
}
@FindBy(xpath="//td[text()='System Parameters']")
private WebElement SystemParameters;
public WebElement SystemParameters() {
	   return SystemParameters;
}
@FindBy(xpath="//td[text()='Control Record']")
private WebElement Controlrecord;
public WebElement Controlrecord() {
	   return Controlrecord;
}
@FindBy(xpath="//td[text()='Chequebook Request']")
private WebElement Chequebook2;
public WebElement Chequebook2() {
	return Chequebook2;
}
@FindBy(xpath="//span[text()='Approve Cancel']")
private WebElement Approvecancel;
public WebElement Approvecancel() {
	return Approvecancel;
}
@FindBy(xpath="//input[@name='CODE']")
private	WebElement code_Value;
public WebElement code_Value() {
	return code_Value;
}
@FindBy(xpath="//span[text()='Maintenance']")
private WebElement Maintenance12;
public WebElement Maintenance12() {
	return Maintenance12;
}
@FindBy(xpath="//a[text()=' Other Information ']")
private WebElement information;
public WebElement information() {
	return information;
}
@FindBy(xpath="//span[text()='Approve']")
private WebElement Approve11;
public WebElement Approve11() {
	return Approve11;
}
@FindBy(xpath="//label[text()='Reject ']")
private WebElement Rejectbutton;
public WebElement Rejectbutton() {
	return Rejectbutton;
}
@FindBy(xpath="name=\"CHEQUE_CODE\"")
private WebElement ChequeCode_value;
public WebElement ChequeCode_value() {
	return ChequeCode_value;
}
@FindBy(xpath="//span[text()='Submit']")
private WebElement Submitbutton;
public WebElement Submitbutton() {
	return Submitbutton;
}

}
