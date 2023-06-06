package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;
import vimal.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.csm.CSMSADS_TransactiononstaffaccObj;
import pageobjects.csm.CSM_Transaction_Object;
import resources.BaseClass;

public class CSM_TransactionIntra extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	CSMSADS_TransactiononstaffaccObj transactiononstaffaccObj = new CSMSADS_TransactiononstaffaccObj(driver);
	CSM_Transaction_Object CsmTransactionObject = new CSM_Transaction_Object(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSMLogin login = new CSMLogin(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"CSMTransactionStaffAcc","Data Set ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCase ID");
//	Map<String, String> testData = new HashMap<>();
//	Map<String, String> loginTestData = new HashMap<>();
	Map<String, String> testData;
	ConfigFileReader configFileReader = new ConfigFileReader();
	UserUtility userUtility = new UserUtility();
	
	//********************************************************** @TRS_0012 ***********************************************
	

	String refid = null;
	
    @And("^User enters the transaction type$")
    public void userEntersTheTransactionType() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);
    }
    
    @And("^User enters the Main credit transaction type$")
    public void userEntersTheMainCreditTransactionType() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("213",Keys.TAB);
    }

    @And("^User enters the GL code for debit account$")
    public void userEntersTheGLCodeForDebitAccount() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction().sendKeys("312",Keys.TAB);
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().doubleClick(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
        
        
    }
    
    @And("^User enters the GL code for credit account$")
    public void userEntersTheGLCodeForCreditAccount() throws Throwable {
    	
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmSecondAccountCheckUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmSecondAccountCheckUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmSecondAccountCheckUnderTheTransaction());
        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmSecondAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmSecondAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmSecondAccountCheckGLCodeUnderTheTransaction());
        CsmTransactionObject.csmSecondAccountCheckGLCodeUnderTheTransaction().sendKeys("313",Keys.TAB);
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmSecondAccountCheckGLCodeSelectUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmSecondAccountCheckGLCodeSelectUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().doubleClick(CsmTransactionObject.csmSecondAccountCheckGLCodeSelectUnderTheTransaction());
        
    }
    
    @And("^User Enter the GL Code in Account under By Trade Date Screens$")
    public void user_enter_the_gl_code_in_account_under_by_trade_date_screens() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
        //transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("GL Code"),Keys.TAB);
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
        
        CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries().sendKeys("312",Keys.TAB);
        Thread.sleep(15000);
        seleniumActions.getClickAndActionsHelper().doubleClick(CsmTransactionObject.csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries());
        
    }

    @And("^User enters the GL code for the second account$")
    public void userEntersTheGLCodeForTheSecondAccount() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
        
        for (int i = 0; i < 50; i++) {
			try {
				if (CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries().isEnabled()) {
					seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmAccountSearchIconUnderTheTradeByDateUnderTheQueries());
		    	    break;
				}
								
			} catch (Exception e) {
				
			}
		}
        
        
        //transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("GL Code"),Keys.TAB);
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries());
        
        CsmTransactionObject.csmGLCodeUnderTheTradeByDateUnderTheQueries().sendKeys("313",Keys.TAB);
        Thread.sleep(15000);
        seleniumActions.getClickAndActionsHelper().doubleClick(CsmTransactionObject.csm_SelectGLCodeUnderTheTradeByDateUnderTheQueries());
    }

    @And("^User Get the Transaction No in Success PopUo Menus$")
    public void user_get_the_transaction_no_in_success_popuo_menu() throws Throwable {
    	String text = "";
        for (int i = 0; i <200; i++) {
			try {
				text = transactiononstaffaccObj.CSMGetTheTransactionNo().getText();
			    break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
        refid = text.substring(15, 19);
        System.out.println(refid);
    }

    @And("^User Enter the Transaction No in Approve Screens$")
    public void user_enter_the_transaction_no_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTransactionNoInApproveScreen());
        transactiononstaffaccObj.CSMTransactionNoInApproveScreen().sendKeys(refid, Keys.ENTER);
    }
    
    @And("^User Enter the Transaction No in Search Boxs$")
    public void user_enter_the_transaction_no_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());
        transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox().sendKeys(refid,Keys.ENTER);
    }
	



