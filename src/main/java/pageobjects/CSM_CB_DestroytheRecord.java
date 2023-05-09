package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_CB_DestroytheRecord {
	WebDriver driver;

	public CSM_CB_DestroytheRecord(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='_selenuimQ000']/h3/table/tbody/tr/td[1]/span/span")
	private WebElement csm_chequeBookRequest;
	
	public WebElement getCsm_chequeBookRequest() {
		return csm_chequeBookRequest;
	}
	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement CB_ToBeDestory;

	public WebElement getCsm_CB_ToBeDestoy() {
		return CB_ToBeDestory;
	}
	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement Tobedestory_searchcode_click;

	public WebElement getTobedestory_searchcode_click() {
		return Tobedestory_searchcode_click;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement Tobedestory_searchcode;

	public WebElement getCsm_CB_code() {
		return Tobedestory_searchcode;
	}

	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement searchcodeAfter_Approve;

	public WebElement getTobedestory_code() {
		return searchcodeAfter_Approve;
	}

	@FindBy(xpath = "//button[@id='chequeBook_toDestroy_Q000TD']")
	private WebElement ApproveAfter_ToDestroy;

	public WebElement getSearchcodeAfter_Approve() {
		return ApproveAfter_ToDestroy;
	}

	
	
	
}
