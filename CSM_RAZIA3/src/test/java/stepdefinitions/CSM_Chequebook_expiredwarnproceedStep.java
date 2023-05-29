package stepdefinitions;

import org.apache.poi.ss.formula.ThreeDEval;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_Chequebook_expiredwarnproceedObj;
import resources.BaseClass;

public class CSM_Chequebook_expiredwarnproceedStep {
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver) ;
	ClicksAndActionsHelper clicksAdActionsHelper =  new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Action = new Selenium_Actions(driver);
	CSM_Chequebook_expiredwarnproceedObj  CSMChequebookexpiredwarnproceedObj  = new CSM_Chequebook_expiredwarnproceedObj(driver);
	CSMLogin login  = new CSMLogin(driver);

    @And("^Click a date avaible in csm application$")
    public void click_a_date_avaible_in_csm_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMdateclick());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMdateclick());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMdateclick());
    }

    @And("^Clear the date and update today date under CSM$")
    public void clear_the_date_and_update_today_date_under_csm() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMdateclearexchangedate());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMdateclearexchangedate());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMdateclearexchangedate());
		CSMChequebookexpiredwarnproceedObj.CSMdateclearexchangedate().click();
		CSMChequebookexpiredwarnproceedObj.CSMdateclearexchangedate().clear();
		CSMChequebookexpiredwarnproceedObj.CSMdateclearexchangedate().sendKeys("17-05-2022");
		//Thread.sleep(2000);
		          
    }
    @And("^Click the use button in date menu under CSM$")
    public void click_the_use_button_in_date_menu_under_csm() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMdatechangeusebtn());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMdatechangeusebtn());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMdatechangeusebtn());
		//CSMChequebookexpiredwarnproceedObj.CSMdatechangeusebtn().click();
		// Thread.sleep(2300);
    }

