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
	@And("User_612 update test data set id for TA_058")
	public void user_update_test_data_set_id_for_ta_058() {
		testData = CsmTransferAccountExcelData.getTestdata("TA_058_D1");
		 	 
	}
	@And("User_612 update test data set id for TA_060")
	public void user_update_test_data_set_id_for_ta_060() {
		testData = CsmTransferAccountExcelData.getTestdata("TA_060_D1");
		 	 
	}
	@And("User_612 update test data set id for TA_061")
	public void user_update_test_data_set_id_for_ta_061() {
		testData = CsmTransferAccountExcelData.getTestdata("TA_061_D1");
		 	 
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
  // seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceTransferType(),"");
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

	@And("user select the Record no1 under TransferMaintanence screen")
	public void user_select_the_record_no1_under_transferMaintance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(csmTransferAccountsobj.CSMCoreTransferAccountsMaintananceRecordselectingno1());

	}
	
	@And("user select the Record no2 under TransferMaintanence screen")
	public void user_select_the_record_no2_under_transfer_Maintanence_screen() throws Throwable {
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
//Transaction 

    @And("^User_612 Click onTransactions under CSM application$")
    public void User_612_click_on_transactions_under_csm_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMTransactionsMainMenu_612());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMTransactionsMainMenu_612());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMTransactionsMainMenu_612());
    }
	
	 @And("^User_612 Click onMaintenance under Transactions$")
	    public void User_612_click_on_maintenance_under_transactions() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMMaintenanceUnderTransactions_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMMaintenanceUnderTransactions_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMMaintenanceUnderTransactions_612());
	    }
	 
	 
	 
	 
	    @And("^User_612 Enter TRXType in Maintenance Screen$")
	    public void User_612_enter_trx_type_in_maintenance_screen() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMTRXTypeInMaintenanceScreen_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMTRXTypeInMaintenanceScreen_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMTRXTypeInMaintenanceScreen_612());
	        csmTransferAccountsobj.CSMTRXTypeInMaintenanceScreen_612().sendKeys(testData.get("TRXType_D1"));
	        csmTransferAccountsobj.CSMTRXTypeInMaintenanceScreen_612().sendKeys(Keys.TAB);
	          // csmTransferAccountsobj.CSMTRXTypeInMaintenanceScreen().sendKeys("",Keys.TAB);
	        
	    }
	    @And("^User_612 Enter the BranchCode in debit Ac in Maintenance Screen$")
	    public void user_enter_the_branch_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_BranchCodeINdebitAc_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_BranchCodeINdebitAc_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_BranchCodeINdebitAc_612());
	        csmTransferAccountsobj.CSM_BranchCodeINdebitAc_612().sendKeys(testData.get("BranchCode_D1"),Keys.TAB);
	        
	       }

	    @And("^User_612 Enter CurrencyCode in debit Ac in Maintenance Screen$")
	    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_CurrencyCodedebitAc_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_CurrencyCodedebitAc_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_CurrencyCodedebitAc_612());
	        csmTransferAccountsobj.CSM_CurrencyCodedebitAc_612().sendKeys(testData.get("CurrencyCode_D1"),Keys.TAB);
	        
	          
	    }

	    @And("^User_612 Enter GLCode in debit Ac in Maintenance Screen$")
	    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_GLCodedebitAc_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_GLCodedebitAc_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_GLCodedebitAc_612());
	        csmTransferAccountsobj.CSM_GLCodedebitAc_612().sendKeys(testData.get("GLCode_D1"));
	        csmTransferAccountsobj.CSM_GLCodedebitAc_612().sendKeys(Keys.TAB);
	        
	    }

	    @And("^User_612 Enter CIFCode in debit Ac in Maintenance Screen$")
	    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_CIFCodeIndebitAc_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_CIFCodeIndebitAc_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_CIFCodeIndebitAc_612());
	        csmTransferAccountsobj.CSM_CIFCodeIndebitAc_612().sendKeys(testData.get("CIFCode_D1"));
	        csmTransferAccountsobj.CSM_CIFCodeIndebitAc_612().sendKeys(Keys.TAB);
	        
	    }

	    @And("^User_612 Enter Serialin debit Ac in Maintenance Screen$")
	    public void user_enter_serial_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_SerialIndebitAc_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_SerialIndebitAc_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_SerialIndebitAc_612());
	        csmTransferAccountsobj.CSM_SerialIndebitAc_612().sendKeys(testData.get("SerialNo_D1"));
	        csmTransferAccountsobj.CSM_SerialIndebitAc_612().sendKeys(Keys.TAB);
	        
	    }
	    @And("^User_612 Click OkButton in Warning PopUp Menu$")
	    public void User_612_click_ok_button_in_warning_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMOkButtonInWarningPopUpMenu_612());
	    	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMOkButtonInWarningPopUpMenu_612());
	    	        break;
				} catch (Exception e) {
					
				}
	    	}
	    }

	    @And("^User_612 Enter theCurrency in Maintenance Screen$")
	    public void User_enter_thecurrency_in_maintenance_screen() throws Throwable {
//	    	
//	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCurrencyInMaintenanceScreen_612());
	    			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMCurrencyInMaintenanceScreen_612());
	    	        //seleniumAction.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMCurrencyInMaintenanceScreen_612());
	    	        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMCurrencyInMaintenanceScreen_612());
	    	        csmTransferAccountsobj.CSMCurrencyInMaintenanceScreen_612().sendKeys(testData.get("CurrencyCode_D1"));
	    	        csmTransferAccountsobj.CSMCurrencyInMaintenanceScreen_612().sendKeys(Keys.TAB);
	    	        
	    	        //csmTransferAccountsobj.CSMCurrencyInMaintenanceScreen_612().sendKeys("840",Keys.TAB);
                  //break;
				} catch (Exception e) {
				Assert.fail(e.getMessage());
//					if (i==199) {
//						Assert.fail(e.getMessage());
					}
				}			
