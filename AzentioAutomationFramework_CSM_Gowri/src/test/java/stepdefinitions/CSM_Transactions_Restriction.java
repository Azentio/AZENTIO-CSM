package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM_Passbook_OBJ;
import pageobjects.CSM_Transactions_OBJ;
import resources.BaseClass;


public class CSM_Transactions_Restriction extends BaseClass{
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSM_Transactions_OBJ csmTransactions = new CSM_Transactions_OBJ(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\TestData.xlsx";
	ExcelData csmTransactionsExcelData = new ExcelData(path,"CSM_Transactions","DataSet ID");
	Map<String, String> testData;

	@Given("^user login as csm core application$")
    public void user_login_as_csm_core_application() throws Throwable {
		String csmApplicationUrl = configFileRead.getCSMApplicationUrl();
		driver.get(csmApplicationUrl);
		login.loginIntoCSMApplication();
    }
	
	@And("^user click yes if we get force logout popup$")
    public void user_click_yes_if_we_get_force_logout_popup() throws Throwable {
		
        try {
        	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactions.ForceLogoutPopup());
            
             
            	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactions.ForceLogoutYes());
            	csmTransactions.ForceLogoutYes().click();
            
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
	
	
	@And("^user update test data set id for TC_SAD_0036$")
    public void user_update_test_data_set_id_for_tcsad0032() throws Throwable {
		testData = csmTransactionsExcelData.getTestdata("TC_SAD_0032_D1");
    }
	
	@And("^user click the transactions in menu options$")
    public void user_click_the_transactions_in_menu_options() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.Transactions());
		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactions.Transactions());
		seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactions.Transactions());
		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactions.Transactions());
		//csmTransactions.Transactions().click();
    }
	
	@And("^user click the maintenance in transactions$")
    public void user_click_the_maintenance_in_transactions() throws Throwable {
		//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.Maintenance());
		for(int i=0;i<200;i++) {
			try {
				seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactions.Maintenance());
				csmTransactions.Maintenance().click();
				break;
			} catch (Exception e) {
		     if(i==199) {
		    	Assert.fail(e.getMessage());
		     }
			}
		}
		
    }
	
	@And("^user enter the value in transactions type$")
    public void user_enter_the_value_in_transactions_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.TransactionsTrxType());
    	csmTransactions.TransactionsTrxType().click();
    	csmTransactions.TransactionsTrxType().sendKeys(testData.get("Transaction type"));
    }
	
	@And("^user click the transaction maintenance type icon$")
    public void user_click_the_search_icon_in_transaction_maintenance_type() throws Throwable {
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactions.TrxMaintance());
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactions.TrxMaintance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactions.TrxMaintance());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
			
		}
//		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactions.TrxMaintance());
//		seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactions.TrxMaintance());
        //csmTransactions.TrxMaintance().click();
    }

    @Then("^user enter the value for branch code in currency account$")
    public void user_enter_the_value_for_branch_code_in_currency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.BranchCode());
    	System.out.println(testData.get("Transaction Branchcode"));
        //csmTransactions.BranchCode().click();
        
        //csmTransactions.BranchCode().sendKeys(testData.get("Transaction Branchcode"));
        for(int i=0;i<200;i++) {
        	try {
        		csmTransactions.BranchCode().click();
                csmTransactions.BranchCode().sendKeys(testData.get("Transaction Branchcode"));
                break;
        	}catch(Exception e) {
        		if(i==199) {
        		Assert.fail(e.getMessage());
        		}
        	}
        }
        //csmTransactions.Transactions().sendKeys("0001");
    }
    
    @And("^user enter the value for currency code in curency account$")
    public void user_enter_the_value_for_currency_code_in_curency_account() throws Throwable {
    	System.out.println(testData.get("Currency code"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.CurrencyCode());
        //csmTransactions.CurrencyCode().click();
        //csmTransactions.CurrencyCode().sendKeys(testData.get("Currency code"));
        for(int i=0;i<200;i++) {
        	try {
        		csmTransactions.CurrencyCode().click();
                csmTransactions.CurrencyCode().sendKeys(testData.get("Currency code"));
                break;
        	}catch(Exception e) {
        		if(i==199) {
        		Assert.fail(e.getMessage());
        		}
        	}
        }
        //csmTransactions.Transactions().sendKeys("840");
    }
    
    @And("^user enter the value for GL code in currency account$")
    public void user_enter_the_value_for_gl_code_in_currency_account() throws Throwable {
    	System.out.println(testData.get("GL code"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.Glcode());
        csmTransactions.Glcode().click();
        csmTransactions.Glcode().sendKeys(testData.get("GL code"));
        //csmTransactions.Glcode().sendKeys("181");
    }

    @And("^user enter the value for CIF code in currency account$")
    public void user_enter_the_value_for_cif_code_in_currency_account() throws Throwable {
    	System.out.println(testData.get("CIF code"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.CifCode());
        csmTransactions.CifCode().click();
        csmTransactions.CifCode().sendKeys(testData.get("CIF code"));
        //csmTransactions.CifCode().sendKeys("12");
    }

    @And("^user enter the value for serial number in currency account$")
    public void user_enter_the_value_for_serial_number_in_currency_account() throws Throwable {
    	System.out.println(testData.get("Serial No"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.SerialNo());
        csmTransactions.SerialNo().click();
        csmTransactions.SerialNo().sendKeys(testData.get("Serial No"));
        //csmTransactions.SerialNo().sendKeys("000");
    }
    
    @Then("^user verify that the warning popup message in currency account$")
    public void user_verify_that_the_warning_popup_message_in_currency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.WarningMessage());
    	Assert.assertTrue(csmTransactions.WarningMessage().isDisplayed());
    }
    
    @And("^user click the ok button in currency account$")
    public void user_click_the_ok_button_in_currency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.WarningMessagePopupOk());
        csmTransactions.WarningMessagePopupOk().click();
    }
    
    @Then("^user click the search icon in currency account$")
    public void user_click_the_search_icon_in_currency_account() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.CreditAccountSearchIcon());
        csmTransactions.CreditAccountSearchIcon().click();
    }

    @Then("^user verify that the popup message$")
    public void user_verify_that_the_popup_message() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.AccessDeniedPopup());
        Assert.assertTrue(csmTransactions.AccessDeniedPopup().isDisplayed());
    }
    
    @And("^user click the ok button$")
    public void user_click_the_ok_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.AccessDeniedPopupOk());
        csmTransactions.AccessDeniedPopupOk().click();
    }

    @Then("^user logout from the csm application$")
    public void user_logout_from_the_csm_application1() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactions.LogoutButton());
        csmTransactions.LogoutButton().click();
    }
    
    
    
    
    //@TC_SAD_0037
    @And("^user update test data set id for TC_SAD_0037$")
    public void user_update_test_data_set_id_for_tcsad0037() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("TC_SAD_0032_D2");
    }
    
    //@TC_SAD_0038
    @And("^user update test data set id for TC_SAD_0038$")
    public void user_update_test_data_set_id_for_tcsad0038() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("TC_SAD_0032_D3");
    }
    
    //@TC_SAD_0039
    @And("^user update test data set id for TC_SAD_0039$")
    public void user_update_test_data_set_id_for_tcsad0039() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("TC_SAD_0032_D4");
    }
}
