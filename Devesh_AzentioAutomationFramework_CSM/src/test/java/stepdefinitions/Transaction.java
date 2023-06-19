package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.TransactionObj;
import pageobjects.TransactionOnStaffAccountsObj;
import resources.BaseClass;

public class Transaction extends BaseClass{
	WebDriver driver= BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	CSMLogin csmLogin = new CSMLogin(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader=new ConfigFileReader();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	TransactionOnStaffAccountsObj trxOnStaffAccountObj = new TransactionOnStaffAccountsObj(driver);
	TransactionObj transactionObj = new TransactionObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ExcelData excelData = new ExcelData(System.getProperty("user.dir") + "\\TestData\\CSM_TestData.xlsx",
			"TransactionTestData", "Data Set ID");
	Map<String, String> testData = new HashMap<>();
	String dataSetID;
	
	@Then("^select the transaction type$")
	public void select_the_transaction_type() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_TrxType_LookupButton());
    	trxOnStaffAccountObj.transactions_TrxType_LookupButton().click();
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_TrxTypeCode());
    	trxOnStaffAccountObj.transactions_TrxTypeCode().sendKeys(testData.get("TrxType"));
    	for (int i = 0; i <=200; i++) {
			try {
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath("//td[text()='"+testData.get("TrxType")+"']")));
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^fill the credit account details$")
	public void fill_the_credit_account_details() throws Throwable {
//		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode());
//    	trxOnStaffAccountObj.transactions_Maintenance_FromCurrencyCode().sendKeys(testData.get("CreditAccountCurrencyCode"));
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CreditAccountLookupButton());
    	trxOnStaffAccountObj.transactions_Maintenance_CreditAccountLookupButton().click();
    	
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_BranchCodeLookupInput());
    	for (int i = 0; i <=200; i++) {
			try {
				trxOnStaffAccountObj.transactions_Maintenance_BranchCodeLookupInput().sendKeys(testData.get("CreditAccountBranchCode"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CurrencyLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_CurrencyLookupInput().sendKeys(testData.get("CreditAccountCurrencyCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_GlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_GlCodeLookupInput().sendKeys(testData.get("CreditAccountGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CifLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_CifLookupInput().sendKeys(testData.get("CreditAccountCifNo"));
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance_SlNoLookupInput());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNoLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNoLookupInput().sendKeys(testData.get("CreditAccountSlNo"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_LookupFirstRecord());
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance_LookupFirstRecord());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_LookupFirstRecord());
    	clicksAndActionsHelper.doubleClick(trxOnStaffAccountObj.transactions_Maintenance_LookupFirstRecord());
    	
//    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CifNo());
//    	trxOnStaffAccountObj.transactions_Maintenance_CifNo().sendKeys(testData.get("CreditAccountCifNo"));
//    	try {
//    		trxOnStaffAccountObj.transactions_ViewMemoCloseButton().click();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNo());
//    	trxOnStaffAccountObj.transactions_Maintenance_SlNo().sendKeys(testData.get("CreditAccountSlNo"));
    	for (int i = 0; i <=200; i++) {
			try {
				if ((trxOnStaffAccountObj.transactions_Maintenance_AdditionalRef().getAttribute("prevvalue"))!=null) {
					break;
				}
			} catch (Exception e) {
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	for (int i = 0; i <= 10; i++) {
    		try {
    			transactionObj.transactions_Maintenance_WarningMessageOkButton().click();
    			break;
    		} catch (Exception e) {
    			// TODO: handle exception
    		}
		}
    	
	}
	
	@Then("^fill the debit account details$")
	public void fill_the_debit_account_details() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_FromAccountLookupButton());
    	trxOnStaffAccountObj.transactions_Maintenance_FromAccountLookupButton().click();
    	
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_BranchCodeLookupInput());
    	for (int i = 0; i <=200; i++) {
			try {
				trxOnStaffAccountObj.transactions_Maintenance_BranchCodeLookupInput().sendKeys(testData.get("DebitAccountBranchCode"));
				break;
			} catch (Exception e) {
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CurrencyLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_CurrencyLookupInput().sendKeys(testData.get("DebitAccountCurrencyCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_GlCode());
    	trxOnStaffAccountObj.transactions_Maintenance_GlCodeLookupInput().sendKeys(testData.get("DebitAccountGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_CifLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_CifLookupInput().sendKeys(testData.get("DebitAccountCifNo"));
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance_SlNoLookupInput());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_SlNoLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_SlNoLookupInput().sendKeys(testData.get("DebitAccountSlNo"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_LookupFirstRecord());
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance_LookupFirstRecord());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_LookupFirstRecord());
    	clicksAndActionsHelper.doubleClick(trxOnStaffAccountObj.transactions_Maintenance_LookupFirstRecord());
    	
    	for (int i = 0; i <= 2; i++) {
    		try {
    			waithelper.waitForElementToVisibleWithFluentWait(driver, transactionObj.transactions_Maintenance_WarningMessageOkButton(),5,2);
    			transactionObj.transactions_Maintenance_WarningMessageOkButton().click();
    			break;
    		} catch (Exception e) {
    			// TODO: handle exception
    		}
		}
    	
	}
	
	@Then("^fill the to account details$")
	public void fill_the_to_account_details() throws Throwable {
		try {
			javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance_ToAccountLookupButton());
		} catch (Exception e) {
			// TODO: handle exception
		}
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToAccountLookupButton());
    	trxOnStaffAccountObj.transactions_Maintenance_ToAccountLookupButton().click();
    	
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToBranchCodeLookupInput());
    	for (int i = 0; i <=200; i++) {
			try {
				trxOnStaffAccountObj.transactions_Maintenance_ToBranchCodeLookupInput().sendKeys(testData.get("CreditAccountBranchCode"));
				break;
			} catch (Exception e) {
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToCurrencyLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_ToCurrencyLookupInput().sendKeys(testData.get("CreditAccountCurrencyCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToGlCodeLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_ToGlCodeLookupInput().sendKeys(testData.get("CreditAccountGlCode"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToCifLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_ToCifLookupInput().sendKeys(testData.get("CreditAccountCifNo"));
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance_ToSlNoLookupInput());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToSlNoLookupInput());
    	trxOnStaffAccountObj.transactions_Maintenance_ToSlNoLookupInput().sendKeys(testData.get("CreditAccountSlNo"));
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToAccountLookupFirstRecord());
    	javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance_ToAccountLookupFirstRecord());
    	waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_ToAccountLookupFirstRecord());
    	clicksAndActionsHelper.doubleClick(trxOnStaffAccountObj.transactions_Maintenance_ToAccountLookupFirstRecord());
//    	driver.findElement(By.xpath(""));
    	
    	for (int i = 0; i < 1; i++) {
    		try {
    			waithelper.waitForElementToVisibleWithFluentWait(driver, transactionObj.transactions_Maintenance_WarningMessageOkButton(), 5,1);
    			transactionObj.transactions_Maintenance_WarningMessageOkButton().click();
    			break;
    		} catch (Exception e) {
    			// TODO: handle exception
    		}
		}
	}
	
	@Then("^enter the card no$")
    public void enter_the_card_no() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_CardNo());
		transactionObj.transactions_Maintenance_CardNo().sendKeys(testData.get("CardNo"));
//		waithelper.waitForElementToVisibleWithFluentWait(driver, transactionObj.transactions_Maintenance_WarningMessageOkButton(), 5, 2);
		for (int i = 0; i <= 5; i++) {
    		try {
    			transactionObj.transactions_Maintenance_WarningMessageOkButton().click();
    			break;
    		} catch (Exception e) {
    		}
		}
    }


	@Then("^enter the foreign currency$")
	public void enter_the_foreign_currency() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
		trxOnStaffAccountObj.transactions_Maintenance_Currency().click();
		
		for (int i = 0; i <= 2; i++) {
    		try {
    			waithelper.waitForElementToVisibleWithFluentWait(driver, transactionObj.transactions_Maintenance_WarningMessageOkButton(), 5, 2);
    			transactionObj.transactions_Maintenance_WarningMessageOkButton().click();
    			break;
    		} catch (Exception e) {
    		}
		}
		
		for (int i = 0; i <=200; i++) {
			try {
				if ((transactionObj.transactions_Maintenance_CardNo().getAttribute("prevvalue")).equalsIgnoreCase(testData.get("CardNo"))) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		trxOnStaffAccountObj.transactions_Maintenance_Currency().sendKeys(testData.get("Currency"));
		
	}

	@Then("^enter the amount$")
	public void enter_the_amount() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Amount());
		trxOnStaffAccountObj.transactions_Maintenance_Amount().click();
