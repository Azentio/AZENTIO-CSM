package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction_Reverse {
   WebDriver driver;
   public Transaction_Reverse(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//td[text()='Transactions']")
   private WebElement Transaction_CSM;
   public WebElement Transaction_CSM() {
	   return Transaction_CSM;
	}
   @FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001WV_1_ctstrsVO.COMP_CODE']")
   private WebElement Transaction_doubleclick;
   public WebElement Transaction_doubleclick() {
	   return Transaction_doubleclick;
   }
   @FindBy(xpath="//span[text()='Reverse']")
   private WebElement TransactionReverse_CSM;
   public WebElement TransactionReverse_CSM() {
	   return TransactionReverse_CSM;
   }
   @FindBy(xpath="//input[@name='TRS_NO']")
   private WebElement TransactionNumber_Reverse;
   public WebElement TransactionNumber_Reverse() {
	   return TransactionNumber_Reverse;
   }
   @FindBy(xpath="//select[@id='holdReason_D001WV']")
   private WebElement Transaction_ReasonId;
   public WebElement Transaction_ReasonId() {
	   return Transaction_ReasonId;
   }
   @FindBy(xpath="//button[@id='trxMgntToReverseBtn_D001WV']")
   private WebElement Transaction_ToReverse;
   public WebElement Transaction_ToReverse() {
	   return Transaction_ToReverse;
   }
   @FindBy(xpath="//span[text()='Approve Reverse']")
   private WebElement Transaction_ApproveReverse;
   public WebElement Transaction_ApproveReverse() {
	   return Transaction_ApproveReverse;
   }
   @FindBy(xpath="//button[@id='trxMgntReverseBtn_D001RV']")
   private WebElement Submit_ReverseButton;
   public WebElement Submit_ReverseButton() {
	   return Submit_ReverseButton;
   }
}
