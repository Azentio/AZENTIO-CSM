Feature: To check the functionality of transaction with mode of payment account
@TSA_379
Scenario: Checking if only the “Approved” population tasks appear at the level of populate screen
Given navigate to CSM param application and login with valid credentials
Then User update test data for test case number Param_095
And Click the Parameters Flag
Then Click the System Parameters Flag
And User click the Transaction type flag
And User click the Update after approve flag
Then User Enter the code in the update after approve flag
And User click the enter code record in the update after approve flag to view the details
Then User select the transfer type as Local
#And User check the Forbid multiple cif flag
Then User Click the update after approve flag to save the record
Then User_604 Click the Ok Popup to confirm the record
Then Click the Ok popup



