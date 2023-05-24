package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.NewTempleUser;
import resources.BaseClass;

public class UserTemple_Populate {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	NewTempleUser NewTempleUserobj = new NewTempleUser(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("^User login to CSM Param Application$")
    public void user_login_to_csm_param_application() throws Throwable {
		driver.get(configFileReader.getCSMparamsUrl());
        login.loginIntoCSMParamApplication();
    }

    @Then("^Click confirm ok button$")
    public void click_confirm_ok_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.popup_msg(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.popup_msg());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.popup_msg());
    	NewTempleUserobj.popup_msg().click();
    }

    @Then("^Click the Ok submit button$")
    public void click_the_ok_submit_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.popup_msg(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.popup_msg());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.popup_msg());
    	NewTempleUserobj.popup_msg().click();
    }

    @And("^Click the Parameter button in Template user$")
    public void click_the_parameter_button_in_template_user() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.Parameters12(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.Parameters12());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.Parameters12());
    	NewTempleUserobj.Parameters12().click();
    }

    @And("^Click the System parameter button in Temple user$")
    public void click_the_system_parameter_button_in_temple_user() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.SystemParameters(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.SystemParameters());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.SystemParameters());
    	NewTempleUserobj.SystemParameters().click();
    }

    @And("^Click the Populate Uesr Under New Template User$")
    public void click_the_populate_uesr_under_new_template_user() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.PopulateUser_Temple(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.PopulateUser_Temple());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.PopulateUser_Temple());
    	NewTempleUserobj.PopulateUser_Temple().click();
    }

    @And("^Click the Maintenance Under Populate User Screen$")
    public void click_the_maintenance_under_populate_user_screen() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.Maintenance_TempleUser(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.Maintenance_TempleUser());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.Maintenance_TempleUser());
    	NewTempleUserobj.Maintenance_TempleUser().click();
    }

    @And("^Enter the Teller Population User Code under populate User$")
    public void enter_the_teller_population_user_code_under_populate_user() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.Teller_population(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.Teller_population());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.Teller_population());
    	NewTempleUserobj.Teller_population().click();  
    	NewTempleUserobj.Teller_population().sendKeys(testData.get("Codepopulate")); 
    }

    @And("^Enter the Brife Name for under Populate User Screen$")
    public void enter_the_brife_name_for_under_populate_user_screen() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.Brief_Name(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.Brief_Name());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.Brief_Name());
    	NewTempleUserobj.Teller_population().sendKeys(testData.get("BrifeName")); 
    }

    @And("^Enter the Long Name for Under Populate User$")
    public void enter_the_long_name_for_under_populate_user() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.LongName_template(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.LongName_template());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.LongName_template());
    	NewTempleUserobj.LongName_template().click();
    	NewTempleUserobj.LongName_template().sendKeys(testData.get("LongName"));
    }

    @And("^Enter the BriefNamearab under Populate User$")
    public void enter_the_briefnamearab_under_populate_user() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.BriefNamearab_tem(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.BriefNamearab_tem());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.BriefNamearab_tem());
    	NewTempleUserobj.BriefNamearab_tem().click();
    	NewTempleUserobj.BriefNamearab_tem().sendKeys(testData.get("Namearab"));
    }

    @And("^Enter the LongNamearab for under Populate User$")
    public void enter_the_longnamearab_for_under_populate_user() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.LongNamearab_tem(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.LongNamearab_tem());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.LongNamearab_tem());
    	NewTempleUserobj.LongNamearab_tem().click();
    	NewTempleUserobj.LongNamearab_tem().sendKeys(testData.get("Longarab"));
    }

    @And("^Enter the Value User Teller code$")
    public void enter_the_value_user_teller_code() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.code_template(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.code_template());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.code_template());
    	NewTempleUserobj.code_template().click();
    	NewTempleUserobj.code_template().sendKeys(testData.get("Tellercode"));
    }

    @And("^Click the search in user code$")
    public void click_the_search_in_user_code() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.Searchbutton_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.Searchbutton_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.Searchbutton_Transaction());
    	NewTempleUserobj.Searchbutton_Transaction().click();
    	
    }

    @And("^Click the Add button$")
    public void click_the_add_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.code_template(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.code_template());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.code_template());
    	NewTempleUserobj.code_template().click();
    	
    }

    @And("^Enter the Value Branch Code under$")
    public void enter_the_value_branch_code_under() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.code_template(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.code_template());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.code_template());
    	NewTempleUserobj.code_template().click();
    	NewTempleUserobj.code_template().sendKeys(testData.get("BranchCode"));
    }

    @And("^Click Saerch box$")
    public void click_saerch_box() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.code_template(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.code_template());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.code_template());
    	NewTempleUserobj.code_template().click();
    }

    @And("^Enter the code value in under New user Template$")
    public void enter_the_code_value_in_under_new_user_template() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.code_template(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.code_template());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.code_template());
    	NewTempleUserobj.code_template().click();
    	NewTempleUserobj.code_template().sendKeys(testData.get("Code2"));
    }

    @And("^Click the Save$")
    public void click_the_save() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.Save_Template(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.Save_Template());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.Save_Template());
    	NewTempleUserobj.Save_Template().click();
    }

    @And("^Click the Approve button$")
    public void click_the_approve_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.Approve_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.code_template());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.code_template());
    	NewTempleUserobj.Approve_Transaction().click(); 
    }

    @And("^Click the Search button$")
    public void click_the_search_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.SubmitApprove_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.SubmitApprove_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.SubmitApprove_Transaction());
    	NewTempleUserobj.SubmitApprove_Transaction().click();  
    }

    @And("^Click the Approve submit button$")
    public void click_the_approve_submit_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.SubmitApprove_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.SubmitApprove_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.SubmitApprove_Transaction());
    	NewTempleUserobj.SubmitApprove_Transaction().click(); 
    }
    @And("^Enter the code Value Under Approve populate user$")
    public void enter_the_code_value_under_approve_populate_user() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, NewTempleUserobj.Tellercode_populate(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(NewTempleUserobj.Tellercode_populate());
    	ClicksAndActionsHelperobj.clickOnElement(NewTempleUserobj.Tellercode_populate());
    	NewTempleUserobj.Tellercode_populate().click();     
    	NewTempleUserobj.Tellercode_populate().sendKeys(testData.get("CodeApprove")); 
    }
}
