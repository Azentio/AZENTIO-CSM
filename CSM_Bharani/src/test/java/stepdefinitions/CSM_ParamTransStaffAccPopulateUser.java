package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.TransStaffAccPopulateUser;
import resources.BaseClass;

public class CSM_ParamTransStaffAccPopulateUser {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	TransStaffAccPopulateUser transStaffAccPopulateUSerObj = new TransStaffAccPopulateUser(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	//String TestDataPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	//ExcelData excelData = new ExcelData(TestDataPath, "Accounts Restriction", "Data Set ID");
	//Map<String, String> testData ;
	
	//@And("^Choose the dataset id for TSA_014$")
   // public void choose_the_dataset_id_for_tsa014() throws Throwable {
		//testData=excelData.get("TSA_014_D1");
	//}
	
	@And("^Click the Parameters Flag$")
    public void click_the_parameters_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Parameters_Flag());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Parameters_Flag());
		transStaffAccPopulateUSerObj.Parameters_Flag().click();
	}
	@Then("^Click the System Parameters Flag$")
    public void click_the_system_parameters_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Param_SystemParam());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Param_SystemParam());
		transStaffAccPopulateUSerObj.Param_SystemParam().click();
	}
	@And("^Click the User Flag under System Parameters Flag$")
    public void click_the_user_flag_under_system_parameters_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.SystemParam_User());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.SystemParam_User());
		transStaffAccPopulateUSerObj.SystemParam_User().click();
	}
	@Then("^Click the Populate user Flag under User Flag$")
    public void click_the_populate_user_flag_under_user_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.User_PopulateUser());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.User_PopulateUser());
		transStaffAccPopulateUSerObj.User_PopulateUser().click();
	}
	@And("^Click Maitenance Flag under Populate user Flag$")
    public void click_maitenance_flag_under_populate_user_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.PopulateUser_Maintenance());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.PopulateUser_Maintenance());
		transStaffAccPopulateUSerObj.PopulateUser_Maintenance().click();
	}
	@Then("^Enter the code value under populate user maintenance screen$")
    public void enter_the_code_value_under_populate_user_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Maintenance_CodeBox());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Maintenance_CodeBox());
		transStaffAccPopulateUSerObj.Maintenance_CodeBox().click();
		transStaffAccPopulateUSerObj.Maintenance_CodeBox().sendKeys("899");
		//transStaffAccPopulateUSerObj.Maintenance_CodeBox().sendKeys(testData.get("Code"));
	}
	@And("^Enter the brief description valuse under populate user maintenance screen$")
    public void enter_the_brief_description_valuse_under_populate_user_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Maintenance_BreifDes());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Maintenance_BreifDes());
		transStaffAccPopulateUSerObj.Maintenance_BreifDes().click();
		transStaffAccPopulateUSerObj.Maintenance_BreifDes().sendKeys("899");	
	}
	@Then("^Enter the long description valuse under populate user maintenance screen$")
    public void enter_the_long_description_valuse_under_populate_user_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Maintenance_LongDes());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Maintenance_LongDes());
		transStaffAccPopulateUSerObj.Maintenance_LongDes().click();
		transStaffAccPopulateUSerObj.Maintenance_LongDes().sendKeys("899");	
	}
	@And("^Enter the brief description arabic values under populate user maintenance screen$")
    public void enter_the_brief_description_arabic_values_under_populate_user_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.BreiefDes_Arabic());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.BreiefDes_Arabic());
		transStaffAccPopulateUSerObj.BreiefDes_Arabic().click();
		transStaffAccPopulateUSerObj.BreiefDes_Arabic().sendKeys("899");	
	}
	@Then("^Enter the long description arabic valuse under populate user maintenance screen$")
    public void enter_the_long_description_arabic_valuse_under_populate_user_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.LongDes_Arabic());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.LongDes_Arabic());
		transStaffAccPopulateUSerObj.LongDes_Arabic().click();
		transStaffAccPopulateUSerObj.LongDes_Arabic().sendKeys("899");
	}
	@And("^Enter the user code value under populate user maintenance screen$")
    public void enter_the_user_code_value_under_populate_user_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.User_Code());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.User_Code());
		transStaffAccPopulateUSerObj.User_Code().click();
		transStaffAccPopulateUSerObj.User_Code().sendKeys("7402");	
	}
	@Then("^Click the search icon in user code$")
    public void click_the_search_icon_in_user_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.UserCode_SearchIcon());
		clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.UserCode_SearchIcon());
		transStaffAccPopulateUSerObj.UserCode_SearchIcon().click();
	}
	 @And("^Click the addbutton icon under destination branches$")
	    public void click_the_addbutton_icon_under_destination_branches() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.DestinationBranches_AddIcon());
			clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.DestinationBranches_AddIcon());
			transStaffAccPopulateUSerObj.DestinationBranches_AddIcon().click();
	 }
	 @Then("^Enter the branch code value under destination branches$")
	    public void enter_the_branch_code_value_under_destination_branches() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.AddIcon_BranchCode());
			clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.AddIcon_BranchCode());
				transStaffAccPopulateUSerObj.AddIcon_BranchCode().click();
					transStaffAccPopulateUSerObj.AddIcon_BranchCode().sendKeys("2");		
	 }
	 @And("^Enter the new user template value under destination branches$")
	    public void enter_the_new_user_template_value_under_destination_branches() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.AddIcon_NewUserTemp());
			clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.AddIcon_NewUserTemp());
			transStaffAccPopulateUSerObj.AddIcon_NewUserTemp().click();
			transStaffAccPopulateUSerObj.AddIcon_NewUserTemp().sendKeys("2");
	 }
	 @Then("^Click the save button under destination branches$")
	    public void click_the_save_button_under_destination_branches() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Maintenance_SaveIcon());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Maintenance_SaveIcon());
			transStaffAccPopulateUSerObj.Maintenance_SaveIcon().click();
	 }
	 @And("^Click the Ok popup under maintenance flag$")
	    public void click_the_ok_popup_under_maintenance_flag() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.OkPopup_Maitenance());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.OkPopup_Maitenance());
			transStaffAccPopulateUSerObj.OkPopup_Maitenance().click();
	 }
	 @Then("^Click the Ok popup under the success popup$")
	    public void click_the_ok_popup_under_the_success_popup() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance());
			transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance().click();
	 }
	 @And("^Click the populate flag under Populate user$")
	    public void click_the_populate_flag_under_populate_user() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.PopulateFlag_PopulateUser());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.PopulateFlag_PopulateUser());
			transStaffAccPopulateUSerObj.PopulateFlag_PopulateUser().click();
	 }
	 @Then("^Enter the Population code under populate screen$")
	    public void enter_the_population_code_under_populate_screen() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Populate_FlagCode());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Populate_FlagCode());
			transStaffAccPopulateUSerObj.Populate_FlagCode().click();
			transStaffAccPopulateUSerObj.Populate_FlagCode().sendKeys("899");
			transStaffAccPopulateUSerObj.Populate_FlagCode().sendKeys(Keys.ENTER);
	 }
	 @And("^Click the Approve Flag under Populate user$")
	    public void click_the_approve_flag_under_populate_user() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.PopulateFlag_Approve());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.PopulateFlag_Approve());
			transStaffAccPopulateUSerObj.PopulateFlag_Approve().click();
	 }
	 @Then("^Enter the approve code under approve Flag$")
	    public void enter_the_approve_code_under_approve_flag() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Approve_Code());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Approve_Code());
			transStaffAccPopulateUSerObj.Approve_Code().click();
			transStaffAccPopulateUSerObj.Approve_Code().sendKeys("899");
			transStaffAccPopulateUSerObj.Approve_Code().sendKeys(Keys.ENTER);
	 }
	 @And("^Select the entered value code under approve flag$")
	    public void select_the_entered_value_code_under_approve_flag() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.ApproveCode_Created());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.ApproveCode_Created());
		 clicksAndActionsHelper.doubleClick(transStaffAccPopulateUSerObj.ApproveCode_Created());
	 }
	 @Then("^Approve the selected code$")
	    public void approve_the_selected_code() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.ApproveCode_Approve());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.ApproveCode_Approve());
		 javaScriptHelper.scrollIntoView(transStaffAccPopulateUSerObj.ApproveCode_Approve());
		 transStaffAccPopulateUSerObj.ApproveCode_Approve().click();
	 }
	 @And("^Click Okpopup under Approve Screen$")
	    public void click_okpopup_under_approve_screen() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Approve_OkPopup());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Approve_OkPopup());
		 transStaffAccPopulateUSerObj.Approve_OkPopup().click();
	 }
	 @Then("^Click the success okpopup under approve screen$")
	    public void click_the_success_okpopup_under_approve_screen() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance());
		 transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance().click();
	 }
	 @And("^Again click the populate flag under Populate user$")
	    public void again_click_the_populate_flag_under_populate_user() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.PopulateFlag_PopulateUser());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.PopulateUser_PopulateFlag());
			transStaffAccPopulateUSerObj.PopulateUser_PopulateFlag().click();
	 }
	 @Then("^Again Enter the Population code under populate screen$")
	    public void again_enter_the_population_code_under_populate_screen() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Populate_FlagCode());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Populate_FlagCode());
			transStaffAccPopulateUSerObj.Populate_FlagCode().click();
			transStaffAccPopulateUSerObj.Populate_FlagCode().sendKeys("899");
			transStaffAccPopulateUSerObj.Populate_FlagCode().sendKeys(Keys.ENTER);		 
	 }
	 @And("^Double Click the Entered code under populate screen$")
	    public void double_click_the_entered_code_under_populate_screen() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.Approved_Text());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.Approved_Text());
		 clicksAndActionsHelper.doubleClick(transStaffAccPopulateUSerObj.Approved_Text());
	 }
	 @Then("^Approve the selected code under populate screen$")
	    public void approve_the_selected_code_under_populate_screen() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.ApproveIcon_Populate());
		 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.ApproveIcon_Populate());
		 javaScriptHelper.scrollIntoView(transStaffAccPopulateUSerObj.ApproveIcon_Populate());
		 transStaffAccPopulateUSerObj.ApproveIcon_Populate().click();
	 }
	    @And("^Click okpopup under populate screen$")
	    public void click_okpopup_under_populate_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.OkPopup_Maitenance());
			 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.OkPopup_Maitenance());
			 transStaffAccPopulateUSerObj.OkPopup_Maitenance().click();
	    }
	    @Then("^Click okpop sucess under populate screen$")
	    public void click_okpop_sucess_under_populate_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance());
			 clicksAndActionsHelper.moveToElement(transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance());
			 transStaffAccPopulateUSerObj.OkPopup_SuccessScreenMaintenance().click();	
	    }
		 
	 }
	
	
	
	

