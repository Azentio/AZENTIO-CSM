package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequebookReqBulkDestroyObj {
	WebDriver driver;
	public ChequebookReqBulkDestroyObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//td[text()='Chequebook Request']")
	private WebElement ChequebookRequestFlag;
	public WebElement ChequebookRequest_Flag() {
		return ChequebookRequestFlag;
	}
	@FindBy(xpath="//span[text()='Bulk Destroy']")
	private WebElement ChequebookRequestBulkDestroy;
	public WebElement ChequebookRequest_BulkDestroy() {
		return ChequebookRequestBulkDestroy;
	}
	@FindBy(xpath="//label[text()='Retrieve ']")
	private WebElement BulkDestroyRetrieve;
	public WebElement BulkDestroy_Retrieve() {
		return BulkDestroyRetrieve;
	}
	@FindBy(xpath="//input[@id='jqg_chequeBookBulkDestroyGridTbl_Id_Q000BTD_1']")
	private WebElement BulkDestroyFirstCheckbox;
	public WebElement BulkDestroy_FirstCheckbox() {
		return BulkDestroyFirstCheckbox;
	}
	@FindBy(xpath="//label[text()='To Destroy ']")
	private WebElement BulkDestroyToDestroy;
	public WebElement BulkDestroy_ToDestroy() {
		return BulkDestroyToDestroy;
	}
	@FindBy(xpath="//span[text()='Approve / Reject Bulk Destroy']")
	private WebElement ChequeBookApproveReject;
	public WebElement ChequeBook_ApproveReject() {
		return ChequeBookApproveReject;
	}
	@FindBy(xpath="//label[@id='chequeBookBulkDestoryFormId_Q000BAD_retrieve_key']")
	private WebElement ApproveRejectRetrieve;
	public WebElement ApproveReject_Retrieve() {
		return ApproveRejectRetrieve;
	}
	@FindBy(xpath="//label[text()='Destroy ']")
	private WebElement ApproveRejectToDestroy;
	public WebElement ApproveReject_ToDestroy() {
		return ApproveRejectToDestroy;
	}
	@FindBy(xpath="//td[@id='search_chequeBookBulkDestroyGridTbl_Id_Q000BAD']")
	private WebElement ApproveRejectSearchIcon;
	public WebElement ApproveReject_SearchIcon() {
	return ApproveRejectSearchIcon;
    }
	@FindBy(xpath="//input[@id='jqg5']")
	private WebElement ApproveRejectSearchBox;
	public WebElement ApproveReject_SearchBox() {
		return ApproveRejectSearchBox;
	}
	
}

