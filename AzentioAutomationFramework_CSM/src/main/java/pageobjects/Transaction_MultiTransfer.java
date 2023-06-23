package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction_MultiTransfer {
             WebDriver driver;
             public Transaction_MultiTransfer(WebDriver driver) {
            	 this.driver=driver;
            	 PageFactory.initElements(driver, this);
             }
             @FindBy(xpath="//td[text()='Transactions']")
         	private WebElement Transactions_Transactions;
         	public WebElement Transactions_Transactions()
         	{
         		return Transactions_Transactions;
         	}
         	@FindBy(xpath="//span[text()='Maintenance']")
         	private WebElement Transactions_MaintenanceScrn;
         	public WebElement Transactions_MaintenanceScrn()
         	{
         		return Transactions_MaintenanceScrn;
         	}
         	@FindBy(xpath="//input[@id='lookuptxt_trx_type_D001MT']")
         	private WebElement Transactions_Trxtypevalue;
         	public WebElement Transactions_Trxtypevalue()
         	{
         		return Transactions_Trxtypevalue;
         	}
         	@FindBy(xpath="//input[@id='trs_ac_br_D001MT']")
         	private WebElement Transactions_depositAcc_Branchcode;
         	public WebElement Transactions_depositAcc_Branchcode()
         	{
         		return Transactions_depositAcc_Branchcode;
         	}
         	
         	@FindBy(xpath="//input[@id='trs_ac_cy_D001MT']")
         	private WebElement Transactions_debitAcc_Currencycode;
         	public WebElement Transactions_debitAcc_Currencycode()
         	{
         		return Transactions_debitAcc_Currencycode;
         	}
         	@FindBy(xpath="//input[@id='trs_ac_gl_D001MT']")
         	private WebElement Transactions_debitAcc_Glcode;
         	public WebElement Transactions_debitAcc_Glcode()
         	{
         		return Transactions_debitAcc_Glcode;
         	}
         	@FindBy(xpath="//input[@id='trs_ac_cif_D001MT']")
         	private WebElement Transactions_debitAcc_Cifcode;
         	public WebElement Transactions_debitAcc_Cifcode()
         	{
         		return Transactions_debitAcc_Cifcode;
         	}
         	@FindBy(xpath="//input[@id='lookuptxt_trs_ac_sl_D001MT']")
         	private WebElement Transactions_debitAcc_serialcode;
         	public WebElement Transactions_debitAcc_serialcode()
         	{
         		return Transactions_debitAcc_serialcode;
         	}
         	@FindBy(xpath="//input[@id='lookuptxt_trs_cy_D001MT']")
         	private WebElement Transactions_debitAcc_currency;
         	public WebElement Transactions_debitAcc_currency()
         	{
         		return Transactions_debitAcc_currency;
         	}
         	
         	@FindBy(xpath="//input[@id='amount_D001MT']")
         	private WebElement Transactions_EnterAmount;
         	public WebElement Transactions_EnterAmount()
         	{
         		return Transactions_EnterAmount;
         	}
         	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
         	private WebElement Transactions_Warning_okbtn;
         	public WebElement Transactions_Warning_okbtn()
         	{
         		return Transactions_Warning_okbtn;
         	}	
         	@FindBy(xpath="//button[@id='trxMgntSaveBtn_D001MT']")
         	private WebElement Transactions_savebtn;
         	public WebElement Transactions_savebtn()
         	{
         		return Transactions_savebtn;
         	}
         	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
         	private WebElement Transactions_successokbtn;
         	public WebElement Transactions_successokbtn()
         	{
         		return Transactions_successokbtn;
         	}
         	@FindBy(xpath="//a[@id='D001AU']")
         	private WebElement Transactions_Approvescrn;
         	public WebElement Transactions_Approvescrn()
         	{
         		return Transactions_Approvescrn;
         	}
         	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
         	private WebElement Transactions_transactionNo_codeValue;
         	public WebElement Transactions_transactionNo_codeValue()
         	{
         		return Transactions_transactionNo_codeValue;
         	}
         	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
         	private WebElement Transactions_transactionNo_Doubleclk;
         	public WebElement Transactions_transactionNo_Doubleclk()
         	{
         		return Transactions_transactionNo_Doubleclk;
         	}	
         	@FindBy(xpath="//a[@id='infoBarSearchButton_D001MT']")
         	private WebElement Transactions_searchbtn;
         	public WebElement Transactions_searchbtn()
         	{
         		return Transactions_searchbtn;
         	}	
         	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
         	private WebElement Transactions_trxno_code;
         	public WebElement Transactions_trxno_code()
         	{
         		return Transactions_trxno_code;
         	}	
         	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
         	private WebElement Transactions_doubleclk_codevalue;
         	public WebElement Transactions_doubleclk_codevalue()
         	{
         		return Transactions_doubleclk_codevalue;
         	}	
         	@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
         	private WebElement Transactions_BookedEntries;
         	public WebElement Transactions_BookedEntries()
         	{
         		return Transactions_BookedEntries;
         	}
         	@FindBy(xpath="//td[text()='User']")
         	private WebElement submenu;
         	public WebElement submenu() {
         		return submenu;
         	}
}
