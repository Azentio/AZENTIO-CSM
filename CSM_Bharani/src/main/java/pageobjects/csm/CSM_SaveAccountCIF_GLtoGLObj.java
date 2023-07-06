package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_SaveAccountCIF_GLtoGLObj {
	
	WebDriver driver;
	public CSM_SaveAccountCIF_GLtoGLObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//td[text()='Transfer Accounts']")
	private WebElement TransfterAccountFlag;
	public WebElement TransferAccount_Flag() {
		return TransfterAccountFlag;
	}
	@FindBy(xpath = "//span[text()=\"Maintenance\"]")
	private WebElement MaintenanceFlag;
	public WebElement MaintenanceFlag_Flag() {
		return MaintenanceFlag;
	}
	@FindBy(xpath="//select[@id=\"transferTypeId_TA001MT\"]")
	private WebElement TransferTypeSelect;
	public WebElement TransferType_Select() {
		return TransferTypeSelect;
	}
    @FindBy(xpath="//input[@id='rangeDef_TA001MTC']")
    private WebElement RangeDefinitionByCIF;
    public WebElement RangeDefinition_ByCIF() {
    	return RangeDefinitionByCIF;
    }
    @FindBy(xpath="//input[@id='lookuptxt_original_CIF_TA001MT']")
    private WebElement CIFTypeEnter;
    public WebElement CIFType_Enter() {
		return CIFTypeEnter;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_original_gl_TA001MT']")
	private WebElement OriginalGLEnter;
	public WebElement OriginalGL_Enter() {
		return OriginalGLEnter;
	}
	@FindBy(xpath="//input[@id='lookuptxt_destination_gl_TA001MT']")
	private WebElement DestinationGLEnter;
	public WebElement DestinationGL_Enter() {
		return DestinationGLEnter;
	}
	@FindBy(xpath="//input[@id='lookuptxt_statusReasonCode_TA001MT']")
	private WebElement ReasonCode;
	public WebElement Reason_Code() {
		return ReasonCode;
	}
	@FindBy(xpath="//label[text()=\"Retrieve \"]")
	private WebElement RetriveIcon;
	public WebElement Retirbe_Icon() {
		return RetriveIcon;
	}
	@FindBy(xpath="//label[text()='Save ']")
	private WebElement SaveButtonRetrieve;
	public WebElement SaveButton_Retrieve() {
		return SaveButtonRetrieve;
	}
	
	@FindBy(xpath="//*[@id='_popup_path_sol_ok']")
	private WebElement CSM_serverloadingPopup;
	public WebElement CSM_serverloadingPopup() {
		return CSM_serverloadingPopup;
	}
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement ApproveFlag;
	public WebElement Approve_Flag() {
		return ApproveFlag;
	}
	@FindBy(xpath="//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.DESTINATION_GL']")
	private WebElement ApproveDestinationGLGrid;
	public WebElement ApproveDestination_GLGrid() {
		return ApproveDestinationGLGrid;
	}
	@FindBy(xpath="//td[@id='td_transferAccountsListGridTbl_Id_TA001P_1_cts_TRSFR_ACCVO.DESTINATION_GL']")
	private WebElement DestinationGlSelect;
	public WebElement DestinationGL_Select() {
		return DestinationGlSelect;
	}
	@FindBy(xpath="//label[text()='Reject ']")
	private WebElement RejectIcon;
	public WebElement Reject_Icon() {
		return RejectIcon;
	}
	@FindBy(xpath="//input[@id=\"rangeDef_TA001MTG\"]")
	private WebElement RangeDefinitionByGL;
	public WebElement RangeDefinitionBy_GL() {
		return RangeDefinitionByGL;
	}
	
	
}
