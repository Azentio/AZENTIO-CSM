package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingCashDepositAmountLowerLimitobj {
	
	WebDriver driver;
	
	public CheckingCashDepositAmountLowerLimitobj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='User']")
	private WebElement Userflag;
	public WebElement UserFlag_604() {
		return Userflag;
	}
	
	@FindBy(xpath="//span[text()='Update after Approve']")
	private WebElement UpdateafterApprove;
	public WebElement UpdateAfterApprove_604() {
		return UpdateafterApprove;
	}
	
	@FindBy(xpath="//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement Useridbox;
	public WebElement UserIDBox_604() {
		return Useridbox;
	}
	@FindBy(xpath="//td[text()='BHARANI']")
	private WebElement Bharaniacc;
	public WebElement BharaniAcc_604() {
		return Bharaniacc;
	}
	@FindBy(xpath="//span[text()=' CIF Types ']")
	private WebElement CIFtypes;
	public WebElement CIFTypes_604() {
		return CIFtypes;
	}
	@FindBy(xpath="//td[text()='9234']")
	private WebElement Codeno;
	public WebElement CodeNo_604() {
		return Codeno;
	}
	@FindBy(xpath="//td[@tdlabel='Brief Name' and text()='Test1899']/following-sibling::td[@tdlabel='Warn User If Limit Exceed']/input")
	private WebElement Warnusercheckbox;
	public WebElement WarnUserCheckBox_604() {
		return Warnusercheckbox;
	}
	@FindBy(xpath="//span[text()='Ok']")
	private WebElement Okbutton;
	public WebElement OkButton_604() {
		return Okbutton;
	}
	@FindBy(xpath="//label[text()='Update After Approve ']")
	private WebElement Updatesaveapprove;
	public WebElement UpdateSaveApprove_604() {
		return Updatesaveapprove;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Okpopupconfirm;
	public WebElement OkPopUpConfirm_604() {
		return Okpopupconfirm;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Okpopupfinal;
	public WebElement OkPopupFinal_604() {
		return Okpopupfinal;
	}
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement Approveflag;
	public WebElement ApproveFlag_604() {
		return Approveflag; 
	
	}
	@FindBy(xpath="//input[@id='tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID']")
	private WebElement Approveuserid;
	public WebElement ApproveUserId_604() {
		return Approveuserid;
	}
	@FindBy(xpath="//label[text()='Approve ']")
	private WebElement Approvebutton;
	public WebElement Approvebutton_604() {
		return Approvebutton;
	}
	
	
	
	

}
