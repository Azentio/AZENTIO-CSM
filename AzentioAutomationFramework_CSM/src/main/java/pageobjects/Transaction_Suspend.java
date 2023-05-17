package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction_Suspend {
	WebDriver driver;
	public Transaction_Suspend(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//td[text()='Parameters']")
	  private WebElement Parameters12;
	  public WebElement Parameters12() {
		   return Parameters12;
	  }
	  @FindBy(xpath="//td[text()='System Parameters']")
	  private WebElement SystemParameters;
	  public WebElement SystemParameters() {
		   return SystemParameters;
	}
	@FindBy(xpath="//td[text()='User']") 
	private WebElement User_Transaction;
	public WebElement User_Transaction() {
		return User_Transaction;
	}
	@FindBy(xpath="//span[text()='Update after Approve']") 
	private WebElement UpdateafterApprove_Transaction;
	public WebElement UpdateafterApprove_Transaction() {
		return UpdateafterApprove_Transaction;
	}
	@FindBy(xpath="//a[@id='infoBarSearchButton_E000MA']")
	private WebElement SearchButton_transaction;
	public WebElement SearchButton_transaction() {
		return SearchButton_transaction;
	}
	@FindBy(xpath="(//input[@name='USER_ID'])[1]")
	private WebElement UserId_transaction;
	public WebElement UserId_transaction() {
		return UserId_transaction;
	}
	@FindBy(xpath="//td[text()='Populate User']")
	private WebElement PopulateUser_Transaction;
	public WebElement PopulateUser_Transaction() {
		return PopulateUser_Transaction;
	}
	@FindBy(xpath="(//span[text()='Maintenance'])[2]")
     private WebElement Maintenance_transaction;
	 public WebElement Maintenance_transaction() {
		 return Maintenance_transaction;
	 }
	 @FindBy(xpath="//input[@name='TELLER_POPULATION_CODE']")
	 private WebElement Populationcode_Transaction;
	 public WebElement Populationcode_Transaction() {
		 return Populationcode_Transaction;
	 }
	 @FindBy(xpath="//input[@id='susp_usr_log_br_yn_E000POMT']")
	 private WebElement Suspend_transaction;
	 public WebElement Suspend_transaction() {
		 return Suspend_transaction;
	 }
@FindBy(xpath="//label[text()='Update ']")
private WebElement Update_Transaction;
public WebElement Update_Transaction() {
	return Update_Transaction;
}
@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
private WebElement popup_msg;
public WebElement popup_msg() {
	return popup_msg;
}
}
