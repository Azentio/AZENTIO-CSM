package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemParamControlRec {
	WebDriver driver;
	SystemParamControlRec (WebDriver driver)
	
	{	
	this.driver=driver;
	PageFactory.initElements(driver, this);
     }
	
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement CSMParameter_Flag;
	public WebElement CSMparameter_Flag() {
		return CSMParameter_Flag;
	}
	@FindBy(xpath="//td[text()='System Parameters']")
	private WebElement Para_SystemParameter;
	public WebElement Para_System_Parameter() {
		return Para_SystemParameter;
	}
	@FindBy(xpath="//td[text()='Control Record']")
	private WebElement SystemParamControlRec;
	public WebElement SystemParam_ControlRec() {
		return SystemParamControlRec;
	}
	@FindBy(xpath="//span[text()='Update After Approve']")
	private WebElement ControlRecUpdateAfterApprove;
	public WebElement ControlRec_UpdateAfterApprove() {
		return ControlRecUpdateAfterApprove;
	}
	@FindBy(xpath="//a[@id='controlRecord_tab_OtherInfo_O001UP']")
	private WebElement UpdateAfterApproveOtherInfo;
	public WebElement UpdateAfterApprove_OtherInfo() {
		return UpdateAfterApproveOtherInfo;
	}
	@FindBy(xpath="//input[@id='stop_prod_proc_insuf_bal_yn_O001UP']")
	private WebElement OtherInfoStopProcessInsuffBal;
	public WebElement OtherInfo_StopProcessInsuffBal() {
		return OtherInfoStopProcessInsuffBal;
	}
	@FindBy(xpath="//label[text()='Update After Approve ']")
	private WebElement UpdateAfterApprove;
	public WebElement Update_AferApprove() {
		return UpdateAfterApprove;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement OkPopup;
	public WebElement Ok_Popup() {
		return OkPopup;
	}
	
	
	
	
	
	
	
}

