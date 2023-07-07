package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMParam_PriorityObj;
import resources.BaseClass;

public class CSMParam_PrioritySteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	CSMParam_PriorityObj priorityObj = new CSMParam_PriorityObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	Robot robot;
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	String csmParamPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData excelDataForChargeWaiverExecution = new ExcelData(path, "ChargeWaiverExecutionTracker", "TestCaseID");
	ExcelData excelDataForCherageWaiverTest = new ExcelData(path, "CSM_ChargeWaiverTestData", "DataSet ID");
	ExcelData excelDataForPriorityTestData = new ExcelData(csmParamPath, "CSMParam_PriorityTestData", "DataSet ID");
	Map<String, String> chargeWaiverExecution = new HashMap<>();
	Map<String, String> priorityTestData = new HashMap<>();

	@And("click on CIF Parameters")
	public void click_on_cif_parameters() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, priorityObj.parametersCIFParametersFeature());
		clicksAndActionsHelper.moveToElement(priorityObj.parametersCIFParametersFeature());
		clicksAndActionsHelper.clickOnElement(priorityObj.parametersCIFParametersFeature());
	}

	@And("get the test adat for test case WP_CW_003_01")
	public void get_the_test_adat_for_test_case_WP_CW_003_01() throws Throwable {
		chargeWaiverExecution = excelDataForChargeWaiverExecution.getTestdata("WP_CW_003_01");
		priorityTestData = excelDataForPriorityTestData.getTestdata(chargeWaiverExecution.get("Data Set ID"));
	}

	@And("click on priority screen")
	public void click_on_priority_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(priorityObj.cifParameterPriority());
				clicksAndActionsHelper.moveToElement(priorityObj.cifParameterPriority());
				clicksAndActionsHelper.clickOnElement(priorityObj.cifParameterPriority());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on update after approve screen of priority feature")
	public void click_on_update_after_approve_screen_of_priority_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, priorityObj.priorityUpdateAfterApprove());
		clicksAndActionsHelper.moveToElement(priorityObj.priorityUpdateAfterApprove());
		clicksAndActionsHelper.clickOnElement(priorityObj.priorityUpdateAfterApprove());
	}

	@And("search for the priority record")
	public void search_for_the_priority_record() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, priorityObj.prioritySearchPriorityCode());
		clicksAndActionsHelper.moveToElement(priorityObj.prioritySearchPriorityCode());
		clicksAndActionsHelper.clickOnElement(priorityObj.prioritySearchPriorityCode());
		priorityObj.prioritySearchPriorityCode().sendKeys(priorityTestData.get("priority_code"));
		robot=new Robot();
		for (int i = 0; i <=10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);			
		}
	}

	@And("define the charge waive percentage in prority uupdate after approve")
	public void define_the_charge_waive_percentage_in_prority_uupdate_after_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, priorityObj.priorityWaiverPercentageDisable());
		clicksAndActionsHelper.moveToElement(priorityObj.priorityWaiverPercentageDisable());
		clicksAndActionsHelper.clickOnElement(priorityObj.priorityWaiverPercentageDisable());
		waitHelper.waitForElementwithFluentwait(driver, priorityObj.priorityWaiverPercentageInput());
		String waivePercentage = priorityObj.priorityWaiverPercentageInput().getAttribute("prevvalue");
		System.out.println(
				"Waive percentage " + waivePercentage + " WaivePeercentage Length " + waivePercentage.length());
		priorityObj.priorityWaiverPercentageInput().clear();
        //waive_percentage
		priorityObj.priorityWaiverPercentageInput().sendKeys(Keys.TAB);
		priorityObj.priorityWaiverPercentageInput().sendKeys(priorityTestData.get("waive_percentage"));
		priorityObj.priorityWaiverPercentageInput().sendKeys(Keys.TAB);

	}

	@And("click o update after button in priority record")
	public void click_o_update_after_button_in_priority_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmParamUpdateAfterApproveBtn());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmParamUpdateAfterApproveBtn());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmParamUpdateAfterApproveBtn());
	}

	@And("click on ok button inn save successfull pop up")
	public void click_on_ok_button_inn_save_successfull_pop_up() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveConfirmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveConfirmOkButton());
	}

	@And("click on ok button in update auucessfull pop up")
	public void click_on_ok_button_in_update_auucessfull_pop_up() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.updateOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.updateOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.updateOkButton());
	}

	@And("select the priority record in update after approve screen")
	public void select_the_priority_record_in_update_after_approve_screen() throws Throwable {
		String xpath = "//table[starts-with(@id,'priorityList_GridTbl_Id')]//td[text()='"
				+ priorityTestData.get("priority_code") + "']";

		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("search for the priority record in approve section")
	public void search_for_the_priority_record_in_approve_section() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, priorityObj.prioritySearchPriorityCode());
		clicksAndActionsHelper.moveToElement(priorityObj.prioritySearchPriorityCode());
		clicksAndActionsHelper.clickOnElement(priorityObj.prioritySearchPriorityCode());
		priorityObj.prioritySearchPriorityCode().sendKeys(priorityTestData.get("priority_code"));
		robot=new Robot();
		for (int i = 0; i <=10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);			
		}
	}

	@And("select the priority record in approve section")
	public void select_the_priority_record_in_approve_section() throws Throwable {
		String xpath = "//table[starts-with(@id,'priorityList_GridTbl_Id')]//td[text()='"
				+ priorityTestData.get("priority_code") + "']";

		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("close the update after approve screen of priority feature")
	public void close_the_update_after_approve_screen_of_priority_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, priorityObj.priorityUpdateAfterApproveScreenCloseButton());
		clicksAndActionsHelper.moveToElement(priorityObj.priorityUpdateAfterApproveScreenCloseButton());
		clicksAndActionsHelper.clickOnElement(priorityObj.priorityUpdateAfterApproveScreenCloseButton());
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmCommonUpdateScreenQuitOkButtton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmCommonUpdateScreenQuitOkButtton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmCommonUpdateScreenQuitOkButtton());
	}

	@And("click on approve screen ok priority feature")
	public void click_on_approve_screen_ok_priority_feature() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, priorityObj.priorityApprove());
		clicksAndActionsHelper.moveToElement(priorityObj.priorityApprove());
		clicksAndActionsHelper.clickOnElement(priorityObj.priorityApprove());
	}

	@And("click on approve button in priority record")
	public void click_on_approve_button_in_priority_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmApproveBtnWithLabel());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveBtnWithLabel());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveBtnWithLabel());
	}

	@And("click on ok button in approve confirmation in priority screen")
	public void click_on_ok_button_in_approve_confirmation_in_priority_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmConfirmApprovOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmConfirmApprovOkButton());
	}

	@And("click on ok button in approve successfull in priority screen")
	public void click_on_ok_button_in_approve_successfull_in_priority_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmApproveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmApproveSuccessOkButton());
	}

	@And("update the waive percentage in transaction excel database")
	public void update_the_waive_percentage_in_transaction_excel_database() throws Throwable {
		//waive_percentage
excelDataForCherageWaiverTest.updateTestData(priorityTestData.get("update_dataset_id"), "waive_percentage", priorityTestData.get("waive_percentage"));
	}
}
