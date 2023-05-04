package pageobjects.CSM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SMSSubScription {
	WebDriver driver;

	public SMSSubScription(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}
	@FindBy(id="_selenuimSMS00")
	private WebElement SMSSubscription;
	public WebElement SMSSubscription() {
		return SMSSubscription;
	}
	@FindBy(id="SMS00MT")
	private WebElement SMSSubscription_Maintenance;
	public WebElement SMSSubscription_Maintenance() {
		return SMSSubscription_Maintenance;
	}
	@FindBy(id="lookuptxt_subCif_SMS00MT")
	private WebElement SMSSubscription_CIFField;
	public WebElement SMSSubscription_CIFField() {
		return SMSSubscription_CIFField;
	}
	@FindBy(id="spanLookup_subCif_SMS00MT")
	private WebElement SMSSubscription_CIFSearchIcon;
	public WebElement SMSSubscription_CIFSearchIcon() {
		return SMSSubscription_CIFSearchIcon;
	}
	@FindBy(id="mobileNo_SMS00MT")
	private WebElement SMSSubscription_MobileNoField;
	public WebElement SMSSubscription_MobileNoField() {
		return SMSSubscription_MobileNoField;
	}
	@FindBy(id="add_smsSubscriptionDetailsGrid_Id_SMS00MT")
	private WebElement SMSSubscription_AddNewRowIcon;
	public WebElement SMSSubscription_AddNewRowIcon() {
		return SMSSubscription_AddNewRowIcon;
	}
	@FindBy(id="new_1680603286342_smsSubscriptionVO.SERVICE_CODE_lookuptxt_smsSubscriptionDetailsGrid_Id_SMS00MT")
	private WebElement SMSSubscription_ServiceCodeField;
	public WebElement SMSSubscription_ServiceCodeField() {
		return SMSSubscription_ServiceCodeField;
	}
	@FindBy(id="new_1680604310049_smsSubscriptionVO.SERVICE_CODE_spanLookup_smsSubscriptionDetailsGrid_Id_SMS00MT")
	private WebElement SMSSubscription_ServiceCodeSearchIcon;
	public WebElement SMSSubscription_ServiceCodeSearchIcon() {
		return SMSSubscription_ServiceCodeSearchIcon;
	}
	@FindBy(id="smsSubscriptionMaint_saveNew_SMS00MT")
	private WebElement SMSSubscription_SaveIcon;
	public WebElement SMSSubscription_SaveIcon() {
		return SMSSubscription_SaveIcon;
	}
	
			
}
