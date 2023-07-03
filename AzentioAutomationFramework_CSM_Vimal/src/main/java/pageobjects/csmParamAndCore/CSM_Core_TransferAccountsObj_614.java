package pageobjects.csmParamAndCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Core_TransferAccountsObj_614 {

	WebDriver driver;

	public CSM_Core_TransferAccountsObj_614(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Transfer Accounts']")
	private WebElement CSMCore_TransferAccountsButton;
	public WebElement CSMCoreTransferAccountsButton() {
		return CSMCore_TransferAccountsButton;
	}
	
	
	@FindBy(xpath = "//*[@id='TA001MT']")
	private WebElement CSMCore_Maintenance_TA;
	public WebElement CSMCoreMaintenance_TA() {
		return CSMCore_Maintenance_TA;
	}
	
	
	@FindBy(xpath = "//*[@id='lookuptxt_from_acc_add_ref_TA001MT']")
	private WebElement CSMCore_FromAccountReferenceNo_Maintenance_TA;
	public WebElement CSMCoreFromAccountReferenceNo_Maintenance_TA() {
		return CSMCore_FromAccountReferenceNo_Maintenance_TA;
	}
	
	@FindBy(xpath = "//*[@id='lookuptxt_to_acc_add_ref_TA001MT']")
	private WebElement CSMCore_ToAccountReferenceNo_Maintenance_TA;
	public WebElement CSMCoreToAccountReferenceNo_Maintenance_TA() {
		return CSMCore_ToAccountReferenceNo_Maintenance_TA;
	}
	
	@FindBy(xpath = "//select[@name='transferAccountsCO.cts_TRSFR_ACCVO.TRANSFER_TYPE']")
	private WebElement CSMCore_TransferTypeDropDown_Maintenance_TA;
	public WebElement CSMCoreTransferTypeDropDown_Maintenance_TA() {
		return CSMCore_TransferTypeDropDown_Maintenance_TA;
	}
	
	public String BranchToBranch_TransferTypeDropDown_Maintenance_TA = "From Branch To Branch";
	
	public String GLToGL_TransferTypeDropDown_Maintenance_TA = "From GL To GL";
	
	@FindBy(xpath = "//input[@id='lookuptxt_statusReasonCode_TA001MT']")
	private WebElement CSMCore_ReasonField_Maintenance_TA;
	public WebElement CSMCoreReasonField_Maintenance_TA() {
		return CSMCore_ReasonField_Maintenance_TA;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dest_branch_TA001MT']")
	private WebElement CSMCore_DestinationBranch_Maintenance_TA;
	public WebElement CSMCoreDestinationBranch_Maintenance_TA() {
		return CSMCore_DestinationBranch_Maintenance_TA;
	}
	
	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001MT_retrieve_key']")
	private WebElement CSMCore_Retrievebutton_Maintenance_TA;
	public WebElement CSMCoreRetrievebutton_Maintenance_TA() {
		return CSMCore_Retrievebutton_Maintenance_TA;
	}
	
	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001MT_set_exceptions_key']")
	private WebElement CSMCore_SetExceptionsButton_Maintenance_TA;
	public WebElement CSMCoreSetExceptionsButton_Maintenance_TA() {
		return CSMCore_SetExceptionsButton_Maintenance_TA;
	}
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement CSMCore_ChooseFileButton_Maintenance_TA;
	public WebElement CSMCoreChooseFileButton_Maintenance_TA() {
		return CSMCore_ChooseFileButton_Maintenance_TA;
	}
	
	//div[@id='div__popup_path_sol_ok']//*[text()='ERROR'] - Error popup
	
	//input[@id='_popup_path_sol_ok'] - Error popup ok button
	
	
	
	
	

}
