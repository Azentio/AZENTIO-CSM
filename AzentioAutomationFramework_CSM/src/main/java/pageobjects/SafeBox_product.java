package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SafeBox_product {
  WebDriver driver;
  public SafeBox_product(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  @FindBy(xpath="//td[text()='Safe Box']")
  private WebElement SafeBoxproduct;
  public WebElement SafeBoxproduct() {
	  return SafeBoxproduct;
  }
  @FindBy(xpath="//td[text()='Request']")
  private WebElement RequestButton;
  public WebElement RequestButton() {
	  return RequestButton;
  }
  @FindBy(xpath="(//input[@name='ctsSafeBoxTrxVO.TRX_NO'])[2]")
  private WebElement SafeboxtransactionNo;
  public WebElement SafeboxtransactionNo() {
	  return SafeboxtransactionNo;
}
  @FindBy(xpath="//td[text()='MAHMOUD MAHMOUD 123']")
  private WebElement MAHMOUD123;
  public WebElement MAHMOUD123() {
	  return MAHMOUD123;
  }
  @FindBy(xpath="//span[text()='close']")
  private WebElement closebutton;
  public WebElement closebutton() {
	  return closebutton;
  }
  @FindBy(xpath="//td[text()='Parameters']")
  private WebElement Parameters12;
  public WebElement Parameters12() {
	   return Parameters12;
  }
  @FindBy(xpath="//td[text()='System Parameters']")
  private WebElement SystemParameters;
  public WebElement SystemParameters() {
	   return SystemParameters;
}
  @FindBy(xpath="//td[text()='Safebox Parameters']")
  private WebElement safeboxparam;
  public WebElement safeboxparam() {
	  return safeboxparam;
  }
  @FindBy(xpath="//td[text()='Safebox Charges']")
  private WebElement SafeBoxCharges;
  public WebElement SafeBoxCharges() {
	  return SafeBoxCharges;
  }
  @FindBy(xpath="//span[text()='Maintenance']")
  private WebElement Maintenancebutton12;
  public WebElement Maintenancebutton12() {
  	return Maintenancebutton12;
  }
  @FindBy(xpath = "//input[@name='CODE']")
  private WebElement Safeboxfee;
  public WebElement Safeboxfee() {
	   return Safeboxfee;
  }
  @FindBy(xpath="(//td[text()='Small Safebox Fee'])[2]")
  private WebElement SmallBoxFee;
  public WebElement SmallBoxFee() {
	  return SmallBoxFee;
  }
  @FindBy(xpath="(//label[text()='CIF Types Charges '])[2]")
  private WebElement CIFTypesCharges;
  public WebElement CIFTypesCharges() {
	  return CIFTypesCharges;
  }
}