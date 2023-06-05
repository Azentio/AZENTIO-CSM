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
	UserUtility UserUtility = new UserUtility();
	
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
    	
    	UserUtility.enterDataAndTab(seleniumActions, driver, transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen(), "215");
        
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
    


}




















































































































































































































































































































































































































































































































































































































































































































































    

