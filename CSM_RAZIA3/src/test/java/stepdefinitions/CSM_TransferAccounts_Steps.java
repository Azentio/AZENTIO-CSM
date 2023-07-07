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
import pageobjects.csm.CSM_TransferAccounts_OBJ;
import resources.BaseClass;


public class CSM_TransferAccounts_Steps {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
		ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_TransferAccounts_OBJ csmTransferAccountsobj = new CSM_TransferAccounts_OBJ(driver);
	
	//UserUtility_614 userUtility = new UserUtility_614();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	                                                      
	ExcelData CsmTransferAccountExcelData = new ExcelData(path, "CSM_TransferAccount", "DataSet ID");
	Map<String, String> testData;
	
	


	@And("User_612 update test data set id for TA_059")
	public void user_update_test_data_set_id_for_ta_059() {
		testData = CsmTransferAccountExcelData.getTestdata("TA_059_D1");
		 	 
	}
	@And("user click TransferAccount field on CSMCore")
	public void user_click_transfer_account_field_on_csm_core()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCoreTransferAccounts());

		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMCoreTransferAccounts());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccounts());

	}

	@And("user click maintenance field under TransferAccount")
	public void user_click_maintenance_field_under_transfer_account()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCoreTransferAccountsMaintanance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintanance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintanance());

	}

	@And("user enter the TransferType under maintanence screen")
	public void user_enter_the_transfer_type_under_maintanence_screen() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType());
   // seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType());
   seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType(),"");
//System.out.println("dropdown "+testData.get("DropDown"));
//		dropDownHelper.SelectUsingVisibleText(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType(),
//				testData.get("DropDown"));
//		Thread.sleep(1000);
//		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType().sendKeys(Keys.ENTER);

	}

	@And("user enter the Reason under maintanence screen")
	public void user_enter_the_reason_under_maintanence_screen()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(testData.get("Reason"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(Keys.ENTER);

	}

	@And("user enter the Destination Branch under maintanence screen")
	public void user_enter_the_destination_branch_under_maintanence_screen()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch()
				.sendKeys(testData.get("DestinationBranch"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceDestinationBranch().sendKeys(Keys.ENTER);

	}

	@And("user enter the BranchCode under FromAccount")
	public void user_enter_the_branch_code_under_from_account()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode()
				.sendKeys(testData.get("BranchCodeFA"));
		csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode().sendKeys(Keys.TAB);

	}

	@And("user enter the CurrencyCode under FromAccount")
	public void user_enter_the_currency_code_under_from_account()  throws Throwable{
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
	public void user_enter_the_gl_code_under_from_account()  throws Throwable{
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
	public void user_enter_the_cif_code_under_from_account() throws Throwable {
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
	public void user_enter_the_serial_number_under_from_account()  throws Throwable{
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
	public void user_enter_the_branch_code_under_to_account()  throws Throwable{
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
	public void user_enter_the_currency_code_under_to_account()  throws Throwable{
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
	public void user_enter_the_gl_code_under_to_account() throws Throwable {
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
	public void user_enter_the_cif_code_under_to_account() throws Throwable {
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
	public void user_close_the_popup_tab()  throws Throwable{
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					csmTransferAccountsobj.CSMCorecloseSymbol());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(csmTransferAccountsobj.CSMCorecloseSymbol());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(csmTransferAccountsobj.CSMCorecloseSymbol());
		} catch (Exception e) {
			
		}
		
	}

	@And("user enter the SerialNumber under TOAccount")
	public void user_enter_the_serial_number_under_to_account()  throws Throwable{
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
	public void user_click_the_retrive_button_under_maintenance_screen()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRetriveButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRetriveButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRetriveButton());
	}

	@And("user select the Record no1 under TransferManagement screen")
	public void user_select_the_record_no1_under_transfer_management_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());

	}
	
	@And("user select the Record no2 under TransferManagement screen")
	public void user_select_the_record_no2_under_transfer_management_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno2());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno2());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno2());

	}

	@And("user click the Save button under maintanance screen")
	public void CSMCoreTransferAccountsMaintananceSaveButton() throws Throwable {
		JavascriptHelper.scrollIntoView(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceSaveButton());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceSaveButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceSaveButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceSaveButton());

	}
	@And("user click the BranchManager Account in the Alert popup")
	public void user_click_the_branch_manager_account_in_the_alert_popup() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId());
	}

	@Then("user click the send button in Alert popup")
	public void user_click_the_send_button_in_alert_popup() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId_SendBtn());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId_SendBtn());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.Transaction_maintanance_alertclickingUserId_SendBtn());
	}

	@And("user click the Approve field under TransferAccount field")
	public void user_click_the_approve_field_under_transfer_account_field()  throws Throwable{

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsApprove());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsApprove());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsApprove());
	}

	@And("user enter the Record in Approve field")
	public void user_enter_the_record_in_approve_field()  throws Throwable{
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
//				csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
		for (int i = 0; i < 200; i++) {
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
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	}

	
	@And("user double click the record in approve field")
	public void user_double_click_the_record_in_approve_field()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick());
	}

	@And("user double click the record in Transfer field")
	public void user_double_click_the_record_in_transfer_field()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(csmTransferAccountsobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());

	}



	@And("user click the Approve button under Approve field")
	public void user_click_the_approve_button_under_approve_field() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsApproveApproveButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsApproveApproveButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsApproveApproveButton());

	}

	@And("user click the Transfer field under TransferAccount field")
	public void user_click_the_transfer_field_under_transfer_account_field() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsTransfer());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransfer());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransfer());

	}

	@And("user enter the Record in Transfer field")
	public void user_enter_the_record_in_transfer_field() throws Throwable {
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
	public void user_click_the_transfer_button_under_transfer_field()  throws Throwable{
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());

	}
	

	



}