//			}   
//	    }
	    @And("^User_612 Enter the Amountin Maintenance Screen$")
	    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
	    		    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMAmountInMaintenanceScreen_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMAmountInMaintenanceScreen_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMAmountInMaintenanceScreen_612());
	        csmTransferAccountsobj.CSMAmountInMaintenanceScreen_612().sendKeys(testData.get("Amount"));
	        csmTransferAccountsobj.CSMAmountInMaintenanceScreen_612().sendKeys(Keys.TAB);
	      
	    		}
	    @And("^User_612 Click SaveButton in Maintenance Screen$")
	    public void user_click_save_button_in_maintenance_screen() throws Throwable {
	    	for (int i = 0; i <200; i++) {
				try {
					seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMSaveButtonInMaintenanceScreen_612());
		    	    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMSaveButtonInMaintenanceScreen_612());
		    	    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMSaveButtonInMaintenanceScreen_612());
		    	    break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    		
	    	        
	    }
	    @And("^User_612 Get the Transaction No in Success PopUp Menu for059$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for059() throws Throwable {
	    	
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.getTransactionNumber_612());
	    	String  transactionNo = csmTransferAccountsobj.getTransactionNumber_612().getText().substring(15, 19);
	       System.out.println(transactionNo);
	       CsmTransferAccountExcelData.updateTestData("TA_059_D1", "TRXNo", transactionNo); 
		     testData = CsmTransferAccountExcelData.getTestdata("TA_059_D1");
	    	
	    }
	    @And("^User_612 Get the Transaction No in Success PopUp Menu for058$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for058() throws Throwable {
	    	
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.getTransactionNumber_612());
	    	String  transactionNo = csmTransferAccountsobj.getTransactionNumber_612().getText().substring(15, 19);
	       System.out.println(transactionNo);
	       CsmTransferAccountExcelData.updateTestData("TA_058_D1", "TRXNo", transactionNo); 
		     testData = CsmTransferAccountExcelData.getTestdata("TA_058_D1");
	    	
	    }
	    @And("^User_612 Get the Transaction No in Success PopUp Menu for060$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for060() throws Throwable {
	    	
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.getTransactionNumber_612());
	    	String  transactionNo = csmTransferAccountsobj.getTransactionNumber_612().getText().substring(15, 19);
	       System.out.println(transactionNo);
	       CsmTransferAccountExcelData.updateTestData("TA_060_D1", "TRXNo", transactionNo); 
		     testData = CsmTransferAccountExcelData.getTestdata("TA_060_D1");
	    	
	    }
	    @And("^User_612 Get the Transaction No in Success PopUp Menu for061$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for061() throws Throwable {
	    	
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.getTransactionNumber_612());
	    	String  transactionNo = csmTransferAccountsobj.getTransactionNumber_612().getText().substring(15, 19);
	       System.out.println(transactionNo);
	       CsmTransferAccountExcelData.updateTestData("TA_061_D1", "TRXNo", transactionNo); 
		     testData = CsmTransferAccountExcelData.getTestdata("TA_061_D1");
	    	
	    }
	    @And("^User_612 Click OkButton in Success PopUp Menu$")
	    public void user_click_ok_button_in_success_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMOkButtonInSuccessPopUpMenu_612());
	    	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMOkButtonInSuccessPopUpMenu_612());
	    	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMOkButtonInSuccessPopUpMenu_612());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	    }
	    
	    @And("^User_612 Click on ApproveScreen under Transactions$")
	    public void user_click_on_approve_screen_under_transactions() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMApproveScreenUnderTransactions_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMApproveScreenUnderTransactions_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMApproveScreenUnderTransactions_612());
	    }

	    @And("^User_612 Enter the TransactionNo in Approve Screen$")
	    public void user_enter_the_transaction_no_in_approve_screen() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMTransactionNoInApproveScreen_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMTransactionNoInApproveScreen_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMTransactionNoInApproveScreen_612());
	        csmTransferAccountsobj.CSMTransactionNoInApproveScreen_612().sendKeys(testData.get("TRXNo"));
	        csmTransferAccountsobj.CSMTransactionNoInApproveScreen_612().sendKeys(Keys.ENTER);
	    }

	    @And("^User_612 Double Click on the TransactionNo$")
	    public void user_double_click_on_the_transaction_no() throws Throwable {
	    	try {
	    		if (csmTransferAccountsobj.Transactions_transactionNo_Doubleclk_612().isDisplayed());
		        {
		        	//seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.Transactions_transactionNo_Doubleclk_612());
		        	seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.Transactions_transactionNo_Doubleclk_612());
		        	seleniumActions.getClickAndActionsHelper().doubleClick(csmTransferAccountsobj.Transactions_transactionNo_Doubleclk_612());
		        }  
		        }
	         
			catch (Exception e) {
			
			}
	    	

}
	    @And("^User_612 Click on Ok Button in Success PopUp Menu for ApproveTranscation$")
	    public void user_click_on_ok_button_in_success_popup_menu_for_transcation() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMOkButtonInSuccessPopUpMenuForTranscation_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMOkButtonInSuccessPopUpMenuForTranscation_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMOkButtonInSuccessPopUpMenuForTranscation_612());
	    }
	    
	    @And("^User_612 Click on ApproveButton for approve the Transaction$")
	    public void user_click_on_approve_button_for_approve_the_transaction() throws Throwable {
	    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMApproveButtonInApproveScreen_612());
	        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMApproveButtonInApproveScreen_612());
	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMApproveButtonInApproveScreen_612());
	    }


