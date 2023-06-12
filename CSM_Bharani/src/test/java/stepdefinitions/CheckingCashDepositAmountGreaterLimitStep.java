package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.CheckingCashDepositAmountGreaterLimit;
import resources.BaseClass;

public class CheckingCashDepositAmountGreaterLimitStep {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	CheckingCashDepositAmountGreaterLimit checkingcashObj = new CheckingCashDepositAmountGreaterLimit(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
    ExcelData csmTransactionsExcelData = new ExcelData(path, "Transactions", "Data Set ID");
    Map<String, String> testData;
}