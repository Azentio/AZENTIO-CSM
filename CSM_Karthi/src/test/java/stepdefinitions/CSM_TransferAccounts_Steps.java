package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csmParam.CSM_TransferAccounts_OBJ;
import resources.BaseClass;

public class CSM_TransferAccounts_Steps {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_TransferAccounts_OBJ csmTransferAccountsobj = new CSM_TransferAccounts_OBJ(driver);
	// CSM_Param_Transaction_OBJ csmTransferAccountsobj = new
	// CSM_Param_Transaction_OBJ(driver);
	UserUtility_614 userUtility = new UserUtility_614();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	                                                           //CSM_TransferAccount
	ExcelData CsmTransferAccountExcelData = new ExcelData(path, "CSM_TransferAccount", "DataSet ID");
	Map<String, String> testData;
	
	
//TA_001,TA_002,TA_003
	@And("user update test data set id for TA_001")
	public void user__update_test_data_set_id_for_ta_001() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_001_D1");
		
		
	}
	
	@And("user update test data set id for TA_002")
	public void user__update_test_data_set_id_for_t1_002() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_002_D1");
		
		
	}
	@And("user update test data set id for TA_003")
	public void user__update_test_data_set_id_for_t1_003() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_003_D1");
		
		
	}
	
	@And("user update test data set id for TA_026")
	public void user__update_test_data_set_id_for_t1_026() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_026_D1");
		
		
	}
	
	@And("user update test data set id for TA_027")
	public void user__update_test_data_set_id_for_t1_027() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_027_D1");
		
		
	}
	@And("user update test data set id for TA_028")
	public void user__update_test_data_set_id_for_t1_028() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_028_D1");
		
		
	}
	@And("user update test data set id for TA_029")
	public void user__update_test_data_set_id_for_t1_029() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_029_D1");
		
		
	}
	@And("user update test data set id for TA_030")
	public void user__update_test_data_set_id_for_t1_030() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_030_D1");
		
		
	}
	@And("user update test data set id for TA_031")
	public void user__update_test_data_set_id_for_t1_031() throws Throwable {
		testData = CsmTransferAccountExcelData.getTestdata("TA_031_D1");
		
		
	}

	

	@And("user click TransferAccount field on CSMCore")
	public void user_click_transfer_account_field_on_csm_core() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccounts());

		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMCoreTransferAccounts());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccounts());

	}

	@And("user click maintenance field under TransferAccount")
	public void user_click_maintenance_field_under_transfer_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintanance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintanance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintanance());

	}

	@And("user enter the TransferType under maintanence screen")
	public void user_enter_the_transfer_type_under_maintanence_screen() throws Throwable {
		// JavascriptHelper.scrollIntoView(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType());

		waitHelper.waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType());
		seleniumActions.getClickAndActionsHelper()
		.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType());
seleniumActions.getClickAndActionsHelper()
		.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType());
System.out.println("dropdown "+testData.get("DropDown"));
		dropDownHelper.SelectUsingVisibleText(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType(),
				testData.get("DropDown"));
		Thread.sleep(1000);
