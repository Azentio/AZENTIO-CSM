package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_ChequebookChargesObj {
	
	WebDriver driver;
	public CSM_ChequebookChargesObj (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//td[text()='Chequebook Request']")
	private WebElement  chequebookrequest_flag;
	public WebElement chequebookrequest_flag() {
		return chequebookrequest_flag;
	}
	@FindBy(xpath="//a[@id='Q000MT']")
	private WebElement  chequebookrequest_flag_maintenance;
	public WebElement chequebookrequest_flag_maintenance() {
		return chequebookrequest_flag_maintenance;
	}
	
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.NUM_OF_CHQBOOKS']")
	private WebElement noOfChequeBooks;
	public WebElement noOfChequeBooks() {
		return noOfChequeBooks;
	}
	
	@FindBy(id="lookuptxt_CHEQUE_CODE_Q000MT")
	private WebElement chequeBookCreation_chequeCode;
	public WebElement chequeBookCreation_chequeCode() {
		return chequeBookCreation_chequeCode;
	}
	
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBookCreation_BranchCode;
	public WebElement chequeBookCreation_BranchCode() {
		return chequeBookCreation_BranchCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBookCreation_CurrencyCode;
	public WebElement chequeBookCreation_CurrencyCode() {
		return chequeBookCreation_CurrencyCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBookCreation_GlCode;
	public WebElement chequeBookCreation_GlCode() {
		return chequeBookCreation_GlCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBookCreation_CifCode;
	public WebElement chequeBookCreation_CifCode() {
		return chequeBookCreation_CifCode;
	}
	
	@FindBy(id="lookuptxt_acc_sl_Q000MT")
	private WebElement chequeBookCreation_SerialNo;
	public WebElement chequeBookCreation_SerialNo() {
		return chequeBookCreation_SerialNo;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000MT_btn_save")
	private WebElement chequeBookCreation_Save;
	public WebElement chequeBookCreation_Save() {
		return chequeBookCreation_Save;
	}
	@FindBy(id="lookuptxt_acc_sl_Q000MT")
	private WebElement chequeBookCreation_charges_btn;
	public WebElement chequeBookCreation_charges_btn() {
		return chequeBookCreation_charges_btn;
	}
	
}