@And("User_612 Click  on Apply to Void House Cheque under Transactions")
public void user_click_on_apply_to_void_house_cheque_under_transactions()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMApplytoVoidHouseChequemenu612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMApplytoVoidHouseChequemenu612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMApplytoVoidHouseChequemenu612());
    
   
}

@And("User_612 Enter the Transaction no in Apply to Void House Cheque")
public void user_enter_the_transaction_no_in_apply_to_void_house_cheque() throws Throwable{
    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMApplytoVoidHouseChequemenuTransactionNo_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMApplytoVoidHouseChequemenuTransactionNo_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMApplytoVoidHouseChequemenuTransactionNo_612());
    csmTransferAccountsobj.CSMApplytoVoidHouseChequemenuTransactionNo_612().sendKeys(testData.get("TRXNo"));
    csmTransferAccountsobj.CSMApplytoVoidHouseChequemenuTransactionNo_612().sendKeys(Keys.ENTER);
}

@And("User_612 Double Click on the TransactionNo in Apply to Void House Cheque")
public void user_double_click_on_the_transaction_no_in_apply_to_void_house_cheque()throws Throwable {
	
		try {
		if (csmTransferAccountsobj.CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612().isDisplayed());
        {
        	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612());
            seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612());
            seleniumActions.getClickAndActionsHelper().doubleClick(csmTransferAccountsobj.CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612());
        }  
        }
     
	catch (Exception e) {
	
	}
	
   
}

