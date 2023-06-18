package stepdefinitions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Runner.NewExcelTestRunner;
import dataProvider.ExcelData;
import helper.ScreenshotHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.messages.Messages.TestCase;
import io.cucumber.messages.Messages.TestCase.TestStep;
import io.cucumber.messages.internal.com.google.protobuf.Field;
import io.cucumber.plugin.event.PickleStepTestStep;
import jiraUtilities.JiraServiceProvider;
import net.rcarz.jiraclient.JiraException;
import resources.BaseClass;
import tests.ExcelTest;
import utilities.ExtentTestManager;

public class HooksClass extends BaseClass {
	WebDriver driver;
	String path = System.getProperty("user.dir") + "\\TestData\\DemoTestData.xlsx";
	ExcelData testExecution = new ExcelData(path, "TestExecution", "Test CaseID");
	Map<String, String> testExecutionData;
	ExcelTest excelTest = new tests.ExcelTest(path, "TestExecution", "Test CaseID");
	List<String> testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
	JiraServiceProvider jiraServiceProvider;
	public static String strScenario = "";
	private int currentStepIndex = 0;
	ScreenshotHelper screenshotHelper = new ScreenshotHelper(driver);
	int testLine;

	@Before
	public void browserSetup(Scenario scenario) throws IOException {
		// get flag status from excel and skip the test cases
		if (testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag()).get("ExecuteYes/No")
				.equalsIgnoreCase("No")) {
			Assume.assumeTrue(false);
		}

		driver = initializeDriver();
		System.out.println("Driver Initiated");
		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Started executing");
		ExtentTestManager.startTest(name);
		testLine=scenario.getLine();
	}

	@BeforeStep
	public void beforeStep(Scenario scenario)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

	}

	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException, JiraException {
		driver = BaseClass.driver;
		System.out.println("Screen shot got added");
		// jiraServiceProvider= new
		// JiraServiceProvider("https://anandhmadhes.atlassian.net/","anandhmadhes002@gmail.com","ZRV1ZOQ2_SfudOjUFMaNaQtJH7aQRrJJJKdMqB088qCoUihquGjZgh7JrKuJ60YarefHPc3zozdKsFxEv6_TJcfuWalgQBcVbKqgAr8kNj6np5bcJ8vuX9dLeRBR6IhYcBUHcQmb7_mdTTgGWlhydRrKDvSTvSybJW","AT");
		java.io.File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		scenario.attach(fileContent, "image/png", "screenshot");
		testLine=testLine+1;
		System.out.println("Test Line "+testLine);

	}

	@SuppressWarnings("unlikely-arg-type")
	@After
	public void TearDown(Scenario scenario) throws IOException, JiraException {
		driver = BaseClass.driver;
		driver.quit();
		System.out.println("Browser closed");
		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Stopped executing");
		io.cucumber.java.Status status = scenario.getStatus();

		String currentExecutionStatus = status.toString();
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
		strScenario = scenario.getStatus().toString();
		jiraServiceProvider = new JiraServiceProvider("https://anandhmadhes.atlassian.net", "anandhmadhes002@gmail.com",
				"ATATT3xFfGF0tlFGIhY7-StqMZdHjaNH5w8UhMceCUjzgFy6cXyP00XSxuZ7AAqWQd4MrbvEqXBMNaiO5_OXXvzwd5XWhYe9gLpxqepX5kzzhK7_OJj2gXcUN3931XGKLRRKtYjto5o8kUvFtMqox4roZMGYxi7LcHeHxTjadUmcbJnUA8GeFKQ=FA27D52D",
				"AT");

		System.out.println("Scenario Name is" + scenario.getName());
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\features\\practiceDemoFEATURE.feature";
		File file = new File(path);
		BufferedReader bufferedReaer=new BufferedReader(new FileReader(file));
		scenario.getLine();
		String featureLine = Files.readAllLines(Paths.get(path)).get(testLine-1);
		System.out.println("Step "+featureLine);
		System.out.println("Scenario Line "+scenario.getLine());
		System.out.println("Scenario ID " + scenario.getId().toString());
		if (currentExecutionStatus.equals("FAILED")) {
			try {
				
				
				bufferedReaer.readLine();
				jiraServiceProvider.createIssue("Bug", "Issue in the following scenario ==> " + scenario.getName(),
						featureLine, "anandhmadhes002@gmail.com");
			} catch (JiraException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (currentExecutionStatus.equalsIgnoreCase("FAILED")) {

			// change flag to "No" for dependent scenarios in excel when main Scenario got
			// failed
			for (int i = 1; i < testCaseTagsFromExcel.size(); i++) {
				testExecutionData = testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag());
				Collection<String> values = testExecutionData.values();
				values.remove(NewExcelTestRunner.getCurrentExecutionTag());
				if (values.contains(testCaseTagsFromExcel.get(i))) {
					System.out.println("Test case failed");
					testExecution.updateTestData(testCaseTagsFromExcel.get(i), "ExecuteYes/No", "No");
				}

			}

		}
	}

}
