package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_chequeBook {

	 WebDriver driver;
	 public Delete_chequeBook(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//td[text()='Chequebook Request']")
	    private WebElement Chequebook1;
	    public WebElement Chequebook1() {
	    	return Chequebook1;
	    }
	 @FindBy(xpath="//span[text()='To Be Destroyed']")
	 private WebElement Destroyed_cheque;
	 public WebElement Destroyed_cheque() {
		 return Destroyed_cheque;
	 }
	 @FindBy(xpath="//input[@name='CODE']")
	  private	WebElement Destroyed_code;
	  public WebElement Destroyed_code() {
	   return Destroyed_code;
	   }
	    @FindBy(xpath="//input[@name='FROM_NUMBER']")
	    private WebElement DestroyedFromNumber2;
	    public WebElement DestroyedFromNumber2() {
	    	return DestroyedFromNumber2;
	    }
	    @FindBy(xpath="//input[@name='NUMBER_TO']")
	    private WebElement DestroyedToNumber2;
	    public WebElement DestroyedToNumber2() {
	    	return DestroyedToNumber2;
	    }
	    @FindBy(xpath="//label[text()='To Destroy ']")
	    private WebElement ToDestroy;
	    public WebElement ToDestroy() {
	    	return ToDestroy;
	    }
	    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	    private WebElement okBUTTON;
	    public WebElement okBUTTON() {
	  	  return okBUTTON ;
	    }
}