@And("User_612 Select the void Reason in Apply to Void House Cheque")
public void user_select_the_void_reason_in_apply_to_void_house_cheque()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612());
   seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmTransferAccountsobj.CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612(),"TEST");
}

@And("User_612 Click on Apply to Void House Cheque Button")
public void user_click_on_apply_to_void_house_cheque_button()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_ApplytoVoidHouseCheque_Button_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_ApplytoVoidHouseCheque_Button_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_ApplytoVoidHouseCheque_Button_612());
   
   
}

@And("User_612 Click on Void House Cheque under Transactions")
public void user_click_on_void_house_cheque_under_transactions() throws Throwable{
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_trsVoidHouseChequeMenu_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_trsVoidHouseChequeMenu_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_trsVoidHouseChequeMenu_612());
   
}

@And("User_612 Enter the Transaction no in Void House Cheque")
public void user_enter_the_transaction_no_in_void_house_cheque()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNo_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNo_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNo_612());
    csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNo_612().sendKeys(testData.get("TRXNo"));
    csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNo_612().sendKeys(Keys.ENTER);
}

@And("User_612 Double Click on the TransactionNo in  Void House Cheque")
public void user_double_click_on_the_transaction_no_in_void_house_cheque()throws Throwable {
   try {
	   if (csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612().isDisplayed()) {
		 //seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612());
		    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612());
		    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612()); 
			}
	   
} catch (Exception e) {
	
}
	
}

@And("User_612 Click on Void House Cheque Button")
public void user_click_on_void_house_cheque_button()throws Throwable {
    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_VoidBtn_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_VoidBtn_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_TRS_VoidHouseChequeMenu_VoidBtn_612());  
}
@And("user close the popup Tab")

public void user_close_the_popup_tab() throws Throwable {

//    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,

//            csmTransferAccountsobj.CSMCorecloseSymbol());

    for (int i = 0; i < 200; i++) {

        try {

          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMCorecloseSymbol());

            seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMCorecloseSymbol());

            break;

        } catch (Exception e) {
           
        }  

    }

    }	    
	   
//reverse
@And("User_612 Click ReverseMenu Under Transaction Screen")
public void user_click_reverse_menu_under_transaction_screen() throws Throwable{
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_Transaction_ReverseMenu_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_Transaction_ReverseMenu_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_Transaction_ReverseMenu_612());  

   
}

@And("User_612 Enter the TransactionNo Under ReverseMenu")
public void user_enter_the_transactionno_under_reverse_menu()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_Transaction_ReverseMenu_TransNo_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_Transaction_ReverseMenu_TransNo_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_Transaction_ReverseMenu_TransNo_612());
   
}

@And("User_612 Double Click on the TransactionNo in ReverseMenu")
public void user_double_click_on_the_transaction_no_in_reverse_menu()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_Transaction_ReverseMenu_TransNo_Doubletab_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_Transaction_ReverseMenu_TransNo_Doubletab_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_Transaction_ReverseMenu_TransNo_Doubletab_612());
   
}

//
//@And("User_612 Select a Reason in ReverseMenu")
//public void user_select_a_reason_in_reverse_menu() throws Throwable{
//	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.());
//    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.());
//    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.())
//   
//}

@And("User_612 Click ToReverseButton in ReverseMenu")
public void user_click_to_reverse_button_in_reverse_menu()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_Transaction_ReverseMenu_ToReverseButton_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_Transaction_ReverseMenu_ToReverseButton_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_Transaction_ReverseMenu_ToReverseButton_612());  
   
}

@And("User_612 Click  Approve ReverseMenu Under Transaction Screen")
public void user_click_approve_reverse_menu_under_transaction_screen()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_612());  
    
    
}

