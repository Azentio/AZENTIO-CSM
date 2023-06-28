Feature: Checking Cash Withdrawal Transaction Amount Lower than Limit

@TRS_097
Scenario: To check whether transfer is possible with particular amount lower than limit
Given navigate to CSM param application and login with valid credentials
And User update test data for test case number Param_097
And Click the Parameters Flag
Then Click the System Parameters Flag
And User_604 Click the User Flag
Then User_604 Click the update after approve option
And User_604 Click the User ID grid in Update after approve
Then User_604 Select the searched user id 
And User_604 Click the CIF type flag
Then User_604 Select the code type
And User_604 Click the checkbox icon
Then User_604 Click the Ok button
And User_604 Click the Update after approve button to save the record
Then User_604 Click the Ok Popup to confirm the record
Then User_604 Click the Ok button finally
And User_604 Click the approve flag
Then User_604 Click the User ID grid approve
Then User_604 Select the searched user id
And User_604 Click the Approve button to save the record
Then User_604 Click the Ok Popup to confirm the record
Then User_604 Click the Ok button

