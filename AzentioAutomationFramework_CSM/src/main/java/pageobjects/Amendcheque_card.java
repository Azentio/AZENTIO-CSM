package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amendcheque_card {

	 WebDriver driver;
	 public Amendcheque_card(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	    @FindBy(xpath="//td[text()='Amend Cheque/Card status']")
	    private WebElement AmendChequeCard;
	    public WebElement AmendChequeCard() {
	    	return AmendChequeCard;
	    }
	    @FindBy(xpath="//span[text()='Maintenance']")
	    private WebElement Maintenancebutton;
	    public WebElement Maintenancebutton() {
	    	return Maintenancebutton;
	    }
	    @FindBy(xpath="//select[@id='product_type_QG001MT']")
	    private WebElement productType;
	    public WebElement productType() {
	    	return productType;
	    }
	    @FindBy(xpath="//input[@id='requestNo_QG001MT']")
	    private WebElement RequestNo;
	    public WebElement RequestNo() {
	    	return RequestNo;
	    }
	    @FindBy(xpath="//select[@id='check_status_type_QG001MT']")
	    private WebElement ChequeStatus;
	    public WebElement ChequeStatus() {
	    	return ChequeStatus;
	    }
	    @FindBy(xpath="//button[@id='retrieveBtn_QG001MT']")
	    private WebElement Retrieve;
	    public WebElement Retrieve() {
	    	return Retrieve;
	    }
	    @FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[3]")
		private WebElement BranchCode;
		public WebElement BranchCode()
		{
		return BranchCode;
		}
		@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[4]")
		private WebElement CurrencyCode;
		public WebElement CurrencyCode()
		{
		return CurrencyCode;
		}
		@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[5]")
		private WebElement GlCode;
		public WebElement Glcode()
		{
		return GlCode;
		}
		@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[6]")
		private WebElement CifCode;
		public WebElement CifCode()
		{
		return CifCode;
		}
		@FindBy(xpath="(//label[text()='Credit A/C ']/ancestor::td[1]//input)[7]")
		private WebElement SerialNo;
		public WebElement SerialNo()
		{
		return SerialNo;
		}
		@FindBy(xpath="//label[@id='amendChequeCardDefFormId_QG001MT_btn_update']") 
		private WebElement UpdateButton;
		public WebElement UpdateButton() {
			return UpdateButton;
		}
		@FindBy(xpath="//input[@id='cb_ammendChequeBookGridTbl_Id_QG001MT']")
		private WebElement iconbutton;
		public WebElement iconbutton() {
			return iconbutton;
		}
}
