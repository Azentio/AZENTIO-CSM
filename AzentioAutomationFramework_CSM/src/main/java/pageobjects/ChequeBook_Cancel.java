package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequeBook_Cancel {
    WebDriver driver;
    public ChequeBook_Cancel(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//td[text()='Chequebook Request']")
    private WebElement Chequebook1;
    public WebElement Chequebook1() {
    	return Chequebook1;
    }
    @FindBy(xpath="//span[text()='To Cancel']")
    private WebElement Cancelchequebook;
    public WebElement Cancelchequebook() {
    	return Cancelchequebook;
    }
    @FindBy(xpath="//input[@name='CODE']")
    private	WebElement code_Cancel;
    public WebElement code_Cancel() {
    	return code_Cancel;
    }
    @FindBy(xpath="//input[@name='FROM_NUMBER']")
    private WebElement FromNumber;
    public WebElement FromNumber() {
    	return FromNumber;
    }
    @FindBy(xpath="//input[@name='NUMBER_TO']")
    private WebElement ToNumber;
    public WebElement ToNumber() {
    	return ToNumber;
    }
    @FindBy(xpath="//label[@id='chequeBookDefFormId_Q000TC_toCancel_key']")
    private WebElement Tocancelbutton;
    public WebElement Tocancelbutton() {
    	return Tocancelbutton;
    }
}
