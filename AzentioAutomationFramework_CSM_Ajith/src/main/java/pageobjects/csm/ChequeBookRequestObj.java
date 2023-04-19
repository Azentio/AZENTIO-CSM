package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequeBookRequestObj {
	WebDriver driver;
	public ChequeBookRequestObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Q000SP")
	private WebElement suspendScreen;
	public WebElement suspendScreen() {
		return suspendScreen;
	}
	@FindBy(xpath = "//td[text()='Chequebook Request']/preceding-sibling::td/span")
	private WebElement chequebookRequestModule;

	public WebElement chequebookRequestModule() {
		return chequebookRequestModule;
	}
	
	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement suspendSearchCheuqueCode;

	public WebElement suspendSearchCheuqueCode() {
		return suspendSearchCheuqueCode;
	}
	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000SP_1_ctschqbookVO.CODE']")
	private WebElement suspendSelectCheuqueCode;

	public WebElement suspendSelectCheuqueCode() {
		return suspendSelectCheuqueCode;
	}
	@FindBy(id="chequeBookDefFormId_Q000SP_suspend_key")
	private WebElement suspendButton;
	public WebElement suspendButton() {
		return suspendButton;
	}
	@FindBy(xpath="(//span[text()='Maintenance'])[1]")
	private WebElement MaintenanceIcon;
	public WebElement MaintenanceIcon() {
		return MaintenanceIcon;
	}
	//CB--->ChequeBook
	@FindBy(id="infoBarSearchButton_Q000MT")
	private WebElement searchButtonInCBMaintenance;
	public WebElement searchButtonInCBMaintenance() {
		return searchButtonInCBMaintenance;
	}
	@FindBy(id="search_chequeBookGridTbl_Id_Q000MT")
	private WebElement searchChequeBookGridInCBMaintenance;
	public WebElement searchChequeBookGridInCBMaintenance() {
		return searchChequeBookGridInCBMaintenance;
	}
	@FindBy(id="jqg2")
	private WebElement searchChequeBookCodeInCBMaintenance;
	public WebElement searchChequeBookCodeInCBMaintenance() {
		return searchChequeBookCodeInCBMaintenance;
	}
	
	@FindBy(id="fbox_chequeBookGridTbl_Id_Q000MT_search")
	private WebElement findButtonInCBMaintenance;
	public WebElement findButtonInCBMaintenance() {
		return findButtonInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='Suspended']")
	private WebElement suspendRecordValidationInCBMaintenance;
	public WebElement suspendRecordValidationInCBMaintenance() {
		return suspendRecordValidationInCBMaintenance;
	}
	
	@FindBy(id="Q000MT")
	private WebElement CBMaintenanceScreen;
	public WebElement CBMaintenanceScreen() {
		return CBMaintenanceScreen;
	}
	
	@FindBy(xpath="//span[text()='close']")
	private WebElement viewMemoPopupClose;
	public WebElement viewMemoPopupClose() {
		return viewMemoPopupClose;
	}
}
