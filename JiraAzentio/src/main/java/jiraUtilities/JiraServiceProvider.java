package jiraUtilities;

import org.apache.poi.util.SystemOutLogger;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.Issue.FluentCreate;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class JiraServiceProvider {

	public JiraClient jira;
	public String projectName;

	public JiraServiceProvider(String jiraURL,String userName,String password,String projectName)
	{
		BasicCredentials credentials=new BasicCredentials(userName,password);
		jira= new JiraClient(jiraURL,credentials);
	   this.projectName=projectName;
		
	}
	public void createIssue(String issueType,String summary, String description,String asignedTo) throws JiraException
	{
	FluentCreate fluentCreate=jira.createIssue(projectName, issueType);
	fluentCreate.field(Field.DESCRIPTION, description);
	fluentCreate.field(Field.SUMMARY, summary);
	fluentCreate.field(Field.ASSIGNEE, asignedTo);
	Issue NewIssue = fluentCreate.execute();
	System.out.print("New Issue "+NewIssue);
	}

}
