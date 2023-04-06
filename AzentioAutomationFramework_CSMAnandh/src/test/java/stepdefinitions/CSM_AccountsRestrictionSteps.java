package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_AccountsObj;
import resources.BaseClass;

public class CSM_AccountsRestrictionSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAdActionsHelper = new ClicksAndActionsHelper(driver);
	CSM_AccountsObj csmAccountsObj = new CSM_AccountsObj(driver);

	@And("^click on accounts screen$")
	public void click_on_accounts_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.csmAccountsMainModule());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.csmAccountsMainModule());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.csmAccountsMainModule());
	}

	@And("^click on general accounts screen$")
	public void click_on_general_accounts_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.accountsGeneralAccounts());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.accountsGeneralAccounts());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.accountsGeneralAccounts());
	}

	@And("^click on opening screen under general accounts$")
	public void click_on_opening_screen_under_general_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.generalAccountsOpening());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.generalAccountsOpening());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.generalAccountsOpening());
	}

	@And("^enter the curency code in general accounts$")
	public void enter_the_curency_code_in_general_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.generalAccountsCurrencyCode());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.generalAccountsCurrencyCode());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.generalAccountsCurrencyCode());
		csmAccountsObj.generalAccountsCurrencyCode().sendKeys("840");
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.generalAcccountsCurrencyDescription());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.generalAcccountsCurrencyDescription());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.generalAcccountsCurrencyDescription());
		for (int i = 0; i <= 100; i++) {
			if (!(csmAccountsObj.generalAcccountsCurrencyDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 100) {
				Assert.fail("Data Not pupulated");
			}
		}
	}

	@And("^enter the account type code in general accounts$")
	public void enter_the_account_type_code_in_general_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.generalAccountsGLType());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.generalAccountsGLType());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.generalAccountsGLType());
		csmAccountsObj.generalAccountsGLType().sendKeys("15");
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.generalAccountsGlDescription());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.generalAccountsGlDescription());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.generalAccountsGlDescription());
		for (int i = 0; i <= 300; i++) {
			if (!(csmAccountsObj.generalAccountsGlDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 300) {
				Assert.fail("Data Not pupulated");
			}
		}
	}

	@And("^enter the CIF number in general accounts screen$")
	public void enter_the_cif_number_in_general_accounts_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.generalAccountsCIFNo());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.generalAccountsCIFNo());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.generalAccountsCIFNo());
		csmAccountsObj.generalAccountsCIFNo().sendKeys("4400");
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.generalAccountsCIFNameDescription());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.generalAccountsCIFNameDescription());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.generalAccountsCIFNameDescription());
		for (int i = 0; i <= 100; i++) {
			if (!(csmAccountsObj.generalAccountsCIFNameDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 100) {
				Assert.fail("Data Not pupulated");
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.accountsMemoClose());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.accountsMemoClose());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.accountsMemoClose());

	}

	@Then("^validate system through the restriction$")
	public void validate_system_through_the_restriction() throws Throwable {

	}

}
