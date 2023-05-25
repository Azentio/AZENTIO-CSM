package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransStaffAccPopulateUser {
	WebDriver driver;
	public TransStaffAccPopulateUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement ParametersFlag;
	public WebElement Parameters_Flag() {
		return ParametersFlag;
	}
	@FindBy(xpath="//td[text()='System Parameters']")
	private WebElement ParamSystemParam;
	public WebElement Param_SystemParam() {
		return ParamSystemParam;
	}
	@FindBy(xpath="//td[text()='User']")
	private WebElement SystemParamUser;
	public WebElement SystemParam_User() {
		return SystemParamUser;
	}
	@FindBy(xpath="//td[text()='Populate User']")
	private WebElement UserPopulateUser;
	public WebElement User_PopulateUser() {
		return UserPopulateUser;
	}
	@FindBy(xpath="(//span[text()='Maintenance'])[2]")
	private WebElement PopulateUserMaintenance;
	public WebElement PopulateUser_Maintenance() {
		return PopulateUserMaintenance;
	}
	@FindBy(xpath="//input[@id='teller_population_code_E000POMT']")
	private WebElement MaintenanceCodeBox;
	public WebElement Maintenance_CodeBox() {
		return MaintenanceCodeBox;
	}
	@FindBy(xpath="//input[@id='brief_name_eng_E000POMT']")
	private WebElement MaintenanceBriefDes;
	public WebElement Maintenance_BreifDes() {
		return MaintenanceBriefDes;
	}
	@FindBy(xpath="//input[@id='long_name_eng_E000POMT']")
	private WebElement MaintenanceLongDes;
	public WebElement Maintenance_LongDes() {
		return MaintenanceLongDes;
	}
	@FindBy(xpath="//input[@id='brief_name_arab_E000POMT']")
	private WebElement BreifDesArabic;
	public WebElement BreiefDes_Arabic() {
		return BreifDesArabic;
	}
	@FindBy(xpath="//input[@id='long_name_arab_E000POMT']")
	private WebElement LongDesArabic;
	public WebElement LongDes_Arabic() {
		return LongDesArabic;
	}
	@FindBy(xpath="//input[@id='lookuptxt_teller_code_E000POMT']")
	private WebElement UserCode;
	public WebElement User_Code() {
		return UserCode;
	}
	@FindBy(xpath="//span[@id='spanLookup_teller_code_E000POMT']")
	private WebElement UsercodeSearchIcon;
	public WebElement UserCode_SearchIcon() {
		return UsercodeSearchIcon;
	}
	@FindBy(xpath="//td[@id='add_tab2_GridTbl_Id_E000POMT']")
	private WebElement DestinationBranchesAddIcon;
	public WebElement DestinationBranches_AddIcon() {
		return DestinationBranchesAddIcon;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstellerPopulateBranchesVO.DESTINATION_BRANCH_CODE']")
	private WebElement AddIconBranchCode;
	public WebElement AddIcon_BranchCode() {
		return AddIconBranchCode;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstellerPopulateBranchesVO.TMPL_CODE']")
	private WebElement AddIconNewUserTemp;
	public WebElement AddIcon_NewUserTemp() {
		return AddIconNewUserTemp;
	}
	@FindBy(xpath="//label[@id='populateTellerMaint_FormId_E000POMT_Save_key']")
	private WebElement MaintenanceSaveIcon;
	public WebElement Maintenance_SaveIcon() {
		return MaintenanceSaveIcon;
	}
	@FindBy(xpath="//span[text()='Populate']")
	private WebElement PopulateUserPopulateFlag;
	public WebElement PopulateUser_PopulateFlag() {
		return PopulateUserPopulateFlag;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement OkPopupMaintenance;
	public WebElement OkPopup_Maitenance() {
		return OkPopupMaintenance;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement OkPopupSuccessScreenMaintenance;
	public WebElement OkPopup_SuccessScreenMaintenance() {
		return OkPopupSuccessScreenMaintenance;
	}
	@FindBy(xpath="//span[text()='Populate']")
	private WebElement PopulateFlagPopulateUser;
	public WebElement PopulateFlag_PopulateUser() {
		return PopulateFlagPopulateUser;
	}
    @FindBy(xpath="//input[@id='populateTellerList_GridTbl_Id_E000POPO_gs_ctstellerPopulateVO.TELLER_POPULATION_CODE']")
    private WebElement PopulateFlagCode;
    public WebElement Populate_FlagCode() {
    	return PopulateFlagCode;
    }
	@FindBy(xpath="(//span[text()='Approve'])[2]")
	private WebElement PopulateFlagApprove;
	public WebElement PopulateFlag_Approve() {
		return PopulateFlagApprove;
	}
	@FindBy(xpath="//input[@id='populateTellerList_GridTbl_Id_E000POP_gs_ctstellerPopulateVO.TELLER_POPULATION_CODE']")
	private WebElement ApproveCode;
	public WebElement Approve_Code() {
		return ApproveCode;
	}
	@FindBy(xpath="//td[@id='td_populateTellerList_GridTbl_Id_E000POP_1_ENTITY_DESC']")
	private WebElement ApproveCodeCreated;
	public WebElement ApproveCode_Created() {
		return ApproveCodeCreated;
	}
	@FindBy(xpath="//label[contains(text(),'Approve ')]//ancestor::button")
	private WebElement ApproveCodeApprove;
	public WebElement ApproveCode_Approve() {
		return ApproveCodeApprove;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement ApproveOkPopup;
	public WebElement Approve_OkPopup() {
		return ApproveOkPopup;
	}
	@FindBy(xpath="//td[text()='Approved']")
	private WebElement ApprovedText;
	public WebElement Approved_Text() {
		return ApprovedText;
	}
	@FindBy(xpath="//label[text()='Populate ']")
	private WebElement ApproveIconPopulate;
	public WebElement ApproveIcon_Populate() {
		return ApproveIconPopulate;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement okpopupForPopulateScreen;
	public WebElement okpopup_ForPopulateScreen() {
		return okpopupForPopulateScreen;
	}
	
	
	
	
    }
	