//		Thread.sleep(2000);
		for (int i = 0; i <=200; i++) {
			try {
				if ((trxOnStaffAccountObj.transactions_Maintenance_Currency().getAttribute("prevvalue")).equalsIgnoreCase(testData.get("Currency"))) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		trxOnStaffAccountObj.transactions_Maintenance_Amount().sendKeys(testData.get("Amount"));
//		javascripthelper.scrollIntoView(trxOnStaffAccountObj.transactions_Maintenance_AmountLabel());
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_AmountLabel());
		trxOnStaffAccountObj.transactions_Maintenance_AmountLabel().click();
		Thread.sleep(1500);
	}
	
	@Then("^click on account details button$")
	public void click_on_account_details_button() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_AccountDetailsButton());
		javascripthelper.scrollIntoView(transactionObj.transactions_Maintenance_AccountDetailsButton());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_AccountDetailsButton());
		transactionObj.transactions_Maintenance_AccountDetailsButton().click();
		
	}

	@Then("^click on add button$")
	public void click_on_add_button() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_AccountDetailsAddButton());
		for (int i = 0; i <=200; i++) {
			try {
				transactionObj.transactions_Maintenance_AccountDetailsAddButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^insert account 2 in the debit account details$")
	public void insert_account_2_in_the_debit_account_details() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountGLColumnRow1());
		transactionObj.transactions_Maintenance_DebitAccountGLColumnRow1().click();
		
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountGL());
		transactionObj.transactions_Maintenance_DebitAccountGL().sendKeys(testData.get("DebitAccountGlCode"));
		
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountCif());
		transactionObj.transactions_Maintenance_DebitAccountCif().click();
		Thread.sleep(500);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountCif());
		transactionObj.transactions_Maintenance_DebitAccountCif().sendKeys(testData.get("DebitAccountCifNo"));
		
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountSlNo());
		transactionObj.transactions_Maintenance_DebitAccountSlNo().click();
		Thread.sleep(800);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountSlNo());
		transactionObj.transactions_Maintenance_DebitAccountSlNo().sendKeys(testData.get("DebitAccountSlNo"));
		
		javascripthelper.scrollIntoView(transactionObj.transactions_Maintenance_DebitAccountAmountInTrs());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountAmountInTrs());
		transactionObj.transactions_Maintenance_DebitAccountAmountInTrs().click();
		Thread.sleep(800);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountAmountInTrs());
		transactionObj.transactions_Maintenance_DebitAccountAmountInTrs().sendKeys(testData.get("DebitAccountAmountInTrs"));
		
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountInstruction1());
		transactionObj.transactions_Maintenance_DebitAccountInstruction1().click();
		Thread.sleep(800);
		javascripthelper.scrollIntoView(transactionObj.transactions_Maintenance_DebitAccountInstruction2());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountInstruction1());
		transactionObj.transactions_Maintenance_DebitAccountInstruction1().sendKeys(testData.get("DebitAccountInstruction1"));
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountInstruction2());
		transactionObj.transactions_Maintenance_DebitAccountInstruction2().sendKeys(testData.get("DebitAccountInstruction2"));
	}
	
	@Then("^insert account 2 in the debit account details in new row$")
    public void insert_account_2_in_the_debit_account_details_in_new_row() throws Throwable {
		javascripthelper.scrollIntoView(transactionObj.transactions_Maintenance_DebitAccountGLColumnRow2());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountGLColumnRow2());
		transactionObj.transactions_Maintenance_DebitAccountGLColumnRow2().click();
		
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountGL());
		transactionObj.transactions_Maintenance_DebitAccountGL().sendKeys(testData.get("DebitAccountGlCode"));
		
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountSlNo());
		transactionObj.transactions_Maintenance_DebitAccountSlNo().click();
		Thread.sleep(500);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountSlNo());
		transactionObj.transactions_Maintenance_DebitAccountSlNo().sendKeys(testData.get("DebitAccountSlNo"));
		
		javascripthelper.scrollIntoView(transactionObj.transactions_Maintenance_DebitAccountAmountInTrs());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountAmountInTrs());
		transactionObj.transactions_Maintenance_DebitAccountAmountInTrs().click();
		Thread.sleep(800);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountAmountInTrs());
		transactionObj.transactions_Maintenance_DebitAccountAmountInTrs().sendKeys(testData.get("DebitAccountAmountInTrs"));
		
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountInstruction1());
		transactionObj.transactions_Maintenance_DebitAccountInstruction1().click();
		Thread.sleep(800);
		javascripthelper.scrollIntoView(transactionObj.transactions_Maintenance_DebitAccountInstruction2());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountInstruction1());
		transactionObj.transactions_Maintenance_DebitAccountInstruction1().sendKeys(testData.get("DebitAccountInstruction1"));
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_DebitAccountInstruction2());
		transactionObj.transactions_Maintenance_DebitAccountInstruction2().sendKeys(testData.get("DebitAccountInstruction2"));
		
    }
	
	@Then("^click on ok button to save the debit account details$")
    public void click_on_ok_button_to_save_the_debit_account_details() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_AccountDetailsOkButton());
		transactionObj.transactions_Maintenance_AccountDetailsOkButton().click();
    }

	
	@Then("^get the transaction number and store it$")
	public void get_the_transaction_number_and_store_it() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_SuccessMessage());
		String successMessage = transactionObj.transactions_Maintenance_SuccessMessage().getText();
		String transactionNumber = successMessage.replaceAll("\\D+","");
		System.out.println("Transaction Number - "+transactionNumber);
		excelData.updateTestData(dataSetID, "TransactionNo", transactionNumber);
		testData = excelData.getTestdata(dataSetID);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_SuccessMessageOkButton());
		transactionObj.transactions_Maintenance_SuccessMessageOkButton().click();
	}

	@Then("^navigate to approve under transaction$")
	public void navigate_to_approve_under_transaction() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve());
		javascripthelper.scrollIntoView(transactionObj.transactions_Approve());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve());
		transactionObj.transactions_Approve().click();;
	}

	@Then("^select the transaction number to approve$")
	public void select_the_transaction_number_to_approve() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve_TransactionNo());
		transactionObj.transactions_Approve_TransactionNo().sendKeys(testData.get("TransactionNo"));
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve_StatusSearch());
		transactionObj.transactions_Approve_StatusSearch().sendKeys(testData.get("Status"));
		transactionObj.transactions_Approve_StatusSearch().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve_TransactionNoFirstActiveRecord());
		clicksAndActionsHelper.doubleClick(transactionObj.transactions_Approve_TransactionNoFirstActiveRecord());
	}
	
	@Then("^click on approve button in transaction approve screen$")
    public void click_on_approve_button_in_transaction_approve_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve_ApproveButton());
		javascripthelper.scrollIntoView(transactionObj.transactions_Approve_ApproveButton());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve_ApproveButton());
		transactionObj.transactions_Approve_ApproveButton().click();
		boolean status = transactionObj.transactions_Approve_SuccessMessage().isDisplayed();
		Assert.assertTrue(status);
		String approvedTrxMessage = transactionObj.transactions_Approve_SuccessMessage().getText();
		System.out.println("Success Message - "+approvedTrxMessage);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_SuccessMessageOkButton());
		transactionObj.transactions_Maintenance_SuccessMessageOkButton().click();
    }
	
	@Then("^click on search button in transaction maintenance screen$")
    public void click_on_search_button_in_transaction_maintenance_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_SearchButton());
		for (int i = 0; i < 200; i++) {
			try {
				transactionObj.transactions_Maintenance_SearchButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					e.getMessage();
				}
			}
			
		}
    }

	@Then("^select the approved transaction record$")
	public void select_the_approved_transaction_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_TransactionNo());
		transactionObj.transactions_Maintenance_TransactionNo().sendKeys(testData.get("TransactionNo"));
		transactionObj.transactions_Maintenance_TransactionNo().sendKeys(Keys.ENTER);
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_TransactionNoFirstActiveRecord());
		clicksAndActionsHelper.doubleClick(transactionObj.transactions_Maintenance_TransactionNoFirstActiveRecord());
	}

	@Then("^click on booked entries under$")
	public void click_on_booked_entries_under() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_BookedEntriesButton());
		javascripthelper.scrollIntoView(transactionObj.transactions_Maintenance_BookedEntriesButton());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_BookedEntriesButton());
		transactionObj.transactions_Maintenance_BookedEntriesButton().click();;
		Thread.sleep(2000);
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	@Then("^enter the different foreign currency$")
    public void enter_the_different_foreign_currency() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, trxOnStaffAccountObj.transactions_Maintenance_Currency());
		trxOnStaffAccountObj.transactions_Maintenance_Currency().sendKeys(testData.get("Currency"));
    }

	//------------//////////////------------81-------------//////////////------------//
	
	@Then("^verify the warning message is displaying$")
	public void verify_the_warning_message_is_displaying() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_WarningMessageOkButton());
		for (int i = 0; i <= 5; i++) {
    		try {
    			boolean status = transactionObj.transactions_Maintenance_WarningMessageHeader().isDisplayed();
    			Assert.assertTrue(status);
    			String warningMessage=transactionObj.transactions_Maintenance_WarningMessage().getText();
    			System.out.println("Warning Message - "+warningMessage);
    			transactionObj.transactions_Maintenance_WarningMessageOkButton().click();
    			break;
    		} catch (Exception e) {
    			// TODO: handle exception
    			if(i==5) {
    				Assert.fail();
    			}
    		}
		}
	}
	
	@Then("^click on approve button to approve the cash deposit transaction$")
    public void click_on_approve_button_to_approve_the_cash_deposit_transaction() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve_ApproveButton());
		javascripthelper.scrollIntoView(transactionObj.transactions_Approve_ApproveButton());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Approve_ApproveButton());
		transactionObj.transactions_Approve_ApproveButton().click();
		for (int i = 0; i <= 200; i++) {
    		try {
    			browserHelper.SwitchToWindow(1);
    			browserHelper.switchToParentWithChildClose();
    			break;
    		} catch (Exception e) {
    			// TODO: handle exception
    		}
		}
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_WarningMessageOkButton());
		transactionObj.transactions_Maintenance_WarningMessageOkButton().click();
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_Maintenance_SuccessMessageOkButton());
		transactionObj.transactions_Maintenance_SuccessMessageOkButton().click();
    }
	
	////////////////////////////////////130-132/////////////////////////////////////////////////
	
	@Then("click on send alert approve button")
	public void click_on_send_alert_approve_button() {
	     waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_SendAlertBoxLocal_ApproveButton());
		transactionObj.transactions_SendAlertBoxLocal_ApproveButton().click();
	}

	@Then("enter the branch manager user name in user information")
	public void enter_the_branch_manager_user_name_in_user_information() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_UserInformation_UserInputField());
		transactionObj.transactions_UserInformation_UserInputField().sendKeys(testData.get("BM UserName"));
	    
	}

	@Then("enter the branch manager user password in user information")
	public void enter_the_branch_manager_user_password_in_user_information() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_UserInformation_PwdInputField());
		transactionObj.transactions_UserInformation_PwdInputField().sendKeys(testData.get("BM Password"));
	    
	}

	@Then("click on submit button in user information")
	public void click_on_submit_button_in_user_information() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_UserInformation_SubmitButton());
		transactionObj.transactions_UserInformation_SubmitButton().click();
	    
	}

	@Then("click on approve button in approve item alert box")
	public void click_on_approve_button_in_approve_item_alert_box() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_ApproveItemAlertBox_ApproveButton());
		transactionObj.transactions_ApproveItemAlertBox_ApproveButton().click();
	}
	
	@Then("select the reject reason from dropdown")
	public void select_the_reject_reason_from_dropdown() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_ApproveItemAlertBox_RejectReason());
		transactionObj.transactions_ApproveItemAlertBox_RejectReason().click();
		WebElement dropdown = transactionObj.transactions_ApproveItemAlertBox_RejectReason();
		Select s = new Select(dropdown);
		s.selectByIndex(1);
	}

	@Then("click on reject button in approve item alert box")
	public void click_on_reject_button_in_approve_item_alert_box() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_ApproveItemAlertBox_RejectButton());
		transactionObj.transactions_ApproveItemAlertBox_RejectButton().click();
	}
	
	@Then("enter the modify reason in the textarea")
	public void enter_the_modify_reason_in_the_textarea() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_ApproveItemAlertBox_ModifyReason());
		transactionObj.transactions_ApproveItemAlertBox_ModifyReason().sendKeys(testData.get("ModifyReason"));
	}

	@Then("click on modify button in approve item alert box")
	public void click_on_modify_button_in_approve_item_alert_box() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_ApproveItemAlertBox_ModifyButton());
		transactionObj.transactions_ApproveItemAlertBox_ModifyButton().click();
	}
	
	@Then("verify the current status of local approve by branch manager is approved")
	public void verify_the_current_status_of_local_approve_by_branch_manager_is_approved() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_LocalAlertApprove_CurrentStatus());
		boolean status = transactionObj.transactions_LocalAlertApprove_CurrentStatus().getAttribute("value").equalsIgnoreCase("Approved");
		Assert.assertTrue(status);
	}
	
	@Then("verify the current status of local approve by branch manager is rejected")
	public void verify_the_current_status_of_local_approve_by_branch_manager_is_rejected() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_LocalAlertApprove_CurrentStatus());
		boolean status = transactionObj.transactions_LocalAlertApprove_CurrentStatus().getAttribute("value").equalsIgnoreCase("Rejected");
		Assert.assertTrue(status);
	}
	
	////////////////////////////////////////163-169/////////////////////////////////////////////
	
	@Then("select the cash deduct option from charges details")
	public void select_the_cash_deduct_option_from_charges_details() {
//		javascripthelper.scrollIntoView(transactionObj.transactions_TrxManagement_ChargesDeductDropdown());
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_TrxManagement_ChargesDeductDropdown());
		transactionObj.transactions_TrxManagement_ChargesDeductDropdown().click();;
		WebElement cashDeductDropdown = transactionObj.transactions_TrxManagement_ChargesDeductDropdown();
		Select sel = new Select(cashDeductDropdown);
		sel.selectByValue("3");
	}
	
	@Then("amend charge amount from 10 to 5")
	public void amend_charge_amount_from_10_to_5() {
		//td[text()='163']/../descendant::input
		String beforexpath = "//td[text()='";
		String afterxpath = "']/../descendant::input";
		for (int i = 0; i <=200; i++) {
			try {
				javascripthelper.scrollIntoView(driver.findElement(By.xpath(beforexpath+testData.get("ChargeCode")+afterxpath)));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath+testData.get("ChargeCode")+afterxpath)));
		driver.findElement(By.xpath(beforexpath+testData.get("ChargeCode")+afterxpath)).click();;
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_TrxManagement_NewAmount());
		transactionObj.transactions_TrxManagement_NewAmount().sendKeys("5");
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_TrxManagement_ApplyToSelectAmount());
		transactionObj.transactions_TrxManagement_ApplyToSelectAmount().click();
	}
	
	@Then("verify the stopper message must display")
	public void verify_the_stopper_message_must_display() {
		
	}
	
	@Then("click on charges button")
	public void click_on_charges_button() {
		for (int i = 0; i <= 5; i++) {
			try {
				transactionObj.transactions_TrxManagement_ChargesButton().click();
				waithelper.waitForElementToVisibleWithFluentWait(driver, transactionObj.transactions_TrxManagement_NewAmount(),2,1);
				transactionObj.transactions_TrxManagement_NewAmount().isDisplayed();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				transactionObj.transactions_TrxManagement_ChargesButton().click();
			}
		}
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_TrxManagement_NewAmount());
		transactionObj.transactions_TrxManagement_NewAmount().isDisplayed();
	}
	
	@Then("click on waive charges button")
	public void click_on_waive_charges_button() {
		waithelper.waitForElementwithFluentwait(driver, transactionObj.transactions_TrxManagement_WaiveChargesButton());
		transactionObj.transactions_TrxManagement_WaiveChargesButton().click();
	}
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////

	@Then("^select data set ID for Checking Multi Transfer Main Credit Transaction fc to same fc$")
	public void select_data_set_id_for_checking_multi_transfer_main_credit_transaction_fc_to_same_fc() throws Throwable {
		dataSetID = "TRS_35_D1";
    	testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for checking Cash Deposit Transaction fc to different fc$")
    public void select_data_set_id_for_checking_cash_deposit_transaction_fc_to_different_fc() throws Throwable {
		dataSetID = "TRS_36_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
	
	@Then("^select data set ID for checking Single Transfer Main Debit Intra Transaction fc to different fc$")
    public void select_data_set_id_for_checking_single_transfer_main_debit_intra_transaction_fc_to_different_fc() throws Throwable {
		dataSetID = "TRS_37_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
	
	@Then("^select data set ID for Checking Cash Deposit Transaction and Warn User if Limit Exceeds Checked$")
    public void select_data_set_id_for_checking_cash_deposit_transaction_and_warn_user_if_limit_exceeds_checked() throws Throwable {
		dataSetID = "TRS_81_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
	
	@Then("^select data set ID for Checking Cash Deposit Transaction and Warn User if Limit Exceeds UnChecked$")
    public void select_data_set_id_for_checking_cash_deposit_transaction_and_warn_user_if_limit_exceeds_unchecked() throws Throwable {
		dataSetID = "TRS_82_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
	
	@Then("^select data set ID for Checking Cash Deposit Transaction and warn user if Limit Exceeds Checked and Override Percentage Defined$")
    public void select_data_set_id_for_checking_cash_deposit_transaction_and_warn_user_if_limit_exceeds_checked_and_override_percentage_defined() throws Throwable {
		dataSetID = "TRS_83_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
	
	@Then("^select data set ID for Checking Cash Deposit Transaction and warn and proceed user if Limit Exceeds Checked and Override Percentage Defined$")
    public void select_data_set_id_for_checking_cash_deposit_transaction_and_warn_and_proceed_user_if_limit_exceeds_checked_and_override_percentage_defined() throws Throwable {
		dataSetID = "TRS_84_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
	
	@Then("^select data set ID for Checking Cash Deposit Transaction and Alert Modify$")
	public void select_data_set_ID_for_Checking_Cash_Deposit_Transaction_and_Alert_Modify() throws Throwable {
		dataSetID = "TRS_129_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for Checking Cash Deposit Transaction and Alert Approve Local$")
	public void select_data_set_ID_for_Checking_Cash_Deposit_Transaction_and_Alert_Approve_Local() throws Throwable {
		dataSetID = "TRS_130_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for Checking Cash Deposit Transaction and Alert Reject Local$")
	public void select_data_set_ID_for_Checking_Cash_Deposit_Transaction_and_Alert_Reject_Local() throws Throwable {
		dataSetID = "TRS_131_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for Checking Cash Deposit Transaction and Alert Modify Local$")
	public void select_data_set_ID_for_Checking_Cash_Deposit_Transaction_and_Alert_Modify_Local() throws Throwable {
		dataSetID = "TRS_132_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for test case TRS163$")
	public void select_data_set_ID_test_case_TRS163() throws Throwable {
		dataSetID = "TRS_163_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for test case TRS164$")
	public void select_data_set_ID_test_case_TRS164() throws Throwable {
		dataSetID = "TRS_164_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for test case TRS165$")
	public void select_data_set_ID_test_case_TRS165() throws Throwable {
		dataSetID = "TRS_165_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for test case TRS166$")
	public void select_data_set_ID_test_case_TRS166() throws Throwable {
		dataSetID = "TRS_166_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
	@Then("^select data set ID for test case TRS167$")
	public void select_data_set_ID_test_case_TRS167() throws Throwable {
		dataSetID = "TRS_167_D1";
		testData = excelData.getTestdata(dataSetID);
	}
	
}	