//********************************************************** @TRS_0054 ***********************************************

    
	@And("^User enters the transaction type for deposit account with AC CY and Trx CY must be same$")
	public void userEntersTheTransactionTypeForDepositAccountWithACCYAndTrxCYMustBeSame() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("477",Keys.TAB);
	}


	@And("^User enters the GL code for credit account for deposit account with AC CY and Trx CY must be same$")
    public void userEntersTheGLCodeForCreditAccountForDepositAccountWithACCYAndTrxCYMustBeSame() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction().sendKeys("312",Keys.TAB);
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().doubleClick(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
	}

	@And("^User validate the currency code for the transaction currency and the account currency$")
    public void userValidateTheCurrencyCodeForTheTransactionCurrencyAndTheAccountCurrency() throws Throwable {
		
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstTransactionCurrencyUnderTheMaintenance());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstTransactionCurrencyUnderTheMaintenance());
        
        String firstTrxCurrencyCode = CsmTransactionObject.csmFirstTransactionCurrencyUnderTheMaintenance().getAttribute("prevvalue");
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmCurrencyCodeUnderTheMaintenance());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmCurrencyCodeUnderTheMaintenance());
        
        String TrxCurrencyCode = CsmTransactionObject.csmCurrencyCodeUnderTheMaintenance().getAttribute("prevvalue");
        
        assertEquals(firstTrxCurrencyCode, TrxCurrencyCode);
        
        if(firstTrxCurrencyCode.equals(TrxCurrencyCode)) {
        	System.out.println("Both the transcation codes are matching " + "The values are: " + firstTrxCurrencyCode + ", " + TrxCurrencyCode);
        }
                      
    }


    @And("^User Click Save Button in Maintenance Screens$")
    public void user_click_save_button_in_maintenance_screen() throws Throwable {
    	
    	try {
        	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
            seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
            seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	
    	for (int i = 0; i <200; i++) {
			try {			
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
		    	seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
		    	seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
		    	break;										
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}    		    	        
    }
    
    @And("^User enters the transaction type for main debt account with AC CY and Trx CY must be same$")
    public void userEntersTheTransactionTypeForMainDebtAccountWithACCYAndTrxCYMustBeSame() throws Throwable {
    	
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("214",Keys.TAB);
        
    }
    
//    @And("^User enters the transaction type for deposit account with AC CY equal to Trx CY$")
//    public void userEntersTheTransactionTypeForDepositAccountWithACCYEqualToTrxCY() throws Throwable {
//    	
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
//        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("215",Keys.TAB);
//        
//    }
    
    @And("^User enters the transaction type for deposit account with AC CY equal to Trx CY$")
    public void userEntersTheTransactionTypeForDepositAccountWithACCYEqualToTrxCY() throws Throwable {
    	
    	userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(), "215");
        
    }

    @And("^User enters the GL code for credit account for deposit account with AC CY equal to Trx CY$")
    public void userEntersTheGLCodeForCreditAccountForDepositAccountWithACCYEqualToTrxCY() throws Throwable {
    	
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckUnderTheTransaction());
        //transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
//        transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys("312",Keys.TAB);
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().clickOnElement(CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction());
        CsmTransactionObject.csmFirstAccountCheckGLCodeUnderTheTransaction().sendKeys("312",Keys.TAB);
        
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().moveToElement(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
        seleniumActions.getClickAndActionsHelper().doubleClick(CsmTransactionObject.csmFirstAccountCheckGLCodeSelectUnderTheTransaction());
    	
    }
    
    
    // ___________________________________________ TRS_0051 _______________________________________________________________________________________________
    
    @And("^User Enters the Date in User Running Date$")
    public void user_enters_the_date_in_user_running_date() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMDateInUserRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDateInUserRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMDateInUserRunningDate());
        transactiononstaffaccObj.CSMDateInUserRunningDate().clear();
        //transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(userUtility.currentDate());
    }
    
    @And("^User enters the Multi Transfer Main Credit Transaction Interbranch transaction type$")
    public void UserEntersTheMultiTransferMainCreditTransactionInterbranchTransactionType() {
    	userUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(), userUtility.getExcelData("TRS_0051", "TrxType"));
    }
    
    @And("^User Enter the Branch Code in Credit Ac in Maintenance Screen for TRS_0051$")
    public void UserEnterTheBranchCodeInCreditAcInMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountBranchCodeUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "BranchCode1"));
    }
    @And("^User Enter Currency Code in Credit Ac in Maintenance Screen for TRS_0051$")
    public void UserEnterCurrencyCodeInCreditAcInMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountCurrencyCodeUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "CurrencyCode1"));

    }
    @And("^User Enter GL Code in Credit Ac in Maintenance Screen for TRS_0051$")
    public void UserEnterGlCodeInCreditAcInMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountGLCodeUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "GLCode1"));
    }
    @And("^User Enter CIF Code in Credit Ac in Maintenance Screen for TRS_0051$")
    public void UserEnterCifCodeInCreditAcInMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountCIFCodeUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "CIFNo1"));
    }
    @And("^User Enter Serial in Credit Ac in Maintenance Screen for TRS_0051$")
    public void UserEnterSerialInCreditAcInMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountSerialNoUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "SLNO1"));
    }
    @And("^User Enter the Currency in Maintenance Screen for TRS_0051$")
    public void UserEnterTheCurrencyInMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmCurrencyCodeForTRXUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "TRXCURCODE"));
    }
    @And("^User Enter the Amount in Maintenance Screen for TRS_0051$")
    public void UserEnterTheAmountInMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmEnterAmountForTRXUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "CreditAmount1"));
    }
    @And("^User click on the account details button$")
    public void UserClickOnTheAccountDetailsButton() {
    	userUtility.clickOnElement(seleniumActions, driver, CsmTransactionObject.csmAccuntDetailsLabelUnderMaintenenanceTRX());
    }
    @And("^User clicks on the plus icon to add the account details$")
    public void UserClicksOnThePlusIconToAddTheAccountDetails() {
    	userUtility.clickOnElement(seleniumActions, driver, CsmTransactionObject.csmAddRowUnderAccuntDetailsLabelUnderMaintenenanceTRX());
    }
    @And("^User Enter the Branch Code in Debit Ac1 in Maintenance Screen for TRS_0051$")
    public void UserEnterTheBranchCodeInDebitAc1InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "BranchCode2"));
    }
    @And("^User Enter Currency Code in Debit Ac1 in Maintenance Screen for TRS_0051$")
    public void UserEnterCurrencyCodeInDebitAc1InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "CurrencyCode2"));
    }
    @And("^User Enter GL Code in Debit Ac1 in Maintenance Screen for TRS_0051$")
    public void UserEnterGlCodeInDebitAc1InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), "312");
    }
    @And("^User Enter CIF Code in Debit Ac1 in Maintenance Screen for TRS_0051$")
    public void UserEnterCifCodeInDebitAc1InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "CIFNo2"));
    }
    @And("^User Enter Serial in Debit Ac1 in Maintenance Screen for TRS_0051$")
    public void UserEnterSerialInDebitAc1InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "SLNO2"));
    }
    @And("^User Enter the debit amount for Ac1 for TRS_0051$")
    public void UserEnterTheDebitAmountForAc1ForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmFirstAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "DebitAmount1"));
    }
    @And("^User Enter the Branch Code in Debit Ac2 in Maintenance Screen for TRS_0051$")
    public void UserEnterTheBranchCodeInDebitAc2InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmSecondAccountBranchCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "BranchCode3"));
    }
    @And("^User Enter GL Code in Debit Ac2 in Maintenance Screen for TRS_0051$")
    public void UserEnterGlCodeInDebitAc2InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmSecondAccountGLCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "GLCode3"));
    }
    @And("^User Enter CIF Code in Debit Ac2 in Maintenance Screen for TRS_0051$")
    public void UserEnterCifCodeInDebitAc2InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmSecondAccountCIFCodeUnderAccuntDetailsLabelUnderMaintenenanceTRX(), "00993607");
    }
    @And("^User Enter Serial in Debit Ac2 in Maintenance Screen for TRS_0051$")
    public void UserEnterSerialInDebitAc2InMaintenanceScreenForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmSecondAccountSINOUnderAccuntDetailsLabelUnderMaintenenanceTRX(), "000");
    }
    @And("^User Enter the debit amount for Ac2 for TRS_0051$")
    public void UserEnterTheDebitAmountForAc2ForTrs_0051() {
    	userUtility.enterDataAndTab(seleniumActions, driver,CsmTransactionObject.csmSecondAccountEnterAmountUnderAccuntDetailsLabelUnderMaintenenanceTRX(), userUtility.getExcelData("TRS_0051", "DebitAmount1"));
    }
    @And("^User clicks on the ok button after adding the debit account details$")
    public void UserClicksOnTheOkButtonAfterAddingTheDebitAccountDetails() {
    	userUtility.clickOnElement(seleniumActions, driver, CsmTransactionObject.csmClickOKUnderAccuntDetailsLabelUnderMaintenenanceTRX());
    }
    
    @And("^User double clicks on the branch code in Ac1 in add account details$")
    public void UserDoubleClicksOnTheBranchCodeInAc1InAddAccountDetails() {
    	userUtility.doubleClickOnElement(seleniumActions, driver, CsmTransactionObject.csmFirstAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX());;
    }
    
    @And("^User double clicks on the branch code in Ac2 in add account details$")
    public void UserDoubleClicksOnTheBranchCodeInAc2InAddAccountDetails() {
    	userUtility.doubleClickOnElement(seleniumActions, driver, CsmTransactionObject.csmSecondAccountBranchCodeEmptyUnderAccuntDetailsLabelUnderMaintenenanceTRX());
    }
    
    

}




















































































































































































































































































































































































































































































































































































































































































































































    

