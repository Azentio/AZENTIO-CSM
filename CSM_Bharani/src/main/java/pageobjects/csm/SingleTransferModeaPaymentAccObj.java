package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleTransferModeaPaymentAccObj {
	WebDriver driver;
	public SingleTransferModeaPaymentAccObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Transaction Type']")
	private WebElement Transactiontypeflag;
	public WebElement Transactiontype_Flag() {
		return Transactiontypeflag;
	}
	@FindBy(xpath="//span[text()='Update After Approve']")
	private WebElement UpdateAfterApproveFlag;
	public WebElement UpdateAfter_ApproveFlag() {
		return UpdateAfterApproveFlag;
	}
	@FindBy(xpath="//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement CodeGridBoxUpdateAfterAprove;
	public WebElement CodeGridBox_UpdateAfterApprove() {
		return CodeGridBoxUpdateAfterAprove;
	}
	@FindBy(xpath="//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement CodeGridBoxClick;
	public WebElement CodeGridBox_Click() {
		return CodeGridBoxClick;
	}

}
