package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csm.CSM_ProcessingClientsStatementObj;
import resources.BaseClass;

public class CSM_ClientProcessingStatementSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSM_ProcessingClientsStatementObj csmProcessingClientStatementObj = new CSM_ProcessingClientsStatementObj(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	DropDownHelper dropdownHelper = new DropDownHelper(driver);
	String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelDataForClientProcessingStatement = new ExcelData(testDataPath, "CSM_ClientProcessingStatement",
			"DataSet ID");
	Map<String, String> clientProcessingStatementTestData = new HashMap<>();
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);

	@And("^click on report module$")
	public void click_on_report_module() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(csmProcessingClientStatementObj.csmReports());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, csmProcessingClientStatementObj.csmReports());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.csmReports());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.csmReports());

	}

	@And("^click on client processing statement sub module$")
	public void click_on_client_processing_statement_sub_module() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.reportProcessingClientsStatement());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.reportProcessingClientsStatement());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.reportProcessingClientsStatement());
	}

	@And("^get the test data for OR Restriction of XIF type X and GL Y in client processing statement$")
	public void get_the_test_data_for_or_restriction_of_xif_type_x_and_gl_y_in_client_processing_statement()
			throws Throwable {
		clientProcessingStatementTestData = excelDataForClientProcessingStatement.getTestdata("DS1_SADS_AT_009");
	}

	@And("^click on trade date under client processing statement$")
	public void click_on_trade_date_under_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processingClientsStatementTradeDate());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.processingClientsStatementTradeDate());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.processingClientsStatementTradeDate());
	}

	@Then("^enter the from periodically in client processing statement$")
	public void enter_the_from_periodically_in_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmProcessingClientStatementObj.tradeDateFormSelect());
		dropdownHelper.SelectUsingVisibleText(csmProcessingClientStatementObj.tradeDateFormSelect(),
				clientProcessingStatementTestData.get("TradeDateFromSelection"));

	}

	@And("^enter the transaction from date in client processing statemet$")
	public void enter_the_transaction_from_date_in_client_processing_statemet() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processingClientStatementFromDate());
		csmProcessingClientStatementObj.processingClientStatementFromDate().click();
		Thread.sleep(1000);
		for (int i = 0; i <= 11; i++) {
			try {
				csmProcessingClientStatementObj.processingClientStatementFromDate().clear();
				csmProcessingClientStatementObj.processingClientStatementFromDate().sendKeys(Keys.BACK_SPACE);
				break;
			} catch (Exception e) {

			}
		}
		csmProcessingClientStatementObj.processingClientStatementFromDate()
				.sendKeys(clientProcessingStatementTestData.get("FromDate"));
		System.out.println("From Date" + clientProcessingStatementTestData.get("FromDate"));
		csmProcessingClientStatementObj.processingClientStatementFromDate().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@And("^enter the transaction to date in client processing statement$")
	public void enter_the_transaction_to_date_in_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processingClientStatementToDate());
		csmProcessingClientStatementObj.processingClientStatementToDate().click();
		for (int i = 0; i <= 11; i++) {
			try {
				csmProcessingClientStatementObj.processingClientStatementToDate().sendKeys(Keys.BACK_SPACE);
				break;
			} catch (Exception e) {

			}
		}
		csmProcessingClientStatementObj.processingClientStatementToDate()
				.sendKeys(clientProcessingStatementTestData.get("ToDate"));
		System.out.println("Fron Date" + clientProcessingStatementTestData.get("ToDate"));
		csmProcessingClientStatementObj.processingClientStatementToDate().sendKeys(Keys.ENTER);
	}

	@And("^check the range of GL in client processing statement$")
	public void check_the_range_of_gl_in_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processingClientStatementRangeOfCIF());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.processingClientStatementRangeOfGlCodes());
		clicksAndActionsHelper
				.clickOnElement(csmProcessingClientStatementObj.processingClientStatementRangeOfGlCodes());
	}

	@And("^check the range of CIF in client processing statement$")
	public void check_the_range_of_cif_in_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processingClientStatementRangeOfCIF());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.processingClientStatementRangeOfCIF());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.processingClientStatementRangeOfCIF());
	}

	@And("^give the from gl number in client processing statement$")
	public void give_the_from_gl_number_in_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processinngClientStatementFromGL());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.processinngClientStatementFromGL());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.processinngClientStatementFromGL());
		csmProcessingClientStatementObj.processinngClientStatementFromGL().clear();
		csmProcessingClientStatementObj.processinngClientStatementFromGL()
				.sendKeys(clientProcessingStatementTestData.get("FromGLCode"));
	}

	@And("^give the to gl number in client processing statement$")
	public void give_the_to_gl_number_in_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processinngClinetStatementToGl());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.processinngClinetStatementToGl());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.processinngClinetStatementToGl());
		csmProcessingClientStatementObj.processinngClinetStatementToGl().clear();
		csmProcessingClientStatementObj.processinngClinetStatementToGl()
				.sendKeys(clientProcessingStatementTestData.get("ToGLCode"));
	}

	@And("^give the from CIF number in client processing statement$")
	public void give_the_from_cif_number_in_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processingClientStatementfromCIFNumber());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.processingClientStatementfromCIFNumber());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.processingClientStatementfromCIFNumber());
		csmProcessingClientStatementObj.processingClientStatementfromCIFNumber().clear();
		csmProcessingClientStatementObj.processingClientStatementfromCIFNumber()
				.sendKeys(clientProcessingStatementTestData.get("FromCIFNumber"));
	}

	@And("^give the to CIF number in client processing statement$")
	public void give_the_to_cif_number_in_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processingClientStatementToCIFNumber());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.processingClientStatementToCIFNumber());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.processingClientStatementToCIFNumber());
		csmProcessingClientStatementObj.processingClientStatementToCIFNumber().clear();
		csmProcessingClientStatementObj.processingClientStatementToCIFNumber()
				.sendKeys(clientProcessingStatementTestData.get("ToCIFNumber"));
	}

	@And("^click on open button client processing statement$")
	public void click_on_open_button_client_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				csmProcessingClientStatementObj.processingClientStatementOpenButton());
		clicksAndActionsHelper.moveToElement(csmProcessingClientStatementObj.processingClientStatementOpenButton());
		clicksAndActionsHelper.clickOnElement(csmProcessingClientStatementObj.processingClientStatementOpenButton());

	}

	@Then("^validate the system shows restricted message for system processing statement$")
	public void validate_the_system_shows_restricted_message_for_system_processing_statement() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmAlertPopup());
		Assert.assertTrue(csmCommonWebElements.csmAlertPopup().getText().contains("Restricted"));
	}

}
