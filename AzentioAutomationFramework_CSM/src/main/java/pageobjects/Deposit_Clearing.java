package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit_Clearing {
	WebDriver driver;
	public Deposit_Clearing(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//td[text()='Reports']")
private WebElement Reports;
public WebElement Reports() {
	return Reports;

}
@FindBy(xpath="//span[text()='Deposit Clearing Status']")
private WebElement Depositclearing;
public WebElement Depositclearing() {
	return Depositclearing;
}
@FindBy(xpath="//input[@name='param~RA_ALLDATES~NUMBER']")
private WebElement AllDates;
public WebElement AllDates() {
	return AllDates;
}
@FindBy(xpath="//input[@id='p_param_RA_FRDATE_DATE_R001']")
private WebElement FromDate;
public WebElement FromDate() {
	return FromDate;
}
@FindBy(xpath="//input[@id='p_param_RA_TODATE_DATE_R001']")
private WebElement ToDate;
public WebElement ToDate() {
	return ToDate;
}
@FindBy(xpath="//input[@id='p_param_RA_STATUS1_NUMBER_R001']")
private WebElement Status1;
public WebElement Status1() {
	return Status1;
}
@FindBy(xpath="//input[@id='p_param_RA_STATUS2_NUMBER_R001']")
private WebElement Status2;
public WebElement Status2() {
	return Status2;
}
@FindBy(xpath="//input[@id='p_param_RA_STATUS3_NUMBER_R001']")
private WebElement Status3;
public WebElement Status3() {
	return Status3;
}
@FindBy(xpath="//input[@id='p_param_RA_BASECY_DEC_NUMBER_R001']")
private WebElement FromAC;
public WebElement FromAC(){
	return FromAC;
	
}
@FindBy(xpath="//input[@id='p_param_RA_RUNNING_DATE_DATE_R001']")
private WebElement RunningDate;
public WebElement RunningDate() {
	return RunningDate;
}
@FindBy(xpath="//select[@id='lang_id_R001']")
private WebElement language;
public WebElement language() {
	return language;
}
@FindBy(xpath="//select[@id='lang_id_R001']")
private WebElement Format;
public WebElement Format() {
	return Format;
}
@FindBy(xpath="//select[@id='connection_id_R001']")
private WebElement Connection;
public WebElement Connection() {
	return Connection;
}
@FindBy(xpath="id=\"chkId_R001\"")
private WebElement Save;
public WebElement Save() {
	return Save;
}

}
