package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import pageobjects.CommonElements.CSMCommonWebElements;

public class CSMLogin {
	WebDriver driver;

	CSMCommonWebElements csmCommonWebElements;
	String TestDataPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData csmParamLoginTestData = new ExcelData(TestDataPath, "CSMParam_login", "Stage");
	ExcelData csmLoginExceldata = new ExcelData(TestDataPath, "CSM_Login", "Stage");
	ExcelData sadsLoginExceldata = new ExcelData(TestDataPath, "SadsLogin", "Stage");
	Map<String, String> csmLoginTestData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);

	ClicksAndActionsHelper clicksAndActionHelper;

	public CSMLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void loginIntoCSMParamApplication(String userType) throws IOException {
		csmLoginTestData = csmParamLoginTestData.getTestdata(userType);
		csmCommonWebElements = new CSMCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		csmCommonWebElements.csmUserName().click();
		csmCommonWebElements.csmUserName().sendKeys(csmLoginTestData.get("userName"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmPassword());
		csmCommonWebElements.csmPassword().click();
		csmCommonWebElements.csmPassword().sendKeys(csmLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginButon());
		csmCommonWebElements.csmLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyCode());
		csmCommonWebElements.csmCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmCompanyCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmCompanyCode().sendKeys(csmLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmBranchCode());
		csmCommonWebElements.csmBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmBranchCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmBranchCode().sendKeys(csmLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		csmCommonWebElements.csmCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = csmCommonWebElements.csmBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		
		for (int i = 0; i <= 70; i++) {
			try {
				clicksAndActionHelper.moveToElement(csmCommonWebElements.csmForceLogoutYesButton());
				clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmForceLogoutYesButton());
				break;
			} catch (Exception e) {
				if (i == 70) {
					System.out.print("No Force Log out");
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginValidation());
		Assert.assertTrue(csmCommonWebElements.csmLoginValidation().isDisplayed());
		System.out.println("Login validated");
	
	}

	public void loginIntoCSMApplication(String userType) throws IOException {
		csmLoginTestData = csmLoginExceldata.getTestdata(userType);
		csmCommonWebElements = new CSMCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		csmCommonWebElements.csmUserName().click();
		csmCommonWebElements.csmUserName().sendKeys(csmLoginTestData.get("userName"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmPassword());
		csmCommonWebElements.csmPassword().click();
		csmCommonWebElements.csmPassword().sendKeys(csmLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginButon());
		csmCommonWebElements.csmLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyCode());
		csmCommonWebElements.csmCompanyCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmCompanyCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmCompanyCode().sendKeys(csmLoginTestData.get("CompanyCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionHelper.moveToElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmCompanyAndBranchLogin());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmBranchCode());
		csmCommonWebElements.csmBranchCode().click();
		for (int i = 0; i <= 10; i++) {
			csmCommonWebElements.csmBranchCode().sendKeys(Keys.DELETE);
		}
		csmCommonWebElements.csmBranchCode().sendKeys(csmLoginTestData.get("BranchCode"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCompanyAndBranchLogin());
		csmCommonWebElements.csmCompanyAndBranchLogin().click();
		for (int i = 0; i <= 50; i++) {

			String headOffice = csmCommonWebElements.csmBranchCodeValidation().getAttribute("prevvalue");

			if (!(headOffice.isBlank())) {
				break;
			}

		}

		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionHelper.moveToElement(csmCommonWebElements.csmForceLogoutYesButton());
				clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmForceLogoutYesButton());
				break;
			} catch (Exception e) {
				if (i == 500) {
					System.out.print("No Force Log");
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmContinueButton());
		csmCommonWebElements.csmContinueButton().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginValidation());
		Assert.assertTrue(csmCommonWebElements.csmLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.moveToElement(csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmUserName());
		 * Assert.assertTrue(csmCommonWebElements.csmUserName().isDisplayed());
		 * driver.quit();
		 */
	}

	public void loginIntoSadsApplication(String userType) throws IOException {
		
		csmLoginTestData = sadsLoginExceldata.getTestdata(userType);
		csmCommonWebElements = new CSMCommonWebElements(driver);
		clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmUserName());
		csmCommonWebElements.csmUserName().click();
		csmCommonWebElements.csmUserName().sendKeys(csmLoginTestData.get("userName"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmPassword());
		csmCommonWebElements.csmPassword().click();
		csmCommonWebElements.csmPassword().sendKeys(csmLoginTestData.get("Password"));
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginButon());
		csmCommonWebElements.csmLoginButon().click();
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmLoginValidation());
		Assert.assertTrue(csmCommonWebElements.csmLoginValidation().isDisplayed());
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.moveToElement(csmCommonWebElements.csmLogoutButton());
		 * clicksAndActionHelper.clickOnElement(csmCommonWebElements.csmLogoutButton());
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * csmCommonWebElements.csmUserName());
		 * Assert.assertTrue(csmCommonWebElements.csmUserName().isDisplayed());
		 * driver.quit();
		 */
	}

}
