package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_PriorityObj {
	WebDriver driver;

	public CSMParam_PriorityObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'CIF Parameters')]")
	private WebElement parameters_CIFParameterFeature;

	public WebElement parametersCIFParametersFeature() {
		return parameters_CIFParameterFeature;
	}

	@FindBy(xpath = "//td[text()='Priority']")
	private WebElement cifParameter_Priority;

	public WebElement cifParameterPriority() {
		return cifParameter_Priority;
	}

	@FindBy(xpath = "//td[text()='Priority']//ancestor::li//span[text()='Update After Approve']")
	private WebElement priority_UpdateAfterApprove;

	public WebElement priorityUpdateAfterApprove() {
		return priority_UpdateAfterApprove;
	}

	@FindBy(xpath = "//td[text()='Priority']//ancestor::li//span[text()='Approve']")
	private WebElement priority_Approve;

	public WebElement priorityApprove() {
		return priority_Approve;
	}

	@FindBy(xpath = "//td[@tdlabel='Waiver Percentage']")
	private WebElement priority_WaiverPercentageDisable;

	public WebElement priorityWaiverPercentageDisable() {
		return priority_WaiverPercentageDisable;
	}

	@FindBy(xpath = "//td[@tdlabel='Waiver Percentage']//input")
	private WebElement priority_WaiverPercentageInput;

	public WebElement priorityWaiverPercentageInput() {
		return priority_WaiverPercentageInput;
	}

	@FindBy(xpath = "//input[@name='PRIORITY_CODE']")
	private WebElement priority_SearchPriorityCode;

	public WebElement prioritySearchPriorityCode() {
		return priority_SearchPriorityCode;
	}
	@FindBy(xpath="//a[contains(text(),'Parameters / CIF Parameters / Priority / Update After Approve')]//parent::td//following-sibling::td//span")
	private WebElement priority_UpdateAfterApproveScreenCloseButton;

	public WebElement priorityUpdateAfterApproveScreenCloseButton() {
		return priority_UpdateAfterApproveScreenCloseButton;
	}
}
