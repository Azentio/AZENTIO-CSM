package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.PracticeWebSiteObj;
import resources.BaseClass;

public class PracticeWebSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	PracticeWebSiteObj practiceWebObj = new PracticeWebSiteObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	String dataPath = System.getProperty("user.dir") + "\\TestData\\DemoTestData.xlsx";
	ExcelData excelDataForTestData = new ExcelData(dataPath, "DemoTestData", "DataSet ID");
	ExcelData excelDataForTestExecution = new ExcelData(dataPath, "TestExecution", "Test CaseID");
	Map<String, String> testData = new HashMap<>();
	Map<String, String> executionData = new HashMap<>();

	@Given("navigate to practice website")
	public void navigate_to_practice_website() {
		driver.get(configFileReader.getDemoApplicationUrl());
	}

	@And("get the test data for possitive test case")
	public void get_the_test_data_for_possitive_test_case() {
		executionData = excelDataForTestExecution.getTestdata("Test_Case_01");
		testData = excelDataForTestData.getTestdata(executionData.get("DataSetID"));
	}

	@And("get the test data for negative test case")
	public void get_the_test_data_for_negative_test_case() {
		executionData = excelDataForTestExecution.getTestdata("Test_Case_02");
		testData = excelDataForTestData.getTestdata(executionData.get("DataSetID"));
	}

	@And("enter the user name")
	public void enter_the_user_name() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, practiceWebObj.userName());
		practiceWebObj.userName().sendKeys(testData.get("User Name"));
	}

	@And("enter the password")
	public void enter_the_password() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, practiceWebObj.password());
		practiceWebObj.password().sendKeys(testData.get("Password"));
	}

	@And("click on login button")
	public void click_on_login_button() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, practiceWebObj.loginButton());
		practiceWebObj.loginButton().click();
	}

	@Then("verify system should login successfully")
	public void verify_system_should_login_successfully() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, practiceWebObj.loginSuccessfullMessage());

		Assert.assertTrue(practiceWebObj.loginSuccessfullMessage().isDisplayed());
	}

	@Then("verify system should not login successfully")
	public void verify_system_should_not_login_successfully() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, practiceWebObj.userNameInvalidMessage());
		Assert.assertTrue(practiceWebObj.userNameInvalidMessage().isDisplayed());
		Assert.fail("Test Failed");
	}

}
