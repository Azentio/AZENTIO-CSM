package pageobjects.CSM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports_ListOfAccounts {
	WebDriver driver;

	public Reports_ListOfAccounts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="_selenuimR000")
	private WebElement csm_Reports;
	public WebElement csmUserName() {
		return csm_Reports;
	}
	@FindBy(id="R1012L")
	private WebElement csm_Reports_ListOfAccounts;
	public WebElement csm_Reports_ListOfAccounts() {
		return csm_Reports_ListOfAccounts;
	}
	@FindBy(id="p_param_RA_BRANCH_CODE_NUMBER_R1012L")
	private WebElement ListOfAccounts_BranchCode;
	public WebElement ListOfAccounts_BranchCode() {
		return ListOfAccounts_BranchCode;
	}
	@FindBy(id="p_param_RA_BC_VARCHAR2_R1012L")
	private WebElement ListOfAccounts_BSContra;
	public WebElement ListOfAccounts_BSContra() {
		return ListOfAccounts_BSContra;
	}
	@FindBy(id="p_param_RA_GMI_FLAG_VARCHAR2_R1012L")
	private WebElement ListOfAccounts_GMIFlag;
	public WebElement ListOfAccounts_GMIFlag() {
		return ListOfAccounts_GMIFlag;
	}
	@FindBy(id="p_param_RA_STATUS_VARCHAR2_R1012L")
	private WebElement ListOfAccounts_Status;
	public WebElement ListOfAccounts_Status() {
		return ListOfAccounts_Status;
	}
	@FindBy(id="connection_id_R1012L")
	private WebElement ListOfAccounts_ConnectionDescription;
	public WebElement ListOfAccounts_ConnectionDescription() {
		return ListOfAccounts_ConnectionDescription;
	}
	@FindBy(id="chkId_R1012L")
	private WebElement ListOfAccounts_SaveSnapshot;
	public WebElement ListOfAccounts_SaveSnapshot() {
		return ListOfAccounts_SaveSnapshot;
	}
	@FindBy(id="submit_1322316434")
	private WebElement ListOfAccounts_SortButton;
	public WebElement ListOfAccounts_SortButton() {
		return ListOfAccounts_SortButton;
	}
	@FindBy(id="submit_627016463")
	private WebElement ListOfAccounts_FilterButton;
	public WebElement ListOfAccounts_FilterButton() {
		return ListOfAccounts_FilterButton;
	}
	@FindBy(id="submit_794876390")
	private WebElement ListOfAccounts_GroupButton;
	public WebElement ListOfAccounts_GroupButton() {
		return ListOfAccounts_GroupButton;
	}
	@FindBy(id="retrieveBtn_R1012L")
	private WebElement ListOfAccounts_RetrieveButton;
	public WebElement ListOfAccounts_RetrieveButton() {
		return ListOfAccounts_RetrieveButton;
	}
	@FindBy(id="resetBtn_R1012L")
	private WebElement ListOfAccounts_ResetButton;
	public WebElement ListOfAccounts_ResetButton() {
		return ListOfAccounts_ResetButton;
	}
	@FindBy(id="argFilterBtn_R1012L")
	private WebElement ListOfAccounts_ArgumentsFiltersButton;
	public WebElement ListOfAccounts_ArgumentsFiltersButton() {
		return ListOfAccounts_ArgumentsFiltersButton;
	}
	@FindBy(id="exportBtn_R1012L")
	private WebElement ListOfAccounts_ExportButton;
	public WebElement ListOfAccounts_ExportButton() {
		return ListOfAccounts_ExportButton;
	}
	@FindBy(id="verifyBtn_R1012L")
	private WebElement ListOfAccounts_VerifyButton;
	public WebElement ListOfAccounts_VerifyButton() {
		return ListOfAccounts_VerifyButton;
	}
	
	
	

}
