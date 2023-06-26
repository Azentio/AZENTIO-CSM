package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_QueriesObj {
	WebDriver driver;

	public CSM_QueriesObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Queries')]")
	private WebElement csm_QueriesFeature;

	public WebElement csmQueriesFeature() {
		return csm_QueriesFeature;
	}
	@FindBy(xpath="//td[contains(text(),'Statement Of Accounts')]")
	private WebElement queries_StatementOfAccounts;

	public WebElement queriesStatementOfAccounts() {
		return queries_StatementOfAccounts;
	}

	@FindBy(xpath = "//span[contains(text(),'By Value Date')]//ancestor::a")
	private WebElement queries_ByValueDateFeature;

	public WebElement queriesByValueDateFeature() {
		return queries_ByValueDateFeature;
	}

	@FindBy(name = "//input[@name='statementOfAccountsCO.amfvo.BRANCH_CODE']")
	private WebElement queries_BranchCodeInput;

	public WebElement queriesBranchCodeInput() {
		return queries_BranchCodeInput;
	}

	@FindBy(xpath = "//input[@name='statementOfAccountsCO.amfvo.CURRENCY_CODE']")
	private WebElement queries_CurrencyCodeInput;

	public WebElement queriesCurrencyCodeInput() {
		return queries_CurrencyCodeInput;
	}

	@FindBy(xpath = "//input[@name='statementOfAccountsCO.amfvo.GL_CODE']")
	private WebElement queries_GlCodeInput;

	public WebElement queriesGlCodeInput() {
		return queries_GlCodeInput;
	}

	@FindBy(xpath = "//input[@name='statementOfAccountsCO.amfvo.CIF_SUB_NO']")
	private WebElement queries_CIFNumberInput;

	public WebElement queriesCIFNumberInput() {
		return queries_CIFNumberInput;
	}

	@FindBy(xpath = "//input[@name='statementOfAccountsCO.amfvo.SL_NO']")
	private WebElement queries_SerialNumberInput;

	public WebElement queriesSerialNumberInput() {
		return queries_SerialNumberInput;
	}

	@FindBy(xpath = "//input[@name='statementOfAccountsCO.amfvo.DATE_OPND']")
	private WebElement queries_FromDateInput;

	public WebElement queriesFromDateInput() {
		return queries_FromDateInput;
	}

	@FindBy(xpath = "//input[@name='statementOfAccountsCO.amfvo.DATE_CLOSD']")
	private WebElement queries_ToDateInput;

	public WebElement queriesToDateInput() {
		return queries_ToDateInput;
	}

	@FindBy(xpath = "//label[contains(text(),'Retrieve ')]//ancestor::button")
	private WebElement queries_RetriveButton;

	public WebElement queriesRetriveButton() {
		return queries_RetriveButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Queries')]")
	private WebElement queries_Label;

	public WebElement queriesLabel() {
		return queries_Label;
	}

}