//    @And("^Click the pop ok button in date menu under CSM$")
//    public void click_the_pop_ok_button_in_date_menu_under_csm() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMdateusebtnpopok());
//		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMdateusebtnpopok());
//		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMdateusebtnpopok()); 
//		 //CSMChequebookexpiredwarnproceedObj.CSMdateusebtnpopok().click();
//    }

    @And("^Click the information pop ok button in date menu under CSM$")
    public void click_the_information_pop_ok_button_in_date_menu_under_csm() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMdatechangeusebtninformok());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMdatechangeusebtninformok());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMdatechangeusebtninformok());
		Thread.sleep(20000);
    }

    @And("^Close the date menu under CSM$")
    public void close_the_date_menu_under_csm() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMdateMenuclose());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMdateMenuclose());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMdateMenuclose());
		//CSMChequebookexpiredwarnproceedObj.CSMdateMenuclose().click();
		
    }

    @And("^Click the chequebookRequest flag under CSM$")
    public void click_the_chequebookrequest_flag_under_csm() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMchequebookrequestflag());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMchequebookrequestflag());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMchequebookrequestflag());
		//CSMChequebookexpiredwarnproceedObj.CSMchequebookrequestflag().click();
		Thread.sleep(20000);
    }
   

    @And("^click the maintenance  screen under the chequebookRequest$")
    public void click_the_maintenance_screen_under_the_chequebookrequest() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMchequebookrequestflagmaintenance());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMchequebookrequestflagmaintenance());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMchequebookrequestflagmaintenance());
		 //CSMChequebookexpiredwarnproceedObj.CSMchequebookrequestflagmaintenance().click();
           
    }

    @And("^Enter the values  in noOf ChequeBooks under Maintenance screen$")
    public void enter_the_values_in_noof_chequebooks_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMnoOfChequeBooks());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMnoOfChequeBooks());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMnoOfChequeBooks());
		 //CSMChequebookexpiredwarnproceedObj.CSMnoOfChequeBooks().click();
		 CSMChequebookexpiredwarnproceedObj.CSMnoOfChequeBooks().sendKeys("2");
      
    }

    @And("^Enter the values in Chequecode  under Maintenance$")
    public void enter_the_values_in_chequecode_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMChequecode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMChequecode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMChequecode());
		// CSMChequebookexpiredwarnproceedObj.CSMChequecode().click();
		 CSMChequebookexpiredwarnproceedObj.CSMChequecode().sendKeys("745");     
    }

    @And("^Random click for leavesclick under Maintenance$")
    public void random_click_for_leavesclick_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMleavesclick());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMleavesclick());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMleavesclick());
		// CSMChequebookexpiredwarnproceedObj.CSMleavesclick().click();
		   
    }

    @And("^Enter the values in branchcode under Maintenance$")
    public void enter_the_values_in_branchcode_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMbranchcode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMbranchcode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMbranchcode());
		 CSMChequebookexpiredwarnproceedObj.CSMbranchcode().click();
		 CSMChequebookexpiredwarnproceedObj.CSMbranchcode().sendKeys("01");   
    }

    @And("^Enter the values in Curencycode under Maintenance$")
    public void enter_the_values_in_curencycode_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMCurencycode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMCurencycode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMCurencycode());
		 CSMChequebookexpiredwarnproceedObj.CSMCurencycode().click();
		 CSMChequebookexpiredwarnproceedObj.CSMCurencycode().sendKeys("840");   
    }

    @And("^Enter the values in Gl under Maintenance$")
    public void enter_the_values_in_gl_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMGl());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMGl());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMGl());
		 CSMChequebookexpiredwarnproceedObj.CSMGl().click();
		 CSMChequebookexpiredwarnproceedObj.CSMGl().sendKeys("96123");   
       
    }

    @And("^Enter the values in Cif under Maintenance$")
    public void enter_the_values_in_cif_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMCif());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMCif());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMCif());
		 CSMChequebookexpiredwarnproceedObj.CSMCif().click();
		 CSMChequebookexpiredwarnproceedObj.CSMCif().sendKeys("993492");   
    }

    @And("^Enter the values in serialno under Maintenance$")
    public void enter_the_values_in_serialno_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMserialno());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMserialno());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMserialno());
		 CSMChequebookexpiredwarnproceedObj.CSMserialno().click();
		 CSMChequebookexpiredwarnproceedObj.CSMserialno().sendKeys("00");  
       
    }

    @And("^Click the Charges under Maintenance$")
    public void click_the_charges_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMCharges());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMCharges());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMCharges());
		 CSMChequebookexpiredwarnproceedObj.CSMCharges().click();
    }

    @Then("^Click the save button  under Maintenance$")
    public void click_the_save_button_under_maintenance() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSM_Savebtn());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSM_Savebtn());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSM_Savebtn());
		 CSMChequebookexpiredwarnproceedObj.CSM_Savebtn().click();      
    }
    
    @And("^Click the warningmsg ok button$")
    public void click_the_warningmsg_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMwarningmsg());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMwarningmsg());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMwarningmsg());
		 CSMChequebookexpiredwarnproceedObj.CSMwarningmsg().click();  
   }  

   @And("^Click the Alert ok button$")
    public void click_the_alert_ok_button() throws Throwable {
	   waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMAlertokbtn());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMAlertokbtn());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMAlertokbtn());
		 CSMChequebookexpiredwarnproceedObj.CSMAlertokbtn().click();  
    }

    @And("^Click the approveflag under chequebookRequest$")
    public void click_the_approveflag_under_chequebookrequest() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMapproveflag());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMapproveflag());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMapproveflag());
		 CSMChequebookexpiredwarnproceedObj.CSMapproveflag().click();  
	  }

    @And("^Enter the chequecode under approveflag$")
    public void enter_the_chequecode_under_approveflag() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecode());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecode());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecode());
		 CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecode().click();  
		 CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecode().sendKeys("745",Keys.ENTER);
		 
            }

    @And("^user select the Existing record and double the data under approve flag$")
    public void user_select_the_existing_record_and_double_the_data_under_approve_flag() throws Throwable {
    	
    }
    
    @Then("^click the  approve button under approve flags$")
    public void click_the_approve_button_under_approve_flags() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecodeApprovebtn());
		 clicksAdActionsHelper.moveToElement(CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecodeApprovebtn());
		 clicksAdActionsHelper.clickOnElement(CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecodeApprovebtn());
		 CSMChequebookexpiredwarnproceedObj.CSMapproveflagchequecodeApprovebtn().click();  
       
    }

}