//		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType().sendKeys(Keys.ENTER);

	}

	@And("user enter the Reason under maintanence screen")
	public void user_enter_the_reason_under_maintanence_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(testData.get("Reason"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(Keys.ENTER);

	}

	@And("user enter the Destination Branch under maintanence screen")
	public void user_enter_the_destination_branch_under_maintanence_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch()
				.sendKeys(testData.get("DestinationBranch"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch().sendKeys(Keys.ENTER);

	}
	@And("user enter the same Destination Branch under maintanence screen")
	public void user_enter_the_same_destination_branch_under_maintanence_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch()
				.sendKeys(testData.get("BranchCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch().sendKeys(Keys.TAB);

	}

	@And("user enter the BranchCode under FromAccount")
	public void user_enter_the_branch_code_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode()
				.sendKeys(testData.get("BranchCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode().sendKeys(Keys.TAB);

	}

	@And("user enter the CurrencyCode under FromAccount")
	public void user_enter_the_currency_code_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCyCode().sendKeys(testData.get("CYCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCyCode().sendKeys(Keys.TAB);

	}

	@And("user enter the GLCode under FromAccount")
	public void user_enter_the_gl_code_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccGLCode().sendKeys(testData.get("GLCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccGLCode().sendKeys(Keys.TAB);
	}

	@And("user enter the CIFCode under FromAccount")
	public void user_enter_the_cif_code_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode().sendKeys(testData.get("CIFCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode().sendKeys(Keys.TAB);

	}

	@And("user enter the SerialNumber under FromAccount")
	public void user_enter_the_serial_number_under_from_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccSLCode().sendKeys(testData.get("SLCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccSLCode().sendKeys(Keys.TAB);

	}

	@And("user enter the BranchCode under TOAccount")
	public void user_enter_the_branch_code_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode()
				.sendKeys(testData.get("BranchCodeTA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode().sendKeys(Keys.TAB);

	}

	@And("user enter the CurrencyCode under TOAccount")
	public void user_enter_the_currency_code_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCYCode().sendKeys(testData.get("CYCodeTA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCYCode().sendKeys(Keys.TAB);

	}

	@And("user enter the GLCode under TOAccount")
	public void user_enter_the_gl_code_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccGLCode().sendKeys(testData.get("GLCodeTA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccGLCode().sendKeys(Keys.TAB);

	}

	@And("user enter the CIFCode under TOAccount")
	public void user_enter_the_cif_code_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode().sendKeys(testData.get("CIFCodeTA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode().sendKeys(Keys.TAB);

	}
	@And("user close the popup Tab")
	public void user_close_the_popup_tab() {
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				csmTransferAccountsobj.CSMCorecloseSymbol());
		for (int i = 0; i < 200; i++) {
			try {
				
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(csmTransferAccountsobj.CSMCorecloseSymbol());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(csmTransferAccountsobj.CSMCorecloseSymbol());
				break;
			} catch (Exception e) {
				
			}
			
		}
		}
		

	@And("user enter the SerialNumber under TOAccount")
	public void user_enter_the_serial_number_under_to_account() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccSLCode().sendKeys(testData.get("SLCodeTA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTOAccSLCode().sendKeys(Keys.TAB);

	}
	
	@And("user click the retrive button under maintenance screen")
	public void user_click_the_retrive_button_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRetriveButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRetriveButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRetriveButton());
		Thread.sleep(2000);
	}

	@And("user select the Record no1 under TransferMaintanence screen")
	public void user_select_the_record_no1_under_transfer_Maintanence_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());

	}
	
	@And("user select the Record no2 under TransferMaintanence screen")
	public void user_select_the_record_no2_under_transfer_Maintanence_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno2());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno2());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno2());

	}
	
	@And("user select the Record no3 under TransferMaintanence screen")
	public void user_select_the_record_no3_under_transfer_Maintanence_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno3());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno3());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno3());

	}

	@And("user click the Save button under maintanance screen")
	public void CSMCoreTransferAccountsMaintananceSaveButton() {
		JavascriptHelper.scrollIntoView(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceSaveButton());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceSaveButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceSaveButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceSaveButton());

	}
