package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.cucumber.java.Scenario;
import jiraUtilities.JiraServiceProvider;
import net.rcarz.jiraclient.JiraException;

public class JiraListener implements ITestListener {
	JiraServiceProvider jiraServiceProvider;
	

	public void onStart(ITestContext context) {

		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}

	// Method called after every execution
	public void onFinish(ITestContext context) {

	}

	// Method called before every steps
	public void onTestStart(ITestResult result) {

	}

	// Method called after steps is it gets passed
	public void onTestSuccess(ITestResult result) {

	}

	// Method called after steps is it gets failed
	public void onTestFailure(ITestResult result) {
		Scenario scenario = null;
		System.out.println("Test got failed in JiraListener");

		jiraServiceProvider = new JiraServiceProvider("https://anandhmadhes.atlassian.net", "anandhmadhes002@gmail.com",
				"ATATT3xFfGF0tlFGIhY7-StqMZdHjaNH5w8UhMceCUjzgFy6cXyP00XSxuZ7AAqWQd4MrbvEqXBMNaiO5_OXXvzwd5XWhYe9gLpxqepX5kzzhK7_OJj2gXcUN3931XGKLRRKtYjto5o8kUvFtMqox4roZMGYxi7LcHeHxTjadUmcbJnUA8GeFKQ=FA27D52D",
				"AT");
		
		System.out.println("Scenario Name is"+scenario.getName());
		
			try {
				jiraServiceProvider.createIssue("Bug", "Issue in the following scenario in TestNG ==> " + scenario.getName(),
						result.getThrowable().toString(), "anandhmadhes002@gmail.com");
			} catch (JiraException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	

}