@And("User_612 Enter a transaction No in ApproveReverseMenu")
public void user_enter_a_transaction_no_in_approve_reverse_menu()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_TransNo_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_TransNo_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_TransNo_612());  
   // csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_TransNo_612().getText()
    
}

@And("User_612 Double Click the record in ApproveReverseMenu")
public void user_double_click_the_record_in_approve_reverse_menu() throws Throwable{
    
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_DoubleTab_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_DoubleTab_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_DoubleTab_612());  
}

@And("User_612 Click Reverse Button in ApproveReverseMenu")
public void user_click_reverse_button_in_approve_reverse_menu()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_ReverseButton_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_ReverseButton_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_Transaction_ApproveReverseMenu_DoubleTab_612());   
    
}
//@ta60
@And("User_612 Click AccountsMenu under CSMApplication")
public void user_click_accounts_menu_under_csm_application() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSMAccountsMenu612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSMAccountsMenu612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSMAccountsMenu612());   
    
   
}

@And("User_612 Click General Accounts in AccountsMenu")
public void user_click_general_accounts_in_accounts_menu()  throws Throwable{
   	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenuGeneralAcc612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenuGeneralAcc612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenuGeneralAcc612());   
}

@And("User_612 Click Supsend field in GeneralAccounts")
public void user_click_supsend_field_in_general_accounts()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenuGeneralAccSuspend612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenuGeneralAccSuspend612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenuGeneralAccSuspend612());   
   
}

@And("User_612 Enter the Glcode in Supsend field")
public void user_enter_the_glcode_in_supsend_field()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612()); 
    csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord().sendKeys(testData.get("GLCodeFA"));
   csmTransferAccountsobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord().sendKeys(Keys.ENTER);
   
}

@And("User_612 Double click a record in Supsend field")
public void user_double_click_a_record_in_supsend_field()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612());
   
}

@And("User_612 Select StatusReason in Supsend field")
public void user_select_reason_in_supsend_field() throws Throwable{
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612());
    csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612().sendKeys("1");
    csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612().sendKeys(Keys.TAB);
}

@And("User_612 Enter a describtion in Supsend field")
public void user_enter_a_describtion_in_supsend_field() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612());
    csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612().sendKeys("Ok");
    
}

@Then("User_612 Click a Supsend Button under Supsend field")
public void user_click_a_supsend_button_under_supsend_field() throws Throwable{
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612());
   
}

@And("User_612 Click Approve Suspend In GeneralAccounts")
public void user_click_approve_suspend_in_general_accounts() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612());
   
}

@And("User_612 Enter the Glcode in Approve Suspend")
public void user_enter_the_glcode_in_approve_suspend()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612());
    csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612().sendKeys(testData.get("GLCodeFA"));
    csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612().sendKeys(Keys.ENTER);
   
}

@And("User_612 Double click the record under Approve Suspend")
public void user_double_click_the_record_under_approve_suspend()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612());
   
}

@And("User_612 Click a Authorize Suspend Button under Approve Suspend")
public void user_click_a_authorize_suspend_button_under_approve_suspend()throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612());
    seleniumActions.getClickAndActionsHelper().moveToElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612());
    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransferAccountsobj.CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612()); 
   

}
@And("User_{int} Click on Close field under General Accounts")
public void user_click_on_close_field_under_general_accounts() {
    
}

@And("User_{int} Enter the Glcode in Close field")
public void user_enter_the_glcode_in_close_field() {
   
}

@And("User_{int} Double click the record in Close field")
public void user_double_click_the_record_in_close_field() {
}

@And("User_{int} Click Close Button in Close field")
public void user_click_close_button_in_close_field() {
    
   
}

@And("User_{int} Click Authorize Close in General Accounts")
public void user_click_authorize_close_in_general_accounts() {
    
}

@And("User_{int} Enter the Glcode under Authorize Close")
public void user_enter_the_glcode_under_authorize_close() {
    
}

@And("User_{int} Double click the record in Authorize Close")
public void user_double_click_the_record_in_authorize_close() {
   
}

@Then("User_{int} Click the Authorize Close Button")
public void user_click_the_authorize_close_button() {
    
}
}
