package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cheque_ReveresBook {
	WebDriver driver;
	public Cheque_ReveresBook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 
	 @FindBy(xpath="//td[text()='Chequebook Request']")
	    private WebElement Chequebook1;
	    public WebElement Chequebook1() {
	    	return Chequebook1;
	    }
	    @FindBy(xpath="//span[text()='To Be Reversed Chequebook']")
	    private WebElement ReversedChequebook;
	    public WebElement ReversedChequebook() {
	    	return ReversedChequebook;
	    }
	    @FindBy(xpath="//input[@name='CODE']")
	    private	WebElement Reverse_code;
	    public WebElement Reverse_code() {
	    	return Reverse_code;
	    }
	    @FindBy(xpath="//input[@name='FROM_NUMBER']")
	    private WebElement FromNumber2;
	    public WebElement FromNumber2() {
	    	return FromNumber2;
	    }
	    @FindBy(xpath="//input[@name='NUMBER_TO']")
	    private WebElement ToNumber2;
	    public WebElement ToNumber2() {
	    	return ToNumber2;
	    }
	    @FindBy(xpath="//a[@id='infoBarSearchButton_P024MA']")
	    private WebElement SearchBUTTOn11;
	    public WebElement SearchBUTTOn11() {
	  	  return SearchBUTTOn11;
	    }
	    @FindBy(xpath="//label[text()='To Be Reversed ']")
	    private WebElement Reversed_submit;
	    public WebElement Reversed_submit() {
	    	return Reversed_submit;
	    }
}
