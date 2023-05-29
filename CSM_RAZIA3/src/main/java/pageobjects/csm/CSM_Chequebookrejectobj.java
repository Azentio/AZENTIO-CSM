package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Chequebookrejectobj {
	WebDriver driver;
	public CSM_Chequebookrejectobj (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(xpath="//td[text()='Chequebook Request']")
private WebElement CSM_ChequebookRequest_flag;
public WebElement CSM_ChequebookRequest_flag() {
	return CSM_ChequebookRequest_flag;
}

@FindBy(xpath="//span[text()='Approve Cancel']")
private WebElement CSM_ChequebookRequest_Approvecancel;
public WebElement CSM_ChequebookRequest_Approvecancel() {
	return CSM_ChequebookRequest_Approvecancel;
}
@FindBy(xpath="//input[@name='CODE']")
private WebElement CSM_ChequebookRequest_Approvecancel_Code;
public WebElement CSM_ChequebookRequest_Approvecancel_Code() {
	return CSM_ChequebookRequest_Approvecancel_Code;
}

@FindBy(xpath="//td[text()='To be Cancelled']")
private WebElement CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab;
public WebElement CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab() {
	return CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab;
}
@FindBy(xpath="//textarea[@id='status_remarks_Q000AC']")
private WebElement CSM_ChequebookRequest_Approvecancel_Reason;
public WebElement CSM_ChequebookRequest_Approvecancel_Reason() {
	return CSM_ChequebookRequest_Approvecancel_Reason;
}

@FindBy(id="chequeBook_reject_Q000AC")
private WebElement CSM_ChequebookRequest_Approvecancel_Reject;
public WebElement CSM_ChequebookRequest_Approvecancel_Reject() {
	return CSM_ChequebookRequest_Approvecancel_Reject;
}


}
