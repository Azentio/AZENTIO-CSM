package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_ProcessingClientsStatementObj {
	WebDriver driver;
	public CSM_ProcessingClientsStatementObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Processing Clients Statements']")
	private WebElement reports_ProcessingClientsStatement;
	public WebElement reportProcessingClientsStatement()
	{
		return reports_ProcessingClientsStatement;
	}
	@FindBy(xpath="//td[text()='Reports']")
	private WebElement csm_Reports;
	public WebElement csmReports()
	{
		return csm_Reports;
	}
	@FindBy(xpath="//span[text()='Trade Date']")
	private WebElement processingClientsStatement_TradeDate;
	public WebElement processingClientsStatementTradeDate()
	{
		return processingClientsStatement_TradeDate;
	}
	@FindBy(xpath="//select[@name='reportsCO.stmtPeriodicity']")
	private WebElement tradeDate_FormSelect;
	public WebElement tradeDateFormSelect()
	{
		return tradeDate_FormSelect;
	}
	@FindBy(xpath="//input[@name='reportsCO.from_date']")
	private WebElement processingClientStatement_FromDate;
	public WebElement processingClientStatementFromDate()
	{
		return processingClientStatement_FromDate;
	}
	@FindBy(xpath="//input[@name='reportsCO.to_date']")
	private WebElement processingClientStatement_ToDate;
	public WebElement processingClientStatementToDate()
	{
		return processingClientStatement_ToDate;
	}
	@FindBy(xpath="//input[@id='glCodeRangeBetween_R00812']")
	private WebElement processingClientStatement_RangeOfGlCodes;
	public WebElement processingClientStatementRangeOfGlCodes()
	{
		return processingClientStatement_RangeOfGlCodes;
	}
	@FindBy(xpath="//label[contains(text(),'Range of CIF ')]//parent::td//preceding-sibling::td//input[@name='reportsCO.cifCodeRange']")
	private WebElement processingClientStatement_RangeOfCIF;
	public WebElement processingClientStatementRangeOfCIF()
	{
		return processingClientStatement_RangeOfCIF;
	}
	@FindBy(xpath="//input[@name='reportsCO.amfVOFrom.GL_CODE']")
	private WebElement processinngClinetStatement_FromGl;
	public WebElement processinngClientStatementFromGL()
	{
		return processinngClinetStatement_FromGl;
	}
	@FindBy(xpath="//input[@name='reportsCO.amfVOTo.GL_CODE']")
	private WebElement processinngClinetStatement_ToGl;
	public WebElement processinngClinetStatementToGl()
	{
		return processinngClinetStatement_ToGl;
	}
	@FindBy(xpath="//input[@name='reportsCO.amfVOFrom.CIF_SUB_NO']")
	private WebElement processingClientStatement_FromCIFNumber;
	public WebElement processingClientStatementfromCIFNumber()
	{
		return processingClientStatement_FromCIFNumber;
	}
	@FindBy(xpath="//input[@name='reportsCO.amfVOTo.CIF_SUB_NO']")
	private WebElement processingClientStatement_ToCIFNumber;
	public WebElement processingClientStatementToCIFNumber()
	{
		return processingClientStatement_ToCIFNumber;
	}
	@FindBy(xpath="//button[@value='Submit']")
	private WebElement processingClientStatement_OpenButton;
	public WebElement processingClientStatementOpenButton()
	{
		return processingClientStatement_OpenButton;
	}
	
}
