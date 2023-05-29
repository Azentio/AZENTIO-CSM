package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Chequebook_expiredwarnproceedObj {
	
	WebDriver driver;
	public CSM_Chequebook_expiredwarnproceedObj(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(id="hdr_runn_date")
private WebElement CSM_date_click;
public WebElement CSMdateclick() {
	return CSM_date_click;
}

@FindBy(xpath="(//div[@class='dateCompDiv']//input)[1]")
private WebElement CSM_dateclear_exchangedate;
public WebElement CSMdateclearexchangedate() {
return CSM_dateclear_exchangedate;
}

@FindBy(xpath="(//button[@type='button'])[1]")
private WebElement CSM_datechange_usebtn;
public WebElement CSMdatechangeusebtn() {
return CSM_datechange_usebtn;
}
//@FindBy(id="_popup_path_sol_confirm_ok")
//private WebElement CSM_date_usebtn_popok;
//public WebElement CSMdateusebtnpopok() {
//return CSM_date_usebtn_popok;
//}
@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_datechange_usebtn_informok;
public WebElement CSMdatechangeusebtninformok() {
return CSM_datechange_usebtn_informok;
}
@FindBy(xpath="//button[@id='_header_rundate_dialog_close']")
private WebElement CSM_dateMenu_close;
public WebElement CSMdateMenuclose() {
return CSM_dateMenu_close;
}

@FindBy(xpath="//td[text()='Chequebook Request']")
private WebElement  CSM_chequebookrequestflag;
public WebElement CSMchequebookrequestflag() {
	return CSM_chequebookrequestflag;
}

	@FindBy(id="Q000MT")
	private WebElement  CSM_chequebookrequest_flag_maintenance;
	public WebElement CSMchequebookrequestflagmaintenance() {
		return CSM_chequebookrequest_flag_maintenance;
	}
	
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.NUM_OF_CHQBOOKS']")
	private WebElement CSM_noOfChequeBooks;
	public WebElement CSMnoOfChequeBooks() {
		return CSM_noOfChequeBooks;
	}

	@FindBy(id="lookuptxt_CHEQUE_CODE_Q000MT")
	private WebElement CSM_Chequecode;
	public WebElement CSMChequecode() {
		return CSM_Chequecode;
	}


	@FindBy(id="lookuptxt_leaves_code_Q000MT")
	private WebElement CSM_leavesclick;
	public WebElement CSMleavesclick() {
		return CSM_leavesclick;
	}
	
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement CSM_branchcode;
	public WebElement CSMbranchcode() {
		return CSM_branchcode;
	}

	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement CSM_Curencycode;
	public WebElement CSMCurencycode() {
		return CSM_Curencycode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement CSM_Gl;
	public WebElement CSMGl() {
		return CSM_Gl;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement CSM_Cif;
	public WebElement CSMCif() {
		return CSM_Cif;
	}
	
	
	@FindBy(id="lookuptxt_acc_sl_Q000MT")
	private WebElement CSM_serialno;
	public WebElement CSMserialno() {
		return CSM_serialno;
	}
		
	@FindBy(xpath="//span[text()='Charges']")
	private WebElement CSM_Charges;
	public WebElement CSMCharges() {
		return CSM_Charges;
	}
	@FindBy(xpath="//label[text()='Save ']")
	private WebElement CSM_Savebtn;
	public WebElement CSM_Savebtn() {
		return CSM_Savebtn;
	}
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_warningmsg;
	public WebElement CSMwarningmsg() {
		return CSM_warningmsg;
	}
	@FindBy(xpath="//a[@class='ui-dialog-titlebar-close ui-corner-all']")
	private WebElement CSM_Alertokbtn;
	public WebElement CSMAlertokbtn() {
		return CSM_Alertokbtn;
	}
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement CSM_approve_flag;
	public WebElement CSMapproveflag() {
		return CSM_approve_flag;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement CSM_approve_flag_chequecode;
	public WebElement CSMapproveflagchequecode() {
		return CSM_approve_flag_chequecode;
	}
	
	@FindBy(xpath="//label[text()='Approve ']")
	private WebElement CSM_approve_flag_chequecode_Approve_btn;
	public WebElement CSMapproveflagchequecodeApprovebtn() {
		return CSM_approve_flag_chequecode_Approve_btn;
	}
	
		
	
}
