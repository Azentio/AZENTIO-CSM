package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeWebSiteObj {
	WebDriver driver;
	public PracticeWebSiteObj(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userName;
	public WebElement userName()
	{
		return userName;
	}
	@FindBy(id="password")
	private WebElement password;
	public WebElement password()
	{
		return password;
	}
	@FindBy(id="submit")
	private WebElement loginButton;
	public WebElement loginButton()
	{
		return loginButton;
	}
	@FindBy(xpath="//h1[contains(text(),'Logged In Successfully')]")
	private WebElement loginSuccessfullMessage;
	public WebElement loginSuccessfullMessage()
	{
		return loginSuccessfullMessage;
	}
	@FindBy(xpath="//div[contains(text(),'Your username is invalid!')]")
	private WebElement userNameInvalidMessage;
	public WebElement userNameInvalidMessage()
	{
		return userNameInvalidMessage;
	}
}
