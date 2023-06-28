Feature: To check the functionality of transaction with mode of payment account
@TSA_014
Scenario: Checking if only the “Approved” population tasks appear at the level of populate screen
Given navigate to CSM param application and login with valid credentials
And Click the Parameters Flag
Then Click the System Parameters Flag
And User click the Update after approve flag
Then User Enter the code in the update after approve flag
And User click the enter code record in the update after approve flag to view the details



