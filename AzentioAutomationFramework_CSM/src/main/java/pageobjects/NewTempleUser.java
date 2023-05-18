package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTempleUser{
	 WebDriver diver;
	    public NewTempleUser(WebDriver driver) {
	    	this.diver=driver;
	    	PageFactory.initElements(driver, this);
	    	
	    }
		 @FindBy(xpath="//td[text()='Parameters']")
		  private WebElement Parameters12;
		  public WebElement Parameters12() {
			   return Parameters12;
		  }
		  @FindBy(xpath="//td[text()='System Parameters']")
		  private WebElement SystemParameters;
		  public WebElement SystemParameters() {
			   return SystemParameters;
			   
		}
		@FindBy(xpath="//td[text()='User']") 
		private WebElement User_Transaction1;
		public WebElement User_Transaction1() {
			return User_Transaction1;
		}
		@FindBy(xpath="//td[text()='Populate User']")
		private WebElement PopulateUser_Temple;
		public WebElement PopulateUser_Temple() {
			return PopulateUser_Temple;
		}
		@FindBy(xpath="(//span[text()='Maintenance'])[2]")
	    private WebElement Maintenance_TempleUser;
		 public WebElement Maintenance_TempleUser() {
			 return Maintenance_TempleUser;
		 }
	    @FindBy(xpath="//input[@id='teller_population_code_E000POMT']")
	    private WebElement Teller_population;
	    public WebElement Teller_population() {
	    	return Teller_population;
	    }
	    @FindBy(xpath="//input[@id='brief_name_eng_E000POMT']")
	    private WebElement Brief_Name;
	    public WebElement Brief_Name() {
	    	return Brief_Name;
	    }
	   @FindBy(xpath="//input[@id='long_name_eng_E000POMT']")
	   private WebElement LongName_template;
	   public WebElement LongName_template() {
		   return LongName_template;
	   }
	   @FindBy(xpath="//input[@id='brief_name_arab_E000POMT']")
	   private WebElement BriefNamearab_tem;
	   public WebElement BriefNamearab_tem() {
		   return BriefNamearab_tem;
	   }
	   @FindBy(xpath="//input[@id='long_name_arab_E000POMT']")
	   private WebElement LongNamearab_tem;
	   public WebElement  LongNamearab_tem() {
		   return LongNamearab_tem;
	   }
	   @FindBy(xpath="//input[@id='lookuptxt_teller_code_E000POMT']")
	   private WebElement Usercode_teller;
	   public WebElement Usercode_teller() {
		   return Usercode_teller;
	   }
	   @FindBy(xpath="//td[@title='Add new row']")
	   private WebElement Addnew_templete;
	   public WebElement Addnew_templete() {
		   return Addnew_templete;
	   }
	   @FindBy(xpath="(//span[@role='button'])[2]")
	   private WebElement RoleButton_Tem;
	   public WebElement RoleButton_Tem() {
		   return RoleButton_Tem;
	   }
	   @FindBy(xpath="(//span[@role='button'])[3]")
	   private WebElement RoleButton3_tem;
	   public WebElement RoleButton3_tem() {
		   return RoleButton3_tem;
		   
	   }
	   @FindBy(xpath="(//input[@name='CODE'])[2]")
	   private WebElement code_template;
	   public WebElement code_template() {
		   return code_template;
	   }
	   @FindBy(xpath="//label[text()='Save ']")
	   private WebElement Save_Template;
	   public WebElement Save_Template() {
		   return Save_Template;
		}
	   @FindBy(xpath="(//span[text()='Approve'])[2]")
	   private WebElement Approve_Transaction;
	   public WebElement Approve_Transaction() {
		   return Approve_Transaction;
	   }
	   @FindBy(xpath="//label[text()='Approve ']")
	   private WebElement SubmitApprove_Transaction;
	   public WebElement SubmitApprove_Transaction() {
		   return SubmitApprove_Transaction;
	   }
	   @FindBy(xpath="//td[text()='User']") 
		private WebElement User_Transaction;
		public WebElement User_Transaction() {
			return User_Transaction;
		}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement popup_msg;
		public WebElement popup_msg() {
			return popup_msg;
		}
		@FindBy(xpath="//a[@id='infoBarSearchButton_E000MT']")
		private WebElement Searchbutton_Transaction;
		public WebElement Searchbutton_Transaction() {
			return Searchbutton_Transaction;
		}
     @FindBy(xpath="(//input[@name='TELLER_POPULATION_CODE'])[1]")
     private WebElement Tellercode_populate;
     public WebElement Tellercode_populate() {
    	 return Tellercode_populate;
     }
	}



