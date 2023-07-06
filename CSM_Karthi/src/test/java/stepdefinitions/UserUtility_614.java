package stepdefinitions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Selenium_Actions;

public class UserUtility_614 {
     
	public HashMap<String, HashMap<String, String>> map = new HashMap<>();

	public void enterDataAndTab(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement,
			String value) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
		seleniumActions.getClickAndActionsHelper().clickOnElement(webElement);
		webElement.clear();
		webElement.sendKeys(value, Keys.TAB);
	}

	public void enterDataAndEnter(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement,
			String value) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
		seleniumActions.getClickAndActionsHelper().clickOnElement(webElement);
		webElement.clear();
		webElement.sendKeys(value, Keys.ENTER);
	}
	
	public String getText(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
		return webElement.getText();
	}
	
	public boolean getTextAndValidationByAnotherText(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement, String value) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
		String currentValue =  webElement.getText();
		
		if (currentValue.equals(value)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean getTextAndValidationByAnotherWebElementText(Selenium_Actions seleniumActions, WebDriver driver, WebElement CurrentwebElement, WebElement ComparewebElement) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ComparewebElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(ComparewebElement);
		String value =  ComparewebElement.getText();
		
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ComparewebElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(ComparewebElement);
		String currentValue =  ComparewebElement.getText();
		
		if (currentValue.equals(value)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	

	public void enterAccountDetailsForFirstAccountInTransaction() {

	}
	
	/***
	 * 
	 * @return - The current date of the system running date.
	 */

	public String currentDate() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate currentDate = LocalDate.now();
		String date = dtf.format(currentDate);
		return date;
	}
	
	/***
	 * 
	 * @return - The previous date of the system current running date.
	 */

	public String previousDate() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate currentDate = LocalDate.now();
		LocalDate yesterdayDate = currentDate.minusDays(1);
		String date = dtf.format(yesterdayDate);
		return date;
	}

	public void clickOnElement(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
		seleniumActions.getClickAndActionsHelper().clickOnElement(webElement);
	}

	public void clickOnElement1(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
		webElement.click();
	}
	
	/***
	 * 
	 * @param seleniumActions
	 * @param driver
	 * @param webElement
	 * 
	 * @author Double clicks on the element
	 */

	public void doubleClickOnElement(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
		seleniumActions.getClickAndActionsHelper().doubleClick(webElement);
	}
	
	public int getNumberOfElements(Selenium_Actions seleniumActions, WebDriver driver, String Xpathlocator) {
		
		List<WebElement> findElements = null;
		int size = 0;
		
		try {
			Thread.sleep(10000);
			findElements = driver.findElements(By.xpath(Xpathlocator));
			size = findElements.size();
			System.out.println(size);
		}
		catch (Exception e) {
			e.printStackTrace();
			size = 1;
		}
		System.out.println(size);
		return size;
	}
	
	public void checkAndDeleteRecord(Selenium_Actions seleniumActions, WebDriver driver, int offset, String Xpathlocator, WebElement deleteButton, WebElement okButton) {
		try {
			for (int i = offset; i < getNumberOfElements(seleniumActions, driver, Xpathlocator)+1; i++) {
				driver.findElement(By.xpath(Xpathlocator + "[2]")).click();
				deleteButton.click();
				clickOnElement(seleniumActions, driver, okButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * @see The constructor will load the excel data into a hashMap for the given URL path of the excel file
	 */

//	public UserUtility_614() {
//
//		String path = System.getProperty("user.dir") + "/TestData/CSMTestData.xlsx";
//
//		File file = null;
//		
//		try
//		{
//			file = new File(path);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//
//		XSSFWorkbook dataBook = null;
//		try {
//			dataBook = new XSSFWorkbook(file);
//		} 
//		catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		XSSFSheet dataSheet = dataBook.getSheet("Transaction_614");
//
//		int noOfRows = dataSheet.getPhysicalNumberOfRows();
//		int noOfCols = dataSheet.getRow(0).getLastCellNum();
//		for(int i = 1;i<noOfRows;i++){
//
//			Row row = dataSheet.getRow(i);
//			
//			Cell titleCell = row.getCell(0);
//			DataFormatter formatter = new DataFormatter();
//			String titleHeader = formatter.formatCellValue(titleCell);
//			HashMap<String, String> map1 = new HashMap<>();
//
//			for (int j = 1; j < noOfCols; j++) {
//
//				Row headerRow = dataSheet.getRow(0);
//				Cell headerCell = headerRow.getCell(j);
//				String headerValue = formatter.formatCellValue(headerCell);
//
//				Cell cell = row.getCell(j);
//				String value = formatter.formatCellValue(cell);
//
//				map1.put(headerValue, value);
//			}
//
//			map.put(titleHeader, map1);
//			
////			System.out.println(map);
//			
//			try {
//				try {
//					dataBook.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
//	
//	/***
//	 * 
//	 * @param testCaseID
//	 * @param requiredColumnName
//	 * @return The String value of the required parameter
//	 */
	
	public String getExcelData(String testCaseID, String requiredColumnName) {
		
		String value = map.get(testCaseID).get(requiredColumnName);
		System.out.println(value);
		return value;
		
	}
	
	public boolean elementIsEnabled(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
		boolean enabled = webElement.isEnabled();
		return enabled;
	}
	
	public void scrollUp(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	}
	
	public void scrollDownByPixel(WebDriver driver, String pixel1, String pixel2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+pixel1+","+pixel2+")");
	}
	
	public void scrollDownTillElement(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);
	}
	
	public void scrollDownTillEnd(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void scrollHorizontally(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);
	}

}
