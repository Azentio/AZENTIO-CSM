Feature: Saving the accounts when the range is by CIF and the alert flag is not checked/ From GL to GL

@TA_024
Scenario: To check whether the account is save when CIF and alert flag uncheck and from GL to GL
Given navigate to CSM application and login with valid credentials
Then User_604 date test data for test case number CSM_024
And User_604 Click the transfer accounts flag
Then User_604 Click the Maintenance flag under transfer acccounts flag
And User_604 Click the Transfer type option to select the type
Then User_604 Click the By CIF in ranges definition
And User_604 Enter the CIF code in the CIF box
Then User_604 Enter the Original GL code in the GL box
And User_604 Enter the destination GL in the GL box
Then User_604 Enter the reason code in the reason box
And User_604 Click the retrive button to show the records
Then User_604 Click the save button to save the retirved records
And User_604 Click the Approve Flag
Then User_604 Click the Destination GL Grid to enter the GL
And User_604 Select the First record of the destination GL for reject
Then User_604 Click the reject icon for reject the selected GL

@TA_025
Scenario: To check whether the account is save when CIF and alert flag uncheck and from CIF to CIF
Given navigate to CSM application and login with valid credentials
Then User_604 date test data for test case number CSM_025
And User_604 Click the transfer accounts flag
Then User_604 Click the Maintenance flag under transfer acccounts flag
And User_604 Click the Transfer type option to select the type
Then User_604 Click the By GL in ranges definition
#And User_604 Enter the CIF code in the CIF box
Then User_604 Enter the Original GL code in the GL box
And User_604 Enter the destination GL in the GL box
Then User_604 Enter the reason code in the reason box
And User_604 Click the retrive button to show the records
Then User_604 Click the save button to save the retirved records
And User_604 Click the Approve Flag
Then User_604 Click the Destination GL Grid to enter the GL
And User_604 Select the First record of the destination GL for reject
Then User_604 Click the reject icon for reject the selected GL
