package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionAlertDE {
	WebDriver driver;
    public TransactionAlertDE(WebDriver driver) {
   	 this.driver=driver;
   	 PageFactory.initElements(driver, this);
            }

	@FindBy(id="trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeINdebitAc;

	public WebElement CSM_BranchCodeINdebitAc() {
		return CSM_BranchCodeINdebitAc;
	}
	
	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodedebitAc;

	public WebElement CSM_CurrencyCodedebitAc() {
		return CSM_CurrencyCodedebitAc;
	}
	
	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement CSM_GLCodedebitAc;

	public WebElement CSM_GLCodedebitAc() {
		return CSM_GLCodedebitAc;
	}
	
	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc;

	public WebElement CSM_CIFCodeIndebitAc() {
		return CSM_CIFCodeIndebitAc;
	}
	
	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc;
	public WebElement CSM_SerialIndebitAc() {
		return CSM_SerialIndebitAc;
	}
	@FindBy(id="hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;

	public WebElement CSMDateToChangeTheCurrentDate() {
		return CSM_DateToChangeTheCurrentDate;
	}
	
	@FindBy(id="global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;

	public WebElement CSMDateInUserRunningDate() {
		return CSM_DateInUserRunningDate;
	}
	
	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate;

	public WebElement CSMUseButtonInChangeRunningDate() {
		return CSM_UseButtonInChangeRunningDate;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
		return CSM_ClearCacheInTechnicalDetailsIcon;

	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu() {
		return CSM_OkButtonInInformationPopUpMenu;
	}
	
	@FindBy(id="_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;

	public WebElement CSMCloseButtonInChangeRunningDate() {
		return CSM_CloseButtonInChangeRunningDate;
	}
	
	@FindBy(id="tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon;

	public WebElement CSMTechnicalDetailsIcon() {
		return CSM_TechnicalDetailsIcon;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp;

	public WebElement CSMOkButtonUnderInformationPopUp() {
		return CSM_OkButtonUnderInformationPopUp;
	}
	
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu() {
		return CSM_TransactionsMainMenu;
	}
	
	@FindBy(id="D001MT")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions() {
		return CSM_MaintenanceUnderTransactions;
	}
	
	@FindBy(id="lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen() {
		return CSM_TRXTypeInMaintenanceScreen;
	}
    
}