//	@And("user click the BranchManager Account in the Alert popup")
//	public void user_click_the_branch_manager_account_in_the_alert_popup() throws Throwable {
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId());
//		seleniumActions.getClickAndActionsHelper()
//				.moveToElement(csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId());
//		seleniumActions.getClickAndActionsHelper()
//				.clickOnElement(csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId());
//	}
//
//	@Then("user click the send button in Alert popup")
//	public void user_click_the_send_button_in_alert_popup() throws Throwable {
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId_SendBtn());
//		seleniumActions.getClickAndActionsHelper()
//				.moveToElement(csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId_SendBtn());
//		seleniumActions.getClickAndActionsHelper()
//				.clickOnElement(csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId_SendBtn());
//	}

	@And("user click the Approve field under TransferAccount field")
	public void user_click_the_approve_field_under_transfer_account_field() {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsApprove());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsApprove());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsApprove());
	}

	@And("user enter the Record in Approve field")
	public void user_enter_the_record_in_approve_field() {
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
		for (int i = 0; i < 2000; i++) {
			try {
				JavascriptHelper.scrollIntoView(csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
//				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//						csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord()
						.sendKeys(testData.get("GLCodeFA"));
				csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord().sendKeys(Keys.ENTER);
				break;
				
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	}
	@And("user enter the original gl under search button")
	public void user_enter_the_original_gl_under_search_button() {
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
		for (int i = 0; i < 2000; i++) {
			try {
				JavascriptHelper.scrollIntoView(csmTransferAccountsobj.CSMCoreTransferAccountssearchbuttonEnteroriginalGlforRetriveRecord());
//				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//						csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountssearchbuttonEnteroriginalGlforRetriveRecord());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountssearchbuttonEnteroriginalGlforRetriveRecord());
				csmTransferAccountsobj.CSMCoreTransferAccountssearchbuttonEnteroriginalGlforRetriveRecord()
						.sendKeys(testData.get("GLCodeFA"));
				csmTransferAccountsobj.CSMCoreTransferAccountssearchbuttonEnteroriginalGlforRetriveRecord().sendKeys(Keys.ENTER);
				seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecordActiveStatus());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecordActiveStatus());
		csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecordActiveStatus().sendKeys(testData.get("Status"));
				csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecord().sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				break;
				
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	}

	
	@And("user doubleclick the original gl under search button")
	public void user_double_click_the_original_gl_under_search_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecordunderSearchbuttondoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecordunderSearchbuttondoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecordunderSearchbuttondoubleclick());
	}
	
	@And("user double click the record in approve field")
	public void user_double_click_the_record_in_approve_field() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick());
	}

	@And("user double click the record in Transfer field")
	public void user_double_click_the_record_in_transfer_field() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());

	}



	@And("user click the Approve button under Approve field")
	public void user_click_the_approve_button_under_approve_field() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsApproveApproveButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsApproveApproveButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsApproveApproveButton());

	}

	@And("user click the Transfer field under TransferAccount field")
	public void user_click_the_transfer_field_under_transfer_account_field() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsTransfer());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransfer());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransfer());

	}

	@And("user enter the Record in Transfer field")
	public void user_enter_the_record_in_transfer_field() {
		//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecord());
		for (int i = 0; i < 200; i++) {
			try {
				
				JavascriptHelper.scrollIntoView(csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecord());
//				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//						csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecord());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecord());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecord());
				csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecord().sendKeys(testData.get("GLCodeFA"));
				csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecord().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		

	}

	@And("user click the Transfer button under Transfer field")
	public void user_click_the_transfer_button_under_transfer_field() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());

	}
	//TA_026

	@And("User click the Parameters in Transfer Account$")
	public void user_click_the_parameters_in_transfer_account()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.Parameterbutton(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.Parameterbutton());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.Parameterbutton());
		
	}

	 

	@And("user click the System Parameters in Transfer Account")
	public void user_click_the_system_parameters_in_transfer_account()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.SystemParametersbutton(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.SystemParametersbutton());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.SystemParametersbutton());
		
	}

	 

	@And("User Click the Control Record in Transfer Account")
	public void user_click_the_control_record_in_transfer_account()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.ControlRecord_Tranfer72(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.ControlRecord_Tranfer72());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.ControlRecord_Tranfer72());
		
	}

	 

	@And("User Click the Update after Approve")
	public void user_click_the_update_after_approve()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.UpdateAfterApprove_Transaferbranch(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.UpdateAfterApprove_Transaferbranch());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.UpdateAfterApprove_Transaferbranch());
		
	}

	 

	@And("User Click the Alert Activation in Transfer Account$")
	public void user_click_the_alert_activation_in_transfer_account()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.AlertActivation_transferBranch(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.AlertActivation_transferBranch());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.AlertActivation_transferBranch());
		
	}

	 

	@And("User Click the No Access Privilege flag")
	public void user_click_the_no_access_privilege_flag()throws Throwable {
		JavascriptHelper.scrollIntoView(csmTransferAccountsobj.NoAccessprivilege_transfer72());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.NoAccessprivilege_transfer72(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.NoAccessprivilege_transfer72());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.NoAccessprivilege_transfer72());
		
	}

	 

	@And("User Click the transfer Branch creation flag")

	public void user_click_the_transfer_branch_creation_flag()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.TransferBranchCreationUncheck_072(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.TransferBranchCreationUncheck_072());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.TransferBranchCreationUncheck_072());
	}
	@And("User Click the transfer Branch creation uncheck thebox")

	public void user_click_the_transfer_branch_creation_uncheck_thebox()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.TransferBranchCreationUncheckBOX_072(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.TransferBranchCreationUncheckBOX_072());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.TransferBranchCreationUncheckBOX_072());
	}

	 
	@And("User Click the Transfer Cancellation flag")

	public void user_click_the_transfer_cancellation_flag()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.TransactionCancellation_Uncheckbutton072(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.TransactionCancellation_Uncheckbutton072());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.TransactionCancellation_Uncheckbutton072());

	}
	@And("User Click the Transfer Cancellation uncheck thebox")

	public void user_click_the_transfer_cancellation_uncheck_thebox()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.TransactionCancellation_Uncheckbutton__BOX_072(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.TransactionCancellation_Uncheckbutton__BOX_072());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.TransactionCancellation_Uncheckbutton__BOX_072());

	}

	@And("User Click the No Access Privelege flag")

	public void user_click_the_no_access_privelege_flag()throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.NoAccessprivelegeUncheckbutton_072(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.NoAccessprivelegeUncheckbutton_072());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.NoAccessprivelegeUncheckbutton_072());

	}

	@And("User Click the No Access Privelege uncheck thebox")

	public void user_click_the_no_access_privelege_uncheck_thebox()throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.NoAccessprivelegeUncheckbutton_BOX_072(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.NoAccessprivelegeUncheckbutton_BOX_072());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.NoAccessprivelegeUncheckbutton_BOX_072());

	}
	

	@And("User Click the Submit Update After Aprrove button")
	public void user_click_the_submit_update_after_aprrove_button()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.UpdateAfterApprove_TransaferSubmit(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.UpdateAfterApprove_TransaferSubmit());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.UpdateAfterApprove_TransaferSubmit());
		
	}

	 

	@And("User Click the ok button Popup menu")
	public void user_click_the_ok_button_popup_menu()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.Confirmokbutton72(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.Confirmokbutton72());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.Confirmokbutton72());
	}

	 

	@And("User Click the Success button in Popup menu")
	public void user_click_the_success_button_in_popup_menu()throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.Popupsuccessmsgbutton72(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.Popupsuccessmsgbutton72());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.Popupsuccessmsgbutton72());
	}
	
	
	@And("User Click the Approve field in Control Records")
	public void user_click_the_approve_field_in_control_records() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.ApprovefieldAlert(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.ApprovefieldAlert());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.ApprovefieldAlert());
	}

	@And("User Click the Approve button in Control Records")
	public void user_click_the_approve_button_in_control_records() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, csmTransferAccountsobj.SubmitApprovebuttonAlert(), 60, 2);
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.SubmitApprovebuttonAlert());  
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.SubmitApprovebuttonAlert());
	}
	//TA_026
	@And("user enter the CIF under maintanence screen")
	public void user_enter_the_cif_under_maintanence_screen() {
	
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLCIFInput());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLCIFInput());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLCIFInput());
		csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLCIFInput().sendKeys(testData.get("CIFCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLCIFInput().sendKeys(Keys.TAB);
		
	}

	@And("user enter the OriginlGl under maintanence screen")
	public void user_enter_the_originl_gl_under_maintanence_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLOriginalGL());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLOriginalGL());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLOriginalGL());
		csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLOriginalGL().sendKeys(testData.get("GLCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLOriginalGL().sendKeys(Keys.TAB);
		
	}

	@And("user enter the DestinationGl under maintanence screen")
	public void user_enter_the_destination_gl_under_maintanence_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLDestinationGL());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLDestinationGL());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLDestinationGL());
		csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLDestinationGL().sendKeys(testData.get("Destination_GL"));
		csmTransferAccountsobj.CSMCoreTransferAccountsByGLTOGLDestinationGL().sendKeys(Keys.TAB);
	}
	
	//TA_029
	@And("user click the search button in maintenance screen")
	public void user_click_the_search_button_in_maintenance_screen() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtn());
	}

	@And("user enter the record for search the record")
	public void user_enter_the_record_for_search_the_record() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecord());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecord());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecord());
		csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecord().sendKeys(testData.get("GLCodeFA"));
		seleniumActions.getClickAndActionsHelper()
		.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecordActiveStatus());
