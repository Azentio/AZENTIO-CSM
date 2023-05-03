package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Certificate_product {
    WebDriver driver;
    public Certificate_product(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//td[text()='Certificates']")
    private WebElement certificatebutton;
    public WebElement certificatebutton() {
    	return certificatebutton;
    }
    @FindBy(xpath="//span[text()='Maintenance']")
    private WebElement Maintenancebutton;
    public WebElement Maintenancebutton() {
    	return Maintenancebutton;
    }
    @FindBy(xpath="(//span[@role='button'])[1]")
    private WebElement cerifiticateSearchbutton;
    public WebElement cerifiticateSearchbutton() {
    	return cerifiticateSearchbutton;
    }
    @FindBy(xpath="//input[@id='gridtab_certificate_type_P0049MT_gs_CODE']")
    private WebElement certificatecode;
    public WebElement certificatecode() {
    	return certificatecode;
    }
    @FindBy(xpath="//td[text()='Bill Certificate']")
    private WebElement Billdetails;
    public WebElement Billdetails() {
    	return Billdetails;
    }
    @FindBy(xpath="//input[@id='lookuptxt_CIF_NO_P0049MT']")
    private WebElement CIFNo;
    public WebElement CIFNo() {
    	return CIFNo;
    }
    @FindBy(xpath="//input[@id='number_of_bills_P0049MT']")
    private WebElement Numberofbills;
    public WebElement Numberofbills() {
    	return Numberofbills;
    }
    @FindBy(xpath="//input[@id='total_amt_of_bills_P0049MT']")
    private WebElement Totalamount_bill;
    public WebElement Totalamount_bill() {
    	return Totalamount_bill;
    }
    @FindBy(xpath="//input[@id='3_ctscertificateaccVO.DEDUCT']")
    private WebElement deductcertificate;
    public WebElement deductcertificate() {
    	return deductcertificate;
    }
    @FindBy(xpath="//input[@id='2_ctscertificateaccVO.CREDIT_ACCOUNT_YN']") 
    private WebElement credit_Account;
    public WebElement credit_Account() {
    	return credit_Account;
    }
    @FindBy(xpath="(//input[@id='_popup_path_sol_ok'])[1]")
    private WebElement POPupmsg;
    public WebElement POPupmsg() {
    	return POPupmsg;
    }
    
    
}




