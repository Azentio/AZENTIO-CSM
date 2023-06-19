package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPageObject {
	WebDriver driver;

	public TestPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "WebDriver driver")
	private WebElement transactionUA_AmountInput;

	public WebElement transactionUAAmountInput() {
		return transactionUA_AmountInput;
	}

	@FindBy(xpath = "WebDriver driver")
	private WebElement transactionUA_ClearFlag;

	public WebElement transactionUAClearFlag() {
		return transactionUA_ClearFlag;
	}

}