seleniumActions.getClickAndActionsHelper()
		.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecordActiveStatus());
csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecordActiveStatus().sendKeys(testData.get("Status"));
		csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecord().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@And("user double click the record under search button")
	public void user_double_click_the_record_under_search_button() {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecorddoubleClick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecorddoubleClick());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(csmTransferAccountsobj.CSMCoreTransferAccountsmaintenancesearchbtnenterrecorddoubleClick());

	}
	@And("^user click confirm ok Button$")
	public void UserClickconfirmokSaveButton() {
		 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsobj.csmTransactionTypeConfirmOkButton());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.csmTransactionTypeConfirmOkButton());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.csmTransactionTypeConfirmOkButton());
          try {
        	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransferAccountsobj.csmTransactionTypeSuccessOkButton());
	          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.csmTransactionTypeSuccessOkButton());
	          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.csmTransactionTypeSuccessOkButton());
		} catch (Exception e) {
			
		}
          
	}
	
	//post requiesties for TA_026 to TA_031
	
	@And("user click the Reject button in Approve field")
	public void user_click_the_reject_button_in_approve_field() {
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				csmTransferAccountsobj.csmTransactionTypeApprovefieldRejectbutton());
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper.scrollIntoView(csmTransferAccountsobj.csmTransactionTypeApprovefieldRejectbutton());
				seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.csmTransactionTypeApprovefieldRejectbutton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.csmTransactionTypeApprovefieldRejectbutton());
		break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
	
		
		
	}



}
