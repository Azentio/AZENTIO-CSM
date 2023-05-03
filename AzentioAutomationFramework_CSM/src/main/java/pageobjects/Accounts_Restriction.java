package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accounts_Restriction {
	WebDriver driver;
	public Accounts_Restriction(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Reports']")
	private WebElement Reports1;
	public WebElement Reports1() {
		return Reports1;
	}
	@FindBy(xpath="(//span[text()='List of Accounts'])[1]")
	private WebElement Accounts1;
	public WebElement Accounts1() {
		return Accounts1;
	}
	

}
