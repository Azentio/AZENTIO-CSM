package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
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
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

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
		clicksAdActionsHelper.doubleClick(csmAccountsObj.generalAcccountsCurrencyDescription());
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
		for (int i = 0; i <= 300; i++) {
			if (!(csmAccountsObj.generalAccountsCIFNameDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 300) {
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

	@Then("^valiidate system through the validation for restriction in fixed maturity accounts$")
	public void valiidate_system_through_the_validation_for_restriction_in_fixed_maturity_accounts() throws Throwable {

	}

	@Then("^varify system through the validatio for closed dormant accounts$")
	public void varify_system_through_the_validatio_for_closed_dormant_accounts() throws Throwable {

	}

	@And("^click on fixed maturity accounts module$")
	public void click_on_fixed_maturity_accounts_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.accountsFixedMaturityAccounts());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.accountsFixedMaturityAccounts());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.accountsFixedMaturityAccounts());

	}

	@And("^click on opening under fixed aturity accounts screen$")
	public void click_on_opening_under_fixed_aturity_accounts_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.fixedMaturiyAccountsOpening());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.fixedMaturiyAccountsOpening());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.fixedMaturiyAccountsOpening());

	}

	@And("^enter curency code in fixed maturity accounts$")
	public void enter_curency_code_in_fixed_maturity_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.fomCurrencyCode());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.fomCurrencyCode());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.fomCurrencyCode());
		csmAccountsObj.fomCurrencyCode().sendKeys("15");
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.fmaCurrecyCodeDescription());
		for (int i = 0; i <= 100; i++) {
			if (!(csmAccountsObj.fmaCurrecyCodeDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 100) {
				Assert.fail("Data Not pupulated");
			}
		}

	}

	@And("^enter the account type in fixed maturity accounts$")
	public void enter_the_account_type_in_fixed_maturity_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.fmaGlType());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.fmaGlType());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.fmaGlType());
		csmAccountsObj.fmaGlType().sendKeys("15");
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.fmaGlTypeDescription());
		for (int i = 0; i <= 100; i++) {
			if (!(csmAccountsObj.fmaGlTypeDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 100) {
				Assert.fail("Data Not pupulated");
			}
		}
	}

	@And("^enter the CIF number in fixed maturity accounts$")
	public void enter_the_cif_number_in_fixed_maturity_accounts() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.fmaCIFNo());
		clicksAdActionsHelper.moveToElement(csmAccountsObj.fmaCIFNo());
		clicksAdActionsHelper.clickOnElement(csmAccountsObj.fmaCIFNo());
		csmAccountsObj.fmaCIFNo().sendKeys("15");
		waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.fmaCIFNoDescription());
		for (int i = 0; i <= 100; i++) {
			if (!(csmAccountsObj.fmaCIFNoDescription().getAttribute("prevvalue").isBlank())) {
				break;
			} else if (i == 100) {
				Assert.fail("Data Not pupulated");
			}
		}
	}

	@And("^click on closed dormant accounts screen$")
	public void click_on_closed_dormant_accounts_screen() throws Throwable {
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.scrollIntoView(csmAccountsObj.accountsClosedDormantAccounts());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on maintenancescreen in closed dormant accounts$")
	public void click_on_maintenancescreen_in_closed_dormant_accounts() throws Throwable {
waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.closedDormantAccountsMaintenance());
clicksAdActionsHelper.moveToElement(csmAccountsObj.closedDormantAccountsMaintenance());
clicksAdActionsHelper.clickOnElement(csmAccountsObj.closedDormantAccountsMaintenance());
	}

	@And("^enter the CIF code in closed dormant accounts$")
	public void enter_the_cif_code_in_closed_dormant_accounts() throws Throwable {
waitHelper.waitForElementwithFluentwait(driver, csmAccountsObj.closedDormantAccountInputCIFCode());
clicksAdActionsHelper.moveToElement(csmAccountsObj.closedDormantAccountInputCIFCode());
clicksAdActionsHelper.clickOnElement(csmAccountsObj.closedDormantAccountInputCIFCode());
csmAccountsObj.closedDormantAccountInputCIFCode().sendKeys("4400");


	}

}
