package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SMS_productCW {
     WebDriver driver;
     public SMS_productCW(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(xpath="//td[text()='Sms Subscription']")
     private WebElement SMSsubscription;
     public WebElement SMSsubscription() {
    	 return SMSsubscription;
     }
     @FindBy(xpath="//span[text()='Maintenance']")
     private WebElement Maintenancebutton147;
     public WebElement Maintenancebutton147() {
    	 return Maintenancebutton147;
     }
     @FindBy(xpath="//input[@id='lookuptxt_subCif_SMS00MT']")
     private WebElement CIFNumber;
     public WebElement CIFNumber() {
    	 return CIFNumber;
     }
     @FindBy(xpath="//input[@id='mobileNo_SMS00MT']")
     private WebElement MobileNo;
     public WebElement MobileNo() {
    	 return MobileNo;
     }
     @FindBy(xpath="//span[text()='Deduct Charges']")
     private WebElement DeductCharges;
     public WebElement DeductCharges() {
    	 return DeductCharges;
     }
     @FindBy(xpath="//select[@id='deductCharges_SMS00MT']")
     private WebElement DeductChargesBycash;
     public WebElement DeductChargesBycash() {
    	 return DeductChargesBycash;
     }
     @FindBy(xpath="//td[text()='Sms Subscription Template']")
     private WebElement SmsSubscriptionTemplate;
     public WebElement SmsSubscriptionTemplate() {
    	 return SmsSubscriptionTemplate;
     }
     @FindBy(xpath="//input[@name='CODE']")
     private  WebElement codebox;
     public WebElement codebox() {
    	 return codebox;
     }
     @FindBy(xpath="//td[text()='Exceed Limit']")
     private WebElement Exceedlimit;
     public WebElement Exceedlimit() {
    	 return Exceedlimit;
     }
     @FindBy(xpath="//span[text()='Update After Approve']")
     private WebElement UpdateAfter;
     public WebElement UpdateAfter() {
    	 return UpdateAfter;
     }
     @FindBy(xpath="//span[text()='Update After Approve']")
     private WebElement UpdateAftersubmit;
     public WebElement UpdateAftersubmit() {
    	 return UpdateAftersubmit;
     }
     @FindBy(xpath="//td[@id='add_smsSubscriptionDetailsGrid_Id_SMS00MT']")
     private WebElement SMSSubscription_puls;
     public WebElement SMSSubscription_puls() {
    	 return SMSSubscription_puls;
     }
     @FindBy(xpath="//input[@name='lookupTxt_smsSubscriptionVO.SERVICE_CODE']")
     private WebElement Servicecode_SMS;
     public WebElement Servicecode_SMS() {
    	 return Servicecode_SMS;
     }
     @FindBy(xpath="//label[@id='smsSubscriptionMaintFormId_SMS00MT_Save_key']") 
     private WebElement Savebutton_SMS;
     public WebElement Savebutton_SMS() {
    	 return Savebutton_SMS;
     }
}
