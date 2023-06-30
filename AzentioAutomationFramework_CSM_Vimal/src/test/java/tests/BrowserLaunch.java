package tests;

import java.util.Map;

import dataProvider.ExcelData;

public class BrowserLaunch  {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//	ConfigFileReader config = new ConfigFileReader();
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
//	WebDriver driver = new ChromeDriver(options);
//	driver.get(config.getCSMApplicationUrl());
//	driver.manage().window().maximize();
//	Thread.sleep(5000);
//	driver.quit();
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData testexecution = new ExcelData(path, "TestExecution", "TestCaseID");
	Map<String, String> testdata = testexecution.getTestdata("TRS_188");
	System.out.println(testdata.get("DataSet ID"));
}
}
