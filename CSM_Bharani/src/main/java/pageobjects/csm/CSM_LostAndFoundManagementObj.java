package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_LostAndFoundManagementObj {
	WebDriver driver;
	public CSM_LostAndFoundManagementObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[contains(text(),'Lost & Found Management')]")
	private WebElement csm_LostAndFoundManagementModule;
	public WebElement csmLostAndFoundManagementModule()
	{
		return csm_LostAndFoundManagementModule;
	}
	@FindBy(id="N001MT")
	private WebElement lostAndFoundManagement_Maintenance;
	public WebElement lostAndFoundManagementMaintenance()
	{
		return lostAndFoundManagement_Maintenance;
	}
	@FindBy(id="accBr_N001MT")
	private WebElement lostAndFoundManagement_BranchCode;
	public WebElement lostAndFoundManagementBranchCode()
	{
		return lostAndFoundManagement_BranchCode;
	}
	@FindBy(id="accCy_N001MT")
	private WebElement lostAndFoundManagement_CurrencyCode;
	public WebElement lostAndFoundManagementCurrencyCode()
	{
		return lostAndFoundManagement_CurrencyCode;
	}
	@FindBy(id="accGl_N001MT")
	private WebElement lostAndFoundManagement_GlCode;
	public WebElement lostAndFoundManagementGlCode()
	{
		return lostAndFoundManagement_GlCode;
	}
	@FindBy(id="accCif_N001MT")
	private WebElement lostAndFoundManagement_CIFNumber;
	public WebElement lostAndFoundManagementCIFNumber()
	{
		return lostAndFoundManagement_CIFNumber;
	}
	@FindBy(id="lookuptxt_accSl_N001MT")
	private WebElement lostAndFoundManagement_SerialNumber;
	public WebElement lostAndFoundManagementSerialNumber()
	{
		return lostAndFoundManagement_SerialNumber;
	}
	@FindBy(xpath="//a[contains(text(),'Lost & Found Management / Maintenance')]")
	private WebElement lostAndFound_ScreenOpeningValidation;
	public WebElement lostAndFoundManagementScreenOpeningValidation()
	{
		return lostAndFound_ScreenOpeningValidation;
	}
	
	
}
