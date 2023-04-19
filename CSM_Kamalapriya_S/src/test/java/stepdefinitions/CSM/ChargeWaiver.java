package stepdefinitions.CSM;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CSM.ChargeWaiverObject;
import resources.BaseClass;

public class ChargeWaiver extends BaseClass  {
	WebDriver driver =BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	ChargeWaiverObject chargeWaiverObj = new ChargeWaiverObject(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clickAndActionHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javaScriptHelper =new JavascriptHelper();
	String CSMTestDataPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(CSMTestDataPath, "Charge Waiver", "Data Set ID");
		Map<String, String> testData ;
		DropDownHelper dropDownHelper = new DropDownHelper(driver);
		//ExcelData testExecution = new ExcelData(sadsTestDataPath,"TestExecution","TestCaseID");
		//Map<String, String> testExecutionData;
		

	    @And("^Get the data set id for FMA$")
	    public void get_the_data_set_id_for_fma() throws Throwable {
			testData = excelData.getTestdata("CW_008_D1");

	    }

		
		@And("^Click the accounts falg$")
		    public void click_the_accounts_falg() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_AccountsFlag());
			clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_AccountsFlag());
			chargeWaiverObj.chargeWaiver_AccountsFlag().click();
			
		}
	
	
	    @Then("^Click the Fixed Maturity Accounts under accounts$")
    public void click_the_fixed_maturity_accounts_under_accounts() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FixedMaturityAccount());
			clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FixedMaturityAccount());
			chargeWaiverObj.chargeWaiver_Accounts_FixedMaturityAccount().click(); 
			}
	    @And("^Click the openings under fixed maturity accounts$")
	    public void click_the_openings_under_fixed_maturity_accounts() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FMA_Opening());
			clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FMA_Opening());
			chargeWaiverObj.chargeWaiver_Accounts_FMA_Opening().click();	  
			
	    }
	   
    @Then("^Enter the currency code under FMA$")
    public void enter_the_currency_code_under_fma() throws Throwable {
    	Thread.sleep(2000);
    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FMA_CurrencyCode());
		clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FMA_CurrencyCode());
		chargeWaiverObj.chargeWaiver_Accounts_FMA_CurrencyCode().click();
		chargeWaiverObj.chargeWaiver_Accounts_FMA_CurrencyCode().sendKeys(testData.get("Currency Code"));
		chargeWaiverObj.chargeWaiver_Accounts_FMA_CurrencyClick().click();
		}

    @And("^Enter the GL Type under FMA$")
    public void enter_the_gl_type_under_fma() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FMA_GLType());
		clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FMA_GLType());
		chargeWaiverObj.chargeWaiver_Accounts_FMA_GLType().click();
		chargeWaiverObj.chargeWaiver_Accounts_FMA_GLType().sendKeys(testData.get("GL Type"));
		chargeWaiverObj.chargeWaiver_Accounts_FMA_CurrencyClick().click();   
		}

    @Then("^Enter the CIF number under FMA$")
    public void enter_the_cif_number_under_fma() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FMA_CIFNo());
		clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FMA_CIFNo());
		chargeWaiverObj.chargeWaiver_Accounts_FMA_CIFNo().click();
		chargeWaiverObj.chargeWaiver_Accounts_FMA_CIFNo().sendKeys(testData.get("CIF No"));
		chargeWaiverObj.chargeWaiver_Accounts_FMA_CurrencyClick().click();    
		}
    @And("^Click the Instruction under FMA$")
    public void click_the_instruction_under_fma() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction());
		clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction());
		chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction().click();
    }

    @Then("^Enter the transfer amount under instruction$")
    public void enter_the_transfer_amount_under_instruction() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TransferAmount());
		clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TransferAmount());
		chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TransferAmount().click();
		chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TransferAmount().sendKeys(testData.get("TranferAmount"));
		chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TrxType_Click().click();  
    }
  
    @And("^Enter the transaction type under instruction$")
    public void enter_the_transaction_type_under_instruction() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TrxType());
		clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TrxType());
		chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TrxType().click();
		chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TrxType().sendKeys(testData.get("Trx Type"));
		chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_TrxType_Click().click();  
    }   

    @Then("^Save the FMA record$")
    public void save_the_fma_record() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_SaveButton());
		clickAndActionHelper.moveToElement(chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_SaveButton());
		chargeWaiverObj.chargeWaiver_Accounts_FMA_Instruction_SaveButton().click();
    }
  
       @And("^Validate the charges amount is waived$")
    public void validate_the_charges_amount_is_waived() throws Throwable {
    }
}
